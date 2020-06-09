package br.com.codenation.paymentmethods;

public class DebitCardPayment implements PriceStrategy{

    private final double discount = 0.95;

    @Override
    public Double calculate(Double price) {
        return price * discount;
    }
}
