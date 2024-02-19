package ru.dovakun;

public enum Rome {
    C(100),
    L(50),
    X(10),
    IX(9),
    VIII(8),
    VII(7),
    VI(6),
    V(5),
    IV(4),
    III(3),
    II(2),
    I(1);
    public static String intToRoman(int num){
        if(num<0||num>100){
            throw new IllegalArgumentException("Число должно быть в диапазоне от 1 до 100");
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Rome rome:Rome.values()){
            while (num>=rome.getValue()){
                stringBuilder.append(rome.name());
                num = num-rome.getValue();
            }
        }return stringBuilder.toString();
    }

    private final int value;
    Rome(int value){
        this.value=value;
    }
    public int getValue(){
        return value;
    }
    public static Rome getByRomanNumeral(String romanNumeral) {
        for (Rome rome : values()) {
            if (rome.name().equals(romanNumeral)) {
                return rome;
            }
        }
        throw new IllegalArgumentException("Неверный римский символ: " + romanNumeral);
    }

}
