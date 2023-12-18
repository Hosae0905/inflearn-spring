package com.example.springstudy;

import com.example.springstudy.discount.DiscountPolicy;
import com.example.springstudy.discount.RateDiscountPolicy;
import com.example.springstudy.member.MemberRepository;
import com.example.springstudy.member.MemberService;
import com.example.springstudy.member.MemberServiceImpl;
import com.example.springstudy.member.MemoryMemberRepository;
import com.example.springstudy.order.OrderService;
import com.example.springstudy.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "com.example.springstudy",
        basePackageClasses = AutoAppConfig.class,
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {


}
