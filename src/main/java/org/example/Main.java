package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        double pricePerUnit = 25.50; // цена одной единицы товара
        double weightPerUnit = 0.8;  // вес одной единицы в килограммах
        int quantity = 4;            // количество единиц
        boolean hasDiscount = true;   // есть ли льгота на пошлину

        double totalPriceBasic = pricePerUnit * quantity;
        double totalWeight = weightPerUnit * quantity;
        System.out.println("Total price without discount and duty is: " + totalPriceBasic + " $");
        System.out.println("Total weight is: " + totalWeight + " kg");

        int deliveryCostBasic;
        if (totalWeight <= 2) {
            deliveryCostBasic = 5;
        } else {
            deliveryCostBasic = 12;
        }
        System.out.println("Delivery cost is: " + deliveryCostBasic + " $");

        int discount = 0;
        if (hasDiscount && totalPriceBasic > 50) {
            discount = 10;
        }
        System.out.println("Discount is " + discount + " %");

        double discountValue = totalPriceBasic * discount / 100;
        double totalPriceWithDiscount = totalPriceBasic - discountValue;
        System.out.println("Discount is " + discountValue + " $");

        int duty = 0;
        if (!hasDiscount && totalPriceWithDiscount > 100) {
            duty = 10;
        }
        System.out.println("Duty is " + duty + " %");

        double dutyValue = totalPriceWithDiscount * duty / 100;
        double totalPriceWithDiscountAndDuty = totalPriceWithDiscount + dutyValue;
        System.out.println("Duty is " + dutyValue + " $");

        double finalPrice = totalPriceWithDiscountAndDuty + deliveryCostBasic;

        System.out.println("Final price is: " + finalPrice + " $");
    }
}