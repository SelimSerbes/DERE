package project;

public class RealEstate {
	private String type;
	private String status;
	private String adress;
	private String district;
	private String city;
	private int size;
	private int price;
	private int room_numb;
	private boolean delete;
	private int id_real_estate;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRoom_numb() {
		return room_numb;
	}

	public void setRoom_numb(int room_numb) {
		this.room_numb = room_numb;
	}

	public boolean isDelete() {
		return delete;
	}

	public void setDelete(boolean delete) {
		this.delete = delete;
	}

	public int getId_real_estate() {
		return id_real_estate;
	}

	public void setId_real_estate(int id_real_estate) {
		this.id_real_estate = id_real_estate;
	}

	public RealEstate(String type, String status, String adress, String district, String city, int size, int price,
			int room_numb, boolean delete, int id_real_estate) {
		this.type = type;
		this.status = status;
		this.adress = adress;
		this.district = district;
		this.city = city;
		this.size = size;
		this.price = price;
		this.room_numb = room_numb;
		this.delete = delete;
		this.id_real_estate = id_real_estate;
	}
}