package androidx.leanback.widget;

import android.util.Property;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Parallax<PropertyT extends android.util.Property> {
    private final java.util.List<androidx.leanback.widget.ParallaxEffect> mEffects;
    private float[] mFloatValues;
    public final java.util.List<PropertyT> mProperties;
    public final java.util.List<PropertyT> mPropertiesReadOnly;
    private int[] mValues;

    /* JADX INFO: loaded from: classes3.dex */
    public static class FloatProperty extends android.util.Property<androidx.leanback.widget.Parallax, java.lang.Float> {
        public static final float UNKNOWN_AFTER = Float.MAX_VALUE;
        public static final float UNKNOWN_BEFORE = -3.4028235E38f;
        private final int mIndex;

        public FloatProperty(java.lang.String r2, int r3) {
                r1 = this;
                java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
                r1.<init>(r0, r2)
                r1.mIndex = r3
                return
        }

        public final androidx.leanback.widget.Parallax.PropertyMarkerValue at(float r2, float r3) {
                r1 = this;
                androidx.leanback.widget.Parallax$FloatPropertyMarkerValue r0 = new androidx.leanback.widget.Parallax$FloatPropertyMarkerValue
                r0.<init>(r1, r2, r3)
                return r0
        }

        public final androidx.leanback.widget.Parallax.PropertyMarkerValue atAbsolute(float r3) {
                r2 = this;
                androidx.leanback.widget.Parallax$FloatPropertyMarkerValue r0 = new androidx.leanback.widget.Parallax$FloatPropertyMarkerValue
                r1 = 0
                r0.<init>(r2, r3, r1)
                return r0
        }

        public final androidx.leanback.widget.Parallax.PropertyMarkerValue atFraction(float r3) {
                r2 = this;
                androidx.leanback.widget.Parallax$FloatPropertyMarkerValue r0 = new androidx.leanback.widget.Parallax$FloatPropertyMarkerValue
                r1 = 0
                r0.<init>(r2, r1, r3)
                return r0
        }

        public final androidx.leanback.widget.Parallax.PropertyMarkerValue atMax() {
                r3 = this;
                androidx.leanback.widget.Parallax$FloatPropertyMarkerValue r0 = new androidx.leanback.widget.Parallax$FloatPropertyMarkerValue
                r1 = 0
                r2 = 1065353216(0x3f800000, float:1.0)
                r0.<init>(r3, r1, r2)
                return r0
        }

        public final androidx.leanback.widget.Parallax.PropertyMarkerValue atMin() {
                r2 = this;
                androidx.leanback.widget.Parallax$FloatPropertyMarkerValue r0 = new androidx.leanback.widget.Parallax$FloatPropertyMarkerValue
                r1 = 0
                r0.<init>(r2, r1, r1)
                return r0
        }

        /* JADX INFO: renamed from: get, reason: avoid collision after fix types in other method */
        public final java.lang.Float get2(androidx.leanback.widget.Parallax r2) {
                r1 = this;
                int r0 = r1.mIndex
                float r2 = r2.getFloatPropertyValue(r0)
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                return r2
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ java.lang.Float get(androidx.leanback.widget.Parallax r1) {
                r0 = this;
                androidx.leanback.widget.Parallax r1 = (androidx.leanback.widget.Parallax) r1
                java.lang.Float r1 = r0.get2(r1)
                return r1
        }

        public final int getIndex() {
                r1 = this;
                int r0 = r1.mIndex
                return r0
        }

        public final float getValue(androidx.leanback.widget.Parallax r2) {
                r1 = this;
                int r0 = r1.mIndex
                float r2 = r2.getFloatPropertyValue(r0)
                return r2
        }

        /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
        public final void set2(androidx.leanback.widget.Parallax r2, java.lang.Float r3) {
                r1 = this;
                int r0 = r1.mIndex
                float r3 = r3.floatValue()
                r2.setFloatPropertyValue(r0, r3)
                return
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(androidx.leanback.widget.Parallax r1, java.lang.Float r2) {
                r0 = this;
                androidx.leanback.widget.Parallax r1 = (androidx.leanback.widget.Parallax) r1
                java.lang.Float r2 = (java.lang.Float) r2
                r0.set2(r1, r2)
                return
        }

        public final void setValue(androidx.leanback.widget.Parallax r2, float r3) {
                r1 = this;
                int r0 = r1.mIndex
                r2.setFloatPropertyValue(r0, r3)
                return
        }
    }

    public static class FloatPropertyMarkerValue extends androidx.leanback.widget.Parallax.PropertyMarkerValue<androidx.leanback.widget.Parallax.FloatProperty> {
        private final float mFactionOfMax;
        private final float mValue;

        public FloatPropertyMarkerValue(androidx.leanback.widget.Parallax.FloatProperty r1, float r2, float r3) {
                r0 = this;
                r0.<init>(r1)
                r0.mValue = r2
                r0.mFactionOfMax = r3
                return
        }

        public final float getMarkerValue(androidx.leanback.widget.Parallax r3) {
                r2 = this;
                float r0 = r2.mFactionOfMax
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto La
                float r3 = r2.mValue
                goto L15
            La:
                float r0 = r2.mValue
                float r3 = r3.getMaxValue()
                float r1 = r2.mFactionOfMax
                float r3 = r3 * r1
                float r3 = r3 + r0
            L15:
                return r3
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class IntProperty extends android.util.Property<androidx.leanback.widget.Parallax, java.lang.Integer> {
        public static final int UNKNOWN_AFTER = Integer.MAX_VALUE;
        public static final int UNKNOWN_BEFORE = Integer.MIN_VALUE;
        private final int mIndex;

        public IntProperty(java.lang.String r2, int r3) {
                r1 = this;
                java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
                r1.<init>(r0, r2)
                r1.mIndex = r3
                return
        }

        public final androidx.leanback.widget.Parallax.PropertyMarkerValue at(int r2, float r3) {
                r1 = this;
                androidx.leanback.widget.Parallax$IntPropertyMarkerValue r0 = new androidx.leanback.widget.Parallax$IntPropertyMarkerValue
                r0.<init>(r1, r2, r3)
                return r0
        }

        public final androidx.leanback.widget.Parallax.PropertyMarkerValue atAbsolute(int r3) {
                r2 = this;
                androidx.leanback.widget.Parallax$IntPropertyMarkerValue r0 = new androidx.leanback.widget.Parallax$IntPropertyMarkerValue
                r1 = 0
                r0.<init>(r2, r3, r1)
                return r0
        }

        public final androidx.leanback.widget.Parallax.PropertyMarkerValue atFraction(float r3) {
                r2 = this;
                androidx.leanback.widget.Parallax$IntPropertyMarkerValue r0 = new androidx.leanback.widget.Parallax$IntPropertyMarkerValue
                r1 = 0
                r0.<init>(r2, r1, r3)
                return r0
        }

        public final androidx.leanback.widget.Parallax.PropertyMarkerValue atMax() {
                r3 = this;
                androidx.leanback.widget.Parallax$IntPropertyMarkerValue r0 = new androidx.leanback.widget.Parallax$IntPropertyMarkerValue
                r1 = 0
                r2 = 1065353216(0x3f800000, float:1.0)
                r0.<init>(r3, r1, r2)
                return r0
        }

        public final androidx.leanback.widget.Parallax.PropertyMarkerValue atMin() {
                r3 = this;
                androidx.leanback.widget.Parallax$IntPropertyMarkerValue r0 = new androidx.leanback.widget.Parallax$IntPropertyMarkerValue
                r1 = 0
                r2 = 0
                r0.<init>(r3, r2, r1)
                return r0
        }

        /* JADX INFO: renamed from: get, reason: avoid collision after fix types in other method */
        public final java.lang.Integer get2(androidx.leanback.widget.Parallax r2) {
                r1 = this;
                int r0 = r1.mIndex
                int r2 = r2.getIntPropertyValue(r0)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                return r2
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ java.lang.Integer get(androidx.leanback.widget.Parallax r1) {
                r0 = this;
                androidx.leanback.widget.Parallax r1 = (androidx.leanback.widget.Parallax) r1
                java.lang.Integer r1 = r0.get2(r1)
                return r1
        }

        public final int getIndex() {
                r1 = this;
                int r0 = r1.mIndex
                return r0
        }

        public final int getValue(androidx.leanback.widget.Parallax r2) {
                r1 = this;
                int r0 = r1.mIndex
                int r2 = r2.getIntPropertyValue(r0)
                return r2
        }

        /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
        public final void set2(androidx.leanback.widget.Parallax r2, java.lang.Integer r3) {
                r1 = this;
                int r0 = r1.mIndex
                int r3 = r3.intValue()
                r2.setIntPropertyValue(r0, r3)
                return
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(androidx.leanback.widget.Parallax r1, java.lang.Integer r2) {
                r0 = this;
                androidx.leanback.widget.Parallax r1 = (androidx.leanback.widget.Parallax) r1
                java.lang.Integer r2 = (java.lang.Integer) r2
                r0.set2(r1, r2)
                return
        }

        public final void setValue(androidx.leanback.widget.Parallax r2, int r3) {
                r1 = this;
                int r0 = r1.mIndex
                r2.setIntPropertyValue(r0, r3)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class IntPropertyMarkerValue extends androidx.leanback.widget.Parallax.PropertyMarkerValue<androidx.leanback.widget.Parallax.IntProperty> {
        private final float mFactionOfMax;
        private final int mValue;

        public IntPropertyMarkerValue(androidx.leanback.widget.Parallax.IntProperty r1, int r2, float r3) {
                r0 = this;
                r0.<init>(r1)
                r0.mValue = r2
                r0.mFactionOfMax = r3
                return
        }

        public final int getMarkerValue(androidx.leanback.widget.Parallax r3) {
                r2 = this;
                float r0 = r2.mFactionOfMax
                r1 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto La
                int r3 = r2.mValue
                goto L19
            La:
                int r0 = r2.mValue
                float r3 = r3.getMaxValue()
                float r1 = r2.mFactionOfMax
                float r3 = r3 * r1
                int r3 = java.lang.Math.round(r3)
                int r3 = r3 + r0
            L19:
                return r3
        }
    }

    public static class PropertyMarkerValue<PropertyT> {
        private final PropertyT mProperty;

        public PropertyMarkerValue(PropertyT r1) {
                r0 = this;
                r0.<init>()
                r0.mProperty = r1
                return
        }

        public PropertyT getProperty() {
                r1 = this;
                PropertyT r0 = r1.mProperty
                return r0
        }
    }

    public Parallax() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mProperties = r0
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r2.mPropertiesReadOnly = r0
            r0 = 4
            int[] r1 = new int[r0]
            r2.mValues = r1
            float[] r1 = new float[r0]
            r2.mFloatValues = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2.mEffects = r1
            return
    }

    public androidx.leanback.widget.ParallaxEffect addEffect(androidx.leanback.widget.Parallax.PropertyMarkerValue... r2) {
            r1 = this;
            r0 = 0
            r0 = r2[r0]
            java.lang.Object r0 = r0.getProperty()
            boolean r0 = r0 instanceof androidx.leanback.widget.Parallax.IntProperty
            if (r0 == 0) goto L11
            androidx.leanback.widget.ParallaxEffect$IntEffect r0 = new androidx.leanback.widget.ParallaxEffect$IntEffect
            r0.<init>()
            goto L16
        L11:
            androidx.leanback.widget.ParallaxEffect$FloatEffect r0 = new androidx.leanback.widget.ParallaxEffect$FloatEffect
            r0.<init>()
        L16:
            r0.setPropertyRanges(r2)
            java.util.List<androidx.leanback.widget.ParallaxEffect> r2 = r1.mEffects
            r2.add(r0)
            return r0
    }

    public final PropertyT addProperty(java.lang.String r6) {
            r5 = this;
            java.util.List<PropertyT extends android.util.Property> r0 = r5.mProperties
            int r0 = r0.size()
            android.util.Property r6 = r5.createProperty(r6, r0)
            boolean r1 = r6 instanceof androidx.leanback.widget.Parallax.IntProperty
            r2 = 0
            if (r1 == 0) goto L2d
            int[] r1 = r5.mValues
            int r1 = r1.length
            if (r1 != r0) goto L25
            int r3 = r1 * 2
            int[] r3 = new int[r3]
        L18:
            if (r2 >= r1) goto L23
            int[] r4 = r5.mValues
            r4 = r4[r2]
            r3[r2] = r4
            int r2 = r2 + 1
            goto L18
        L23:
            r5.mValues = r3
        L25:
            int[] r1 = r5.mValues
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1[r0] = r2
            goto L4e
        L2d:
            boolean r1 = r6 instanceof androidx.leanback.widget.Parallax.FloatProperty
            if (r1 == 0) goto L54
            float[] r1 = r5.mFloatValues
            int r1 = r1.length
            if (r1 != r0) goto L47
            int r3 = r1 * 2
            float[] r3 = new float[r3]
        L3a:
            if (r2 >= r1) goto L45
            float[] r4 = r5.mFloatValues
            r4 = r4[r2]
            r3[r2] = r4
            int r2 = r2 + 1
            goto L3a
        L45:
            r5.mFloatValues = r3
        L47:
            float[] r1 = r5.mFloatValues
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r1[r0] = r2
        L4e:
            java.util.List<PropertyT extends android.util.Property> r0 = r5.mProperties
            r0.add(r6)
            return r6
        L54:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid Property type"
            r6.<init>(r0)
            throw r6
    }

    public abstract PropertyT createProperty(java.lang.String r1, int r2);

    public java.util.List<androidx.leanback.widget.ParallaxEffect> getEffects() {
            r1 = this;
            java.util.List<androidx.leanback.widget.ParallaxEffect> r0 = r1.mEffects
            return r0
    }

    public final float getFloatPropertyValue(int r2) {
            r1 = this;
            float[] r0 = r1.mFloatValues
            r2 = r0[r2]
            return r2
    }

    public final int getIntPropertyValue(int r2) {
            r1 = this;
            int[] r0 = r1.mValues
            r2 = r0[r2]
            return r2
    }

    public abstract float getMaxValue();

    public final java.util.List<PropertyT> getProperties() {
            r1 = this;
            java.util.List<PropertyT extends android.util.Property> r0 = r1.mPropertiesReadOnly
            return r0
    }

    public void removeAllEffects() {
            r1 = this;
            java.util.List<androidx.leanback.widget.ParallaxEffect> r0 = r1.mEffects
            r0.clear()
            return
    }

    public void removeEffect(androidx.leanback.widget.ParallaxEffect r2) {
            r1 = this;
            java.util.List<androidx.leanback.widget.ParallaxEffect> r0 = r1.mEffects
            r0.remove(r2)
            return
    }

    public final void setFloatPropertyValue(int r2, float r3) {
            r1 = this;
            java.util.List<PropertyT extends android.util.Property> r0 = r1.mProperties
            int r0 = r0.size()
            if (r2 >= r0) goto Ld
            float[] r0 = r1.mFloatValues
            r0[r2] = r3
            return
        Ld:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    public final void setIntPropertyValue(int r2, int r3) {
            r1 = this;
            java.util.List<PropertyT extends android.util.Property> r0 = r1.mProperties
            int r0 = r0.size()
            if (r2 >= r0) goto Ld
            int[] r0 = r1.mValues
            r0[r2] = r3
            return
        Ld:
            java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    @androidx.annotation.CallSuper
    public void updateValues() {
            r2 = this;
            r0 = 0
        L1:
            java.util.List<androidx.leanback.widget.ParallaxEffect> r1 = r2.mEffects
            int r1 = r1.size()
            if (r0 >= r1) goto L17
            java.util.List<androidx.leanback.widget.ParallaxEffect> r1 = r2.mEffects
            java.lang.Object r1 = r1.get(r0)
            androidx.leanback.widget.ParallaxEffect r1 = (androidx.leanback.widget.ParallaxEffect) r1
            r1.performMapping(r2)
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }

    public final void verifyFloatProperties() throws java.lang.IllegalStateException {
            r9 = this;
            java.util.List<PropertyT extends android.util.Property> r0 = r9.mProperties
            int r0 = r0.size()
            r1 = 2
            if (r0 >= r1) goto La
            return
        La:
            float[] r0 = r9.mFloatValues
            r2 = 0
            r0 = r0[r2]
            r3 = 1
            r4 = 1
        L11:
            java.util.List<PropertyT extends android.util.Property> r5 = r9.mProperties
            int r5 = r5.size()
            if (r4 >= r5) goto La5
            float[] r5 = r9.mFloatValues
            r5 = r5[r4]
            r6 = 3
            r7 = 4
            int r8 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r8 < 0) goto L6e
            r8 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 != 0) goto L6a
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L32
            goto L6a
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Object[] r5 = new java.lang.Object[r7]
            int r7 = r4 + (-1)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r5[r2] = r8
            java.util.List<PropertyT extends android.util.Property> r2 = r9.mProperties
            java.lang.Object r2 = r2.get(r7)
            android.util.Property r2 = (android.util.Property) r2
            java.lang.String r2 = r2.getName()
            r5[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r5[r1] = r2
            java.util.List<PropertyT extends android.util.Property> r1 = r9.mProperties
            java.lang.Object r1 = r1.get(r4)
            android.util.Property r1 = (android.util.Property) r1
            java.lang.String r1 = r1.getName()
            r5[r6] = r1
            java.lang.String r1 = "Parallax Property[%d]\"%s\" is UNKNOWN_BEFORE and Property[%d]\"%s\" is UNKNOWN_AFTER"
            java.lang.String r1 = java.lang.String.format(r1, r5)
            r0.<init>(r1)
            throw r0
        L6a:
            int r4 = r4 + 1
            r0 = r5
            goto L11
        L6e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r5[r2] = r7
            java.util.List<PropertyT extends android.util.Property> r2 = r9.mProperties
            java.lang.Object r2 = r2.get(r4)
            android.util.Property r2 = (android.util.Property) r2
            java.lang.String r2 = r2.getName()
            r5[r3] = r2
            int r4 = r4 - r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r5[r1] = r2
            java.util.List<PropertyT extends android.util.Property> r1 = r9.mProperties
            java.lang.Object r1 = r1.get(r4)
            android.util.Property r1 = (android.util.Property) r1
            java.lang.String r1 = r1.getName()
            r5[r6] = r1
            java.lang.String r1 = "Parallax Property[%d]\"%s\" is smaller than Property[%d]\"%s\""
            java.lang.String r1 = java.lang.String.format(r1, r5)
            r0.<init>(r1)
            throw r0
        La5:
            return
    }

    public final void verifyIntProperties() throws java.lang.IllegalStateException {
            r9 = this;
            java.util.List<PropertyT extends android.util.Property> r0 = r9.mProperties
            int r0 = r0.size()
            r1 = 2
            if (r0 >= r1) goto La
            return
        La:
            int[] r0 = r9.mValues
            r2 = 0
            r0 = r0[r2]
            r3 = 1
            r4 = 1
        L11:
            java.util.List<PropertyT extends android.util.Property> r5 = r9.mProperties
            int r5 = r5.size()
            if (r4 >= r5) goto L9e
            int[] r5 = r9.mValues
            r5 = r5[r4]
            r6 = 3
            r7 = 4
            if (r5 < r0) goto L67
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r8) goto L63
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r0) goto L2b
            goto L63
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Object[] r5 = new java.lang.Object[r7]
            int r7 = r4 + (-1)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r5[r2] = r8
            java.util.List<PropertyT extends android.util.Property> r2 = r9.mProperties
            java.lang.Object r2 = r2.get(r7)
            android.util.Property r2 = (android.util.Property) r2
            java.lang.String r2 = r2.getName()
            r5[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r5[r1] = r2
            java.util.List<PropertyT extends android.util.Property> r1 = r9.mProperties
            java.lang.Object r1 = r1.get(r4)
            android.util.Property r1 = (android.util.Property) r1
            java.lang.String r1 = r1.getName()
            r5[r6] = r1
            java.lang.String r1 = "Parallax Property[%d]\"%s\" is UNKNOWN_BEFORE and Property[%d]\"%s\" is UNKNOWN_AFTER"
            java.lang.String r1 = java.lang.String.format(r1, r5)
            r0.<init>(r1)
            throw r0
        L63:
            int r4 = r4 + 1
            r0 = r5
            goto L11
        L67:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Object[] r5 = new java.lang.Object[r7]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r5[r2] = r7
            java.util.List<PropertyT extends android.util.Property> r2 = r9.mProperties
            java.lang.Object r2 = r2.get(r4)
            android.util.Property r2 = (android.util.Property) r2
            java.lang.String r2 = r2.getName()
            r5[r3] = r2
            int r4 = r4 - r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r5[r1] = r2
            java.util.List<PropertyT extends android.util.Property> r1 = r9.mProperties
            java.lang.Object r1 = r1.get(r4)
            android.util.Property r1 = (android.util.Property) r1
            java.lang.String r1 = r1.getName()
            r5[r6] = r1
            java.lang.String r1 = "Parallax Property[%d]\"%s\" is smaller than Property[%d]\"%s\""
            java.lang.String r1 = java.lang.String.format(r1, r5)
            r0.<init>(r1)
            throw r0
        L9e:
            return
    }
}
