package view;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import util.rssreader.RSSFeedReader;
import util.rssreader.RSSItem;
import util.rssreader.stores.ArrayListRSSFeedStore;


public class feedController {
          private ArrayListRSSFeedStore feedStore;
          private ArrayList<RSSItem> listRSS;
          private ListView<RSSItem> newsListView;
          
          public feedController() {
        	  this.feedStore  = new ArrayListRSSFeedStore();
        	  RSSFeedReader.read("http://rss.cnn.com/rss/edition.rss",feedStore);
        	  this.listRSS = feedStore.getList();
          }
          
       
          public ListView<RSSItem> generateObservableNews() {
        	    this.newsListView = new ListView<>();
    	  		ObservableList<RSSItem> newsObservable = FXCollections.observableList(listRSS);
    	  	    newsListView.setItems(newsObservable);
    	          newsListView.setCellFactory(new Callback<ListView<RSSItem>, ListCell<RSSItem>>(){
    	    
    	              public ListCell<RSSItem> call(ListView<RSSItem> p) {
    	                   
    	                  ListCell<RSSItem> cell = new ListCell<RSSItem>(){
    	                	  
    	                      protected void updateItem(RSSItem r, boolean bln) {
    	                          super.updateItem(r, bln);
    	                          if (r != null) {
    	                              setText("Title:\n" + r.getTitle() +  "\nDate: " + r.getPubDate() + "\nLink:\n"+ r.getLink() );
    	                          }
    	                      }
    	   
    	                  };
    	                   
    	                  return cell;
    	              }
    	          });
    	          return  newsListView;
          }
}
