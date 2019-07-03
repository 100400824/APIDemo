package com.demo.API;

import com.demo.server.Login;
import com.demo.server.Order;
import com.demo.server.PayOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class Api {

    @RequestMapping("/login")
    @ResponseBody
    public static String doLogin(String username, String password) {

        String responseEntity;

        responseEntity = Login.loginSomeThing(username, password);

        return responseEntity;
    }

    @RequestMapping("/order")
    @ResponseBody
    public static String doOrder(String token, String productId) {

        String responseEntity;

        responseEntity = Order.doOrder(token, productId);

        return responseEntity;
    }


    @RequestMapping("/pay")
    @ResponseBody
    public static String doPay(String token, String productId, String orderId) {

        String responseEntity;

        responseEntity = PayOrder.doPay(token, productId, orderId);

        return responseEntity;
    }


    @RequestMapping("/help")
    @ResponseBody
    public static String zaoshu() throws Exception {

        String helpInfo;

        helpInfo =
                "URL地址：http://127.0.0.1:9527<br/>" +
                        "接口一：登录接口，账号admin,密码123123，登录成功后返回token值，作为其他接口调用<br/>" +
                        "接口地址：/login <br/>" +
                        "参数1：username=admin（需要生成数据类型，目前接口只支持生成webh5数据）<br/>" +
                        "参数2：password=123123（数据对应的产品APPKEY） <br/>" +
                        "<br/>" +
                        "接口二： 下单接口，提供产品ID，返回订单ID作为支付使用<br/>" +
                        "接口地址：/order <br/>" +
                        "参数1：token=Login接口返回的TOKEN值<br/>" +
                        "参数2：productId=1 （productID必须是大于0小于9999的数字） <br/>" +
                        "<br/>" +
                        "接口三： 支付接口，提供产品ID，订单ID，进行支付。<br/>" +
                        "接口地址：/pay <br/>" +
                        "参数1：token=Login接口返回的TOKEN值<br/>" +
                        "参数2：productId=1 （必须写入刚使用order接口时的productId）<br/>" +
                        "参数3：orderId=order接口返回的oderId <br/>"
        ;

        return helpInfo;
    }

}
