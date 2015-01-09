package com.example.test.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Loon on 2015/1/9.
 */
public class JsoupFirstTest {

    public static void main(String[] args) throws IOException {
//        Document doc = Jsoup.connect("http://www.gewara.com/movie/ajax/getOpiItem.xhtml?movieid=208315566&fyrq=2015-01-09&cid=1").userAgent("Mozilla").get();
        Document doc = Jsoup.connect("http://www.gewara.com/movie/searchCinema.xhtml?countycode=310115").userAgent("Mozilla").get();


        System.out.println(doc);


        Elements links = doc.select("a[href^=/movie][target=_blank][class=color3]");
//        Document doc = Jsoup.connect("http://example.com")
//                .data("query", "Java")
//                .userAgent("Mozilla")
//                .cookie("auth", "token")
//                .timeout(3000)
//                .post();

        {
//            Element link = doc.select("a").first();
//            String relHref = link.attr("href"); // == "/"
//            String absHref = link.attr("abs:href"); // "http://www.open-open.com/"
//
//            System.out.println(relHref);
//            System.out.println(absHref);
        }


//        Element element = doc.select("div.chooseOpi_body").first();
//        Elements lis = element.select("li");
//
//
//        for (Element li : lis) {
//
//            Movie movie = new Movie();
//            movie.setStartTime(li.select("span.opitime").first().child(0).text());
//            movie.setPrice(li.select("span.opiPrice").first().child(0).text());
////            if (li.select("span.opiSales").first() != null){
////                movie.setSale(li.select("span.opiSales").first().tagName("b").child(1).text() +li.select("span.opiSales").first().tagName("b").child(1).text());
////            }
//            System.out.println(movie.toString());
//        }


    }
}
