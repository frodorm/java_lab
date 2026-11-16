public class Main {
    public static void main(String[] args) {

        Vehicle Car = new Car(5, "Camry", "Toyota", 2020, 200, "Бенз");
        Vehicle Motorcycle = new Motorcycle(false, "R1", "Yamaha", 2021, 180, "Бенз");
        Vehicle Truck = new Truck(20.0, "FH", "Volvo", 2019, 400, "ДТ");

        Vehicle[] vehicles = { Car, Motorcycle, Truck };

        for (Vehicle vehicle : vehicles) {
            vehicle.move();

            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                car.openTrunk();
            } else if (vehicle instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                motorcycle.doWheelie();
            } else if (vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                truck.loadCargo(15.0);
            }
        }

        Vehicle Lada = new Vehicle("Гранта", "Лада", 2024, 80, "Бензин") {
            @Override
            public void move() {
                System.out.println("Загадочная тачка");
            }
        };
        Lada.getInfo();
        Lada.move();

        // Vehicle Tachka = new Motorcycle("R1","Yamaha",2021,180,"Бенз",false);
        // Car Lada = (Car) Tachka;
        // Правильно — через instanceof:
        // if (Tachka instanceof Car) { Car Lada = (Car) Tachka; }
    }
}