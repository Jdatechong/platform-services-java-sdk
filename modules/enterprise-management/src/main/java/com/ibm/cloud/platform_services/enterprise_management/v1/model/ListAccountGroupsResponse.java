/*
 * (C) Copyright IBM Corp. 2024.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.platform_services.enterprise_management.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The list_account_groups operation response.
 */
public class ListAccountGroupsResponse extends GenericModel {

  @SerializedName("rows_count")
  protected Long rowsCount;
  @SerializedName("next_url")
  protected String nextUrl;
  protected List<AccountGroup> resources;

  protected ListAccountGroupsResponse() { }

  /**
   * Gets the rowsCount.
   *
   * The number of enterprises returned from calling list account groups.
   *
   * @return the rowsCount
   */
  public Long getRowsCount() {
    return rowsCount;
  }

  /**
   * Gets the nextUrl.
   *
   * A string that represents the link to the next page of results.
   *
   * @return the nextUrl
   */
  public String getNextUrl() {
    return nextUrl;
  }

  /**
   * Gets the resources.
   *
   * A list of account groups.
   *
   * @return the resources
   */
  public List<AccountGroup> getResources() {
    return resources;
  }
}

