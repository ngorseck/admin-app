package sn.isi.mapping;

import org.mapstruct.Mapper;
import sn.isi.dto.AppRoles;
import sn.isi.entities.AppRolesEntity;

@Mapper
public interface AppRolesMapper {
    AppRoles toAppRoles(AppRolesEntity appRolesEntity);
    AppRolesEntity fromAppRoles(AppRoles appRoles);
}
