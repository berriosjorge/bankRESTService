package pe.com.jorgeberrios.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConvertToUtils {
	private ConvertToUtils() {}

    private static final Gson GSON =new GsonBuilder().disableHtmlEscaping().create();


    public static String convertFromObjectToJson(Object object) {
        return GSON.toJson(object);
    }
    public static <T> T convertFromJsonToObject(String json,Class<T> c) {
    	return GSON.fromJson(json,c);
    }
}
