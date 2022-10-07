public class Main {
    public static void main(String[] args) {


        Snake s1 = new Snake("Hissi",17,"Grey","Large", true, false,2,"Western Hognose");
        Dog d1 = new Dog("Scoobie",6,"Tan", "Large","Great Dane");

        System.out.println(d1.getName() + " is " + d1.getAge() + " years old!");
        d1.getOlder();
        System.out.println(d1.getName() + " is " + d1.getAge() + " years old!");
        System.out.println(d1.getName() + " is sleeping ");
        d1.sleep();

        System.out.println(s1.getName() + " is " + s1.getAge() + " years old!");
        s1.getOlder();
        System.out.println(s1.getName() + " is " + s1.getAge() + " years old!");
        System.out.println(s1.getName() + " is sleeping ");
        s1.sleep();

    }

}
