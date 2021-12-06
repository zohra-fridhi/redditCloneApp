package com.fridhi.springit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringitApplication {
	/*
	**we create a private var because we don't want anyone outside this class accessing it
	** it's a static var ; we only need one instance of it
	* it's final because iy's not going to change
	* we're using Logger from Slf4j package and
	**we are going to call log and we're going to go to the logger factory,and
	** getLogger and we're going to use (to pointing to this class) the springitApplication.class
	 */

	private  static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(SpringitApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(){
		return args -> {
			log.error("commandLineRunner.run();");
			log.warn("commandLineRunner.run();");
			log.info("commandLineRunner.run();");
			log.debug("commandLineRunner.run();");
			log.trace("commandLineRunner.run();");
		};
	}

}
