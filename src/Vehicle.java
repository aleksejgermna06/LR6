abstract class Vehicle implements Drivable {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public abstract void startEngine();

    public abstract void stopEngine();

    public String getName() {
        return name;
    }
}