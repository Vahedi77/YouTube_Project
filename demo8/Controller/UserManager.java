package org.example.demo8.Controller;
import org.example.demo8.Model.*;

public class UserManager {
    private static UserManager instance;
    private Account currentUser;

    private UserManager(){};
    static UserManager getInstance()
    {
        if(instance==null)
        {
            instance=new UserManager();
        }
        return instance;
    }
    public void setCurrentUser(Account currentUser)
    {
        this.currentUser=currentUser;
    }
    public Account getCurrentUser()
    {
        return currentUser;
    }


}
