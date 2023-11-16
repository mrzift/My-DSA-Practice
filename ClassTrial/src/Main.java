class Cars{
    String Make;
    String Model;
    String ModelNum;
public void getInfo(){
    System.out.println(this.Make);
    System.out.println(this.Model);
}
    public void start(){
        System.out.println("Starting the car");
    }
    public void stop(){
        System.out.println("stopping the car");
    }
}
public class Main{
    public static void main(String [] args){
        Cars C1 = new Cars();
        C1.Make = "Nissan";
        C1.Model = "Sentera";
        C1.getInfo();
        C1.start();
        C1.stop();

    }
}