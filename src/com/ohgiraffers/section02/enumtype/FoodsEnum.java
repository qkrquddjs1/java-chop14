package com.ohgiraffers.section02.enumtype;

public enum FoodsEnum {
    /* 작성 순서 대로 0부터 값이 자동으로 부여된다. */
    MEAL_AN_BUTTER_KIMCHI_STEW(0),
    MEAL_MINT_SEAWEED_SOUP(1),
    MEAL_BUNGEOPPANG_SUSHI(2),
    DRINK_RADISH_KIMCHI_LATTE(0),
    DRINK_WOOLUCK_SMOOTHIE(1),
    DRINK_RAW_CUTTLEFISH_SHAKE(2);

    /* 4. 열거 타입에 메소드나 필드를 추가할 수 있다.
     *  근본적으로 불변이라 모든 필드는 final 이어야만 한다. 밑에부분이 필드생성  */
    private  final int value;

    private final int var = 10;
    FoodsEnum(int value){
        this.value = value;
    }

    public void printvar(){
        System.out.println("print var : " + var);
    }

    @Override
    public String toString(){
        return this.name().toLowerCase();
    }


    public String getName() {
        return this.name();
    }


}
