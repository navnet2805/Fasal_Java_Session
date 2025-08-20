package DecisitionStatment;

public class SwitchSyntax01 {

    public static void main(String[] args) {

        int day = 9;
        switch (day)
        {
            case 1 :
                System.out.println("Sunday");
                break;
            case 2 :
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4 :
                System.out.println("wed");
                break;
            case 5 :
                System.out.println("thursday");
                break;
            case 6 :
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("none of the case value is matched");
        }
    }
}
