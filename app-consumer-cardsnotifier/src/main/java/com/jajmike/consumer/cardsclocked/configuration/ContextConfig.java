package com.jajmike.consumer.cardsclocked.configuration;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * - This is a configuration class to create  different  beans to configure the Context Config of the application
 * - Working with spring boot we will have almost everything like set up a EntityManagerFactory,  Declared here is the
 *   JpaTransactionManager or  finally activate Spring Data JPA repositories.
 * - In this case just we will configuration a embedded H2 database using the ServletRegistrationBean to execute the demo.
 *
 * @author: Miguel Angel Gonzalez Hernandez
 * @version: 22/11/2018/A
 * @see <a href = "https://github.com/miguel776/" /> https://github.com/miguel776/ – Spring proyect backend; MVC, JPA, Maven, Toncat embedded </a>
 */
@Configuration
public class  ContextConfig {

    /**
     * - Create a DataSource using an embedded H2 database through  the ServletRegistrationBean class
     * @return ServletRegistrationBean
     */
    @Bean
    public ServletRegistrationBean h2servletRegistration(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
        registrationBean.setName("dbCardsBlocked");
        registrationBean.addUrlMappings("/console/*");
        return registrationBean;
    }
}