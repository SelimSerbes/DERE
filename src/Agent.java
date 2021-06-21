package project;

public class Agent {
   
   private int id_agency;
   private int number_of_agent;
   private String name_of_agent;
   private String time_of_birth;
   private String adress_of_agent;
   private String district_of_agent;
   private String city_of_agent;
   private String callnumber;
   private String gender_of_agent;
   private boolean delete;
   private int counter_sell;
   private double salary;
   private int rent_count;
   private int for_sale_count;

   public double getSalary() {
       return salary;
   }

   public void setSalary(double salary) {
       this.salary = salary;
   }

   public int getCounter_sell() {
       return counter_sell;
   }

   public void setCounter_sell(int counter_sell) {
       this.counter_sell = counter_sell;
   }

   public Agent(int id_agency, String name_of_agent, String time_of_birth, String adress_of_agent, String district_of_agent, String city_of_agent, String callnumber, String gender_of_agent, boolean delete,int number_of_agent, int rent_count, int for_sale_count) {
       this.id_agency = id_agency;
       this.name_of_agent = name_of_agent; 
       this.time_of_birth = "Error Date";
		controll(time_of_birth);
       this.adress_of_agent = adress_of_agent;
       this.district_of_agent = district_of_agent;
       this.city_of_agent = city_of_agent;
       this.callnumber = callnumber;
       this.gender_of_agent = gender_of_agent;
       this.delete = delete;
	   this.number_of_agent = number_of_agent;
       this.counter_sell = 0;
       this.salary = 2000;
       this.rent_count=rent_count;
       this.for_sale_count=for_sale_count;
   }

   public int getNumber_of_agent() {
       return number_of_agent;
   }

   public void setNumber_of_agent(int number_of_agent) {
       this.number_of_agent = number_of_agent;
   }

   public String getName_of_agent() {
       return name_of_agent;
   }

   public void setName_of_agent(String name_of_agent) {
       this.name_of_agent = name_of_agent;
   }

   public String getTime_of_birth() {
       return time_of_birth;
   }

   public void setTime_of_birth(String time_of_birth) {
       this.time_of_birth = time_of_birth;
   }

   public String getAdress_of_agent() {
       return adress_of_agent;
   }

   public void setAdress_of_agent(String adress_of_agent) {
       this.adress_of_agent = adress_of_agent;
   }

   public String getDistrict_of_agent() {
       return district_of_agent;
   }

   public void setDistrict_of_agent(String district_of_agent) {
       this.district_of_agent = district_of_agent;
   }

   public String getCity_of_agent() {
       return city_of_agent;
   }

   public void setCity_of_agent(String city_of_agent) {
       this.city_of_agent = city_of_agent;
   }

   public String getCallnumber() {
       return callnumber;
   }

   public void setCallnumber(String callnumber) {
       this.callnumber = callnumber;
   }

   public String getGender_of_agent() {
       return gender_of_agent;
   }

   public void setGender_of_agent(String gender_of_agent) {
       this.gender_of_agent = gender_of_agent;
   }

   public boolean isDelete() {
       return delete;
   }

   public void setDelete(boolean delete) {
       this.delete = delete;
   }

   public int getId_agency() {
       return id_agency;
   }

   public void setId_agency(int id_agency) {
       this.id_agency = id_agency;
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
			time_of_birth = date;
		}
	}

public int getRent_count() {
	return rent_count;
}

public void setRent_count(int rent_count) {
	this.rent_count = rent_count;
}

public int getFor_sale_count() {
	return for_sale_count;
}

public void setFor_sale_count(int for_sale_count) {
	this.for_sale_count = for_sale_count;
}

   
}
