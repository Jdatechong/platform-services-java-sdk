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

package com.ibm.cloud.platform_services.iam_identity.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The deleteTrustedProfileAssignment options.
 */
public class DeleteTrustedProfileAssignmentOptions extends GenericModel {

  protected String assignmentId;

  /**
   * Builder.
   */
  public static class Builder {
    private String assignmentId;

    /**
     * Instantiates a new Builder from an existing DeleteTrustedProfileAssignmentOptions instance.
     *
     * @param deleteTrustedProfileAssignmentOptions the instance to initialize the Builder with
     */
    private Builder(DeleteTrustedProfileAssignmentOptions deleteTrustedProfileAssignmentOptions) {
      this.assignmentId = deleteTrustedProfileAssignmentOptions.assignmentId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param assignmentId the assignmentId
     */
    public Builder(String assignmentId) {
      this.assignmentId = assignmentId;
    }

    /**
     * Builds a DeleteTrustedProfileAssignmentOptions.
     *
     * @return the new DeleteTrustedProfileAssignmentOptions instance
     */
    public DeleteTrustedProfileAssignmentOptions build() {
      return new DeleteTrustedProfileAssignmentOptions(this);
    }

    /**
     * Set the assignmentId.
     *
     * @param assignmentId the assignmentId
     * @return the DeleteTrustedProfileAssignmentOptions builder
     */
    public Builder assignmentId(String assignmentId) {
      this.assignmentId = assignmentId;
      return this;
    }
  }

  protected DeleteTrustedProfileAssignmentOptions() { }

  protected DeleteTrustedProfileAssignmentOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.assignmentId,
      "assignmentId cannot be empty");
    assignmentId = builder.assignmentId;
  }

  /**
   * New builder.
   *
   * @return a DeleteTrustedProfileAssignmentOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the assignmentId.
   *
   * ID of the Assignment Record.
   *
   * @return the assignmentId
   */
  public String assignmentId() {
    return assignmentId;
  }
}

