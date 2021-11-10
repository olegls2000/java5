package lesson18;

import model.Slave;

import java.lang.reflect.Method;

public class ClassWork {
    public static void main(String[] args) throws Exception {
        Slave bill = new Slave(20, "Bill");
        Slave joe = new Slave(800, "Joe");

        //joe.someSecretMethod();
        final var clazz = joe.getClass();
        final Class clazz1 = Slave.class;
        System.out.println(clazz.getMethods());
        System.out.println(clazz.getDeclaredMethods());

        Method secretMethod = null;
        for (Method method : clazz.getDeclaredMethods()) {
            final var methodName = method.getName();
            if( methodName.toUpperCase().contains("SECRET") ){
                secretMethod  = method;
            }
        }
        secretMethod.invoke(joe);
        secretMethod.invoke(bill);

    }
}
