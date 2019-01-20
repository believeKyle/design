package 迪米特法则;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Girl> listGirls = new ArrayList<Girl>();
		for(int i = 0;i < 20;i ++) {
			listGirls.add(new Girl());
		}
		
		Teacher teacher = new Teacher();
		teacher.commond(new GroupLeader(listGirls));
	}

}
