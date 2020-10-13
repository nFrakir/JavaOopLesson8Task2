package com.gmail.seliverstova.hanna;

import java.util.ArrayDeque;
import java.util.Deque;

public class App {
    public static void main( String[] args ) {
        Deque<Human> queue = new ArrayDeque<>();
        queue.add(new Human("Volovits"));
        queue.add(new Human("Kutrapalli"));
        queue.add(new Human("Penny"));
        queue.add(new Human("Sheldon"));
        drinkCola(3, queue);
        System.out.println("Was sold 3 cola:");
        System.out.println(queue);

        System.out.println();
        drinkCola(10, queue);
        System.out.println("Was sold 13 cola:");
        System.out.println(queue);
    }

    private static void drinkCola(int cnt, Deque<Human> queue) {
        for (int i = 0; i < cnt; i += 1) {
            Human human = queue.remove();
            queue.add(human);
            queue.add(human);
        }
    }
}
