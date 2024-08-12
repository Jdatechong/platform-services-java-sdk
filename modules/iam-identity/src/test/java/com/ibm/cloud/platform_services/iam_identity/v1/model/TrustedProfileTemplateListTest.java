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

import com.ibm.cloud.platform_services.iam_identity.v1.model.ActionControls;
import com.ibm.cloud.platform_services.iam_identity.v1.model.ActionControlsIdentities;
import com.ibm.cloud.platform_services.iam_identity.v1.model.ActionControlsPolicies;
import com.ibm.cloud.platform_services.iam_identity.v1.model.ActionControlsRules;
import com.ibm.cloud.platform_services.iam_identity.v1.model.EnityHistoryRecord;
import com.ibm.cloud.platform_services.iam_identity.v1.model.PolicyTemplateReference;
import com.ibm.cloud.platform_services.iam_identity.v1.model.ProfileClaimRuleConditions;
import com.ibm.cloud.platform_services.iam_identity.v1.model.ProfileIdentityResponse;
import com.ibm.cloud.platform_services.iam_identity.v1.model.ResponseContext;
import com.ibm.cloud.platform_services.iam_identity.v1.model.TemplateProfileComponentResponse;
import com.ibm.cloud.platform_services.iam_identity.v1.model.TrustedProfileTemplateClaimRule;
import com.ibm.cloud.platform_services.iam_identity.v1.model.TrustedProfileTemplateList;
import com.ibm.cloud.platform_services.iam_identity.v1.model.TrustedProfileTemplateResponse;
import com.ibm.cloud.platform_services.iam_identity.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the TrustedProfileTemplateList model.
 */
public class TrustedProfileTemplateListTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testTrustedProfileTemplateList() throws Throwable {
    TrustedProfileTemplateList trustedProfileTemplateListModel = new TrustedProfileTemplateList();
    assertNull(trustedProfileTemplateListModel.getContext());
    assertNull(trustedProfileTemplateListModel.getOffset());
    assertNull(trustedProfileTemplateListModel.getLimit());
    assertNull(trustedProfileTemplateListModel.getFirst());
    assertNull(trustedProfileTemplateListModel.getPrevious());
    assertNull(trustedProfileTemplateListModel.getNext());
    assertNull(trustedProfileTemplateListModel.getProfileTemplates());
  }
}