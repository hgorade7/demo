package com.logger;

import org.apache.logging.log4j.*;

public class Demo {
	
	public static void main(String[] args) {
		Logger log = LogManager.getLogger();
		log.info("this is an info log");
		log.error("this is an error log");
		log.trace("this is an trace log");
	}
}