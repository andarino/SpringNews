
// Language.java

package com.spring.news.model;


import java.io.IOException;

public enum Language {
    EN;

    public String toValue() {
        switch (this) {
            case EN: return "en";
        }
        return null;
    }

    public static Language forValue(String value) throws IOException {
        if (value.equals("en")) return EN;
        throw new IOException("Cannot deserialize Language");
    }
}
