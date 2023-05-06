package org.patika;

import java.util.Scanner;

/*Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360*/

public class daireninAlanınıveÇevresiniHesaplayanProgram {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Yarıçap: ");
        int r = sc.nextInt();

        System.out.println("Açı: ");
        int a = sc.nextInt();

        alanHesapla(r,a);

    }

    public static double alanHesapla(int yarıçap, int açı){
        double pi = 3.14;
        System.out.println(((pi*(yarıçap*yarıçap)*açı)/360));
        return ((pi*(yarıçap*yarıçap)*açı)/360);
    }

}
