import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ChangePhone {
    public static boolean checkWithRegExp(String PhoneString){
        Pattern p = Pattern.compile("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{10}$");
        Matcher m = p.matcher(PhoneString);
        return m.matches();
    }

    public static String replaceWithRegExp(String PhoneString){
        Pattern p = Pattern.compile("^(8|\\+7)");
        String resStr = PhoneString.replaceFirst("^(8|\\+7)","+1");
        return resStr;
    }
    public static String replacePhoneNumb(String PhoneString){
        String code  = PhoneString.substring(1,2);
        String codeTown = PhoneString.substring(2,5);
        String first = PhoneString.substring(5,8);
        String second = PhoneString.substring(8,10);
        String third = PhoneString.substring(10,12);
        String resStr = "+"+code + " (" + codeTown + ") " + first + "-" + second + "-" + third ;
        return resStr;
    }

    public static String [] SplitString (String inStr)
    {
        ArrayList<String> tmp = new ArrayList<String>();
        for (String retval : inStr.split(" ")) {
            tmp.add(retval);
        }

        return tmp.toArray(new String [tmp.size()]);
    }

    public static  String ConcatString (String [] strIn)
    {
        String resStr="";
        for (int i = 0; i < strIn.length; i++)
        {
            resStr = resStr + " "+ strIn[i];
        }
        return resStr;

    }

    public static  String [] ReplaceStringList (String strIn)
    {
        String [] r = SplitString(strIn);

        for (int i = 0; i < r.length; i++)
        {
            if (checkWithRegExp(r[i])==true)
            {
                r[i] = replacePhoneNumb(replaceWithRegExp(r[i]));

            }
            //System.out.println('"' + r[i] + '"');
        }

        return r;

    }

    public static void main(String[] args){

       }


}
