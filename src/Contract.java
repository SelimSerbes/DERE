package project;

public class Contract {
	private int real_estate_id;
	private int customer_id;
	private int agent_id;
	private String contract_date;
	private int id;
	private boolean delete;

	public Contract(int real_estate_id, int customer_id, int agent_id, String contract_date, int id, boolean delete) {
		super();
		this.real_estate_id = real_estate_id;
		this.customer_id = customer_id;
		this.agent_id = agent_id;
		this.contract_date = "Error Date";
		controll(contract_date);
		this.id = id;
		this.delete = delete;
	}

	public int getReal_estate_id() {
		return real_estate_id;
	}

	public void setReal_estate_id(int real_estate_id) {
		this.real_estate_id = real_estate_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getAgent_id() {
		return agent_id;
	}

	public void setAgent_id(int agent_id) {
		this.agent_id = agent_id;
	}

	public String getContract_date() {
		return contract_date;
	}

	public void setContract_date(String contract_date) {
		this.contract_date = contract_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isDelete() {
		return delete;
	}

	public void setDelete(boolean delete) {
		this.delete = delete;
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
			contract_date = date;
		}
	}
}
