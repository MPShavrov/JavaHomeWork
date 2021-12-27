package com.pb.shavrov.hw13;

public class Producer implements Runnable {
    @Override
    public void run() {
        System.out.println("Начало работы нового производителя.");
        while (true) {
            try {
                producerTest();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void producerTest() throws InterruptedException {
        synchronized (Main.buffer) {
            while (Main.buffer.size() == 5) {
                System.out.println("Производитель ожидает, потребляет");
                Main.buffer.wait();
            }
            while (Main.buffer.size() < 5) {
                Main.buffer.add((int) (Math.random() * 100));
            }
            System.out.println("Буфер заполнен производителем!");
            System.out.println("Данные в буфере:");
            for (Integer s : Main.buffer)
                System.out.print(s + " ");
            System.out.println("Работа производителя приостановлена на 5 секунд!");
            Thread.currentThread().sleep(5000);
            Main.buffer.notifyAll();
        }
    }
}