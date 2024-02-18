package ru.gb.seminar05Example01.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.gb.seminar05Example01.dto.TransferRequest;
import ru.gb.seminar05Example01.model.Account;
import ru.gb.seminar05Example01.server.TransferService;

@RestController
@AllArgsConstructor
public class AmountController {

    private final TransferService transferService;

    @PostMapping("/transfer")
    public void transferMoney(@RequestBody TransferRequest request){
        transferService.transferMoney(
                request.getSenderAccount(),
                request.getReceiverAccount(),
                request.getAmount()
        );
    }

    @GetMapping("/accounts")
    public Iterable<Account> getAllAccounts(@RequestParam(required = false) String name) {
        if(name == null){
            return transferService.getAllAccounts();
        } else {
            return transferService.findAccountsByName(name);
        }
    }

}
