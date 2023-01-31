/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package di.atos.exercicexpgoldweek6day2;

import di.atos.exercicexpgoldweek6day2.exercice1.FatherPanda;
import di.atos.exercicexpgoldweek6day2.exercice2.Secret;
import di.atos.exercicexpgoldweek6day2.exercice3.Salary;

/**
 *
 * @author ezekielkouassi
 */
public class ExerciceXpGoldWeek6Day2 {

    public static void main(String[] args) {
        System.out.println("===== Début Exercice 1 ======");
        FatherPanda father = new FatherPanda();
        father.eat();
        System.out.println("====== Fin Exercice 1 =======");

        System.out.println("====== Début Exercice 2 =======");

        Secret notSoPrivate = new Secret();
        notSoPrivate.displaySecret();
        
        System.out.println("====== Fin Exercice 2 ========");
        Salary salary = new Salary();
        salary.SalaryCalculator();
        System.out.println("====== Début Exercice 3 =====");
        
        
    }
}
