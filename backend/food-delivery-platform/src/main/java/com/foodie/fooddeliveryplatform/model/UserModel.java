package com.foodie.fooddeliveryplatform.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class UserModel {
	
	private int id;

	
	private String fullName;

	
	private String email;

	
	private String password;

	
	private String phoneNumber;

	
	private String dob;

	
	private String gender;

	
	private String address;

	
	private String dietarypreference;

	
	private String allergiesorFoodRestrictions;

	
	private String PreferredCuisine;


	private String FavoriteIngredients;

	
	private String PreferredDeliveryMethod;


	private String NotificationPreferences;

	private String PreferredLanguage;

	private String ReferralCode;

	public UserModel() {
		super();
	}

	public UserModel(int id, String fullName, String email, String password, String phoneNumber, String dob,
			String gender, String address, String dietarypreference, String allergiesorFoodRestrictions,
			String preferredCuisine, String favoriteIngredients, String preferredDeliveryMethod,
			String notificationPreferences, String preferredLanguage, String referralCode) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.dietarypreference = dietarypreference;
		this.allergiesorFoodRestrictions = allergiesorFoodRestrictions;
		PreferredCuisine = preferredCuisine;
		FavoriteIngredients = favoriteIngredients;
		PreferredDeliveryMethod = preferredDeliveryMethod;
		NotificationPreferences = notificationPreferences;
		PreferredLanguage = preferredLanguage;
		ReferralCode = referralCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDietarypreference() {
		return dietarypreference;
	}

	public void setDietarypreference(String dietarypreference) {
		this.dietarypreference = dietarypreference;
	}

	public String getAllergiesorFoodRestrictions() {
		return allergiesorFoodRestrictions;
	}

	public void setAllergiesorFoodRestrictions(String allergiesorFoodRestrictions) {
		this.allergiesorFoodRestrictions = allergiesorFoodRestrictions;
	}

	public String getPreferredCuisine() {
		return PreferredCuisine;
	}

	public void setPreferredCuisine(String preferredCuisine) {
		PreferredCuisine = preferredCuisine;
	}

	public String getFavoriteIngredients() {
		return FavoriteIngredients;
	}

	public void setFavoriteIngredients(String favoriteIngredients) {
		FavoriteIngredients = favoriteIngredients;
	}

	public String getPreferredDeliveryMethod() {
		return PreferredDeliveryMethod;
	}

	public void setPreferredDeliveryMethod(String preferredDeliveryMethod) {
		PreferredDeliveryMethod = preferredDeliveryMethod;
	}

	public String getNotificationPreferences() {
		return NotificationPreferences;
	}

	public void setNotificationPreferences(String notificationPreferences) {
		NotificationPreferences = notificationPreferences;
	}

	public String getPreferredLanguage() {
		return PreferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		PreferredLanguage = preferredLanguage;
	}

	public String getReferralCode() {
		return ReferralCode;
	}

	public void setReferralCode(String referralCode) {
		ReferralCode = referralCode;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", fullName=" + fullName + ", email=" + email + ", password=" + password
				+ ", phoneNumber=" + phoneNumber + ", dob=" + dob + ", gender=" + gender + ", address=" + address
				+ ", dietarypreference=" + dietarypreference + ", allergiesorFoodRestrictions="
				+ allergiesorFoodRestrictions + ", PreferredCuisine=" + PreferredCuisine + ", FavoriteIngredients="
				+ FavoriteIngredients + ", PreferredDeliveryMethod=" + PreferredDeliveryMethod
				+ ", NotificationPreferences=" + NotificationPreferences + ", PreferredLanguage=" + PreferredLanguage
				+ ", ReferralCode=" + ReferralCode + "]";
	}
	
	
	


}
