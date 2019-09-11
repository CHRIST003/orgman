package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class UserDemographyFactoryTest {

    //TODO: implement method body ONLY!
    @Test
    public void buildUserDemography() {
        Date dateOfBirth = new Date();
        UserDemography userDemography = UserDemographyFactory.buildUserDemography("217025358@mycput.ac.za","Manager","54654"
        ,"56776", dateOfBirth);
        assertNotNull(userDemography.getUserEmail());
        System.out.println("User email:>>\t"+ userDemography.getUserEmail()+"\n"+"Title:>>\t"+userDemography.getUserTitle()+"\n"+"gender id:>>\t"+userDemography.getGenderId()+"\n"+"race id:>>\t"+userDemography.getRaceId()+"\n"+"Date of birthday:>>\t"+userDemography.getDateOfBirth());
    }
}