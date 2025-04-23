package Jdbc_app;

public class PojoEmp {
	private int id;
	private String name;
	private String sal;
	
	public PojoEmp(int id, String name, String sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "PojoEmp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	
	
}
