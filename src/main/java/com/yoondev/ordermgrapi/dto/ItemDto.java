package com.yoondev.ordermgrapi.dto;

import com.yoondev.ordermgrapi.domain.Items;

public record ItemDto(
        String itemName,
        String itemExplain,
        Integer costPrice,
        Integer netPrice,
        Integer sellPrice
) {
    public ItemDto ItemDto(String itemName, String itemExplain, Integer costPrice, Integer netPrice, Integer sellPrice) {
        return new ItemDto(itemName, itemExplain, costPrice, netPrice, sellPrice);
    }
    public static ItemDto of(String itemName, String itemExplain, Integer costPrice, Integer netPrice, Integer sellPrice){
        return new ItemDto(itemName, itemExplain, costPrice, netPrice, sellPrice);
    }
    public static ItemDto from(Items items){
        return new ItemDto(
              items.getItemName(),
              items.getItemExplain(),
              items.getCostPrice(),
              items.getNetPrice(),
              items.getSellPrice()
        );
    }

}
