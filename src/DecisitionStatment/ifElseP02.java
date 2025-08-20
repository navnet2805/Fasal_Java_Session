package DecisitionStatment;

public class ifElseP02 {

    public static void main(String[] args) {
       //statement
        String statement1 = "I want to take a session";
        String statement2 = "I want to travel";

        for (int i=1 ; i<=2 ; i++) //only 1 time it will iterate
        {
            if (i==1)
            {
                System.out.println(statement1);
            }
            else
            {
                System.out.println(statement2);
            }
            System.out.println("statement3");

        } // end of for loop
        System.out.println("statement 4");

    } // end of main
}
