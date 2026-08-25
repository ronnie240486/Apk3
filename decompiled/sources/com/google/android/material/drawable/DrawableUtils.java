package com.google.android.material.drawable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class DrawableUtils {
    private DrawableUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static android.graphics.drawable.Drawable compositeTwoLayeredDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r8, @androidx.annotation.Nullable android.graphics.drawable.Drawable r9) {
            if (r8 != 0) goto L3
            return r9
        L3:
            if (r9 != 0) goto L6
            return r8
        L6:
            android.graphics.drawable.LayerDrawable r6 = new android.graphics.drawable.LayerDrawable
            r0 = 2
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r0]
            r2 = 0
            r1[r2] = r8
            r2 = 1
            r1[r2] = r9
            r6.<init>(r1)
            int r1 = r9.getIntrinsicWidth()
            r3 = -1
            if (r1 == r3) goto L6d
            int r1 = r9.getIntrinsicHeight()
            if (r1 != r3) goto L22
            goto L6d
        L22:
            int r1 = r9.getIntrinsicWidth()
            int r3 = r8.getIntrinsicWidth()
            if (r1 > r3) goto L3f
            int r1 = r9.getIntrinsicHeight()
            int r3 = r8.getIntrinsicHeight()
            if (r1 > r3) goto L3f
            int r1 = r9.getIntrinsicWidth()
            int r9 = r9.getIntrinsicHeight()
            goto L75
        L3f:
            int r1 = r9.getIntrinsicWidth()
            float r1 = (float) r1
            int r9 = r9.getIntrinsicHeight()
            float r9 = (float) r9
            float r1 = r1 / r9
            int r9 = r8.getIntrinsicWidth()
            float r9 = (float) r9
            int r3 = r8.getIntrinsicHeight()
            float r3 = (float) r3
            float r9 = r9 / r3
            int r9 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r9 < 0) goto L64
            int r9 = r8.getIntrinsicWidth()
            float r3 = (float) r9
            float r3 = r3 / r1
            int r1 = (int) r3
            r7 = r1
            r1 = r9
            r9 = r7
            goto L75
        L64:
            int r9 = r8.getIntrinsicHeight()
            float r3 = (float) r9
            float r1 = r1 * r3
            int r1 = (int) r1
            goto L75
        L6d:
            int r1 = r8.getIntrinsicWidth()
            int r9 = r8.getIntrinsicHeight()
        L75:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r3 < r4) goto L84
            r6.setLayerSize(r2, r1, r9)
            r8 = 17
            r6.setLayerGravity(r2, r8)
            goto L99
        L84:
            int r2 = r8.getIntrinsicWidth()
            int r2 = r2 - r1
            int r4 = r2 / 2
            int r8 = r8.getIntrinsicHeight()
            int r8 = r8 - r9
            int r5 = r8 / 2
            r1 = 1
            r0 = r6
            r2 = r4
            r3 = r5
            r0.setLayerInset(r1, r2, r3, r4, r5)
        L99:
            return r6
    }

    @androidx.annotation.Nullable
    public static android.graphics.drawable.Drawable createTintableDrawableIfNeeded(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1, @androidx.annotation.Nullable android.content.res.ColorStateList r2, @androidx.annotation.Nullable android.graphics.PorterDuff.Mode r3) {
            r0 = 0
            android.graphics.drawable.Drawable r1 = createTintableMutatedDrawableIfNeeded(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.Nullable
    public static android.graphics.drawable.Drawable createTintableMutatedDrawableIfNeeded(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2, @androidx.annotation.Nullable android.content.res.ColorStateList r3, @androidx.annotation.Nullable android.graphics.PorterDuff.Mode r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            android.graphics.drawable.Drawable r2 = createTintableMutatedDrawableIfNeeded(r2, r3, r4, r0)
            return r2
    }

    @androidx.annotation.Nullable
    private static android.graphics.drawable.Drawable createTintableMutatedDrawableIfNeeded(@androidx.annotation.Nullable android.graphics.drawable.Drawable r0, @androidx.annotation.Nullable android.content.res.ColorStateList r1, @androidx.annotation.Nullable android.graphics.PorterDuff.Mode r2, boolean r3) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            if (r1 == 0) goto L14
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            if (r2 == 0) goto L19
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r2)
            goto L19
        L14:
            if (r3 == 0) goto L19
            r0.mutate()
        L19:
            return r0
    }

    @androidx.annotation.NonNull
    public static int[] getCheckedState(@androidx.annotation.NonNull int[] r3) {
            r0 = 0
        L1:
            int r1 = r3.length
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r0 >= r1) goto L1c
            r1 = r3[r0]
            if (r1 != r2) goto Lc
            return r3
        Lc:
            r1 = r3[r0]
            if (r1 != 0) goto L19
            java.lang.Object r3 = r3.clone()
            int[] r3 = (int[]) r3
            r3[r0] = r2
            return r3
        L19:
            int r0 = r0 + 1
            goto L1
        L1c:
            int r0 = r3.length
            int r0 = r0 + 1
            int[] r0 = java.util.Arrays.copyOf(r3, r0)
            int r3 = r3.length
            r0[r3] = r2
            return r0
    }

    @androidx.annotation.NonNull
    public static int[] getUncheckedState(@androidx.annotation.NonNull int[] r6) {
            int r0 = r6.length
            int[] r0 = new int[r0]
            int r1 = r6.length
            r2 = 0
            r3 = 0
        L6:
            if (r2 >= r1) goto L17
            r4 = r6[r2]
            r5 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r4 == r5) goto L14
            int r5 = r3 + 1
            r0[r3] = r4
            r3 = r5
        L14:
            int r2 = r2 + 1
            goto L6
        L17:
            return r0
    }

    @androidx.annotation.NonNull
    public static android.util.AttributeSet parseDrawableXml(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.XmlRes int r4, @androidx.annotation.NonNull java.lang.CharSequence r5) {
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            android.content.res.XmlResourceParser r3 = r3.getXml(r4)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
        L8:
            int r0 = r3.next()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            r1 = 2
            if (r0 == r1) goto L12
            r2 = 1
            if (r0 != r2) goto L8
        L12:
            if (r0 != r1) goto L3f
            java.lang.String r0 = r3.getName()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            boolean r0 = android.text.TextUtils.equals(r0, r5)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            if (r0 == 0) goto L23
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r3)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            return r3
        L23:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            r0.<init>()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            java.lang.String r1 = "Must have a <"
            r0.append(r1)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            r0.append(r5)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            java.lang.String r5 = "> start tag"
            r0.append(r5)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            java.lang.String r5 = r0.toString()     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            r3.<init>(r5)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            throw r3     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
        L3f:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            java.lang.String r5 = "No start tag found"
            r3.<init>(r5)     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
            throw r3     // Catch: java.io.IOException -> L47 org.xmlpull.v1.XmlPullParserException -> L49
        L47:
            r3 = move-exception
            goto L4a
        L49:
            r3 = move-exception
        L4a:
            android.content.res.Resources$NotFoundException r5 = new android.content.res.Resources$NotFoundException
            java.lang.String r0 = "Can't load badge resource ID #0x"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            r5.initCause(r3)
            throw r5
    }

    public static void setOutlineToPath(@androidx.annotation.NonNull android.graphics.Outline r2, @androidx.annotation.NonNull android.graphics.Path r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            r2.setPath(r3)
            goto L1b
        La:
            r1 = 29
            if (r0 < r1) goto L12
            r2.setConvexPath(r3)     // Catch: java.lang.IllegalArgumentException -> L1b
            goto L1b
        L12:
            boolean r0 = r3.isConvex()
            if (r0 == 0) goto L1b
            r2.setConvexPath(r3)
        L1b:
            return
    }

    @android.annotation.TargetApi(21)
    public static void setRippleDrawableRadius(@androidx.annotation.Nullable android.graphics.drawable.RippleDrawable r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            r6.setRadius(r7)
            goto L26
        La:
            java.lang.Class<android.graphics.drawable.RippleDrawable> r0 = android.graphics.drawable.RippleDrawable.class
            java.lang.String r1 = "setMaxRadius"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.IllegalAccessException -> L27 java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L2b
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.IllegalAccessException -> L27 java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L2b
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.IllegalAccessException -> L27 java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L2b
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.IllegalAccessException -> L27 java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L2b
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.IllegalAccessException -> L27 java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L2b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.IllegalAccessException -> L27 java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L2b
            r1[r5] = r7     // Catch: java.lang.IllegalAccessException -> L27 java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L2b
            r0.invoke(r6, r1)     // Catch: java.lang.IllegalAccessException -> L27 java.lang.reflect.InvocationTargetException -> L29 java.lang.NoSuchMethodException -> L2b
        L26:
            return
        L27:
            r6 = move-exception
            goto L2c
        L29:
            r6 = move-exception
            goto L2c
        L2b:
            r6 = move-exception
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Couldn't set RippleDrawable radius"
            r7.<init>(r0, r6)
            throw r7
    }

    public static void setTint(@androidx.annotation.NonNull android.graphics.drawable.Drawable r4, @androidx.annotation.ColorInt int r5) {
            if (r5 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            r3 = 0
            if (r1 != r2) goto L18
            if (r0 == 0) goto L14
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r4.setColorFilter(r5, r0)
            goto L21
        L14:
            r4.setColorFilter(r3)
            goto L21
        L18:
            if (r0 == 0) goto L1e
            androidx.core.graphics.drawable.DrawableCompat.setTint(r4, r5)
            goto L21
        L1e:
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r4, r3)
        L21:
            return
    }

    @androidx.annotation.Nullable
    public static android.graphics.PorterDuffColorFilter updateTintFilter(@androidx.annotation.NonNull android.graphics.drawable.Drawable r1, @androidx.annotation.Nullable android.content.res.ColorStateList r2, @androidx.annotation.Nullable android.graphics.PorterDuff.Mode r3) {
            if (r2 == 0) goto L14
            if (r3 != 0) goto L5
            goto L14
        L5:
            int[] r1 = r1.getState()
            r0 = 0
            int r1 = r2.getColorForState(r1, r0)
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            r2.<init>(r1, r3)
            return r2
        L14:
            r1 = 0
            return r1
    }
}
