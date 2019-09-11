package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    //TODO: implement method body ONLY!
    @Test
    public void buildOrganisationUser() {
        OrganisationUser organisationuser = OrganisationUserFactory.buildOrganisationUser("RLabs25637","christnganga06@gmail.com");
        assertNotNull(organisationuser.getOrgCode());
        System.out.println("Organisation code:>>\t"+ organisationuser.getOrgCode() +"\n"+"User email:>>\t"+organisationuser.getUserEmail());
    }
}