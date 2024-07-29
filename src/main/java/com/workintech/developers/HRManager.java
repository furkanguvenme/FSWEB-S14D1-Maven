package com.workintech.developers;

public class HRManager extends Employee{

    private JuniorDeveloper[] JuniorDeveloper;
    private MidDeveloper[] MidDeveloper;
    private SeniorDeveloper[] SeniorDeveloper;

    public HRManager(long id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work(){
        System.out.println("HR Manager starts to working");
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    public void addEmployee(int index, JuniorDeveloper juniorDeveloper){
        if(index < 0 && index >= JuniorDeveloper.length){
            System.out.println("Böyle bir index bulunamamaktadır.");
        }
        if(JuniorDeveloper[index] == null) {
            JuniorDeveloper[index] = juniorDeveloper;
        } else {
            System.out.println("Bu index dolu!");
        }
    }

    public void addEmployee(int index, MidDeveloper midDeveloper){
        if(index < 0 && index >= MidDeveloper.length){
            System.out.println("Böyle bir index bulunamamaktadır.");
        }
        if(MidDeveloper[index] == null) {
            MidDeveloper[index] = midDeveloper;
        } else {
            System.out.println("Bu index dolu!");
        }
    }

    public void addEmployee(int index, SeniorDeveloper seniorDeveloper){
        if(index < 0 && index >= SeniorDeveloper.length){
            System.out.println("Böyle bir index bulunamamaktadır.");
        }
        if(SeniorDeveloper[index] == null) {
            SeniorDeveloper[index] = seniorDeveloper;
        } else {
            System.out.println("Bu index dolu!");
        }
    }
}
