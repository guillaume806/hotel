package org.example;

public class Room {

    private int number;
    private boolean status;
    private int bedCount;
    private double tariff;


    public Room(int number, boolean status, int bedCount, double tariff) {
        this.number = number;
        this.status = status;
        this.bedCount = bedCount;
        this.tariff = tariff;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public double getTariff() {
        return tariff;
    }

    public void setTariff(double tariff) {
        this.tariff = tariff;
    }
}


