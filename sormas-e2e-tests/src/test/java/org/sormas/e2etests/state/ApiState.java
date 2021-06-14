/*
 * SORMAS® - Surveillance Outbreak Response Management & Analysis System
 * Copyright © 2016-2021 Helmholtz-Zentrum für Infektionsforschung GmbH (HZI)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */
package org.sormas.e2etests.state;

import cucumber.runtime.java.guice.ScenarioScoped;
import io.restassured.response.Response;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.sormas.e2etests.pojo.api.Case;
import org.sormas.e2etests.pojo.api.Contact;
import org.sormas.e2etests.pojo.api.Event;
import org.sormas.e2etests.pojo.api.Person;
import org.sormas.e2etests.pojo.api.Sample;
import org.sormas.e2etests.pojo.api.Task;

@ScenarioScoped
@Getter
@Setter
public class ApiState {
  Response response;
  Person editPerson;
  Case createdCase;
  List<Sample> createdSamples;
  Contact createdContact;
  Event createdEvent;
  Task createdTask;
  Sample createdSample;
}
