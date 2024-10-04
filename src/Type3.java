public class Type3 implements VehicleBehavior{
    private int Id = 300;
    private String Name = "Type3";

    public void moves(){
        System.out.println(" Type3 is Moving ");
    }

    public void stopMoving(){
        System.out.println(" Type3 has stopped moving ");
    }

    public int getId(){
        return Id;
    }

    public String getType(){
        return "Type3";
    }

    public String getName(){
        return Name;
    }
}
