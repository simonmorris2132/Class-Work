package com.careerdevs.stockmarketapi.models;

public class StockAPIModel {
    private String Symbol;
    private String AssetType;
    private String Name;
    private String Description;

    public String getSymbol() {
        return this.Symbol;
    }

    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    public String getAssetType() {
        return this.AssetType;
    }

    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return this.Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

}
