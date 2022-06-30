package practice;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {

    private static LocalDate lastIncome;

    protected boolean put(double amountToPut) {
        setPut(amountToPut > 0);
        if (isPut()) {
            lastIncome = LocalDate.now();
            setAmount(getAmount() + amountToPut);
        }
        return isPut();
    }

    protected boolean take(double amountToTake) {
        setTaken(amountToTake > 0 && getAmount() >= amountToTake && LocalDate.now()
                .isAfter(lastIncome.plusMonths(1)));
        if (isTaken()) {
            setAmount(getAmount() - amountToTake);
        }
        return isTaken();
    }

}
