package util.rssreader;

import java.util.ArrayList;
import util.rssreader.stores.ArrayListRSSFeedStore;

public class test {
	public static void main(String[] args) {
		ArrayListRSSFeedStore feedStore = new ArrayListRSSFeedStore();

		RSSFeedReader.read("http://rss.cnn.com/rss/edition.rss",feedStore);

		ArrayList<RSSItem> list = feedStore.getList();

		for (RSSItem rssItem : list) {
		  System.out.println("guid: " + rssItem.getGuid());
		  System.out.println("title: " + rssItem.getTitle());
		  System.out.println("description: " + rssItem.getDescription());
		  System.out.println("link: " + rssItem.getLink());
		  System.out.println("" +rssItem.getPubDate());
		}
	}

}
