class RailwayReservation {
    int tickets=1;
    synchronized void bookTicket(String name){
        if(tickets>0){
            System.out.println(name+" booked successfully");
            tickets--;
        } else {
            System.out.println("No tickets available");
        }
    }

    public static void main(String[] args) {
        RailwayReservation r = new RailwayReservation();
        new Thread(() -> r.bookTicket("Ravi")).start();
        new Thread(() -> r.bookTicket("Yashika")).start();
    }
}
