package com.careerdevs.stockmarketapi.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StockAPIModel {
    private String symbol;
    private String assetType;
    private String name;
    private String description;

    public String getSymbol() {
        return this.symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAssetType() {
        return this.assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
