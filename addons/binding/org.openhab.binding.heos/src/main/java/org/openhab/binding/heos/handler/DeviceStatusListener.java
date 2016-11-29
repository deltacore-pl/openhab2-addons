/**
 * Copyright (c) 2016 openHAB UG (haftungsbeschraenkt) and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.heos.handler;

import org.eclipse.smarthome.core.thing.Bridge;
import org.openhab.binding.heos.internal.messages.HeosPlayer;

/**
 * The {@link DeviceStatusListener} is notified when a device status has changed
 * or a device has been removed or added.
 *
 * @author Jarle Hjortland - Initial contribution
 *
 */
public interface DeviceStatusListener {

    /**
     * This method is called whenever the state of the given device has changed.
     * The new state can be obtained by {@link FullLight#getState()}.
     *
     * @param bridge
     *            The HeosPlayer bridge the changed device is connected to.
     * @param device
     *            The device which received the state update.
     */
    public void onDeviceStateChanged(Bridge bridge, HeosPlayer device);

    /**
     * This method us called whenever a device is removed.
     *
     * @param bridge
     *            The HeosPlayer bridge the removed device was connected to.
     * @param device
     *            The device which is removed.
     */
    public void onDeviceRemoved(Bridge bridge, HeosPlayer device);

    /**
     * This method us called whenever a device is added.
     *
     * @param bridge
     *            The HeosPlayer bridge the added device was connected to.
     * @param device
     *            The device which is added.
     */
    public void onDeviceAdded(Bridge bridge, HeosPlayer device);

}
