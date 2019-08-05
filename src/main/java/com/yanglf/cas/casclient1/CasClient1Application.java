package com.yanglf.cas.casclient1;

import net.unicon.cas.client.configuration.CasClientConfigurerAdapter;
import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

@EnableCasClient
@SpringBootApplication
public class CasClient1Application extends CasClientConfigurerAdapter {

    public static void main(String[] args) {
        SpringApplication.run(CasClient1Application.class, args);
    }


    @Override
    public void configureValidationFilter(FilterRegistrationBean validationFilter) {
        validationFilter.getInitParameters().put("useSession", "false");
    }

}
