package util;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;

import com.google.common.base.Charsets;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

/**
 * @author Loon
 */
public class InputStreamToMap {

    public static Map<String, String> getMap(InputStream inputStream) {
        Reader input = new InputStreamReader(inputStream, Charsets.UTF_8);
        return new Gson().fromJson(input, new TypeToken<Map<String, String>>() {
        }.getType());
    }
}
