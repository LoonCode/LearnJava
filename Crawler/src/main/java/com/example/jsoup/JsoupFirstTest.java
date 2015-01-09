package com.example.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Loon on 2015/1/9.
 */
public class JsoupFirstTest {

    public static void main(String[] args) throws IOException {
        Document doc = Jsoup.connect("http://192.168.12.191:8080/bms/").get();


//        Document doc = Jsoup.connect("http://example.com")
//                .data("query", "Java")
//                .userAgent("Mozilla")
//                .cookie("auth", "token")
//                .timeout(3000)
//                .post();

        {
            Element link = doc.select("a").first();
            String relHref = link.attr("href"); // == "/"
            String absHref = link.attr("abs:href"); // "http://www.open-open.com/"

            System.out.println(relHref);
            System.out.println(absHref);
        }


        Elements links = doc.select("a");
        for (Element link : links) {
            String linkHref = link.attr("href");
            System.out.println(linkHref);
            String linkText = link.text();
            System.out.println(linkText);
        }


    }
}
