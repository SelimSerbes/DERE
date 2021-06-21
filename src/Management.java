package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Management {

	private Agency object_agency[] = new Agency[999];
	private Agent object_agent[] = new Agent[999];
	private RealEstate object_realEstate[] = new RealEstate[999];
	private Customer object_Customer[] = new Customer[999];
	private Contract object_Contract[] = new Contract[999];
	private int count_of_agency = 0;
	private int count_of_agent = 0;
	private int count_of_realestate = 0;
	private int count_of_customer = 0;
	private int count_of_contract = 0;
	private BufferedReader br;
	private Scanner scan;

	public void read_file(String input_file) throws IOException {
		File file = new File(input_file);
		br = new BufferedReader(new FileReader(file));
		String st;
		String spliting[];
		while ((st = br.readLine()) != null) {
			spliting = st.split(";", -1);
			if (spliting[0].equalsIgnoreCase("displayAgencies")) {
				display_agency();
			} else if (spliting[0].equalsIgnoreCase("displayAgents")) {
				display_agent();
			} else if (spliting[0].equalsIgnoreCase("displayRealEstates")) {
				display_realestate();
			} else if (spliting[0].equalsIgnoreCase("displayCustomers")) {
				display_customer();
			} else if (spliting[0].equalsIgnoreCase("displayContracts")) {
				display_contract();
			} else if (spliting[0].equalsIgnoreCase("deleteAgency")) {
				delete_agency(spliting[1]);
			} else if (spliting[0].equalsIgnoreCase("deleteAgent")) {

				delete_agent(spliting[1]);
			} else if (spliting[0].equalsIgnoreCase("deleteRealEstate")) {

				delete_realEstate(spliting[1]);
			} else if (spliting[0].equalsIgnoreCase("deleteCustomer")) {

				delete_customer(spliting[1]);
			} else if (spliting[0].equalsIgnoreCase("deleteContract")) {

				delete_contract(spliting[1]);
			} else if (spliting[0].contains("add")) {
				add_function_catagories(spliting);
			} else if (spliting[0].equalsIgnoreCase("search")) {
				search(spliting[1], spliting[2], spliting[3], spliting[4], spliting[5], spliting[6], spliting[7]);
			} else if (spliting[0].equalsIgnoreCase("mostProfitableAgency")) {
				mostprofitable_agency(spliting[1]);
			} else if (spliting[0].equalsIgnoreCase("calculateTotalincome")) {
				calculate_totalincome(spliting[1]);
			} else if (spliting[0].equalsIgnoreCase("agentOfTheMonth")) {
				agentofthemonth(spliting[1]);
			} else if (spliting[0].equalsIgnoreCase("calculateSalaries")) {
				calculate_salaries(spliting[1]);
			}
		}
		
	}
	
	  public void type_input() throws IOException {
		while (true) {
			System.out.println("If you want to exit , write exit");
			scan = new Scanner(System.in);
			String input = scan.nextLine();
			String input_spliting[]=input.split(";",-1);
			if(input.contains("exit")) {
				break;
			}else if(input_spliting[0].equalsIgnoreCase("load")) {
				read_file(input_spliting[1]);
			}
			add_function_catagories(input_spliting);
			
		}
	}
	public void delete_agency(String id) {
		try {
			for (int i = 0; i < object_agency.length; i++) {
				if (object_agency[i].getId() == Integer.parseInt(id)) {
					object_agency[i].setDelete(false);
					break;
				}

			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("ID : " + Integer.parseInt(id) + " Not found delete agency ID");
			System.out.println();
		}

	}

	public void delete_agent(String id) {
		try {
			for (int i = 0; i < object_agent.length; i++) {
				if (object_agent[i].getNumber_of_agent() == Integer.parseInt(id)) {
					object_agent[i].setDelete(false);
					break;
				}

			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("ID : " + Integer.parseInt(id) + " Not found delete agent ID");
			System.out.println();
		}
	}

	public void delete_realEstate(String id) {
		try {
			for (int i = 0; i < object_realEstate.length; i++) {
				if (object_realEstate[i].getId_real_estate() == Integer.parseInt(id)) {
					object_realEstate[i].setDelete(false);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("ID : " + Integer.parseInt(id) + " Not found delete Real Estate ID");
			System.out.println();
		}
	}

	public void delete_customer(String id) {
		try {
			for (int i = 0; i < object_Customer.length; i++) {
				if (object_Customer[i].getId() == Integer.parseInt(id)) {
					object_Customer[i].setDelete(false);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("ID : " + Integer.parseInt(id) + " Not found delete Customer ID");
			System.out.println();
		}
	}

	public void delete_contract(String id) {
		try {
			for (int i = 0; i < object_Contract.length; i++) {
				if (object_Contract[i].getId() == Integer.parseInt(id)) {
					object_Contract[i].setDelete(false);
					break;
				}
			}
		} catch (Exception e) {
			System.out.println();
			System.out.println("ID : " + Integer.parseInt(id) + " Not found delete Contract ID");
			System.out.println();
		}
	}

	public void display_agency() {
		try {
			for (int i = 0; i < object_agency.length; i++) {
				if (object_agency[i].isDelete() == true) {
					System.out.println("Agency id is : " + object_agency[i].getId());
					System.out.println("Agency name is : " + object_agency[i].getAgency_name());
					System.out.println("Agency address is : " + object_agency[i].getAddress());
					System.out.println("Agency town is : " + object_agency[i].getSemt());
					System.out.println("Agency city is : " + object_agency[i].getCity());
					System.out.println("Agency phone is : " + object_agency[i].getNumber());
					System.out.println();
				}
			}
		} catch (Exception e) {
		}
	}

	public void display_agent() {
		try {
			for (int i = 0; i < object_agent.length; i++) {
				if (object_agent[i].isDelete() == true) {
					System.out.println("Agency id is : " + object_agent[i].getId_agency());
					System.out.println("Agent id is : " + object_agent[i].getNumber_of_agent());
					System.out.println("Agent name is : " + object_agent[i].getName_of_agent());
					System.out.println("Agent birthdate is : " + object_agent[i].getTime_of_birth());
					System.out.println("Agent address is : " + object_agent[i].getAdress_of_agent());
					System.out.println("Agent town is : " + object_agent[i].getDistrict_of_agent());
					System.out.println("Agent city is : " + object_agent[i].getCity_of_agent());
					System.out.println("Agent phone is : " + object_agent[i].getNumber_of_agent());
					System.out.println("Agent gender is : " + object_agent[i].getGender_of_agent());
					System.out.println();
				}
			}
		} catch (Exception e) {
		}
	}

	public void display_realestate() {
		try {
			for (int i = 0; i < object_realEstate.length; i++) {
				if (object_realEstate[i].isDelete() == true) {
					System.out.println("RealEstate id is : " + object_realEstate[i].getId_real_estate());
					System.out.println("RealEstate type is : " + object_realEstate[i].getType());
					System.out.println("RealEstate statu is : " + object_realEstate[i].getStatus());
					System.out.println("RealEstate address is : " + object_realEstate[i].getAdress());
					System.out.println("RealEstate town is : " + object_realEstate[i].getDistrict());
					System.out.println("RealEstate city is : " + object_realEstate[i].getCity());
					System.out.println("RealEstate surface area is : " + object_realEstate[i].getSize());
					System.out.println("RealEstate price is : " + object_realEstate[i].getPrice());
					System.out.println("RealEstate room is : " + object_realEstate[i].getRoom_numb());
					System.out.println();
				}
			}
		} catch (Exception e) {
		}
	}

	public void display_customer() {
		try {
			for (int i = 0; i < object_Customer.length; i++) {
				if (object_Customer[i].isDelete() == true) {
					System.out.println("Customer id is : " + object_Customer[i].getId());
					System.out.println("Customer name is : " + object_Customer[i].getName_of_customer());
					System.out.println("Customer birthdate is : " + object_Customer[i].getDate_of_birth());
					System.out.println("Customer address is : " + object_Customer[i].getAdress_of_customer());
					System.out.println("Customer town is : " + object_Customer[i].getDisctrict_of_customer());
					System.out.println("Customer city is : " + object_Customer[i].getCity_of_customer());
					System.out.println("Customer phone is : " + object_Customer[i].getNumber_of_customer());
					System.out.println("Customer gender is : " + object_Customer[i].getGender());
					System.out.println();
				}
			}
		} catch (Exception e) {
		}
	}

	public void display_contract() {
		try {
			for (int i = 0; i < object_Contract.length; i++) {
				if (object_Contract[i].isDelete() == true) {
					System.out.println("Contract id is : " + object_Contract[i].getId());
					System.out.println("Contract Real Estate id is : " + object_Contract[i].getReal_estate_id());
					System.out.println("Contract Customer id is : " + object_Contract[i].getCustomer_id());
					System.out.println("Contract Agent id is : " + object_Contract[i].getAgent_id());
					System.out.println("Contract Date is : " + object_Contract[i].getContract_date());

					System.out.println();
				}
			}
		} catch (Exception e) {
		}
	}

	public void add_function_catagories(String[] name) {
		if (name[0].equals("addAgency")) {
			object_agency[count_of_agency] = new Agency(name[1], name[2], name[3], name[4], name[5], true,
					count_of_agency + 1, 0);
			count_of_agency++;
		} else if (name[0].equals("addAgent")) {
			object_agent[count_of_agent] = new Agent(Integer.valueOf(name[1]), name[2], name[3], name[4], name[5],
					name[6], name[7], name[8], true, count_of_agent + 1, 0, 0);
			count_of_agent++;
		} else if (name[0].equals("addRealEstate")) {
			object_realEstate[count_of_realestate] = new RealEstate(name[1], name[2], name[3], name[4], name[5],
					Integer.valueOf(name[6]), Integer.valueOf(name[7]), Integer.valueOf(name[8]), true,
					count_of_realestate + 1);
			count_of_realestate++;
		} else if (name[0].equals("addCustomer")) {
			object_Customer[count_of_customer] = new Customer(name[1], name[2], name[3], name[4], name[5], name[6],
					name[7], true, count_of_customer + 1);
			count_of_customer++;
		} else if (name[0].equals("addContract")) {
			boolean flag_realEstate = true;
			boolean flag_customer = true;
			boolean flag_agent = true;
			boolean flag_second_id = true;
			if (Integer.valueOf(name[1]) > count_of_realestate + 1) {
				flag_realEstate = false;
			}
			if (Integer.valueOf(name[2]) > count_of_customer + 1) {
				flag_customer = false;
			}
			if (Integer.valueOf(name[3]) > count_of_agent + 1) {
				flag_agent = false;
			}
			if (flag_agent == true && flag_customer == true && flag_realEstate == true) {
				for (int i = 0; i < count_of_contract; i++) {
					if (object_Contract[i].getReal_estate_id() == Integer.valueOf(name[1])) {
						flag_second_id = false;
					}
				}
				if (flag_second_id == true) {
					object_Contract[count_of_contract] = new Contract(Integer.valueOf(name[1]),
							Integer.valueOf(name[2]), Integer.valueOf(name[3]), name[4], count_of_contract + 1, true);
					count_of_contract++;
				} else {
					System.out.println();
					System.out.println("Not added contract because there is same id");
					System.out.println();
				}

			} else {
				System.out.println("");
				System.out.println("Error Message for adding Contract");
				System.out.println("");
			}
		}
		if (name[0].equalsIgnoreCase("displayAgencies")) {
			display_agency();
		} else if (name[0].equalsIgnoreCase("displayAgents")) {
			display_agent();
		} else if (name[0].equalsIgnoreCase("displayRealEstates")) {
			display_realestate();
		} else if (name[0].equalsIgnoreCase("displayCustomers")) {
			display_customer();
		} else if (name[0].equalsIgnoreCase("displayContracts")) {
			display_contract();
		} else if (name[0].equalsIgnoreCase("deleteAgency")) {
			delete_agency(name[1]);
		} else if (name[0].equalsIgnoreCase("deleteAgent")) {

			delete_agent(name[1]);
		} else if (name[0].equalsIgnoreCase("deleteRealEstate")) {

			delete_realEstate(name[1]);
		} else if (name[0].equalsIgnoreCase("deleteCustomer")) {

			delete_customer(name[1]);
		} else if (name[0].equalsIgnoreCase("deleteContract")) {

			delete_contract(name[1]);
		 
		} else if (name[0].equalsIgnoreCase("search")) {
			search(name[1], name[2], name[3], name[4], name[5], name[6], name[7]);
		} else if (name[0].equalsIgnoreCase("mostProfitableAgency")) {
			mostprofitable_agency(name[1]);
		} else if (name[0].equalsIgnoreCase("calculateTotalincome")) {
			calculate_totalincome(name[1]);
		} else if (name[0].equalsIgnoreCase("agentOfTheMonth")) {
			agentofthemonth(name[1]);
		} else if (name[0].equalsIgnoreCase("calculateSalaries")) {
			calculate_salaries(name[1]);
		}

	}

	public void search(String type, String status, String town, String city, String surface, String price,
			String room) {
		System.out.println("---- Search Results ----");
		String surface_array[] = null;
		String price_array[] = null;
		String room_array[] = null;

		if (surface.contains("-")) {
			surface_array = surface.split("-");
			surface_array[0] = surface_array[0].trim();
			surface_array[1] = surface_array[1].trim();
		}
		if (price.contains("-")) {
			price_array = price.split("-");
			price_array[0] = price_array[0].trim();
			price_array[1] = price_array[1].trim();
		}
		if (room.contains("-")) {
			room_array = room.split("-");
			room_array[0] = room_array[0].trim();
			room_array[1] = room_array[1].trim();
		}

		int i = 0;
		while (object_realEstate[i] != null) {
			if ((type.equals("") || object_realEstate[i].getType().equalsIgnoreCase(type))
					&& (status.equals("") || object_realEstate[i].getStatus().equalsIgnoreCase(status))
					&& (town.equals("") || object_realEstate[i].getDistrict().equalsIgnoreCase(town))
					&& (city.equals("") || object_realEstate[i].getCity().equalsIgnoreCase(city))
					&& ((surface.equals("")) || (object_realEstate[i].getSize() >= Integer.valueOf(surface_array[0])
							&& object_realEstate[i].getSize() <= Integer.valueOf(surface_array[1])))
					&& ((price.equals("")) || (object_realEstate[i].getPrice() >= Integer.valueOf(price_array[0])
							&& object_realEstate[i].getPrice() <= Integer.valueOf(price_array[1])))
					&& ((room.equals("") || (object_realEstate[i].getRoom_numb() >= Integer.valueOf(room_array[0])
							&& object_realEstate[i].getRoom_numb() <= Integer.valueOf(room_array[1]))))) {

				System.out.println("*** Real Estate " + object_realEstate[i].getId_real_estate() + " ***");
				System.out.println("Flat: " + object_realEstate[i].getType());
				System.out.println("Address: " + object_realEstate[i].getAdress());
				System.out.println("Town: " + object_realEstate[i].getDistrict());
				System.out.println("City: " + object_realEstate[i].getCity());
				System.out.println("Surface area: " + object_realEstate[i].getSize());
				System.out.println("Price: " + object_realEstate[i].getPrice());
				System.out.println("Number of rooms: " + object_realEstate[i].getRoom_numb());
				System.out.println();

			}
			i++;
		}

	}

	public void mostprofitable_agency(String date) {
		String month_year_array[] = date.split("/");
		double temp = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		while (object_Contract[i] != null) {
			String spliting[] = object_Contract[i].getContract_date().split("/");
			spliting[0] = spliting[0].trim();
			spliting[1] = spliting[1].trim();
			spliting[2] = spliting[2].trim();
			if (spliting[1].equals(month_year_array[0]) && spliting[2].equals(month_year_array[1])) {
				while (object_realEstate[k] != null) {
					if (object_realEstate[k].getId_real_estate() == object_Contract[i].getReal_estate_id()) {
						if (object_realEstate[k].getStatus().equals("For Sale")) {
							temp = object_realEstate[k].getPrice() * 0.015;
						} else if (object_realEstate[k].getStatus().equals("For Rent")) {
							temp = object_realEstate[k].getPrice() * 0.80;
						}
						object_realEstate[k].setDelete(false);
						break;
					}
					k++;
				}
				k = 0;
				while (object_agent[j] != null) {
					if (object_agent[j].getNumber_of_agent() == object_Contract[i].getAgent_id()) {
						object_agency[object_agent[j].getId_agency() - 1].setTotalincome(
								object_agency[object_agent[j].getId_agency() - 1].getTotalincome() + temp);
					}
					j++;
				}
				j = 0;

			}
			i++;
		}
		int count = 0;
		int k2 = 0;
		double temp3;
		String temp2;
		while (object_agency[k2] != null) {
			count++;
			k2++;
		}
		String array[] = new String[count];
		double array2[] = new double[count];
		for (int d = 0; d < count; d++) {
			array[d] = object_agency[d].getAgency_name();
			array2[d] = object_agency[d].getTotalincome();
		}
		for (int k3 = 0; k3 < array2.length; k3++) {
			for (int k4 = 0; k4 < array2.length; k4++) {
				if (array2[k4] < array2[k3]) {
					temp3 = array2[k3];
					temp2 = array[k3];
					array2[k3] = array2[k4];
					array[k3] = array[k4];
					array2[k4] = temp3;
					array[k4] = temp2;
				}
			}

		}
		System.out.println("------ Most Profitable Agency ------");
		System.out.println(array[0] + " : " + array2[0] + " TL");
		System.out.println();
		int total2 = 0;
		while (object_agency[total2] != null) {
			object_agency[total2].setTotalincome(0);
			total2++;
		}
	}

	public void calculate_totalincome(String date) {
		String month_year_array[] = date.split("/");
		double temp = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		while (object_Contract[i] != null) {
			String spliting[] = object_Contract[i].getContract_date().split("/");
			spliting[0] = spliting[0].trim();
			spliting[1] = spliting[1].trim();
			spliting[2] = spliting[2].trim();
			if (spliting[1].equals(month_year_array[0]) && spliting[2].equals(month_year_array[1])) {
				while (object_realEstate[k] != null) {
					if (object_realEstate[k].getId_real_estate() == object_Contract[i].getReal_estate_id()) {
						if (object_realEstate[k].getStatus().equals("For Sale")) {
							temp = object_realEstate[k].getPrice() * 0.015;
						} else if (object_realEstate[k].getStatus().equals("For Rent")) {
							temp = object_realEstate[k].getPrice() * 0.80;
						}
						object_realEstate[k].setDelete(false);
						break;
					}
					k++;
				}
				k = 0;
				while (object_agent[j] != null) {
					if (object_agent[j].getNumber_of_agent() == object_Contract[i].getAgent_id()) {
						object_agency[object_agent[j].getId_agency() - 1].setTotalincome(
								object_agency[object_agent[j].getId_agency() - 1].getTotalincome() + temp);
					}
					j++;
				}
				j = 0;

			}
			i++;
		}
		int total = 0;
		int totalincome = 0;
		while (object_agency[total] != null) {
			totalincome += object_agency[total].getTotalincome();
			total++;
		}
		System.out.println("------ Total income of agencies ------ ");
		System.out.println(totalincome + " TL");
		System.out.println();
		int total2 = 0;
		while (object_agency[total2] != null) {
			object_agency[total2].setTotalincome(0);
			total2++;
		}

	}

	public void agentofthemonth(String date) {
		String month_year_array[] = date.split("/");
		int i = 0;
		int j = 0;
		int k = 0;
		while (object_Contract[i] != null) {
			String spliting[] = object_Contract[i].getContract_date().split("/");
			spliting[0] = spliting[0].trim();
			spliting[1] = spliting[1].trim();
			spliting[2] = spliting[2].trim();
			if (spliting[1].equals(month_year_array[0]) && spliting[2].equals(month_year_array[1])) {
				while (object_realEstate[k] != null) {
					if (object_realEstate[k].getId_real_estate() == object_Contract[i].getReal_estate_id()) {
						if (object_realEstate[k].getStatus().equals("For Sale")) {
							while (object_agent[j] != null) {
								if (object_agent[j].getNumber_of_agent() == object_Contract[i].getAgent_id()) {
									object_agent[j].setFor_sale_count(object_agent[j].getFor_sale_count() + 1);
								}
								j++;
							}
							j = 0;
						} else if (object_realEstate[k].getStatus().equals("For Rent")) {
							while (object_agent[j] != null) {
								if (object_agent[j].getNumber_of_agent() == object_Contract[i].getAgent_id()) {
									object_agent[j].setRent_count(object_agent[j].getRent_count() + 1);
								}
								j++;
							}
							j = 0;
						}

					}
					k++;
				}
				k = 0;

			}
			i++;
		}
		int count = 0;
		int k2 = 0;
		double temp3;
		String temp2;
		while (object_agent[k2] != null) {
			count++;
			k2++;
		}
		String array[] = new String[count];
		double array2[] = new double[count];
		for (int d = 0; d < count; d++) {
			array[d] = object_agent[d].getName_of_agent();
			array2[d] = object_agent[d].getFor_sale_count() + object_agent[d].getRent_count();
		}
		for (int k3 = 0; k3 < array2.length; k3++) {
			for (int k4 = 0; k4 < array2.length; k4++) {
				if (array2[k4] < array2[k3]) {
					temp3 = array2[k3];
					temp2 = array[k3];
					array2[k3] = array2[k4];
					array[k3] = array[k4];
					array2[k4] = temp3;
					array[k4] = temp2;
				}
			}

		}
		int temp_id = 0;
		int h = 0;
		while (object_agent[h] != null) {
			if (object_agent[h].getName_of_agent().equals(array[0])) {
				temp_id = object_agent[h].getNumber_of_agent();
			}
			h++;
		}
		System.out.println("------ Agent Of the Month ------");
		System.out.println(
				object_agent[temp_id - 1].getName_of_agent() + " with " + object_agent[temp_id - 1].getFor_sale_count()
						+ " sales and " + object_agent[temp_id - 1].getRent_count() + " rentals from "
						+ object_agency[object_agent[temp_id - 1].getId_agency() - 1].getAgency_name());
		System.out.println();
		int total2 = 0;
		while (object_agent[total2] != null) {
			object_agent[total2].setFor_sale_count(0);
			object_agent[total2].setRent_count(0);
			total2++;
		}
	}

	public void calculate_salaries(String date) {
		String month_year_array[] = date.split("/");
		double temp = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		while (object_Contract[i] != null) {
			String spliting[] = object_Contract[i].getContract_date().split("/");
			spliting[0] = spliting[0].trim();
			spliting[1] = spliting[1].trim();
			spliting[2] = spliting[2].trim();
			if (spliting[1].equals(month_year_array[0]) && spliting[2].equals(month_year_array[1])) {
				while (object_realEstate[k] != null) {
					if (object_realEstate[k].getId_real_estate() == object_Contract[i].getReal_estate_id()) {
						if (object_realEstate[k].getStatus().equals("For Sale")) {
							temp = object_realEstate[k].getPrice() * 5 / 1000;
						} else if (object_realEstate[k].getStatus().equals("For Rent")) {
							temp = object_realEstate[k].getPrice() * 0.20;
						}
						object_realEstate[k].setDelete(false);
						break;
					}
					k++;
				}
				k = 0;
				while (object_agent[j] != null) {
					if (object_agent[j].getNumber_of_agent() == object_Contract[i].getAgent_id()) {
						object_agent[j].setSalary(object_agent[j].getSalary() + temp);
					}
					j++;
				}
				j = 0;

			}
			i++;
		}
		int count = 0;
		int k2 = 0;
		double temp3;
		String temp2;
		while (object_agent[k2] != null) {
			count++;
			k2++;
		}
		String array[] = new String[count];
		double array2[] = new double[count];
		for (int d = 0; d < count; d++) {
			array[d] = object_agent[d].getName_of_agent();
			array2[d] = object_agent[d].getSalary();
		}
		for (int k3 = 0; k3 < array2.length; k3++) {
			for (int k4 = 0; k4 < array2.length; k4++) {
				if (array2[k4] < array2[k3]) {
					temp3 = array2[k3];
					temp2 = array[k3];
					array2[k3] = array2[k4];
					array[k3] = array[k4];
					array2[k4] = temp3;
					array[k4] = temp2;
				}
			}
		}
		System.out.println("Calculate Salaries " + date);
		int b = 1;
		for (int l = 0; l < array2.length; l++) {
			System.out.println("Agent " + b + " - " + array[l] + "\n" + array2[l]);
			b++;
		}
		System.out.println();

		for (int l = 0; l < object_agent.length; l++) {
			if (object_agent[l] != null) {
				object_agent[l].setSalary(2000);
			}
		}
	}
}
