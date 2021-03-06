package beans;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import enums.UserType;

public class User implements Serializable {
	
	private String username;
	private String password;
	private String name;
	private String surname;
	private String gender;
	private String dateOfBirth;
	private UserType userType;
	private List<Training> trainingsHistory;
	private int fee;
	private SportsObject sportsObject;
	private List<SportsObject> visitedSportsObjects;
	private int points;
	private CustomerType customerType;
	
	public User() {
		super();
	}

	public User(String username, String password, String name, String surname, String gender, String dateOfBirth,
			UserType userType, List<Training> trainingsHistory, int fee, SportsObject sportsObject,
			List<SportsObject> visitedSportsObjects, int points, CustomerType customerType) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.userType = userType;
		this.trainingsHistory = trainingsHistory;
		this.fee = fee;
		this.sportsObject = sportsObject;
		this.visitedSportsObjects = visitedSportsObjects;
		this.points = points;
		this.customerType = customerType;
	}
	



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getDateOfBirth() {
		return dateOfBirth;
	}



	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}



	public UserType getUserType() {
		return userType;
	}



	public void setUserType(UserType userType) {
		this.userType = userType;
	}



	public List<Training> getTrainingsHistory() {
		return trainingsHistory;
	}



	public void setTrainingsHistory(List<Training> trainingsHistory) {
		this.trainingsHistory = trainingsHistory;
	}



	public int getFee() {
		return fee;
	}



	public void setFee(int fee) {
		this.fee = fee;
	}



	public SportsObject getSportsObject() {
		return sportsObject;
	}



	public void setSportsObject(SportsObject sportsObject) {
		this.sportsObject = sportsObject;
	}



	public List<SportsObject> getVisitedSportsObjects() {
		return visitedSportsObjects;
	}



	public void setVisitedSportsObjects(List<SportsObject> visitedSportsObjects) {
		this.visitedSportsObjects = visitedSportsObjects;
	}



	public int getPoints() {
		return points;
	}



	public void setPoints(int points) {
		this.points = points;
	}



	public CustomerType getCustomerType() {
		return customerType;
	}



	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	private static final long serialVersionUID = 6640936480584723344L;

}
