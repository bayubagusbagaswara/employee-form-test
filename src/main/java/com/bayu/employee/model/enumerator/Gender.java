package com.bayu.employee.model.enumerator;

public enum Gender {

    MALE("LAKI-LAKI"),
    FEMALE("PEREMPUAN");

    private final String genderName;

    Gender(String genderName) {
        this.genderName = genderName;
    }

    public String getGenderName() {
        return genderName;
    }
}
