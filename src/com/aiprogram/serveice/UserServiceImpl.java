package com.aiprogram.serveice;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by 平凡的世界 on 2018/4/3.
 */
@Service("userServiceImpl")
public class UserServiceImpl  implements  UserService{
    @Override
    public String say(String value) {
        System.out.println(value);
        return "这是返回的值";
    }
}
