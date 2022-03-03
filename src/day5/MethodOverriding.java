package day5;

class Parent{
	int i;
	Parent(){
		
	}
	Parent(int i){
		this.i = i;
	}
	public void displayData() {
		System.out.println("value of i: "+i);
	}
}
class Child extends Parent{
	int j;
	Child(int j){
		this.j = j;
	}
	@Override
	public void displayData() {
		System.out.println("value of j: "+j);
	}
	
}



public class MethodOverriding {

	public static void main(String[] args) {
		Parent ObjParent = new Parent(7);
		ObjParent.displayData();
		ObjParent = new Child(15);
		ObjParent.displayData();
	}

}
