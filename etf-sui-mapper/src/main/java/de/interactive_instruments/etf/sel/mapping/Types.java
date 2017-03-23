/**
 * Copyright 2010-2016 interactive instruments GmbH
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
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.interactive_instruments.etf.sel.mapping;

import de.interactive_instruments.etf.dal.dto.capabilities.TestObjectTypeDto;
import de.interactive_instruments.etf.dal.dto.test.TestItemTypeDto;
import de.interactive_instruments.etf.model.DefaultEidMap;
import de.interactive_instruments.etf.model.EID;
import de.interactive_instruments.etf.model.EidFactory;
import de.interactive_instruments.etf.model.EidMap;

/**
 * @author J. Herrmann ( herrmann <aT) interactive-instruments (doT> de )
 */
public class Types {

	public final static TestItemTypeDto HTTP_REQUEST_STEP_IT = new TestItemTypeDto();
	public final static EID HTTP_REQUEST_STEP_ID = EidFactory.getDefault().createAndPreserveStr("6b16aa44-bdc7-4120-a790-4b74fc9ace62");

	public final static TestItemTypeDto GROOVY_STEP_IT = new TestItemTypeDto();
	public final static EID GROOVY_STEP_ID = EidFactory.getDefault().createAndPreserveStr("90bdc939-bd42-41a0-9ef8-19e0ec04f89d");

	public final static TestItemTypeDto XPATH_MATCH_ASSERTION_IT = new TestItemTypeDto();
	public final static EID XPATH_MATCH_ASSERTION_ID = EidFactory.getDefault().createAndPreserveStr("73c00044-a592-450f-8aff-7fb1da91c1df");

	public final static TestItemTypeDto XQUERY_MATCH_ASSERTION_IT = new TestItemTypeDto();
	public final static EID XQUERY_MATCH_ASSERTION_ID = EidFactory.getDefault().createAndPreserveStr("5c28b666-4dda-43af-aa6e-1eed6212d8d8");

	public final static TestItemTypeDto GROOVY_ASSERTION_IT = new TestItemTypeDto();
	public final static EID GROOVY_ASSERTION_ID = EidFactory.getDefault().createAndPreserveStr("fad9282c-1f1f-492b-b6ab-248430154310");

	public final static TestItemTypeDto SCHEMA_ASSERTION_IT = new TestItemTypeDto();
	public final static EID SCHEMA_ASSERTION_ID = EidFactory.getDefault().createAndPreserveStr("5ee1ae1a-e79f-41bb-bfb0-62cef89ca460");

	public final static TestItemTypeDto BASIC_ASSERTION_IT = new TestItemTypeDto();
	public final static EID BASIC_ASSERTION_ID = EidFactory.getDefault().createAndPreserveStr("e7e29c93-4c50-41c2-82d1-0f2db6a1abf6");

	public final static TestItemTypeDto DISABLED_ASSERTION_IT = new TestItemTypeDto();
	public final static EID DISABLED_ASSERTION_ID = EidFactory.getDefault().createAndPreserveStr("7789efec-2112-4d6c-89ea-12c88c56a62a");

	// Supported Test Item Types
	public final static EidMap<TestItemTypeDto> TEST_ITEM_TYPES = new DefaultEidMap<TestItemTypeDto>() {
		{
			{
				HTTP_REQUEST_STEP_IT.setLabel("HTTP Request Step");
				HTTP_REQUEST_STEP_IT.setId(HTTP_REQUEST_STEP_ID);
				HTTP_REQUEST_STEP_IT.setDescription("A HTTP Request Step is used to call any HTTP service through HTTP and HTTPS");
				HTTP_REQUEST_STEP_IT.setReference("https://www.soapui.org/functional-testing/teststep-reference/http-request/.html");
				put(HTTP_REQUEST_STEP_IT.getId(), HTTP_REQUEST_STEP_IT);
			}
			{
				GROOVY_STEP_IT.setLabel("Script Test Step");
				GROOVY_STEP_IT.setId(GROOVY_STEP_ID);
				GROOVY_STEP_IT.setDescription("A Test Step which will execute the contained script each time it is run. "
						+ "Used to control the sequence of tests.");
				GROOVY_STEP_IT.setReference("https://www.soapui.org/functional-testing/working-with-scripts.html");
				put(GROOVY_STEP_IT.getId(), GROOVY_STEP_IT);
			}
			{
				XPATH_MATCH_ASSERTION_IT.setLabel("XPath Match Assertion");
				XPATH_MATCH_ASSERTION_IT.setId(XPATH_MATCH_ASSERTION_ID);
				XPATH_MATCH_ASSERTION_IT.setDescription("The XPath assertion applies a XPath expression to the service response and fails if the resulting selection does not match the expected value.");
				XPATH_MATCH_ASSERTION_IT.setReference("https://www.soapui.org/functional-testing/validating-messages/validating-xml-messages.html#1-The-XPath-Match-Assertion");
				put(XPATH_MATCH_ASSERTION_IT.getId(), XPATH_MATCH_ASSERTION_IT);
			}
			{
				XQUERY_MATCH_ASSERTION_IT.setLabel("XQuery Match Assertion");
				XQUERY_MATCH_ASSERTION_IT.setId(XQUERY_MATCH_ASSERTION_ID);
				XQUERY_MATCH_ASSERTION_IT.setDescription("The XQuery assertion applies a XQuery expression to the service response and fails if the resulting selection does not match the expected value.");
				XQUERY_MATCH_ASSERTION_IT.setReference("https://www.soapui.org/functional-testing/validating-messages/validating-xml-messages.html#2-The-XQuery-Match-Assertion");
				put(XQUERY_MATCH_ASSERTION_IT.getId(), XQUERY_MATCH_ASSERTION_IT);
			}
			{
				GROOVY_ASSERTION_IT.setLabel("Script Assertion");
				GROOVY_ASSERTION_IT.setId(GROOVY_ASSERTION_ID);
				GROOVY_ASSERTION_IT.setDescription("The Script assertion is used forcomplex validations of the service response.");
				GROOVY_ASSERTION_IT.setReference("https://www.soapui.org/functional-testing/validating-messages/using-script-assertions.html");
				put(GROOVY_ASSERTION_IT.getId(), GROOVY_ASSERTION_IT);
			}
			{
				SCHEMA_ASSERTION_IT.setLabel("Schema Validation Assertion");
				SCHEMA_ASSERTION_IT.setId(SCHEMA_ASSERTION_ID);
				SCHEMA_ASSERTION_IT.setDescription("The Schema Validation assertion is used to validate a service response against a XML schema.");
				SCHEMA_ASSERTION_IT.setReference("http://interactive-instruments.de");
				put(SCHEMA_ASSERTION_IT.getId(), SCHEMA_ASSERTION_IT);
			}

			{
				BASIC_ASSERTION_IT.setLabel("Basic Assertion");
				BASIC_ASSERTION_IT.setId(BASIC_ASSERTION_ID);
				BASIC_ASSERTION_IT.setDescription("Basic Assertion");
				BASIC_ASSERTION_IT.setReference("http://interactive-instruments.de");
				put(BASIC_ASSERTION_IT.getId(), BASIC_ASSERTION_IT);
			}

			{
				DISABLED_ASSERTION_IT.setLabel("Disabled");
				DISABLED_ASSERTION_IT.setId(DISABLED_ASSERTION_ID);
				DISABLED_ASSERTION_IT.setDescription("Assertion which is disabled");
				DISABLED_ASSERTION_IT.setReference("http://interactive-instruments.de");
				put(DISABLED_ASSERTION_IT.getId(), DISABLED_ASSERTION_IT);
			}
		}
	};

	// Supported Test Object Types
	public static TestObjectTypeDto SIMPLE_WEB_SERVICE_TOT = new TestObjectTypeDto();
	public static EID SIMPLE_WEB_SERVICE_ID = EidFactory.getDefault().createAndPreserveStr("88311f83-818c-46ed-8a9a-cec4f3707365");

	public static TestObjectTypeDto WFS_2_0_TOT = new TestObjectTypeDto();
	public static EID WFS_2_0_ID = EidFactory.getDefault().createAndPreserveStr("9b6ef734-981e-4d60-aa81-d6730a1c6389");

	public static TestObjectTypeDto INSPIRE_DOWNLOAD_DIRECT_TOT = new TestObjectTypeDto();
	public static EID INSPIRE_DOWNLOAD_DIRECT_ID = EidFactory.getDefault().createAndPreserveStr("dd83316d-7c30-49ad-8cc9-e5b73e501faa");

	public static TestObjectTypeDto ATOM_TOT = new TestObjectTypeDto();
	public static EID ATOM_ID = EidFactory.getDefault().createAndPreserveStr("49d881ae-b115-4b91-aabe-31d5791bce52");

	public static TestObjectTypeDto INSPIRE_DOWNLOAD_ATOM_TOT = new TestObjectTypeDto();
	public static EID INSPIRE_DOWNLOAD_ATOM_ID = EidFactory.getDefault().createAndPreserveStr("9c5bd10c-8311-4f0b-9633-b867028cacd6");

	public static final EidMap<TestObjectTypeDto> TEST_OBJECT_TYPES = new DefaultEidMap<TestObjectTypeDto>() {
		{
			SIMPLE_WEB_SERVICE_TOT.setLabel("Web Service");
			SIMPLE_WEB_SERVICE_TOT.setId(SIMPLE_WEB_SERVICE_ID);
			SIMPLE_WEB_SERVICE_TOT.setDescription("A web Service with a HTTP interface that is not described in more detail.");
			put(SIMPLE_WEB_SERVICE_ID, SIMPLE_WEB_SERVICE_TOT);
		}

		{
			WFS_2_0_TOT.setLabel("Web Feature Service 2.0");
			WFS_2_0_TOT.setId(WFS_2_0_ID);
			WFS_2_0_TOT.setDescription("A Web Service implementing ISO 19142 Web Feature Service and ISO 19143 Filter Encoding");
			WFS_2_0_TOT.setParent(SIMPLE_WEB_SERVICE_TOT);
			put(WFS_2_0_ID, WFS_2_0_TOT);
		}

		{
			INSPIRE_DOWNLOAD_DIRECT_TOT.setLabel("INSPIRE Download Service 3.1 - Direct Access WFS 2.0");
			INSPIRE_DOWNLOAD_DIRECT_TOT.setId(INSPIRE_DOWNLOAD_DIRECT_ID);
			INSPIRE_DOWNLOAD_DIRECT_TOT.setDescription("INSPIRE Download Service 3.1 - Direct Access WFS 2.0");
			INSPIRE_DOWNLOAD_DIRECT_TOT.setParent(WFS_2_0_TOT);
			put(INSPIRE_DOWNLOAD_DIRECT_ID, INSPIRE_DOWNLOAD_DIRECT_TOT);
		}

		{
			ATOM_TOT.setLabel("Web Feed");
			ATOM_TOT.setId(ATOM_ID);
			ATOM_TOT.setDescription("A Web Feed implementing the Atom Syndication Format, describing update information about published data.");
			put(ATOM_ID, ATOM_TOT);
		}

		{
			INSPIRE_DOWNLOAD_ATOM_TOT.setLabel("INSPIRE Download Service 3.1 - Download Service Feed");
			INSPIRE_DOWNLOAD_ATOM_TOT.setId(INSPIRE_DOWNLOAD_ATOM_ID);
			INSPIRE_DOWNLOAD_ATOM_TOT.setDescription("A top-level Download Service Feed, describing update information about published pre-defined datasets.");
			INSPIRE_DOWNLOAD_ATOM_TOT.setParent(ATOM_TOT);
			put(INSPIRE_DOWNLOAD_ATOM_ID, INSPIRE_DOWNLOAD_ATOM_TOT);
		}
	};
}
