package com.alipay.sofa;

import com.alipay.sofa.facade.SampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

/**
 * Slite2SpringBootsofaboot-enterprise-core-guidesApplication
 * <p>
 * Create a non-web application:
 * http://docs.spring.io/spring-boot/docs/1.4.2.RELEASE/reference/htmlsingle/#howto-create-a-non-web-application
 * <p>
 * <p>
 * Created by yangguanchao on 16/12/9.
 */
@ImportResource({"classpath*:META-INF/sofaboot-enterprise-core-guides/*.xml"})
@org.springframework.boot.autoconfigure.SpringBootApplication
public class SOFABootSpringApplication {

    // init the logger
    private static final Logger logger = LoggerFactory.getLogger(SOFABootSpringApplication.class);

    public static void main(String[] args){

        SpringApplication springApplication = new SpringApplication(SOFABootSpringApplication.class);
        ApplicationContext applicationContext = springApplication.run(args);
        SampleService sampleService = applicationContext.getBean(SampleService.class);

        if (logger.isInfoEnabled()){
            logger.info("Sample Service Result = " + sampleService.message());
            logger.info("Current Application Context : " + applicationContext);
        }
    }
}
