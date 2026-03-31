class Bank {
    final double interestRate = 0.05; // 5%

    double calculateInterest(double amount){
        return amount*interestRate;
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println("Interest: "+b.calculateInterest(10000));
    }
}
