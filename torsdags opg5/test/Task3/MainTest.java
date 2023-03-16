package Task3;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void countLampsInBuilding() {
        Room room1 = new Room(1, 1, 1);
        Room room2 = new Room(2, 2, 2);
        Room room3 = new Room(3, 3, 3);


        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        Building building = new Building(rooms, 4, 5, true);

        assertEquals(2,Main.countLampsInBuilding(building));
    }

    @org.junit.jupiter.api.Test
    void isNormal() {
        boolean isNormal;
        Room room1 = new Room(1, 1, 1);
        Room room2 = new Room(2, 2, 2);
        Room room3 = new Room(3, 3, 3);


        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building = new Building(rooms, 4, 5, true);

        assertEquals(false,Main.isNormal(building));
    }
}