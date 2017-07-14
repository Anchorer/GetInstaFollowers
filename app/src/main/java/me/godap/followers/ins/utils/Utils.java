package me.godap.followers.ins.utils;

import org.apache.commons.codec.binary.Hex;

import java.net.URLEncoder;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import me.godap.followers.ins.component.Consts;

/**
 * Created by Anchorer on 2017/7/14.
 */

public class Utils {
    /**
     * Generate signed payload
     * @param payload Payload
     * @return Signed string
     */
    public static String generateSignature(String payload) {
        String parsedData;

        try {
            parsedData = URLEncoder.encode(payload, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            parsedData = payload;
        }

        String signedBody = generateHash(Consts.API_KEY, payload);

        return "ig_sig_key_version=" + Consts.API_KEY_VERSION + "&signed_body=" + signedBody + '.'
                + parsedData;
    }

    /**
     * Generate a Hmac SHA-256 hash
     * @param key key
     * @param string value
     * @return hashed
     */
    public static String generateHash(String key, String string) {
        SecretKeySpec object = new SecretKeySpec(key.getBytes(), "HmacSHA256");
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(object);
            byte[] byteArray = mac.doFinal(string.getBytes("UTF-8"));
            return new String(new Hex().encode(byteArray), "ISO-8859-1");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
