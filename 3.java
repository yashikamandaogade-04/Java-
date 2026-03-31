class CarRental {
    int carId;
    String carType;
    float rent;
    void getCar(int id, String type) {
        carId = id; carType = type;
    }
    float getRent() {
        switch(carType) {
            case "Small": rent = 1000; break;
            case "Van": rent = 800; break;
            case "SUV": rent = 2500; break;
        }
        return rent;
    }
    void showCar() {
        System.out.println("CarId: " + carId + ", Type: " + carType + ", Rent: " + getRent());
    }
    public static void main(String[] args) {
        CarRental c = new CarRental();
        c.getCar(1,"SUV");
        c.showCar();
    }
}
