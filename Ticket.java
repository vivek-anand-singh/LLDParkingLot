public class Ticket {
    
    int ticketId;
    Vehicle vehicle;
    ISpot spot;
    long inTime;
    long outTime;
    double price;

    Ticket(int ticketId, Vehicle vehicle, ISpot spot) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.spot = spot;
        this.inTime = System.currentTimeMillis();
    }

    public int getTicketId() {
        return this.ticketId;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    public ISpot getSpot() {
        return this.spot;
    }

    public long getInTime() {
        return this.inTime;
    }

    public long getOutTime() {
        return this.outTime;
    }

    public double getPrice() {
        return this.price;
    }

    public void setOutTime(long outTime) {
        this.outTime = outTime;
    }

    public void setPrice(double price) {
        this.price = price;
    }  
    
    public String inComingTicket() {
        return "Ticket ID: " + this.ticketId + ", Vehicle Number: " + this.vehicle.getVehicleNum() + ", In Time: " + this.inTime;
    }
}
