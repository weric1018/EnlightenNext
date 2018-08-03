package com.ynet.entity;


import lombok.*;

import java.io.Serializable;

/**
 * Created by yuanxu on 2018/7/24.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Apppar implements Serializable {

    private String code;
    private String name;
    private String value;
    private String showMsg;

}
