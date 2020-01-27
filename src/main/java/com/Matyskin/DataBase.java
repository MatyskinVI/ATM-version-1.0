package com.Matyskin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DataBase {
    private HashMap<Long, Account> accounts;

    class Account {
        private int pinCode;
        private long cardNumber;
        private double money;
        private String firstName;
        private String lastName;

        public Account() {
            this.pinCode = 1111;
            this.cardNumber = 1111222211112222L;
            this.money = 1000;
            this.firstName = "Valery";
            this.lastName = "Matyskin";
        }

        public Account(int pinCode, long cardNumber, int money, String firstName, String lastName) {
            this.pinCode = pinCode;
            this.cardNumber = cardNumber;
            this.money = money;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public int getPinCode() {
            return pinCode;
        }

        public long getCardNumber() {
            return cardNumber;
        }

        public double getMoney() {
            return money;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setMoney(double money) {
            this.money = money;
        }
    }

    public DataBase() {
        try {
            Account account = new Account();
            accounts = new HashMap<>();
            this.accounts.put(account.getCardNumber(), account);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getPinCode(long cardNumber) {
        Map.Entry<Long, Account> pair = accountIterator(cardNumber);
        return pair.getValue().pinCode;

    }

    public double getCardBalance(long cardNumber) {
        Map.Entry<Long, Account> pair = accountIterator(cardNumber);
        return pair.getValue().money;

    }

    public void setCardBalance(long cardNumber, double cardBalance) {
        Map.Entry<Long, Account> pair = accountIterator(cardNumber);
        pair.getValue().money = cardBalance;


    }

    public Map.Entry<Long, Account> accountIterator(long cardNumber) {
        for (Map.Entry<Long, Account> pair : accounts.entrySet()) {
            if (pair.getKey() == cardNumber){
                return pair;
            }
        }
        System.exit(3);
        return null;
    }












    public static void main(String[] args) throws IOException {
        /*FileOutputStream fileOutputStream = new FileOutputStream("testDataBase.txt", true);
        PrintWriter printWriter = new PrintWriter(fileOutputStream);

        printWriter.println("I love Olya");
        printWriter.close();*/
        /*DataBase dataBase = new DataBase();
        ArrayList<String> testArrayList= new ArrayList<>();
        testArrayList = dataBase.getStringArray("testDataBase.txt");
        dataBase.soutArray(testArrayList);*/
    }

    public ArrayList<String> getStringArray(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
        ArrayList<String> string = new ArrayList<>(10);
        int count = 0;
        String str;
        while ((str = reader.readLine()) != null){
            string.add(str);
            count++;
        }
        System.out.println("Method getStringArray worked " + count + " times!");
        reader.close();
        return string;
    }

    public void soutArray(ArrayList<String> list){
        for (int i = 0; i < list.size() - 1; i++){
            System.out.println(list.get(i));
        }
    }
}
