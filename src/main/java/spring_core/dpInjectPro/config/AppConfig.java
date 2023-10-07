package spring_core.dpInjectPro.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "spring_core.dpInjectPro")
@PropertySource("classpath:application.properties")
public class AppConfig {
	
}
