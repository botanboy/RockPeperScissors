package com.artzarg;

import java.util.ArrayList;

public class Player {
     private  String draw = " Ничья";
     private String win = " Выйграл";
     private Variants options;
     private int b = 3;
     String name;
//     Main names = new Main();
//     String name = names.name1;

    public String whoWin(Player a1, Player a2){

        ArrayList<Variants> array = new ArrayList<Variants>();
        array.add(Variants.ROCK);
        array.add(Variants.PAPER);
        array.add(Variants.SCISSORS);
        int x1 = array.indexOf(a1.options);
        int y1 = array.indexOf(a2.options);

        if ((x1 - y1) == 1 || (x1 - y1) == -2)
            return a1.name + win;

        else if (x1 == y1)
            return draw;
        else
            return a2.name + win;
    }
    public Player(String name, Variants variants){
        this.name = name;
        this.options = options;

    }
    public Player(){
        this.name = "Бот";
        this.options = randomVariant();
    }
    private Variants randomVariant(){
        int a = (int) (Math.random() * b);
        if (a == 0)
            return Variants.ROCK;
        else if (a == 1)
            return Variants.PAPER;
        else
            return Variants.SCISSORS;
    }


}
