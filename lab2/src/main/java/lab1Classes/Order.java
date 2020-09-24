package lab1Classes;

//Заказ — информация о клиенте, его автомобиле и балансе, а также стоимости мойки
public class Order {
    private String orderId;
    private Client client;
    private Car clientCar;
    private int washPrice;

    public Order(String orderId, Client client, Car car, int washPrice) {
        if (client.getBalance() >= washPrice) {
            this.orderId = orderId;
            this.client = client;
            this.clientCar = client.getCar();
            this.washPrice = washPrice;
            client.setBalance(client.getBalance() - washPrice);
        }
    }
}
