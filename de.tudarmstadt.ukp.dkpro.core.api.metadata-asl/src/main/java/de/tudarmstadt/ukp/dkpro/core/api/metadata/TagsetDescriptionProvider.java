/*******************************************************************************
 * Copyright 2013
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package de.tudarmstadt.ukp.dkpro.core.api.metadata;

import java.util.Map;
import java.util.Set;

/**
 * API for getting tagset information.
 */
public interface TagsetDescriptionProvider
{
    /**
     * Get a map (key-value pairs) using the layer name as key and the tagset as value. 
     */
    Map<String, String> getTagsets();
    
    Set<String> listTags(String aLayer, String aTagsetName);
}