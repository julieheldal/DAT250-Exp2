package no.hvl.dat250.jpa.basicexample;
import javax.persistence.*;
import java.util.*;
@Entity
public class PinCode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pinCode;
    private int count;


    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getPinCode(){
        return pinCode;

    }
    public void setCount(int count){
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long Id) {
        this.id = Id;
    }


}
