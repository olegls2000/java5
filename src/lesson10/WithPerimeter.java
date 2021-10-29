package lesson10;

//public  interface WithPerimeter extends WithId,WithCode { }

public interface WithPerimeter extends WithId,WithCode {
   // public static final  int AGE = 100;
    int AGE = 100;
    //public int getPerimeter();
    int getPerimeter();


    default void printSmth() {
        System.out.println( "Hello from default" );

    }
}
