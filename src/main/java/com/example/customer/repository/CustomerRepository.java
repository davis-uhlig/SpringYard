package com.example.customer.repository;

import com.example.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;

/**
 * Created by duhlig on 8/3/17.
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
}


