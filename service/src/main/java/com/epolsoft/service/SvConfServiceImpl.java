package com.epolsoft.service;

import com.epolsoft.dao.SvConfRepo;
import com.epolsoft.sv_conf.SvConf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SvConfServiceImpl implements SvConfService{

    private static final Logger LOGGER = LoggerFactory.getLogger(SvConfServiceImpl.class);

    private final SvConfRepo svConfRepo;


    @Autowired
    public SvConfServiceImpl(SvConfRepo svConfRepo) {
        this.svConfRepo = svConfRepo;
    }


    public List<SvConf> findAll() {
        LOGGER.debug("Method findAll is executing");

        List<SvConf> svConfs = svConfRepo.findAll();

        LOGGER.debug("Method findAll was executed with result = {}", svConfs);

        return svConfs;
    }


    public SvConf findByName(String name) {
        LOGGER.debug("Method findByName is executing with param: (name = {})", name);

        SvConf svConf = svConfRepo.findByName(name);

        LOGGER.debug("Method findByName was executed with result: (object = {})", svConf);

        return svConf;
    }


    public void add(SvConf svConf) {
        LOGGER.debug("Method add is executing with param: (object = {})", svConf);

        svConfRepo.add(svConf);

        LOGGER.debug("Method add was executed");
    }


    public void update(SvConf svConf) {
        LOGGER.debug("Method update is executing with param: (object = {})", svConf);

        svConfRepo.update(svConf);

        LOGGER.debug("Method update was executed");
    }


    public void delete(String name) {
        LOGGER.debug("Method delete is executing with param: (name = {})", name);

        svConfRepo.delete(name);

        LOGGER.debug("Method add was executed");
    }
}
