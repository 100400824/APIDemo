package com.demo.server;

import net.sf.json.JSONObject;
import java.util.HashMap;
import java.util.Map;

public class Encryption {

    public static void main(String[] args) {

        test1("a","b");
    }


    public static String getEncryption(String type) {

        String value = "";

        if (type.equals("AES") || type.equals("aes")) {

            return "{\"status\":200,\"name\":\"R6+w5ifl/a+6QVHvjAZEhQ==\"}";

        }

        return value;
    }

    public static String getMoney(String str) {

        str = str.toUpperCase();

        if (str.equals("A")) {

            return "{\"status\":200,\"money\":\"1000\"}";

        } else if (str.equals("B")) {

            return "{\"status\":200,\"money\":\"2000\"}";

        }else {

            return "{\"status\":200,\"money\":\"0\"}";

        }

    }

    public static void test1(String str1,String str2) {

        Map map = new HashMap();

        map.put("str1",str1);

        map.put("str2",str2);

        if (str1.equals(str2)) {

            map.put("status","200");

        }else {

            map.put("status","400");

        }

        getJson(map);

    }

    private static void getJson(Map map) {

        JSONObject jsonObject = JSONObject.fromObject(map);

        String result = jsonObject.toString();

        System.out.println(result);

    }


}
