/*
 * (C) Copyright IBM Corp. 2023.
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
package com.ibm.cloud.platform_services.usage_reports.v4.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getResourceUsageAccount options.
 */
public class GetResourceUsageAccountOptions extends GenericModel {

  protected String accountId;
  protected String billingmonth;
  protected Boolean names;
  protected String acceptLanguage;
  protected Long limit;
  protected String start;
  protected String resourceGroupId;
  protected String organizationId;
  protected String resourceInstanceId;
  protected String resourceId;
  protected String planId;
  protected String region;

  /**
   * Builder.
   */
  public static class Builder {
    private String accountId;
    private String billingmonth;
    private Boolean names;
    private String acceptLanguage;
    private Long limit;
    private String start;
    private String resourceGroupId;
    private String organizationId;
    private String resourceInstanceId;
    private String resourceId;
    private String planId;
    private String region;

    /**
     * Instantiates a new Builder from an existing GetResourceUsageAccountOptions instance.
     *
     * @param getResourceUsageAccountOptions the instance to initialize the Builder with
     */
    private Builder(GetResourceUsageAccountOptions getResourceUsageAccountOptions) {
      this.accountId = getResourceUsageAccountOptions.accountId;
      this.billingmonth = getResourceUsageAccountOptions.billingmonth;
      this.names = getResourceUsageAccountOptions.names;
      this.acceptLanguage = getResourceUsageAccountOptions.acceptLanguage;
      this.limit = getResourceUsageAccountOptions.limit;
      this.start = getResourceUsageAccountOptions.start;
      this.resourceGroupId = getResourceUsageAccountOptions.resourceGroupId;
      this.organizationId = getResourceUsageAccountOptions.organizationId;
      this.resourceInstanceId = getResourceUsageAccountOptions.resourceInstanceId;
      this.resourceId = getResourceUsageAccountOptions.resourceId;
      this.planId = getResourceUsageAccountOptions.planId;
      this.region = getResourceUsageAccountOptions.region;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param accountId the accountId
     * @param billingmonth the billingmonth
     */
    public Builder(String accountId, String billingmonth) {
      this.accountId = accountId;
      this.billingmonth = billingmonth;
    }

    /**
     * Builds a GetResourceUsageAccountOptions.
     *
     * @return the new GetResourceUsageAccountOptions instance
     */
    public GetResourceUsageAccountOptions build() {
      return new GetResourceUsageAccountOptions(this);
    }

    /**
     * Set the accountId.
     *
     * @param accountId the accountId
     * @return the GetResourceUsageAccountOptions builder
     */
    public Builder accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }

    /**
     * Set the billingmonth.
     *
     * @param billingmonth the billingmonth
     * @return the GetResourceUsageAccountOptions builder
     */
    public Builder billingmonth(String billingmonth) {
      this.billingmonth = billingmonth;
      return this;
    }

    /**
     * Set the names.
     *
     * @param names the names
     * @return the GetResourceUsageAccountOptions builder
     */
    public Builder names(Boolean names) {
      this.names = names;
      return this;
    }

    /**
     * Set the acceptLanguage.
     *
     * @param acceptLanguage the acceptLanguage
     * @return the GetResourceUsageAccountOptions builder
     */
    public Builder acceptLanguage(String acceptLanguage) {
      this.acceptLanguage = acceptLanguage;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the GetResourceUsageAccountOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the start.
     *
     * @param start the start
     * @return the GetResourceUsageAccountOptions builder
     */
    public Builder start(String start) {
      this.start = start;
      return this;
    }

    /**
     * Set the resourceGroupId.
     *
     * @param resourceGroupId the resourceGroupId
     * @return the GetResourceUsageAccountOptions builder
     */
    public Builder resourceGroupId(String resourceGroupId) {
      this.resourceGroupId = resourceGroupId;
      return this;
    }

    /**
     * Set the organizationId.
     *
     * @param organizationId the organizationId
     * @return the GetResourceUsageAccountOptions builder
     */
    public Builder organizationId(String organizationId) {
      this.organizationId = organizationId;
      return this;
    }

    /**
     * Set the resourceInstanceId.
     *
     * @param resourceInstanceId the resourceInstanceId
     * @return the GetResourceUsageAccountOptions builder
     */
    public Builder resourceInstanceId(String resourceInstanceId) {
      this.resourceInstanceId = resourceInstanceId;
      return this;
    }

    /**
     * Set the resourceId.
     *
     * @param resourceId the resourceId
     * @return the GetResourceUsageAccountOptions builder
     */
    public Builder resourceId(String resourceId) {
      this.resourceId = resourceId;
      return this;
    }

    /**
     * Set the planId.
     *
     * @param planId the planId
     * @return the GetResourceUsageAccountOptions builder
     */
    public Builder planId(String planId) {
      this.planId = planId;
      return this;
    }

    /**
     * Set the region.
     *
     * @param region the region
     * @return the GetResourceUsageAccountOptions builder
     */
    public Builder region(String region) {
      this.region = region;
      return this;
    }
  }

  protected GetResourceUsageAccountOptions() { }

  protected GetResourceUsageAccountOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.accountId,
      "accountId cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.billingmonth,
      "billingmonth cannot be empty");
    accountId = builder.accountId;
    billingmonth = builder.billingmonth;
    names = builder.names;
    acceptLanguage = builder.acceptLanguage;
    limit = builder.limit;
    start = builder.start;
    resourceGroupId = builder.resourceGroupId;
    organizationId = builder.organizationId;
    resourceInstanceId = builder.resourceInstanceId;
    resourceId = builder.resourceId;
    planId = builder.planId;
    region = builder.region;
  }

  /**
   * New builder.
   *
   * @return a GetResourceUsageAccountOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the accountId.
   *
   * Account ID for which the usage report is requested.
   *
   * @return the accountId
   */
  public String accountId() {
    return accountId;
  }

  /**
   * Gets the billingmonth.
   *
   * The billing month for which the usage report is requested.  Format is yyyy-mm.
   *
   * @return the billingmonth
   */
  public String billingmonth() {
    return billingmonth;
  }

  /**
   * Gets the names.
   *
   * Include the name of every resource, plan, resource instance, organization, and resource group.
   *
   * @return the names
   */
  public Boolean names() {
    return names;
  }

  /**
   * Gets the acceptLanguage.
   *
   * Prioritize the names returned in the order of the specified languages. Language will default to English.
   *
   * @return the acceptLanguage
   */
  public String acceptLanguage() {
    return acceptLanguage;
  }

  /**
   * Gets the limit.
   *
   * Number of usage records returned. The default value is 30. Maximum value is 200.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the start.
   *
   * The offset from which the records must be fetched. Offset information is included in the response.
   *
   * @return the start
   */
  public String start() {
    return start;
  }

  /**
   * Gets the resourceGroupId.
   *
   * Filter by resource group.
   *
   * @return the resourceGroupId
   */
  public String resourceGroupId() {
    return resourceGroupId;
  }

  /**
   * Gets the organizationId.
   *
   * Filter by organization_id.
   *
   * @return the organizationId
   */
  public String organizationId() {
    return organizationId;
  }

  /**
   * Gets the resourceInstanceId.
   *
   * Filter by resource instance_id.
   *
   * @return the resourceInstanceId
   */
  public String resourceInstanceId() {
    return resourceInstanceId;
  }

  /**
   * Gets the resourceId.
   *
   * Filter by resource_id.
   *
   * @return the resourceId
   */
  public String resourceId() {
    return resourceId;
  }

  /**
   * Gets the planId.
   *
   * Filter by plan_id.
   *
   * @return the planId
   */
  public String planId() {
    return planId;
  }

  /**
   * Gets the region.
   *
   * Region in which the resource instance is provisioned.
   *
   * @return the region
   */
  public String region() {
    return region;
  }
}

