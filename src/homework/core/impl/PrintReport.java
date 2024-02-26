package homework.core.impl;

import homework.core.Reporter;
import homework.core.User;

public class PrintReport implements Reporter {
    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
