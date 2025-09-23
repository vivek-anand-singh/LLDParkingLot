import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    int floorNum;
    List <ParkingSpot> parkingSpots;

    ParkingFloor(int floorNum, List <ParkingSpot> parkingSpots) {
        this.floorNum = floorNum;
        this.parkingSpots = parkingSpots;
    }

    public List<ParkingSpot> getParkingSpots() {
        return new ArrayList<>(this.parkingSpots);
    }
}
