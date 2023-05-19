package utils;
import java.time.Duration;

//Selenium Behavior Driven-Development Example
//Author: Nathan Benatti Silva
public class Utils {
    static final Duration duration = Duration.ofSeconds(10);
    public static Duration getMaxWaitTime(){
        return duration;
    }
}
