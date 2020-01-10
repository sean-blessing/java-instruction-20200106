package business;

public class Stuffy {
	private int id;
	private String type;
	private String color;
	private String size;	//small, medium, large, x-large
	private int limbs;
	
	public Stuffy() {
		super();
	}

	public Stuffy(int id, String type, String color, String size, int limbs) {
		super();
		this.id = id;
		this.type = type;
		this.color = color;
		this.size = size;
		this.limbs = limbs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getLimbs() {
		return limbs;
	}

	public void setLimbs(int limbs) {
		this.limbs = limbs;
	}

	//ex: a big red dog with 4 limbs
	@Override
	public String toString() {
		return "A "+size+" "+color+" "+type+" with "+limbs+" limbs.";
	}

	
}
