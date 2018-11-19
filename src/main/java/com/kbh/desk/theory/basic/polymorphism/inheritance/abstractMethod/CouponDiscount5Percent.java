package com.kbh.desk.theory.basic.polymorphism.inheritance.abstractMethod;

/**
 * 5 퍼센트 할인 쿠폰 클래스
 */
class CouponDiscount5Percent extends Coupon {

    public CouponDiscount5Percent(int price) {
        super(price);
    }

    /**
     * 할인 금액을 반환한다.
     * 입력금액의 5퍼센트 금액을 계산하며, 계산과정에서 발생되는 소숫점은 버림(임의처리) 한다.
     *
     * @return 입력 금액의 5퍼센트 금액
     */
    @Override
    protected int getDiscountPrice() {
        return (int) Math.ceil(super.price * 0.05);
    }
}
