package com.demo.server;

public class Order {

    public static void main(String[] args) {

        System.out.println(doOrder("abc123", "1"));


    }

    public static String doOrder(String token, String productId) {

        if (!token.equals("abc123")) {

            return "请登录后下单。。。";
        }

        int pid = -1;

        try {
            pid = Integer.parseInt(productId);

        } catch (Exception e) {

            return "产品ID错误";
        }

        if (pid >= 0) {

            if (pid <= 9999) {

                String orderId = "" + (pid + 1);

                return "orderId=" + orderId;
            }
        }

        return "产品不存在：产品ID大于0小于9999";
    }

}
