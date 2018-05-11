/*
 * Copyright (C) 2016 The Android Open Source Project
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

package net.xpece.android.support.preference;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.util.AttributeSet;
import android.widget.AbsoluteLayout;

import javax.annotation.ParametersAreNonnullByDefault;

import static android.support.annotation.RestrictTo.Scope.GROUP_ID;

/**
 * Custom AbsoluteLayout that does not propagate the pressed state down to its children.
 * By default, the pressed state is propagated to all the children that are not clickable
 * or long-clickable.
 * @hide
 */
@ParametersAreNonnullByDefault
@RestrictTo(GROUP_ID)
@SuppressWarnings("deprecation")
public class UnPressableAbsoluteLayout extends AbsoluteLayout {
    public UnPressableAbsoluteLayout(Context context) {
        this(context, null);
    }

    public UnPressableAbsoluteLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void dispatchSetPressed(boolean pressed) {
        // Skip dispatching the pressed key state to the children so that they don't trigger any
        // pressed state animation on their stateful drawables.
    }
}
