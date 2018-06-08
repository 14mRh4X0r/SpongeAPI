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
import org.spongepowered.api.block.tileentity.EndGateway;
import org.spongepowered.api.data.manipulator.DataManipulator;
import org.spongepowered.api.data.manipulator.immutable.tileentity.ImmutableEndGatewayData;
import org.spongepowered.api.data.value.mutable.MutableValue;

/**
 * Represents the data for an {@link EndGateway}.
 */
public interface EndGatewayData extends DataManipulator<EndGatewayData, ImmutableEndGatewayData> {

    /**
     * Gets the {@link MutableValue} for the exit portal location of
     * the {@link EndGateway}.
     *
     * @return The value for the exit portal location
     */
    MutableValue.Single<Vector3i> exitPosition();

    /**
     * Gets the {@link MutableValue} for the "should use exact teleport location"
     * state of the {@link EndGateway}.
     *
     * @return The value for the "should use exact teleport location" state
     */
    MutableValue.Single<Boolean> exactTeleport();

    /**
     * Gets the {@link MutableValue} for the age of the {@link EndGateway}.
     *
     * @return The value for the age
     */
    MutableValue.Single<Long> age();

    /**
     * Gets the {@link MutableValue} for the teleport cooldown of the {@link EndGateway}.
     *
     * @return The value for the teleport cooldown
     */
    MutableValue.Single<Integer> teleportCooldown();

}
