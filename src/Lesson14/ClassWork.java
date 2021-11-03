package Lesson14;

import Lesson10.HomeWork.Car;
import Lesson10.HomeWork.Manufacturer;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ClassWork {
    public static void main(String[] args) {

        Integer intWrapper = Integer.valueOf(3);
        intWrapper = null;
        Long longWrapper = Long.valueOf(3l);
        Character characterWrapper = Character.valueOf('c');
        Boolean booleanWrapper = Boolean.valueOf(false);
        BigDecimal myBigDecimal = new BigDecimal("99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
        myBigDecimal.add(new BigDecimal(1));
        BigDecimal summ = myBigDecimal.add(new BigDecimal(1));

        Map<Integer, String> map = new HashMap(4);
        map.put(1, "2");
        map.put(2, "2");
        map.put(3, "3");
        Set<Integer> keySet = map.keySet();
        Collection<String> values = map.values();

        Car car1 = new Car(Manufacturer.BMW);
        Car car2 = new Car(Manufacturer.HONDA);
        Car car3 = new Car(Manufacturer.MERCEDES);
        Car car4 = new Car(Manufacturer.TOYOTA);
        Map<Manufacturer, Car> carsMap = new HashMap<>(4);
        carsMap.put(car1.getManufacturer(), car1);
        carsMap.put(car2.getManufacturer(), car2);
        carsMap.put(car3.getManufacturer(), car3);



        Set<Map.Entry<Manufacturer, Car>> entries = carsMap.entrySet();
        for (Map.Entry<Manufacturer, Car> entry : entries) {
            Manufacturer key = entry.getKey();
            Car value = entry.getValue();
            System.out.println("Entry - key: " + entry.getKey());
            System.out.println("Entry - value: " + entry.getValue());
        }
    }
}
