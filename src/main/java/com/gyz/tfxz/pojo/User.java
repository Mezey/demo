package com.gyz.tfxz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String accountNumber;
    private String password;
    private String nickname;
    private String image;
}
