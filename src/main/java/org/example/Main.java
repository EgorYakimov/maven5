package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long expected = 150;
        long actual = service.calculate(5000, true);
        System.out.println("1. " + expected + " == ? == " + actual);

        expected = 50;
        actual = service.calculate(5000, true);
        System.out.println("2. " + expected + " == ? == " + actual);
    }
}