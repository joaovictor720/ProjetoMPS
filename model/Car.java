package model;

public class Car {
    private String renavam;
    private String plate;
    private String model;
    private String color;

    public void setRenavam(String login){
        this.renavam = login;
    }
    public void setPlate(String password){
        this.plate = password;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getRenavam(){
        return renavam;
    }
    public String getPlate(){
        return plate;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    
}
