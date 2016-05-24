package com.loon.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Loon on 2015/11/10.
 */
public class PatternLeaning {

    public static void main(String[] args) {

        String aa ="\\d";

        Pattern pattern = Pattern.compile(aa);

        System.out.println(replaceMatcherString("aadsf111d111s",pattern)) ;
        System.out.println(getMatcherString("aadsf111ds1",pattern));
    }

    private static String getMatcherString(String str, Pattern pattern) {

        StringBuilder stringBuilder = new StringBuilder();
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()){
            stringBuilder.append(matcher.group());
        }

        return stringBuilder.toString();
    }

    private static String replaceMatcherString(String str, Pattern pattern) {

        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()){
            matcher.appendReplacement(stringBuffer,"");
        }
        matcher.appendTail(stringBuffer);

        return stringBuffer.toString();
    }
}
