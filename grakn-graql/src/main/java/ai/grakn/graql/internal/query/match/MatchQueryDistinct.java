/*
 * Grakn - A Distributed Semantic Database
 * Copyright (C) 2016  Grakn Labs Limited
 *
 * Grakn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Grakn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Grakn. If not, see <http://www.gnu.org/licenses/gpl.txt>.
 */

package ai.grakn.graql.internal.query.match;

import ai.grakn.concept.Concept;

import java.util.Map;
import java.util.stream.Stream;

/**
 * "Distinct" modifier for a match query that eliminates duplicate results.
 */
class MatchQueryDistinct extends MatchQueryModifier {

    MatchQueryDistinct(MatchQueryInternal inner) {
        super(inner);
    }

    @Override
    public Stream<Map<String, Concept>> transformStream(Stream<Map<String, Concept>> stream) {
        return stream.distinct();
    }

    @Override
    protected String modifierString() {
        return "distinct";
    }
}
