package com.demo.server;

public class PayOrder {

    public static void main(String[] args) {

        System.out.println(doPay("abc123","2","4"));

    }

    public static String doPay(String token, String productId, String orderId) {

        if (!token.equals("abc123")) {

            return "请在登录后进行支付。。。";
        }

        int pid = -1;
        int oid = -1;

        try {

            pid = Integer.parseInt(productId);

        } catch (Exception e) {

            return "产品ID错误";
        }

        try {

            oid = Integer.parseInt(orderId);

        } catch (Exception e) {

            return "订单ID错误";
        }

        if (oid>9999 || pid>9999) {

            return "请检查订单号。。。。";
        }


        if (((oid) - 1) == pid) {

            return "支付成功";
        }


        return "订单号与产品ID不匹配。。。";
    }

}
