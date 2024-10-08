package org.example;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        while (true) {
            System.out.println("1. ADD DATA INTO DATABASE ");
            System.out.println("2. FETCHING DATA BY ID ");
            System.out.println("3. UPDATE TRUCK DATA ");
            System.out.println("4. GET ALL TRUCK DATA ");
            System.out.println("5. DELETE TRUCK DATA BY ID ");
            System.out.println("Enter 9 to exit loop");
            System.out.println("-------------------------------------");
            System.out.println("Enter your choice : ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Truck_Service truckService = new Truck_Service();
            Truck truck = new Truck();
            switch (n) {
                case 1:
                    Truck tata = new Truck("TATA", "2013", 1000, "Rajesh");
                    Truck volvo = new Truck("VOLVO", "2015", 1500, "mukesh");
                    Truck eicher = new Truck("EICHER", "2019", 800, "naresh");

                    //ADDING DATA INTO DATABASE
                    System.out.println("Adding data .........");
                    truckService.addTruck(tata);
                    truckService.addTruck(volvo);
                    truckService.addTruck(eicher);

                    System.out.println("---------------------------------------------------");
                    break;
                case 2:
                    //FETCH
                    System.out.println("Fetching data by id........");
                    Truck truck1 = truckService.getTruckById(1);
                    System.out.println("Truck data : " + truck1);

                    System.out.println("---------------------------------------------------");
                    break;
                case 3:
                    //UPDATING TRUCK DATA
                    System.out.println("Updating data .........");
                    truck.setDriver_name("aniket");
                    truckService.updateTruck(truck);
                    System.out.println("Updates truck data : " + truckService.getTruckById(1));

                    System.out.println("---------------------------------------------------");
                    break;
                case 4:

                    //GET ALL TRUCK DATA
                    System.out.println("Fetching all data .........");
                    List<Truck> allTruck = truckService.getAllTruck();
                    System.out.println("all truck in DB ");
                    for (Truck truck2 : allTruck) {
                        System.out.println(truck2);
                    }

                    System.out.println("---------------------------------------------------");
                    break;
                case 5:
                    //DELETE TRUCK DATA
                    System.out.println("Deleting data.........");
                    truckService.deleteTruck(2);
                    System.out.println("data deleted by id : " + 2);

                    System.out.println("---------------------------------------------------");

                    System.out.println("Get all the data .........");
                    allTruck = truckService.getAllTruck();
                    System.out.println("all trucks after all operation : ");
                    System.out.println(allTruck);
                    break;
                case 9:
                    System.exit(9);
                default:
                    System.out.println("Please enter a valid choice 1");

            }


            // Truck_Service truckService = new Truck_Service();


        }




    }
}
