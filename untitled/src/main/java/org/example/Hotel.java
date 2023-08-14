package org.example;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Client> clients;
    private List<Room> chambres;
    private List<Register> reservations;

    public Hotel() {
        clients = new ArrayList<>();
        chambres = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void addRoom(Room room) {
        chambres.add(room);
    }

    public void addReservation(Register register) {
        reservations.add(register);
    }

}
