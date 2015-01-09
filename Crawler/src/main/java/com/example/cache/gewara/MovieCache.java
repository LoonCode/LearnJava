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

        Document doc = Jsoup.connect("http://www.gewara.com/movie/searchMovie.xhtml").userAgent("Mozilla").get();
        Elements links = doc.select("a[href^=/movie][target=_blank][class=color3]");

        for (Element link : links) {
            this.getCache().put(link.attr("href").substring(7), link.text());
        }
        return null;
    }

}
