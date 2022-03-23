package PaqC01;

public class Integer {

    private int x;

    public Integer(){
        x=0;
    }

    public void setX(int x){
        this.x=x;
    }

    public int getX(){
        return this.x;
    }

    public void mostrar(){
        System.out.println(this.x);
    }

    public void incNum(){
        this.x++;
    }
}
