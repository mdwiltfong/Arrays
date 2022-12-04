public abstract class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is picking");
    }

    @Override
    public void breathe() {
        System.out.println("Breath in, breathe out, repeat");
    }
    public abstract void fly();

}
