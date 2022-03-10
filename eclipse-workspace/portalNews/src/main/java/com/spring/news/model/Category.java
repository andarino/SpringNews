// Category.java
package com.spring.news.model;


import java.io.IOException;

public enum Category {
    GENERAL, SPORTS;

    public String toValue() {
        switch (this) {
            case GENERAL: return "general";
            case SPORTS: return "sports";
        }
        return null;
    }

    public static Category forValue(String value) throws IOException {
        if (value.equals("general")) return GENERAL;
        if (value.equals("sports")) return SPORTS;
        throw new IOException("Nao pode deseriliazar Category");
    }
}
