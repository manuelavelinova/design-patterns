package newsAgency;

public interface Observable {
	
	void subscribe(Observer tvChannel);
	void unsubscribe(Observer tvChannel);
	
	void notifyTVchannels();
	
	String getUpdate();

}
