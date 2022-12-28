package com.bayu.employee.model.enumerator;

public enum ReadyToBePlaceInAll {

    YA("YA"),
    TIDAK("TIDAK");

    private final String readyToBePlaceInAll;

    ReadyToBePlaceInAll(String readyToBePlaceInAll) {
        this.readyToBePlaceInAll = readyToBePlaceInAll;
    }

    public String getReadyToBePlaceInAll() {
        return readyToBePlaceInAll;
    }
}
