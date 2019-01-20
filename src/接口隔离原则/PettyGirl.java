package 接口隔离原则;

public class PettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {
	private String name;
	
	public PettyGirl(String _name) {
		this.name = _name;
	}
	
	public void goodLooking() {
		System.out.println(this.name + "---脸蛋很漂亮");
	}
	
	public void greatTemperament() {
		System.out.println(this.name + "---气质非常好");
	}
	
	public void niceFigure() {
		System.out.println(this.name + "---身材非常棒");
	}
}
