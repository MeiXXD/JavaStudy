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
 * @description thread多线程
 */

public class MyThread extends Thread {
    private int mTicket = 100;
    private String mName;

    public MyThread(String name) {
        this.mName = name;
    }

    @Override
    public void run() {
        super.run();
        while (mTicket > 0) {
            System.out.println(mTicket-- + " is saled by " + Thread.currentThread().getName());
        }
    }
}
