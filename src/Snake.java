public class Snake extends Pet {
    private Boolean scales = true;
    private Boolean isVenomous;
    private float length;


    public Snake(String name, int age, String colour, String size,
                 Boolean scales, Boolean isVenomous, float length, String breed) {
        super(name, age, colour, size, breed);
        this.scales = scales;
        this.isVenomous = isVenomous;
        this.length = length;
    }

    public void sleep(){
        System.out.println("Sssssssssss!");
    }
}
