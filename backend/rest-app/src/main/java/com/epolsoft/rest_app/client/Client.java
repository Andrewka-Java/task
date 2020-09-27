package com.epolsoft.rest_app.client;

import com.epolsoft.sv_conf.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.util.List;

@Component
public class Client extends WebServiceGatewaySupport {

    private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

    private static final String URI = "http://localhost:8088/ws/sv_conf";



    public List<SvConf> findAll() {
        LOGGER.debug("Method findAll is executing");
        GetAllSvConfRequest request = new GetAllSvConfRequest();

        GetAllSvConfResponse response =
                (GetAllSvConfResponse)getWebServiceTemplate().marshalSendAndReceive(URI, request);

        List<SvConf> svConfs = response.getSvConfs();
        LOGGER.debug("Method findAll was executed with (result: {})", svConfs);

        return svConfs;
    }


    public SvConf findByName(String name) {
        LOGGER.debug("Method findByName is executing with (param: {})", name);
        GetSvConfByNameRequest request = new GetSvConfByNameRequest();
        request.setName(name);

        GetSvConfByNameResponse response =
                (GetSvConfByNameResponse)getWebServiceTemplate().marshalSendAndReceive(URI, request);

        SvConf svConf = response.getSvConf();
        LOGGER.debug("Method findByName was executed with (result: {})", svConf);

        return svConf;
    }

    public void addSvConf(SvConf svConf) {
        LOGGER.debug("Method addSvConf is executing with (param: {})", svConf);
        AddSvConfRequest request = new AddSvConfRequest();
        request.setSvConf(svConf);

        getWebServiceTemplate().marshalSendAndReceive(URI, request);
        LOGGER.debug("Method addSvConf was executed");
    }

    public void updateSvConf(SvConf svConf) {
        LOGGER.debug("Method updateSvConf is executing with (param: {})", svConf);
        UpdateSvConfRequest request = new UpdateSvConfRequest();
        request.setSvConf(svConf);

        getWebServiceTemplate().marshalSendAndReceive(URI, request);
        LOGGER.debug("Method updateSvConf was executed");
    }


    public void deleteSvConf(String name) {
        LOGGER.debug("Method deleteSvConf is executing with (param: {})", name);
        DeleteSvConfRequest request = new DeleteSvConfRequest();
        request.setName(name);

        getWebServiceTemplate().marshalSendAndReceive(URI, request);
        LOGGER.debug("Method deleteSvConf was executed");
    }
}
