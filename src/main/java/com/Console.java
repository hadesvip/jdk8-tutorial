package com;

import com.bean.Apple;
import com.functions.AppleFormatter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by wangyong on 2016/6/7.
 */
public class Console {
//    public static void main(String[] args) {
//
////        Student student = new Student();
////        student.setUsername("admin");
////        student.setDesc("管理员");
////        student.setAge(23);
////        String jsonString = JSON.toJSONString(student);
////        System.out.println(jsonString);
//
//
//        List<Student> studentList =
//                Arrays.asList
//                        (new Student[]{new Student("admin", "管理员", 23),
//                                new Student("normal", "普通会员", 24),
//                                new Student("trip", "游客", 25)});
//
//    /*    studentList.forEach(student -> {
//            System.out.println(student.getUsername());
//            System.out.println(student.getDesc());
//        });
//*/
//
//        Stream<Student> studentStream = studentList.stream();
//
//        System.out.println(studentStream.count());
//
//
//    }


    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate) {
        List<Apple> result = new ArrayList<>();
        inventory.forEach(apple -> {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        });
        return result;
    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
        inventory.forEach(apple -> {
            String output = formatter.accept(apple);
            System.out.println(output);
        });
    }


    public static void main(String[] args) {

        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple(10, "red"));
        appleList.add(new Apple(12, "green"));
        appleList.add(new Apple(180, "red"));
        appleList.add(new Apple(160, "green"));

//        List<Apple> filterGreenApples = filterApples(appleList, Apple::isGreenApple);
//        filterGreenApples.forEach(System.out::println);
//
//        List<Apple> filterHeavyApple = filterApples(appleList, Apple::isHeavyApple);
//        filterHeavyApple.forEach(System.out::println);

        // 传递lambda表达式方式
//        prettyPrintApple(appleList, apple -> apple.getWeight() > 100 ? "heavy" : "light");
//        prettyPrintApple(appleList, apple -> apple.getWeight() + "g");

        //静态方法方式
        prettyPrintApple(appleList, Apple::appleFancyFormatter);
        prettyPrintApple(appleList, Apple::appleSimpleFormatter);


    }


}
