package com.example.myapplication;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;

public class Map {

    int width, height;
    int data[];
    List<Room> map_room = new ArrayList();
    Map(int width, int height) {
        this.width = width;
        this.height = height;

        /*data = new int[width*height];
        for(int i =0; i<width; i++){
            data[i]=0;
        }*/

    }



    Room create(){
        int w = 100 + (int)(Math.random()*width)/3;
        int h = 100 + (int)(Math.random()*height)/3;
        Room room = new Room((int)(Math.random()*Math.random()*width),
                (int)(Math.random()*Math.random()*height),w,h);
        return room;

    }

    int numberOfHalls(){
        return (int)(Math.random()*100)%4;
    }


    void generate(int roomCount){
        map_room.clear();


    }




    void drawMap(Canvas canvas){
        Paint p =new Paint();
        p.setColor(Color.GRAY);
        for(Room r:map_room){
            canvas.drawRect(r.x, r.y, r.x+r.width, r.height+r.y, p);
        }
    }
}
