package com.design_pattern.state.implementation1;

public class PausedState implements State {
    @Override
    public void pressPlay(MusicPlayer musicPlayer) {
        System.out.println("Resumed the music");
        musicPlayer.setState(new PlayingState());
    }

    @Override
    public void pressPause(MusicPlayer musicPlayer) {
        System.out.println("Music already paused");
    }

    @Override
    public void pressStop(MusicPlayer musicPlayer) {
        System.out.println("Stopped the music");
        musicPlayer.setState(new StopState());
    }
}
