package com.kbh.desk.theory.basic.polymorphism.inheritance.abstractMethod;

public abstract class Coupon {
    int price;

    public Coupon(int price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Coupon coupon = new CouponDiscount5Percent(1000);
        int dp = coupon.getDiscountPrice();
        coupon.order(dp);

        System.out.println(dp);
    }

    public final void order(int discountPrice) {
        validate(discountPrice);
        pay(discountPrice);
    }

    private final void pay(int discountPrice) {
        // do something
    }

    private final void validate(int discountPrice) {
        // do something
    }

    /**
     * 할인 금액을 반환한다.
     *
     * @return 할인 금액
     */
    protected abstract int getDiscountPrice();
}
