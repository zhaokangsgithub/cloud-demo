package cn.zk.consumer.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName:  <br/>
 * Function:  ADD FUNCTION. <br/>
 * Reason:  ADD REASON(可选). <br/>
 * date:   <br/>
 *
 * @author
 * @since JDK 1.6
 */
public class DateUtil
{

    public static void dateFormatByEnglish(String timeString)
    {
//        String timeString ="Mon Jul 08 07:57:32 CST 2019";
        SimpleDateFormat sfEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sfStart = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy",java.util.Locale.ENGLISH) ;
        try
        {
            Date parse1 = sfStart.parse(timeString);
            String format = sfEnd.format(sfStart.parse(timeString));
           // Date parse = sfEnd.parse(format, pos);
            System.out.println(format);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        dateFormatByEnglish("Mon Jul 08 07:57:32 CST 2019");
    }


}
