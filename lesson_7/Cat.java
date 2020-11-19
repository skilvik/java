package ru.geekbrains.java23102020.lesson_7;

public class Cat {
    public String name;
    public int appetite;
    public boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        System.out.println("Кот ест");
        plate.decreaseFood(this.appetite);
    }

    public int getAppetite() {
        return appetite;
    }
}
