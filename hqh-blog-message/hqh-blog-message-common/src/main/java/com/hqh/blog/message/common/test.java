package com.hqh.blog.message.common;

import net.sf.jsqlparser.expression.StringValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {

    public static void main(String[] args) {
        String str1 = "1";
        String str2 = "2";
        String str3 = null;
        System.out.println(
                Stream.of(str1, str2, str3).map(String::valueOf).collect(Collectors.joining("-"))
        );
        System.out.println(
                str1+str2+str3
        );
    }
}
