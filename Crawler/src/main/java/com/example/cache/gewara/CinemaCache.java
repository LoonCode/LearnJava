package com.example.cache.gewara;

import com.example.cache.AbstractLoadCache;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * Created by Loon on 2015/1/9.
 */
public class CinemaCache extends AbstractLoadCache<String, String> {

    @Override
    public String getData(String key) throws IOException {

        String cinemaId = "";

        Document doc = Jsoup.connect("http://www.gewara.com/movie/searchCinema.xhtml?countycode=310115").userAgent("Mozilla").get();
        Elements links = doc.select("a[href^=/cinema][target=_blank][class=color3]");

        for (Element link : links) {

            if (link.text().equals(key)) {
                cinemaId = link.attr("href").substring(8);
            }
            this.getCache().put(link.text(), link.attr("href").substring(8));
        }
        return cinemaId;
    }
}
