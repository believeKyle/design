package 适配器模式;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser {
	public Map getUserBaseInfo() {
		HashMap baseInfoMap = new HashMap<>();
		baseInfoMap.put("userName","这个员工叫混世魔王..");
		baseInfoMap.put("mobileNumber","电话是");
		return baseInfoMap;
	}
	
	public Map getUserHomeInfo() {
		HashMap homeInfo = new HashMap<>();
		homeInfo.put("homeTelNumber","员工的家庭电话是..");
		homeInfo.put("homeAddress","员工的地址是");
		return homeInfo;
	}
	
	public Map getUserOfficeInfo() {
		HashMap officeInfo = new HashMap<>();
		officeInfo.put("jobPosition","这个人的职位是BOSS..");
		officeInfo.put("officeTelNumber","办公室电话是....");
		return officeInfo;
	}
	
}
