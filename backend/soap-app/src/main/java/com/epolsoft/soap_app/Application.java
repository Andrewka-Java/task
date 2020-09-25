package com.epolsoft.soap_app;


import com.epolsoft.sv_conf.SvConf;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MappedTypes(SvConf.class)
@MapperScan("com.epolsoft.dao")
@SpringBootApplication(scanBasePackages = "com.epolsoft.*")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
