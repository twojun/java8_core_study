package org.example.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExam001 {

    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer("A", 23));
        customerList.add(new Customer("B", 21));
        customerList.add(new Customer("C", 11));
        customerList.add(new Customer("D", 35));
        customerList.add(new Customer("E", 56));
        customerList.add(new Customer("F", 12));
        customerList.add(new Customer("G", 45));
        customerList.add(new Customer("H", 23));
        customerList.add(new Customer("I", 89));

        List<String> customersBySorted = customerList.stream()
                .filter(customer -> customer.getAge() > 30)
                .sorted(Comparator.comparing(Customer::getAge))
                .map(customer -> customer.getName())
                .collect(Collectors.toList());

        for (String name : customersBySorted) {
            System.out.println(name);
        }
    }
}
