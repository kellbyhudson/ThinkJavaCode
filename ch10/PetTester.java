public class PetTester
{
    public static void main(String[] args)
    {
        Pet pet1 = new Pet("Rocky" , 4, "dog");

        System.out.println(pet1.getName() + " age of " + pet1.getAge() + " " + pet1.getAnimal());

        Pet pet2 = new Pet("Benji" , 2, "dog");
        pet2.setName("BingBong");
        pet2.incrementAge();

        System.out.println(pet2.getName() + " age of " + pet2.getAge() + " " + pet2.getAnimal());

        Pet[] pets = new Pet[3];
        pets[0] = new Pet("Inky", 2, "Smurf");
        pets[1] = new Pet("Blinky", 5, "Aardvark");
        pets[2] = new Pet("Clyde", 6, "Narwhal");

        for( Pet pet:pets)
        {
            System.out.println(pet.getName());
        }

    }
}
