package com.example.customer.service;

import com.example.customer.model.Customer;
import com.example.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by duhlig on 8/3/17.
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Transactional
    @Override
    public Customer add(Customer customer) {
       return customerRepository.save(customer);
    }

    @Override
    public Customer getById(int id) {
        return customerRepository.getOne(id);
    }

    @Override
    public List<Customer> get() {
        return customerRepository.findAll();
    }

    @Transactional
    @Override
    public Customer update(Customer customer) {
       return customerRepository.save(customer);
    }

    @Transactional
    @Override
    public void delete(int id) {
        customerRepository.delete(id);
    }
}
