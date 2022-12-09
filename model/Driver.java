package model;

public class Driver extends User {    
    private String CNH;
    
    public void setCNH(String CNH){
        this.CNH = CNH;
    }
    
    public String getCNH(){
        return CNH;
    }
}
