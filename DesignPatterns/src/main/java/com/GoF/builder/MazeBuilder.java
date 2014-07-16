package com.GoF.builder;

/**
 * Created by Loon on 2014/7/14.
 */
public abstract class MazeBuilder {
    abstract void buildMaze();

    abstract void buildRoom(int roomNumber);

    abstract void buildDoor(int roomFrom, int roomTo);

//    Maze getMaze(){
//        return  0;
//    }
}
