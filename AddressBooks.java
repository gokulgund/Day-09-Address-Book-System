package com.bl.addressbooks;

public class AddressBooks {
	
		public static void main(String[] args) {
			System.out.println("Welcome to Address Book System...!");
			contactDetails newContact = new contactDetails();
			newContact.setFirstName("Gokul \n");
			newContact.setLastName("Gund \n");
			newContact.setCity("AhmadNagar");
			newContact.setState("Maharashtra \n");
			newContact.setZipCode(414501);
			newContact.setEmail("gokulgund15@gmail.com");
			newContact.setPhoneNumber(9623481808l);
			System.out.println("The Contact is : \n" + newContact);

		}

	}

	class contactDetails {
		private String firstName;
		private String lastName;
		private String city;
		private String state;
		private int zipCode;
		private long phoneNumber;
		private String email;

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public int getZipCode() {
			return zipCode;
		}

		public void setZipCode(int zipCode) {
			this.zipCode = zipCode;
		}

		public long getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return "firstName  = " + firstName + 
				   "lastName   = " + lastName +
				   "city       = " + city + "\n"+
				   "state      = " + state +
				   "zipCode    = " + zipCode + "\n" +
				   "phoneNumber= " + phoneNumber + "\n" +
				   "email      = " + email;

		}

	}


