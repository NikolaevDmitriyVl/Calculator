package practice.K;

public class Number {
    private Integer value;
    private HistoricalValueFrom valueEnum;

    public Number(int value, HistoricalValueFrom valueEnum) {
        this.value = value;
        this.valueEnum = valueEnum;
    }

    public Number() {
    }

    public Number(String input) throws Exception {
            this.value = Integer.valueOf(input);
            if (value>10) throw new Exception("больше 10");
            this.valueEnum = HistoricalValueFrom.ARABIC;
}//todo roma


    public int getValue() {
        return value;
    }

    public HistoricalValueFrom getValueEnum() {
        return valueEnum;
    }


    @Override
    public String toString() {
        if(valueEnum==HistoricalValueFrom.ARABIC){
        return value.toString();}
        else {
            return "";
        }
    }
}
