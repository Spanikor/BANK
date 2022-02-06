package ru.online.bank.service;

import ru.online.bank.model.Client;
import ru.online.bank.model.operation.*;


import java.util.*;

public class BankServiceImpl implements BankService {

    private Map<String, Operation> operations;

    private Set<Client> clients;

    public BankServiceImpl() {
        operations = new HashMap<>();
        operations.put("Ипотека", new IpotekaOperation());
        operations.put("Займ", new MoneyLoanCreditOperation());
        operations.put("Снять наличные", new MoneyOperation());
        operations.put("Перевод денег", new MoneyTransferOperation());
    }

    public BankServiceImpl(Map<String, Operation> operations) {
        this.operations = operations;
    }

    @Override
    public Collection<Operation> findAllOperations() {
        return operations.values();
    }

    @Override
    public Operation findOperation(String operationName) {
        return operations.get(operationName);
    }

    @Override
    public Set<Operation> findOperations(String operationType) {
        return null;
    }

    @Override
    public Client findClientById(String clientId) {
        return null;
    }

    @Override
    public Client findClientByCardNumber(String cardNumber) {
        return null;
    }

    @Override
    public boolean addClient(Client client) {
        return false;
    }

    @Override
    public boolean addClient(String fio, boolean gender, int age) {
        return false;
    }
}
