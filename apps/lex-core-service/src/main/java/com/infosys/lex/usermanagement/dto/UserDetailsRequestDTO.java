/*               "Copyright 2020 Infosys Ltd.
               Use of this source code is governed by GPL v3 license that can be found in the LICENSE file or at https://opensource.org/licenses/GPL-3.0
               This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License version 3" */
/**
 * © 2017 - 2019 Infosys Limited, Bangalore, India. All Rights Reserved.
 * Version: 1.10
 * <p>
 * Except for any free or open source software components embedded in this Infosys proprietary software program (“Program”),
 * this Program is protected by copyright laws, international treaties and other pending or existing intellectual property rights in India,
 * the United States and other countries. Except as expressly permitted, any unauthorized reproduction, storage, transmission in any form or
 * by any means (including without limitation electronic, mechanical, printing, photocopying, recording or otherwise), or any distribution of
 * this Program, or any portion of it, may result in severe civil and criminal penalties, and will be prosecuted to the maximum extent possible
 * under the law.
 * <p>
 * Highly Confidential
 */
substitute url based on requirement

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.List;

public class UserDetailsRequestDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotEmpty(message = "{userdetails.invalid.ids}")
    private List<@NotBlank String> ids;

    @NotBlank(message = "{userdetails.blank.userIdType}")
    @Pattern(regexp = "^(id|email)$",message = "{userdetails.invalid.userIdType}")
    private String userIdType;

    public UserDetailsRequestDTO(@NotEmpty(message = "{userdetails.invalid.ids}") List<@NotBlank String> ids, @NotBlank(message = "{userdetails.invalid.userIdType}") @Pattern(regexp = "(id|email)",message = "{userdetails.invalid.userIdType}") String userIdType) {
        this.ids = ids;
        this.userIdType = userIdType;
    }

    public UserDetailsRequestDTO() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public String getUserIdType() {
        return userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }
}

