
package OOP;

public class Pastry {
    /*
        Class name: Pastry    
        Attribute/s: flour, egg, sugar, baking_soda
        Method/s: bake()
    */
    
    String flour;
    int egg;
    double sugar;
    double baking_soda;
    
    public Pastry(String flour, int egg, double sugar, double baking_soda){
        this.flour = flour;
        this.egg = egg;
        this.sugar = sugar;
        this.baking_soda = baking_soda;
    }
    
    public void bake(){
        System.out.println("Baking ...");
        System.out.println("Flour: "+this.flour);
        System.out.println("Egg: "+this.egg);
        System.out.println("Suger: "+this.sugar);
        System.out.println("Baking soda: "+this.baking_soda);
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    public int getEgg() {
        return egg;
    }

    public void setEgg(int egg) {
        this.egg = egg;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getBaking_soda() {
        return baking_soda;
    }

    public void setBaking_soda(double baking_soda) {
        this.baking_soda = baking_soda;
    }
    
    
}
