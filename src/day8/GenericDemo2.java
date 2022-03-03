package day8;

public class GenericDemo2<a,b> {
	a obj1;
	b obj2;
	public a getObj1() {
		return obj1;
	}
	public void setObj1(a obj1) {
		this.obj1 = obj1;
	}
	public b getObj2() {
		return obj2;
	}
	public void setObj2(b obj2) {
		this.obj2 = obj2;
	}
	
	public void display() {
		System.out.println("value1:"+getObj1()+"value2:"+getObj2());
	}

}
