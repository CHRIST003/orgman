package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {

    //TODO: implement method body ONLY!
    @Test
    public void buildRole() {

        Role role = RoleFactory.buildRole("Manager");
        assertNotNull(role.getRoleId());
        System.out.println("Role ID:>>\t"+ role.getRoleId());
    }
}