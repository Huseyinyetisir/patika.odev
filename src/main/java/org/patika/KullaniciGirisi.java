package org.patika;

import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {
        String kullaniciAdi;
        int sifre;
        int yeniSifre;
        String talep;

        Scanner sc = new Scanner(System.in);

        System.out.println("Kullanici adi: ");
        kullaniciAdi = sc.nextLine();

        System.out.println("Sifre: ");
        sifre = sc.nextInt();

        if (kullaniciAdi.equals("Hüseyin") && sifre == 1234) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Bilgileriniz hatalı şifreyi değiştirmek ister misiniz?");
            Scanner talepin = new Scanner(System.in);
            talep = talepin.nextLine();
            System.out.println(talep);

                if (talep.equals("evet")) {
                    System.out.println("Yeni sifre");
                    yeniSifre = sc.nextInt();
                    System.out.println("Yeni sifreniz kaydedildi: " + yeniSifre);
                } else {
                    System.out.println("Şifre değiştirilemedi");
             }}
    }
}
