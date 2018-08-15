import java.util.HashMap;
import java.util.Map;

public class TimeZoneDemo
{
    private Map<String, Integer> myMap = new HashMap<>();

    public static void main(String[] args)
    {
        TimeZoneDemo timeZoneDemo = new TimeZoneDemo();
        timeZoneDemo.demo();

    }

    private void demo()
    {
        myMap.put("EST", -5);
        myMap.put("CST", -6);
        myMap.put("MST", -7);
        myMap.put("PST", -8);
        myMap.put("GMT", 0);

        System.out.println(getTimeDiff("PST", "EST"));

    }

    private int getTimeDiff(String first, String second)
    {
        int one = myMap.get(first);
        int two = myMap.get(second);
        int answer = one-two;

        return answer;
    }

}
