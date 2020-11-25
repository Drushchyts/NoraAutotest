package apiNora;

import apiNora.authorization.AuthNoraGoFastTv;
import org.testng.log4testng.Logger;

import java.util.Random;

public class AbstractApi {

    public static long startTimeClass;
    public static long startTime;

    public String baseUrlNoraGo = "https://mkdev.setplex.net/nora/auth";
    public String baseUrlNoraTv = "https://test-rc.norago.tv/nora/auth";
    public String baseUrlNoraCreatePackage = "https://mkdev.setplex.net/nora/api/networks";
    public String baseUrlNoraCreateSubscriber = "https://mkdev.setplex.net/nora/api/subscribers";



    public void bodyInfo(String responseBody) {
        //String responseBody = response.body().asString();
        System.out.println(responseBody);
    }

    public static String getRandom(int length) {
        String s = "123456789";
        StringBuffer number = new StringBuffer();
        for (int i = 0; i < length; i++) {
            number.append(s.charAt(new Random().nextInt(s.length())));
        }
        return number.toString();
    }

    public static String[] generateRandomWords(int numberOfWords)
    {
        String[] randomStrings = new String[numberOfWords];
        Random random = new Random();
        for(int i = 0; i < numberOfWords; i++)
        {
            char[] word = new char[random.nextInt(8)+3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
        }
        return randomStrings;
    }
}
