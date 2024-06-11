package com.abdelqodous.qa1z0_829.q30;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.*;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Set<Callable<String>> workers = new HashSet<>();

        workers.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "1";
            }
        });
        workers.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "2";
            }
        });
        workers.add(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "3";
            }
        });

        /*for (int i = 0; i < 3; i++) {
            String result = executorService.invokeAny(cThreads);
            System.out.println(result);
        }*/

        /*executorService.submit(cThreads);*/

        /*List< Future< String>> features = executorService.invokeAny(workers);
        for (Future<String> future: features){
            System.out.println(future.get());
        }*/

        List<Future<String>> futures = executorService.invokeAll(workers);
        for (Future<String> future:futures){
            System.out.println(future.get());
        }
    }
}
