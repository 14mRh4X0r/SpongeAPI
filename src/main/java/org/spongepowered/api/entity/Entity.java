/*
 * This file is part of Sponge, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered.org <http://www.spongepowered.org>
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

package org.spongepowered.api.entity;

import org.spongepowered.api.event.block.BlockBreakEvent;
import org.spongepowered.api.event.cause.block.BreakCause;
import org.spongepowered.api.event.cause.block.PlaceCause;
import org.spongepowered.api.item.inventory.ItemStack;
import org.spongepowered.api.math.EulerDirection;
import org.spongepowered.api.math.Vector3d;
import org.spongepowered.api.math.Vector3f;

/**
 * An entity is a Minecraft entity.
 *
 * <p>Examples of entities include:</p>
 *
 * <ul>
 *     <li>Zombies</li>
 *     <li>Sheep</li>
 *     <li>Players</li>
 *     <li>Dropped items</li>
 *     <li>Dropped experience points</li>
 *     <li>etc.</li>
 * </ul>
 *
 * <p>Blocks and items (when they are in inventories) are not entities.</p>
 */
public interface Entity extends EntityState {

    /**
     * Mark this entity for removal in the very near future, preferably
     * within one game tick.
     */
    void remove();

    /**
     * Simulates the interaction with this object as if a player had done so.
     */
    void interact();

    /**
     * Simulates the interaction with this object using the given item as if
     * the player had done so.
     *
     * @param itemStack The item
     */
    void interactWith(ItemStack itemStack);

    /**
     * Gets the position.
     *
     * @return position The position
     */
    Vector3d getPosition();

    /**
     * Sets the position.
     *
     * @param position The position to set to
     */
    void setPosition(Vector3d position);

    /**
     * Get the X component of this instance's position.
     *
     * @return The x component
     */
    double getX();

    /**
     * Get the Y component of this instance's position.
     *
     * @return The y component
     */
    double getY();

    /**
     * Get the Z component of this instance's position.
     *
     * @return The z component
     */
    double getZ();

    /**
     * Gets the rotation as a vector.
     * This does not support the roll component of the entity's rotation.
     *
     * @return rotation A possibly, but not necessarily, unit vector
     */
    Vector3f getVectorRotation();

    /**
     * Sets the rotation to a vector.
     * This does not support the roll component of the entity's rotation,
     * any previous roll value will be removed.
     *
     * @param rotation The rotation to set the entity to
     */
    void setVectorRotation(Vector3f rotation);

    /**
     * Gets the rotation as a EulerDirection.
     *
     * @return rotation The rotation as a EulerDirection
     */
    EulerDirection getRotation();

    /**
     * Sets the rotation.
     *
     * @param rotation The rotation to set the entity to
     */
    void setRotation(EulerDirection rotation);
    
    /**
     * If this entity breaks a block, this is cause for {@link BlockBreakEvent}.
     * @return Block break cause for this entity.
     */
    BreakCause.Entity getBreakCause();
    
    /**
     * If this entity places a block, this is cause for {@link BlockPlaceEvent}.
     * @return Block place cause for this entity.
     */
    PlaceCause.Entity getPlaceCause();
}
