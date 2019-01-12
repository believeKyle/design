package 适配器模式;

public class UserInfo implements IUserInfo {
	public String getHomeAddress() {
		System.out.println("员工家庭地址");
		return null;
	}
	
	public String getHomeTelNumber() {
		System.out.println("员工家庭电话");
		return null;
	}
	
	public String getJobPosition() {
		System.out.println("职位是boss");
		return null;
	}
	
	public String getMobileNumber() {
		System.out.println("手机号码是0000...");
		return null;
	}
	
	public String getOfficeTelNumber() {
		System.out.println("办公室电话是...");
		return null;
	}
	
	public String getUserName() {
		System.out.println("姓名叫做...");
		return null;
	}
	
	
}
