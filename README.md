## jdk8-tutorial

## 参考书籍->精通lambda表达式:java多核编程

1. java新特性介绍

2. Lambda表达式介绍

3. 使用Lambda表达式代替匿名内部类

4. Lambda表达式的作用

5. 外部迭代与内部迭代

6. java Lambda表达式语言详解

7. 函数式接口详解

8. 传递值与传递行为

9. Stream深度解析

10. Stream API详解

11. 串行流和并行流

12. Stream 构成

13. Stream 源生成方式

14. Stream操作类型

15. Stream转换

16. Optional详解

17. 默认方法详解

18. 方法与构造方法引用

19. Predicate接口详解

20. Function接口详解

21. Consumer接口剖析

22. Filter介绍

23. Map-Reduce讲解，中间操作与终止操作

24. 新的Date API分析

## lambda 表达式
1. lambda 介绍
- lambda 可以看成一个匿名方法，拥有更简洁的语法，可以省略修饰符，返回类型，throw是语句，在某些特定情况下还可以省略参数类型
2. lambda语法
- 参数列表 -> lambda体
    * 参数列表
    * lambda表达式可以接收任意数量的参数，单个参数可以不使用(),多个参数必须使用()

## jdk1.8官方文档

    http://docs.oracle.com/javase/8/docs/api/
    
## 规则引擎-drools    
1. 过生日，则加10分，并且将当月交易比数翻倍后再计算积分
2. 2011-01-08 - 2011-08-08每月信用卡还款3次以上，每满3笔赠送30分
3. 当月购物总金额100以上，每100元赠送10分
4. 当月购物次数5次以上，每五次赠送50分
5. 特别的，如果全部满足了要求，则额外奖励100分
6. 发生退货，扣减10分
7. 退货金额大于100，扣减100分  