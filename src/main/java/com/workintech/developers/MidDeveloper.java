package com.workintech.developers;

public class MidDeveloper extends Employee{

    public MidDeveloper(long id, String name, int salary) {
        super(id, name, salary);

    }

    @Override
    public void work(){
        System.out.println("Mid Developer starts to working");
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }
}
