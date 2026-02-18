package com.app.config;


import org.springframework.context.annotation.*;
import com.app.service.BankService;
import com.app.aspect.LoggingAspect;

@Configuration
@ComponentScan("com.app")
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public BankService bankService() {
        return new BankService();
    }

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}
