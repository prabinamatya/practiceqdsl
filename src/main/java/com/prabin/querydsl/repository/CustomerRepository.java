package com.prabin.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.prabin.querydsl.entities.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Long>, QueryDslPredicateExecutor<Customer>{

}
