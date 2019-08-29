package 观察者模式;

import java.util.ArrayList;

public class HanFeiZi implements Observable, IHanFeiZi{
	
	private ArrayList<Observer> observerList = new ArrayList<Observer>();
	
	public void addObserver(Observer observer) {
		this.observerList.add(observer);
	}
	
	public void deleteObserver(Observer observer) {
		this.observerList.remove(observer);
	}
	
	public void notifyObservers(String context) {
		for(Observer observer:observerList) {
			observer.update(context);
		}
	}
	
	public void haveBreakfast() {
		System.out.println("韩非子：开始吃饭了...");
		this.notifyObservers("韩非子在吃饭");
	}
	
	public void haveFun() {
		System.out.println("韩非子：开始娱乐了...");
		this.notifyObservers("韩非子在娱乐");
	}
}
