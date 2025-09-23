public abstract class Vehicle {
    private String vehicleNum;

    Vehicle(String vehicleNum) {
        this.vehicleNum = vehicleNum;
    }

    public String getVehicleNum(){
        return this.vehicleNum;
    }
}