package homework;

import homework.core.User;
import homework.core.impl.PrintReport;
import homework.core.impl.SaverCloud;

public class Main{
    public static void main(String[] args){
        User user1 =  new User("Bob");
        SaverCloud persisterCloud = new SaverCloud(user1);
        PrintReport reportSaverCloud = new PrintReport();
        reportSaverCloud.report(user1);
        persisterCloud.save();


    }
}