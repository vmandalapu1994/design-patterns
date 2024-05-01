package com.design_pattern.state.implementation1;

public class MusicPlayer {

    private State state;

    public MusicPlayer() {
        this.state = new StopState();

    }

    public void setState(State state) {
        this.state = state;
    }

    public void pressPlay() {
        this.state.pressPlay(this);
    }

    public void pressPause() {
        this.state.pressPause(this);
    }

    public void pressStop() {
        this.state.pressStop(this);
    }

}
