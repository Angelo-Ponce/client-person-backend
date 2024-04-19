package com.neoris.vo;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ClientVo extends PersonVo {

    @NotEmpty(message = "{clientId.empty}")
    private String clientId;

    @NotEmpty(message = "{password.empty}")
    @Size(max = 25, message = "{password.size.max}")
    private String password;

    private Boolean status;

}
