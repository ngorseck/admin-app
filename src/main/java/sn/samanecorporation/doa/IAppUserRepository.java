package sn.samanecorporation.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.samanecorporation.entities.AppUserEntity;

public interface IAppUserRepository extends JpaRepository<AppUserEntity, Integer> {
    AppUserEntity findByEmail(String email);
}
