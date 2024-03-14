package org.example;

import org.testng.annotations.Test;


public class MainTest {

    Main test;

    @Test
    public void testRun() throws InterruptedException {
        test = new Main();
        test.run();
        test.run2();
        test.run3();
        test.run4();
        test.run5();
        test.run6();
        test.run7();
        test.run8();
        test.run9();
        test.run10();
        test.run11();
    }
}