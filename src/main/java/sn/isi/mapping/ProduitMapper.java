package sn.isi.mapping;

import org.mapstruct.Mapper;
import sn.isi.dto.Produit;
import sn.isi.entities.ProduitEntity;

@Mapper
public interface ProduitMapper {
    Produit toProduit(ProduitEntity produitEntity);
    ProduitEntity fromProduit(Produit produit);
}
