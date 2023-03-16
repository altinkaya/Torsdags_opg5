package opg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    public ArrayList<String> coffemenu=new ArrayList<>();
    public void loadMenuData() {

        File file = new File("coffees.txt");
        Scanner scan;
            try {
                scan = new Scanner(file);
                while (scan.hasNextLine()) {
                    coffemenu.add(scan.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("The file was not found");

            }


    }
}



