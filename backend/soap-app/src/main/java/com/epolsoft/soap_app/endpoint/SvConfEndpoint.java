package com.epolsoft.soap_app.endpoint;


import com.epolsoft.service.SvConfService;
import com.epolsoft.sv_conf.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;


@Endpoint
//@CrossOrigin(origins = "*")
public class SvConfEndpoint {

    private static final Logger LOGGER = LoggerFactory.getLogger(SvConfEndpoint.class);

    private static final String URI = "http://epolsoft.com/sv_conf";

    private final SvConfService svConfService;


    @Autowired
    public SvConfEndpoint(SvConfService svConfService) {
        this.svConfService = svConfService;
    }


    @PayloadRoot(namespace = URI, localPart = "getAllSvConfRequest")
    @ResponsePayload
    public GetAllSvConfResponse getAllSvConf(@RequestPayload GetAllSvConfRequest request) {
        LOGGER.debug("Method getAllSvConf is starting with param (request = {})", "");
        GetAllSvConfResponse response = new GetAllSvConfResponse();

        List<SvConf> svConfs = svConfService.findAll();

        response.getSvConfs().addAll(svConfs);

        LOGGER.debug("Method getAllSvConf was executed with (objects = {})", response.getSvConfs());

        return response;
    }


    @PayloadRoot(namespace = URI, localPart ="getSvConfByNameRequest" )
    @ResponsePayload
    public GetSvConfByNameResponse getSvConfByName(@RequestPayload GetSvConfByNameRequest request) {
        LOGGER.debug("Method getSvConfByName is starting with param (name = {})", request.getName());
        GetSvConfByNameResponse response = new GetSvConfByNameResponse();

        SvConf svConf = svConfService.findByName(request.getName());

        response.setSvConf(svConf);

        LOGGER.debug("Method getSvConfByName was executed with (object = {})", response.getSvConf());

        return response;
    }


    @PayloadRoot(namespace = URI, localPart = "addSvConfRequest")
    public void addSvConf(@RequestPayload AddSvConfRequest request) {
        LOGGER.debug("Method addSvConf is starting with param (object = {})", request.getSvConf().toString());

        svConfService.add(request.getSvConf());

        LOGGER.debug("Method addSvConf was executed");
    }


    @PayloadRoot(namespace = URI, localPart = "updateSvConfRequest")
    public void updateSvConf(@RequestPayload UpdateSvConfRequest request) {
        LOGGER.debug("Method updateSvConf is starting with param (object = {})", request.getSvConf());

        svConfService.update(request.getSvConf());

        LOGGER.debug("Method updateSvConf was executed");
    }


    @PayloadRoot(namespace = URI, localPart = "deleteSvConfRequest")
    public void deleteSvConf(@RequestPayload DeleteSvConfRequest request) {
        LOGGER.debug("Method updateSvConf is starting with param (name = {})", request.getName());

        svConfService.delete(request.getName());

        LOGGER.debug("Method updateSvConf was executed");
    }

}
