package com.example.demo;

public class Shop {
    public void sell(Account account, Product product) {
        if (account.canAfford(product.getPrice())) { //객체에게 작업을 시킴
            account.withdraw(product.getPrice()); //객체에게 작업을 시킴
            System.out.println(product.getName() + "를 구매했습니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}

