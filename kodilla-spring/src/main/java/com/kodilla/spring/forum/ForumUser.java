package com.kodilla.spring.forum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    String userName;

    public ForumUser() {
        this.userName = "John Smith";
    }
}
