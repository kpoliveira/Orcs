package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int presas = 10;
        while (presas != 0){
            presas--;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    grito();
                }
            }).start();
        }
    }

    public static void grito(){
        int controladorOrcs;
        Random rand = new Random();
        controladorOrcs = rand.nextInt((2 - 1) + 1) + 1;
        try {
            Thread.sleep((long)(Math.random()*500));

            if (controladorOrcs == 1){
                mordeOrc1(controladorOrcs);
            }else{
                mordeOrc2(controladorOrcs);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void mordeOrc1(int orc) throws InterruptedException {
        Thread.sleep((long)(Math.random()*500));
        Random rand = new Random();
        int mordeOrc = rand.nextInt((2 - 1) + 1) + 1;

        if (orc == mordeOrc){
            System.out.println("O orc de número " + orc + " foi o primeiro a gritar e o primeiro a morder");
        }else{
            System.out.println("O orc de número " + orc + " foi o primeiro a gritar mas não foi o primeiro a morder");
        }
    }

    public static void mordeOrc2(int orc) throws InterruptedException {
        Thread.sleep((long)(Math.random()*500));
        Random rand = new Random();
        int mordeOrc = rand.nextInt((2 - 1) + 1) + 1;

        if (orc == mordeOrc){
            System.out.println("O orc de número " + orc + " foi o primeiro a gritar e o primeiro a morder");
        }else{
            System.out.println("O orc de número " + orc + " foi o primeiro a gritar mas não foi o primeiro a morder");
        }
    }

}
