package sn.samanecorporation.mapping;

import org.mapstruct.Mapper;
import sn.samanecorporation.dto.AppUser;
import sn.samanecorporation.entities.AppUserEntity;

@Mapper
public interface AppUserMapper {
    AppUser toAppUser(AppUserEntity appUserEntity);
    AppUserEntity fromAppUser(AppUser appUser);
}
