import java.util.List;

public abstract class SlotAllocationStrategy {
    public abstract ISpot getNextFreeSpot(List<ParkingFloor> parkingFloors, SpotType spotType);
}
