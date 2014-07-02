package com.example.collection;

import com.google.common.base.Function;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.transform;

//import static com.google.common.collect.Collections2.filter;

/**
 * Created by Loon on 2014/7/1.
 */
public class ListTest {

    public static void main(String[] args) {

        List<String> stringList = newArrayList("a", "b", "c");


//        List<String> newStringList =newArrayList(filter((java.util.Iterator<String>) stringList,new Predicate<String>() {
//
//            @Override
//            public boolean apply(String s) {
//                return s.equals("a");
//            }
//        }));

//        for (String s : newStringList) {
//            System.out.println(s);
//        }

//        Iterable<String> filtered = filter(stringList,new Predicate<Object>() {
//        });

//        List<String> stringList1= filter(stringList,equalTo());

        System.out.println();
        transformListToMap();
    }


    public static void transformListToMap() {
        List<Person> stringList = newArrayList(new Person("test", 12), new Person("test2", 22), new Person("test3", 32));

        Map<String, Person> map = Maps.uniqueIndex(stringList, new Function<Person, String>() {
            @Override
            public String apply(Person person) {
                return person.getName();
            }
        });

        System.out.println(map.get("test").getAge());


        List<String> names = newArrayList(transform(stringList, new Function<Person, String>() {
            public String apply(Person person) {
                return person.getName();
            }
        }));

        System.out.println("begin names");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("end names");

//        Map<String,Integer> map2= transformEntries();

    }


}
