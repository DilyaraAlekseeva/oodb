package lab1Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

//Автомойка - содержит информацию о клиентах, сотрудниках и закзах
public class CarWash{
    private String washName;
    private List<Client> clients;
    private List<CarWasher> carWashers;
    private List<Order> orders;

    public CarWash() {}

//    public CarWash(String washName) {
//        this.washName = washName;
//    }

    public String getWashName() {
        return washName;
    }

    public void setWashName(String washName) {
        this.washName = washName;
    }

    public List<Client> getClients() {
        return clients;
    }

    public List<CarWasher> getCarWashers() {
        return carWashers;
    }


    public List<Order> getOrders() {
        return orders;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public void setCarWashers(List<CarWasher> carWashers) {
        this.carWashers = carWashers;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

//    public static void main(String[] args) { проверка сортировки
//        List<CarWash> list = new ArrayList<>();
//        list.add(new CarWash("Grigoriy"));
//        list.add(new CarWash("Aleksey"));
//
//        CarWashComparator comparator = new CarWashComparator();
//        list.sort(comparator);
//
//        for (CarWash i: list) {
//            System.out.println(i.getWashName());
//        }
//    }
}
