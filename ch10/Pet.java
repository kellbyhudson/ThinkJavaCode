public class Pet
{
    private String name;
    private int age;
    private final String animal;

    public Pet(String name, int age, String animal)
    {
        this.name = name;
        this.age = age;
        this.animal = animal;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getAnimal()
    {
        return animal;
    }

    public void incrementAge()
    {
        this.age++;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
