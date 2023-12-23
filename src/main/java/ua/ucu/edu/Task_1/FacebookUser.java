package ua.ucu.edu.Task_1;

import java.time.LocalDate; 
 
import lombok.Data; 
import lombok.Getter; 
import lombok.Setter; 
 
@Getter 
@Setter 
@Data 
class FacebookUser{ 
    private String UserEmail; 
    private String UserCountry; 
    private LocalDate LastActiveTime; 
}
