public class Anggota {
    private String noKTP;
    private String name;
    private int loanLimit;
    private int loanAmount;

    Anggota(String noKTP, String name, int loanlimit) {
        this.noKTP = noKTP;
        this.name = name;
        this.loanLimit = loanlimit;
        this.loanAmount = 0;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String getName() {
        return name;
    }

    public int getLoanLimit() {
        return loanLimit;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void borrow(int money) {
        if (money > loanLimit) {
            System.out.println("Sorry, the loan amount exceeds the limit");
        } else {
            loanAmount += money;
        }
    }

    public void installments(int money) {
        if (money < loanAmount * 0.1) {
            System.out.println("Sorry, the installment must be 10% of the loan amount");
        } else {
            loanAmount -= money;
        }
    }
}
