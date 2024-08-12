package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short manheight) {
        return (manheight - 100) * 1.15;
    }

    public static double womanWeight(short womanheight) {
        return (womanheight - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manheight = 187;
        double man = Fit.manWeight(manheight);
        System.out.println("Man 187 cm is " + man + " kg");

        short womanheight = 170;
        double woman = Fit.womanWeight(womanheight);
        System.out.println("Woman 170 cm is " + woman + " kg");
    }
}
