package sn.samanecorporation.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.samanecorporation.entities.ProduitEntity;

public interface IProduitRepository extends JpaRepository<ProduitEntity, Integer> {
}
