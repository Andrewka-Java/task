package com.epolsoft.dao.config;

import com.epolsoft.dao.SvConfDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.epolsoft.*")
@EnableAutoConfiguration
public class DaoConfig {

    @Autowired
    private DataSource dataSource;

//    @Bean
//    public DataSource dataSource() {
//        return new EmbeddedDatabaseBuilder()
//                .setType(EmbeddedDatabaseType.H2)
//                .addScript("schema.sql")
//                .addScript("data.sql")
//                .build();
//    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);

        SqlSessionFactory factory = factoryBean.getObject();

        return factory;
    }

//    @Bean
//    public MapperFactoryBean svConfDao() throws Exception {
//        MapperFactoryBean mapperFactoryBean = new MapperFactoryBean();
//        mapperFactoryBean.setMapperInterface(SvConfDao.class);
//        mapperFactoryBean.setSqlSessionFactory(sqlSessionFactory());
//
//        return mapperFactoryBean;
//    }

    @Bean
    public DataSourceTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }
}
