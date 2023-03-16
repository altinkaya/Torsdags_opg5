package opg1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        customers.add(new Customer("hans","hansen","hanas"));
        customers.add(new Customer("jens","jensen","jenes"));
        customers.add(new Customer("a3","b3","c3"));
        customers.add(new Customer("a4","b4","c4"));
        customers.add(new Customer("a5","b5","c5"));
        customers.add(new Customer("a6","b6","c6"));

        printCustomers();

        }

    public static void printCustomers(){

        for (Customer c:customers) {

            System.out.println(c);

        }


    }



    public static ArrayList<Customer> customers = new ArrayList<>();

    }
