package com.company.ATM_Machine;

import java.util.Scanner;

class ATM {

    float Balance;
    int PIN = 2001;

    public void checkPin(){
        System.out.print("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int interedPin = sc.nextInt();
        if(interedPin ==  PIN) {
            menu();
        } else {
            System.out.println("Enter a valid pin");
            checkPin();
        }

    }

    public void menu() {
        System.out.println("Enter your choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
             withdhrawMoney();
        } else if (opt == 3) {
             depositMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter A Valid Choice");
            menu();
        }
    }

    public void checkBalance() {
        System.out.println(" Your Balance: " + Balance);
        menu();
    }

    public void withdhrawMoney() {
        System.out.print("Enter Amount to withdraw: ");
        Scanner sc = new Scanner(System.in);
        Float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Insufficient Balance");
        } else {
            Balance = Balance - amount;
            System.out.println("Money Withdrawal Successfully");
            System.out.println("Your Balance is "+ Balance);
        }
        menu();
    }

    public void depositMoney() {
        System.out.print("Enter the Amount to Deposit: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
        System.out.println("your balanace is " + Balance);
        menu();

    }




}


public class ATM_MACHINIE {


    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkPin();


    }




}
