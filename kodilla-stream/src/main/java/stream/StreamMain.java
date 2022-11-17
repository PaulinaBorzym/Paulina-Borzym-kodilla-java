package stream;

import com.kodilla.stream.book.Book;


import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer,ForumUser> theResultMapOfUser = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'm')
                .filter(forumUser -> LocalDate.now().getYear()-forumUser.getDateOfBirth().getYear() >= 18)
                .filter(forumUser -> forumUser.getPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));
        System.out.println("# elements: " + theResultMapOfUser.size());
        theResultMapOfUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}