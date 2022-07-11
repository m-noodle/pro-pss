package cn.tedu.min.web;

public enum State {

    OK(20000),

    ERR_BAD_REQUEST(40000),
    ERR_CATEGORY_NAME_DUPLICATE(40101),
    ERR_CATEGORY_NOT_FOUND(40102),
    ERR_CATEGORY_ISENABLE(40103),
    ERR_CATEGORY_ISUNABLE(40104),
    ERR_CATEGORY_ISDISPLAY(40105),
    ERR_CATEGORY_ISHIDE(40106),
    ERR_CATEGORY_ISPRENTE(40107),

    ERR_BRAND_DUPLICATE(40201),

    ERR_PRODUCT_NOT_FIND(40301),

    ERR_JWT_EXPIRED(40901),
    ERR_JWT_MAIFORMED(40902),
    ERR_JWT_SIGNATURE(40903),

    ERR_UNKNOW(50000),
    ERR_INSERT(50001),
    ERR_UPDATE(50002);

    private Integer value;

    State(Integer value){
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
