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
    public static void main(String[] args){
        System.out.println("Results of checking:");
        System.out.println(checkWithRegExp("_@BEST"));
        System.out.println(checkWithRegExp("vovan"));
        System.out.println(checkWithRegExp("vo"));
        System.out.println(checkWithRegExp("Z@OZA"));
    }
    public static boolean checkWithRegExp(String userNameString){
        Pattern p = Pattern.compile("^[a­z0­9_­]{3,15}$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }

}
