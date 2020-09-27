package com.epolsoft.rest_app.controller;

import com.epolsoft.rest_app.client.Client;
import com.epolsoft.sv_conf.SvConf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
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
        LOGGER.debug("Method findAll is executing");
        List<SvConf> svConfs = client.findAll();

        LOGGER.debug("Method findAll was executed with (result: {})", svConfs);
        return svConfs;
    }

    @GetMapping("/sv_confs/{name}")
    public SvConf findByName(@PathVariable("name") String name) {
        LOGGER.debug("Method findByName is executing with (param: {})", name);
        SvConf svConf = client.findByName(name);

        LOGGER.debug("Method findByName is executing with (result: {})", svConf);
        return svConf;
    }

    @PostMapping("/sv_confs")
    public void addSvConf(@RequestBody SvConf svConf) {
        LOGGER.debug("Method addSvConf is executing with (param: {})", svConf);
        client.addSvConf(svConf);
        LOGGER.debug("Method addSvConf was executed");

    }

    @PutMapping("/sv_confs")
    public void updateSvConf(@RequestBody SvConf svConf) {
        LOGGER.debug("Method updateSvConf is executing with (param: {})", svConf);
        client.updateSvConf(svConf);
        LOGGER.debug("Method updateSvConf was executed");
    }


    @DeleteMapping("/sv_confs/{name}")
    public void deleteSvConf(@PathVariable String name) {
        LOGGER.debug("Method deleteSvConf is executing with (param: {})", name);
        client.deleteSvConf(name);
        LOGGER.debug("Method deleteSvConf was executed");

    }


}
