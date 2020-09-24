import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import lab1Classes.*;
import sun.rmi.runtime.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//JSON – это стандарт транспортировки сообщений/данных от одной программы к другой
public class JsonHW {
    public static void main(String[] args) throws IOException {
        List<CarWash> carWashes = new ArrayList<>();

        CarWash carWash = new CarWash();
        carWash.setWashName("clean car");

        CarWash carWash1 = new CarWash();
        carWash1.setWashName("beep beep");

        List<Client> clients = new ArrayList<Client>();
        List<Client> clients1 = new ArrayList<Client>();

        Client client = new Client("Elen", "Smirnova", "895233134", "el@ya.ru","1",
                20000, new Car("A132YY", "Ford"));
        clients.add(client);

        Client client1 = new Client("Matvey", "Smirnov", "8952492322", "mat@ya.ru","2",
                120000, new Car("B442KY", "KIA"));
        clients.add(client1);

        Client client2 = new Client("Nikita", "Kotov", "8952113112", "kot@ya.ru","3",
                1000, new Car("A431KY", "KIA"));
        clients1.add(client2);

        carWash.setClients(clients);
        carWash1.setClients(clients1);


        List<CarWasher> carWashers = new ArrayList<CarWasher>();
        List<CarWasher> carWashers1 = new ArrayList<CarWasher>();

        CarWasher carWasher = new CarWasher("Aleks", "Voronov", "857698698", "al@ya.ru",
                "1", client);
        carWashers.add(carWasher);

        CarWasher carWasher1 = new CarWasher("Anna", "Simonova", "857698551", "anna@ya.ru",
                "2", client1);
        carWashers.add(carWasher1);

        CarWasher carWasher2 = new CarWasher("Anton", "Kocharov", "850492753", "anton@ya.ru",
                "3", client2);
        carWashers1.add(carWasher2);

        carWash.setCarWashers(carWashers);
        carWash1.setCarWashers(carWashers1);

        List<Order> orders = new ArrayList<Order>();
        List<Order> orders1 = new ArrayList<Order>();
        Order order = new Order("1", client, client.getCar(),1000);
        orders.add(order);
        Order order1 = new Order("2", client1, client1.getCar(),1200);
        orders.add(order1);
        Order order2 = new Order("3", client2, client2.getCar(),1000);
        orders1.add(order2);

        carWash.setOrders(orders);
        carWash1.setOrders(orders1);


        carWashes.add(carWash);
        carWashes.add(carWash1);

        saveClientList(clients);
        loadClientList();

        saveCWList(carWashes);
        loadCWList();
    }

    public static void saveClientList(List<Client> clients) throws IOException {

        if (clients!= null && clients.size() > 0) {
            Gson gson = new Gson();

            String clientsAsJson = gson.toJson(clients);

            System.out.println(clientsAsJson);
            System.out.println("---------------------------------------------");

            try (OutputStream os = new FileOutputStream(new File("C:\\Users\\Dilyara\\Desktop\\oodb\\lab2\\src\\main\\java\\clients.json"))) {
                os.write(clientsAsJson.getBytes("UTF-8"));
                os.flush();
            }
        }
    }

    public static List<Client> loadClientList() throws IOException, JsonSyntaxException {
        String cStr = "";
        File file = new File("C:\\Users\\Dilyara\\Desktop\\oodb\\lab2\\src\\main\\java\\clients.json");

        if (file.exists()) {
            cStr = new String(Files.readAllBytes(file.toPath()));
        } else {
            System.out.println("File not found!");
        }

        Gson gson = new Gson();

        Client [] plst = gson.fromJson(cStr, Client[].class);

        return Arrays.asList(plst);
    }

    public static void saveCWList(List<CarWash> list) throws IOException {

        if (list!= null && list.size() > 0) {
            Gson gson = new Gson();

            String CWasJson = gson.toJson(list);

            System.out.println(CWasJson);
            System.out.println("---------------------------------------------");

            try (OutputStream os = new FileOutputStream(new File("C:\\Users\\Dilyara\\Desktop\\oodb\\lab2\\src\\main\\java\\carwash.json"))) {
                os.write(CWasJson.getBytes("UTF-8"));
                os.flush();
            }
        }
    }

    public static List<CarWash> loadCWList() throws IOException, JsonSyntaxException {
        String cwStr = "";
        File file = new File("C:\\Users\\Dilyara\\Desktop\\oodb\\lab2\\src\\main\\java\\carwash.json");

        if (file.exists()) {
            cwStr = new String(Files.readAllBytes(file.toPath()));
        } else {
            System.out.println("File not found!");
        }

        Gson gson = new Gson();

        CarWash [] cw = gson.fromJson(cwStr, CarWash[].class);

        return Arrays.asList(cw);
    }
}
