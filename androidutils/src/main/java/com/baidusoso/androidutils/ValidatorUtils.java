package com.baidusoso.androidutils;

import java.util.regex.Pattern;

/**
 * Created by masel on 2016/7/4.
 */
public class ValidatorUtils {

    private static final String REGEX_USERNAME = "^[a-zA-Z]\\w{5,17}$";
    private static final String REGEX_PASSWORD = "^[a-zA-Z0-9]{6,16}$";
    private static final String REGEX_MOBILE = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9])|(17[0,5-9]))\\d{8}$";
    private static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
    private static final String REGEX_CHINESE = "^[\u4e00-\u9fa5],{0,}$";
    private static final String REGEX_ID_CARD = "(^\\d{18}$)|(^\\d{15}$)";
    private static final String REGEX_URL = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w-]*[./?%&=]*)?";
    private static final String REGEX_IP4_ADDR = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";

    private ValidatorUtils() {
    }

    public static boolean isUsername(String username) {
        return Pattern.matches(REGEX_USERNAME, username);
    }

    public static boolean isPassword(String password) {
        return Pattern.matches(REGEX_PASSWORD, password);
    }

    public static boolean isMobile(String mobile) {
        return Pattern.matches(REGEX_MOBILE, mobile);
    }

    public static boolean isEmail(String email) {
        return Pattern.matches(REGEX_EMAIL, email);
    }

    public static boolean isChinese(String chinese) {
        return Pattern.matches(REGEX_CHINESE, chinese);
    }

    public static boolean isIDCard(String idCard) {
        return Pattern.matches(REGEX_ID_CARD, idCard);
    }

    public static boolean isUrl(String url) {
        return Pattern.matches(REGEX_URL, url);
    }

    public static boolean isIP4Addr(String ipAddr) {
        return Pattern.matches(REGEX_IP4_ADDR, ipAddr);
    }
}
