package ru.gb.JavaSpring.HW08.controllers;

import com.sun.source.tree.BreakTree;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.JavaSpring.HW08.dto.TransferRequest;
import ru.gb.JavaSpring.HW08.model.Account;
import ru.gb.JavaSpring.HW08.service.TransferService;

import java.util.List;

@RestController
@AllArgsConstructor
public class AccountControllere {

    private final TransferService transferService;

    @PostMapping("/transfer")
    public void transferMoney(@RequestBody TransferRequest request){
        transferService.transferMoney(
                request.getSenderAccountId(),
                request.getReceiverAccountId(),
                request.getAmount()
        );
    }

    @GetMapping("/accounts")
    public List<Account> getAllAccounts(){
        return transferService.getAllAccounts();
    }
}
