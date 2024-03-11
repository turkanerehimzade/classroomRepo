
package org.example;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

import static org.example.methods.Colculate;

public class Main {
    public static void main(String[] args) {

        //classTask2
        //task1
//        Scanner sc= new Scanner(System.in);
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        int sum=b+c;
//        System.out.println(sum);

        //task3
//        for (int i = 100; i < 1000; i++) {
//            if (i % 7 == 0 && i % 8 == 0) {
//                System.out.println(i);
//            }
//        }

        //task4---->tam eded olub olmadigini
//        Scanner sc= new Scanner(System.in);
//        int a=sc.nextInt();


        //task5
//        Scanner sc= new Scanner(System.in);
//        int a=sc.nextInt();
//        if(a%2==0){
//            System.out.println("the number is even ");
//        }else{
//            System.out.println("the number is odd");
//        }

        //task6
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        for (int i = 2; i < a; i++) {
//            if (a % i == 0) {
//                System.out.println("the number is complex");
//                break;
//            } else {
//                System.out.println("the number is simple");
//                break;
//            }
//        }

        //task7
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if (a > 0) {
//            System.out.println("number is positive");
//        } else if (a < 0) {
//            System.out.println("number is negative");
//        } else {
//            System.out.println("number equal zero");
//        }

        //task8
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int hasil=1;
//        for(int i=1;i<=a;i++){
//            hasil*=i;
//
//        }
//        System.out.println(hasil);

        //task9---->Fibanicci
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int cem=0;
//        for(int i=0;i<a;i++){
//            int b=i+(i+1);
//            cem=b+i;
//            System.out.println(cem);
//        }

        //task10
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        if (c == 1) {
//            System.out.println(a + b);
//        }
//        else if (c ==2) {
//            System.out.println(a - b);
//        }
//        else if (c == 3) {
//            System.out.println(a * b);
//        }
//        else if (c == 4) {
//            System.out.println(a / b);
//        }
//        else {
//            System.out.println("not find");
//        }

        //classroom3
        //task1
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int sum = 0;
//        int i = 1;
//        for (i = 1; i < a; i++) {
//            if (a % i == 0) {
//                sum = sum + i;
//                if (sum == a) {
//                    System.out.println("number is perfect");
//                    break;
//                }
//            }else {
//                System.out.println("number is not perfect");
//                break;
//            }
//        }

        //task2
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int sum=0;
//        for(int i=a+1;i<b;i++){
//            sum=sum+i;
//        }System.out.println(sum);

        //task3-->
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int sum = 0;
//        for (int i = a + 1; i < b; i++) {
//            for (int j = 1; j < b; j++) {
//                if (i % j == 0) {
//                    sum = sum + j;
//                    if (sum == i) {
//                        System.out.println(i);
//
//                    }
//                    else {
//                        System.out.println("there is not perfect number");
//                        break;
//                    }
//                }
//            }
//        }

        //task4
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//        String ters = "";
//        for (int i = a.length() - 1; i >= 0; i--) {
//            ters += a.charAt(i);
//        }
//        System.out.println(ters);

        //task5
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int sum = 0;
//        while (a != 0) {
//            sum += a % 10;
//            a /= 10;
//        }
//        System.out.println(sum);

        //task7
//        Random rdm=new Random();
//        int x= rdm.nextInt();
//        System.out.println(x);
//        Scanner sc=new Scanner(System.in);
//        for(int i=0;i<3;i++){
//            int y=sc.nextInt();
//            int z= sc.nextInt();
//            int d= sc.nextInt();
//            if(y==x || z==x || d==x){
//                System.out.println("Successful");
//            }else{
//                System.out.println("Incorrect");
//            }
//        }
//        System.out.println("unsuccessful");


        //task9
//        for (int i = 1; i < 8; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println( );
//        }

        //task10
//        for (int i = 1; i < 7; i++) {
//            for (int j = 1; j < 7 - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //task11


        //task12
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        String c = sc.next();
//        switch (c) {
//            case "+":
//                System.out.println(a + b);
//                break;
//            case "-":
//                System.out.println(a - b);
//                break;
//            case "*":
//                System.out.println(a * b);
//                break;
//            case "/":
//                System.out.println(a / b);
//                break;
//            default:
//                System.out.println("not find");
//
//        }

    }
}








