package 适配器模式;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IUserInfo youngGirl = new OuterUserInfo();
		for(int i = 0;i < 101;i++) {
			youngGirl.getMobileNumber();
		}
	}

}
