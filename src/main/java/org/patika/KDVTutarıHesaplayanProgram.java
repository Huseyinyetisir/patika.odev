package org.patika;

import java.util.Scanner;

public class KDVTutarıHesaplayanProgram {

    public static void main(String[] args){
        System.out.println("Lütfen tutar giriniz: ");
        Scanner sc = new Scanner(System.in);
        double tutar = sc.nextDouble();
        if (tutar > 1000){
            tutar = tutar * 1.08;
        }else {
            tutar = tutar * 1.18;
        }
        System.out.println("KDV'li fiyat: "+ tutar);

    }
}
