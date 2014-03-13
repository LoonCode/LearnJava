package com.example.string;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Loon
 * Date: 13-12-21
 * Time: 下午9:02
 * To change this template use File | Settings | File Templates.
 */
public class StringHlepers {

    public static String toCommaSeparatedString( List<String> strings ) {

        Joiner joiner = Joiner.on( "," ).skipNulls();
        System.out.println("");
        return joiner.join( strings );
    }

    public static List<String> fromCommaSeparatedString( String string ) {
        Iterable<String> split = Splitter.on(",").omitEmptyStrings().trimResults().split( string );
        return Lists.newArrayList(split);
    }
}
