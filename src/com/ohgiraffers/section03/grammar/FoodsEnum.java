package com.ohgiraffers.section03.grammar;

public enum FoodsEnum {
    /* 작성 순서 대로 0부터 값이 자동으로 부여된다. */
    MEAL_AN_BUTTER_KIMCHI_STEW(0, "앙버터김치찜"),
    MEAL_MINT_SEAWEED_SOUP(1,"민트 미역국"),
    MEAL_BUNGEOPPANG_SUSHI(2,"붕어빵초밥"),
    DRINK_RADISH_KIMCHI_LATTE(0,"열무김치라떼"),
    DRINK_WOOLUCK_SMOOTHIE(1,"우럭스무디"),
    DRINK_RAW_CUTTLEFISH_SHAKE(2,"생갈치쉐이크");

    /* 4. 열거 타입에 메소드나 필드를 추가할 수 있다.
     *  근본적으로 불변이라 모든 필드는 final 이어야만 한다. 밑에부분이 필드생성  */
    private  final int value;
    private final String name;

    FoodsEnum(int value, String name){
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName(){
        return name;
    }
}
