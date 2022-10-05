package sn.isi.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;
import sn.isi.dto.AppRoles;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class AppRolesServiceTest {

    @Autowired
    private AppRolesService appRolesService;

    @Test
    void getAppRoles() {
        List<AppRoles> appRolesList =
                appRolesService.getAppRoles();

        Assertions.assertEquals(1, appRolesList.size());
    }

    @Test
    void getAppRole() {
        AppRoles appRoles = appRolesService.getAppRole(1);

        Assertions.assertNotNull(appRoles);
    }

    @Test
    void createAppRoles() {

        AppRoles appRoles = new AppRoles();
        appRoles.setNom("ROLE_USER");

        AppRoles appRolesSave = appRolesService.createAppRoles(appRoles);

        Assertions.assertNotNull(appRolesSave);
        //Assertions.assertEquals(appRoles.getNom(), appRolesSave.getNom());
    }

    @Test
    void updateAppRoles() {
        AppRoles appRoles = new AppRoles();
        appRoles.setNom("ROLE_TECH");

        AppRoles appRolesSave = appRolesService.updateAppRoles(3, appRoles);

        Assertions.assertEquals("ROLE_TECH", appRolesSave.getNom());

    }

    @Test
    void deleteAppRoles() {

        appRolesService.deleteAppRoles(3);
        Assertions.assertTrue(true);
    }

    @Test
    void operation() {
        int val1 = 1;
        int val2 = 2;
        int val3 = val1 + val2;
        Assertions.assertEquals(3, val3);
    }
}