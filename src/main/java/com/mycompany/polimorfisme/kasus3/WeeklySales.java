package com.mycompany.polimorfisme.kasus3;

import java.util.Scanner;

/*
 * WeeklySales.java
 * 
 * Sorts the sales staff in descending order by sales.
 */

public class WeeklySales {
    public static void main(String[] args) {
        Salesperson[] salesStaff;
        int size;

        // salesStaff[0] = new Salesperson("Jane", "Jones", 3000);
        // salesStaff[1] = new Salesperson("Daffy", "Duck", 4935);
        // salesStaff[2] = new Salesperson("James", "Jones", 3000);
        // salesStaff[3] = new Salesperson("Dick", "Walter", 2800);
        // salesStaff[4] = new Salesperson("Don", "Trump", 1570);
        // salesStaff[5] = new Salesperson("Jane", "Black", 3000);
        // salesStaff[6] = new Salesperson("Harry", "Taylor", 7300);
        // salesStaff[7] = new Salesperson("Andy", "Adams", 5000);
        // salesStaff[8] = new Salesperson("Jim", "Doe", 2850);
        // salesStaff[9] = new Salesperson("Walt", "Smith", 3000);

        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many staffs do you want to add? : ");
        size = scan.nextInt();
        salesStaff = new Salesperson[size];

        String firstName, lastName;
        int totalSales;

        for (int i = 0; i < size; i++) {
            System.out.println("\nSales staff " + (i + 1));
            System.out.print("First name: ");
            firstName = scan.next();
            System.out.print("Last name: ");
            lastName = scan.next();
            System.out.print("Total sales: ");
            totalSales = scan.nextInt();

            salesStaff[i] = new Salesperson(firstName, lastName, totalSales);
        }

        Sorting.insertionSort((Comparable[]) salesStaff);

        System.out.println("\nRanking of Sales for the Week\n");

        for (Salesperson s : salesStaff)
            System.out.println(s);
    }
}
