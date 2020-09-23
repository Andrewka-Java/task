package com.epolsoft.soap_app.config;


import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class SoapConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext context) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();

        servlet.setApplicationContext(context);
        servlet.setTransformWsdlLocations(true);

        return new ServletRegistrationBean(servlet, "/ws/*");
    }

    @Bean
    public DefaultWsdl11Definition svConfWsdlDefinition(XsdSchema svConfSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();

        wsdl11Definition.setPortTypeName("sv_conf_port");
        wsdl11Definition.setLocationUri("/ws/sv_conf");
        wsdl11Definition.setTargetNamespace("http://epolsoft.com/model/sv_conf");
        wsdl11Definition.setSchema(svConfSchema);

        return wsdl11Definition;
    }

    @Bean
    public XsdSchema svConfSchema() {
        return new SimpleXsdSchema(new ClassPathResource("sv_conf.xsd"));
    }

}
