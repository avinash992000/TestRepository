package day9;

public class UserDefinedExpDemo {

	public static void main(String[] args) {
		UserDefinedExpDemo obj = new UserDefinedExpDemo();
		try {
			obj.checkForVoteEligibility(10);
		}catch(InvalidAgeException e) {
			System.out.println(e);
		}

	}
	public void checkForVoteEligibility(int age) {
		if(age < 18) {
			throw new InvalidAgeException("InvalidAgeException for age:"+age);
		}else {
			System.out.println("you can vote");
		}
	}

}
