package com.racing.domain;

public class Position {

    private int position;

    public Position(int position){
        this.position = position;
    }

    public void movePosition(){
        this.position++;
    }

    public int getPosition(){
        return position;
    }

}
