package com.loon.date.joda;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.format.*;

import java.util.Date;

/**
 * Created by Loon on 2016/5/24.
 */
public class FormatDate {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString()); // 2016-05-24
        DateTimeFormatter fmt = DateTimeFormat.forPattern("d MMMM, yyyy");
        System.out.println(localDate.toString(fmt)); //24 五月, 2016

        LocalTime localTime =LocalTime.now();
        System.out.println(localTime); // 12:54:01.173

        DateTime dateTime =DateTime.now();
        System.out.println(dateTime); // 2016-05-24T12:54:01.190+08:00


        Date  date = new Date();
        System.out.println(date);// Tue May 24 12:54:01 CST 2016


        System.out.println(dateTime.toString(DateTimeFormat.fullDate())); // 2016年5月24日 星期二
        System.out.println(dateTime.toString(DateTimeFormat.longDate())); // 2016年5月24日
        System.out.println(dateTime.toString(DateTimeFormat.mediumTime()));// 12:54:01
        System.out.println(dateTime.toString(DateTimeFormat.mediumDate()));// 2016-5-24

        DateTimeFormatter monthAndYear = new DateTimeFormatterBuilder()
                .appendMonthOfYearText()
                .appendLiteral(' ')
                .appendYear(4, 4)
                .toFormatter();
        System.out.println(dateTime.toString(monthAndYear));// 五月 2016


        System.out.println(dateTime.toString(ISODateTimeFormat.basicDate())); // 20160524
        System.out.println(dateTime.toString(ISODateTimeFormat.basicOrdinalDate())); // 2016145
        System.out.println(dateTime.toString(ISODateTimeFormat.basicWeekDateTime()));// 2016W212T130215.251+0800
        System.out.println(dateTime.toString(ISODateTimeFormat.hourMinuteSecondFraction()));// 13:02:15.251

        System.out.println(new DateTime(date).toString(DateTimeFormat.mediumDateTime())); // 2016-5-24 13:04:50
        System.out.println(new DateTime(date).toString(DateTimeFormat.shortDate())); // 16-5-24




        DateTimeFormatter dayAndMonth = new DateTimeFormatterBuilder()
                .appendMonthOfYear(0)
                .appendLiteral('/')
                .appendDayOfMonth(0)
                .toFormatter();

        System.out.println(dateTime.toString(dayAndMonth));

    }
}
