/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.exercicexpgoldweek6day2.exercice3;

import java.util.Scanner;

/**
 *
 * @author ezekielkouassi
 */
public class Salary {
    public void SalaryCalculator(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Basic Salary : ");
        double basicSalary = sc.nextDouble();
        double HRA;
        double DA;
        double grossSalary;

        if (basicSalary <= 10000) {
            HRA = 0.2 * basicSalary;
            DA = 0.8 * basicSalary;
        } else if (basicSalary <= 20000) {
            HRA = 0.25 * basicSalary;
            DA = 0.9 * basicSalary;
        } else {
            HRA = 0.3 * basicSalary;
            DA = 0.95 * basicSalary;
        }

        grossSalary = basicSalary + HRA + DA;
        System.out.println("Gross Salary : " + grossSalary);
    }
}
