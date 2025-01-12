
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("34EEE111", "Car");
        ParkingSlot slot = new ParkingSlot(1);
        Ticket ticket = new Ticket(car, slot, System.currentTimeMillis());

        slot.occupySlot();
        System.out.println("Vehicle " + car.getLicensePlate() + " has entered at slot " + slot.getSlotNumber());

        ticket.setExitTime(System.currentTimeMillis() + 3600000); 
        slot.freeSlot();
        System.out.println("Vehicle " + car.getLicensePlate() + " has exited. Fee: " + ticket.calculateParkingFee());
    }
}
