public class ParkingSpot implements ISpot {
    int spotId;
    SpotType spotType;
    Vehicle currVehicle;

    ParkingSpot(int spotId, SpotType spotType) {
        this.spotId = spotId;
        this.spotType = spotType;
    }

    public boolean isFree() {
        return this.currVehicle == null;
    }

    public void assignVehicle(Vehicle vehicle) {
        if(isFree()) {
            this.currVehicle = vehicle;
        }
        else {
            System.out.println("Spot is already occupied");
        }
    }

    public void removeVehicle() {
        if(!isFree()) {
            this.currVehicle = null;
        }
        else {
            System.out.println("Spot is already empty");
        }
    }

    public Vehicle getCurrVehicle() {
        return this.currVehicle;
    }

    public SpotType getSpotType() {
        return this.spotType;
    }
    
    @Override
    public boolean isChargingPoint() {
        return false; // Regular parking spots are not charging points
    }
}
