class Bank {
    final double interestRate = 5.0;

    double calculateInterest(double amount) {
        return amount * interestRate / 100;
    }

    public static void main(String[] args) {
        Bank b = new Bank();

        System.out.println(b.calculateInterest(1000));
        System.out.println(b.calculateInterest(2000));
    }
}
