package main.java.service.impl;

import main.java.dao.CustomerDao;
import main.java.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public void saveCustomer() {
        System.out.println("调用业务层");
        customerDao.saveCustomer();
    }
}
