package sn.samanecorporation.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.samanecorporation.entities.AppRolesEntity;

public interface IAppRolesRepository extends JpaRepository<AppRolesEntity, Integer> {
}
