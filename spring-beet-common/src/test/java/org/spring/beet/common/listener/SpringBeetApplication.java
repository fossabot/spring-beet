package org.spring.beet.common.listener;

import lombok.extern.slf4j.Slf4j;
import org.spring.beet.common.springboot.ApplicationContextWrapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class SpringBeetApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBeetApplication.class, args);
  }

  @Bean
  public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
    return args -> {
      log.info("Demo Started!");
    };
  }

  @Bean
  public ApplicationContextWrapper applicationContextWrapper(ApplicationContext ctx) {
    ApplicationContextWrapper contextWrapper = new ApplicationContextWrapper();
    contextWrapper.setApplicationContext(ctx);
    return contextWrapper;
  }
}