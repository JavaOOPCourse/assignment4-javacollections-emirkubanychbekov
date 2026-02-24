package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        // TODO: Add 3 normal appointments
        appointments.add("Advising Session");
        appointments.add("Course Selection");
        appointments.add("Internship Discussion");

        // TODO: Add 1 urgent appointment at the beginning
        appointments.addFirst("Urgent Academic Issue");
    }

    public void cancelLast() {
        // TODO: Remove last appointment
        appointments.pollLast();
    }

    public void showFirstAndLast() {
        // TODO: Print first and last appointment
        System.out.println(appointments.peekFirst());
        System.out.println(appointments.peekLast());
    }

    public void printAppointments() {
        // TODO: Traverse using Iterator
        Iterator<String> iterator = appointments.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}