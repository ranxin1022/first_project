package xran.json;

import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GeoDate {

	
	public static void main(String[] args)
	{
		String pathname = System.getProperty("/");
		System.out.println(pathname);
		
		
		String grp ="2014-08-21 00:44:00";
		String result = String.valueOf((DateUtils.parseTime(grp+".000")).getTime());
		System.out.println("result: " + result);
		URL path1 = GeoDate.class.getResource("/");
		System.out.println(path1);
		ClassLoader cl = GeoDate.class.getClassLoader();
		URL path = cl.getResource("");
		//File file = new File(path);
		System.out.println(path.getPath());
	}
}

 class DateUtils
{
    private static final SimpleDateFormat DBTimeFormat = 
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    private static final SimpleDateFormat timeFormatRFC3339 = 
        new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX");

    public static Date parseTime(String s)
    {
        Date date;

        try
        {
            date = DBTimeFormat.parse(s);
        }
        catch(ParseException e)
        {
            System.err.println("ERROR: could not parse date in string \"" + s + "\"");
            date = new Date(0);
        }

        return date;
    }

    public static Date parseRFC3339Time(String s)
    {
        Date date;

        try
        {
            date = timeFormatRFC3339.parse(s);
        }
        catch(ParseException e)
        {
            System.err.println("ERROR: could not parse RFC3339 date in string \"" + s + "\"");
            date = new Date(0);
        }

        return date;
    }
}