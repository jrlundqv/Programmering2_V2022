package no.hiof.jrlundqv.oblig1;

import java.util.Scanner;

public class Moon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvor mye veier du i kg?");
        double weight = scanner.nextDouble();

        System.out.println("Din vekt på månen er ca. " + weight * 0.165 + " kg");
    }
}
