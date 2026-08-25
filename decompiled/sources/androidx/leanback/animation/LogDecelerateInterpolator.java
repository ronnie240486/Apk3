package androidx.leanback.animation;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class LogDecelerateInterpolator implements android.animation.TimeInterpolator {
    public int mBase;
    public int mDrift;
    public final float mLogScale;

    public LogDecelerateInterpolator(int r5, int r6) {
            r4 = this;
            r4.<init>()
            r4.mBase = r5
            r4.mDrift = r6
            double r0 = (double) r5
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            double r2 = (double) r5
            double r0 = java.lang.Math.pow(r0, r2)
            double r0 = -r0
            float r5 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r0
            float r6 = (float) r6
            float r6 = r6 * r0
            float r6 = r6 + r5
            float r0 = r0 / r6
            r4.mLogScale = r0
            return
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float r7) {
            r6 = this;
            int r0 = r6.mBase
            int r1 = r6.mDrift
            double r2 = (double) r0
            float r0 = -r7
            double r4 = (double) r0
            double r2 = java.lang.Math.pow(r2, r4)
            double r2 = -r2
            float r0 = (float) r2
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 + r2
            float r1 = (float) r1
            float r1 = r1 * r7
            float r1 = r1 + r0
            float r7 = r6.mLogScale
            float r1 = r1 * r7
            return r1
    }
}
