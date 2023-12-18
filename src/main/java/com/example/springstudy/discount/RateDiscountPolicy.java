package com.example.springstudy.discount;

import com.example.springstudy.member.Grade;
import com.example.springstudy.member.Member;
import org.springframework.stereotype.Component;

@Component
public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPolicy = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPolicy / 100;
        } else {
            return 0;
        }
    }
}
