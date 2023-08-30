package org.example.model;

import lombok.Data;

import java.util.Date;


@Data
public class Account {
    private int id;
    private String number;
    private double balance;
    private int userId;
    private int bankId;
    private Date creationDate;
}
