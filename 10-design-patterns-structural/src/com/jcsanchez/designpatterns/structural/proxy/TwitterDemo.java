package com.jcsanchez.designpatterns.structural.proxy;

/**
 * Created by jsssn on 19-May-17.
 */
public class TwitterDemo {

    public static void main(String[] args) {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());

        System.out.println(service.getTimeline("hello"));
    }
}
