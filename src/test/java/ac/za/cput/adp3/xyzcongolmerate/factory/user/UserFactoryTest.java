package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {

    //TODO: implement method body ONLY!
    @Test
    public void buildUser() {
        User user = UserFactory.buildUser("217025358@mycput.ac.za","Christ Amour","Nganga Moussiessi");
        assertNotNull(user.getUserEmail());
        System.out.println("User email:>>\t"+ user.getUserEmail());
    }
}