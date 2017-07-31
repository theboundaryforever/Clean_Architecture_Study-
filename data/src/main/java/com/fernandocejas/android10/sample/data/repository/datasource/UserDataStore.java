/**
 * Copyright (C) 2015 Fernando Cejas Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fernandocejas.android10.sample.data.repository.datasource;

import com.fernandocejas.android10.sample.data.entity.UserEntity;

import java.util.List;

import io.reactivex.Observable;

/**
 * Interface that represents a data store from where data is retrieved.
 * UserDataStore,UserDataStoreFactory

 * UserDataStoreFactory，选用不同的UserDataStore来实现获取数据的功能。
 * 不同的UserDataStore实现代表不同的数据源。
 */
public interface UserDataStore {
  /**
   * 列表
   * Get an {@link Observable} which will emit a List of {@link UserEntity}.
   *
   */
  Observable<List<UserEntity>> userEntityList();

  /**
   * 详情
   * Get an {@link Observable} which will emit a {@link UserEntity} by its id.
   *
   * @param userId The id to retrieve user data.
   */
  Observable<UserEntity> userEntityDetails(final int userId);
}
