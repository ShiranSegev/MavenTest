package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

 static   Scanner scanner = new Scanner(System.in);
  static   Random random = new Random();

    public static void main(String[] args) {


//        firstOneLarger();

//        int x = scanner.nextInt();
//        while (x < 10) {
//            System.out.println("shiran");
//            x++;

//            for (int i = 5; i < 10; i++) {
//                System.out.println("shiran");
//
//            }
//        }

//    static void firstOneLarger (){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Pls write the first number");
//        int a = scanner.nextInt();
//        System.out.println("Pls write the second number");
//        int b = scanner.nextInt();
//        if (a > b){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }
//    }
//        int x = random.nextInt(7);
//        guess (x);

        String s1 = "shiran";
//        print(s1);

        String [][] shiran = {{"abc","def","ghi"},{"ABC","DEF","GHI"}};
//        printeverything(shiran);

//        printsum();
        try {
            weekDay();
        } catch (Exception ex){
            System.out.println("its not a number!");
        }
    }

    static void weekDay (){
        System.out.println("give me a number");
        int day = scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            default:
                System.out.println("not sunday or monday");
        }

    }




//    static void printsum () {
//        int sum = 0;
//        System.out.println("type a number, \nto stop type 0");
//        int temp = scanner.nextInt();
//        while (temp != 0){
//            sum += temp;
//            System.out.println("type next number");
//            temp = scanner.nextInt();
//        }
//        System.out.println("sum is" + sum);
//    }

//    static void guess(int x){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Try to guess the number");
//        int answer = scanner.nextInt();
//        int counter = 1;
//        while (answer != x){
//            System.out.println("Try again");
//            answer = scanner.nextInt();
//            counter++;
//        }
//        System.out.println("Mazal tov !");
//        System.out.println("Guesses : " + counter);
//    }
//
//    static void print (String s){
//        for (int i = 0; i < s.length(); i++) {
//            System.out.print(s.charAt(i) + " ");
//
//        }
//
//    }
//
//    static void printeverything (String[][] shiran){
//        for (int i = 0; i < shiran.length; i++) {
//            for (int j = 0; j < shiran[i].length; j++) {
//                for (int k = 0; k < shiran[i][j].length(); k++) {
//                    System.out.println(shiran[i][j].charAt(k));
//                }
//            }
//        }
//    }


}