package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private final int discountFixAmount = 1000; //1000원할인


    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP){     //ENUM타입은 ==
            return discountFixAmount;
        }else {
            return 0;
        }
    }
}
