class Bus extends Vehicle {

    public Bus(String name) {
        super(name);
    }

    @Override
    public void startEngine() {
        System.out.println(name + ": Starting bus engine.");
    }

    @Override
    public void stopEngine() {
        System.out.println(name + ": Stopping bus engine.");
    }
}