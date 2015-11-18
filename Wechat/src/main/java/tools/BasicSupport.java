package tools;

import com.google.common.io.Resources;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import util.InputStreamToMap;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * Created by Loon on 2015/11/17.
 */
public class BasicSupport {

    public static String getAccessToken(String appId, String appSecret) throws IOException {


        String accessToken = "";

        String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=" + appId + "&secret=" + appSecret;

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        HttpResponse response;
        try {
            response = client.execute(request);
            accessToken = InputStreamToMap.getMap(response.getEntity().getContent()).get("access_token");
        } catch (IOException e) {
            e.printStackTrace();

        }

        return accessToken;


//        Map<String, String> map = new Gson().fromJson(Resources.toString(new URL(url), Charset.defaultCharset()), new TypeToken<Map<String, String>>() {
//        }.getType());
//
//        System.out.println(map.get("access_token"));

    }


    public static void main(String[] args) throws IOException {
        ResourceBundle conf = ResourceBundle.getBundle("config");

        getAccessToken(conf.getString("appId"),conf.getString("appSecret"));
    }
}
