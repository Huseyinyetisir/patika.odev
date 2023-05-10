package org.patika;

import java.util.Scanner;

public class SinifiGecmeDurumu {

    public static void main(String[] args) {

        String[] ders = {"matematik", "fizik", "kimya","türkçe", "tarih", "müzik"};

        int[] gecerliDersNotu = new int[6];
        int gecerliDers = 0;
        int toplam = 0;
        Scanner sc = new Scanner(System.in);

        for (int i= 0;i< ders.length;i++){
            System.out.println(ders[i]);
            gecerliDersNotu[i] = sc.nextInt();
            if (gecerliDersNotu[i] >100 || gecerliDersNotu[i] <1){
                gecerliDersNotu[i]  = 0;
            }
        }

        for (int i=0;i<gecerliDersNotu.length;i++){
            if (gecerliDersNotu[i]>0){
                 toplam += gecerliDersNotu[i];
                gecerliDers++;
            }
        }

        int ort =  toplam/gecerliDers;
        System.out.println("ortalamanız: " + ort);
        System.out.println(ort > 55? "Geçtiniz":"Sınıfı geçemediniz");
    }
}
