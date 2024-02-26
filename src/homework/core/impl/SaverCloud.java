package homework.core.impl;

import homework.core.Saver;
import homework.core.User;

public class SaverCloud implements Saver {
    private User user;
    public SaverCloud(User user) {
        this.user = user;
    }
    @Override
    public void save() {
        System.out.println("Save user in cloud: " + user.getName());
    }
}
