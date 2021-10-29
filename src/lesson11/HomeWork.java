package lesson11;

public class HomeWork {

    public static void main(String[] args) {


        System.out.println(getFactorialByNumber(7));
    }


    //factorial

    private static int getFactorialByNumber(int order) {
        if (order == 0) {
            return 1;
        }


        return (order * getFactorialByNumber(order-1));

    }


}
