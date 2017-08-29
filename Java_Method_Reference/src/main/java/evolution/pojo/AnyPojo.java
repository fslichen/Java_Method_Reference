package evolution.pojo;

public class AnyPojo {
	private Integer age;
	public AnyPojo(Integer age) {
		this.age = age;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public int compareByAge(AnyPojo anyPojo) {
		return age.compareTo(anyPojo.getAge());
	}
	@Override
	public String toString() {
		return "AnyPojo [age=" + age + "]";
	}
}
