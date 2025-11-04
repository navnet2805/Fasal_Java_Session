package Stringd;

public class ForEach {

    public static void main(String[] args) {
        String s = "JavaProgramming";
        char[] a =s.toCharArray(); //{'j','a','v','a',.....'g'}
        int y = 5;

        System.out.println(s.length()); //in String , length is a method
        System.out.println(a.length);// in array, length is a variable

        for (int i=0 ; i<a.length ; i++) //using array
        {
            System.out.println(a[i]);
        }

        for (int j=0 ; j<s.length() ; j++) // for string
        {
            System.out.println(s.charAt(j));
        }

        for(char z : a )//{'j','a','v','a',.....'g'}
        {
            System.out.println(z);
        }

    }
}
