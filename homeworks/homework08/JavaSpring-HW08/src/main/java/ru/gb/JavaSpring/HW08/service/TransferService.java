package ru.gb.JavaSpring.HW08.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.gb.JavaSpring.HW08.model.Account;
import ru.gb.JavaSpring.HW08.repository.AccountRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
@AllArgsConstructor
public class TransferService {

    private final AccountRepository repository;

    @Transactional
    public void transferMoney(long idSender, long idReceiver, BigDecimal amount){
        Account sender = repository.findAccountById(idSender);
        Account receiver = repository.findAccountById(idReceiver);

        BigDecimal senderAmount = sender.getAmount().subtract(amount);
        BigDecimal receiverAmount = receiver.getAmount().add(amount);

        repository.changeAmount(senderAmount, idSender);
        repository.changeAmount(receiverAmount, idReceiver);
    }

    public List<Account> getAllAccounts(){
        return repository.findAllAccounts();
    }
}
