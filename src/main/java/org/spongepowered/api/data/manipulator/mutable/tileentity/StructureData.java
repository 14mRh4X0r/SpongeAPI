/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.spongepowered.api.data.manipulator.mutable.tileentity;

import com.flowpowered.math.vector.Vector3i;
import org.spongepowered.api.block.tileentity.Structure;
import org.spongepowered.api.data.manipulator.DataManipulator;
import org.spongepowered.api.data.manipulator.immutable.tileentity.ImmutableStructureData;
import org.spongepowered.api.data.type.StructureMode;
import org.spongepowered.api.data.value.mutable.MutableValue;

/**
 * Represents the data for an {@link Structure}.
 */
public interface StructureData extends DataManipulator<StructureData, ImmutableStructureData> {

    /**
     * Gets the {@link MutableValue} for the author of the {@link Structure}.
     *
     * @return The value for the author
     */
    MutableValue.Single<String> author();

    /**
     * Gets the {@link MutableValue} for the ignore entities state of the {@link Structure}.
     *
     * @return The value for the ignore entities state
     */
    MutableValue.Single<Boolean> ignoreEntities();

    /**
     * Gets the {@link MutableValue} for the integrity of the {@link Structure}.
     *
     * @return The value for the integrity
     */
    MutableValue.Single<Float> integrity();

    /**
     * Gets the {@link MutableValue} for the mode of the {@link Structure}.
     *
     * @return The value for the mode
     */
    MutableValue.Single<StructureMode> mode();

    /**
     * Gets the {@link MutableValue} for the position of the {@link Structure}.
     *
     * @return The value for the position
     */
    MutableValue.Single<Vector3i> position();

    /**
     * Gets the {@link MutableValue} for the powered state of the {@link Structure}.
     *
     * @return The value for the powered state
     */
    MutableValue.Single<Boolean> powered();

    /**
     * Gets the {@link MutableValue} for the seed of the {@link Structure}.
     *
     * @return The value for the seed
     */
    MutableValue.Single<Long> seed();

    /**
     * Gets the {@link MutableValue} for the show air state of the {@link Structure}.
     *
     * @return The value for the show air state
     */
    MutableValue.Single<Boolean> showAir();

    /**
     * Gets the {@link MutableValue} for the show bounding box state of the {@link Structure}.
     *
     * @return The value for the show bounding box state
     */
    MutableValue.Single<Boolean> showBoundingBox();

    /**
     * Gets the {@link MutableValue} for the size of the {@link Structure}.
     *
     * @return The value for the size
     */
    MutableValue.Single<Vector3i> size();

}
