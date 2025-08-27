package Method;

public class m03_Armstrong {
    // Armstrong number:
// A number that equals the sum of its own digits,
// each raised to the power of the total number of digits.
//
// Example: 153
// Digits = 3 → (1*3 + 5*3 + 3*3) = (1 + 125 + 27) = 153 → Armstrong number

    // Step 2: Find how many digits are present in the number
    public static int noOfDigits(int number)
    {
        int digits = 0;
        for (int i = number; i > 0; i = i / 10) {
            digits++;   // Keep counting digits by dividing by 10
        }
        return digits;
    }

    // Step 3: Calculate the sum of each digit raised to 'digits' power
    public static int calcArmstrongLogic(int number, int digits)
    {
        int sum = 0;
        for (int i = number; i > 0; i = i / 10) {
            int digit = i % 10;   // Extract last digit (e.g., 153 % 10 = 3)

            int power = 1;
            for (int j = 0; j < digits; j++) {
                power = power * digit;  // Multiply digit by itself 'digits' times
            }
            sum = sum + power;   // Add powered value to sum  finally it should add the sum of all the multiplications
        }
        return sum;
    }

    //Step4
    public static boolean checkArmstrong(int sum, int number)
    {
        boolean isArmstrong = false;

        if (sum==number)
            isArmstrong = true;

        return isArmstrong;
    }

    public static void main(String[] args) {

        // Step 1: Define the number to check
        int number = 153;

        //step2
       int digits = noOfDigits(number);

       //Step3
        int sum = calcArmstrongLogic(number,digits);

        // Step 4: Compare sum with original number
        if (checkArmstrong(sum,number))
            System.out.println(number + " is Armstrong");
        else
            System.out.println(number + " is not Armstrong");
    }
}
