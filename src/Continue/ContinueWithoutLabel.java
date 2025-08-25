package Continue;

public class ContinueWithoutLabel {

    public static void main(String[] args) {

        for (int i =1; i<=10 ; i++)
        {
            if (i==5)
                continue; // skip with 5th iteration || whenever the value is 5 it will skip it.
            System.out.println(i);
        }
    }
}
