package day8;

public class GenericDemo<Any> {
	Any obj;

	public Any getObj() {
		return obj;
	}

	public void setObj(Any obj) {
		this.obj = obj;
	}
	
	public void display() {
		System.out.println("Value:"+getObj());
	}

}
