package com.design_pattern.state.implementation1;

public class PlayingState implements State {
    @Override
    public void pressPlay(MusicPlayer musicPlayer) {
        System.out.println("Already playing music");
    }

    @Override
    public void pressPause(MusicPlayer musicPlayer) {
        System.out.println("Pausing music");
        musicPlayer.setState(new PausedState());
    }

    @Override
    public void pressStop(MusicPlayer musicPlayer) {
        System.out.println("Stopped the music");
        musicPlayer.setState(new StopState());
    }
}
