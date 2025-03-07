package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        Healthplan healthplan = new Healthplan(324, "Standart", Plan.BASIC);
        System.out.println(healthplan.toString());

        String[] healtplans = new String[2];
        Employee employee = new Employee(3454, "Sinem Ata", "fsdgh@dgdfgg", "12121", healtplans);
        employee.addHealthPlan(0,"BASIC");
        employee.addHealthPlan(1,"PREMIUM");
        System.out.println(employee);

        String[] developers = new String[3];
        Company company = new Company(3243, "Beyza & Tamer", 1000000, developers);
        company.addEmployee(0, "Sinem");
        company.addEmployee(1, "Ata");
        System.out.println(company);
    }
}