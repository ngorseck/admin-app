package sn.samanecorporation.mapping;

import org.mapstruct.Mapper;
import sn.samanecorporation.dto.AppRoles;
import sn.samanecorporation.entities.AppRolesEntity;

@Mapper
public interface AppRolesMapper {
    AppRoles toAppRoles(AppRolesEntity appRolesEntity);
    AppRolesEntity fromAppRoles(AppRoles appRoles);
}
