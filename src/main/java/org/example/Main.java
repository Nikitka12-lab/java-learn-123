package org.example;

import java.nio.channels.Selector;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите логин");

        String login = scanner.nextLine();

        System.out.println(login);

        switch (login) {
            case "qwewrty":
                System.out.println("не допустимая комбинация символов");
                break;
            case "admin":
                System.out.println("Введите пароль администратора");

                if (scanner.nextLine().equals("admin")) {
                    System.out.println("Вы вошли как админисратор");
                } else {
                    System.out.println("Не верный пароль администратора");
                }



        }
       }

       }




