package com.log;

//import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4jprojectApplication {

	static Logger log = Logger.getLogger(Log4jprojectApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Log4jprojectApplication.class, args);

//		BasicConfigurator.configure();
		PropertyConfigurator.configure("log4j.properties");
//		log.info("this is information");
//		log.warn("this is warning");
//		log.error("this is error");
//		log.debug("this is debugging");
//		log.fatal("this is critical error");
	}

}
