package com.univ_amu.food_scanner.data.network;

import androidx.room.TypeConverter;

import com.univ_amu.food_scanner.data.Food;
import com.univ_amu.food_scanner.data.Quantity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Converters {
    @TypeConverter
    public static Date fromTimestamp(Long value) {
        return value == null ? null : new Date(value);
    }

    @TypeConverter
    public static Long dateToTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }

    public static Food getFood(NetworkFood food) {
        Food foodnew = new Food(food.code, food.name, food.brands, food.nutriscore, new Date() );
        return foodnew ;


    }

    public static List<Quantity> getQuantities(NetworkFood food) {
        List<Quantity> quantities = new ArrayList<>();

        for (NetworkFood.NetworkQuantity quantity : food.quantities){

            quantities.add(new Quantity(food.code,
                    quantity.name,
                    quantity.rank,
                    quantity.level,
                    quantity.quantity,
                    quantity.unit));
        }

        return quantities;

    }
}