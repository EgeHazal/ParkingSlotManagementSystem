
public class Ticket {
    private Vehicle vehicle;
    private ParkingSlot parkingSlot;
    private long entryTime;
    private long exitTime;

    public Ticket(Vehicle vehicle, ParkingSlot parkingSlot, long entryTime) {
        this.vehicle = vehicle;
        this.parkingSlot = parkingSlot;
        this.entryTime = entryTime;
    }

    public void setExitTime(long exitTime) {
        this.exitTime = exitTime;
    }

    public long calculateParkingFee() {
        long duration = exitTime - entryTime;
        return duration * 2;
    }
}
