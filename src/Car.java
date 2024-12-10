class Car extends Vehicle {

    public Car(String name) {
        super(name);
    }

    @Override
    public void startEngine() {
        System.out.println(name + ": Starting car engine.");
    }

    @Override
    public void stopEngine() {
        System.out.println(name + ": Stopping car engine.");
    }
}