package com.pb.shavrov.hw13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final List<Integer> buffer = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        Thread producer = new Thread(new Producer());
        Thread consumer = new Thread(new Consumer());
        producer.start();
        consumer.start();
    }
}
