package com.georgevazj.component;

import com.georgevazj.repository.LogRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by jorge on 09/05/2017.
 */

@Component("requestInterceptor")
public class RequestInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    @Qualifier("logRepository")
    private LogRepository logRepository;

    public static final Log LOG = LogFactory.getLog(RequestInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
        request.setAttribute("startTime", System.currentTimeMillis());
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        long startTime = (long) request.getAttribute("startTime");
        String url = request.getRequestURL().toString();

        com.georgevazj.entity.common.Log log = new com.georgevazj.entity.common.Log(new Date(), "dummy", "dummy", url);
        logRepository.save(log);
        LOG.info("Url to: '" + url + "' in: '" + (System.currentTimeMillis() - startTime) + "'ms'");
    }

}
