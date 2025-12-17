import jakarta.persistence.*;

public class studententity{
    @ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private INTEGER id;
    private String name;
    private String email;

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }

}