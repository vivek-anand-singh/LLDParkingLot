public interface ISpot {
    boolean isFree();
    void assignVehicle(Vehicle vehicle);
    void removeVehicle();
    Vehicle getCurrVehicle();
    SpotType getSpotType();
    boolean isChargingPoint();
}