class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    public void drive(Vehicle vehicle) {
        System.out.println(name + " is driving " + vehicle.getName());
        vehicle.startEngine();
    }

    public String getName() {
        return name;
    }
}