class Dispatcher {
    private Vehicle vehicle;
    private Driver driver;

    public Dispatcher(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
    }

    public void startTrip() {
        System.out.println("Starting trip with " + vehicle.getName() + " driven by " + driver.getName());
        driver.drive(vehicle);
    }
}