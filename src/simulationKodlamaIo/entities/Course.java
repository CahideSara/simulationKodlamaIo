package simulationKodlamaIo.entities;

public class Course {
	private int Id;
	private String name;
	private String description;
	private double unitPrice;
	private String category;
	private String educator;

	public Course() {
	}

	public Course(int id, String name, String description, double unitPrice, String category, String educator) {
		Id = id;
		this.name = name;
		this.description = description;
		this.unitPrice = unitPrice;
		this.category = category;
		this.educator = educator;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getEducator() {
		return educator;
	}

	public void setEducator(String educator) {
		this.educator = educator;
	}

}
