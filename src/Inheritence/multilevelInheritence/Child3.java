package Inheritence.multilevelInheritence;

import java.nio.charset.CharacterCodingException;

public class Child3 extends Child2{
    int d = 40;

    public static void main(String[] args) {
        Child3 obj=new Child3();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }
}
