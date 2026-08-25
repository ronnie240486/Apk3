package androidx.constraintlayout.motion.utils;

/* JADX INFO: loaded from: classes2.dex */
public class CustomSupport {
    private static final java.lang.String TAG = "CustomSupport";

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.CustomSupport$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType = null;

        static {
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType[] r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.motion.utils.CustomSupport.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType = r0
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.motion.utils.CustomSupport.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.motion.utils.CustomSupport.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.motion.utils.CustomSupport.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.constraintlayout.motion.utils.CustomSupport.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.constraintlayout.motion.utils.CustomSupport.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.BOOLEAN_TYPE     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = androidx.constraintlayout.motion.utils.CustomSupport.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r1 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.DIMENSION_TYPE     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    public CustomSupport() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int clamp(int r1) {
            int r0 = r1 >> 31
            int r0 = ~r0
            r1 = r1 & r0
            int r1 = r1 + (-255)
            int r0 = r1 >> 31
            r1 = r1 & r0
            int r1 = r1 + 255
            return r1
    }

    public static void setInterpolatedValue(androidx.constraintlayout.widget.ConstraintAttribute r15, android.view.View r16, float[] r17) {
            r1 = r16
            java.lang.String r2 = "\""
            java.lang.String r3 = " on View \""
            java.lang.String r4 = "CustomSupport"
            java.lang.Class r0 = r16.getClass()
            java.lang.String r5 = "set"
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5)
            java.lang.String r6 = r15.getName()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            int[] r6 = androidx.constraintlayout.motion.utils.CustomSupport.AnonymousClass1.$SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r7 = r15.getType()     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            int r7 = r7.ordinal()     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r6 = r6[r7]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r7 = 3
            r8 = 2
            r9 = 4601859982876761367(0x3fdd1745d1745d17, double:0.45454545454545453)
            r11 = 1132396544(0x437f0000, float:255.0)
            r12 = 1
            r13 = 0
            switch(r6) {
                case 1: goto L160;
                case 2: goto L146;
                case 3: goto Le8;
                case 4: goto L90;
                case 5: goto L74;
                case 6: goto L53;
                case 7: goto L3a;
                default: goto L38;
            }     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
        L38:
            goto L1b7
        L3a:
            java.lang.Class[] r6 = new java.lang.Class[r12]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.Class r7 = java.lang.Float.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r6[r13] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r7 = r17[r13]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r6[r13] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r0.invoke(r1, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            goto L1b7
        L53:
            java.lang.Class[] r6 = new java.lang.Class[r12]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r6[r13] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.Object[] r6 = new java.lang.Object[r12]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r7 = r17[r13]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r8 = 1056964608(0x3f000000, float:0.5)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L68
            goto L69
        L68:
            r12 = 0
        L69:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r12)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r6[r13] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r0.invoke(r1, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            goto L1b7
        L74:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r6.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.String r7 = "unable to interpolate strings "
            r6.append(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.String r7 = r15.getName()     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r6.append(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r0.<init>(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            throw r0     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
        L90:
            java.lang.Class[] r6 = new java.lang.Class[r12]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r6[r13] = r14     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r6 = r17[r13]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            double r13 = (double) r6     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            double r13 = java.lang.Math.pow(r13, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            float r6 = (float) r13     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            float r6 = r6 * r11
            int r6 = (int) r6     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            int r6 = clamp(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r12 = r17[r12]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            double r12 = (double) r12     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            double r12 = java.lang.Math.pow(r12, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            float r12 = (float) r12     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            float r12 = r12 * r11
            int r12 = (int) r12     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            int r12 = clamp(r12)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r8 = r17[r8]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            double r13 = (double) r8     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            double r8 = java.lang.Math.pow(r13, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            float r8 = (float) r8     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            float r8 = r8 * r11
            int r8 = (int) r8     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            int r8 = clamp(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r7 = r17[r7]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            float r7 = r7 * r11
            int r7 = (int) r7     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            int r7 = clamp(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            int r7 = r7 << 24
            int r6 = r6 << 16
            r6 = r6 | r7
            int r7 = r12 << 8
            r6 = r6 | r7
            r6 = r6 | r8
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r8 = 0
            r7[r8] = r6     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r0.invoke(r1, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            goto L1b7
        Le8:
            r6 = 1
            java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.Class<android.graphics.drawable.Drawable> r12 = android.graphics.drawable.Drawable.class
            r13 = 0
            r6[r13] = r12     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r6 = r17[r13]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            double r12 = (double) r6     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            double r12 = java.lang.Math.pow(r12, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            float r6 = (float) r12     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            float r6 = r6 * r11
            int r6 = (int) r6     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            int r6 = clamp(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r12 = 1
            r12 = r17[r12]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            double r12 = (double) r12     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            double r12 = java.lang.Math.pow(r12, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            float r12 = (float) r12     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            float r12 = r12 * r11
            int r12 = (int) r12     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            int r12 = clamp(r12)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r8 = r17[r8]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            double r13 = (double) r8     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            double r8 = java.lang.Math.pow(r13, r9)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            float r8 = (float) r8     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            float r8 = r8 * r11
            int r8 = (int) r8     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            int r8 = clamp(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r7 = r17[r7]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            float r7 = r7 * r11
            int r7 = (int) r7     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            int r7 = clamp(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            int r7 = r7 << 24
            int r6 = r6 << 16
            r6 = r6 | r7
            int r7 = r12 << 8
            r6 = r6 | r7
            r6 = r6 | r8
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r7.<init>()     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r7.setColor(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r8 = 0
            r6[r8] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r0.invoke(r1, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            goto L1b7
        L146:
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.Class r8 = java.lang.Float.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r9 = 0
            r7[r9] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.reflect.Method r0 = r0.getMethod(r5, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r7 = r17[r9]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r6[r9] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r0.invoke(r1, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            goto L1b7
        L160:
            r6 = 1
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r9 = 0
            r7[r9] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.reflect.Method r0 = r0.getMethod(r5, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r7 = r17[r9]     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            int r7 = (int) r7     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r6[r9] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            r0.invoke(r1, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L17b java.lang.IllegalAccessException -> L180 java.lang.NoSuchMethodException -> L19c
            goto L1b7
        L17b:
            r0 = move-exception
            r0.printStackTrace()
            goto L1b7
        L180:
            r0 = move-exception
            java.lang.String r6 = "cannot access method "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m25m(r6, r5, r3)
            java.lang.String r1 = androidx.constraintlayout.motion.widget.Debug.getName(r16)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            android.util.Log.e(r4, r1)
            r0.printStackTrace()
            goto L1b7
        L19c:
            r0 = move-exception
            java.lang.String r6 = "no method "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m25m(r6, r5, r3)
            java.lang.String r1 = androidx.constraintlayout.motion.widget.Debug.getName(r16)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            android.util.Log.e(r4, r1)
            r0.printStackTrace()
        L1b7:
            return
    }
}
