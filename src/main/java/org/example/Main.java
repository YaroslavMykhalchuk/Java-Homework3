package org.example;

import Task1.Builder;
import Task1.Human;
import Task1.Pilot;
import Task1.Sailor;
import Task2.Animal;
import Task2.Crocodile;
import Task2.Kangaroo;
import Task2.Tiger;
import Task2Homework.AreaCalculator;
import Task3.Money;
import Task3.Product;
import Task3Homework.MathOperations;
import Task4.Car;
import Task4.Kettle;
import Task4.Microwave;
import Task4.Steambot;
import Task5.Cello;
import Task5.Trombone;
import Task5.Ukulele;
import Task5.Violin;
import Task5Homework.ForeignPassport;
import Task5Homework.Passport;
import Task6.Array;
import Task7Homework.*;

public class Main {
    public static void main(String[] args) {

        //Classwork task1 and Homework task1
//        Human human1 = new Human("Yaroslav", 25, "man");
//        Human human2 = new Human("Ivan", 25, "man");
//        Human human3 = new Human("Olena", 25, "woman");
//
//        Builder builder = new Builder("Olga", 25, "woman", "Trainee");
//        builder.displayInfo();
//
//        Sailor sailor = new Sailor("Igor", 25, "man", "Cargo");
//        sailor.displayInfo();
//
//        Pilot pilot = new Pilot("Sergiy", 25, "man", "Scout");
//        pilot.displayInfo();
//
//        System.out.println("\nTotal humans: " + Human.getCount() + "\n");

        //Classwork task2
//        Animal animal = new Animal();
//        animal.displayInfo();
//
//        Tiger tiger = new Tiger("Tygrulya", 10, "Grrrr", "Albinos");
//        tiger.displayInfo();
//
//        Crocodile crocodile = new Crocodile("Croco", 12, "Omnom-nom", "Vegetarian");
//        crocodile.displayInfo();
//
//        Kangaroo kangaroo = new Kangaroo("Jumper", 3, "Tygydyk-tygydyk", 67);
//        kangaroo.displayInfo();

        //Classwork task3
//        Product phone = new Product("Xiaomi Redmi 10 Pro", new Money(9999, 0));
//        phone.display();

        //Classwork task4
//        Kettle kettle = new Kettle("Чайник", "Ним кип'ятять воду");
//        kettle.show();
//        kettle.desc();
//        kettle.sound();
//
//        Microwave microwave = new Microwave("Мікрохвильовка", "Нею гріють їжу");
//        microwave.show();
//        microwave.desc();
//        microwave.sound();
//
//        Car car = new Car("Машина", "На ній катаються");
//        car.show();
//        car.desc();
//        car.sound();
//
//        Steambot steambot = new Steambot("Човен", "На ньому пересуваються по воді");
//        steambot.show();
//        steambot.desc();
//        steambot.sound();

        //Classwork task5
//        Violin violin = new Violin("Скрипка", "На ній грають");
//        violin.show();
//        violin.desc();
//        violin.sound();
//        violin.history();
//
//        Trombone trombone = new Trombone("Тромбон", "На ній грають");
//        trombone.show();
//        trombone.desc();
//        trombone.sound();
//        trombone.history();
//
//        Ukulele ukulele = new Ukulele("Укулеле", "На ній грають");
//        ukulele.show();
//        ukulele.desc();
//        ukulele.sound();
//        ukulele.history();
//
//        Cello cello = new Cello("Віолончель", "На ній грають");
//        cello.show();
//        cello.desc();
//        cello.sound();
//        cello.history();

        //Classwork task6 and task7 and Homework task8
//        int[] nums = {5, 3, 7, 6, 2, 8};
//        Array myArray = new Array(nums);
//
//        System.out.println("Max: " + myArray.Max());
//        System.out.println("Min: " + myArray.Min());
//        System.out.println("Avg: " + myArray.Avg());
//
//        myArray.SortAsc();
//        System.out.println("Asc: ");
//        myArray.display();
//
//        myArray.SortDesc();
//        System.out.println("Desc: ");
//        myArray.display();
//
//        myArray.Print();
//        myArray.Print("Елементи масиву:");

        //Homework task2
//        System.out.println("Area triangle: " + AreaCalculator.triangleArea(3, 4, 5));
//        System.out.println("Area rectangle: " + AreaCalculator.rectangleArea(5, 7));
//        System.out.println("Area square: " + AreaCalculator.squareArea(4));
//        System.out.println("Area rhombus: " + AreaCalculator.rhombusArea(5, 6));
//        System.out.println("Total number of area calculations: " + AreaCalculator.getCalculationCount());

        //Homework task3
//        System.out.println("Max of 4, 1, 7, 3: " + MathOperations.max(4, 1, 7, 3));
//        System.out.println("Min of 4, 1, 7, 3: " + MathOperations.min(4, 1, 7, 3));
//        System.out.println("Average of 4, 1, 7, 3: " + MathOperations.avg(4, 1, 7, 3));
//        System.out.println("Factorial 5: " + MathOperations.factorial(5));

        //Homework task5
//        Passport domesticPassport = new Passport("John", "Doe", "AB123456");
//        ForeignPassport foreignPassport = new ForeignPassport("John", "Doe", "AB123456", "FD654321", "Schengen, USA");
//
//        domesticPassport.display();
//        System.out.println("--------------------------------");
//        foreignPassport.display();

        //Homework task7
        Figure[] figures = new Figure[4];
        figures[0] = new Rectangle(5, 10);
        figures[1] = new Circle(4);
        figures[2] = new RightTriangle(3, 4);
        figures[3] = new Trapezoid(3, 4, 5);

        for (Figure figure : figures) {
            System.out.println("Area of figure: " + figure.area());
        }
    }
}