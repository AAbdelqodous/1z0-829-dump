package com.abdelqodous.qa1z0_829.q45;

public class Test {
    public static void main(String[] args) throws OutOfStockException {
        m();
    }

    public static void m() throws OutOfStockException {
        try {
            throw new StockException("Raised.");
        } catch (StockException e) {
            throw new OutOfStockException(e.getMessage());
        }
    }
}
