package 观察者模式;

public interface Observable {
	public void addObserver(Observer observer);
	
	public void deleteObserver(Observer observer);
	
	public void notifyObservers(String context);
}
