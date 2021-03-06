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
package org.spongepowered.api.event.cause;

import org.spongepowered.api.CatalogType;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.util.ResettableBuilder;
import org.spongepowered.api.util.annotation.CatalogedBy;

/**
 * A key for values in the {@link EventContext}.
 *
 * @param <T> The type of the value stored with this key
 */
@CatalogedBy(EventContextKeys.class)
public interface EventContextKey<T> extends CatalogType {

    /**
     * Creates a builder to be used for creating a new {@link EventContextKey}.
     *
     * @param clazz The class the key will allow access to
     * @param <T> The type of the value stored with this key
     * @return The constructed builder
     */
    @SuppressWarnings("unchecked")
    static <T> Builder<T> builder(Class<T> clazz) {
        return Sponge.getRegistry().createBuilder(Builder.class).type(clazz);
    }

    /**
     * Gets the allowed type for the value of this key.
     * 
     * @return The allowed type
     */
    Class<T> getAllowedType();

    interface Builder<T> extends ResettableBuilder<EventContextKey<T>, Builder<T>> {

        Builder<T> type(Class<T> tClass);

        Builder<T> id(String id);

        Builder<T> name(String name);

        EventContextKey<T> build();

        @Override
        Builder<T> from(EventContextKey<T> value) throws UnsupportedOperationException;

        @Override
        Builder<T> reset();
    }
}
