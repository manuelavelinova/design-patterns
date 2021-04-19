package newsAgency;

import java.util.ArrayList;
import java.util.List;

public class News implements Observable {
	
	private List<Observer> tvChannels;
	private String news;
	
	public News() {
		this.tvChannels = new ArrayList<>();
	
	}

	@Override
	public void subscribe(Observer tvChannel) {
		this.tvChannels.add(tvChannel);
		tvChannel.setNews(this);
	}

	@Override
	public void unsubscribe(Observer tvChannel) {
		this.tvChannels.remove(tvChannel);
	}

	@Override
	public void notifyTVchannels() {
		for(Observer tvChannel: this.tvChannels) {
			tvChannel.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.news;
	}
	
	public void setNews(String news) {
		this.news = news;
		this.notifyTVchannels();	
		
	}
}
