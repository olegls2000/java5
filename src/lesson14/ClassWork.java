package lesson14;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    }
}
