package com.epam.mjc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class StringSplitter {

    /**
     * Splits given string applying all delimeters to it. Keeps order of result substrings as in source string.
     *
     * @param source source string
     * @param delimiters collection of delimiter strings
     * @return List of substrings
     */
    public List<String> splitByDelimiters(String source, Collection<String> delimiters) {
        //throw new UnsupportedOperationException("You should implement this method.");
        for (String s : delimiters) {
            source = source.replace(s, " ").trim();
        }
        String[] answer = source.split(" +");
        return Arrays.asList(answer);
    }
}
