package com.mycompany.polimorfisme.kasus3;

/*
 * Salesperson.java
 * 
 * Represents a sales person who has a first name, last
 * name, and total number of sales.
 */

public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    /*
     * Construtor: Sets up the sales person object with
     *             the given data.
     */
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    /*
     * Returns the sales person as a string.
     */
    public String toString() {
        return lastName + ", " + firstName + ": " + totalSales;
    }

    /*
     * Returns true if the sales people have
     * the same name.
     */
    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName()) && firstName.equals(((Salesperson) other).getFirstName()));
    }

    /*
     * Order is based on total sales with the name
     * (last, then first) breaking a tie.
     */
    @Override
    public int compareTo(Object other) {
        int result;

        if (totalSales < ((Salesperson) other).getSales()) {
            result = -1;
        } else if (totalSales > ((Salesperson) other).getSales()) {
            result = 1;
        } else {
            // result = 0;
            result = firstName.compareTo(((Salesperson) other).getFirstName());
            if (result == 0) {
                result = lastName.compareTo(((Salesperson) other).getLastName());
            }
        }

        return result;
    }

    /*
     * First name accessor.
     */
    public String getFirstName() {
        return firstName;
    }

    /*
     * Last name accessor.
     */
    public String getLastName() {
        return lastName;
    }

    /*
     * Total sales accessor.
     */
    public int getSales() {
        return totalSales;
    }
}
