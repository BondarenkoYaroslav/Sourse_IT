package agency.models;

public class HotelsData {

	private int idHotel;
	private int idFood;
	private String nameHotel;
	private int starsHotel;

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public int getIdFood() {
		return idFood;
	}

	public void setIdFood(int idFood) {
		this.idFood = idFood;
	}

	public String getNameHotel() {
		return nameHotel;
	}

	public void setNameHotel(String nameHotel) {
		this.nameHotel = nameHotel;
	}

	public int getStarsHotel() {
		return starsHotel;
	}

	public void setStarsHotel(int starsHotel) {
		this.starsHotel = starsHotel;
	}

	@Override
	public String toString() {
		return "HotelsData [idHotel = " + idHotel + ", idFood = " + idFood + ", nameHotel = " + nameHotel
				+ ", starsHotel = " + starsHotel + "]";
	}
}
