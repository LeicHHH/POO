package util.rssreader.stores;

import util.rssreader.RSSFeedStore;
import util.rssreader.RSSItem;
import java.util.Collection;
import java.util.HashMap;

public class HashMapRSSFeedStore implements RSSFeedStore {

    HashMap<String, RSSItem> map = new HashMap<String, RSSItem>();

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public void add(RSSItem currentItem) {
        map.put(currentItem.getGuid(), currentItem);
    }

    public Collection<RSSItem> getItems() {
        return map.values();
    }
}
