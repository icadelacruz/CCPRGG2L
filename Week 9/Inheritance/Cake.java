
package OOP;

public class Cake extends Pastry{
    /*
        Class name: Cake
        Parent class: Pastry
        Attribute/s: parent attributes + frosting
        Method/s: bake() [overriden method], decorate() [call bake() first]
    */
    
    String frosting;
    
    public Cake(String flour, int egg, double sugar, double baking_soda,String frosting){
        super(flour, egg, sugar, baking_soda);
        this.frosting = frosting;
    }
    
    @Override
    public void bake(){
        super.bake();
        System.out.println("Frosting: "+this.frosting);
    }
    
    public void decorate(){
        super.bake();
        System.out.println("Decorating with "+this.frosting+"frosting");
    }
    
    public static void main(String[] args) {
        Cake cake = new Cake("Cake flour",3,2,1.5,"Chocolate");
        cake.bake();
        System.out.println("---------------------");
        cake.decorate();
    }
}
