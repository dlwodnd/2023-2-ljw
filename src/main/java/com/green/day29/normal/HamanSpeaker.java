package com.green.day29.normal;

public class HamanSpeaker {
    private HanilWoofer woofer;

    public HamanSpeaker(){
        woofer = new HanilWoofer();
    }

    public void speak(){
        System.out.println("하만 스피커 : 소리! 소리! 소리!");
        woofer.soundBase();
    }
}
