public class Car {
    private String make, colour, name;
    private int year, price;
    public Car(String make,String name, String colour, int price, int year){
        this.make=make;
        this.colour=colour;
        this.price=price;
        this.year=year;
        this.name=name;
    }
    public void drive(String name, String make){
        this.name=name;
        this.make=make;
        String s="Your driving "+name+" from the maufacturer "+ make;
        System.out.println(s);
    }
    public String getMake(){
        return this.make;
    }
    public String getColour(){
        return this.colour;
    }
    public String getName(){
        return this.name;
    }
    public int getYear(){
        return  this.year;
    }
    public int getPrice(){
        return this.price;
    }
    public void setMake(String make){
        this.make=make;
    }
    public void setColour(String colour){
        this.colour=colour;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setYear(int year){
        this.year=price;
    }
    public void setPrice(int price){
        this.price=price;
    }
}
