package lab1Classes;

import java.util.List;

//Мойщик — содержит персональные данные мойщика, а также список вымытых им машин.
public class CarWasher extends Human {
    private String washerID;
    private Client client;
    private Car cars;

    public CarWasher(String name, String surname, String phoneNumber, String email, String washerID, Client client) {
        super(name, surname, phoneNumber, email);
        this.washerID = washerID;
        this.client = client;
        this.cars = client.getCar();
    }

    public CarWasher() {}

    public String getWasherID() {
        return washerID;
    }

    public void setWasherID(String washerID) {
        this.washerID = washerID;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Car getCars() {
        return cars;
    }

    public void setCars(Car cars) {
        this.cars = cars;
    }
}
