package com.kodilla.abstracts.homework;

public  class Job {
    private int salary;
    private String responsibilities;

    public Job(String responsibilities, int salary) {
        this.salary = salary;
        this.responsibilities = responsibilities;

    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public int getSalary() {
        return salary;
    }
    public void displayJobInformation(){
        System.out.println("Job information: " + responsibilities + ", salary is " + salary);
    }

}
