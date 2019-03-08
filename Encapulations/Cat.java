public class Cat extends Animal{
    public Cat() {
        super(4);
        this.setName("Cat");
        this.setNoise("Meow");
    }

    @Override
    public String toString() {
        return "An adorable kitten.";
    }
}
