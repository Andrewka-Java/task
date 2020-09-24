package com.epolsoft.service;


import com.epolsoft.sv_conf.SvConf;

import java.util.List;


public interface SvConfService {

    List<SvConf> findAll();

    SvConf findByName(String name);

    void add(SvConf svConf);

    void update(SvConf svConf);

    void delete(String name);


}
