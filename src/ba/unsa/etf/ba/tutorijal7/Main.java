package ba.unsa.etf.ba.tutorijal7;

import java.util.Scanner;

public class Main {

    public static int sumaCifara(int broj) {
        if(broj < 0) broj *= -1;
        int suma = 0;
        while (broj > 0){
            suma += broj % 10;
            broj /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.print("Unesite neki broj: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        System.out.println("Rezultat: ");
        for(int i = 1; i <= n; i++){
            if(i % sumaCifara(i) == 0)
                System.out.print(i + " ");
        }
    }
}
