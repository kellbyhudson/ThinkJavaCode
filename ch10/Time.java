public class Time
{
    private int hour;
    private int minute;

    public Time(int hour, int minute)
    {
        this.hour = hour;
        this.minute = minute;
    }

    public Time(int hour, int minute, boolean pm)
    {
        if (pm)
        {
            this.hour = hour + 12;
        }
        else
        {
            this.hour = hour;
        }
        this.minute = minute;
    }

    public String getMilitaryTime()
    {
        String hr = "";
        String min = "";
        if(hour <= 9)
        {
            hr += "0";
        }
        hr += ""+this.hour;

        if(minute <= 9)
        {
            min += "0";
        }
        min += ""+this.minute;
        return "" + hr + ":" + min + "";
    }

    public String getTime()
    {
        String ampm = "AM";
        if (this.hour / 12 == 1)
        {
            this.hour = this.hour % 12;
            ampm = "PM";
        }
        return "" + hour + ":" + minute + " " + ampm;
    }
}
