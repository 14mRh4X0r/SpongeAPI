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
package org.spongepowered.api.entity.projectile.arrow;

import org.spongepowered.api.data.key.Keys;
import org.spongepowered.api.data.manipulator.mutable.entity.KnockbackData;
import org.spongepowered.api.data.value.BoundedValue;
import org.spongepowered.api.entity.projectile.DamagingProjectile;

/**
 * Represents an arrow projectile.
 */
public interface Arrow extends DamagingProjectile {

    /**
     * Gets a copy of the current {@link KnockbackData} that this arrow
     * has.
     *
     * @return A copy of the knockback data
     */
    default KnockbackData getKnockbackData() {
        return get(KnockbackData.class).get();
    }

    /**
     * Gets the {@link BoundedValue.Mutable} for the "knockback strength"
     * that this arrow has.
     *
     * @return The immutable value for the knockback strength
     */
    default BoundedValue.Mutable<Integer> knockbackStrength() {
        return getValue(Keys.KNOCKBACK_STRENGTH).get().asMutable();
    }

}
