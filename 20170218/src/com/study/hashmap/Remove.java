/*
 * CMB Confidential
 *
 * Copyright (C) 2016 China Merchants Bank Co., Ltd. All rights reserved.
 *
 * No part of this file may be reproduced or transmitted in any form or by any
 * means, electronic, mechanical, photocopying, recording, or otherwise, without
 * prior written permission of China Merchants Bank Co., Ltd.
 */

package com.study.hashmap;

import java.util.HashMap;

/**
 * @author lifeng
 * @version 1.0 2017/2/18
 * @description 测试从hashmap中remove元素之前是否需要判断该hashmap包含该元素
 */

public class Remove {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("123", "123");
        map.put("321", "321");
        map.remove("1234");
        // TODO: 2017/2/18 测试结果：并不需要事先判断是否包含该key元素
    }
}
