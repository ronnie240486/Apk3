package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
final class StaticLayoutBuilderCompat {
    public static final int DEFAULT_HYPHENATION_FREQUENCY = 0;
    private static final java.lang.String TEXT_DIRS_CLASS = "android.text.TextDirectionHeuristics";
    private static final java.lang.String TEXT_DIR_CLASS = "android.text.TextDirectionHeuristic";
    private static final java.lang.String TEXT_DIR_CLASS_LTR = "LTR";
    private static final java.lang.String TEXT_DIR_CLASS_RTL = "RTL";

    @androidx.annotation.Nullable
    private static java.lang.reflect.Constructor<android.text.StaticLayout> constructor;
    private static boolean initialized;

    @androidx.annotation.Nullable
    private static java.lang.Object textDirection;
    private android.text.Layout.Alignment alignment;

    @androidx.annotation.Nullable
    private android.text.TextUtils.TruncateAt ellipsize;
    private int end;
    private int hyphenationFrequency;
    private boolean includePad;
    private boolean isRtl;
    private float lineSpacingAdd;
    private float lineSpacingMultiplier;
    private int maxLines;
    private final android.text.TextPaint paint;
    private java.lang.CharSequence source;
    private int start;

    @androidx.annotation.Nullable
    private com.google.android.material.internal.StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer;
    private final int width;

    /* JADX INFO: loaded from: classes2.dex */
    public static class StaticLayoutBuilderCompatException extends java.lang.Exception {
        public StaticLayoutBuilderCompatException(java.lang.Throwable r3) {
                r2 = this;
                java.lang.String r0 = "Error thrown initializing StaticLayout "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            com.google.android.material.internal.StaticLayoutBuilderCompat.DEFAULT_HYPHENATION_FREQUENCY = r0
            return
    }

    private StaticLayoutBuilderCompat(java.lang.CharSequence r1, android.text.TextPaint r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.paint = r2
            r0.width = r3
            r2 = 0
            r0.start = r2
            int r1 = r1.length()
            r0.end = r1
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            r0.alignment = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0.maxLines = r1
            r1 = 0
            r0.lineSpacingAdd = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.lineSpacingMultiplier = r1
            int r1 = com.google.android.material.internal.StaticLayoutBuilderCompat.DEFAULT_HYPHENATION_FREQUENCY
            r0.hyphenationFrequency = r1
            r1 = 1
            r0.includePad = r1
            r1 = 0
            r0.ellipsize = r1
            return
    }

    private void createConstructorWithReflection() throws com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException {
            r6 = this;
            boolean r0 = com.google.android.material.internal.StaticLayoutBuilderCompat.initialized
            if (r0 == 0) goto L5
            return
        L5:
            boolean r0 = r6.isRtl     // Catch: java.lang.Exception -> L69
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L13
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L69
            r3 = 23
            if (r0 < r3) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            java.lang.Class<android.text.TextDirectionHeuristic> r3 = android.text.TextDirectionHeuristic.class
            if (r0 == 0) goto L1b
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.RTL     // Catch: java.lang.Exception -> L69
            goto L1d
        L1b:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LTR     // Catch: java.lang.Exception -> L69
        L1d:
            com.google.android.material.internal.StaticLayoutBuilderCompat.textDirection = r0     // Catch: java.lang.Exception -> L69
            r0 = 13
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L69
            java.lang.Class<java.lang.CharSequence> r4 = java.lang.CharSequence.class
            r0[r1] = r4     // Catch: java.lang.Exception -> L69
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L69
            r0[r2] = r1     // Catch: java.lang.Exception -> L69
            r4 = 2
            r0[r4] = r1     // Catch: java.lang.Exception -> L69
            r4 = 3
            java.lang.Class<android.text.TextPaint> r5 = android.text.TextPaint.class
            r0[r4] = r5     // Catch: java.lang.Exception -> L69
            r4 = 4
            r0[r4] = r1     // Catch: java.lang.Exception -> L69
            r4 = 5
            java.lang.Class<android.text.Layout$Alignment> r5 = android.text.Layout.Alignment.class
            r0[r4] = r5     // Catch: java.lang.Exception -> L69
            r4 = 6
            r0[r4] = r3     // Catch: java.lang.Exception -> L69
            r3 = 7
            java.lang.Class r4 = java.lang.Float.TYPE     // Catch: java.lang.Exception -> L69
            r0[r3] = r4     // Catch: java.lang.Exception -> L69
            r3 = 8
            r0[r3] = r4     // Catch: java.lang.Exception -> L69
            r3 = 9
            java.lang.Class r4 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L69
            r0[r3] = r4     // Catch: java.lang.Exception -> L69
            r3 = 10
            java.lang.Class<android.text.TextUtils$TruncateAt> r4 = android.text.TextUtils.TruncateAt.class
            r0[r3] = r4     // Catch: java.lang.Exception -> L69
            r3 = 11
            r0[r3] = r1     // Catch: java.lang.Exception -> L69
            r3 = 12
            r0[r3] = r1     // Catch: java.lang.Exception -> L69
            java.lang.Class<android.text.StaticLayout> r1 = android.text.StaticLayout.class
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r0)     // Catch: java.lang.Exception -> L69
            com.google.android.material.internal.StaticLayoutBuilderCompat.constructor = r0     // Catch: java.lang.Exception -> L69
            r0.setAccessible(r2)     // Catch: java.lang.Exception -> L69
            com.google.android.material.internal.StaticLayoutBuilderCompat.initialized = r2     // Catch: java.lang.Exception -> L69
            return
        L69:
            r0 = move-exception
            com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException r1 = new com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException
            r1.<init>(r0)
            throw r1
    }

    @androidx.annotation.NonNull
    public static com.google.android.material.internal.StaticLayoutBuilderCompat obtain(@androidx.annotation.NonNull java.lang.CharSequence r1, @androidx.annotation.NonNull android.text.TextPaint r2, @androidx.annotation.IntRange(from = 0) int r3) {
            com.google.android.material.internal.StaticLayoutBuilderCompat r0 = new com.google.android.material.internal.StaticLayoutBuilderCompat
            r0.<init>(r1, r2, r3)
            return r0
    }

    public android.text.StaticLayout build() throws com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException {
            r9 = this;
            java.lang.CharSequence r0 = r9.source
            if (r0 != 0) goto L8
            java.lang.String r0 = ""
            r9.source = r0
        L8:
            int r0 = r9.width
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            java.lang.CharSequence r2 = r9.source
            int r3 = r9.maxLines
            r4 = 1
            if (r3 != r4) goto L1f
            android.text.TextPaint r3 = r9.paint
            float r5 = (float) r0
            android.text.TextUtils$TruncateAt r6 = r9.ellipsize
            java.lang.CharSequence r2 = android.text.TextUtils.ellipsize(r2, r3, r5, r6)
        L1f:
            int r3 = r2.length()
            int r5 = r9.end
            int r3 = java.lang.Math.min(r3, r5)
            r9.end = r3
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            if (r5 < r6) goto L90
            boolean r1 = r9.isRtl
            if (r1 == 0) goto L40
            int r1 = r9.maxLines
            if (r1 != r4) goto L40
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            r9.alignment = r1
        L40:
            int r1 = r9.start
            android.text.TextPaint r5 = r9.paint
            android.text.StaticLayout$Builder r0 = android.text.StaticLayout.Builder.obtain(r2, r1, r3, r5, r0)
            android.text.Layout$Alignment r1 = r9.alignment
            r0.setAlignment(r1)
            boolean r1 = r9.includePad
            r0.setIncludePad(r1)
            boolean r1 = r9.isRtl
            if (r1 == 0) goto L59
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.RTL
            goto L5b
        L59:
            android.text.TextDirectionHeuristic r1 = android.text.TextDirectionHeuristics.LTR
        L5b:
            r0.setTextDirection(r1)
            android.text.TextUtils$TruncateAt r1 = r9.ellipsize
            if (r1 == 0) goto L65
            r0.setEllipsize(r1)
        L65:
            int r1 = r9.maxLines
            r0.setMaxLines(r1)
            float r1 = r9.lineSpacingAdd
            int r2 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r2 != 0) goto L76
            float r2 = r9.lineSpacingMultiplier
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 == 0) goto L7b
        L76:
            float r2 = r9.lineSpacingMultiplier
            r0.setLineSpacing(r1, r2)
        L7b:
            int r1 = r9.maxLines
            if (r1 <= r4) goto L84
            int r1 = r9.hyphenationFrequency
            r0.setHyphenationFrequency(r1)
        L84:
            com.google.android.material.internal.StaticLayoutBuilderConfigurer r1 = r9.staticLayoutBuilderConfigurer
            if (r1 == 0) goto L8b
            r1.configure(r0)
        L8b:
            android.text.StaticLayout r0 = r0.build()
            return r0
        L90:
            r9.createConstructorWithReflection()
            java.lang.reflect.Constructor<android.text.StaticLayout> r3 = com.google.android.material.internal.StaticLayoutBuilderCompat.constructor     // Catch: java.lang.Exception -> L103
            java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3)     // Catch: java.lang.Exception -> L103
            java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3     // Catch: java.lang.Exception -> L103
            r5 = 13
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L103
            r5[r1] = r2     // Catch: java.lang.Exception -> L103
            int r1 = r9.start     // Catch: java.lang.Exception -> L103
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L103
            r5[r4] = r1     // Catch: java.lang.Exception -> L103
            r1 = 2
            int r2 = r9.end     // Catch: java.lang.Exception -> L103
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L103
            r5[r1] = r2     // Catch: java.lang.Exception -> L103
            r1 = 3
            android.text.TextPaint r2 = r9.paint     // Catch: java.lang.Exception -> L103
            r5[r1] = r2     // Catch: java.lang.Exception -> L103
            r1 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L103
            r5[r1] = r2     // Catch: java.lang.Exception -> L103
            r1 = 5
            android.text.Layout$Alignment r2 = r9.alignment     // Catch: java.lang.Exception -> L103
            r5[r1] = r2     // Catch: java.lang.Exception -> L103
            r1 = 6
            java.lang.Object r2 = com.google.android.material.internal.StaticLayoutBuilderCompat.textDirection     // Catch: java.lang.Exception -> L103
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)     // Catch: java.lang.Exception -> L103
            r5[r1] = r2     // Catch: java.lang.Exception -> L103
            r1 = 7
            java.lang.Float r2 = java.lang.Float.valueOf(r7)     // Catch: java.lang.Exception -> L103
            r5[r1] = r2     // Catch: java.lang.Exception -> L103
            r1 = 8
            java.lang.Float r2 = java.lang.Float.valueOf(r8)     // Catch: java.lang.Exception -> L103
            r5[r1] = r2     // Catch: java.lang.Exception -> L103
            r1 = 9
            boolean r2 = r9.includePad     // Catch: java.lang.Exception -> L103
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> L103
            r5[r1] = r2     // Catch: java.lang.Exception -> L103
            r1 = 10
            r2 = 0
            r5[r1] = r2     // Catch: java.lang.Exception -> L103
            r1 = 11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L103
            r5[r1] = r0     // Catch: java.lang.Exception -> L103
            r0 = 12
            int r1 = r9.maxLines     // Catch: java.lang.Exception -> L103
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L103
            r5[r0] = r1     // Catch: java.lang.Exception -> L103
            java.lang.Object r0 = r3.newInstance(r5)     // Catch: java.lang.Exception -> L103
            android.text.StaticLayout r0 = (android.text.StaticLayout) r0     // Catch: java.lang.Exception -> L103
            return r0
        L103:
            r0 = move-exception
            com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException r1 = new com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException
            r1.<init>(r0)
            throw r1
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setAlignment(@androidx.annotation.NonNull android.text.Layout.Alignment r1) {
            r0 = this;
            r0.alignment = r1
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setEllipsize(@androidx.annotation.Nullable android.text.TextUtils.TruncateAt r1) {
            r0 = this;
            r0.ellipsize = r1
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setEnd(@androidx.annotation.IntRange(from = 0) int r1) {
            r0 = this;
            r0.end = r1
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setHyphenationFrequency(int r1) {
            r0 = this;
            r0.hyphenationFrequency = r1
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setIncludePad(boolean r1) {
            r0 = this;
            r0.includePad = r1
            return r0
    }

    public com.google.android.material.internal.StaticLayoutBuilderCompat setIsRtl(boolean r1) {
            r0 = this;
            r0.isRtl = r1
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setLineSpacing(float r1, float r2) {
            r0 = this;
            r0.lineSpacingAdd = r1
            r0.lineSpacingMultiplier = r2
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setMaxLines(@androidx.annotation.IntRange(from = 0) int r1) {
            r0 = this;
            r0.maxLines = r1
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setStart(@androidx.annotation.IntRange(from = 0) int r1) {
            r0 = this;
            r0.start = r1
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.android.material.internal.StaticLayoutBuilderCompat setStaticLayoutBuilderConfigurer(@androidx.annotation.Nullable com.google.android.material.internal.StaticLayoutBuilderConfigurer r1) {
            r0 = this;
            r0.staticLayoutBuilderConfigurer = r1
            return r0
    }
}
