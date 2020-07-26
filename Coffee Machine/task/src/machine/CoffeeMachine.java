package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static Scanner scanner = new Scanner(System.in);

    private static int water;
    private static int milk;
    private static int coffeeBeans;
    private static int cups;
    private static int money;
    private static boolean on;

    public static void main(String[] args) {
        init();
        while(on) {
            action();
        }
        //canIBrew(howMany());
    }

    private static void action() {
        System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");
        String answer = scanner.next();
        switch (answer) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "remaining":
                state();
                break;
            case "exit":
                on = false;
                break;
        }
    }

    private static void take(){
        System.out.println("I gave you $" + money);
        money = 0;
    }

    private static void fill (){
        System.out.println("Write how many ml of water do you want to add:");
        water += readNumber();
        System.out.println("Write how many ml of milk do you want to add:");
        milk += readNumber();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffeeBeans += readNumber();
        System.out.println("Write how many disposable cups do you want to add:");
        cups += readNumber();
    }

    private static void buy (){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String answer = scanner.next();
        if (cups>0) {
            switch (answer) {
                case "1":
                    if ((water >= 250)) {
                        water -= 250;
                    } else {
                        System.out.println("Sorry, not enough water!");
                        break;
                    }
                    if ((coffeeBeans >= 16)) {
                        coffeeBeans -= 16;
                    } else {
                        System.out.println("Sorry, not enough coffee beans!");
                        break;
                    }
                    ok();
                    money += 4;
                    break;
                case "2":
                    if ((water >= 350)) {
                        water -= 350;
                    } else {
                        System.out.println("Sorry, not enough water!");
                        break;
                    }
                    if ((milk >= 75)) {
                        milk -= 75;
                    } else {
                        System.out.println("Sorry, not enough milk!");
                        break;
                    }
                    if ((coffeeBeans >= 20)) {
                        coffeeBeans -= 20;
                    } else {
                        System.out.println("Sorry, not enough coffee beans!");
                        break;
                    }
                    ok();
                    money += 7;
                    break;
                case "3":
                    if ((water >= 200)) {
                        water -= 200;
                    } else {
                        System.out.println("Sorry, not enough water!");
                        break;
                    }
                    if ((milk >= 100)) {
                        milk -= 100;
                    } else {
                        System.out.println("Sorry, not enough milk!");
                        break;
                    }
                    if ((coffeeBeans >= 12)) {
                        coffeeBeans -= 12;
                    } else {
                        System.out.println("Sorry, not enough coffee beans!");
                        break;
                    }
                    ok();
                    money += 6;
                    break;
                case "back":
            }
        } else {
            System.out.println("Sorry, not enough disposable cups");
        }
    }

    private static void ok() {
        cups -= 1;
        System.out.println("I have enough resources, making you a coffee!");
    }

    private static void init() {
        water = 400;
        milk = 540;
        coffeeBeans = 120;
        cups = 9;
        money = 550;
        on = true;
    }

    private static void brewing () {
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
    }

    private static  int readNumber() {
        return scanner.nextInt();
    }

    private static int[] howMany (){
        int[] answers = new int[4];
        System.out.println("Write how many ml of water the coffee machine has:");
        answers[0] = readNumber();
        System.out.println("Write how many ml of milk the coffee machine has:");
        answers[1] = readNumber();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        answers[2] = readNumber();
        System.out.println("Write how many cups of coffee you will need:");
        answers[3] = readNumber();
        return answers;
    }
    
    private static void canIBrew(int[] answers) {
        int number = Math.min( Math.min( answers[0] / 200, answers[1] / 50 ),
                answers[2] / 15);
        if (number == answers[3]) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (number < answers[3]) {
            System.out.println("No, I can make only "+ number + " cup(s) of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee " +
                    "(and even " + (number - answers[3]) + " more than that)");
        }
    }

    private static void state() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }
}
