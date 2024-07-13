package Oops;

import java.util.Scanner;

public class Abstraction extends demo {
    
    void withdraw() {
        System.out.println("Enter withdraw amount");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 5 digit Account Number: ");
        int acc = sc.nextInt();
        int balance = 600000;
        System.out.println("Enter Amount to be Withdrawn: ");
        int amt = sc.nextInt();
        balance -= amt;
        System.out.println("Collect your " + amt + " rs./- cash");
    }

    void getBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 5 digit Account Number: ");
        int acc = sc.nextInt();
        System.out.println("Account Balance is: 600000");
    }

    public static void atmMachine() {
        System.out.println("Welcome to Kotak Mahindra ATM Machine");
        System.out.println("Enter your choice: \n1. Withdraw \n2. Get Balance");

        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                new Abstraction().withdraw();
                break;
            case 2:
                new Abstraction().getBalance();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    public static void main(String[] args) {
        atmMachine();
    }
}

abstract class demo {
    abstract void withdraw();
    abstract void getBalance();

    public void display() {
        System.out.println("Display Balance");
    }
}
