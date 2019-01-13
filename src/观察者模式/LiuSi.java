package 观察者模式;

public class LiuSi implements Observer {
	public void update(String str) {
		System.out.println("刘斯：观察到韩非子活动，开始向老板汇报了。。。");
		this.happy(str);
		System.out.println("刘斯：哭死了\n");
	}
	
	private void happy(String context) {
		System.out.println("刘斯：因为"+context+",所以我快乐");
	}
}
