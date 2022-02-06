package ru.online.bank;

import ru.online.bank.model.Client;
import ru.online.bank.model.operation.Operation;
import ru.online.bank.service.BankService;
import ru.online.bank.service.BankServiceImpl;

import java.util.Scanner;
import java.util.Set;

public class OnlineBankApp {

    public static void main(String[] args) {
        BankService bankService = new BankServiceImpl();


        Scanner s = new Scanner(System.in);
        String operationName = s.next();

        Operation op = bankService.findOperation(operationName);
        System.out.println(op);

        Client client = null; //... findClient


    }
}
