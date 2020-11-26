public class tDog {
    public static void main(String[] args)
    {
        Dog d1 = new Dog ("Bark",2);
        Dog d2 = new Dog ("Henderson",7);
        Dog d3 = new Dog ("Good boy", 10);
        d3.setAge(1);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println();

        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
