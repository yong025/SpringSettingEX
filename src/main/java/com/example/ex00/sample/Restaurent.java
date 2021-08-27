package com.example.ex00.sample;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@ToString
@Component
//@RequiredArgsConstructor //final 지정하고 Autowired대신 사용해도 가능 ***생성자 주입*** 현재 많이 사용
@Setter
public class Restaurent {

//    @Qualifier("englandChef") // 여러개의 빈중에 특정한 빈을 하나 정할 수 있다.
    @Autowired
    private Chef chef; //나 쉐프가 필요해 !!!!!
    // @RequiredArgsConstructor 사용 때에는 final 지정

}
