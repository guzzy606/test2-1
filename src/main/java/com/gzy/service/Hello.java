/*
  projectName: gzy-test
  fileName: Abc.java
  packageName: com.gzy.gzytest.service
  date: 2020/02/28 1:31
  version: V1.0.0
  copyright(c) 2019-2025 银河系公司
 */
package com.gzy.service;

import java.util.ArrayList;
import java.util.List;

/**
 * @desc
 * @author guozhongyao
 * @date 2020/06/04 11:58
 */
public class Hello {

    public static void main(String[] args) {
        List<String> aa = new ArrayList<>();
        aa.add("1");
        aa.add("2");
        aa.add("3");
        aa.add("4");
        aa.add("6");
        aa.add("8");
        aa.forEach(System.out::println);
    }
}
