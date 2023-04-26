package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "demo")
public class BeanConfig {

//	@Bean
//	public Doctor doctor() {
//		return new Doctor();
//	}
}

/*
 * THERE ARE DIFFERENT SCOPES FOR SPRING BEAN.
 * 5 TYPES.
 * 1 - SINGLETON(DEFAULT)
 * 2 - PROTOTYPE
 * 3 - REQUEST
 * 4 - SESSION
 * 5 - GLOBAL SESSION
 */
