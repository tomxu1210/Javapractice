import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //int[] ns = { 1, 1, 2, 3, 5, 8 };
        //System.out.println(Arrays.toString(ns));
        City bj = new City();
        bj.setName("Beijing");
        bj.latitude = 39.903;
        bj.longitude = 116.401;
        bj.setBirth(1949);
        String[] citygroupname = new String[]{"shanghai","beijing","guangzhou"};
        System.out.println(bj.getName()+" was builded " + bj.getAge()+" years");
        System.out.println("Location: "+bj.latitude+", "+bj.longitude);
        bj.setGroupnames(citygroupname);
        bj.displaystrings();
        citygroupname[0] = "Liaocheng";
        bj.displaystrings();
        int n = 80;
        bj.setAges(n);
        System.out.println(bj.getAges());
        n=60;
        System.out.println(bj.getAges());
        Person Ming = new Person();
        Ming.setname("Xiaoming");
        Ming.setAge(18);
        System.out.println(Ming.getAge());
    }
}

class City{
    private String [] names;
    private String name;
    public double latitude;
    public double longitude;
    private int birth;
    public int age;
    public void setGroupnames(String... groupcity){
        this.names = groupcity;
    }
    public void setAges(int age){
        this.age = age;
    }
    public int getAges(){
        return this.age;

    }
    public void displaystrings(){
        for(String cityname: this.names){
            System.out.println(cityname);
        }

    }
    public void setName(String name){
        if (name==null || name.isBlank()){
            throw new IllegalArgumentException("Invalid name");
        }
        this.name = name.strip();
    }
    public String getName(){
        return this.name;
    }
    public void setBirth(int year){
        this.birth = year;
    }
    public int getAge(){
        return calAge(2022);
    }
    private int calAge(int currentYear){
        return currentYear - this.birth;

    }
}
class Person{
    private String name;
    private int age;
    public void setname(String name){
        this.name = name;


    }
    public String getName(){
        return this.name;

    }
    public void setAge(int age){
        this.age = age;

    }
    public int getAge(){

        return this.age;
    }
}
