package 观察者模式;

public class Client {

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub
		Observer lisi = new LiSi();
		Observer wangsi = new WangSi();
		Observer liusi = new LiuSi();
		
		HanFeiZi hanFeiZi = new HanFeiZi();
		hanFeiZi.addObserver(lisi);
		hanFeiZi.addObserver(wangsi);
		hanFeiZi.addObserver(liusi);
		
		hanFeiZi.haveBreakfast();
		
	}

}
