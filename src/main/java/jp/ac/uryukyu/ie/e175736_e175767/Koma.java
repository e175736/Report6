package jp.ac.uryukyu.ie.e175736_e175767;

public class Koma {
    private String state; // オセロの石の色が、黒ならB、 白ならW、 何も無いならE　とする。
    private int x;
    private int y;

    public Koma(int x,int y){
        this.state = "E";
        this.x = x;
        this.y = y;

    }

    public String getState(){
        return this.state;

    }

    public void setState(String state){
        this.state = state;

    }

    public int[] getPosition(){
        int[]pos = {this.x, this.y};
        return pos;

    }

}
