/*
 * Copyright 2008 Brian Ferris
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.onebusaway.phone.actions.schedule;

import org.onebusaway.phone.actions.AbstractAction;
import org.onebusaway.transit_data.model.StopWithArrivalsAndDeparturesBean;

import com.opensymphony.xwork2.ModelDriven;

import java.util.Date;

public class ArrivalsAndDeparturesForStopIdAction extends AbstractAction
    implements ModelDriven<StopWithArrivalsAndDeparturesBean> {

  private static final long serialVersionUID = 1L;

  private String _stopId;

  private StopWithArrivalsAndDeparturesBean _result;

  public StopWithArrivalsAndDeparturesBean getModel() {
    return _result;
  }

  public void setModel(StopWithArrivalsAndDeparturesBean result) {
    _result = result;
  }

  public void setStopId(String stopId) {
    _stopId = stopId;
  }

  public String execute() throws Exception {

    _result = _transitDataService.getStopWithArrivalsAndDepartures(_stopId,
        new Date());

    if (_result == null)
      return INPUT;

    _userDataService.setLastSelectedStopId(_stopId);
    return SUCCESS;
  }
}