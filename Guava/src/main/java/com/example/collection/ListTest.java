package com.example.collection;

import com.google.common.base.Function;
import com.google.common.collect.*;
import com.loon.comparator.PinyinComparator;

import java.util.Collection;
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
        getAgeGroup();
        order();
        chineseOrder();
        chineseOrder2();
    }


    public static void transformListToMap() {
        List<Person> stringList = newArrayList(new Person("test", 12), new Person("test2", 22), new Person("test3", 32));


        Map<String, Person> map = Maps.uniqueIndex(stringList, new Function<Person, String>() {
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


    /**
     * According to age group
     */
    private static void getAgeGroup() {

        List<Person> stringList = newArrayList(new Person("test", 12), new Person("test2", 22), new Person("test3", 32), new Person("test4", 32));


        ImmutableListMultimap<Integer, Person> resultMap = Multimaps.index(stringList, new Function<Person, Integer>() {
            public Integer apply(Person webSearchResultModel) {
                return webSearchResultModel.getAge();
            }
        });

        ImmutableMap<Integer, Collection<Person>> map = resultMap.asMap();

        for (Collection<Person> persons : map.values()) {
            System.out.println(persons.toString());
        }

    }


    /**
     * order by list
     */
    private static void order() {

        List<Person> stringList = newArrayList(new Person("test", 12), new Person("test2", 22), new Person("test4", 35), new Person("test3", 32));

        Ordering<Person> personOrdering = Ordering.natural().nullsFirst().onResultOf(new Function<Person, Comparable>() {
            public Comparable apply(Person person) {
                return person.getName();
            }
        });

        System.out.println(Collections2.orderedPermutations(stringList, personOrdering));

    }


    /**
     * order by list
     */
    private static void chineseOrder() {

        List<Person> stringList = newArrayList(new Person("测试", 12), new Person("测试2", 22), new Person("测试你好", 35), new Person("你好测试", 32));

        Ordering<Person> personOrdering = new Ordering<Person>() {
            @Override
            public int compare(Person personOne, Person personTwo) {
                return new PinyinComparator().compare(personOne.getName(), personTwo.getName());
            }
        };

        System.out.println(Collections2.orderedPermutations(stringList, personOrdering));

    }


}
