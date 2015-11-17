package tools;


import bean.WechatMenu;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import util.InputStreamToMap;

import java.io.IOException;
import java.util.*;

/**
 * Created by Loon on 2015/11/17.
 */
public class MenuTools {


    public static void createMenu(Map<String, List<WechatMenu>> menuMap) throws IOException {

        ResourceBundle conf = ResourceBundle.getBundle("config");
//        String accessToken = BasicSupport.getAccessToken(conf.getString("appId"), conf.getString("appSecret"));

        String url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=" + "vB55uLa1R_JoJzbMdobrUu7VyLCT1TWkzk0t61bVyysnWCY4Mywu_xKsimcH90gGGhABPpilfqW_9TuO1yHEFHtxsUgztt-agmPZ1ByWT7YQXPhAFAJQI";
        System.out.println(url);
        HttpClient client = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(url);

        String errCode = null;
        String errMsg = null;

        System.out.println(new Gson().toJson(menuMap));
        post.setEntity(new StringEntity(new Gson().toJson(menuMap), ContentType.APPLICATION_JSON));
        HttpResponse response = client.execute(post);
        Map<String, String> map = InputStreamToMap.getMap(response.getEntity().getContent());
        errCode = map.get("errcode");
        errMsg = map.get("errmsg");


        System.out.println(map);
        System.out.println(errCode);
        System.out.println(errMsg);

    }

    public static void main(String[] args) throws IOException {



        List<WechatMenu> wechatMenuList = new ArrayList<WechatMenu>();

        {
            List<WechatMenu> subButtonList = new ArrayList<WechatMenu>();
            subButtonList.add(new WechatMenu().createMediaMenu("菜单1-1","http://v.qq.com/"));
            subButtonList.add(new WechatMenu().createMediaMenu("菜单1-2","http://v.qq.com/"));
            subButtonList.add(new WechatMenu().createMediaMenu("菜单1-3","http://v.qq.com/"));

            wechatMenuList.add(new WechatMenu().createLevelOneMenu("扫码",subButtonList));

        }

        {
            List<WechatMenu> subButtonList = new ArrayList<WechatMenu>();
            subButtonList.add(new WechatMenu().createMediaMenu("菜单2-1","http://v.qq.com/"));
            subButtonList.add(new WechatMenu().createMediaMenu("菜单2-2","http://v.qq.com/"));
            subButtonList.add(new WechatMenu().createMediaMenu("菜单2-3","http://v.qq.com/"));

            wechatMenuList.add(new WechatMenu().createLevelOneMenu("发图",subButtonList));

        }

        wechatMenuList.add(new WechatMenu().createMediaMenu("视频","http://v.qq.com/"));

        Map<String, List<WechatMenu>> menuMap= new LinkedHashMap<String, List<WechatMenu>>();
        menuMap.put("button",wechatMenuList);

        createMenu(menuMap);


    }

//    {
//        "button": [
//        {
//            "name": "扫码",
//                "sub_button": [
//            {
//                "type": "scancode_waitmsg",
//                    "name": "扫码带提示",
//                    "key": "rselfmenu_0_0",
//                    "sub_button": [ ]
//            },
//            {
//                "type": "scancode_push",
//                    "name": "扫码推事件",
//                    "key": "rselfmenu_0_1",
//                    "sub_button": [ ]
//            }
//            ]
//        },
//        {
//            "name": "发图",
//                "sub_button": [
//            {
//                "type": "pic_sysphoto",
//                    "name": "系统拍照发图",
//                    "key": "rselfmenu_1_0",
//                    "sub_button": [ ]
//            },
//            {
//                "type": "pic_photo_or_album",
//                    "name": "拍照或者相册发图",
//                    "key": "rselfmenu_1_1",
//                    "sub_button": [ ]
//            },
//            {
//                "type": "pic_weixin",
//                    "name": "微信相册发图",
//                    "key": "rselfmenu_1_2",
//                    "sub_button": [ ]
//            }
//            ]
//        },
//        {
//            "type": "view",
//                "name": "视频",
//                "url": "http://v.qq.com/"
//        }
//        ]
//    }
}
