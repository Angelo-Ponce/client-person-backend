package com.neoris.vo;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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

    @NotEmpty(message = "{dni.empty}")
    @Size(max = 10, message = "{dni.size}")
    private String identificacion;

    @NotEmpty(message = "{name.empty}")
    @Size(min = 3, max = 100, message = "{name.size}")
    private String name;

    @NotEmpty(message = "{gender.empty}")
    @Size(max = 50, message = "{gender.size.max}")
    private String gender;

    @NotNull(message = "{age.empty}")
    private Integer age;

    @Size(max = 100, message = "{address.size.max}")
    private String address;

    @Size(max = 15, message = "{phone.size.max}")
    private String phone;

    private String createdByUser;

    private Date createdDate;

    private String lastModifiedByUser;

    private Date lastModifiedDate;
}
