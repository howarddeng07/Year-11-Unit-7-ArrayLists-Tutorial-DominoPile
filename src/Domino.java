public class Domino {
    private int top;
    private int bottom;
    public Domino(){
        top=0;
        bottom=0;
    }
    public Domino(int top, int bottom){
        this.top = top;
        this.bottom = bottom;
    }
    public int getTop(){
        return top;
    }
    public int getBottom(){
        return bottom;
    }
    public void setTop(int x){
        top = x;
    }
    public void setBottom(int x){
        bottom = x;
    }
    public String toString(){
        return top + "/" + bottom;
    }
    public void flip(){
        int temp=top;
        top=bottom;
        bottom=temp;
    }
    public void settle(){
        if(bottom<top){
            flip();
        }
    }
    public int compareTo(Domino other){
        int x = Math.min(top,bottom);
        int y = Math.min(other.top,other.bottom);
        if(x<y){
            return -1;
        }else if(x>y){
            return 1;
        }
        x = Math.max(top,bottom);
        y = Math.max(other.top,other.bottom);
        if(x<y){
            return -1;
        }else if(x>y){
            return 1;
        }
        return 0;
    }
    public int compareToWeight(Domino other){
        int sum1 = top + bottom;
        int sum2 = other.top + other.bottom;
        if(sum1<sum2){
            return -1;
        }
        if(sum1>sum2){
            return 1;
        }
        return 0;
    }
    public boolean canConnect(Domino other){
        return top == other.top || top == other.bottom || bottom == other.top || bottom == other.bottom;
    }
}