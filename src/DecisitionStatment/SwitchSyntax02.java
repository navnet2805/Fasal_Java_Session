package DecisitionStatment;

//Java 14 onwards

public class SwitchSyntax02 {

    public static void main(String[] args) {
        int day = 4;

        String result = switch (day)
        {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "wed";
            case 5 -> "thursday";
            case 6 -> "friday";
            case 7 -> "saturday";
            default -> "none of the case value is matched";
        };

        System.out.println(result);
    }
}
