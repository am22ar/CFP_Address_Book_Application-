package com.address_book_development;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

//@Import(MetricsConfiguration.class)
//@ComponentScan("package.of.aspect")
@Configuration
@EnableAspectJAutoProxy
@SpringBootApplication
@Slf4j
public class AddressBookDevelopmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(AddressBookDevelopmentApplication.class, args);
        log.info("Application of Address Book starts....");
    }

}
