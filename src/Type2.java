public class Type2 implements VehicleBehavior{
    private int Id = 200;
    private String Name = "Type2";

    public void moves(){
        System.out.println("Moving is moving" );
    }

    public void stopMoving(){
        System.out.println("Stop moving" );
    }

    public int getId(){
        return Id;
    }

    public String getType(){
        return "Type2";
    }

    public String getName(){
        return Name;
    }
}
