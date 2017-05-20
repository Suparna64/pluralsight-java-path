package com.jcsanchez.designpatterns.structural.proxy;

/**
 * Created by jsssn on 19-May-17.
 */
public class TwitterServiceStub implements TwitterService {

    @Override
    public String getTimeline(String screenName) {
        return "My timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
