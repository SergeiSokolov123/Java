package practice;

public class BankAccount {

    private double amount;
    private boolean isTaken;
    private boolean isPut;

    protected double getAmount() {
        return amount;
    }

    protected boolean isTaken() {
        return isTaken;
    }

    protected boolean isPut() {
        return isPut;
    }

    protected void setAmount(double amount) {
        this.amount = amount;
    }

    protected void setTaken(boolean taken) {
        isTaken = taken;
    }

    protected void setPut(boolean put) {
        isPut = put;
    }

    protected boolean put(double amountToPut) {
        setPut(amountToPut > 0);
        if (isPut()) {
            amount += amountToPut;
        }
        return isPut();
    }

    protected boolean take(double amountToTake) {
        setTaken(amountToTake > 0 && amountToTake <= amount);
        if (isTaken()) {
            amount -= amountToTake;
        }
        return isTaken();
    }
}
