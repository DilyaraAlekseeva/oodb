package lab1Classes;

import java.util.Comparator;

public class CarWashComparator implements Comparator<CarWash> {

    @Override
    public int compare(CarWash o1, CarWash o2) {
        return o1.getWashName().compareTo(o2.getWashName());
    }
}
