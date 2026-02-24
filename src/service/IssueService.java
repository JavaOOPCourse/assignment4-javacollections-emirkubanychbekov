package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        // TODO: Add at least 5 issues
        issues.add(new Issue("Missing Grade", 3));
        issues.add(new Issue("Exam Conflict", 1));
        issues.add(new Issue("Transcript Error", 2));
        issues.add(new Issue("Registration Block", 1));
        issues.add(new Issue("Course Drop Deadline", 4));
    }

    public void showMostUrgent() {
        // TODO: Show most urgent issue
        System.out.println(issues.peek());
    }

    public void resolveIssues() {
        // TODO: Remove 2 issues
        issues.poll();
        issues.poll();
    }

    public void printRemainingIssues() {
        // TODO: Print using iterator
        Iterator<Issue> iterator = issues.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void addNewIssue(String description, int urgency) {
        // TODO: Add new issue
        issues.add(new Issue(description, urgency));
    }
}