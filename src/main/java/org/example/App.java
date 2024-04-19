package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import javax.sql.DataSource;


public class App
{
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                MyApplicationContextConfiguration.class);
        UserDao userDao = context.getBean(UserDao.class);


    }
}
