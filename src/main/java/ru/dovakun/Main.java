package ru.dovakun;

import java.util.Scanner;

public class Main {
    String[] strings = new String[3];
    private static boolean whiles = true;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (whiles){
            String value = scanner.nextLine();
            if (value.equals("e")||value.equals("q")||value.equals("exit")){
                whiles = false;
            }else {
                System.out.println(calc(value));
            }
        }
    }
    public static String calc(String input){
        if (input.contains("+")){
            
            }
        else if (input.contains("-")) {
            if (input.contains("X")||input.contains("I")){
                String delimint = "-";
                String[] word = input.split(delimint);
                for (var i = 0; i < word.length; i++) {
                    int i1 = Rome.getByRomanNumeral(word[0]).getValue();
                    int i2 = Rome.getByRomanNumeral(word[1]).getValue();
                    if (i1>10||i1<1||i2>10||i2<1){
                        return "Введенное число больше 10 или меньше 1";
                    }
                    return Rome.intToRoman(i1-i2);

                }
            }else {
            String delimint = "-";
            String[] word = input.split(delimint);
            for (var i = 0; i < word.length; i++) {
                int i1 = Integer.parseInt(word[0]);
                int i2 = Integer.parseInt(word[1]);
                if (i1>10||i1<0||i2>10||i2<0){
                    return "Введенное число больше 10 или меньше 1";
                }
                return String.valueOf(i1-i2);
            }
            }
        }else if (input.contains("*")) {
            if (input.contains("X")||input.contains("I")){
                String delimint = "\\*";
                String[] word = input.split(delimint);
                for (var i = 0; i < word.length; i++) {
                    int i1 = Rome.getByRomanNumeral(word[0]).getValue();
                    int i2 = Rome.getByRomanNumeral(word[1]).getValue();
                    if (i1>10||i1<1||i2>10||i2<1){
                        return "Введенное число больше 10 или меньше 1";
                    }
                    return Rome.intToRoman(i1*i2);

                }
            }else {
            String delimint = "\\*";
            String[] word = input.split(delimint);
            for (var i = 0; i < word.length; i++) {
                int i1 = Integer.parseInt(word[0]);
                int i2 = Integer.parseInt(word[1]);
                if (i1>10||i1<0||i2>10||i2<0){
                    return "Введенное число большь 10 или меньше 1";
                }
                return String.valueOf(i1*i2);
            }
            }
        }else if (input.contains("/")) {
            if (input.contains("X")||input.contains("I")){
                String delimint = "/";
                String[] word = input.split(delimint);
                for (var i = 0; i < word.length; i++) {
                    int i1 = Rome.getByRomanNumeral(word[0]).getValue();
                    int i2 = Rome.getByRomanNumeral(word[1]).getValue();
                    if (i1>10||i1<1||i2>10||i2<1){
                        return "Введенное число больше 10 или меньше 1";
                    }
                    return Rome.intToRoman(i1/i2);

                }
            }else {
            String delimint = "/";
            String[] word = input.split(delimint);
            for (var i = 0; i < word.length; i++) {
                int i1 = Integer.parseInt(word[0]);
                int i2 = Integer.parseInt(word[1]);
                if (i1>10||i1<0||i2>10||i2<0){
                    return "Введенное число больше 10 или меньше 1";
                }
                return String.valueOf(i1/i2);
            }
        }
        }
        return "Вы ввели что-то не понятное";
    }
}