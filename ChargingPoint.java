public class ChargingPoint implements ISpot {
    ISpot spot;
    
    ChargingPoint(ISpot spot) {
        this.spot = spot;
    }

    @Override
    public boolean isFree() {
        return this.spot.isFree();
    }

    @Override
    public void assignVehicle(Vehicle vehicle) {
        this.spot.assignVehicle(vehicle);
    }

    @Override
    public void removeVehicle() {
        this.spot.removeVehicle();
    }

    @Override
    public Vehicle getCurrVehicle() {
        return this.spot.getCurrVehicle();
    }

    @Override
    public SpotType getSpotType() {
        return this.spot.getSpotType();
    }

    @Override
    public boolean isChargingPoint() {
        return true; // Charging points always return true
    }
}
