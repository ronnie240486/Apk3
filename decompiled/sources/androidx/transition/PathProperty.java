package androidx.transition;

/* JADX INFO: loaded from: classes2.dex */
class PathProperty<T> extends android.util.Property<T, java.lang.Float> {
    private float mCurrentFraction;
    private final float mPathLength;
    private final android.graphics.PathMeasure mPathMeasure;
    private final android.graphics.PointF mPointF;
    private final float[] mPosition;
    private final android.util.Property<T, android.graphics.PointF> mProperty;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.util.Property
    public java.lang.Float get(T r1) {
            r0 = this;
            float r1 = r0.mCurrentFraction
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ java.lang.Float get(java.lang.Object r1) {
            r0 = this;
            java.lang.Float r1 = r0.get(r1)
            return r1
    }

    /* JADX INFO: renamed from: set, reason: avoid collision after fix types in other method */
    public void set2(T r4, java.lang.Float r5) {
            r3 = this;
            float r0 = r5.floatValue()
            r3.mCurrentFraction = r0
            android.graphics.PathMeasure r0 = r3.mPathMeasure
            float r1 = r3.mPathLength
            float r5 = r5.floatValue()
            float r5 = r5 * r1
            float[] r1 = r3.mPosition
            r2 = 0
            r0.getPosTan(r5, r1, r2)
            android.graphics.PointF r5 = r3.mPointF
            float[] r0 = r3.mPosition
            r1 = 0
            r1 = r0[r1]
            r5.x = r1
            r1 = 1
            r0 = r0[r1]
            r5.y = r0
            android.util.Property<T, android.graphics.PointF> r0 = r3.mProperty
            r0.set(r4, r5)
            return
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(java.lang.Object r1, java.lang.Float r2) {
            r0 = this;
            java.lang.Float r2 = (java.lang.Float) r2
            r0.set2(r1, r2)
            return
    }
}
