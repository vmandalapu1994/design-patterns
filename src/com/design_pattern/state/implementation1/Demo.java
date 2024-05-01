package com.design_pattern.state.implementation1;

public class Demo {

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.pressPlay();
        musicPlayer.pressPlay();
        musicPlayer.pressPause();
        musicPlayer.pressStop();
        musicPlayer.pressStop();
        musicPlayer.pressPlay();
    }

}
