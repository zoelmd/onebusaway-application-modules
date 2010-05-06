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
package org.onebusaway.webapp.gwt.notification;

import com.google.gwt.core.client.GWT;
import com.google.gwt.libideas.resources.client.SoundResource;
import com.google.gwt.resources.client.ClientBundle;

public interface NotificationWidgetStandardResources extends ClientBundle {

  public static NotificationWidgetStandardResources INSTANCE = GWT.create(NotificationWidgetStandardResources.class);

  @Source("OneBusAwayNotificationSound.mp3")
  public SoundResource getNotificationSound();
}