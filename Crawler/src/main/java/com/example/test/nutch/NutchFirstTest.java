package com.example.test.nutch;

/**
 * Created by Loon on 2015/1/9.
 */
public class NutchFirstTest {

    public static void main(String[] args) {
//        try {
//            // define a keyword for the search
//            String nutchSearchString = "smart";
//
//            // configure nutch
//            Configuration nutchConf = NutchConfiguration.create();
//            NutchBean nutchBean = new NutchBean(nutchConf);
//            // build the query
//            Query nutchQuery = Query.parse(nutchSearchString, nutchConf);
//            // optionally specify the maximum number of hits (default is 10)
//            // nutchQuery.getParams().setNumHits(100);
//            // nutchQuery.getParams().setMaxHitsPerDup(100);
//            Hits nutchHits = nutchBean.search(nutchQuery);
//
//            // display the number of hits
//            System.out.println("Found " + nutchHits.getLength() + " hits.\n");
//
//            // get the details about each hit (includes title, URL, a summary
//            // and the date when this was fetched)
//            for (int i = 0; i < nutchHits.getLength(); i++) {
//                Hit hit = nutchHits.getHit(i);
//                HitDetails details = nutchBean.getDetails(hit);
//                String title = details.getValue("title");
//                String url = details.getValue("url");
//                String summary = nutchBean.getSummary(details, nutchQuery)
//                        .toString();
//                System.out.println("Title is: " + title);
//                System.out.println("(" + url + ")");
//                Date date = new Date(nutchBean.getFetchDate(details));
//                System.out.println("Date Fetched: " + date);
//                System.out.println(summary + "\n");
//                System.out.println("----------------------------------------");
//            }
//
//            // as usually, don't forget to close the resources
//            nutchBean.close();
//        } catch (Throwable e) {
//            e.printStackTrace();
//        }
    }
}
