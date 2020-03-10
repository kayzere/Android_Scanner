package com.univ_amu.food_scanner.data.network;

import androidx.annotation.NonNull;

import java.util.List;

public class NetworkFood {
    public String brands;
    public String nutriscore;
    public String name;
    public String code;
    List<NetworkQuantity> quantities;

    public static class NetworkQuantity {
        String name;
        double quantity;
        public int rank;
        public int level;
        public double value;
        public String unit;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}