abstract class Ride {
    int distance;
    Ride(int d){distance=d;}
    abstract int calculateFare();
}

class BikeRide extends Ride {
    BikeRide(int d){super(d);}
    int calculateFare(){return distance*5;}
}
class AutoRide extends Ride {
    AutoRide(int d){super(d);}
    int calculateFare(){return distance*8;}
}
class CarRide extends Ride {
    CarRide(int d){super(d);}
    int calculateFare(){return distance*12;}
}

public class TestRide {
    public static void main(String[] args) {
        Ride[] rides = {new BikeRide(10), new AutoRide(10), new CarRide(10)};
        for(Ride r: rides)
            System.out.println(r.getClass().getSimpleName()+" Fare: "+r.calculateFare());
    }
}
