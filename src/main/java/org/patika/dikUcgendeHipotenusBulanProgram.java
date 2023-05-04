package org.patika;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dikUcgendeHipotenusBulanProgram {
    public static void main(String[] args){
        Double hipo2;
        Double alan2;
        Scanner sc = new Scanner(System.in);

        System.out.println("İlk kenar uzunluğu: ");
        int a = sc.nextInt();

        System.out.println("İkinci kenar uzunluğu: ");
        int b = sc.nextInt();

        hipo2 = Math.pow(a, 2) +Math.pow(b, 2);
        Double hipo = Math.sqrt(hipo2);
        System.out.println("Hipotenüs: " + hipo);
        int cevre = (int) ((a+b+hipo)/2);


        alan2 = cevre * (cevre - a)* (cevre - b) * (cevre - hipo);
        Double alan = Math.sqrt(alan2);
        System.out.println("Ucgenin alanı: " + alan);


    }
}
