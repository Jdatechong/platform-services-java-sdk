/*
 * (C) Copyright IBM Corp. 2022.
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

package com.ibm.cloud.platform_services.iam_policy_management.v1.model;

import com.ibm.cloud.platform_services.iam_policy_management.v1.model.PolicyRole;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2CreatePolicyOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyAttribute;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyBaseControl;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyBaseControlGrant;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyBaseResource;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyBaseRuleV2PolicyAttribute;
import com.ibm.cloud.platform_services.iam_policy_management.v1.model.V2PolicyBaseSubject;
import com.ibm.cloud.platform_services.iam_policy_management.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the V2CreatePolicyOptions model.
 */
public class V2CreatePolicyOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testV2CreatePolicyOptions() throws Throwable {
    PolicyRole policyRoleModel = new PolicyRole.Builder()
      .roleId("testString")
      .build();
    assertEquals(policyRoleModel.roleId(), "testString");

    V2PolicyBaseControlGrant v2PolicyBaseControlGrantModel = new V2PolicyBaseControlGrant.Builder()
      .roles(java.util.Arrays.asList(policyRoleModel))
      .build();
    assertEquals(v2PolicyBaseControlGrantModel.roles(), java.util.Arrays.asList(policyRoleModel));

    V2PolicyBaseControl v2PolicyBaseControlModel = new V2PolicyBaseControl.Builder()
      .grant(v2PolicyBaseControlGrantModel)
      .build();
    assertEquals(v2PolicyBaseControlModel.grant(), v2PolicyBaseControlGrantModel);

    V2PolicyAttribute v2PolicyAttributeModel = new V2PolicyAttribute.Builder()
      .key("testString")
      .operator("testString")
      .value("testString")
      .build();
    assertEquals(v2PolicyAttributeModel.key(), "testString");
    assertEquals(v2PolicyAttributeModel.operator(), "testString");
    assertEquals(v2PolicyAttributeModel.value(), "testString");

    V2PolicyBaseSubject v2PolicyBaseSubjectModel = new V2PolicyBaseSubject.Builder()
      .attributes(java.util.Arrays.asList(v2PolicyAttributeModel))
      .build();
    assertEquals(v2PolicyBaseSubjectModel.attributes(), java.util.Arrays.asList(v2PolicyAttributeModel));

    V2PolicyBaseResource v2PolicyBaseResourceModel = new V2PolicyBaseResource.Builder()
      .attributes(java.util.Arrays.asList(v2PolicyAttributeModel))
      .build();
    assertEquals(v2PolicyBaseResourceModel.attributes(), java.util.Arrays.asList(v2PolicyAttributeModel));

    V2PolicyBaseRuleV2PolicyAttribute v2PolicyBaseRuleModel = new V2PolicyBaseRuleV2PolicyAttribute.Builder()
      .key("testString")
      .operator("testString")
      .value("testString")
      .build();
    assertEquals(v2PolicyBaseRuleModel.key(), "testString");
    assertEquals(v2PolicyBaseRuleModel.operator(), "testString");
    assertEquals(v2PolicyBaseRuleModel.value(), "testString");

    V2CreatePolicyOptions v2CreatePolicyOptionsModel = new V2CreatePolicyOptions.Builder()
      .type("testString")
      .control(v2PolicyBaseControlModel)
      .description("testString")
      .subject(v2PolicyBaseSubjectModel)
      .resource(v2PolicyBaseResourceModel)
      .pattern("testString")
      .rule(v2PolicyBaseRuleModel)
      .acceptLanguage("default")
      .build();
    assertEquals(v2CreatePolicyOptionsModel.type(), "testString");
    assertEquals(v2CreatePolicyOptionsModel.control(), v2PolicyBaseControlModel);
    assertEquals(v2CreatePolicyOptionsModel.description(), "testString");
    assertEquals(v2CreatePolicyOptionsModel.subject(), v2PolicyBaseSubjectModel);
    assertEquals(v2CreatePolicyOptionsModel.resource(), v2PolicyBaseResourceModel);
    assertEquals(v2CreatePolicyOptionsModel.pattern(), "testString");
    assertEquals(v2CreatePolicyOptionsModel.rule(), v2PolicyBaseRuleModel);
    assertEquals(v2CreatePolicyOptionsModel.acceptLanguage(), "default");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testV2CreatePolicyOptionsError() throws Throwable {
    new V2CreatePolicyOptions.Builder().build();
  }

}