package com.example.demo.lectureClass.testCode.account.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class AccountRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String role;

    @Getter
    @ManyToOne
    private TestAccount account;
    // TestAccount account = new Account();
    // 클래스를 불러오는 작업이라고 생각함

    public AccountRole(String role, TestAccount account) {
        this.role = role;
        this.account = account;
    }
}
