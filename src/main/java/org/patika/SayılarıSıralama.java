package org.patika;

import java.util.Scanner;

public class SayılarıSıralama {

    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Sayı");
        a = sc.nextInt();

        System.out.println("2. Sayı");
        b = sc.nextInt();

        System.out.println("3. Sayı");
        c = sc.nextInt();

        if ((a>b)&&(a>c)){System.out.println(b>c? "a>b>c": "a>c>b");
        } else if ((b>a)&&(b>c)){System.out.println(a > c? "b>a>c":"b>c>a");
        }else if ((b>a)&&(b>c)){System.out.println(a > c? "b>a>c":"b>c>a");
        } else if ((c>a)&&(c>b)){System.out.println(a>b? "c>a>b":"c>b>a");
        }
    }
}
