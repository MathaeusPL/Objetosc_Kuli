package com.mateusz_famulski;

import java.util.Scanner;

public class Logic {

    private Scanner skan = new Scanner(System.in);

    /**
     * Użytkownik wprowadza liczbę
     * @return liczba typu double - promień kuli
     */
      double userInput(){
        return skan.nextDouble();
    }

    /**
     * Obliczenie objętości kuli
     * @param radius liczba tj promień kuli podana przez użytkownika
     */
     void calculations (double radius){
        System.out.println("\nObjętość kuli przy promieniu "+radius+" cm"+" wynosi: "+(4*Math.PI*Math.pow(radius,3))/3+" cm3");
    }

    /**
     * wczytanie nowej linii aby nie przekazać poprzedniej wartości i nie utworzyć nieskończonej pętli
     */
      void scanNextLine(){
        skan.nextLine();
    }

    /**
     * wyświetlenie menu tekstowego
     */
     void menu(){
        System.out.println("\nCo teraz zrobimy ?\n" +
                "1 - Liczymy objętość kolejnej kuli\n" +
                "Inny znak - Kończymy liczenie, zamykamy program\n");

    }

    /**
     * Użytkownik wybiera czy chce zamknąć program
     * @return wczytuje wybór użytkownika w postaci String
     */
     String userInputString(){
        return skan.next();
    }
}

