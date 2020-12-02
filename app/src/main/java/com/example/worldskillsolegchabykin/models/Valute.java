package com.example.worldskillsolegchabykin.models;

public class Valute {

    private String type;
    private String typeName;
    private String buy;
    private String sell;

    public Valute(String type, String typeName, String buy, String sell) {
        this.type = type;
        this.typeName = typeName;
        this.buy = buy;
        this.sell = sell;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getBuy() {
        return buy;
    }

    public void setBuy(String buy) {
        this.buy = buy;
    }

    public String getSell() {
        return sell;
    }

    public void setSell(String sell) {
        this.sell = sell;
    }
}
