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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getEnterprise options.
 */
public class GetEnterpriseOptions extends GenericModel {

  protected String enterpriseId;

  /**
   * Builder.
   */
  public static class Builder {
    private String enterpriseId;

    /**
     * Instantiates a new Builder from an existing GetEnterpriseOptions instance.
     *
     * @param getEnterpriseOptions the instance to initialize the Builder with
     */
    private Builder(GetEnterpriseOptions getEnterpriseOptions) {
      this.enterpriseId = getEnterpriseOptions.enterpriseId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param enterpriseId the enterpriseId
     */
    public Builder(String enterpriseId) {
      this.enterpriseId = enterpriseId;
    }

    /**
     * Builds a GetEnterpriseOptions.
     *
     * @return the new GetEnterpriseOptions instance
     */
    public GetEnterpriseOptions build() {
      return new GetEnterpriseOptions(this);
    }

    /**
     * Set the enterpriseId.
     *
     * @param enterpriseId the enterpriseId
     * @return the GetEnterpriseOptions builder
     */
    public Builder enterpriseId(String enterpriseId) {
      this.enterpriseId = enterpriseId;
      return this;
    }
  }

  protected GetEnterpriseOptions() { }

  protected GetEnterpriseOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.enterpriseId,
      "enterpriseId cannot be empty");
    enterpriseId = builder.enterpriseId;
  }

  /**
   * New builder.
   *
   * @return a GetEnterpriseOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the enterpriseId.
   *
   * The ID of the enterprise to retrieve.
   *
   * @return the enterpriseId
   */
  public String enterpriseId() {
    return enterpriseId;
  }
}

