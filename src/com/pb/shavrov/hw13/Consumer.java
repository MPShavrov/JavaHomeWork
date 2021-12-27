package com.pb.shavrov.hw13;

public class Consumer implements Runnable {
    @Override
    public void run() {
        System.out.println("Начало работы нового потребителя.");
        while (true) {
            try {
                consumerTest();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void consumerTest() throws InterruptedException {
        synchronized (Main.buffer) {
            while (Main.buffer.size() == 0) {
                System.out.println("Потребитель ожидает пока в буфере появятся данные...");
                Main.buffer.wait();
            }
            System.out.println("Потребитель считал содержимое буфера:");
            System.out.println("Данные в буфере:");
            for (Integer s : Main.buffer) {
                System.out.print(s + " ");
            }
            Main.buffer.clear();
            System.out.println("Буфер пуст!");
            Main.buffer.notifyAll();
        }
    }
}
