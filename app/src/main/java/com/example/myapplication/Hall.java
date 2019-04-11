package com.example.myapplication;

public class Hall {
    int x, y, width, height, id;
    Hall(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.id = id;
    }
    Hall createHall(int roomX, int roomY, int roomWidth, int roomHeight) {
        Hall h = null;
        switch (id) {
            case 0: h = id0(roomX, roomY, roomWidth, roomHeight);
                break;
            case 1: h = id1(roomX, roomY, roomWidth, roomHeight);
                break;
            case 2: h = id2(roomX, roomY, roomWidth, roomHeight);
                break;
            case 3: h = id3(roomX, roomY, roomWidth, roomHeight);
                break;

        } return h;
    }

        Hall id0(int roomX, int roomY, int roomWidth, int roomHeight){
            Hall hall = null;
            return hall;

        }

        Hall id1(int roomX, int roomY, int roomWidth, int roomHeight){
            Hall hall = null;
            return hall;


        }
        Hall id2(int roomX, int roomY, int roomWidth, int roomHeight){
            Hall hall = null;
            return hall;


        }
        Hall id3(int roomX, int roomY, int roomWidth, int roomHeight){
            Hall hall = null;
            return hall;

        }




}
