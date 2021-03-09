public class Main {
    public static void main(String[] args) {
        Pet Bella = new Pet();

        Bella.name = "Bella. ";
        Bella.spieces = "a cat. ";
        Bella.gender = "female. ";
        Bella.color = "white. ";
        Bella.weight = 30f;
        Bella.setAge(4);
        System.out.println(Bella.introducePet());

        Pet John = new Pet();

        John.name = "John. ";
        John.spieces = "a dog. ";
        John.gender = "male. ";
        John.color = "brown. ";
        John.weight = 20f;
        John.setAge(2);
        System.out.println(John.introducePet());

    }
}
