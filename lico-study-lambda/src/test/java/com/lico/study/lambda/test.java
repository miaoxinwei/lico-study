package com.lico.study.lambda;

import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.*;

/**
 * 项目：lico-study
 * 包名：com.lico.study.lambda
 * 功能：
 * 时间：2017-06-15
 * 作者：呱牛
 */
public class test {

    @Test
    public void testFunctionalInterfaces() {
        // Predicate<T> —— 接收 T 并返回 boolean
        Predicate<String> predicate = Objects::isNull;
        System.out.println(predicate.test(null));

        // Consumer<T> —— 接收 T，不返回值
        Consumer<String> consumer = System.out::println;
        consumer.accept("consumer");

        // Function<T, R> —— 接收 T，返回 R
        Function<String, Integer> function = Integer::valueOf;
        System.out.println(function.apply("1"));

        // Supplier<T> —— 提供 T 对象（例如工厂），不接收值
        Supplier<String> supplier1 = () -> "1";
        System.out.println(supplier1.get());

        // Supplier<T> —— 提供 T 对象（例如工厂），不接收值
        Supplier<Bean> supplier2 = () -> new Bean("1");
        System.out.println(supplier2.get().toString());

        // UnaryOperator<T> —— 接收 T 对象，返回 T
        UnaryOperator<String> unaryOperator = x -> x;
        System.out.println(unaryOperator.apply("unaryOperator"));

        // BinaryOperator<T> —— 接收两个 T，返回 T
        BinaryOperator<Integer> binaryOperator = (x, y) -> x + y;
        System.out.println(binaryOperator.apply(1, 2));
        // 具体的BinaryOperator: IntBinaryOperator
        IntBinaryOperator intBinaryOperator = (x, y) -> x + y;
        System.out.println(intBinaryOperator.applyAsInt(1, 2));

        Comparator<Integer> byInt = Comparator.comparingInt(Integer::intValue);
        BinaryOperator<Integer> integerBinaryOperator = BinaryOperator.maxBy(byInt);
        System.out.println(integerBinaryOperator.apply(1, 2));
    }

    @Test
    public void oldRunnable() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("The old runnable now is using!");
            }
        }).start();
    }

    @Test
    public void lambdaRunnable() {
        new Thread(() -> System.out.println("The lambda runnable now is using!")).start();
    }

    @Test
    public void myRun() {
        new Thread((MyRun) () -> System.out.println("The my run now is using!")).start();
    }
}
