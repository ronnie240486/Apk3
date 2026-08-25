package androidx.constraintlayout.motion.utils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ViewOscillator extends androidx.constraintlayout.core.motion.utils.KeyCycleOscillator {
    private static final java.lang.String TAG = "ViewOscillator";

    /* JADX INFO: loaded from: classes3.dex */
    public static class AlphaSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        public AlphaSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setAlpha(r2)
                return
        }
    }

    public static class CustomSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        public androidx.constraintlayout.widget.ConstraintAttribute mCustom;
        public float[] value;

        public CustomSet() {
                r1 = this;
                r1.<init>()
                r0 = 1
                float[] r0 = new float[r0]
                r1.value = r0
                return
        }

        @Override // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        public final void setCustom(java.lang.Object r1) {
                r0 = this;
                androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
                r0.mCustom = r1
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r3, float r4) {
                r2 = this;
                float[] r0 = r2.value
                float r4 = r2.get(r4)
                r1 = 0
                r0[r1] = r4
                androidx.constraintlayout.widget.ConstraintAttribute r4 = r2.mCustom
                float[] r0 = r2.value
                androidx.constraintlayout.motion.utils.CustomSupport.setInterpolatedValue(r4, r3, r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class ElevationSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        public ElevationSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setElevation(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class PathRotateSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        public PathRotateSet() {
                r0 = this;
                r0.<init>()
                return
        }

        public void setPathRotate(android.view.View r1, float r2, double r3, double r5) {
                r0 = this;
                float r2 = r0.get(r2)
                double r3 = java.lang.Math.atan2(r5, r3)
                double r3 = java.lang.Math.toDegrees(r3)
                float r3 = (float) r3
                float r2 = r2 + r3
                r1.setRotation(r2)
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                return
        }
    }

    public static class ProgressSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        public boolean mNoMethod;

        public ProgressSet() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mNoMethod = r0
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r10, float r11) {
                r9 = this;
                java.lang.String r0 = "unable to setProgress"
                java.lang.String r1 = "ViewOscillator"
                boolean r2 = r10 instanceof androidx.constraintlayout.motion.widget.MotionLayout
                if (r2 == 0) goto L13
                androidx.constraintlayout.motion.widget.MotionLayout r10 = (androidx.constraintlayout.motion.widget.MotionLayout) r10
                float r11 = r9.get(r11)
                r10.setProgress(r11)
                goto L4a
            L13:
                boolean r2 = r9.mNoMethod
                if (r2 == 0) goto L18
                return
            L18:
                r2 = 0
                r3 = 0
                r4 = 1
                java.lang.Class r5 = r10.getClass()     // Catch: java.lang.NoSuchMethodException -> L2d
                java.lang.String r6 = "setProgress"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.NoSuchMethodException -> L2d
                java.lang.Class r8 = java.lang.Float.TYPE     // Catch: java.lang.NoSuchMethodException -> L2d
                r7[r3] = r8     // Catch: java.lang.NoSuchMethodException -> L2d
                java.lang.reflect.Method r2 = r5.getMethod(r6, r7)     // Catch: java.lang.NoSuchMethodException -> L2d
                goto L2f
            L2d:
                r9.mNoMethod = r4
            L2f:
                if (r2 == 0) goto L4a
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                float r11 = r9.get(r11)     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                java.lang.Float r11 = java.lang.Float.valueOf(r11)     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                r4[r3] = r11     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                r2.invoke(r10, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                goto L4a
            L41:
                r10 = move-exception
                android.util.Log.e(r1, r0, r10)
                goto L4a
            L46:
                r10 = move-exception
                android.util.Log.e(r1, r0, r10)
            L4a:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class RotationSet extends androidx.constraintlayout.motion.utils.ViewOscillator {
        public RotationSet() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setRotation(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class RotationXset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        public RotationXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setRotationX(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class RotationYset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        public RotationYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setRotationY(r2)
                return
        }
    }

    public static class ScaleXset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        public ScaleXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setScaleX(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class ScaleYset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        public ScaleYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setScaleY(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class TranslationXset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        public TranslationXset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setTranslationX(r2)
                return
        }
    }

    public static class TranslationYset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        public TranslationYset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setTranslationY(r2)
                return
        }
    }

    public static class TranslationZset extends androidx.constraintlayout.motion.utils.ViewOscillator {
        public TranslationZset() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.constraintlayout.motion.utils.ViewOscillator
        public void setProperty(android.view.View r1, float r2) {
                r0 = this;
                float r2 = r0.get(r2)
                r1.setTranslationZ(r2)
                return
        }
    }

    public ViewOscillator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.constraintlayout.motion.utils.ViewOscillator makeSpline(java.lang.String r2) {
            java.lang.String r0 = "CUSTOM"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto Le
            androidx.constraintlayout.motion.utils.ViewOscillator$CustomSet r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$CustomSet
            r2.<init>()
            return r2
        Le:
            r0 = -1
            int r1 = r2.hashCode()
            switch(r1) {
                case -1249320806: goto Lc4;
                case -1249320805: goto Lb8;
                case -1225497657: goto Lac;
                case -1225497656: goto La0;
                case -1225497655: goto L94;
                case -1001078227: goto L88;
                case -908189618: goto L7c;
                case -908189617: goto L70;
                case -797520672: goto L61;
                case -40300674: goto L52;
                case -4379043: goto L44;
                case 37232917: goto L35;
                case 92909918: goto L27;
                case 156108012: goto L18;
                default: goto L16;
            }
        L16:
            goto Lcf
        L18:
            java.lang.String r1 = "waveOffset"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L23
            goto Lcf
        L23:
            r0 = 13
            goto Lcf
        L27:
            java.lang.String r1 = "alpha"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L31
            goto Lcf
        L31:
            r0 = 12
            goto Lcf
        L35:
            java.lang.String r1 = "transitionPathRotate"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L40
            goto Lcf
        L40:
            r0 = 11
            goto Lcf
        L44:
            java.lang.String r1 = "elevation"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L4e
            goto Lcf
        L4e:
            r0 = 10
            goto Lcf
        L52:
            java.lang.String r1 = "rotation"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L5d
            goto Lcf
        L5d:
            r0 = 9
            goto Lcf
        L61:
            java.lang.String r1 = "waveVariesBy"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L6c
            goto Lcf
        L6c:
            r0 = 8
            goto Lcf
        L70:
            java.lang.String r1 = "scaleY"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L7a
            goto Lcf
        L7a:
            r0 = 7
            goto Lcf
        L7c:
            java.lang.String r1 = "scaleX"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L86
            goto Lcf
        L86:
            r0 = 6
            goto Lcf
        L88:
            java.lang.String r1 = "progress"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L92
            goto Lcf
        L92:
            r0 = 5
            goto Lcf
        L94:
            java.lang.String r1 = "translationZ"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L9e
            goto Lcf
        L9e:
            r0 = 4
            goto Lcf
        La0:
            java.lang.String r1 = "translationY"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Laa
            goto Lcf
        Laa:
            r0 = 3
            goto Lcf
        Lac:
            java.lang.String r1 = "translationX"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Lb6
            goto Lcf
        Lb6:
            r0 = 2
            goto Lcf
        Lb8:
            java.lang.String r1 = "rotationY"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Lc2
            goto Lcf
        Lc2:
            r0 = 1
            goto Lcf
        Lc4:
            java.lang.String r1 = "rotationX"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto Lce
            goto Lcf
        Lce:
            r0 = 0
        Lcf:
            switch(r0) {
                case 0: goto L122;
                case 1: goto L11c;
                case 2: goto L116;
                case 3: goto L110;
                case 4: goto L10a;
                case 5: goto L104;
                case 6: goto Lfe;
                case 7: goto Lf8;
                case 8: goto Lf2;
                case 9: goto Lec;
                case 10: goto Le6;
                case 11: goto Le0;
                case 12: goto Lda;
                case 13: goto Ld4;
                default: goto Ld2;
            }
        Ld2:
            r2 = 0
            return r2
        Ld4:
            androidx.constraintlayout.motion.utils.ViewOscillator$AlphaSet r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$AlphaSet
            r2.<init>()
            return r2
        Lda:
            androidx.constraintlayout.motion.utils.ViewOscillator$AlphaSet r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$AlphaSet
            r2.<init>()
            return r2
        Le0:
            androidx.constraintlayout.motion.utils.ViewOscillator$PathRotateSet r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$PathRotateSet
            r2.<init>()
            return r2
        Le6:
            androidx.constraintlayout.motion.utils.ViewOscillator$ElevationSet r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$ElevationSet
            r2.<init>()
            return r2
        Lec:
            androidx.constraintlayout.motion.utils.ViewOscillator$RotationSet r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$RotationSet
            r2.<init>()
            return r2
        Lf2:
            androidx.constraintlayout.motion.utils.ViewOscillator$AlphaSet r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$AlphaSet
            r2.<init>()
            return r2
        Lf8:
            androidx.constraintlayout.motion.utils.ViewOscillator$ScaleYset r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$ScaleYset
            r2.<init>()
            return r2
        Lfe:
            androidx.constraintlayout.motion.utils.ViewOscillator$ScaleXset r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$ScaleXset
            r2.<init>()
            return r2
        L104:
            androidx.constraintlayout.motion.utils.ViewOscillator$ProgressSet r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$ProgressSet
            r2.<init>()
            return r2
        L10a:
            androidx.constraintlayout.motion.utils.ViewOscillator$TranslationZset r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$TranslationZset
            r2.<init>()
            return r2
        L110:
            androidx.constraintlayout.motion.utils.ViewOscillator$TranslationYset r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$TranslationYset
            r2.<init>()
            return r2
        L116:
            androidx.constraintlayout.motion.utils.ViewOscillator$TranslationXset r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$TranslationXset
            r2.<init>()
            return r2
        L11c:
            androidx.constraintlayout.motion.utils.ViewOscillator$RotationYset r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$RotationYset
            r2.<init>()
            return r2
        L122:
            androidx.constraintlayout.motion.utils.ViewOscillator$RotationXset r2 = new androidx.constraintlayout.motion.utils.ViewOscillator$RotationXset
            r2.<init>()
            return r2
    }

    public abstract void setProperty(android.view.View r1, float r2);
}
