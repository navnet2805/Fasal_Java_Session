package ExceptionHandling;

public class handling_P02 {
    public static void main(String[] args) {
        int num = 0;

            System.out.println("statement1");
            System.out.println("statement2");
            System.out.println("statement3");
            System.out.println("statement4");
        try {
            System.out.println(10 / num); // execute and throw an exception
        } catch (Exception e) {
            System.out.println("This line will be executed whenever exception is occured and caught");
            System.out.println(e.getMessage()); //handling ---> i want to see the message
        }
            System.out.println("statement5");
            System.out.println("statement6");
            System.out.println("statement7");
            System.out.println("statement8");
    }
}
