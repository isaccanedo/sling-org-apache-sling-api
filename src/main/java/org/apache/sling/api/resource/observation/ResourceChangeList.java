/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.sling.api.resource.observation;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * An instance of {@code ResourceChangeList} is passed to {@link ResourceChangeListener#onChange(List)}
 * to pass in additional information like the search path.
 *
 * @since 1.2.0 (Sling API Bundle 2.15.0)
 */
@ProviderType
public interface ResourceChangeList extends List<ResourceChange> {

    /**
     * Returns the search path used by the resource resolving.
     * <p>
     * Each entry in the array is an absolute path terminated with a slash
     * character. Thus to create an absolute path from a search path entry and a
     * relative path, the search path entry and relative path may just be
     * concatenated.
     *
     * @return The array of search paths
     * @see org.apache.sling.api.resource.ResourceResolver#getSearchPath()
     */
    String[] getSearchPath();
}
