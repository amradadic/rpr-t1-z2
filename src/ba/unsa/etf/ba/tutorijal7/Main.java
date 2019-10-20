package ba.unsa.etf.ba.tutorijal7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Unesite 2 broja: ");

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        int number2 = input.nextInt();

        System.out.print("Zbir unesenih brojeva je: ");
        System.out.println(number+number2);
    }
}
