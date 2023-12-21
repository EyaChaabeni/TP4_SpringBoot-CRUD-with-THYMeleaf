package net.javaguides.springboot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private Integer id;
    private String name;
    private String desgn;
    private String emailId;
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}
	public Object getEmailId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getDesgn() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setEmailId(Object emailId2) {
		// TODO Auto-generated method stub
		
	}
	public void setDesgn(Object desgn2) {
		// TODO Auto-generated method stub
		
	}
}
