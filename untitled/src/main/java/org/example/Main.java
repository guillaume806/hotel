package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        Client client1 = new Client(1, "Jaaade", "faf", "0519259");
        Client client2 = new Client(2, "JLeJ", "fafa", "6296295");
        hotel.addClient(client1);
        hotel.addClient(client2);

        Room chambre1 = new Room(101, true, 2, 100.0);
        Room chambre2 = new Room(102, false, 1, 80.0);
        hotel.addRoom(chambre1);
        hotel.addRoom(chambre2);

        List<Room> roomsForReservation = new ArrayList<>();
        roomsForReservation.add(chambre2);
        Register reservation = new Register(1, "Pending", roomsForReservation, client1);
        hotel.addReservation(reservation);

    }
}