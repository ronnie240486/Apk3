package androidx.core.text;

/* JADX INFO: loaded from: classes.dex */
public class PrecomputedTextCompat implements android.text.Spannable {
    private static final char LINE_FEED = '\n';

    @androidx.annotation.NonNull
    @androidx.annotation.GuardedBy("sLock")
    private static java.util.concurrent.Executor sExecutor;
    private static final java.lang.Object sLock = null;

    @androidx.annotation.NonNull
    private final int[] mParagraphEnds;

    @androidx.annotation.NonNull
    private final androidx.core.text.PrecomputedTextCompat.Params mParams;

    @androidx.annotation.NonNull
    private final android.text.Spannable mText;

    @androidx.annotation.Nullable
    private final android.text.PrecomputedText mWrapped;

    public static final class Params {
        private final int mBreakStrategy;
        private final int mHyphenationFrequency;

        @androidx.annotation.NonNull
        private final android.text.TextPaint mPaint;

        @androidx.annotation.Nullable
        private final android.text.TextDirectionHeuristic mTextDir;
        public final android.text.PrecomputedText.Params mWrapped;

        /* JADX INFO: loaded from: classes2.dex */
        public static class Builder {
            private int mBreakStrategy;
            private int mHyphenationFrequency;

            @androidx.annotation.NonNull
            private final android.text.TextPaint mPaint;
            private android.text.TextDirectionHeuristic mTextDir;

            public Builder(@androidx.annotation.NonNull android.text.TextPaint r2) {
                    r1 = this;
                    r1.<init>()
                    r1.mPaint = r2
                    int r2 = android.os.Build.VERSION.SDK_INT
                    r0 = 23
                    if (r2 < r0) goto L11
                    r2 = 1
                    r1.mBreakStrategy = r2
                    r1.mHyphenationFrequency = r2
                    goto L16
                L11:
                    r2 = 0
                    r1.mHyphenationFrequency = r2
                    r1.mBreakStrategy = r2
                L16:
                    android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
                    r1.mTextDir = r2
                    return
            }

            @androidx.annotation.NonNull
            public androidx.core.text.PrecomputedTextCompat.Params build() {
                    r5 = this;
                    androidx.core.text.PrecomputedTextCompat$Params r0 = new androidx.core.text.PrecomputedTextCompat$Params
                    android.text.TextPaint r1 = r5.mPaint
                    android.text.TextDirectionHeuristic r2 = r5.mTextDir
                    int r3 = r5.mBreakStrategy
                    int r4 = r5.mHyphenationFrequency
                    r0.<init>(r1, r2, r3, r4)
                    return r0
            }

            @androidx.annotation.RequiresApi(23)
            public androidx.core.text.PrecomputedTextCompat.Params.Builder setBreakStrategy(int r1) {
                    r0 = this;
                    r0.mBreakStrategy = r1
                    return r0
            }

            @androidx.annotation.RequiresApi(23)
            public androidx.core.text.PrecomputedTextCompat.Params.Builder setHyphenationFrequency(int r1) {
                    r0 = this;
                    r0.mHyphenationFrequency = r1
                    return r0
            }

            @androidx.annotation.RequiresApi(18)
            public androidx.core.text.PrecomputedTextCompat.Params.Builder setTextDirection(@androidx.annotation.NonNull android.text.TextDirectionHeuristic r1) {
                    r0 = this;
                    r0.mTextDir = r1
                    return r0
            }
        }

        @androidx.annotation.RequiresApi(28)
        public Params(@androidx.annotation.NonNull android.text.PrecomputedText.Params r3) {
                r2 = this;
                r2.<init>()
                android.text.TextPaint r0 = r3.getTextPaint()
                r2.mPaint = r0
                android.text.TextDirectionHeuristic r0 = r3.getTextDirection()
                r2.mTextDir = r0
                int r0 = r3.getBreakStrategy()
                r2.mBreakStrategy = r0
                int r0 = r3.getHyphenationFrequency()
                r2.mHyphenationFrequency = r0
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L22
                goto L23
            L22:
                r3 = 0
            L23:
                r2.mWrapped = r3
                return
        }

        public Params(@androidx.annotation.NonNull android.text.TextPaint r3, @androidx.annotation.NonNull android.text.TextDirectionHeuristic r4, int r5, int r6) {
                r2 = this;
                r2.<init>()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 < r1) goto L21
                android.text.PrecomputedText$Params$Builder r0 = new android.text.PrecomputedText$Params$Builder
                r0.<init>(r3)
                android.text.PrecomputedText$Params$Builder r0 = r0.setBreakStrategy(r5)
                android.text.PrecomputedText$Params$Builder r0 = r0.setHyphenationFrequency(r6)
                android.text.PrecomputedText$Params$Builder r0 = r0.setTextDirection(r4)
                android.text.PrecomputedText$Params r0 = r0.build()
                r2.mWrapped = r0
                goto L24
            L21:
                r0 = 0
                r2.mWrapped = r0
            L24:
                r2.mPaint = r3
                r2.mTextDir = r4
                r2.mBreakStrategy = r5
                r2.mHyphenationFrequency = r6
                return
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r4 != r3) goto L4
                return r0
            L4:
                boolean r1 = r4 instanceof androidx.core.text.PrecomputedTextCompat.Params
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                androidx.core.text.PrecomputedTextCompat$Params r4 = (androidx.core.text.PrecomputedTextCompat.Params) r4
                boolean r1 = r3.equalsWithoutTextDirection(r4)
                if (r1 != 0) goto L13
                return r2
            L13:
                android.text.TextDirectionHeuristic r1 = r3.mTextDir
                android.text.TextDirectionHeuristic r4 = r4.getTextDirection()
                if (r1 == r4) goto L1c
                return r2
            L1c:
                return r0
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public boolean equalsWithoutTextDirection(@androidx.annotation.NonNull androidx.core.text.PrecomputedTextCompat.Params r5) {
                r4 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 0
                r2 = 23
                if (r0 < r2) goto L19
                int r2 = r4.mBreakStrategy
                int r3 = r5.getBreakStrategy()
                if (r2 == r3) goto L10
                return r1
            L10:
                int r2 = r4.mHyphenationFrequency
                int r3 = r5.getHyphenationFrequency()
                if (r2 == r3) goto L19
                return r1
            L19:
                android.text.TextPaint r2 = r4.mPaint
                float r2 = r2.getTextSize()
                android.text.TextPaint r3 = r5.getTextPaint()
                float r3 = r3.getTextSize()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L2c
                return r1
            L2c:
                android.text.TextPaint r2 = r4.mPaint
                float r2 = r2.getTextScaleX()
                android.text.TextPaint r3 = r5.getTextPaint()
                float r3 = r3.getTextScaleX()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L3f
                return r1
            L3f:
                android.text.TextPaint r2 = r4.mPaint
                float r2 = r2.getTextSkewX()
                android.text.TextPaint r3 = r5.getTextPaint()
                float r3 = r3.getTextSkewX()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L52
                return r1
            L52:
                android.text.TextPaint r2 = r4.mPaint
                float r2 = r2.getLetterSpacing()
                android.text.TextPaint r3 = r5.getTextPaint()
                float r3 = r3.getLetterSpacing()
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L65
                return r1
            L65:
                android.text.TextPaint r2 = r4.mPaint
                java.lang.String r2 = r2.getFontFeatureSettings()
                android.text.TextPaint r3 = r5.getTextPaint()
                java.lang.String r3 = r3.getFontFeatureSettings()
                boolean r2 = android.text.TextUtils.equals(r2, r3)
                if (r2 != 0) goto L7a
                return r1
            L7a:
                android.text.TextPaint r2 = r4.mPaint
                int r2 = r2.getFlags()
                android.text.TextPaint r3 = r5.getTextPaint()
                int r3 = r3.getFlags()
                if (r2 == r3) goto L8b
                return r1
            L8b:
                r2 = 24
                if (r0 < r2) goto La4
                android.text.TextPaint r0 = r4.mPaint
                android.os.LocaleList r0 = r0.getTextLocales()
                android.text.TextPaint r2 = r5.getTextPaint()
                android.os.LocaleList r2 = r2.getTextLocales()
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto Lb9
                return r1
            La4:
                android.text.TextPaint r0 = r4.mPaint
                java.util.Locale r0 = r0.getTextLocale()
                android.text.TextPaint r2 = r5.getTextPaint()
                java.util.Locale r2 = r2.getTextLocale()
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto Lb9
                return r1
            Lb9:
                android.text.TextPaint r0 = r4.mPaint
                android.graphics.Typeface r0 = r0.getTypeface()
                if (r0 != 0) goto Lcc
                android.text.TextPaint r5 = r5.getTextPaint()
                android.graphics.Typeface r5 = r5.getTypeface()
                if (r5 == 0) goto Le1
                return r1
            Lcc:
                android.text.TextPaint r0 = r4.mPaint
                android.graphics.Typeface r0 = r0.getTypeface()
                android.text.TextPaint r5 = r5.getTextPaint()
                android.graphics.Typeface r5 = r5.getTypeface()
                boolean r5 = r0.equals(r5)
                if (r5 != 0) goto Le1
                return r1
            Le1:
                r5 = 1
                return r5
        }

        @androidx.annotation.RequiresApi(23)
        public int getBreakStrategy() {
                r1 = this;
                int r0 = r1.mBreakStrategy
                return r0
        }

        @androidx.annotation.RequiresApi(23)
        public int getHyphenationFrequency() {
                r1 = this;
                int r0 = r1.mHyphenationFrequency
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.RequiresApi(18)
        public android.text.TextDirectionHeuristic getTextDirection() {
                r1 = this;
                android.text.TextDirectionHeuristic r0 = r1.mTextDir
                return r0
        }

        @androidx.annotation.NonNull
        public android.text.TextPaint getTextPaint() {
                r1 = this;
                android.text.TextPaint r0 = r1.mPaint
                return r0
        }

        public int hashCode() {
                r14 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 10
                r2 = 9
                r3 = 8
                r4 = 7
                r5 = 6
                r6 = 5
                r7 = 4
                r8 = 3
                r9 = 2
                r10 = 1
                r11 = 0
                r12 = 11
                r13 = 24
                if (r0 < r13) goto L89
                java.lang.Object[] r0 = new java.lang.Object[r12]
                android.text.TextPaint r12 = r14.mPaint
                float r12 = r12.getTextSize()
                java.lang.Float r12 = java.lang.Float.valueOf(r12)
                r0[r11] = r12
                android.text.TextPaint r11 = r14.mPaint
                float r11 = r11.getTextScaleX()
                java.lang.Float r11 = java.lang.Float.valueOf(r11)
                r0[r10] = r11
                android.text.TextPaint r10 = r14.mPaint
                float r10 = r10.getTextSkewX()
                java.lang.Float r10 = java.lang.Float.valueOf(r10)
                r0[r9] = r10
                android.text.TextPaint r9 = r14.mPaint
                float r9 = r9.getLetterSpacing()
                java.lang.Float r9 = java.lang.Float.valueOf(r9)
                r0[r8] = r9
                android.text.TextPaint r8 = r14.mPaint
                int r8 = r8.getFlags()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r0[r7] = r8
                android.text.TextPaint r7 = r14.mPaint
                android.os.LocaleList r7 = r7.getTextLocales()
                r0[r6] = r7
                android.text.TextPaint r6 = r14.mPaint
                android.graphics.Typeface r6 = r6.getTypeface()
                r0[r5] = r6
                android.text.TextPaint r5 = r14.mPaint
                boolean r5 = r5.isElegantTextHeight()
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                r0[r4] = r5
                android.text.TextDirectionHeuristic r4 = r14.mTextDir
                r0[r3] = r4
                int r3 = r14.mBreakStrategy
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0[r2] = r3
                int r2 = r14.mHyphenationFrequency
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                int r0 = androidx.core.util.ObjectsCompat.hash(r0)
                return r0
            L89:
                java.lang.Object[] r0 = new java.lang.Object[r12]
                android.text.TextPaint r12 = r14.mPaint
                float r12 = r12.getTextSize()
                java.lang.Float r12 = java.lang.Float.valueOf(r12)
                r0[r11] = r12
                android.text.TextPaint r11 = r14.mPaint
                float r11 = r11.getTextScaleX()
                java.lang.Float r11 = java.lang.Float.valueOf(r11)
                r0[r10] = r11
                android.text.TextPaint r10 = r14.mPaint
                float r10 = r10.getTextSkewX()
                java.lang.Float r10 = java.lang.Float.valueOf(r10)
                r0[r9] = r10
                android.text.TextPaint r9 = r14.mPaint
                float r9 = r9.getLetterSpacing()
                java.lang.Float r9 = java.lang.Float.valueOf(r9)
                r0[r8] = r9
                android.text.TextPaint r8 = r14.mPaint
                int r8 = r8.getFlags()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                r0[r7] = r8
                android.text.TextPaint r7 = r14.mPaint
                java.util.Locale r7 = r7.getTextLocale()
                r0[r6] = r7
                android.text.TextPaint r6 = r14.mPaint
                android.graphics.Typeface r6 = r6.getTypeface()
                r0[r5] = r6
                android.text.TextPaint r5 = r14.mPaint
                boolean r5 = r5.isElegantTextHeight()
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                r0[r4] = r5
                android.text.TextDirectionHeuristic r4 = r14.mTextDir
                r0[r3] = r4
                int r3 = r14.mBreakStrategy
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r0[r2] = r3
                int r2 = r14.mHyphenationFrequency
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0[r1] = r2
                int r0 = androidx.core.util.ObjectsCompat.hash(r0)
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "{"
                r0.<init>(r1)
                java.lang.String r1 = "textSize="
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                android.text.TextPaint r2 = r4.mPaint
                float r2 = r2.getTextSize()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textScaleX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.mPaint
                float r2 = r2.getTextScaleX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textSkewX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.mPaint
                float r2 = r2.getTextSkewX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                java.lang.String r2 = ", letterSpacing="
                java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
                android.text.TextPaint r3 = r4.mPaint
                float r3 = r3.getLetterSpacing()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = ", elegantTextHeight="
                r2.append(r3)
                android.text.TextPaint r3 = r4.mPaint
                boolean r3 = r3.isElegantTextHeight()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                r2 = 24
                java.lang.String r3 = ", textLocale="
                if (r1 < r2) goto La0
                java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
                android.text.TextPaint r3 = r4.mPaint
                android.os.LocaleList r3 = r3.getTextLocales()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                goto Lb4
            La0:
                java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
                android.text.TextPaint r3 = r4.mPaint
                java.util.Locale r3 = r3.getTextLocale()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
            Lb4:
                java.lang.String r2 = ", typeface="
                java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
                android.text.TextPaint r3 = r4.mPaint
                android.graphics.Typeface r3 = r3.getTypeface()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                r2 = 26
                if (r1 < r2) goto Le4
                java.lang.String r1 = ", variationSettings="
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                android.text.TextPaint r2 = r4.mPaint
                java.lang.String r2 = r2.getFontVariationSettings()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            Le4:
                java.lang.String r1 = ", textDir="
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                android.text.TextDirectionHeuristic r2 = r4.mTextDir
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", breakStrategy="
                r1.append(r2)
                int r2 = r4.mBreakStrategy
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", hyphenationFrequency="
                r1.append(r2)
                int r2 = r4.mHyphenationFrequency
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class PrecomputedTextFutureTask extends java.util.concurrent.FutureTask<androidx.core.text.PrecomputedTextCompat> {

        /* JADX INFO: loaded from: classes.dex */
        public static class PrecomputedTextCallback implements java.util.concurrent.Callable<androidx.core.text.PrecomputedTextCompat> {
            private androidx.core.text.PrecomputedTextCompat.Params mParams;
            private java.lang.CharSequence mText;

            public PrecomputedTextCallback(@androidx.annotation.NonNull androidx.core.text.PrecomputedTextCompat.Params r1, @androidx.annotation.NonNull java.lang.CharSequence r2) {
                    r0 = this;
                    r0.<init>()
                    r0.mParams = r1
                    r0.mText = r2
                    return
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public androidx.core.text.PrecomputedTextCompat call() throws java.lang.Exception {
                    r2 = this;
                    java.lang.CharSequence r0 = r2.mText
                    androidx.core.text.PrecomputedTextCompat$Params r1 = r2.mParams
                    androidx.core.text.PrecomputedTextCompat r0 = androidx.core.text.PrecomputedTextCompat.create(r0, r1)
                    return r0
            }

            @Override // java.util.concurrent.Callable
            public /* bridge */ /* synthetic */ androidx.core.text.PrecomputedTextCompat call() throws java.lang.Exception {
                    r1 = this;
                    androidx.core.text.PrecomputedTextCompat r0 = r1.call()
                    return r0
            }
        }

        public PrecomputedTextFutureTask(@androidx.annotation.NonNull androidx.core.text.PrecomputedTextCompat.Params r2, @androidx.annotation.NonNull java.lang.CharSequence r3) {
                r1 = this;
                androidx.core.text.PrecomputedTextCompat$PrecomputedTextFutureTask$PrecomputedTextCallback r0 = new androidx.core.text.PrecomputedTextCompat$PrecomputedTextFutureTask$PrecomputedTextCallback
                r0.<init>(r2, r3)
                r1.<init>(r0)
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.text.PrecomputedTextCompat.sLock = r0
            return
    }

    @androidx.annotation.RequiresApi(28)
    private PrecomputedTextCompat(@androidx.annotation.NonNull android.text.PrecomputedText r3, @androidx.annotation.NonNull androidx.core.text.PrecomputedTextCompat.Params r4) {
            r2 = this;
            r2.<init>()
            r2.mText = r3
            r2.mParams = r4
            r4 = 0
            r2.mParagraphEnds = r4
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L11
            goto L12
        L11:
            r3 = r4
        L12:
            r2.mWrapped = r3
            return
    }

    private PrecomputedTextCompat(@androidx.annotation.NonNull java.lang.CharSequence r2, @androidx.annotation.NonNull androidx.core.text.PrecomputedTextCompat.Params r3, @androidx.annotation.NonNull int[] r4) {
            r1 = this;
            r1.<init>()
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r2)
            r1.mText = r0
            r1.mParams = r3
            r1.mParagraphEnds = r4
            r2 = 0
            r1.mWrapped = r2
            return
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    public static androidx.core.text.PrecomputedTextCompat create(@androidx.annotation.NonNull java.lang.CharSequence r10, @androidx.annotation.NonNull androidx.core.text.PrecomputedTextCompat.Params r11) {
            androidx.core.util.Preconditions.checkNotNull(r10)
            androidx.core.util.Preconditions.checkNotNull(r11)
            java.lang.String r0 = "PrecomputedText"
            androidx.core.os.TraceCompat.beginSection(r0)     // Catch: java.lang.Throwable -> Lac
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lac
            r1 = 29
            if (r0 < r1) goto L22
            android.text.PrecomputedText$Params r0 = r11.mWrapped     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto L22
            androidx.core.text.PrecomputedTextCompat r1 = new androidx.core.text.PrecomputedTextCompat     // Catch: java.lang.Throwable -> Lac
            android.text.PrecomputedText r10 = android.text.PrecomputedText.create(r10, r0)     // Catch: java.lang.Throwable -> Lac
            r1.<init>(r10, r11)     // Catch: java.lang.Throwable -> Lac
            androidx.core.os.TraceCompat.endSection()
            return r1
        L22:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lac
            r0.<init>()     // Catch: java.lang.Throwable -> Lac
            int r1 = r10.length()     // Catch: java.lang.Throwable -> Lac
            r2 = 0
            r3 = 0
        L2d:
            if (r3 >= r1) goto L43
            r4 = 10
            int r3 = android.text.TextUtils.indexOf(r10, r4, r3, r1)     // Catch: java.lang.Throwable -> Lac
            if (r3 >= 0) goto L39
            r3 = r1
            goto L3b
        L39:
            int r3 = r3 + 1
        L3b:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lac
            r0.add(r4)     // Catch: java.lang.Throwable -> Lac
            goto L2d
        L43:
            int r1 = r0.size()     // Catch: java.lang.Throwable -> Lac
            int[] r1 = new int[r1]     // Catch: java.lang.Throwable -> Lac
            r3 = 0
        L4a:
            int r4 = r0.size()     // Catch: java.lang.Throwable -> Lac
            if (r3 >= r4) goto L5f
            java.lang.Object r4 = r0.get(r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> Lac
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> Lac
            r1[r3] = r4     // Catch: java.lang.Throwable -> Lac
            int r3 = r3 + 1
            goto L4a
        L5f:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lac
            r3 = 23
            if (r0 < r3) goto L90
            int r0 = r10.length()     // Catch: java.lang.Throwable -> Lac
            android.text.TextPaint r3 = r11.getTextPaint()     // Catch: java.lang.Throwable -> Lac
            r4 = 2147483647(0x7fffffff, float:NaN)
            android.text.StaticLayout$Builder r0 = android.text.StaticLayout.Builder.obtain(r10, r2, r0, r3, r4)     // Catch: java.lang.Throwable -> Lac
            int r2 = r11.getBreakStrategy()     // Catch: java.lang.Throwable -> Lac
            android.text.StaticLayout$Builder r0 = r0.setBreakStrategy(r2)     // Catch: java.lang.Throwable -> Lac
            int r2 = r11.getHyphenationFrequency()     // Catch: java.lang.Throwable -> Lac
            android.text.StaticLayout$Builder r0 = r0.setHyphenationFrequency(r2)     // Catch: java.lang.Throwable -> Lac
            android.text.TextDirectionHeuristic r2 = r11.getTextDirection()     // Catch: java.lang.Throwable -> Lac
            android.text.StaticLayout$Builder r0 = r0.setTextDirection(r2)     // Catch: java.lang.Throwable -> Lac
            r0.build()     // Catch: java.lang.Throwable -> Lac
            goto La3
        L90:
            android.text.StaticLayout r2 = new android.text.StaticLayout     // Catch: java.lang.Throwable -> Lac
            android.text.TextPaint r4 = r11.getTextPaint()     // Catch: java.lang.Throwable -> Lac
            r5 = 2147483647(0x7fffffff, float:NaN)
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch: java.lang.Throwable -> Lac
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r9 = 0
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lac
        La3:
            androidx.core.text.PrecomputedTextCompat r0 = new androidx.core.text.PrecomputedTextCompat     // Catch: java.lang.Throwable -> Lac
            r0.<init>(r10, r11, r1)     // Catch: java.lang.Throwable -> Lac
            androidx.core.os.TraceCompat.endSection()
            return r0
        Lac:
            r10 = move-exception
            androidx.core.os.TraceCompat.endSection()
            throw r10
    }

    @androidx.annotation.UiThread
    public static java.util.concurrent.Future<androidx.core.text.PrecomputedTextCompat> getTextFuture(@androidx.annotation.NonNull java.lang.CharSequence r1, @androidx.annotation.NonNull androidx.core.text.PrecomputedTextCompat.Params r2, @androidx.annotation.Nullable java.util.concurrent.Executor r3) {
            androidx.core.text.PrecomputedTextCompat$PrecomputedTextFutureTask r0 = new androidx.core.text.PrecomputedTextCompat$PrecomputedTextFutureTask
            r0.<init>(r2, r1)
            if (r3 != 0) goto L1c
            java.lang.Object r1 = androidx.core.text.PrecomputedTextCompat.sLock
            monitor-enter(r1)
            java.util.concurrent.Executor r2 = androidx.core.text.PrecomputedTextCompat.sExecutor     // Catch: java.lang.Throwable -> L19
            if (r2 != 0) goto L15
            r2 = 1
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newFixedThreadPool(r2)     // Catch: java.lang.Throwable -> L19
            androidx.core.text.PrecomputedTextCompat.sExecutor = r2     // Catch: java.lang.Throwable -> L19
        L15:
            java.util.concurrent.Executor r3 = androidx.core.text.PrecomputedTextCompat.sExecutor     // Catch: java.lang.Throwable -> L19
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            goto L1c
        L19:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L19
            throw r2
        L1c:
            r3.execute(r0)
            return r0
    }

    @Override // java.lang.CharSequence
    public char charAt(int r2) {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            char r2 = r0.charAt(r2)
            return r2
    }

    @androidx.annotation.IntRange(from = 0)
    public int getParagraphCount() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Ld
            android.text.PrecomputedText r0 = r2.mWrapped
            int r0 = r0.getParagraphCount()
            return r0
        Ld:
            int[] r0 = r2.mParagraphEnds
            int r0 = r0.length
            return r0
    }

    @androidx.annotation.IntRange(from = 0)
    public int getParagraphEnd(@androidx.annotation.IntRange(from = 0) int r4) {
            r3 = this;
            int r0 = r3.getParagraphCount()
            r1 = 0
            java.lang.String r2 = "paraIndex"
            androidx.core.util.Preconditions.checkArgumentInRange(r4, r1, r0, r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L17
            android.text.PrecomputedText r0 = r3.mWrapped
            int r4 = r0.getParagraphEnd(r4)
            return r4
        L17:
            int[] r0 = r3.mParagraphEnds
            r4 = r0[r4]
            return r4
    }

    @androidx.annotation.IntRange(from = 0)
    public int getParagraphStart(@androidx.annotation.IntRange(from = 0) int r4) {
            r3 = this;
            int r0 = r3.getParagraphCount()
            r1 = 0
            java.lang.String r2 = "paraIndex"
            androidx.core.util.Preconditions.checkArgumentInRange(r4, r1, r0, r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r0 < r2) goto L17
            android.text.PrecomputedText r0 = r3.mWrapped
            int r4 = r0.getParagraphStart(r4)
            return r4
        L17:
            if (r4 != 0) goto L1a
            goto L20
        L1a:
            int[] r0 = r3.mParagraphEnds
            int r4 = r4 + (-1)
            r1 = r0[r4]
        L20:
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.core.text.PrecomputedTextCompat.Params getParams() {
            r1 = this;
            androidx.core.text.PrecomputedTextCompat$Params r0 = r1.mParams
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(28)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.text.PrecomputedText getPrecomputedText() {
            r2 = this;
            android.text.Spannable r0 = r2.mText
            boolean r1 = r0 instanceof android.text.PrecomputedText
            if (r1 == 0) goto L9
            android.text.PrecomputedText r0 = (android.text.PrecomputedText) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // android.text.Spanned
    public int getSpanEnd(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            int r2 = r0.getSpanEnd(r2)
            return r2
    }

    @Override // android.text.Spanned
    public int getSpanFlags(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            int r2 = r0.getSpanFlags(r2)
            return r2
    }

    @Override // android.text.Spanned
    public int getSpanStart(java.lang.Object r2) {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            int r2 = r0.getSpanStart(r2)
            return r2
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int r3, int r4, java.lang.Class<T> r5) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Ld
            android.text.PrecomputedText r0 = r2.mWrapped
            java.lang.Object[] r3 = r0.getSpans(r3, r4, r5)
            return r3
        Ld:
            android.text.Spannable r0 = r2.mText
            java.lang.Object[] r3 = r0.getSpans(r3, r4, r5)
            return r3
    }

    @Override // java.lang.CharSequence
    public int length() {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            int r0 = r0.length()
            return r0
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int r2, int r3, java.lang.Class r4) {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            int r2 = r0.nextSpanTransition(r2, r3, r4)
            return r2
    }

    @Override // android.text.Spannable
    public void removeSpan(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof android.text.style.MetricAffectingSpan
            if (r0 != 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L10
            android.text.PrecomputedText r0 = r2.mWrapped
            r0.removeSpan(r3)
            goto L15
        L10:
            android.text.Spannable r0 = r2.mText
            r0.removeSpan(r3)
        L15:
            return
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "MetricAffectingSpan can not be removed from PrecomputedText."
            r3.<init>(r0)
            throw r3
    }

    @Override // android.text.Spannable
    public void setSpan(java.lang.Object r3, int r4, int r5, int r6) {
            r2 = this;
            boolean r0 = r3 instanceof android.text.style.MetricAffectingSpan
            if (r0 != 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L10
            android.text.PrecomputedText r0 = r2.mWrapped
            r0.setSpan(r3, r4, r5, r6)
            goto L15
        L10:
            android.text.Spannable r0 = r2.mText
            r0.setSpan(r3, r4, r5, r6)
        L15:
            return
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "MetricAffectingSpan can not be set to PrecomputedText."
            r3.<init>(r4)
            throw r3
    }

    @Override // java.lang.CharSequence
    public java.lang.CharSequence subSequence(int r2, int r3) {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            java.lang.CharSequence r2 = r0.subSequence(r2, r3)
            return r2
    }

    @Override // java.lang.CharSequence
    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r1 = this;
            android.text.Spannable r0 = r1.mText
            java.lang.String r0 = r0.toString()
            return r0
    }
}
