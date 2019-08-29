package 观察者模式;

public class Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Observer liSi = new LiSi();
		HanFeiZi hanFeiZi = new HanFeiZi();
		hanFeiZi.addObserver(liSi);
		hanFeiZi.haveBreakfast();
	}

}
