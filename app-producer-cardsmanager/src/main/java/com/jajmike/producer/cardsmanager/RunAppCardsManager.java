package com.jajmike.producer.cardsmanager;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Class that can be used to bootstrap and launch a Spring application from a Java main method. By default class will perform the following steps to bootstrap your application:
 *  - Create an appropriate ApplicationContext instance (depending on your classpath)
 *  - Register a CommandLinePropertySource to expose command line arguments as Spring properties
 *  - Refresh the application context, loading all singleton beans
 *  - Trigger any CommandLineRunner beans
 *
 * @author: Miguel Angel Gonzalez Hernandez
 * @version: 22/11/2018/A
 * @see <a href = "https://github.com/miguel776/" /> https://github.com/miguel776/ – Spring proyect backend; MVC, JPA, Maven, Toncat embedded </a>
 */
@EnableJms
@SpringBootApplication
@Slf4j
@EnableScheduling
public class RunAppCardsManager {

   /**
    * - Main method to execute  CardsManagerApp
    * @param args {@link org.springframework.context.ConfigurableApplicationContext}
    */
    public static void main(String[] args) {
        SpringApplication.run(RunAppCardsManager.class, args);
    }

}
