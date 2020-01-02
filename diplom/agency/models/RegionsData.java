package agency.models;

public class RegionsData {
	
	private int idRegion;
	private int nameRegion;
	
	public int getIdRegion() {
		return idRegion;
	}
	
	public void setIdRegion(int idRegion) {
		this.idRegion = idRegion;
	}
	
	public int getNameRegion() {
		return nameRegion;
	}
	
	public void setNameRegion(int nameRegion) {
		this.nameRegion = nameRegion;
	}
	
	@Override
	public String toString() {
		return "RegionsData [idRegion = " + idRegion + ", nameRegion = " + nameRegion + "]";
	}

}
