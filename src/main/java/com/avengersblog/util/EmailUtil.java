package com.avengersblog.util;

public class EmailUtil {
    public static String getEmailMessage(String name, String host, String token){
        return "Hello " + name + ",\n\nYour new account has been created. please click the link below to verify your account. \n\n" +
                getVerificationUrl(host,token) + "\n\nThe support Team";
    }

    private static String getVerificationUrl(String host, String token) {
        return host + "/api/users?token=" + token;
    }

}


