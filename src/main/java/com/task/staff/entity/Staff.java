package com.task.staff.entity;

public class Staff {
    private final String name;
    private final String position;
    private final String phone;
    private final String salary;

    public Staff(String name, String position, String phone, String salary){
        this.name=name;
        this.position=position;
        this.phone=phone;
        this.salary=salary;
    }

    public String getName(){
        return name;
    }

    public String getPosition(){
        return position;
    }

    public String getPhone(){
        return phone;
    }

    public String getSalary(){
        return salary;
    }

}
