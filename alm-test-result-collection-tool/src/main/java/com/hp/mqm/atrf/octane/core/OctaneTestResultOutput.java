/*
 *     Copyright 2017 Hewlett-Packard Development Company, L.P.
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */

package com.hp.mqm.atrf.octane.core;

import com.hp.mqm.atrf.core.entities.MapBasedObject;

/**
 * Created by berkovir on 11/12/2016.
 */
public class OctaneTestResultOutput extends MapBasedObject {
    public static final String FIELD_ID = "id";
    public static final String FIELD_STATUS = "status";

    public static final String FAILED_SEND_STATUS = "failed to send";
    public static final String ERROR_STATUS = "error";


    public Integer getId() {
        return (Integer) get(FIELD_ID);
    }

    public String getStatus() {
        return getString(FIELD_STATUS);
    }
}
