package tum.hellospark.transformer;

import com.google.gson.Gson;
import spark.ResponseTransformer;

/**
 * Created by tum on 12/13/14.
 */
public class MyTransformer implements ResponseTransformer {

    @Override
    public String render(Object o) throws Exception {
        Gson gson = new Gson();
        return gson.toJson(o);
    }
}
