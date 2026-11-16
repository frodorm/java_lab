public abstract class Vehicle {
    private String model;
    private String brand;
    private int year;
    private Engine engine;

    public Vehicle(String model, String brand, int year, int power, String type) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.engine = new Engine(power, type);
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public Engine getEngine() {
        return engine;
    }

    public final void getInfo() {
        System.out.println(brand + " " + model + " " + year + " " + engine.getType());
    } // файнал запрещает переопределять метод в наследниках, если объявить класс файнал тогда от него нельзя наследоваться

    public abstract void move();

    public class Engine {
        private String type;
        private int power;

        public Engine(int power, String type) {
            this.type = type;
            this.power = power;
        }

        public String getType() {
            return type;
        }

        public int getPower() {
            return power;
        }
    }
}
