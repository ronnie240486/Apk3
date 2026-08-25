package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
class AppCompatTextViewAutoSizeHelper {
    private static final int DEFAULT_AUTO_SIZE_GRANULARITY_IN_PX = 1;
    private static final int DEFAULT_AUTO_SIZE_MAX_TEXT_SIZE_IN_SP = 112;
    private static final int DEFAULT_AUTO_SIZE_MIN_TEXT_SIZE_IN_SP = 12;
    private static final java.lang.String TAG = "ACTVAutoSizeHelper";
    private static final android.graphics.RectF TEMP_RECTF = null;
    private static final int VERY_WIDE = 1048576;

    @android.annotation.SuppressLint({"BanConcurrentHashMap"})
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Field> sTextViewFieldByNameCache;

    @android.annotation.SuppressLint({"BanConcurrentHashMap"})
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> sTextViewMethodByNameCache;
    private float mAutoSizeMaxTextSizeInPx;
    private float mAutoSizeMinTextSizeInPx;
    private float mAutoSizeStepGranularityInPx;
    private int[] mAutoSizeTextSizesInPx;
    private int mAutoSizeTextType;
    private final android.content.Context mContext;
    private boolean mHasPresetAutoSizeValues;
    private final androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl mImpl;
    private boolean mNeedsAutoSizeText;
    private android.text.TextPaint mTempTextPaint;

    @androidx.annotation.NonNull
    private final android.widget.TextView mTextView;

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(16)
    public static final class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        @androidx.annotation.DoNotInline
        public static android.text.StaticLayout createStaticLayoutForMeasuring(@androidx.annotation.NonNull java.lang.CharSequence r8, @androidx.annotation.NonNull android.text.Layout.Alignment r9, int r10, @androidx.annotation.NonNull android.widget.TextView r11, @androidx.annotation.NonNull android.text.TextPaint r12) {
                float r5 = r11.getLineSpacingMultiplier()
                float r6 = r11.getLineSpacingExtra()
                boolean r7 = r11.getIncludeFontPadding()
                android.text.StaticLayout r11 = new android.text.StaticLayout
                r0 = r11
                r1 = r8
                r2 = r12
                r3 = r10
                r4 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r11
        }

        @androidx.annotation.DoNotInline
        public static int getMaxLines(@androidx.annotation.NonNull android.widget.TextView r0) {
                int r0 = r0.getMaxLines()
                return r0
        }
    }

    @androidx.annotation.RequiresApi(18)
    public static final class Api18Impl {
        private Api18Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean isInLayout(@androidx.annotation.NonNull android.view.View r0) {
                boolean r0 = r0.isInLayout()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(23)
    public static final class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        @androidx.annotation.DoNotInline
        public static android.text.StaticLayout createStaticLayoutForMeasuring(@androidx.annotation.NonNull java.lang.CharSequence r2, @androidx.annotation.NonNull android.text.Layout.Alignment r3, int r4, int r5, @androidx.annotation.NonNull android.widget.TextView r6, @androidx.annotation.NonNull android.text.TextPaint r7, @androidx.annotation.NonNull androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl r8) {
                int r0 = r2.length()
                r1 = 0
                android.text.StaticLayout$Builder r2 = android.text.StaticLayout.Builder.obtain(r2, r1, r0, r7, r4)
                android.text.StaticLayout$Builder r3 = r2.setAlignment(r3)
                float r4 = r6.getLineSpacingExtra()
                float r7 = r6.getLineSpacingMultiplier()
                android.text.StaticLayout$Builder r3 = r3.setLineSpacing(r4, r7)
                boolean r4 = r6.getIncludeFontPadding()
                android.text.StaticLayout$Builder r3 = r3.setIncludePad(r4)
                int r4 = r6.getBreakStrategy()
                android.text.StaticLayout$Builder r3 = r3.setBreakStrategy(r4)
                int r4 = r6.getHyphenationFrequency()
                android.text.StaticLayout$Builder r3 = r3.setHyphenationFrequency(r4)
                r4 = -1
                if (r5 != r4) goto L37
                r5 = 2147483647(0x7fffffff, float:NaN)
            L37:
                r3.setMaxLines(r5)
                r8.computeAndSetTextDirection(r2, r6)     // Catch: java.lang.ClassCastException -> L3e
                goto L45
            L3e:
                java.lang.String r3 = "ACTVAutoSizeHelper"
                java.lang.String r4 = "Failed to obtain TextDirectionHeuristic, auto size may be incorrect"
                android.util.Log.w(r3, r4)
            L45:
                android.text.StaticLayout r2 = r2.build()
                return r2
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class Impl {
        public Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public void computeAndSetTextDirection(android.text.StaticLayout.Builder r1, android.widget.TextView r2) {
                r0 = this;
                return
        }

        public boolean isHorizontallyScrollable(android.widget.TextView r3) {
                r2 = this;
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                java.lang.String r1 = "getHorizontallyScrolling"
                java.lang.Object r3 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.invokeAndReturnWithDefault(r3, r1, r0)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                boolean r3 = r3.booleanValue()
                return r3
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(23)
    public static class Impl23 extends androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl {
        public Impl23() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        public void computeAndSetTextDirection(android.text.StaticLayout.Builder r3, android.widget.TextView r4) {
                r2 = this;
                android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
                java.lang.String r1 = "getTextDirectionHeuristic"
                java.lang.Object r4 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.invokeAndReturnWithDefault(r4, r1, r0)
                android.text.TextDirectionHeuristic r4 = (android.text.TextDirectionHeuristic) r4
                r3.setTextDirection(r4)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(29)
    public static class Impl29 extends androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl23 {
        public Impl29() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl23, androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        public void computeAndSetTextDirection(android.text.StaticLayout.Builder r1, android.widget.TextView r2) {
                r0 = this;
                android.text.TextDirectionHeuristic r2 = r2.getTextDirectionHeuristic()
                r1.setTextDirection(r2)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Impl
        public boolean isHorizontallyScrollable(android.widget.TextView r1) {
                r0 = this;
                boolean r1 = r1.isHorizontallyScrollable()
                return r1
        }
    }

    static {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.TEMP_RECTF = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.sTextViewMethodByNameCache = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.sTextViewFieldByNameCache = r0
            return
    }

    public AppCompatTextViewAutoSizeHelper(@androidx.annotation.NonNull android.widget.TextView r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mAutoSizeTextType = r0
            r2.mNeedsAutoSizeText = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.mAutoSizeStepGranularityInPx = r1
            r2.mAutoSizeMinTextSizeInPx = r1
            r2.mAutoSizeMaxTextSizeInPx = r1
            int[] r1 = new int[r0]
            r2.mAutoSizeTextSizesInPx = r1
            r2.mHasPresetAutoSizeValues = r0
            r2.mTextView = r3
            android.content.Context r3 = r3.getContext()
            r2.mContext = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r3 < r0) goto L2c
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl29 r3 = new androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl29
            r3.<init>()
            r2.mImpl = r3
            goto L3f
        L2c:
            r0 = 23
            if (r3 < r0) goto L38
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl23 r3 = new androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl23
            r3.<init>()
            r2.mImpl = r3
            goto L3f
        L38:
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl r3 = new androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl
            r3.<init>()
            r2.mImpl = r3
        L3f:
            return
    }

    private static <T> T accessAndReturnWithDefault(@androidx.annotation.NonNull java.lang.Object r2, @androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull T r4) {
            java.lang.reflect.Field r0 = getTextViewField(r3)     // Catch: java.lang.IllegalAccessException -> Lc
            if (r0 != 0) goto L7
            return r4
        L7:
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.IllegalAccessException -> Lc
            return r2
        Lc:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to access TextView#"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " member"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "ACTVAutoSizeHelper"
            android.util.Log.w(r0, r3, r2)
            return r4
    }

    private int[] cleanupAutoSizePresetSizes(int[] r7) {
            r6 = this;
            int r0 = r7.length
            if (r0 != 0) goto L4
            return r7
        L4:
            java.util.Arrays.sort(r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 0
        Le:
            if (r3 >= r0) goto L28
            r4 = r7[r3]
            if (r4 <= 0) goto L25
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            int r5 = java.util.Collections.binarySearch(r1, r5)
            if (r5 >= 0) goto L25
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.add(r4)
        L25:
            int r3 = r3 + 1
            goto Le
        L28:
            int r3 = r1.size()
            if (r0 != r3) goto L2f
            return r7
        L2f:
            int r7 = r1.size()
            int[] r0 = new int[r7]
        L35:
            if (r2 >= r7) goto L46
            java.lang.Object r3 = r1.get(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0[r2] = r3
            int r2 = r2 + 1
            goto L35
        L46:
            return r0
    }

    private void clearAutoSizeConfiguration() {
            r2 = this;
            r0 = 0
            r2.mAutoSizeTextType = r0
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.mAutoSizeMinTextSizeInPx = r1
            r2.mAutoSizeMaxTextSizeInPx = r1
            r2.mAutoSizeStepGranularityInPx = r1
            int[] r1 = new int[r0]
            r2.mAutoSizeTextSizesInPx = r1
            r2.mNeedsAutoSizeText = r0
            return
    }

    private android.text.StaticLayout createStaticLayoutForMeasuringPre16(java.lang.CharSequence r10, android.text.Layout.Alignment r11, int r12) {
            r9 = this;
            android.widget.TextView r0 = r9.mTextView
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "mSpacingMult"
            java.lang.Object r0 = accessAndReturnWithDefault(r0, r2, r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r6 = r0.floatValue()
            android.widget.TextView r0 = r9.mTextView
            r1 = 0
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.String r2 = "mSpacingAdd"
            java.lang.Object r0 = accessAndReturnWithDefault(r0, r2, r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r7 = r0.floatValue()
            android.widget.TextView r0 = r9.mTextView
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r2 = "mIncludePad"
            java.lang.Object r0 = accessAndReturnWithDefault(r0, r2, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            android.text.StaticLayout r0 = new android.text.StaticLayout
            android.text.TextPaint r3 = r9.mTempTextPaint
            r1 = r0
            r2 = r10
            r4 = r12
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    private int findLargestTextSizeWhichFits(android.graphics.RectF r6) {
            r5 = this;
            int[] r0 = r5.mAutoSizeTextSizesInPx
            int r0 = r0.length
            if (r0 == 0) goto L29
            r1 = 0
            r2 = 1
            int r0 = r0 - r2
            r1 = 1
            r2 = 0
        La:
            if (r1 > r0) goto L24
            int r2 = r1 + r0
            int r2 = r2 / 2
            int[] r3 = r5.mAutoSizeTextSizesInPx
            r3 = r3[r2]
            boolean r3 = r5.suggestedSizeFitsInSpace(r3, r6)
            if (r3 == 0) goto L20
            int r2 = r2 + 1
            r4 = r2
            r2 = r1
            r1 = r4
            goto La
        L20:
            int r2 = r2 + (-1)
            r0 = r2
            goto La
        L24:
            int[] r6 = r5.mAutoSizeTextSizesInPx
            r6 = r6[r2]
            return r6
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "No available text sizes to choose from."
            r6.<init>(r0)
            throw r6
    }

    @androidx.annotation.Nullable
    private static java.lang.reflect.Field getTextViewField(@androidx.annotation.NonNull java.lang.String r3) {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Field> r0 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.sTextViewFieldByNameCache     // Catch: java.lang.NoSuchFieldException -> L1c
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.NoSuchFieldException -> L1c
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.NoSuchFieldException -> L1c
            if (r0 != 0) goto L1b
            java.lang.Class<android.widget.TextView> r0 = android.widget.TextView.class
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L1c
            if (r0 == 0) goto L1b
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L1c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Field> r1 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.sTextViewFieldByNameCache     // Catch: java.lang.NoSuchFieldException -> L1c
            r1.put(r3, r0)     // Catch: java.lang.NoSuchFieldException -> L1c
        L1b:
            return r0
        L1c:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to access TextView#"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " member"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "ACTVAutoSizeHelper"
            android.util.Log.w(r1, r3, r0)
            r3 = 0
            return r3
    }

    @androidx.annotation.Nullable
    private static java.lang.reflect.Method getTextViewMethod(@androidx.annotation.NonNull java.lang.String r3) {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> r0 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.sTextViewMethodByNameCache     // Catch: java.lang.Exception -> L1f
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Exception -> L1f
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Exception -> L1f
            if (r0 != 0) goto L1e
            java.lang.Class<android.widget.TextView> r0 = android.widget.TextView.class
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L1f
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r1)     // Catch: java.lang.Exception -> L1f
            if (r0 == 0) goto L1e
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L1f
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.reflect.Method> r1 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.sTextViewMethodByNameCache     // Catch: java.lang.Exception -> L1f
            r1.put(r3, r0)     // Catch: java.lang.Exception -> L1f
        L1e:
            return r0
        L1f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to retrieve TextView#"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "() method"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "ACTVAutoSizeHelper"
            android.util.Log.w(r1, r3, r0)
            r3 = 0
            return r3
    }

    public static <T> T invokeAndReturnWithDefault(@androidx.annotation.NonNull java.lang.Object r3, @androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull T r5) {
            java.lang.reflect.Method r0 = getTextViewMethod(r4)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            java.lang.Object r5 = r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> Lc java.lang.Exception -> Le
            goto L2a
        Lc:
            r3 = move-exception
            goto L2b
        Le:
            r3 = move-exception
            java.lang.String r0 = "ACTVAutoSizeHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc
            r1.<init>()     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = "Failed to invoke TextView#"
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc
            r1.append(r4)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r4 = "() method"
            r1.append(r4)     // Catch: java.lang.Throwable -> Lc
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> Lc
            android.util.Log.w(r0, r4, r3)     // Catch: java.lang.Throwable -> Lc
        L2a:
            return r5
        L2b:
            throw r3
    }

    private void setRawTextSize(float r4) {
            r3 = this;
            android.widget.TextView r0 = r3.mTextView
            android.text.TextPaint r0 = r0.getPaint()
            float r0 = r0.getTextSize()
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L52
            android.widget.TextView r0 = r3.mTextView
            android.text.TextPaint r0 = r0.getPaint()
            r0.setTextSize(r4)
            android.widget.TextView r4 = r3.mTextView
            boolean r4 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Api18Impl.isInLayout(r4)
            android.widget.TextView r0 = r3.mTextView
            android.text.Layout r0 = r0.getLayout()
            if (r0 == 0) goto L52
            r0 = 0
            r3.mNeedsAutoSizeText = r0
            java.lang.String r1 = "nullLayouts"
            java.lang.reflect.Method r1 = getTextViewMethod(r1)     // Catch: java.lang.Exception -> L38
            if (r1 == 0) goto L40
            android.widget.TextView r2 = r3.mTextView     // Catch: java.lang.Exception -> L38
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L38
            r1.invoke(r2, r0)     // Catch: java.lang.Exception -> L38
            goto L40
        L38:
            r0 = move-exception
            java.lang.String r1 = "ACTVAutoSizeHelper"
            java.lang.String r2 = "Failed to invoke TextView#nullLayouts() method"
            android.util.Log.w(r1, r2, r0)
        L40:
            if (r4 != 0) goto L48
            android.widget.TextView r4 = r3.mTextView
            r4.requestLayout()
            goto L4d
        L48:
            android.widget.TextView r4 = r3.mTextView
            r4.forceLayout()
        L4d:
            android.widget.TextView r4 = r3.mTextView
            r4.invalidate()
        L52:
            return
    }

    private boolean setupAutoSizeText() {
            r7 = this;
            boolean r0 = r7.supportsAutoSizeText()
            r1 = 0
            if (r0 == 0) goto L42
            int r0 = r7.mAutoSizeTextType
            r2 = 1
            if (r0 != r2) goto L42
            boolean r0 = r7.mHasPresetAutoSizeValues
            if (r0 == 0) goto L15
            int[] r0 = r7.mAutoSizeTextSizesInPx
            int r0 = r0.length
            if (r0 != 0) goto L3f
        L15:
            float r0 = r7.mAutoSizeMaxTextSizeInPx
            float r3 = r7.mAutoSizeMinTextSizeInPx
            float r0 = r0 - r3
            float r3 = r7.mAutoSizeStepGranularityInPx
            float r0 = r0 / r3
            double r3 = (double) r0
            double r3 = java.lang.Math.floor(r3)
            int r0 = (int) r3
            int r0 = r0 + r2
            int[] r3 = new int[r0]
        L26:
            if (r1 >= r0) goto L39
            float r4 = r7.mAutoSizeMinTextSizeInPx
            float r5 = (float) r1
            float r6 = r7.mAutoSizeStepGranularityInPx
            float r5 = r5 * r6
            float r5 = r5 + r4
            int r4 = java.lang.Math.round(r5)
            r3[r1] = r4
            int r1 = r1 + 1
            goto L26
        L39:
            int[] r0 = r7.cleanupAutoSizePresetSizes(r3)
            r7.mAutoSizeTextSizesInPx = r0
        L3f:
            r7.mNeedsAutoSizeText = r2
            goto L44
        L42:
            r7.mNeedsAutoSizeText = r1
        L44:
            boolean r0 = r7.mNeedsAutoSizeText
            return r0
    }

    private void setupAutoSizeUniformPresetSizes(android.content.res.TypedArray r5) {
            r4 = this;
            int r0 = r5.length()
            int[] r1 = new int[r0]
            if (r0 <= 0) goto L1e
            r2 = 0
        L9:
            if (r2 >= r0) goto L15
            r3 = -1
            int r3 = r5.getDimensionPixelSize(r2, r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L9
        L15:
            int[] r5 = r4.cleanupAutoSizePresetSizes(r1)
            r4.mAutoSizeTextSizesInPx = r5
            r4.setupAutoSizeUniformPresetSizesConfiguration()
        L1e:
            return
    }

    private boolean setupAutoSizeUniformPresetSizesConfiguration() {
            r5 = this;
            int[] r0 = r5.mAutoSizeTextSizesInPx
            int r1 = r0.length
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L9
            r4 = 1
            goto La
        L9:
            r4 = 0
        La:
            r5.mHasPresetAutoSizeValues = r4
            if (r4 == 0) goto L1f
            r5.mAutoSizeTextType = r3
            r2 = r0[r2]
            float r2 = (float) r2
            r5.mAutoSizeMinTextSizeInPx = r2
            int r1 = r1 - r3
            r0 = r0[r1]
            float r0 = (float) r0
            r5.mAutoSizeMaxTextSizeInPx = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5.mAutoSizeStepGranularityInPx = r0
        L1f:
            return r4
    }

    private boolean suggestedSizeFitsInSpace(int r11, android.graphics.RectF r12) {
            r10 = this;
            android.widget.TextView r0 = r10.mTextView
            java.lang.CharSequence r0 = r0.getText()
            android.widget.TextView r1 = r10.mTextView
            android.text.method.TransformationMethod r1 = r1.getTransformationMethod()
            if (r1 == 0) goto L17
            android.widget.TextView r2 = r10.mTextView
            java.lang.CharSequence r1 = r1.getTransformation(r0, r2)
            if (r1 == 0) goto L17
            r0 = r1
        L17:
            int r1 = android.os.Build.VERSION.SDK_INT
            android.widget.TextView r2 = r10.mTextView
            int r9 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Api16Impl.getMaxLines(r2)
            android.text.TextPaint r2 = r10.mTempTextPaint
            if (r2 != 0) goto L2b
            android.text.TextPaint r2 = new android.text.TextPaint
            r2.<init>()
            r10.mTempTextPaint = r2
            goto L2e
        L2b:
            r2.reset()
        L2e:
            android.text.TextPaint r2 = r10.mTempTextPaint
            android.widget.TextView r3 = r10.mTextView
            android.text.TextPaint r3 = r3.getPaint()
            r2.set(r3)
            android.text.TextPaint r2 = r10.mTempTextPaint
            float r11 = (float) r11
            r2.setTextSize(r11)
            android.widget.TextView r11 = r10.mTextView
            android.text.Layout$Alignment r2 = android.text.Layout.Alignment.ALIGN_NORMAL
            java.lang.String r3 = "getLayoutAlignment"
            java.lang.Object r11 = invokeAndReturnWithDefault(r11, r3, r2)
            r3 = r11
            android.text.Layout$Alignment r3 = (android.text.Layout.Alignment) r3
            float r11 = r12.right
            int r4 = java.lang.Math.round(r11)
            r11 = 23
            if (r1 < r11) goto L63
            android.widget.TextView r6 = r10.mTextView
            android.text.TextPaint r7 = r10.mTempTextPaint
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl r8 = r10.mImpl
            r2 = r0
            r5 = r9
            android.text.StaticLayout r11 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Api23Impl.createStaticLayoutForMeasuring(r2, r3, r4, r5, r6, r7, r8)
            goto L6b
        L63:
            android.widget.TextView r11 = r10.mTextView
            android.text.TextPaint r1 = r10.mTempTextPaint
            android.text.StaticLayout r11 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.Api16Impl.createStaticLayoutForMeasuring(r0, r3, r4, r11, r1)
        L6b:
            r1 = -1
            r2 = 0
            r3 = 1
            if (r9 == r1) goto L86
            int r1 = r11.getLineCount()
            if (r1 > r9) goto L85
            int r1 = r11.getLineCount()
            int r1 = r1 - r3
            int r1 = r11.getLineEnd(r1)
            int r0 = r0.length()
            if (r1 == r0) goto L86
        L85:
            return r2
        L86:
            int r11 = r11.getHeight()
            float r11 = (float) r11
            float r12 = r12.bottom
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 <= 0) goto L92
            return r2
        L92:
            return r3
    }

    private boolean supportsAutoSizeText() {
            r1 = this;
            android.widget.TextView r0 = r1.mTextView
            boolean r0 = r0 instanceof androidx.appcompat.widget.AppCompatEditText
            r0 = r0 ^ 1
            return r0
    }

    private void validateAndSetAutoSizeTextTypeUniformConfiguration(float r4, float r5, float r6) throws java.lang.IllegalArgumentException {
            r3 = this;
            java.lang.String r0 = "px) is less or equal to (0px)"
            r1 = 0
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 <= 0) goto L5d
            int r2 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r2 <= 0) goto L37
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto L1d
            r0 = 1
            r3.mAutoSizeTextType = r0
            r3.mAutoSizeMinTextSizeInPx = r4
            r3.mAutoSizeMaxTextSizeInPx = r5
            r3.mAutoSizeStepGranularityInPx = r6
            r4 = 0
            r3.mHasPresetAutoSizeValues = r4
            return
        L1d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "The auto-size step granularity ("
            r5.append(r1)
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L37:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Maximum auto-size text size ("
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = "px) is less or equal to minimum auto-size text size ("
            r0.append(r5)
            r0.append(r4)
            java.lang.String r4 = "px)"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r6.<init>(r4)
            throw r6
        L5d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "Minimum auto-size text size ("
            r6.append(r1)
            r6.append(r4)
            r6.append(r0)
            java.lang.String r4 = r6.toString()
            r5.<init>(r4)
            throw r5
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void autoSizeText() {
            r5 = this;
            boolean r0 = r5.supportsAutoSizeText()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Le
            int r0 = r5.mAutoSizeTextType
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L12
            return
        L12:
            boolean r0 = r5.mNeedsAutoSizeText
            if (r0 == 0) goto L85
            android.widget.TextView r0 = r5.mTextView
            int r0 = r0.getMeasuredHeight()
            if (r0 <= 0) goto L84
            android.widget.TextView r0 = r5.mTextView
            int r0 = r0.getMeasuredWidth()
            if (r0 > 0) goto L27
            goto L84
        L27:
            androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper$Impl r0 = r5.mImpl
            android.widget.TextView r3 = r5.mTextView
            boolean r0 = r0.isHorizontallyScrollable(r3)
            if (r0 == 0) goto L34
            r0 = 1048576(0x100000, float:1.469368E-39)
            goto L48
        L34:
            android.widget.TextView r0 = r5.mTextView
            int r0 = r0.getMeasuredWidth()
            android.widget.TextView r3 = r5.mTextView
            int r3 = r3.getTotalPaddingLeft()
            int r0 = r0 - r3
            android.widget.TextView r3 = r5.mTextView
            int r3 = r3.getTotalPaddingRight()
            int r0 = r0 - r3
        L48:
            android.widget.TextView r3 = r5.mTextView
            int r3 = r3.getHeight()
            android.widget.TextView r4 = r5.mTextView
            int r4 = r4.getCompoundPaddingBottom()
            int r3 = r3 - r4
            android.widget.TextView r4 = r5.mTextView
            int r4 = r4.getCompoundPaddingTop()
            int r3 = r3 - r4
            if (r0 <= 0) goto L84
            if (r3 > 0) goto L61
            goto L84
        L61:
            android.graphics.RectF r4 = androidx.appcompat.widget.AppCompatTextViewAutoSizeHelper.TEMP_RECTF
            monitor-enter(r4)
            r4.setEmpty()     // Catch: java.lang.Throwable -> L81
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L81
            r4.right = r0     // Catch: java.lang.Throwable -> L81
            float r0 = (float) r3     // Catch: java.lang.Throwable -> L81
            r4.bottom = r0     // Catch: java.lang.Throwable -> L81
            int r0 = r5.findLargestTextSizeWhichFits(r4)     // Catch: java.lang.Throwable -> L81
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L81
            android.widget.TextView r3 = r5.mTextView     // Catch: java.lang.Throwable -> L81
            float r3 = r3.getTextSize()     // Catch: java.lang.Throwable -> L81
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L7f
            r5.setTextSizeInternal(r2, r0)     // Catch: java.lang.Throwable -> L81
        L7f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L81
            goto L85
        L81:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L81
            throw r0
        L84:
            return
        L85:
            r5.mNeedsAutoSizeText = r1
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final int getAutoSizeMaxTextSize() {
            r1 = this;
            float r0 = r1.mAutoSizeMaxTextSizeInPx
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final int getAutoSizeMinTextSize() {
            r1 = this;
            float r0 = r1.mAutoSizeMinTextSizeInPx
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final int getAutoSizeStepGranularity() {
            r1 = this;
            float r0 = r1.mAutoSizeStepGranularityInPx
            int r0 = java.lang.Math.round(r0)
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final int[] getAutoSizeTextAvailableSizes() {
            r1 = this;
            int[] r0 = r1.mAutoSizeTextSizesInPx
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final int getAutoSizeTextType() {
            r1 = this;
            int r0 = r1.mAutoSizeTextType
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean isAutoSizeEnabled() {
            r1 = this;
            boolean r0 = r1.supportsAutoSizeText()
            if (r0 == 0) goto Lc
            int r0 = r1.mAutoSizeTextType
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public final void loadFromAttributes(@androidx.annotation.Nullable android.util.AttributeSet r10, int r11) {
            r9 = this;
            android.content.Context r0 = r9.mContext
            int[] r3 = androidx.appcompat.R.styleable.AppCompatTextView
            r8 = 0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r10, r3, r11, r8)
            android.widget.TextView r1 = r9.mTextView
            android.content.Context r2 = r1.getContext()
            r7 = 0
            r4 = r10
            r5 = r0
            r6 = r11
            androidx.core.view.ViewCompat.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6, r7)
            int r10 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeTextType
            boolean r11 = r0.hasValue(r10)
            if (r11 == 0) goto L24
            int r10 = r0.getInt(r10, r8)
            r9.mAutoSizeTextType = r10
        L24:
            int r10 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeStepGranularity
            boolean r11 = r0.hasValue(r10)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r11 == 0) goto L33
            float r10 = r0.getDimension(r10, r1)
            goto L35
        L33:
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
        L35:
            int r11 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeMinTextSize
            boolean r2 = r0.hasValue(r11)
            if (r2 == 0) goto L42
            float r11 = r0.getDimension(r11, r1)
            goto L44
        L42:
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
        L44:
            int r2 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeMaxTextSize
            boolean r3 = r0.hasValue(r2)
            if (r3 == 0) goto L51
            float r2 = r0.getDimension(r2, r1)
            goto L53
        L51:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L53:
            int r3 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizePresetSizes
            boolean r4 = r0.hasValue(r3)
            if (r4 == 0) goto L6f
            int r3 = r0.getResourceId(r3, r8)
            if (r3 <= 0) goto L6f
            android.content.res.Resources r4 = r0.getResources()
            android.content.res.TypedArray r3 = r4.obtainTypedArray(r3)
            r9.setupAutoSizeUniformPresetSizes(r3)
            r3.recycle()
        L6f:
            r0.recycle()
            boolean r0 = r9.supportsAutoSizeText()
            if (r0 == 0) goto Lad
            int r0 = r9.mAutoSizeTextType
            r3 = 1
            if (r0 != r3) goto Laf
            boolean r0 = r9.mHasPresetAutoSizeValues
            if (r0 != 0) goto La9
            android.content.Context r0 = r9.mContext
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            r3 = 2
            int r4 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r4 != 0) goto L96
            r11 = 1094713344(0x41400000, float:12.0)
            float r11 = android.util.TypedValue.applyDimension(r3, r11, r0)
        L96:
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 != 0) goto La0
            r2 = 1121976320(0x42e00000, float:112.0)
            float r2 = android.util.TypedValue.applyDimension(r3, r2, r0)
        La0:
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 != 0) goto La6
            r10 = 1065353216(0x3f800000, float:1.0)
        La6:
            r9.validateAndSetAutoSizeTextTypeUniformConfiguration(r11, r2, r10)
        La9:
            r9.setupAutoSizeText()
            goto Laf
        Lad:
            r9.mAutoSizeTextType = r8
        Laf:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void setAutoSizeTextTypeUniformWithConfiguration(int r2, int r3, int r4, int r5) throws java.lang.IllegalArgumentException {
            r1 = this;
            boolean r0 = r1.supportsAutoSizeText()
            if (r0 == 0) goto L2b
            android.content.Context r0 = r1.mContext
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r2 = (float) r2
            float r2 = android.util.TypedValue.applyDimension(r5, r2, r0)
            float r3 = (float) r3
            float r3 = android.util.TypedValue.applyDimension(r5, r3, r0)
            float r4 = (float) r4
            float r4 = android.util.TypedValue.applyDimension(r5, r4, r0)
            r1.validateAndSetAutoSizeTextTypeUniformConfiguration(r2, r3, r4)
            boolean r2 = r1.setupAutoSizeText()
            if (r2 == 0) goto L2b
            r1.autoSizeText()
        L2b:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void setAutoSizeTextTypeUniformWithPresetSizes(@androidx.annotation.NonNull int[] r6, int r7) throws java.lang.IllegalArgumentException {
            r5 = this;
            boolean r0 = r5.supportsAutoSizeText()
            if (r0 == 0) goto L5e
            int r0 = r6.length
            r1 = 0
            if (r0 <= 0) goto L53
            int[] r2 = new int[r0]
            if (r7 != 0) goto L13
            int[] r2 = java.util.Arrays.copyOf(r6, r0)
            goto L2f
        L13:
            android.content.Context r3 = r5.mContext
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
        L1d:
            if (r1 >= r0) goto L2f
            r4 = r6[r1]
            float r4 = (float) r4
            float r4 = android.util.TypedValue.applyDimension(r7, r4, r3)
            int r4 = java.lang.Math.round(r4)
            r2[r1] = r4
            int r1 = r1 + 1
            goto L1d
        L2f:
            int[] r7 = r5.cleanupAutoSizePresetSizes(r2)
            r5.mAutoSizeTextSizesInPx = r7
            boolean r7 = r5.setupAutoSizeUniformPresetSizesConfiguration()
            if (r7 == 0) goto L3c
            goto L55
        L3c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "None of the preset sizes is valid: "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r6 = java.util.Arrays.toString(r6)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
        L53:
            r5.mHasPresetAutoSizeValues = r1
        L55:
            boolean r6 = r5.setupAutoSizeText()
            if (r6 == 0) goto L5e
            r5.autoSizeText()
        L5e:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void setAutoSizeTextTypeWithDefaults(int r4) {
            r3 = this;
            boolean r0 = r3.supportsAutoSizeText()
            if (r0 == 0) goto L40
            if (r4 == 0) goto L3d
            r0 = 1
            if (r4 != r0) goto L31
            android.content.Context r4 = r3.mContext
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            r0 = 1094713344(0x41400000, float:12.0)
            r1 = 2
            float r0 = android.util.TypedValue.applyDimension(r1, r0, r4)
            r2 = 1121976320(0x42e00000, float:112.0)
            float r4 = android.util.TypedValue.applyDimension(r1, r2, r4)
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.validateAndSetAutoSizeTextTypeUniformConfiguration(r0, r4, r1)
            boolean r4 = r3.setupAutoSizeText()
            if (r4 == 0) goto L40
            r3.autoSizeText()
            goto L40
        L31:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown auto-size text type: "
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r4)
            r0.<init>(r4)
            throw r0
        L3d:
            r3.clearAutoSizeConfiguration()
        L40:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final void setTextSizeInternal(int r2, float r3) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            if (r0 != 0) goto L9
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()
            goto Ld
        L9:
            android.content.res.Resources r0 = r0.getResources()
        Ld:
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r2, r3, r0)
            r1.setRawTextSize(r2)
            return
    }
}
