package Continue;

public class ContinueWithLabel {

    public static void main(String[] args) {

        skip:
        for (int i=1; i<=3 ; i++)
        {
            for (int j=1; j<=5 ; j++)
            {
                if (j==3)
                    continue skip;
                System.out.println(j);
            }
        }
    }
}
