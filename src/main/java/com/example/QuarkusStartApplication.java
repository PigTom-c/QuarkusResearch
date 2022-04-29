package com.example;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

/**
 * @Author csijun
 * @Date 2022/4/29
 */
@QuarkusMain
public class QuarkusStartApplication implements QuarkusApplication {
    @Override
    public int run(String... args) throws Exception {
        Quarkus.waitForExit();
        return 0;
    }

    public static void main(String[] args) {
        Quarkus.run(QuarkusStartApplication.class, args);
    }
}
