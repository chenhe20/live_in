package liv.ac.uk.live_in.util;

import org.apache.commons.codec.digest.DigestUtils;

public class PwdEncryptionUtil {

    private static final String salt = "!@#$%^&*()123456789qwertyuiop";

    public static String md5(String src){
        return DigestUtils.md5Hex(src);
    }

    public static String Md5PWd(String password){
        String str = salt.charAt(0)+salt.charAt(5)+password+salt.charAt(3)+salt.charAt(7)+salt.charAt(10);
        return md5(str);
    }

    public static String ReMd5PwdToDB(String password, String salt){
        String s = Md5PWd(password);
        String newPwd = salt.charAt(0)+s+salt.charAt(3);

        return md5(newPwd);
    }
}
