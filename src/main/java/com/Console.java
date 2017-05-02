package com;

import com.bean.Apple;
import com.functions.AppleFormatter;
import com.functions.BufferedReaderProcessor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.LongToDoubleFunction;
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

    public static String processFile(BufferedReaderProcessor p) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("file/data.txt"))) {
            return p.process(br);
        }

    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> results = new ArrayList<>();
        list.forEach(element -> {
            if (predicate.test(element)) {
                results.add(element);
            }
        });
        return results;
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

        Comparator<Apple> appleComprator =
                (a, b) -> a.getWeight() < b.getWeight() ? -1 : (a.getWeight() == b.getWeight() ? 0 : 1);


//        String oneLine = processFile((BufferedReader br) -> br.readLine());

        // java8 内置的3个函数接口
        //1.predicate
        filter(appleList, apple -> apple.getWeight() > 120);

        //2.consumer
        appleList.forEach(apple -> System.out.println(apple.getColor()));

        //3.function
        IntFunction<String> intFunction = (int i) -> i + "-";
        String apply = intFunction.apply(20);
        System.out.println(apply);

        LongToDoubleFunction num = i -> i;
        double v = num.applyAsDouble(20);
        System.out.println(v);

        //IntPredicate
        IntPredicate evenNumbers = (int i) -> i % 2 == 0;
        evenNumbers.test(1000);

        final int port = 1337;
        Runnable runnable = () -> System.out.println(port);
        //port = 1111;



    }


}
