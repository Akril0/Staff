package com.task.staff.services;

import com.task.staff.entity.Staff;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PrintServices {
    public void print(List<Staff> staffList){

        AtomicInteger cnt = new AtomicInteger(0);

        staffList.forEach(person -> System.out.println(
                cnt.incrementAndGet() + ") " +
                        "Name: " + person.getName() + "\n" +
                        "Position: " + person.getPosition() + "\n" +
                        "Phone: " + person.getPhone() + "\n" +
                        "Salary: " + person.getSalary() + "\n"));
    }
}
