package com.company;

import com.company.firsttask.*;
import com.company.fourthtask.TwoNumbers;
import com.company.secondtask.Game;
import com.company.thirdtask.ExtendedClass;
import com.company.secondtask.DiceGame;
import com.company.fourthtask.TwoNumbersImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. voice\n" +
                "2. Игра в кости\n" +
                "3. ExtendedClass\n" +
                "4. Задание по варианту");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                //1 задание
                Voice cat = new Cat();
                Voice dog = new Dog();
                Voice cow = new Cow();
                cat.voice();
                dog.voice();
                cow.voice();
                break;
            case 2:
                //2 задание
                System.out.println("Введите N игроков и K кубиков через пробел:");
                int N = sc.nextInt();
                int K = sc.nextInt();
                Game diceGame = new DiceGame(N,K);
                diceGame.game();
                break;
            case 3:
                // 3 задание
                ExtendedClass a = new ExtendedClass();
                System.out.println(a);
                ExtendedClass b = new ExtendedClass((byte) 4, 3, 2, "1");
                System.out.println(a.equals(b));
                System.out.println(a.hashCode());
                System.out.println(b.hashCode());
                break;
            case 4:
                //4 задание
                TwoNumbers twoNumbers = new TwoNumbersImpl();
                twoNumbers.setX(-5);
                twoNumbers.setY(5);
                twoNumbers.getDifference();
                break;
            default:
                break;
        }

    }
}
