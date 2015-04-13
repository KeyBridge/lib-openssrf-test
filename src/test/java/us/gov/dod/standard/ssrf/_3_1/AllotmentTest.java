/* 
 * Copyright 2015 Key Bridge LLC.
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
package us.gov.dod.standard.ssrf._3_1;

import junit.framework.TestCase;
import us.gov.dod.standard.ssrf.EDatasetType;
import us.gov.dod.standard.ssrf.SSRFTestUtility;

/**
 *
 * @author jesse
 */
public class AllotmentTest extends TestCase {

  //<editor-fold defaultstate="collapsed" desc="Certification Test for Allotment">
  /**
   * Test a MAX-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumPositiveFill_AL() throws Exception {
    SSRFTestUtility.testMaximumPositiveFill(EDatasetType.AL);
  }

  /**
   * Test a MIN-fill record with a GOOD configuration.
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumPositiveFill_AL() throws Exception {
    SSRFTestUtility.testMinimumPositiveFill(EDatasetType.AL);
  }

  /**
   * Test a MAX-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMaximumNegativeFill_AL() throws Exception {
    SSRFTestUtility.testMaximumNegativeFill(EDatasetType.AL);
  }

  /**
   * Test a MIN-fill record with randomly seeded BAD configuration(s).
   * <p>
   * @throws Exception if the SSRF document fails to validate.
   */
  public void testMinimumNegativeFill_AL() throws Exception {
    SSRFTestUtility.testMinimumNegativeFill(EDatasetType.AL);
  }//</editor-fold>

}
