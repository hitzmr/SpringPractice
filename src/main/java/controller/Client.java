package main.java.controller;

import main.java.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class Client {
//    @Autowired
//    CustomerService customerService;

//    public void saveCustomer(){
//        System.out.println("调用表现层");
//        customerService.saveCustomer();
//    }
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        CustomerService customerService = (CustomerService) applicationContext.getBean("customerServiceImpl");
        customerService.saveCustomer();
    }

}
