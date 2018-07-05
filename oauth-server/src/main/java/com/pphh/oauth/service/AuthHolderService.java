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
package com.pphh.oauth.service;

/**
 * AuthHolderService
 *
 * @author huangyinhuang
 * @date 7/3/2018
 */
public interface AuthHolderService {

    /**
     * get user name by an auth holder
     *
     * @param holderId auth holder id
     * @return user name
     */
    String getUserNameByHolderId(Long holderId);

    /**
     * get client name by an auth holder
     *
     * @param holderId auth holder id
     * @return client name
     */
    String getClientNameByHolderId(Long holderId);

}
