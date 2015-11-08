/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.AopDemo.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * The Class BeanConfig.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages={"net.arup.spring.AopDemo"})
public class BeanConfig {

	/**
	 * Gets the aspect bean.
	 *
	 * @return the aspect bean
	 */
	@Bean
	AspectConfig getAspectBean(){
		return new AspectConfig();
	}
	
	/**
	 * Gets the aspect introduction bean.
	 *
	 * @return the aspect introduction bean
	 */
	@Bean
	AspectIntroductionConfig getAspectIntroductionBean(){
		return new AspectIntroductionConfig();
	}
}
