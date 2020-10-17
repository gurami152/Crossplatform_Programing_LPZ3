class Vehicle{

    private double speed;
    private double direction;
    private String owner;

    public Vehicle(){
        speed =1.0;
        direction=1.0;
        owner ="Denis";
    }

    public double getSpeed(){
        return this.speed;
    }


    public double getDirection(){
        return this.direction;
    }

    public String getOwner(){
        return this.owner;
    }

}
public class VehicleLab{
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.getSpeed());
        System.out.println(vehicle.getDirection());
        System.out.println(vehicle.getOwner());
    }
}
