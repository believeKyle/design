package 接口隔离原则;

public class Searcher extends AbstractSearcher {
	
	public Searcher(IGoodBodyGirl _pettyGirl) {
		super(_pettyGirl);
	}
	
	public void show() {
		System.out.println("--------美女的信息如下----------");
		super.pettyGirl.goodLooking();
		super.pettyGirl.niceFigure();
		//super.pettyGirl.greatTemperament();
	}

}
