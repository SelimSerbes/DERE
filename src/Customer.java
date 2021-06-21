package project;

public class Customer {
	private String name_of_customer;
	private String date_of_birth;
	private String adress_of_customer;
	private String disctrict_of_customer;
	private String city_of_customer;

	public String getName_of_customer() {
		return name_of_customer;
	}

	public void setName_of_customer(String name_of_customer) {
		this.name_of_customer = name_of_customer;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getAdress_of_customer() {
		return adress_of_customer;
	}

	public void setAdress_of_customer(String adress_of_customer) {
		this.adress_of_customer = adress_of_customer;
	}

	public String getDisctrict_of_customer() {
		return disctrict_of_customer;
	}

	public void setDisctrict_of_customer(String disctrict_of_customer) {
		this.disctrict_of_customer = disctrict_of_customer;
	}

	public String getCity_of_customer() {
		return city_of_customer;
	}

	public void setCity_of_customer(String city_of_customer) {
		this.city_of_customer = city_of_customer;
	}

	public String getNumber_of_customer() {
		return number_of_customer;
	}

	public void setNumber_of_customer(String number_of_customer) {
		this.number_of_customer = number_of_customer;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isDelete() {
		return delete;
	}

	public void setDelete(boolean delete) {
		this.delete = delete;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String number_of_customer;
	private String gender;
	private boolean delete;
	private int id;

	public Customer(String name_of_customer, String date_of_birth, String adress_of_customer,
			String disctrict_of_customer, String city_of_customer, String number_of_customer, String gender,
			boolean delete, int id) {
		this.name_of_customer = name_of_customer;
		this.date_of_birth = "Error Date";
		controll(date_of_birth);
		this.adress_of_customer = adress_of_customer;
		this.disctrict_of_customer = disctrict_of_customer;
		this.city_of_customer = city_of_customer;
		this.number_of_customer = number_of_customer;
		this.gender = gender;
		this.delete = delete;
		this.id = id;
	}

	public void controll(String date) {
		String[] controll_array;
		controll_array = date.split("/");
		for (int i = 0; i < controll_array.length; i++) {
			controll_array[i]=controll_array[i].trim();
		}
		if (Integer.valueOf(controll_array[2]) > 2019 || Integer.valueOf(controll_array[1]) > 12
				|| Integer.valueOf(controll_array[0]) > 31) {
			System.out.println("Error date");
		} else if (Integer.valueOf(controll_array[2]) % 4 != 0 && Integer.valueOf(controll_array[1]) == 2
				&& Integer.valueOf(controll_array[0]) > 28) {
			System.out.println("Error date");
		} else if (Integer.valueOf(controll_array[2]) % 4 == 0 && Integer.valueOf(controll_array[1]) == 2
				&& Integer.valueOf(controll_array[0]) > 29) {
			System.out.println("Error date");
		} else if ((Integer.valueOf(controll_array[1]) == 4 || Integer.valueOf(controll_array[1]) == 6
				|| Integer.valueOf(controll_array[1]) == 9 || Integer.valueOf(controll_array[1]) == 11)
				&& Integer.valueOf(controll_array[0]) > 30) {
			System.out.println("Error date");
		} else {
			date_of_birth = date;
		}
	}
}