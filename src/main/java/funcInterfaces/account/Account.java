package main.java.funcInterfaces.account;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Account {

//    You have a class Account (number: String, balance: Long, isLocked: boolean), the list accounts of type List<Account> and the method filter(List<T> elems, Predicate<T> predicate) for filtering the given list of type T by the predicate.
//
//    The class Account has the next methods: getNumber(), getBalance(), isLocked() for getting the values of the corresponding fields.
//
//    Write a code for filtering the accounts list in two ways:
//
//    get list with all non-empty accounts (balance > 0) and save it to the variable nonEmptyAccounts
//    get all non-locked accounts with too much money (balance >= 100 000 000) and save it to the variable accountsWithTooMuchMoney
//    The class Account, the list accounts (List<Account>) and the method filter(...) will be available during testing.
//
//    Important. Use the given code template for your solution. Do not change it!
//
//    Example of use the filter method. The code below gets only even number from the list.
//
//    List<Integer> numbers = ...List<Integer> evenNumbers = filter(numbers, number -> number % 2 == 0);

    private final String number;
    private final Long balance;
    private final boolean locked;

    public Account(String number, Long balance, boolean locked) {
        this.number = number;
        this.balance = balance;
        this.locked = locked;
    }

    public String getNumber() {
        return number;
    }

    public Long getBalance() {
        return balance;
    }

    public boolean isLocked() {
        return locked;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", locked=" + locked +
                '}';
    }

    public static <T> List<T> filter(List<T> elems, Predicate<T> predicate) {
        return elems.stream().filter(predicate).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Account first = new Account("1", 0L, false);
        Account second = new Account("2", 100000001L, false);
        Account third = new Account("3", 2000L, false);
        Account four = new Account("4", 100000001L, true);

        List<Account> accounts = new ArrayList<>();
        accounts.add(first);
        accounts.add(second);
        accounts.add(third);
        accounts.add(four);

        List<Account> nonEmptyAccounts = filter(accounts, account -> account.getBalance() > 0);
        List<Account> accountsWithTooMuchMoney = filter(accounts, account -> account.getBalance() >= 100000000 && !account.isLocked());

        System.out.println("nonEmptyAccounts:");
        nonEmptyAccounts.forEach(System.out::println);
        System.out.println("accountsWithTooMuchMoney:");
        accountsWithTooMuchMoney.forEach(System.out::println);

    }

}
