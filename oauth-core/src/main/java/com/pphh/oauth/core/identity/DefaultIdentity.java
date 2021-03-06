/*
 * Copyright 2018 peipeihh
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 */
package com.pphh.oauth.core.identity;

import java.util.HashMap;
import java.util.Map;

/**
 * Please add description here.
 *
 * @author huangyinhuang
 * @date 7/2/2018
 */
public class DefaultIdentity implements Identity {

    private String userName;
    private String userEmail;
    private String userOrg;
    private String userRole;
    private Map<String, String> additonalInformation;

    public DefaultIdentity(String username) {
        this.userName = username;
        additonalInformation = new HashMap<>();
    }

    @Override
    public String getName() {
        return this.userName;
    }

    @Override
    public void setName(String name) {
        this.userName = name;
    }

    @Override
    public String getEmail() {
        return this.userEmail;
    }

    @Override
    public void setEmail(String email) {
        this.userEmail = email;
    }

    @Override
    public String getOrganzation() {
        return this.userOrg;
    }

    @Override
    public void setOrganzation(String organzation) {
        this.userOrg = organzation;
    }

    @Override
    public String getRole() {
        return this.userRole;
    }

    @Override
    public void setRole(String role) {
        this.userRole = role;
    }

    @Override
    public Map<String, String> getAdditionalInfomation() {
        return this.additonalInformation;
    }

    @Override
    public void fillAdditionalInfomation(String key, String value) {
        this.additonalInformation.put(key, value);
    }
}
