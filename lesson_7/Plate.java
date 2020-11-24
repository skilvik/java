package ru.geekbrains.java23102020.lesson_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("В тарелке " + food + " еды");
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {
        this.food -= amount;
    }

    public void increaseFood(int amount) {
        System.out.println("Мяу!");
        this.food += 100;
    }

}
