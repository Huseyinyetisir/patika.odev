package org.patika;

import java.util.Scanner;

public class HesapMakinesi {


    public static void main(String[] args) {
        int sayi1;
        int sayi2;
        int select;


        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci sayı: ");
        sayi1 = sc.nextInt();
        System.out.println("İkinci sayı: ");
        sayi2 = sc.nextInt();
        System.out.println("1 - Topla\n2- Çıkar\n3- Böl\n4-Çarp ");
        System.out.println("İşlem belirtiniz: ");
        select = sc.nextInt();

        switch (select){
            case 1:
                System.out.println(sayi1+sayi2);
            case 2:
                System.out.println(sayi1-sayi2);
            case 3:
                System.out.println(sayi1/sayi2);
            case 4:
                System.out.println(sayi1*sayi2);
        }
    }
}
