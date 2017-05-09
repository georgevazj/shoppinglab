package com.georgevazj.configuration;

import com.georgevazj.component.RequestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by jorge on 09/05/2017.
 */

@Configuration
public class WebMVCConfiguration extends WebMvcConfigurerAdapter {

    @Autowired
    @Qualifier("requestInterceptor")
    private RequestInterceptor requestInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requestInterceptor);
    }


}
