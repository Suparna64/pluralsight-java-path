package com.jcsanchez.designpatterns.creational.factory;

/**
 * Created by jsssn on 20-May-17.
 */
public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG:
                return new Blog();
            case SHOP:
                return new Shop();
            default:
                return null;
        }
    }
}
