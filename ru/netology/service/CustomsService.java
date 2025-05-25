package ru.netology.service;

public class CustomsService {
    public static int calculateCustoms (int price, int weight) {

        double taxPrice = price * 0.01; // 1% от цены
        int taxWeight = weight * WEIGHT_RATE; // 100 руб/кг
        return (int)(taxPrice) + taxWeight;

    }

    public static final int WEIGHT_RATE = 100;

}
