package objectData;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductsObject extends GeneralObject{
    private String nameSLB;
    private String descriptionSLB;
    private String priceSLB;
    private String imageUrlSLB;
    private String nameSLBL;
    private String descriptionSLBL;
    private String priceSLBL;
    private String imageUrlSLBL;
    private String nameSLBT;
    private String descriptionSLBT;
    private String priceSLBT;
    private String imageUrlSLBT;
    private String nameSLFJ;
    private String descriptionSLFJ;
    private String priceSLFJ;
    private String imageUrlSLFJ;
    private String nameSLO;
    private String descriptionSLO;
    private String priceSLO;
    private String imageUrlSLO;
    private String nameTR;
    private String descriptionTR;
    private String priceTR;
    private String imageUrlTR;

    public ProductsObject(String pathJson) {
        fromJsonToObject(pathJson);
    }
}



