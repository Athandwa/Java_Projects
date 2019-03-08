public class Centipede  extends Animal{
    public Centipede() {

        super(100);
        this.setName("Centipede");
    }

    @Override
    public String getNoise() {
        return "Centipede don't make noise";
    }
}
