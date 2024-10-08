public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> startEngine");
    }
    protected void runEngine(){ // only subclasses can access this
        System.out.println("Car -> runEngine");
    }

    public void drive(){
        System.out.println("Car -> driving, type is "+ getClass().getSimpleName()); //printing runtime type
        startEngine();
    }
}

class GasPoweredCar extends Car{
    private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPoweredCar(String description) { //alt + insert
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    //now override the methods
    //ctr + O
    @Override
    public void startEngine() {
        System.out.printf("Gas all %d cylinders are fired up! Ready!%n",cylinders);

    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas usage exceeds the average: %.2f %n",avgKmPerLiter);
    }
}

class ElectricCar extends Car{ //Ctr + r
    private double avgKmPerCharge;
    private int batterySize = 6;

    public ElectricCar(String description) { //alt + insert
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    //now override the methods
    //ctr + O
    @Override
    public void startEngine() {
        System.out.printf("BEV -> switch %d KWH battery on, Ready!%n", batterySize);

    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under average: %.2f %n", avgKmPerCharge);
    }
}

class HybridCar extends Car{ //select -> edit -> fid -> replace
    private double avgKmPerLiter;
    private int cylinders = 6;
    private int batterySize;

    public HybridCar(String description) { //alt + insert
        super(description);
    }

    public HybridCar(String description, double avgKmPerLiter, int cylinders,
                     int batterySize) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    //now override the methods
    //ctr + O
    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up!.%n",cylinders);
        System.out.printf("Hybrid -> switch %d KWH battery on, Ready!%n", batterySize);


    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average: %.2f %n",avgKmPerLiter);

    }
}