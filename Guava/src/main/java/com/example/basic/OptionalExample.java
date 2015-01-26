package com.example.basic;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Optional 用和避免null
 * Created by Loon on 2015/1/26.
 */
public class OptionalExample {

    public static void main(String[] args) {

        Map<String, String> stringMap = Maps.newHashMap();
        stringMap.put("test", "test");
        List<Map<String, String>> list = Lists.newArrayList(null, stringMap);

        Set<Map<String, String>> set = Sets.newHashSet();
        set.addAll(Optional.fromNullable(list).or(new ArrayList<Map<String, String>>()));

    }
}
