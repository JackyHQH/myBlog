package com.hqh.blog.message.util;

public class tools {

    public static void testDelay(){

        try {
            Thread.sleep(100);
            System.out.println("3333----");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
