public abstract class Pet {
    //Attributes
    private String name;
    private int age;
    private String colour;
    private String size;
    private String breed;


    //Parameterised Constructor
    public Pet(String name, int age, String colour, String size, String breed) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.size = size;
        this.breed = breed;
    }

    //Default Constructor
    public Pet(){
        name = "no name";
        age = 0;
        colour = "no colour";
        size = "no size";
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    //Methods
    public void getOlder(){
        age++;
    }

    public void eat(){
        System.out.println("Nom nom nom!");
    }

    public void sleep(){
        System.out.println("Zzzzzzzz!");
    }
}
