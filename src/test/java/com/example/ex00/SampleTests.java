package com.example.ex00;

import com.example.ex00.sample.Restaurent;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;
import javax.swing.*;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class SampleTests {

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    Restaurent restaurent;

    @Autowired
    DataSource dataSource;

    @Test
    public void test1() {
        log.info("--------------");
        log.info("--------------");
        log.info(restaurent);
        log.info("--------------");
        log.info("--------------");

    }

}
