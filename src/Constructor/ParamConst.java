package Constructor;

public class ParamConst {

    String name;
    int eyes;
    int hands;
    int legs;
    int nose;

    ParamConst(String name,int eyes,int hands,int legs, int nose)
    {
        this.name = name;
        this.eyes=eyes;
        this.hands=hands;
        this.legs=legs;
        this.nose=nose;
    }

    ParamConst(String name,int eyes,int hands,int legs)
    {
        this.name = name;
        this.eyes=eyes;
        this.hands=hands;
        this.legs=legs;
    }

    ParamConst(String name)
    {
        this.name=name;
    }

    public static void main(String[] args) {

        ParamConst obj = new ParamConst("Java",2,2,2,1);
        System.out.println(obj.name); //Java
        ParamConst obj1 = new ParamConst("Naveen",2,2,2);
        System.out.println(obj1.name); //Naveen
        ParamConst obj2 = new ParamConst("Program");


        System.out.println(obj.name); //Java -- Program
        System.out.println(obj1.name); //Java -- Program
        System.out.println(obj2.name); //Java -- program
    }
}
