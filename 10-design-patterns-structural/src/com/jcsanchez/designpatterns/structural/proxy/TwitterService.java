package com.jcsanchez.designpatterns.structural.proxy;

/**
 * Created by jsssn on 19-May-17.
 */
public interface TwitterService {
    public String getTimeline(String screenName);
    public void postToTimeline(String screenName, String message);
}
