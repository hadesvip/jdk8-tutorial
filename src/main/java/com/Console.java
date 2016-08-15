package com;

import com.alibaba.fastjson.JSON;
import com.bean.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Created by wangyong on 2016/6/7.
 */
public class Console {
    public static void main(String[] args) {

//        Student student = new Student();
//        student.setUsername("admin");
//        student.setDesc("管理员");
//        student.setAge(23);
//        String jsonString = JSON.toJSONString(student);
//        System.out.println(jsonString);


        List<Student> studentList =
                Arrays.asList
                        (new Student[]{new Student("admin", "管理员", 23),
                                new Student("normal", "普通会员", 24),
                                new Student("trip", "游客", 25)});

    /*    studentList.forEach(student -> {
            System.out.println(student.getUsername());
            System.out.println(student.getDesc());
        });
*/

        Stream<Student> studentStream = studentList.stream();

        System.out.println(studentStream.count());


    }
}
