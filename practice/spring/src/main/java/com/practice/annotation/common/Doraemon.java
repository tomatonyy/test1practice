package com.practice.common;


@Primary
public class Doraemon implements Pocket {

    @Override
    public void show() {
        System.out.println("주머니에서 꺼낸 인공위성이야");
    }
}
