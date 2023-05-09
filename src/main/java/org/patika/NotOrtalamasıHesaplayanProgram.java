package org.patika;


import java.util.Scanner;

public class NotOrtalamasıHesaplayanProgram {


    public static void main(String[] args) {

        int matematik, fizik, kimya,türkçe, tarih, müzik;

        Scanner sc = new Scanner(System.in);

        System.out.println("Matematik= ");
        matematik = sc.nextInt();


        System.out.println("Fizik");
        fizik = sc.nextInt();

        System.out.println("Kimya");
        kimya = sc.nextInt();

        System.out.println("Türkçe");
        türkçe = sc.nextInt();

        System.out.println("Tarih");
        tarih = sc.nextInt();

        System.out.println("Müzik");
        müzik = sc.nextInt();

        int ort =  (matematik + fizik + kimya + türkçe + tarih +müzik)/6;
        System.out.println("ortalamanız" + ort);
        System.out.println(ort > 60 ? "Geçtiniz":"Sınıfı geçemediniz");
    }
}
