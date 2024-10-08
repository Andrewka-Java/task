package com.epolsoft.service;


import com.epolsoft.dao.SvConfDao;
import com.epolsoft.sv_conf.SvConf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class SvConfServiceImpl implements SvConfService{

    private static final Logger LOGGER = LoggerFactory.getLogger(SvConfServiceImpl.class);

    private final SvConfDao svConfDao;

    @Autowired
    public SvConfServiceImpl(SvConfDao svConfDao) {
        this.svConfDao = svConfDao;
    }


    public List<SvConf> findAll() {
        LOGGER.debug("Method findAll is executing");
        List<SvConf> svConfs = svConfDao.findAll();

        LOGGER.debug("Method findAll was executed with (result = {})", svConfs);
        return svConfs;
    }


    public SvConf findByName(String name) {
        LOGGER.debug("Method findByName is executing with (param: {})", name);
        SvConf svConf = svConfDao.findByName(name);

        LOGGER.debug("Method findByName was executed with (result: {})", svConf);
        return svConf;
    }


    public void add(SvConf svConf) {
        LOGGER.debug("Method add is executing with (param: {})", svConf);
        svConfDao.add(svConf);
        LOGGER.debug("Method add was executed");
    }


    public void update(SvConf svConf) {
        LOGGER.debug("Method update is executing with (param: {})", svConf);
        svConfDao.update(svConf);
        LOGGER.debug("Method update was executed");
    }


    public void delete(String name) {
        LOGGER.debug("Method delete is executing with (param: {})", name);
        svConfDao.delete(name);
        LOGGER.debug("Method delete was executed");
    }
}
