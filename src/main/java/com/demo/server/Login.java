package com.demo.server;

public class Login {

    public static void main(String[] args) {

        System.out.println(loginSomeThing("admin","123123"));

    }

    public static String loginSomeThing(String userName,String passWord) {

        if (userName.equals("admin") ) {

            if (passWord.equals("123123")) {

                return "token=abc123";
            }
        }
        return "账号密码错误";
    }

}
