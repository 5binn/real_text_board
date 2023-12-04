package org.example;

import java.util.Scanner;

public class Container {
    static private Scanner sc;

    public static void init () {
        sc = new Scanner(System.in);
    }

    public static void close () {
        sc.close();
    }

    public static Scanner getSc () {
        return sc;
    }
}
