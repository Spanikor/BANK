package ru.online.bank.service;

import ru.online.bank.model.Client;
import ru.online.bank.model.operation.Operation;

import java.util.Collection;
import java.util.Set;

public interface BankService {

    Collection<Operation> findAllOperations();

    Operation findOperation(String operationName);

    Set<Operation> findOperations(String operationType);

    Client findClientById(String clientId);

    Client findClientByCardNumber(String cardNumber);

    /**
     *
     * @param client
     * @return true если клиента в базе нет. false если клиент в базе уже существует
     */
    boolean addClient(Client client);

    boolean addClient(String fio, boolean gender, int age);

}
