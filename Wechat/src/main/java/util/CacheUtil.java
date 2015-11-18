package util;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import tools.BasicSupport;

import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Loon on 2015/11/18.
 */
public class CacheUtil {

    private ResourceBundle conf = ResourceBundle.getBundle("config");

    private  LoadingCache<String, String> accessTokenCache = CacheBuilder.newBuilder()
            .initialCapacity(10)
            .maximumSize(100)
            .expireAfterWrite(7200, TimeUnit.SECONDS)
            .build(new CacheLoader<String, String>() {
                       @Override
                       public String load(String s) throws Exception {

                           return BasicSupport.getAccessToken(conf.getString("appId"), conf.getString("appSecret"));
                       }
                   }
            );
    private static CacheUtil cacheUtil;

    private CacheUtil() {}

    public static String getAccessToken() {

        if (cacheUtil == null) {
            cacheUtil = new CacheUtil();
        }

        return cacheUtil.accessTokenCache.getUnchecked("accessToken");
    }


    public static void main(String[] args) throws InterruptedException, ExecutionException {

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            String accessToken = CacheUtil.getAccessToken();
            System.out.println(accessToken);
            TimeUnit.SECONDS.sleep(1);

        }
    }

}
