package xran.json;

public class Filter {

	private String name;
	private String operator;
	private String value;
	
	public String toString()
	{
		return "Filter [name=" + name + ", operator=" + operator + ", value=" + value +"]"; 
	}
	
	public Filter(String name, String operator, String value)
	{
		this.name = name;
		this.operator = operator;
		this.value = value;
	}
	
	public Filter()
	{
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}
