package newsAgency;

public class NewsAgencyMain {

	public static void main(String[] args) {
		
		News news = new News();
		
		 Observer chnl1 = new NewsSubscriber("Channel 01");
		 Observer chnl2 = new NewsSubscriber("Channel BTV");
		 Observer chnl3 = new NewsSubscriber("Channel Nova");
		 Observer chnl4 = new NewsSubscriber("Channel CNN");
		 
		 news.subscribe(chnl1);
		 news.subscribe(chnl2);
		 news.subscribe(chnl3);
		 news.subscribe(chnl4);
		 
		 news.setNews("New type of fuel found in Bulgaria.");
		 news.setNews("They have annouced the name of Prince Harry's daughter");
		 
	}

}
