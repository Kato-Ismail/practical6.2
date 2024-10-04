import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<VehicleBehavior> objects = new ArrayList<>();
        objects.add(new Type1());
        objects.add(new Type2());
        objects.add(new Type3());

        for (VehicleBehavior obj : objects) {
            System.out.println("Type" + obj.getType());
            obj.moves();

            System.out.println("Id Value" + obj.getId());

            if (obj instanceof Type1) {
                Type1 type = (Type1) obj;
                System.out.println("Name" + type.getName());
            }else if (obj instanceof Type2) {
                Type2 type = (Type2) obj;
                System.out.println("Name" + type.getName());
            }else if (obj instanceof Type3) {
                Type3 type = (Type3) obj;
                System.out.println("Name" + type.getName());
            }

            obj.stopMoving();
            System.out.println();
        }
    }
}