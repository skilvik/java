package ru.geekbrains.java23102020.lesson_7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Мурзик", 50, false);
        cats[1] = new Cat("Васька", 30, false);
        cats[2] = new Cat("Леон", 70, false);
        Plate plate = new Plate(100);



        plate.info();
        for (int i = 0; i < cats.length; i++) {
            if (cats[i].satiety == false && cats[i].appetite <= plate.getFood()){
                cats[i].eat(plate);
                cats[i].satiety = true;
            } else plate.increaseFood(100);
            System.out.println(cats[i].name + " поел!");
        }

        plate.info();

    }
}
