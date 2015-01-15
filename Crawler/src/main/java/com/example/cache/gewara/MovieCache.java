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
public class MovieCache extends AbstractLoadCache<String, String> {

    @Override
    public String getData(String key) throws IOException {

        String movieId = "";

        Document doc = Jsoup.connect("http://www.gewara.com/movie/searchMovie.xhtml").userAgent("Mozilla").get();
        Elements links = doc.select("a[href^=/movie][target=_blank][class=color3]");

        for (Element link : links) {
            if (link.text().equals(key)) {
                movieId = link.attr("href").substring(7);
            }
            this.getCache().put(link.text(), link.attr("href").substring(7));
        }
        return movieId;
    }

}
