package tum.hellospark;

import tum.hellospark.doamin.Person;
import tum.hellospark.transformer.MyTransformer;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        staticFileLocation("/public"); // Static files

        get("/hello", "application/json", (request, response) -> {
            Person tum = new Person();
            tum.setName("Songpon Imyen");
            tum.setAddress("Pathumthani, Thailand");
            tum.setAge(30);
            return tum;
        }, new MyTransformer());

    }
}
