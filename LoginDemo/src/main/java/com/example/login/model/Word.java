package com.example.login.model;

import lombok.Data;

/**
 * Author:Pengqun Zhong
 * Date: 2019-10-9
 * Description:
 */
@Data
public class Word {
    private Long id;
    private String spell;
    private String pronunciation;
    private String unit;
    private String meaning;
    private String speak;
}
