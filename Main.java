import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //int[] ns = { 1, 1, 2, 3, 5, 8 };
        //System.out.println(Arrays.toString(ns));
        City bj = new City();
        bj.setName(" ");
        bj.latitude = 39.903;
        bj.longitude = 116.401;
        System.out.println(bj.getName());
        System.out.println("Location: "+bj.latitude+", "+bj.longitude);
    }
}

class City{
    private String name;
    public double latitude;
    public double longitude;
    public void setName(String name){
        if (name==null || name.isBlank()){
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name.strip();
    }
    public String getName(){
        return this.name;
    }
}
