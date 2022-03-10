// Country.java

package com.spring.news.model;


import java.io.IOException;

public enum Country {
    GB, US;

    public String toValue() {
        switch (this) {
            case GB: return "gb";
            case US: return "us";
        }
        return null;
    }

    public static Country forValue(String value) throws IOException {
        if (value.equals("gb")) return GB;
        if (value.equals("us")) return US;
        throw new IOException("Cannot deserialize Country");
    }
}