package pl.lukaszwilk.BankVeryfication.controllers;

import lombok.Data;

@Data
public class RequestForm {
    private int monthCash;
    private int minusCash;
    private int creditTime;
    private int creditCash;

}
