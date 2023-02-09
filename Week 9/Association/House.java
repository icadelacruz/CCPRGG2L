
package OOP;

public class House {
    /*
        Class: House
        Attributes: lot_area, floor_area, rooms
        Methods: getRoom(), describeHouse(), main()
    */
    
    double lot_area;
    double floor_area;
    Bedroom rooms;
    
    public House(double lot, double floor, Bedroom rooms){
        this.lot_area = lot;
        this.floor_area = floor;
        this.rooms = rooms;
    }
    
    public Bedroom getRoom(){
        return rooms;
    }
    
    public void describeHouse(){
        System.out.println("Lot area: "+this.lot_area);
        System.out.println("Floor area: "+this.floor_area);
        System.out.println("Room type: "+this.getRoom().getType());
        System.out.println("Room count: "+this.getRoom().getRoomCount());
//        System.out.println(rooms.getType() + rooms.getRoomCount());
    }
    
    public static void main(String[] args) {
        Bedroom br1 = new Bedroom("Masters bedroom", 2);
        Bedroom br2 = new Bedroom("Twin", 4);
        House A = new House(44.38,36.7,br1);
        House B = new House(68.76, 59.25,br2);
        
        System.out.println(A.getRoom().getType());
        A.describeHouse();
        System.out.println(br1.getType());
        B.describeHouse();
    }
}
