/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package di.atos.exercicexpgoldweek6day2.exercice2;

/**
 *
 * @author ezekielkouassi
 */
public class Secret {

    private int mySecretNumber = 10;

    private int secret;

    public void displaySecret() {

        mySecretNumber = 45;

        // Réaffectation de la valeur de la variable d'instance mySecretNumber à 45
        secret = mySecretNumber;

        // La variable de référence secret pointe maintenant vers la variable d'instance mySecretNumber
        System.out.println("Variable de référence accédant à la variable d'instance : " + secret);

        // Affichage de la valeur de la variable de référence (qui est la même que celle de la variable d'instance)
        System.out.println("Variable locale : " + mySecretNumber);

        // Affichage de la valeur de la variable d'instance (qui a été réaffectée à 45)
        secret = mySecretNumber;

        // La variable de référence secret pointe maintenant vers la variable locale (qui a la même valeur que la variable d'instance)
        System.out.println("Variable de référence accédant à la variable d'instance qui pointe vers la variable locale : " + secret);

        // Affichage de la valeur de la variable de référence (qui est la même que celle de la variable locale)
    }
}
