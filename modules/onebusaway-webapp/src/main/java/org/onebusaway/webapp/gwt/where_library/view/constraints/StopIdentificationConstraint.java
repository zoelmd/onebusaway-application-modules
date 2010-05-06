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
/**
 * 
 */
package org.onebusaway.webapp.gwt.where_library.view.constraints;

import org.onebusaway.webapp.gwt.common.context.Context;
import org.onebusaway.webapp.gwt.common.widgets.DivWidget;
import org.onebusaway.webapp.gwt.where_library.resources.StopFinderCssResource;
import org.onebusaway.webapp.gwt.where_library.resources.StopFinderResources;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Image;

public class StopIdentificationConstraint extends AbstractConstraint {

  private static StopFinderCssResource _css = StopFinderResources.INSTANCE.getCSS();
  
  public void update(Context context) {

    FlowPanel panel = new FlowPanel();
    panel.addStyleName(_css.stopFinderStopIdentificationPanel());
    _resultsPanel.add(panel);

    DivWidget welcome = new DivWidget(_msgs.standardIndexPageStopIdentification());
    panel.add(welcome);

    Image imgA = new Image();
    ImageResource srcA = StopFinderResources.INSTANCE.getImageStopIdentificationSchedule();
    imgA.setUrlAndVisibleRect(srcA.getURL(), srcA.getLeft(), srcA.getTop(), srcA.getWidth(), srcA.getHeight());
    panel.add(imgA);

    DivWidget msgShelter = new DivWidget(_msgs.standardIndexPageStopIdentificationShelter());
    panel.add(msgShelter);

    Image imgB = new Image();
    ImageResource srcB = StopFinderResources.INSTANCE.getImageStopIdentificationShelter();
    imgB.setUrlAndVisibleRect(srcB.getURL(), srcB.getLeft(), srcB.getTop(), srcB.getWidth(), srcB.getHeight());
    panel.add(imgB);

    _stopFinder.setSearchText("");
  }
}