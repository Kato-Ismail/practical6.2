public class Type1 implements VehicleBehavior{
    private int Id = 100;
    private String Name = "Type1";

    public void moves(){
        System.out.println(" Type1 is Moving ");
    }

    public void stopMoving(){
        System.out.println(" Type1 has stopped moving ");
    }

    public int getId(){
        return Id;
    }
    public String getType(){
        return "Type1";
    }

    public String getName(){
        return Name;
    }
}
