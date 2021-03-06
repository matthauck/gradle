/*
 * Copyright 2014 the original author or authors.
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

package org.gradle.tooling.model.gradle;

import org.gradle.api.Incubating;
import org.gradle.tooling.model.DomainObjectSet;
import org.gradle.tooling.model.TaskSelector;

/**
 * A model providing access to {@link org.gradle.tooling.model.EntryPoint}s that can be used
 * to initiate Gradle build.
 *
 * @since 1.12
 */
@Incubating
public interface BuildInvocations {
    /*
     * Returns tasks selectors that can be used to execute build.
     *
     * @return Task selectors.
     * @since 1.12
     */
    @Incubating
    DomainObjectSet<? extends TaskSelector> getTaskSelectors();
}
