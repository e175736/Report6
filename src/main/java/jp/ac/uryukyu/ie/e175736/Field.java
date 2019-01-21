package jp.ac.uryukyu.ie.e175736;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<Koma> komaList;
    private int ynum = 0;
    private int xnum = 0;

    public Field(int xnum, int ynum){
        this.xnum = xnum;
        this.ynum = ynum;
    }

    public Field() {

    }

    public void prepare(){
        this.komaList = new ArrayList<>();
        for(int y=0;y<this.ynum;y++){
            for(int x=0;x<this.xnum;x++){
                Koma koma = new Koma(x,y);
                this.komaList.add(koma);
            }
        }
    }
    public Koma getKoma(int y, int x){
        for(Koma koma : this.komaList){
            int[]pos = koma.getPosition();
            if(pos[0]==y && pos[1]==x){
                return koma;
            }
        }
        return null;
    }
    public void feature(){
        String [][] board = new String[ynum][xnum];
        for(Koma koma : this.komaList){
            int[] pos = koma.getPosition();
            String state = koma.getState();
            board[pos[1]][pos[0]] = state;
        }
        System.out.println("\n\t0\t1\t2\t3\t4\t5\n");
        for(int y=0;y<board.length;y++){
            System.out.println(y+"\t");
            for(int x=0;x<board[0].length;x++){
                String b = board[y][x];
                System.out.print(b+"\t");
            }
            System.out.println("\n");
        }
    }

    public void putKoma(int i, int i1, String b) {
    }

    public void changeStoneColor(int i, int i1, String w) {
    }
}
