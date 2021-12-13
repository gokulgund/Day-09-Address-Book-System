package com.bl.addressbooks;

import java.util.Scanner;

public class AddressBooks {
	
		public static void main(String[] args) {
			System.out.println("Welcome to Address Book System...!");
			Scanner sc = new Scanner(System.in);
			newAddressBook person = new newAddressBook();
			person.addContact();
			
			System.out.println("Enter Y To Edit The Contact");
			String op = sc.nextLine();
			person.editContact();
			if (op.equals("y") || op.equals("Y")) {

				System.out.println("You have Entered following data");
				System.out.println("The Contact Details After Editing : " + person);
			}

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
			return "firstName  = " + firstName + "\n"+
				   "lastName   = " + lastName + "\n"+
				   "city       = " + city + "\n"+
				   "state      = " + state + "\n"+
				   "zipCode    = " + zipCode + "\n" +
				   "phoneNumber= " + phoneNumber + "\n" +
				   "email      = " + email;

		}
	}
	
	class newAddressBook{
		
		Scanner sc = new Scanner(System.in);
		contactDetails person = new contactDetails();
	
	public void addContact() {
		
		System.out.println("Enter First Name : ");
		String firstName = sc.nextLine();
		System.out.println("Enter Last Name : ");
		String LastName = sc.nextLine();
		System.out.println("Enter City Name : ");
		String city = sc.next();
		System.out.println("Enetr State Name : ");
		String state = sc.next();
		System.out.println("Enter zipCode : ");
		int zipCode = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Phone Number : ");
		long phoneNumber = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Email Id : ");
		String email = sc.nextLine();
		
		person.setFirstName(firstName);
		person.setLastName(LastName);
		person.setCity(city);
		person.setState(state);
		person.setZipCode(zipCode);
		person.setPhoneNumber(phoneNumber);
		person.setEmail(email);
		System.out.println();
		System.out.println("The Contact is : \n" + person);
		
	}
	
	 public void editContact() {
	        System.out.println("Enter the firstName of person");
	        String editName = sc.nextLine();
	        if (editName.equalsIgnoreCase(person.getFirstName()))
	            addContact();
	        else
	            System.out.println("The Entered First Name Is Not Match");
	        editContact();
	    }
}

