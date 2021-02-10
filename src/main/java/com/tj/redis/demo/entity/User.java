package com.tj.redis.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * User实体类
 *
 * @author tanggege
 * @date 2021-02-10 19:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private Integer id;
    private String userName;
    private String password;
}
