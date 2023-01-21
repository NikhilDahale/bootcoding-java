package com.bootcoding.project.service;

import com.bootcoding.project.model.Customer;
import com.bootcoding.project.utils.*;


public class CustomerService {
    public  Customer createCustomer(){
        Customer customer=new Customer();
        customer.setName(CustomerNameGenerator.getName());
        customer.setCity(CityGenerator.getName());
        customer.setEmailID(EmailIdGenerator.getEmailId(customer.getName()));
        customer.setPhoneNumber(PhoneNumberGenerator.getPhoneNumber());
       customer.setDeliveryAdress(AddressGenerator.getAddress());







        return customer;



    }

    public void print(Customer customer){
        System.out.println("Customer Name :"+customer.getName());
        System.out.println("Customer City :"+customer.getCity());
        System.out.println("Customer Emailid :"+customer.getEmailID());
        System.out.println("Customer DeliveryAddress :"+customer.getDeliveryAdress());
        System.out.println("Customer Phonenumber :"+customer.getPhoneNumber());

    }

    public static void main(String[] args) {
//        CustomerService cs = new CustomerService();
//        Customer customer = cs.createCustomer();
//        cs.print(customer);
        CustomerService cs = new CustomerService();
        for (int i = 0; i < 50; i++) {
            Customer customer = cs.createCustomer();
            cs.print(customer);
        }

    }}