
package com.mateusz_famulski;

/**
 *
 Program oblicza objętość kuli po promieniu - oblicza i prezentuje wynik pdany w cm3.
 W projekcie użytko klasy Math celem skorzystania z gotowej wartości PI oraz spotęgowania promienia w obliczeniach.
 Program testowany na poprawnych danych wejściowych nie ujawnił błędów. Zastosowano obsługę wyjątków w przypadku
 wprowadzenia przez użytkownika błędnego rodzaju danych. Program pisany w IntelliJ IDEA na Windows 10. Wersja javy "1.8.0_144".
 @author Mateusz Famulski
 @version 0.3

 */
public class Main {
    /**
     * Wywołanie metod z klasy Logic, umieszczenie ich w pętlach.
     * @param args domyślny parametr metody main
     */
    public static void main(String[] args) {

        boolean isDataOk=true;
        boolean userMenu;
        Logic logic = new Logic();
        System.out.println("Program ten oblicza objętość kuli po jej promieniu.\n");

        do { // pętla dot. wykonywania obliczeń do czasu gdy użytkownik nie zdecyduje o zakończeniu programu

            do { //kontrola wprowadzonych danych w pętli
                try {
                    System.out.println("Podaj promień kuli w cm: ");
                    double userRadius = logic.userInput();
                    logic.calculations(userRadius);
                    isDataOk = false;

                } catch (Exception exception) {
                    System.out.println("Wprowadzono nieprawidłowe dane, spróbuj jeszcze raz!");
                    logic.scanNextLine();
                }
            } while (isDataOk);

                logic.menu();
                String userChoice = logic.userInputString();

                // instrukcja warunkowa dot. decyzji użytkownika o kontynuacji obliczeń lub zakończeniu programu

                if (userChoice.equals("1")){
                    userMenu=true;
                    isDataOk=true;
                } else {
                    System.out.println("Kończymy !");
                    userMenu=false;
                }
        } while (userMenu);
    }
}
