package com.loon.comparator;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/**
 * Created by Loon on 2015/11/13.
 */
public class PinyinComparator implements Comparator<String> {
    public int compare(String o1, String o2) {
        return Collator.getInstance(Locale.SIMPLIFIED_CHINESE).compare(o1, o2);
    }
}
