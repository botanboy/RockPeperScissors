package com.artzarg;

import java.util.Scanner;

public class Main {
    public String name1;


  //Я не допер как это прикрутить(((
//    public void abc() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Ведите ваше имя ");
//        this.name1 = input.nextLine();
//    }


    public static void main(String[] args) {


        Player bot = new Player();
        Player artem = new Player ("Артём", Variants.SCISSORS);

        System.out.println(bot.whoWin(bot, artem));

    }

}
