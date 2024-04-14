package com.neoris.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class PersonVo {

    private Long personId;

    private String identificacion;

    private String name;

    private String gender;

    private Integer age;

    private String address;

    private String phone;

    private String createdByUser;

    private Date createdDate;

    private String lastModifiedByUser;

    private Date lastModifiedDate;
}
