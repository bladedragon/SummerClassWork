package Utils;

import java.util.*;

public class CheckUtils {
    public static String token = "wxtoken";
    public static boolean checkSignature(String signature, String timestamp,String nonce){
        String[] arr = {token,timestamp,nonce};
        Arrays.sort(arr);
        StringBuffer sb = new StringBuffer();

        for(String s : arr){
            sb.append(s);

    }
    String temp = SHA1Utils.getSha1(sb.toString());
        return temp.equalsIgnoreCase(signature);
    }
}
