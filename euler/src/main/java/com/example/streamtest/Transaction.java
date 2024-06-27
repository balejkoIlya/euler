package com.example.streamtest;

class Transaction {
    private final int id;
    private final double amount;
    private final String type;

    public Transaction(int id, double amount, String type) {
        this.id = id;
        this.amount = amount;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }
}

