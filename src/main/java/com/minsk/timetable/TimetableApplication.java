package com.minsk.timetable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


/**
 * @author AleksandrovichK
 * This is the main launch class. If you are ended up with MySQL configuration - please remove
 * row below
 *  --- SpringBootApplication(exclude={ DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
 * and uncomment two rows on top
 *  --- EnableJpaRepositories
 *  --- SpringBootApplication
 * */
// @SpringBootApplication(exclude={ DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EnableJpaRepositories
@SpringBootApplication
public class TimetableApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimetableApplication.class, args);
    }

}
