package org.example.model;

import lombok.Data;

import java.util.Date;

@Data
public class Transaction {
    private int id;
    private int senderBankId;
    private int recipientBankId;
    private int senderAccountId;
    private int recipientAccountId;
    private double amount;
    private Date date;
}
