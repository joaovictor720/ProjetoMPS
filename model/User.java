package model;

public class User {
    private String login;
    private String password;
    private String CPF;
    
    public void setLogin(String login){
        this.login = login;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public String getLogin(){
        return login;
    }
    public String getPassword(){
        return password;
    }
    public String getCPF(){
        return CPF;
    }
    
}
