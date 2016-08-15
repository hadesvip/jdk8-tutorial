package com.lambda;

import com.bean.User;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Created by wy33082 on 16-8-2.
 */
public class LambdaDemo {

    List<User> userList = null;

    @Before
    public void initData() {
        userList = new ArrayList<>();
        userList.add(new User("stu01", "admin", "admin", "管理员"));
        userList.add(new User("stu02", "yundan", "yundan", "管理员"));
        userList.add(new User("stu03", "张三", "zhangsan", "管理员"));
        userList.add(new User("stu04", "李四", "lisi", "管理员"));
    }

    /**
     *
     */
    @Test
    public void helloLambda() {

        new Thread(() -> System.out.println("hello lambda..")).start();
    }


    @Test
    public void labmbdaExpression() {

        //静态方法绑定引用
        //userList.forEach(System.out::println);

        // Comparator personComp = Comparator.comparing(User::getUserId);

        String str = "abc-efg-hij";


        Map<String, String> map = new HashMap<>();
        map.put("abc", "x");
        map.put("efg", "y");
        map.put("hij", "z");

        map.replaceAll(str::replace);
        map.replaceAll(String::concat);


        map.forEach((x, y) -> System.out.println(x + "-->" + y));

    }

}
