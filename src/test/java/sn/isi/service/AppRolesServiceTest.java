package sn.isi.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.runner.RunWith;
import sn.isi.dto.AppRoles;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AppRolesServiceTest {

    @Mock
    private AppRolesService appRolesService;

    @Test
    void getAppRoles() {

        when(appRolesService.getAppRoles()).thenReturn(List.of(new AppRoles()));
        List<AppRoles> appRolesList = appRolesService.getAppRoles();

        Assertions.assertEquals(1, appRolesList.size());
    }

    @Test
    void getAppRole() {
        when(appRolesService.getAppRole(anyInt())).thenReturn(new AppRoles());
        AppRoles appRoles = appRolesService.getAppRole(1);

        Assertions.assertNotNull(appRoles);
    }

    @Test
    void createAppRoles() {

        AppRoles appRoles = new AppRoles();
        appRoles.setNom("ROLE_USER");

        when(appRolesService.createAppRoles(any())).thenReturn(appRoles);
        AppRoles appRolesSave = appRolesService.createAppRoles(appRoles);

        Assertions.assertNotNull(appRolesSave);
        Assertions.assertEquals(appRoles.getNom(), appRolesSave.getNom());
    }

    @Test
    void updateAppRoles() {
        AppRoles appRoles = new AppRoles();
        appRoles.setNom("ROLE_TECH");
        when(appRolesService.updateAppRoles(anyInt() ,any())).thenReturn(appRoles);
        AppRoles appRolesSave = appRolesService.updateAppRoles(3, appRoles);

        Assertions.assertEquals("ROLE_TECH", appRolesSave.getNom());

    }

    @Test
    void deleteAppRoles() {

        doNothing().when(appRolesService).deleteAppRoles(isA(Integer.class));
        appRolesService.deleteAppRoles(3);

        verify(appRolesService, times(1)).deleteAppRoles(3);
    }
}