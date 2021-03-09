public class MainPet {
    public static void main(String[] args) {
        Pet Sam = new Pet();

        Sam.name = "Sam. ";
        Sam.spieces = "a dog. ";
        Sam.gender = "male. ";
        Sam.color = "black. ";
        Sam.weight = 50f;
        Sam.setAge(5);
                System.out.println(Sam.introducePet());
    }
}
