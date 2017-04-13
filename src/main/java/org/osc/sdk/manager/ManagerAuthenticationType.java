/*******************************************************************************
 * Copyright (c) Intel Corporation
 * Copyright (c) 2017
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.osc.sdk.manager;

/**
 * This documents "Authentication Types". In this version we support two different types of authentication
 * Base Auth uses username and password
 * Key_Auth uses API Key
 */
public enum ManagerAuthenticationType {
    BASIC_AUTH("BASIC_AUTH"), KEY_AUTH("KEY_AUTH");

    private final String text;


    ManagerAuthenticationType(final String text) {
        this.text = text;
    }

    /**
     * Gets the {@link ManagerAuthenticationType} that corresponds to the provided string.
     * @param test The string value of the targeted type.
     * @return
     *  Returns the type for the provided string.
     */
    public static ManagerAuthenticationType getType(String text) {
        for (ManagerAuthenticationType type : ManagerAuthenticationType.values()) {
            if (text.equals(type.toString())) {
                return type;
            }
        }

        throw new IllegalArgumentException("No enum constant " + ManagerAuthenticationType.class.getCanonicalName()
                + " Found for " + text);
    }

    @Override
    public String toString() {
        return this.text;
    }
}
