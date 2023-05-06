package org.patika;

import java.util.Scanner;

/**
 * Manav Kasa Programı
 * Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
 *
 * Meyveler ve KG Fiyatları
 *
 * Armut : 2,14 TL
 * Elma : 3,67 TL
 * Domates : 1,11 TL
 * Muz: 0,95 TL
 * Patlıcan : 5,00 TL
 * Örnek Çıktı;
 *
 * Armut Kaç Kilo ? :0
 * Elma Kaç Kilo ? :1
 * Domates Kaç Kilo ? :1
 * Muz Kaç Kilo ? :2
 * Patlıcan Kaç Kilo ? :3
 * Toplam Tutar : 21.68 TL
 */
public class manavKasaProgramı {

    public static void main(String[] args) {
        double Armut =  2.14;
        double Elma = 3.67;
        double Domates = 1.11;
        double Muz = 0.95;
        double Patlıcan = 5.00;

        Scanner sc = new Scanner(System.in);
        double toplam = 0;

        System.out.println("Armut Kaç Kilo ? :");
        double armutTutar = sc.nextDouble();
        armutTutar = armutTutar * Armut;
        toplam += armutTutar;
        System.out.println(toplam);

        System.out.println("Elma Kaç Kilo ? ");
        double elmaTutar = sc.nextDouble();
        elmaTutar = elmaTutar * Elma;
        toplam += elmaTutar;
        System.out.println(toplam);

        System.out.println("Domates Kaç Kilo ?");
        double domatesTutar = sc.nextDouble();
        domatesTutar = domatesTutar * Domates;
        toplam += domatesTutar;
        System.out.println(toplam);

        System.out.println("Muz Kaç Kilo ? :");
        double muzTutar = sc.nextDouble();
        muzTutar = muzTutar * Muz;
        toplam += muzTutar;
        System.out.println(toplam);

        System.out.println("Patlıcan Kaç Kilo ? :");
        double patlıcanTutar = sc.nextDouble();
        patlıcanTutar = patlıcanTutar * Patlıcan;
        toplam += patlıcanTutar;
        System.out.println("Toplam Tutar : " + toplam) ;




    }







}
