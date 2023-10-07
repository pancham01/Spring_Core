package spring_core.dpInjectPro.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import spring_core.dpInjectPro.Entity.Address;
import spring_core.dpInjectPro.Entity.Employee;

@Configuration
@ComponentScan(basePackages= "spring_core.dpInjectPro")
public class AppConfig {

	//@Bean
	@Bean(initMethod="turnOn", destroyMethod="turnOff")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Address getAddress() {
		return new Address();
	}
	
}
