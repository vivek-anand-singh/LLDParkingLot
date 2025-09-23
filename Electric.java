public class Electric extends Vehicle {
    private Vehicle vehicle;

    Electric(String v, Vehicle vehicle) {
        super(v);
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }
}
