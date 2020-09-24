package lab1Classes;

//Клиент — содержит персональные данные клиента.
public class Client extends Human {
    private String clientId;
    private int balance;
    private Car car;

    public Client(String name, String surname, String phoneNumber, String email, String clientId, int balance, Car car) {
        super(name, surname, phoneNumber, email);
        this.clientId = clientId;
        this.balance = balance;
        this.car = car;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


}
