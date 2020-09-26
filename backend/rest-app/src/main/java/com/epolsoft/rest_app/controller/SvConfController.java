package com.epolsoft.rest_app.controller;

import com.epolsoft.rest_app.client.Client;
import com.epolsoft.sv_conf.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import java.util.List;


@RestController
@RequestMapping("/api")
public class SvConfController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SvConfController.class);

    private static final String URI = "http://localhost:8088/ws/sv_conf";


    private final Client client;

    @Autowired
    public SvConfController(Client client) {
        this.client = client;
    }


    @GetMapping("/sv_confs")
    public List<SvConf> findAll() {
        LOGGER.debug("Method findAll");
        return client.findAll();
    }

    @GetMapping("/sv_confs/{name}")
    public SvConf findByName(@PathVariable("name") String name) {
        LOGGER.debug("Method findByName");
        return client.findByName(name);
    }

    @PostMapping("/sv_confs")
    public void addSvConf(@RequestBody SvConf svConf) {
        LOGGER.debug("Method addSvConf");
        client.addSvConf(svConf);
    }

    @PutMapping("/sv_confs")
    public void updateSvConf(@RequestBody SvConf svConf) {
        LOGGER.debug("Method updateSvConf");
        client.updateSvConf(svConf);
    }


    @DeleteMapping("/sv_confs/{name}")
    public void deleteSvConf(@PathVariable String name) {
        LOGGER.debug("Method deleteSvConf");
        client.deleteSvConf(name);

    }


}
