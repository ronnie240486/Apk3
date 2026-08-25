package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ParallaxTarget {

    /* JADX INFO: loaded from: classes.dex */
    public static final class DirectPropertyTarget<T, V extends java.lang.Number> extends androidx.leanback.widget.ParallaxTarget {
        public java.lang.Object mObject;
        public android.util.Property<T, V> mProperty;

        public DirectPropertyTarget(java.lang.Object r1, android.util.Property<T, V> r2) {
                r0 = this;
                r0.<init>()
                r0.mObject = r1
                r0.mProperty = r2
                return
        }

        @Override // androidx.leanback.widget.ParallaxTarget
        public void directUpdate(java.lang.Number r3) {
                r2 = this;
                android.util.Property<T, V extends java.lang.Number> r0 = r2.mProperty
                java.lang.Object r1 = r2.mObject
                r0.set(r1, r3)
                return
        }

        @Override // androidx.leanback.widget.ParallaxTarget
        public boolean isDirectMapping() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class PropertyValuesHolderTarget extends androidx.leanback.widget.ParallaxTarget {
        private static final long PSEUDO_DURATION = 1000000;
        private final android.animation.ObjectAnimator mAnimator;
        private float mFraction;

        public PropertyValuesHolderTarget(java.lang.Object r3, android.animation.PropertyValuesHolder r4) {
                r2 = this;
                r2.<init>()
                r0 = 1
                android.animation.PropertyValuesHolder[] r0 = new android.animation.PropertyValuesHolder[r0]
                r1 = 0
                r0[r1] = r4
                android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r3, r0)
                r2.mAnimator = r3
                android.view.animation.LinearInterpolator r4 = new android.view.animation.LinearInterpolator
                r4.<init>()
                r3.setInterpolator(r4)
                r0 = 1000000(0xf4240, double:4.940656E-318)
                r3.setDuration(r0)
                return
        }

        @Override // androidx.leanback.widget.ParallaxTarget
        public void update(float r4) {
                r3 = this;
                r3.mFraction = r4
                android.animation.ObjectAnimator r0 = r3.mAnimator
                r1 = 1232348160(0x49742400, float:1000000.0)
                float r4 = r4 * r1
                long r1 = (long) r4
                r0.setCurrentPlayTime(r1)
                return
        }
    }

    public ParallaxTarget() {
            r0 = this;
            r0.<init>()
            return
    }

    public void directUpdate(java.lang.Number r1) {
            r0 = this;
            return
    }

    public boolean isDirectMapping() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void update(float r1) {
            r0 = this;
            return
    }
}
