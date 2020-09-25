package org.quasar.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("org.quasar.test")
@EnableAsync
public class QuasarApplication {
	public static void main(String[] args) {
		SpringApplication.run(QuasarApplication.class, args);
	}
}
