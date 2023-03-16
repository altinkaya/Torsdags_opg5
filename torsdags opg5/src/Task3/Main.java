package Task3;

import java.util.ArrayList;

public class Main {

    public static int countLampsInBuilding(Building building) {
        int sum = 0;
        for (Room r : building.getRooms()) {
            sum += r.getNumberOfLamps();

        }
        return sum;


    }

    public static boolean isNormal(Building building) {
        if (building.getNumberOfFloors() > building.getRooms().size()) {

            return true;

        }
        else{
            System.out.println("this is an odd building");
        }
        return false;
    }

    public static void main(String[] args) {

        Room room1 = new Room(1, 1, 1);
        Room room2 = new Room(2, 2, 2);
        Room room3 = new Room(3, 3, 3);


        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building1 = new Building(rooms, 4, 5, true);

    }

}
