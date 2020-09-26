package com.epolsoft.rest_app.client;

import com.epolsoft.rest_app.controller.SvConfController;
import com.epolsoft.sv_conf.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.util.List;

@Component
public class Client extends WebServiceGatewaySupport {

    private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

    private static final String URI = "http://localhost:8088/ws/sv_conf";



    public List<SvConf> findAll() {
        LOGGER.debug("Method findAll");
        GetAllSvConfRequest request = new GetAllSvConfRequest();

        GetAllSvConfResponse response = (GetAllSvConfResponse)getWebServiceTemplate().marshalSendAndReceive(URI, request);

        return response.getSvConfs();
    }


    public SvConf findByName(String name) {
        LOGGER.debug("Method findByName");

        GetSvConfByNameRequest request = new GetSvConfByNameRequest();
        request.setName(name);

        GetSvConfByNameResponse response = (GetSvConfByNameResponse)getWebServiceTemplate().marshalSendAndReceive(URI, request);

        return response.getSvConf();
    }

    public void addSvConf(SvConf svConf) {
        LOGGER.debug("Method addSvConf");
        AddSvConfRequest request = new AddSvConfRequest();

        request.setSvConf(svConf);

        getWebServiceTemplate().marshalSendAndReceive(URI, request);
    }

    public void updateSvConf(SvConf svConf) {
        LOGGER.debug("Method updateSvConf");
        UpdateSvConfRequest request = new UpdateSvConfRequest();
        request.setSvConf(svConf);

        getWebServiceTemplate().marshalSendAndReceive(URI, request);
    }


    public void deleteSvConf(String name) {
        LOGGER.debug("Method deleteSvConf");
        DeleteSvConfRequest request = new DeleteSvConfRequest();
        request.setName(name);

        getWebServiceTemplate().marshalSendAndReceive(URI, request);
    }
}
