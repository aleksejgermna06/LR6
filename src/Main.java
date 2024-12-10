public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Джили веста");
        Driver driver = new Driver("Alex");
        Dispatcher dispatcher = new Dispatcher(car, driver);
        dispatcher.startTrip();
        System.out.println();
        Vehicle bus = new Bus("Джили гранта");
        Dispatcher dispatcher2 = new Dispatcher(bus, driver);
        dispatcher2.startTrip();
    }
}







// Single Responsibility
// Open/Closed
// Liskov Substitution
// Interface Segregation
// Dependency Inversion