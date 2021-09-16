package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<MyCallable> tasks = new ArrayList<>();

        Callable<Integer> myCallable1 = new MyCallable();
        Callable<Integer> myCallable2 = new MyCallable();
        Callable<Integer> myCallable3 = new MyCallable();
        Callable<Integer> myCallable4 = new MyCallable();

        tasks.add((MyCallable) myCallable1);
        tasks.add((MyCallable) myCallable2);
        tasks.add((MyCallable) myCallable3);
        tasks.add((MyCallable) myCallable4);

        ExecutorService executor = (ExecutorService) Executors.newCachedThreadPool();
        executor.invokeAny(tasks);

        executor.shutdown();

    }

}


