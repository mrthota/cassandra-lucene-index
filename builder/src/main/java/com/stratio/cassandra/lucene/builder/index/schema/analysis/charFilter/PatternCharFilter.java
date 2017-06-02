/*
 * Copyright (C) 2014 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stratio.cassandra.lucene.builder.index.schema.analysis.charFilter;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by jpgilaberte on 30/05/17.
 */
public class PatternCharFilter extends CharFilter{

    @JsonProperty("pattern")
    final String pattern;

    @JsonProperty("replacement")
    final String replacement;

    @JsonCreator
    public PatternCharFilter(@JsonProperty("pattern") String pattern, @JsonProperty("replacement") String replacement){
        this.pattern = pattern;
        this.replacement = replacement;
    }
}
