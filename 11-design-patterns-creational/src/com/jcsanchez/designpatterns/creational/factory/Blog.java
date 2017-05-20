package com.jcsanchez.designpatterns.creational.factory;

/**
 * Created by jsssn on 20-May-17.
 */
public class Blog extends Website {

    @Override
    protected void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
