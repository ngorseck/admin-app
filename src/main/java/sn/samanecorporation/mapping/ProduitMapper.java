package sn.samanecorporation.mapping;

import org.mapstruct.Mapper;
import sn.samanecorporation.dto.Produit;
import sn.samanecorporation.entities.ProduitEntity;

@Mapper
public interface ProduitMapper {
    Produit toProduit(ProduitEntity produitEntity);
    ProduitEntity fromProduit(Produit produit);
}
