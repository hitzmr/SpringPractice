package main.java.dao.impl;

import main.java.dao.CustomerDao;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao {

    @Override
    public void saveCustomer() {
        System.out.println("调用了持久层");
    }
}
