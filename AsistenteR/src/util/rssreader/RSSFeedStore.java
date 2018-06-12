package util.rssreader;

public interface RSSFeedStore {
    void clear();
    void add(RSSItem currentItem);
}
