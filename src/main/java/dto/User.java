package dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Entity
@Data
public class User {
	@Id
	@GeneratedValue(generator = "x")
	@SequenceGenerator(name = "x",sequenceName = "x",initialValue = 1214561,allocationSize = 1)
	int id;
	String firstName;
	String lastName;
	String email;
	long mobile;
	String gender;
	String password;
	Date dob;
	int age;
	double wallet;

}
