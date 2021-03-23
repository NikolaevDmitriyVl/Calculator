package practice.K2;

import practice.K.Number;

public class DataDto {
    Number numberAfter;
    Number numberBefore;

    String sign;

    public DataDto(Number numberBefore,String sign,Number numberAfter){
        this.numberBefore=numberBefore;
        this.sign=sign;
        this.numberAfter=numberAfter;
    }

}
