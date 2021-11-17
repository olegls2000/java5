package lesson14;

import lesson10.homework.Car;
import lesson10.homework.Manufacturer;

import java.math.BigDecimal;
import java.util.*;

public class ClassWork {
    public static void main(String[] args) {
        int i = 3;
        //i = null;
        Integer intWrapper = Integer.valueOf(3);
        intWrapper = null;
        Long longWrapper = Long.valueOf(4l);
        longWrapper = Long.valueOf("4");
        longWrapper = Long.MAX_VALUE;
        Character character = Character.valueOf('c');
        Boolean booleanWrapper = Boolean.valueOf("false");
        booleanWrapper = Boolean.TRUE;
        booleanWrapper = null;
        Integer maxInt = Integer.MAX_VALUE;
        BigDecimal myBigDecimal = new BigDecimal("9999999999999999999999999999999999999999999999999999999999999999999999999999999");
        BigDecimal summ = myBigDecimal.add(new BigDecimal("9999999999999999999999999999999999999999999999999999999999999999999999999999999"));
        System.out.println(summ);

        Map<Integer, String> map = new HashMap(4);
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        Set<Integer> keySet = map.keySet();
        Collection<String> values = map.values();
        Car car1 = new Car(Manufacturer.TOYOTA);
        Car car2 = new Car(Manufacturer.BMW);
        Car car3 = new Car(Manufacturer.HONDA);
        Car car4 = new Car(Manufacturer.HONDA);
        Map<Manufacturer, Car> carsMap = new HashMap<>(4);
        carsMap.put(car1.getManufacturer(), car1);
        carsMap.put(car2.getManufacturer(), car2);
        carsMap.put(car3.getManufacturer(), car3);
        carsMap.put(car4.getManufacturer(), car4);

        Collection<Car> values1 = carsMap.values();
        Collection<Manufacturer> keys = carsMap.keySet();
        Collection<Map.Entry<Manufacturer, Car>> entries1 = carsMap.entrySet();

        Car value = carsMap.get(Manufacturer.HONDA);
        boolean isContain = carsMap.containsValue(car3);


        Set<Map.Entry<Manufacturer, Car>> entries = carsMap.entrySet();
        for (Map.Entry<Manufacturer, Car> entry : entries) {
            Manufacturer key = entry.getKey();
            Car value1 = entry.getValue();
            System.out.println("Entry - key: " + entry.getKey());
            System.out.println("Entry - value: " + entry.getValue());
        }

        carsMap.entrySet().stream().forEach(es -> {
            System.out.println("Entry - key: " + es.getKey());
            System.out.println("Entry - value: " + es.getValue());
        });


        Map<Integer, Student> mapStudent = new TreeMap<>();
        Student student1 = new Student(18, "Ivan");
        Student student2 = new Student(21, "Nikolai");
        mapStudent.put(student1.getAge(), student1);
        mapStudent.put(student1.getAge(), student2);
        //Map<Integer, Student> mapStudent = new TreeMap<>();
        //


    }
}
