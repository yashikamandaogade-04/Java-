class Resort {
    int RNo, Days;
    String Name;
    double Charges;
    double compute() {
        double amt = Days * Charges;
        if(amt > 11000) amt *= 1.02;
        return amt;
    }
    void getInfo(int rno, String name, double charges, int days) {
        RNo = rno; Name = name; Charges = charges; Days = days;
    }
    void dispInfo() {
        System.out.println("Room: " + RNo + ", Name: " + Name +
            ", Charges: " + Charges + ", Days: " + Days +
            ", Amount: " + compute());
    }
    public static void main(String[] args) {
        Resort r = new Resort();
        r.getInfo(101,"Yashika",1200,10);
        r.dispInfo();
    }
}
