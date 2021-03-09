public class Pet{
    private int age;
    public String name;
    public String spieces;
    public String gender;
    public String color;
    public float weight;

    public String introducePet(){
    return "I am " + name +
            "I am " + spieces +
            "I am " + gender +
            "I am " + color +
            "I am " + weight + "kg";
    }
    public void setAge(int ageToSet) {age = ageToSet;}
}
