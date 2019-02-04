package com.pluralsight.bookstore.util;

public class TextUtil {

    public String sanatize(String textToSanitize) {
        return textToSanitize.replaceAll("\\s+", " ");
    }
}
