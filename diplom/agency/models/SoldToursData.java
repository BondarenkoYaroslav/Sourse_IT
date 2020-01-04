package agency.models;

public class SoldToursData {

	private int idSold;
	private int idClient;
	private int idTour;

	public int getIdSold() {
		return idSold;
	}

	public void setIdSold(int idSold) {
		this.idSold = idSold;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public int getIdTour() {
		return idTour;
	}

	public void setIdTour(int idTour) {
		this.idTour = idTour;
	}

	@Override
	public String toString() {
		return "SoldToursData [idSold = " + idSold + ", idClient = " + idClient + ", idTour = " + idTour + "]";
	}
}
