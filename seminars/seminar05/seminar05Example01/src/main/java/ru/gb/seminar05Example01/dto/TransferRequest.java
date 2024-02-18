package ru.gb.seminar05Example01.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransferRequest {

    private long senderAccount;
    private long receiverAccount;
    private BigDecimal amount;
}
