package com.huki.msdemo.Entity;




public class UserField {
    private String Field;

    public String getField() {
        return Field;
    }

    public void setField(String field) {
        Field = field;
    }

    @Override
    public String toString() {
        return "UserField{" +
                "Field='" + Field + '\'' +
                '}';
    }
}
