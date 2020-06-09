package br.com.codenation.paymentmethods;

public class TransferPayment implements PriceStrategy {

    private final double discount = 0.92;

    @Override
    public Double calculate(Double price) {
        return price * discount;
    }
}
