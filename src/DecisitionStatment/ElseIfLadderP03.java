package DecisitionStatment;

public class ElseIfLadderP03 {

    public static void main(String[] args) {

        int marks = 32;

        if (marks >= 85)
        {
            System.out.println("Grade A");
        }
        else if (marks >= 60)
        {
            System.out.println("Grade B");
        }
        else if (marks >= 40)
        {
            System.out.println("Grade C");
        }
       else if (marks >= 35)
        {
            System.out.println("Grade F");
        }
       else
            System.out.println("Failed");


        System.out.println("finally promoted");
    }
}
