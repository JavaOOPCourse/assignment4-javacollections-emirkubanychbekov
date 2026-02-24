package service;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ActionHistoryService {

    private ArrayDeque<String> actions = new ArrayDeque<>();

    public void initializeActions() {
        // TODO: Add 4 actions
        actions.add("Submitted Assignment");
        actions.add("Dropped Course");
        actions.add("Registered Course");
        actions.add("Updated Profile");
    }

    public void undoLastAction() {
        // TODO: Remove last action
        actions.pollLast();
    }

    public void addRequestedTranscript() {
        // TODO: Add "Requested Transcript"
        actions.add("Requested Transcript");
    }

    public void showFirstAndLast() {
        // TODO: Print first and last action
        System.out.println(actions.peekFirst());
        System.out.println(actions.peekLast());
    }

    public void printHistory() {
        // TODO: Iterate through history
        Iterator<String> iterator = actions.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}