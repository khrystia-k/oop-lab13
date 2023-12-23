package ua.ucu.edu.Task_1;

import java.time.LocalDate;

public class MyFacebookUser implements User {
    private FacebookUser facebookUser;
    
    public MyFacebookUser(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    @Override
    public String getUserEmail(){
        return this.facebookUser.getUserEmail();
    }

    @Override
    public String getCountry(){
        return this.facebookUser.getUserCountry();

    }

    @Override
    public String getLastActiveDate(){
        this.facebookUser.getLastActiveTime().totalDate();

    }

    @Override
    public LocalDate getLast() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLast'");
    }
 
}
