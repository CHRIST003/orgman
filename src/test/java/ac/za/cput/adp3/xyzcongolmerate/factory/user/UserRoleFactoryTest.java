package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    //TODO: implement method body ONLY!
    @Test
    public void buildUserRole() {
        UserRole userrole = UserRoleFactory.buildUserRole("Rlabs23456","christnganga06@gmail.com","6578");
        assertNotNull(userrole.getOrgCode());
        System.out.println("Organisation code:>>\t"+ userrole.getOrgCode());
    }
}