package OOP;

public abstract class Polygon {
    int sides;
    
    public Polygon(){
        this.sides = 3;
    }

    
    //non-abstact method
    public int getSides(){
        return this.sides;
    }
    
    //abstract method
    public abstract int getPerimeter();
    public abstract void getEdges();
}
