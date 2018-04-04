package com.aiprogram.serverce;

import org.springframework.stereotype.Service;

/**
 * Created by 平凡的世界 on 2018/4/3.
 */
@Service("userServiceImpl")
public class UserServiceImpl  implements  UserService{
    @Override
    public void say() {
        System.out.println("哈哈");
    }
}
