package com.workintech.developers;

public class SeniorDeveloper extends Employee{

    public SeniorDeveloper(long id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("Senior Developer starts to working");
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }
}
