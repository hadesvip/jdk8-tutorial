package com.functions;

import com.bean.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wy33082 on 16-8-3.
 */
public class FunctionDemo {

    /**
     * function要求其参数与其结果拥有相同类型
     */
    @Test
    public void helloFunction() {

        List<User> userList = new ArrayList<>();
        userList.add(new User("stu01", "admin", "admin", "管理员"));
        userList.add(new User("stu02", "yundan", "yundan", "管理员"));
        userList.add(new User("stu03", "张三", "zhangsan", "管理员"));
        userList.add(new User("stu04", "李四", "lisi", "管理员"));


//        userList.replaceAll(user -> user = new User("user-->" + user.getUserId(), user.getUserName(), user.getUserPwd(), user.getUserDesc()));
        userList.replaceAll(user -> user = new User("user-->" + user.getUserId(), user.getUserName(), user.getUserPwd(), user.getUserDesc()));

        userList.forEach(System.out::println);
    }
}
