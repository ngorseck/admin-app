package sn.isi.doa;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.entities.ProduitEntity;

public interface IProduitRepository extends JpaRepository<ProduitEntity, Integer> {
}
