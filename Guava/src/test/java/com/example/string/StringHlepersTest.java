package com.example.string;

import com.example.basic.StringHlepers;
import com.google.common.collect.Lists;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Loong
 * Date: 13-12-21
 * Time: 下午9:06
 * To change this template use File | Settings | File Templates.
 */
public class StringHlepersTest extends TestCase {

    @Test
    public void testToCommaSeparatedString() throws Exception {

        List<String> list = Lists.newArrayList();
        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");

        System.out.println(StringHlepers.toCommaSeparatedString(list));


    }

    @Test
    public void testFromCommaSeparatedString() throws Exception {

        String str = "test1,test2,test3,test4";
        System.out.println(StringHlepers.fromCommaSeparatedString(str));
    }
}
