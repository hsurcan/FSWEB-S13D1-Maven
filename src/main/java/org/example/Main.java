package org.example;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(!isBarking) return false;
        if (clock < 0 || clock > 23) return false;
        if (clock >= 20 ||clock < 8) return true;
        return false;
    }


    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       if (isTeen(firstAge) || isTeen(secondAge) || isTeen(thirdAge)){
           return true;
       } else return false;
    }
    public static boolean isTeen(int number){
        return number >= 13 && number <= 19;
    }



    public static boolean isCatPlaying(boolean isSummer, int temp) {
     int minTemp = 25;
     int maxTemp = isSummer ? 45 : 35;

     if(temp >= minTemp && temp <= maxTemp){
         return true;
     } else return false;
    }

    public static double area(double width, double height) {
       if(width < 0 || height < 0){
           return -1;
       }
       return width * height;
    }

    public static double area(double radius) {
       if(radius < 0){
           return -1;
       }
       return radius * radius * Math.PI;
    }
}
