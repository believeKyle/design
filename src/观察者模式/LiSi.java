package 观察者模式;

public class LiSi implements Observer{
	public void update(String str) {
		System.out.println("李斯：观察到韩非子活动，开始向老板汇报了...");
		this.reportToQinShiHuang(str);
		System.out.println("李斯:汇报完毕...\n");
	}
	
	private void reportToQinShiHuang(String reprotContext) {
		System.out.println("李斯:报告，秦老板！韩非子有活动了---->"+reprotContext);
	}
}
