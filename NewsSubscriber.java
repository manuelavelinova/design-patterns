package newsAgency;

public class NewsSubscriber implements Observer {
	
	private String nameChannel;//ËÏÂ Ì‡ Óbserver
	private Observable news;
	
	public NewsSubscriber(String nameChannel) {
		this.nameChannel = nameChannel;		
	}
	

	@Override
	public void update() {
		if (this.news == null) {
			System.out.println(this.getName() + " has no news  ");
			return;
		}
		String lastNews = this.news.getUpdate();
		
		System.out.println(this.getName() + " received news :  " + lastNews);
		

	}

	@Override
	public void setNews(Observable news) {
		this.news = news;

	}
	public String getName() {
		return nameChannel;
	}

}
