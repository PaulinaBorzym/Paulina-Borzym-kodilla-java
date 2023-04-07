package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.ForumTopic;

public class Mentor implements Observer{
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }
    @Override
    public void update(StudentTask studentTask) {
        System.out.println(name + ": New task from " + studentTask.getName() + "\n" +
                " (total: " + studentTask.getTasks().size() + " tasks)");
        updateCount++;
    }

    public String getUsername() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
