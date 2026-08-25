package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
public abstract class ParallaxEffect {
    public final java.util.List<androidx.leanback.widget.Parallax.PropertyMarkerValue> mMarkerValues;
    public final java.util.List<androidx.leanback.widget.ParallaxTarget> mTargets;
    public final java.util.List<java.lang.Float> mTotalWeights;
    public final java.util.List<java.lang.Float> mWeights;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class FloatEffect extends androidx.leanback.widget.ParallaxEffect {
        public FloatEffect() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.leanback.widget.ParallaxEffect
        public final java.lang.Number calculateDirectValue(androidx.leanback.widget.Parallax r6) {
                r5 = this;
                java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r0 = r5.mMarkerValues
                int r0 = r0.size()
                r1 = 2
                if (r0 != r1) goto L78
                java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r0 = r5.mMarkerValues
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                androidx.leanback.widget.Parallax$PropertyMarkerValue r0 = (androidx.leanback.widget.Parallax.PropertyMarkerValue) r0
                java.lang.Object r0 = r0.getProperty()
                java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r2 = r5.mMarkerValues
                r3 = 1
                java.lang.Object r2 = r2.get(r3)
                androidx.leanback.widget.Parallax$PropertyMarkerValue r2 = (androidx.leanback.widget.Parallax.PropertyMarkerValue) r2
                java.lang.Object r2 = r2.getProperty()
                if (r0 != r2) goto L70
                java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r0 = r5.mMarkerValues
                java.lang.Object r0 = r0.get(r1)
                androidx.leanback.widget.Parallax$FloatPropertyMarkerValue r0 = (androidx.leanback.widget.Parallax.FloatPropertyMarkerValue) r0
                float r0 = r0.getMarkerValue(r6)
                java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r2 = r5.mMarkerValues
                java.lang.Object r2 = r2.get(r3)
                androidx.leanback.widget.Parallax$FloatPropertyMarkerValue r2 = (androidx.leanback.widget.Parallax.FloatPropertyMarkerValue) r2
                float r2 = r2.getMarkerValue(r6)
                int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r3 <= 0) goto L44
                r4 = r2
                r2 = r0
                r0 = r4
            L44:
                java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r3 = r5.mMarkerValues
                java.lang.Object r1 = r3.get(r1)
                androidx.leanback.widget.Parallax$PropertyMarkerValue r1 = (androidx.leanback.widget.Parallax.PropertyMarkerValue) r1
                java.lang.Object r1 = r1.getProperty()
                androidx.leanback.widget.Parallax$FloatProperty r1 = (androidx.leanback.widget.Parallax.FloatProperty) r1
                java.lang.Float r6 = r1.get2(r6)
                float r1 = r6.floatValue()
                int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                if (r1 >= 0) goto L63
                java.lang.Float r6 = java.lang.Float.valueOf(r0)
                goto L6f
            L63:
                float r0 = r6.floatValue()
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto L6f
                java.lang.Float r6 = java.lang.Float.valueOf(r2)
            L6f:
                return r6
            L70:
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                java.lang.String r0 = "Marker value must use same Property for direct mapping"
                r6.<init>(r0)
                throw r6
            L78:
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                java.lang.String r0 = "Must use two marker values for direct mapping"
                r6.<init>(r0)
                throw r6
        }

        @Override // androidx.leanback.widget.ParallaxEffect
        public final float calculateFraction(androidx.leanback.widget.Parallax r11) {
                r10 = this;
                r0 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
            L5:
                java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r5 = r10.mMarkerValues
                int r5 = r5.size()
                r6 = 1065353216(0x3f800000, float:1.0)
                if (r0 >= r5) goto L7f
                java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r5 = r10.mMarkerValues
                java.lang.Object r5 = r5.get(r0)
                androidx.leanback.widget.Parallax$FloatPropertyMarkerValue r5 = (androidx.leanback.widget.Parallax.FloatPropertyMarkerValue) r5
                java.lang.Object r7 = r5.getProperty()
                androidx.leanback.widget.Parallax$FloatProperty r7 = (androidx.leanback.widget.Parallax.FloatProperty) r7
                int r7 = r7.getIndex()
                float r5 = r5.getMarkerValue(r11)
                float r8 = r11.getFloatPropertyValue(r7)
                if (r0 != 0) goto L30
                int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r2 < 0) goto L79
                return r1
            L30:
                if (r2 != r7) goto L3f
                int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r9 < 0) goto L37
                goto L3f
            L37:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "marker value of same variable must be descendant order"
                r11.<init>(r0)
                throw r11
            L3f:
                r9 = 2139095039(0x7f7fffff, float:3.4028235E38)
                int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
                if (r9 != 0) goto L51
                float r3 = r3 - r4
                float r11 = r11.getMaxValue()
                float r3 = r3 / r11
                float r11 = r10.getFractionWithWeightAdjusted(r3, r0)
                return r11
            L51:
                int r9 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                if (r9 < 0) goto L79
                if (r2 != r7) goto L5c
                float r11 = r3 - r8
                float r3 = r3 - r5
                float r11 = r11 / r3
                goto L74
            L5c:
                r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r1 == 0) goto L6c
                float r11 = r8 - r4
                float r11 = r11 + r3
                float r1 = r11 - r8
                float r11 = r11 - r5
                float r11 = r1 / r11
                goto L74
            L6c:
                float r8 = r8 - r5
                float r11 = r11.getMaxValue()
                float r8 = r8 / r11
                float r11 = r6 - r8
            L74:
                float r11 = r10.getFractionWithWeightAdjusted(r11, r0)
                return r11
            L79:
                int r0 = r0 + 1
                r3 = r5
                r2 = r7
                r4 = r8
                goto L5
            L7f:
                return r6
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class IntEffect extends androidx.leanback.widget.ParallaxEffect {
        public IntEffect() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.leanback.widget.ParallaxEffect
        public final java.lang.Number calculateDirectValue(androidx.leanback.widget.Parallax r6) {
                r5 = this;
                java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r0 = r5.mMarkerValues
                int r0 = r0.size()
                r1 = 2
                if (r0 != r1) goto L72
                java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r0 = r5.mMarkerValues
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                androidx.leanback.widget.Parallax$PropertyMarkerValue r0 = (androidx.leanback.widget.Parallax.PropertyMarkerValue) r0
                java.lang.Object r0 = r0.getProperty()
                java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r2 = r5.mMarkerValues
                r3 = 1
                java.lang.Object r2 = r2.get(r3)
                androidx.leanback.widget.Parallax$PropertyMarkerValue r2 = (androidx.leanback.widget.Parallax.PropertyMarkerValue) r2
                java.lang.Object r2 = r2.getProperty()
                if (r0 != r2) goto L6a
                java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r0 = r5.mMarkerValues
                java.lang.Object r0 = r0.get(r1)
                androidx.leanback.widget.Parallax$IntPropertyMarkerValue r0 = (androidx.leanback.widget.Parallax.IntPropertyMarkerValue) r0
                int r0 = r0.getMarkerValue(r6)
                java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r2 = r5.mMarkerValues
                java.lang.Object r2 = r2.get(r3)
                androidx.leanback.widget.Parallax$IntPropertyMarkerValue r2 = (androidx.leanback.widget.Parallax.IntPropertyMarkerValue) r2
                int r2 = r2.getMarkerValue(r6)
                if (r0 <= r2) goto L42
                r4 = r2
                r2 = r0
                r0 = r4
            L42:
                java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r3 = r5.mMarkerValues
                java.lang.Object r1 = r3.get(r1)
                androidx.leanback.widget.Parallax$PropertyMarkerValue r1 = (androidx.leanback.widget.Parallax.PropertyMarkerValue) r1
                java.lang.Object r1 = r1.getProperty()
                androidx.leanback.widget.Parallax$IntProperty r1 = (androidx.leanback.widget.Parallax.IntProperty) r1
                java.lang.Integer r6 = r1.get2(r6)
                int r1 = r6.intValue()
                if (r1 >= r0) goto L5f
                java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
                goto L69
            L5f:
                int r0 = r6.intValue()
                if (r0 <= r2) goto L69
                java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            L69:
                return r6
            L6a:
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                java.lang.String r0 = "Marker value must use same Property for direct mapping"
                r6.<init>(r0)
                throw r6
            L72:
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                java.lang.String r0 = "Must use two marker values for direct mapping"
                r6.<init>(r0)
                throw r6
        }

        @Override // androidx.leanback.widget.ParallaxEffect
        public final float calculateFraction(androidx.leanback.widget.Parallax r10) {
                r9 = this;
                r0 = 0
                r1 = 0
                r2 = 0
                r3 = 0
            L4:
                java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r4 = r9.mMarkerValues
                int r4 = r4.size()
                r5 = 1065353216(0x3f800000, float:1.0)
                if (r0 >= r4) goto L7a
                java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r4 = r9.mMarkerValues
                java.lang.Object r4 = r4.get(r0)
                androidx.leanback.widget.Parallax$IntPropertyMarkerValue r4 = (androidx.leanback.widget.Parallax.IntPropertyMarkerValue) r4
                java.lang.Object r6 = r4.getProperty()
                androidx.leanback.widget.Parallax$IntProperty r6 = (androidx.leanback.widget.Parallax.IntProperty) r6
                int r6 = r6.getIndex()
                int r4 = r4.getMarkerValue(r10)
                int r7 = r10.getIntPropertyValue(r6)
                if (r0 != 0) goto L2e
                if (r7 < r4) goto L74
                r10 = 0
                return r10
            L2e:
                if (r1 != r6) goto L3b
                if (r2 < r4) goto L33
                goto L3b
            L33:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "marker value of same variable must be descendant order"
                r10.<init>(r0)
                throw r10
            L3b:
                r8 = 2147483647(0x7fffffff, float:NaN)
                if (r7 != r8) goto L4c
                int r2 = r2 - r3
                float r1 = (float) r2
                float r10 = r10.getMaxValue()
                float r1 = r1 / r10
                float r10 = r9.getFractionWithWeightAdjusted(r1, r0)
                return r10
            L4c:
                if (r7 < r4) goto L74
                if (r1 != r6) goto L57
                int r10 = r2 - r7
                float r10 = (float) r10
                int r2 = r2 - r4
                float r1 = (float) r2
                float r10 = r10 / r1
                goto L6f
            L57:
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r3 == r1) goto L66
                int r10 = r7 - r3
                int r10 = r10 + r2
                int r1 = r10 - r7
                float r1 = (float) r1
                int r10 = r10 - r4
                float r10 = (float) r10
                float r10 = r1 / r10
                goto L6f
            L66:
                int r7 = r7 - r4
                float r1 = (float) r7
                float r10 = r10.getMaxValue()
                float r1 = r1 / r10
                float r10 = r5 - r1
            L6f:
                float r10 = r9.getFractionWithWeightAdjusted(r10, r0)
                return r10
            L74:
                int r0 = r0 + 1
                r2 = r4
                r1 = r6
                r3 = r7
                goto L4
            L7a:
                return r5
        }
    }

    public ParallaxEffect() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            r2.mMarkerValues = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r2.mWeights = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r2.mTotalWeights = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            r2.mTargets = r0
            return
    }

    public final void addTarget(androidx.leanback.widget.ParallaxTarget r2) {
            r1 = this;
            java.util.List<androidx.leanback.widget.ParallaxTarget> r0 = r1.mTargets
            r0.add(r2)
            return
    }

    public abstract java.lang.Number calculateDirectValue(androidx.leanback.widget.Parallax r1);

    public abstract float calculateFraction(androidx.leanback.widget.Parallax r1);

    public final float getFractionWithWeightAdjusted(float r5, int r6) {
            r4 = this;
            java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r0 = r4.mMarkerValues
            int r0 = r0.size()
            r1 = 3
            if (r0 < r1) goto L61
            java.util.List<java.lang.Float> r0 = r4.mWeights
            int r0 = r0.size()
            java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r1 = r4.mMarkerValues
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            if (r0 != r1) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            r1 = 2
            if (r0 == 0) goto L52
            java.util.List<java.lang.Float> r0 = r4.mTotalWeights
            int r3 = r0.size()
            int r3 = r3 - r2
            java.lang.Object r0 = r0.get(r3)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            java.util.List<java.lang.Float> r2 = r4.mWeights
            int r3 = r6 + (-1)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            float r2 = r2 * r5
            float r5 = r2 / r0
            if (r6 < r1) goto L61
            java.util.List<java.lang.Float> r2 = r4.mTotalWeights
            int r6 = r6 - r1
            java.lang.Object r6 = r2.get(r6)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            goto L5f
        L52:
            java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r0 = r4.mMarkerValues
            int r0 = r0.size()
            int r0 = r0 - r2
            float r0 = (float) r0
            float r5 = r5 / r0
            if (r6 < r1) goto L61
            int r6 = r6 - r2
            float r6 = (float) r6
        L5f:
            float r6 = r6 / r0
            float r5 = r5 + r6
        L61:
            return r5
    }

    public final java.util.List<androidx.leanback.widget.Parallax.PropertyMarkerValue> getPropertyRanges() {
            r1 = this;
            java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r0 = r1.mMarkerValues
            return r0
    }

    public final java.util.List<androidx.leanback.widget.ParallaxTarget> getTargets() {
            r1 = this;
            java.util.List<androidx.leanback.widget.ParallaxTarget> r0 = r1.mTargets
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public final java.util.List<java.lang.Float> getWeights() {
            r1 = this;
            java.util.List<java.lang.Float> r0 = r1.mWeights
            return r0
    }

    public final void performMapping(androidx.leanback.widget.Parallax r7) {
            r6 = this;
            java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r0 = r6.mMarkerValues
            int r0 = r0.size()
            r1 = 2
            if (r0 >= r1) goto La
            return
        La:
            boolean r0 = r6 instanceof androidx.leanback.widget.ParallaxEffect.IntEffect
            if (r0 == 0) goto L12
            r7.verifyIntProperties()
            goto L15
        L12:
            r7.verifyFloatProperties()
        L15:
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L19:
            java.util.List<androidx.leanback.widget.ParallaxTarget> r4 = r6.mTargets
            int r4 = r4.size()
            if (r2 >= r4) goto L46
            java.util.List<androidx.leanback.widget.ParallaxTarget> r4 = r6.mTargets
            java.lang.Object r4 = r4.get(r2)
            androidx.leanback.widget.ParallaxTarget r4 = (androidx.leanback.widget.ParallaxTarget) r4
            boolean r5 = r4.isDirectMapping()
            if (r5 == 0) goto L39
            if (r1 != 0) goto L35
            java.lang.Number r1 = r6.calculateDirectValue(r7)
        L35:
            r4.directUpdate(r1)
            goto L43
        L39:
            if (r3 != 0) goto L40
            float r0 = r6.calculateFraction(r7)
            r3 = 1
        L40:
            r4.update(r0)
        L43:
            int r2 = r2 + 1
            goto L19
        L46:
            return
    }

    public final void removeTarget(androidx.leanback.widget.ParallaxTarget r2) {
            r1 = this;
            java.util.List<androidx.leanback.widget.ParallaxTarget> r0 = r1.mTargets
            r0.remove(r2)
            return
    }

    public final void setPropertyRanges(androidx.leanback.widget.Parallax.PropertyMarkerValue... r5) {
            r4 = this;
            java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r0 = r4.mMarkerValues
            r0.clear()
            int r0 = r5.length
            r1 = 0
        L7:
            if (r1 >= r0) goto L13
            r2 = r5[r1]
            java.util.List<androidx.leanback.widget.Parallax$PropertyMarkerValue> r3 = r4.mMarkerValues
            r3.add(r2)
            int r1 = r1 + 1
            goto L7
        L13:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public final void setWeights(float... r7) {
            r6 = this;
            int r0 = r7.length
            r1 = 0
            r2 = 0
        L3:
            r3 = 0
            if (r2 >= r0) goto L15
            r4 = r7[r2]
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 <= 0) goto Lf
            int r2 = r2 + 1
            goto L3
        Lf:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
        L15:
            java.util.List<java.lang.Float> r0 = r6.mWeights
            r0.clear()
            java.util.List<java.lang.Float> r0 = r6.mTotalWeights
            r0.clear()
            int r0 = r7.length
        L20:
            if (r1 >= r0) goto L3a
            r2 = r7[r1]
            java.util.List<java.lang.Float> r4 = r6.mWeights
            java.lang.Float r5 = java.lang.Float.valueOf(r2)
            r4.add(r5)
            float r3 = r3 + r2
            java.util.List<java.lang.Float> r2 = r6.mTotalWeights
            java.lang.Float r4 = java.lang.Float.valueOf(r3)
            r2.add(r4)
            int r1 = r1 + 1
            goto L20
        L3a:
            return
    }

    public final androidx.leanback.widget.ParallaxEffect target(androidx.leanback.widget.ParallaxTarget r2) {
            r1 = this;
            java.util.List<androidx.leanback.widget.ParallaxTarget> r0 = r1.mTargets
            r0.add(r2)
            return r1
    }

    public final androidx.leanback.widget.ParallaxEffect target(java.lang.Object r3, android.animation.PropertyValuesHolder r4) {
            r2 = this;
            java.util.List<androidx.leanback.widget.ParallaxTarget> r0 = r2.mTargets
            androidx.leanback.widget.ParallaxTarget$PropertyValuesHolderTarget r1 = new androidx.leanback.widget.ParallaxTarget$PropertyValuesHolderTarget
            r1.<init>(r3, r4)
            r0.add(r1)
            return r2
    }

    public final <T, V extends java.lang.Number> androidx.leanback.widget.ParallaxEffect target(T r3, android.util.Property<T, V> r4) {
            r2 = this;
            java.util.List<androidx.leanback.widget.ParallaxTarget> r0 = r2.mTargets
            androidx.leanback.widget.ParallaxTarget$DirectPropertyTarget r1 = new androidx.leanback.widget.ParallaxTarget$DirectPropertyTarget
            r1.<init>(r3, r4)
            r0.add(r1)
            return r2
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public final androidx.leanback.widget.ParallaxEffect weights(float... r1) {
            r0 = this;
            r0.setWeights(r1)
            return r0
    }
}
