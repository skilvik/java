package ru.geekbrains.java23102020.lesson_6;

public class Animals {
    protected String name;
    protected int run;
    protected int swim;
    protected double jump;

    public Animals(String name, int run, int swim, double jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }
    protected void running(int length) {

        if (run >= length)
            System.out.println(this.name + " пробежит ");
        else
            System.out.println(this.name + " не пробежит ");
    }


    protected void swimming(int length_swim) {

        if (swim >= length_swim)
            System.out.println(this.name + " проплывет ");
        else
            System.out.println(this.name + " не проплывет");
    }

    protected void jumping(double height) {

        if (jump >= height)
            System.out.println(this.name + " перепрыгнет ");
        else
            System.out.println(this.name + " не перепрыгнет");
    }

}
