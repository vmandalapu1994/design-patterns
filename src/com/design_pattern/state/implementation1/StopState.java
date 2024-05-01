package com.design_pattern.state.implementation1;

public class StopState implements State {
    @Override
    public void pressPlay(MusicPlayer musicPlayer) {
        System.out.println("Playing music");
        musicPlayer.setState(new PlayingState());
    }

    @Override
    public void pressPause(MusicPlayer musicPlayer) {
        System.out.println("Music is not playing");
    }

    @Override
    public void pressStop(MusicPlayer musicPlayer) {
        System.out.println("Already stopped");
    }
}
