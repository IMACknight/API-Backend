package com.acknight.project.provider;


import java.util.concurrent.CompletableFuture;

public interface DemoService {
    
    String sayHello(String name);
    
    default CompletableFuture<String> sayHelloAsync(String name) {
        return CompletableFuture.supplyAsync(() -> sayHello(name));
    }
}
