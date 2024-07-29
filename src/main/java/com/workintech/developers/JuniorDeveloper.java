package com.workintech.developers;

public class JuniorDeveloper extends Employee{

    public JuniorDeveloper(long id, String name, int salary) {
        super(id, name, salary);

    }

    @Override
    public void work(){
        System.out.println("Junior Developer starts to working");
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }
}
