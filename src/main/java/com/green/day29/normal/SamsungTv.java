package com.green.day29.normal;

public class SamsungTv {
    private boolean isMute;
    private HamanSpeaker haman;
    public SamsungTv(){
        haman = new HamanSpeaker();

    }
    public void sound(){
        if(!isMute){
            haman.speak();
        }
    }
    public void toggleMute(){
        isMute = !isMute;
    }
}
