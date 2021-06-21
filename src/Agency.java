package project;

	public class Agency{
	private String agency_name;
    private String address;
    private String Semt ;
    private String City;
    private String number;
    private boolean delete;
    private int id;
    private double totalincome;

    public Agency(String agency_name, String address, String Semt, String City, String number, boolean delete, int id,double totalincome) {
        this.agency_name = agency_name;
        this.address = address;
        this.Semt = Semt;
        this.City = City;
        this.number = number;
        this.delete = delete;
        this.id = id;
        this.totalincome=totalincome;
    }

    public String getAgency_name() {
        return agency_name;
    }

    public void setAgency_name(String agency_name) {
        this.agency_name = agency_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSemt() {
        return Semt;
    }

    public void setSemt(String Semt) {
        this.Semt = Semt;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

	public double getTotalincome() {
		return totalincome;
	}

	public void setTotalincome(double totalincome) {
		this.totalincome = totalincome;
	}
 }