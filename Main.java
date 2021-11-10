package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Scanner menu = new Scanner(System.in);
        Scanner ticket = new Scanner(System.in);
        String forename = null;
        String surname = null;
        String add1 = null;
        String add2 = null;
        String city = null;
        String postcode = null;
        int choice;
        int ticketchoice = 0;
        int ticketquan = 0;
        final double economy = 500.00;
        final double FC = 1000.00;


        System.out.print("Welcome to Airline Reservation System");

        System.out.println(System.lineSeparator());

        System.out.print("1. Customer Details " + "\n");
        System.out.print("2. Ticket " + "\n");
        System.out.print("3. Receipt " + "\n");

        choice = menu.nextInt();

        switch (choice) {
            case 1:

                System.out.print("Please enter your customer details in;" + "\n");

                System.out.println(System.lineSeparator());

                System.out.println("Forename");
                forename = myObj.nextLine();
                System.out.println("Surname");
                surname = myObj.nextLine();
                System.out.println("Address 1");
                add1 = myObj.nextLine();
                System.out.println("Address 2");
                add2 = myObj.nextLine();
                System.out.println("City");
                city = myObj.nextLine();
                System.out.println("Postcode");
                postcode = myObj.nextLine();

            case 2:

                System.out.print("Press 1 for Economy and 2 for First Class");
                ticketchoice = ticket.nextInt();

                if (ticketchoice == 1) {

                    System.out.print("How many tickets do you require?");
                    ticketquan = ticket.nextInt();


                } else if (ticketchoice == 2) {

                    System.out.print("How many tickets do you require?");
                    ticketquan = ticket.nextInt();

                }

            case 3:

                System.out.print("_______________________Receipt_______________________");

                System.out.println(System.lineSeparator());

                System.out.print("Customer Details");
                System.out.println(System.lineSeparator());


                System.out.print("Forename " + forename + "\n");
                System.out.print("Surname " + surname + "\n");
                System.out.print("Address 1 " + add1 + "\n");
                System.out.print("Address 2 " + add2 + "\n");
                System.out.print("City " + city + "\n");
                System.out.print("Postcode " + postcode + "\n");

                System.out.print("_______________________Ticket Details_______________________");

                System.out.println(System.lineSeparator());

                if (ticketchoice == 1) {
                    System.out.print("Your total price is: £" + ticketquan * economy);
                } else if (ticketchoice == 2) {
                    System.out.print("Your total price is: £" + ticketquan * FC);
                }

            default:
                System.out.print("Please select a number between 1-3");

        }

    }
}






      


