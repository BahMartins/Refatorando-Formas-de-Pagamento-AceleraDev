package br.com.codenation.paymentmethods;

public class CashPayment implements PriceStrategy {

    private final double discount = 0.9;

    @Override
    public Double calculate(Double price) {
        return price * discount;
    }
}
