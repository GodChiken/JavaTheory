package com.kbh.desk.theory.basic.polymorphism.inheritance.abstractMethod;

/**
 * 500원 할인 금액 클래스
 */
class CouponDiscount500Won extends Coupon {

    private static final int DISCOUNT_PRICE = 500;

    public CouponDiscount500Won(int price) {
        super(price);
    }

    /**
     * 할인 금액을 반환한다.
     * 500원을 반환한다.
     *
     * @return 할인금액(500원 상수값)
     */
    @Override
    protected int getDiscountPrice() {
        return DISCOUNT_PRICE;
    }
}
