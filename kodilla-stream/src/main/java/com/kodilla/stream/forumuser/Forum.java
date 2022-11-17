package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    List<ForumUser> forumUsers = new ArrayList();
    public Forum(){
        forumUsers.add(new ForumUser(1,"Aaa",'m', LocalDate.of(1999,11,10),20));
        forumUsers.add(new ForumUser(2,"Bbb",'m', LocalDate.of(2001,3,10),4));
        forumUsers.add(new ForumUser(3,"Ccc",'f', LocalDate.of(2010,11,16),1));
        forumUsers.add(new ForumUser(4,"ddd",'m', LocalDate.of(1998,6,10),84));
        forumUsers.add(new ForumUser(5,"Eee",'m', LocalDate.of(1991,11,15),0));
        forumUsers.add(new ForumUser(6,"Fff",'f', LocalDate.of(2008,12,19),16));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsers);
    }
}
