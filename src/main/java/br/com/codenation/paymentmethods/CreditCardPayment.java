package br.com.codenation.paymentmethods;

public class CreditCardPayment implements  PriceStrategy{

    private final double discount = 0.98;

    @Override
    public Double calculate(Double price) {
        return price * discount;
    }
}
