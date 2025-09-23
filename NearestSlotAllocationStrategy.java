import java.util.List;

public class NearestSlotAllocationStrategy extends SlotAllocationStrategy {
    @Override
    
    public ISpot getNextFreeSpot(List<ParkingFloor> parkingFloors, SpotType spotType) {
        for(ParkingFloor parkingFloor : parkingFloors) {
            for(ISpot spot : parkingFloor.getSpotsByType(spotType)) {
                if(spot.isFree()) {
                    return spot;
                }
            }
        }
        return null;
    }
}
