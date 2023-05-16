package com.company.ATM_Machine;

import java.util.Scanner;

class ATM {
    private float balance;
    private final int PIN = 2001;

    public void checkPin() {
        System.out.print("Enter your PIN: ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if (enteredPin == PIN) {
            menu();
        } else {
            System.out.println("Enter a valid PIN");
            checkPin();
        }
    }

    public void menu() {
        System.out.println("Enter your choice: ");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                checkBalance();
                break;
            case 2:
                withdrawMoney();
                break;
            case 3:
                depositMoney();
                break;
            case 4:
                return;
            default:
                System.out.println("Enter a Valid Choice");
                menu();
                break;
        }
    }

    public void checkBalance() {
        System.out.println("Your Balance: " + balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.print("Enter Amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Money Withdrawal Successful");
            System.out.println("Your Balance is " + balance);
        }
        menu();
    }

    public void depositMoney() {
        System.out.print("Enter the Amount to Deposit: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance += amount;
        System.out.println("Money Deposited Successfully");
        System.out.println("Your Balance is " + balance);
        menu();
    }
}

public class ATM_MACHINIE {
    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkPin();
    }
}
