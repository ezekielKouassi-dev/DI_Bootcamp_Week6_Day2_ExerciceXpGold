/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.exercicexpgoldweek6day2.exercice1;

/**
 *
 * @author ezekielkouassi
 */
public class FatherPanda {

    public boolean isPredator;

    protected int weight;

    private int age;

    public void eat() {

        System.out.println("After each meal, Father Panda gains weight: " + weight);

        System.out.println("And his age is: " + age);

    }
}
