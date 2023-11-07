package com.green.day29.normal2;

import com.green.day29.Woofer;

public class HamanSpeaker {
    private Woofer woofer;

    public HamanSpeaker(){
        woofer = new HanilWoofer();
    }

    public void speak(){
        System.out.println("하만 스피커 : 소리! 소리! 소리!");
        woofer.soundBase();
    }
}
