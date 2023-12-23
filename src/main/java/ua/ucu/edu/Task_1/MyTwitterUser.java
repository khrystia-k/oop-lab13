package ua.ucu.edu.Task_1;

import java.time.LocalDate;

public class MyTwitterUser implements User {
    private TwitterUser twitterUser;

    public MyTwitterUser(TwitterUser twitterUser){
        this.twitterUser = twitterUser;
    }
    

    @Override
    public String getCountry() {
        // TODO Auto-generated method stub
        return twitterUser.getCountry();
        

    
    @Override
    public LocalDate getLastActiveDate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLastActiveDate'");
    }
    @Override
    public String getUserEmail() {
        // TODO Auto-generated method stub
        return twitterUser.getUserEmail();
    }
    
}
