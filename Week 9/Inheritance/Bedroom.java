
package OOP;

public class Bedroom {
    /*
    Class: Bedroom
    Attribute/s: type, bedroom_count
    Method/s: getters, setters
    */
    
    String type;
    int bedroom_count;
    
    public Bedroom(String type, int rooms){
        this.type = type;
        this.bedroom_count = rooms;
    }
    
    public String getType(){
        return this.type;
    }
    
    // Retrieve
    public int getRoomCount(){
        return this.bedroom_count;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    // To update/change value of the instance variable
    public void setRoomCount(int count){
        this.bedroom_count = count;
    }
   
}
