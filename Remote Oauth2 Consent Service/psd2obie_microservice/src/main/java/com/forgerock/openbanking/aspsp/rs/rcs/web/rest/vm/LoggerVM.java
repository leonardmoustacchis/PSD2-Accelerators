/***************************************************************************
 *  Copyright 2019 ForgeRock
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 ***************************************************************************/
package com.forgerock.openbanking.aspsp.rs.rcs.web.rest.vm;

import ch.qos.logback.classic.Logger;

/**
 * View Model object for storing a Logback logger.
 */
public class LoggerVM {

    private String name;

    private String level;

    public LoggerVM(Logger logger) {
        this.name = logger.getName();
        this.level = logger.getEffectiveLevel().toString();
    }

    public LoggerVM() {
        // Empty public constructor used by Jackson.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "LoggerVM{" +
            "name='" + name + '\'' +
            ", level='" + level + '\'' +
            '}';
    }
}
