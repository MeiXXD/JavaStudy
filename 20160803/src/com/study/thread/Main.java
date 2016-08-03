/*
 * CMB Confidential
 *
 * Copyright (C) 2016 China Merchants Bank Co., Ltd. All rights reserved.
 *
 * No part of this file may be reproduced or transmitted in any form or by any
 * means, electronic, mechanical, photocopying, recording, or otherwise, without
 * prior written permission of China Merchants Bank Co., Ltd.
 */

package com.study.thread;

/**
 * @author lifeng
 * @version 1.0 16/8/3
 * @description 测试类
 */
public final class Main {
    private Main() {
    }

    /**
     * main方法
     *
     * @param args 参数
     */
    public static void main(String[] args) {
//        //各自运行,互不影响
//        MyThread myThread1 = new MyThread("windows 1");
//        MyThread myThread2 = new MyThread("windows 2");
//        MyThread myThread3 = new MyThread("windows 3");
//
//        myThread1.start();
//        myThread2.start();
//        myThread3.start();
//
//        //各自运行,互不影响
//        MyRunnable myRunnable1 = new MyRunnable("windows 1");
//        MyRunnable myRunnable2 = new MyRunnable("windows 2");
//        MyRunnable myRunnable3 = new MyRunnable("windows 3");
//
//        Thread thread1 = new Thread(myRunnable1);
//        Thread thread2 = new Thread(myRunnable2);
//        Thread thread3 = new Thread(myRunnable3);
//
//        thread1.start();
//        thread2.start();
//        thread3.start();

        //同步运行
        MySyncRunnable runnable = new MySyncRunnable("windows");
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
