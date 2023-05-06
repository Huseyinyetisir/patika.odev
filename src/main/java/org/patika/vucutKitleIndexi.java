package org.patika;

/*
Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173
*/

import java.util.Scanner;

public class vucutKitleIndexi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        double boy = sc.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz :");
        double kg = sc.nextDouble();

        double index = kg/ (boy * boy);
        System.out.println(index);
    }

}
