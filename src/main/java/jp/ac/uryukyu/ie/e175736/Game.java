package jp.ac.uryukyu.ie.e175736;

public class Game {
    public static void main(String[] args){
        Field field = new Field(6,6);
        field.prepare();
        field.putKoma(2,2,"B");
        field.feature();
    }
}
