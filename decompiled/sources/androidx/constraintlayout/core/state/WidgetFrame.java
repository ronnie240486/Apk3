package androidx.constraintlayout.core.state;

/* JADX INFO: loaded from: classes.dex */
public class WidgetFrame {
    private static final boolean OLD_SYSTEM = true;
    public static float phone_orientation = Float.NaN;
    public float alpha;
    public int bottom;
    public float interpolatedPos;
    public int left;
    public final java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> mCustom;
    public java.lang.String name;
    public float pivotX;
    public float pivotY;
    public int right;
    public float rotationX;
    public float rotationY;
    public float rotationZ;
    public float scaleX;
    public float scaleY;
    public int top;
    public float translationX;
    public float translationY;
    public float translationZ;
    public int visibility;
    public androidx.constraintlayout.core.widgets.ConstraintWidget widget;

    public WidgetFrame() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.widget = r0
            r1 = 0
            r3.left = r1
            r3.top = r1
            r3.right = r1
            r3.bottom = r1
            r2 = 2143289344(0x7fc00000, float:NaN)
            r3.pivotX = r2
            r3.pivotY = r2
            r3.rotationX = r2
            r3.rotationY = r2
            r3.rotationZ = r2
            r3.translationX = r2
            r3.translationY = r2
            r3.translationZ = r2
            r3.scaleX = r2
            r3.scaleY = r2
            r3.alpha = r2
            r3.interpolatedPos = r2
            r3.visibility = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.mCustom = r1
            r3.name = r0
            return
    }

    public WidgetFrame(androidx.constraintlayout.core.state.WidgetFrame r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.widget = r0
            r1 = 0
            r3.left = r1
            r3.top = r1
            r3.right = r1
            r3.bottom = r1
            r2 = 2143289344(0x7fc00000, float:NaN)
            r3.pivotX = r2
            r3.pivotY = r2
            r3.rotationX = r2
            r3.rotationY = r2
            r3.rotationZ = r2
            r3.translationX = r2
            r3.translationY = r2
            r3.translationZ = r2
            r3.scaleX = r2
            r3.scaleY = r2
            r3.alpha = r2
            r3.interpolatedPos = r2
            r3.visibility = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.mCustom = r1
            r3.name = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r4.widget
            r3.widget = r0
            int r0 = r4.left
            r3.left = r0
            int r0 = r4.top
            r3.top = r0
            int r0 = r4.right
            r3.right = r0
            int r0 = r4.bottom
            r3.bottom = r0
            r3.updateAttributes(r4)
            return
    }

    public WidgetFrame(androidx.constraintlayout.core.widgets.ConstraintWidget r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.widget = r0
            r1 = 0
            r3.left = r1
            r3.top = r1
            r3.right = r1
            r3.bottom = r1
            r2 = 2143289344(0x7fc00000, float:NaN)
            r3.pivotX = r2
            r3.pivotY = r2
            r3.rotationX = r2
            r3.rotationY = r2
            r3.rotationZ = r2
            r3.translationX = r2
            r3.translationY = r2
            r3.translationZ = r2
            r3.scaleX = r2
            r3.scaleY = r2
            r3.alpha = r2
            r3.interpolatedPos = r2
            r3.visibility = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.mCustom = r1
            r3.name = r0
            r3.widget = r4
            return
    }

    private static void add(java.lang.StringBuilder r1, java.lang.String r2, float r3) {
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 == 0) goto L7
            return
        L7:
            r1.append(r2)
            java.lang.String r2 = ": "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ",\n"
            r1.append(r2)
            return
    }

    private static void add(java.lang.StringBuilder r0, java.lang.String r1, int r2) {
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ",\n"
            r0.append(r1)
            return
    }

    private static float interpolate(float r2, float r3, float r4, float r5) {
            boolean r0 = java.lang.Float.isNaN(r2)
            boolean r1 = java.lang.Float.isNaN(r3)
            if (r0 == 0) goto Lf
            if (r1 == 0) goto Lf
            r2 = 2143289344(0x7fc00000, float:NaN)
            return r2
        Lf:
            if (r0 == 0) goto L12
            r2 = r4
        L12:
            if (r1 == 0) goto L15
            r3 = r4
        L15:
            float r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3, r2, r5, r2)
            return r2
    }

    public static void interpolate(int r21, int r22, androidx.constraintlayout.core.state.WidgetFrame r23, androidx.constraintlayout.core.state.WidgetFrame r24, androidx.constraintlayout.core.state.WidgetFrame r25, androidx.constraintlayout.core.state.Transition r26, float r27) {
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 * r6
            int r8 = (int) r7
            int r9 = r3.left
            int r10 = r3.top
            int r11 = r4.left
            int r12 = r4.top
            int r13 = r3.right
            int r13 = r13 - r9
            int r14 = r3.bottom
            int r14 = r14 - r10
            int r15 = r4.right
            int r15 = r15 - r11
            r16 = r13
            int r13 = r4.bottom
            int r13 = r13 - r12
            r17 = r14
            float r14 = r3.alpha
            float r6 = r4.alpha
            r18 = r7
            int r7 = r3.visibility
            r1 = 8
            r19 = 1073741824(0x40000000, float:2.0)
            if (r7 != r1) goto L55
            float r7 = (float) r9
            float r9 = (float) r15
            float r9 = r9 / r19
            float r7 = r7 - r9
            int r9 = (int) r7
            float r7 = (float) r10
            float r10 = (float) r13
            float r10 = r10 / r19
            float r7 = r7 - r10
            int r10 = (int) r7
            boolean r7 = java.lang.Float.isNaN(r14)
            if (r7 == 0) goto L50
            r14 = r13
            r7 = r15
            r16 = 0
            goto L5b
        L50:
            r16 = r14
            r7 = r15
            r14 = r13
            goto L5b
        L55:
            r7 = r16
            r16 = r14
            r14 = r17
        L5b:
            int r0 = r4.visibility
            if (r0 != r1) goto L74
            float r0 = (float) r11
            float r1 = (float) r7
            float r1 = r1 / r19
            float r0 = r0 - r1
            int r11 = (int) r0
            float r0 = (float) r12
            float r1 = (float) r14
            float r1 = r1 / r19
            float r0 = r0 - r1
            int r12 = (int) r0
            boolean r0 = java.lang.Float.isNaN(r6)
            r15 = r7
            r13 = r14
            if (r0 == 0) goto L74
            r6 = 0
        L74:
            boolean r0 = java.lang.Float.isNaN(r16)
            if (r0 == 0) goto L82
            boolean r0 = java.lang.Float.isNaN(r6)
            if (r0 != 0) goto L82
            r16 = 1065353216(0x3f800000, float:1.0)
        L82:
            boolean r0 = java.lang.Float.isNaN(r16)
            if (r0 != 0) goto L90
            boolean r0 = java.lang.Float.isNaN(r6)
            if (r0 == 0) goto L90
            r6 = 1065353216(0x3f800000, float:1.0)
        L90:
            int r0 = r3.visibility
            r1 = 4
            if (r0 != r1) goto L99
            r16 = r6
            r0 = 0
            goto L9d
        L99:
            r0 = r16
            r16 = r6
        L9d:
            int r6 = r4.visibility
            if (r6 != r1) goto La3
            r6 = 0
            goto La5
        La3:
            r6 = r16
        La5:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r2.widget
            r16 = 0
            if (r1 == 0) goto L103
            boolean r1 = r26.hasPositionKeyframes()
            if (r1 == 0) goto L103
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r2.widget
            java.lang.String r1 = r1.stringId
            androidx.constraintlayout.core.state.Transition$KeyPosition r1 = r5.findPreviousPosition(r1, r8)
            r20 = r9
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r2.widget
            java.lang.String r9 = r9.stringId
            androidx.constraintlayout.core.state.Transition$KeyPosition r5 = r5.findNextPosition(r9, r8)
            if (r1 != r5) goto Lc6
            r5 = 0
        Lc6:
            if (r1 == 0) goto Le1
            float r9 = r1.x
            r10 = r21
            float r8 = (float) r10
            float r9 = r9 * r8
            int r8 = (int) r9
            float r9 = r1.y
            r20 = r8
            r8 = r22
            float r10 = (float) r8
            float r9 = r9 * r10
            int r9 = (int) r9
            int r1 = r1.frame
            r10 = r9
            r9 = r1
            r1 = r21
            goto Le6
        Le1:
            r1 = r21
            r8 = r22
            r9 = 0
        Le6:
            if (r5 == 0) goto Lfa
            float r11 = r5.x
            float r1 = (float) r1
            float r11 = r11 * r1
            int r1 = (int) r11
            float r11 = r5.y
            float r8 = (float) r8
            float r11 = r11 * r8
            int r8 = (int) r11
            int r5 = r5.frame
            r11 = r1
            r12 = r8
            r8 = r5
            goto Lfc
        Lfa:
            r8 = 100
        Lfc:
            float r1 = (float) r9
            float r1 = r18 - r1
            int r8 = r8 - r9
            float r5 = (float) r8
            float r1 = r1 / r5
            goto L107
        L103:
            r20 = r9
            r1 = r27
        L107:
            r9 = r20
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r3.widget
            r2.widget = r5
            float r5 = (float) r9
            int r11 = r11 - r9
            float r8 = (float) r11
            float r8 = r8 * r1
            float r8 = r8 + r5
            int r5 = (int) r8
            r2.left = r5
            float r8 = (float) r10
            int r12 = r12 - r10
            float r9 = (float) r12
            float r1 = r1 * r9
            float r1 = r1 + r8
            int r1 = (int) r1
            r2.top = r1
            r8 = r27
            r9 = 1065353216(0x3f800000, float:1.0)
            float r10 = r9 - r8
            float r7 = (float) r7
            float r7 = r7 * r10
            float r9 = (float) r15
            float r9 = r9 * r8
            float r9 = r9 + r7
            int r7 = (int) r9
            float r9 = (float) r14
            float r10 = r10 * r9
            float r9 = (float) r13
            float r9 = r9 * r8
            float r9 = r9 + r10
            int r9 = (int) r9
            int r5 = r5 + r7
            r2.right = r5
            int r1 = r1 + r9
            r2.bottom = r1
            float r1 = r3.pivotX
            float r5 = r4.pivotX
            r7 = 1056964608(0x3f000000, float:0.5)
            float r1 = interpolate(r1, r5, r7, r8)
            r2.pivotX = r1
            float r1 = r3.pivotY
            float r5 = r4.pivotY
            float r1 = interpolate(r1, r5, r7, r8)
            r2.pivotY = r1
            float r1 = r3.rotationX
            float r5 = r4.rotationX
            r7 = 0
            float r1 = interpolate(r1, r5, r7, r8)
            r2.rotationX = r1
            float r1 = r3.rotationY
            float r5 = r4.rotationY
            float r1 = interpolate(r1, r5, r7, r8)
            r2.rotationY = r1
            float r1 = r3.rotationZ
            float r5 = r4.rotationZ
            float r1 = interpolate(r1, r5, r7, r8)
            r2.rotationZ = r1
            float r1 = r3.scaleX
            float r5 = r4.scaleX
            r7 = 1065353216(0x3f800000, float:1.0)
            float r1 = interpolate(r1, r5, r7, r8)
            r2.scaleX = r1
            float r1 = r3.scaleY
            float r5 = r4.scaleY
            float r1 = interpolate(r1, r5, r7, r8)
            r2.scaleY = r1
            float r1 = r3.translationX
            float r5 = r4.translationX
            r7 = 0
            float r1 = interpolate(r1, r5, r7, r8)
            r2.translationX = r1
            float r1 = r3.translationY
            float r5 = r4.translationY
            float r1 = interpolate(r1, r5, r7, r8)
            r2.translationY = r1
            float r1 = r3.translationZ
            float r5 = r4.translationZ
            float r1 = interpolate(r1, r5, r7, r8)
            r2.translationZ = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = interpolate(r0, r6, r1, r8)
            r2.alpha = r0
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r4.mCustom
            java.util.Set r0 = r0.keySet()
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r1 = r2.mCustom
            r1.clear()
            java.util.Iterator r0 = r0.iterator()
        L1bc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r5 = r3.mCustom
            boolean r5 = r5.containsKey(r1)
            if (r5 == 0) goto L228
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r5 = r3.mCustom
            java.lang.Object r5 = r5.get(r1)
            androidx.constraintlayout.core.motion.CustomVariable r5 = (androidx.constraintlayout.core.motion.CustomVariable) r5
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r6 = r4.mCustom
            java.lang.Object r6 = r6.get(r1)
            androidx.constraintlayout.core.motion.CustomVariable r6 = (androidx.constraintlayout.core.motion.CustomVariable) r6
            androidx.constraintlayout.core.motion.CustomVariable r7 = new androidx.constraintlayout.core.motion.CustomVariable
            r7.<init>(r5)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r9 = r2.mCustom
            r9.put(r1, r7)
            int r1 = r5.numberOfInterpolatedValues()
            r9 = 1
            if (r1 != r9) goto L206
            float r1 = r5.getValueToInterpolate()
            float r5 = r6.getValueToInterpolate()
            r6 = 0
            float r1 = interpolate(r1, r5, r6, r8)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r7.setValue(r1)
            goto L228
        L206:
            int r1 = r5.numberOfInterpolatedValues()
            float[] r9 = new float[r1]
            float[] r10 = new float[r1]
            r5.getValuesToInterpolate(r9)
            r6.getValuesToInterpolate(r10)
            r5 = 0
        L215:
            if (r5 >= r1) goto L228
            r6 = r9[r5]
            r11 = r10[r5]
            r12 = 0
            float r6 = interpolate(r6, r11, r12, r8)
            r9[r5] = r6
            r7.setValue(r9)
            int r5 = r5 + 1
            goto L215
        L228:
            r12 = 0
            goto L1bc
        L22a:
            return
    }

    private void serializeAnchor(java.lang.StringBuilder r3, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r4) {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.widget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.getAnchor(r4)
            if (r0 == 0) goto L4c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 != 0) goto Ld
            goto L4c
        Ld:
            java.lang.String r1 = "Anchor"
            r3.append(r1)
            java.lang.String r4 = r4.name()
            r3.append(r4)
            java.lang.String r4 = ": ['"
            r3.append(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r4.getOwner()
            java.lang.String r4 = r4.stringId
            if (r4 != 0) goto L2a
            java.lang.String r4 = "#PARENT"
        L2a:
            r3.append(r4)
            java.lang.String r4 = "', '"
            r3.append(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = r1.getType()
            java.lang.String r1 = r1.name()
            r3.append(r1)
            r3.append(r4)
            int r4 = r0.mMargin
            r3.append(r4)
            java.lang.String r4 = "'],\n"
            r3.append(r4)
        L4c:
            return
    }

    public void addCustomColor(java.lang.String r2, int r3) {
            r1 = this;
            r0 = 902(0x386, float:1.264E-42)
            r1.setCustomAttribute(r2, r0, r3)
            return
    }

    public void addCustomFloat(java.lang.String r2, float r3) {
            r1 = this;
            r0 = 901(0x385, float:1.263E-42)
            r1.setCustomAttribute(r2, r0, r3)
            return
    }

    public float centerX() {
            r3 = this;
            int r0 = r3.left
            float r1 = (float) r0
            int r2 = r3.right
            int r2 = r2 - r0
            float r0 = (float) r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r0 = r0 + r1
            return r0
    }

    public float centerY() {
            r3 = this;
            int r0 = r3.top
            float r1 = (float) r0
            int r2 = r3.bottom
            int r2 = r2 - r0
            float r0 = (float) r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r2
            float r0 = r0 + r1
            return r0
    }

    public androidx.constraintlayout.core.motion.CustomVariable getCustomAttribute(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r1.mCustom
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.motion.CustomVariable r2 = (androidx.constraintlayout.core.motion.CustomVariable) r2
            return r2
    }

    public java.util.Set<java.lang.String> getCustomAttributeNames() {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r1.mCustom
            java.util.Set r0 = r0.keySet()
            return r0
    }

    public int getCustomColor(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r1.mCustom
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L15
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r1.mCustom
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.motion.CustomVariable r2 = (androidx.constraintlayout.core.motion.CustomVariable) r2
            int r2 = r2.getColorValue()
            return r2
        L15:
            r2 = -21880(0xffffffffffffaa88, float:NaN)
            return r2
    }

    public float getCustomFloat(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r1.mCustom
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L15
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r1.mCustom
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.motion.CustomVariable r2 = (androidx.constraintlayout.core.motion.CustomVariable) r2
            float r2 = r2.getFloatValue()
            return r2
        L15:
            r2 = 2143289344(0x7fc00000, float:NaN)
            return r2
    }

    public java.lang.String getId() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.widget
            if (r0 != 0) goto L8
            java.lang.String r0 = "unknown"
            return r0
        L8:
            java.lang.String r0 = r0.stringId
            return r0
    }

    public int height() {
            r2 = this;
            int r0 = r2.bottom
            int r1 = r2.top
            int r0 = r0 - r1
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }

    public boolean isDefaultTransform() {
            r1 = this;
            float r0 = r1.rotationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L4a
            float r0 = r1.rotationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L4a
            float r0 = r1.rotationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L4a
            float r0 = r1.translationX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L4a
            float r0 = r1.translationY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L4a
            float r0 = r1.translationZ
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L4a
            float r0 = r1.scaleX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L4a
            float r0 = r1.scaleY
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L4a
            float r0 = r1.alpha
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L4a
            r0 = 1
            goto L4b
        L4a:
            r0 = 0
        L4b:
            return r0
    }

    public java.lang.StringBuilder serialize(java.lang.StringBuilder r2) {
            r1 = this;
            r0 = 0
            java.lang.StringBuilder r2 = r1.serialize(r2, r0)
            return r2
    }

    public java.lang.StringBuilder serialize(java.lang.StringBuilder r7, boolean r8) {
            r6 = this;
            java.lang.String r0 = "{\n"
            r7.append(r0)
            int r0 = r6.left
            java.lang.String r1 = "left"
            add(r7, r1, r0)
            int r0 = r6.top
            java.lang.String r1 = "top"
            add(r7, r1, r0)
            int r0 = r6.right
            java.lang.String r1 = "right"
            add(r7, r1, r0)
            int r0 = r6.bottom
            java.lang.String r1 = "bottom"
            add(r7, r1, r0)
            float r0 = r6.pivotX
            java.lang.String r1 = "pivotX"
            add(r7, r1, r0)
            float r0 = r6.pivotY
            java.lang.String r1 = "pivotY"
            add(r7, r1, r0)
            float r0 = r6.rotationX
            java.lang.String r1 = "rotationX"
            add(r7, r1, r0)
            float r0 = r6.rotationY
            java.lang.String r1 = "rotationY"
            add(r7, r1, r0)
            float r0 = r6.rotationZ
            java.lang.String r1 = "rotationZ"
            add(r7, r1, r0)
            float r0 = r6.translationX
            java.lang.String r1 = "translationX"
            add(r7, r1, r0)
            float r0 = r6.translationY
            java.lang.String r1 = "translationY"
            add(r7, r1, r0)
            float r0 = r6.translationZ
            java.lang.String r1 = "translationZ"
            add(r7, r1, r0)
            float r0 = r6.scaleX
            java.lang.String r1 = "scaleX"
            add(r7, r1, r0)
            float r0 = r6.scaleY
            java.lang.String r1 = "scaleY"
            add(r7, r1, r0)
            float r0 = r6.alpha
            java.lang.String r1 = "alpha"
            add(r7, r1, r0)
            int r0 = r6.visibility
            java.lang.String r1 = "visibility"
            add(r7, r1, r0)
            float r0 = r6.interpolatedPos
            java.lang.String r1 = "interpolatedPos"
            add(r7, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.widget
            if (r0 == 0) goto L9c
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
            int r1 = r0.length
            r2 = 0
        L92:
            if (r2 >= r1) goto L9c
            r3 = r0[r2]
            r6.serializeAnchor(r7, r3)
            int r2 = r2 + 1
            goto L92
        L9c:
            java.lang.String r0 = "phone_orientation"
            if (r8 == 0) goto La5
            float r1 = androidx.constraintlayout.core.state.WidgetFrame.phone_orientation
            add(r7, r0, r1)
        La5:
            if (r8 == 0) goto Lac
            float r8 = androidx.constraintlayout.core.state.WidgetFrame.phone_orientation
            add(r7, r0, r8)
        Lac:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r8 = r6.mCustom
            int r8 = r8.size()
            java.lang.String r0 = "}\n"
            if (r8 == 0) goto L137
            java.lang.String r8 = "custom : {\n"
            r7.append(r8)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r8 = r6.mCustom
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        Lc6:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L134
            java.lang.Object r1 = r8.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r2 = r6.mCustom
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.core.motion.CustomVariable r2 = (androidx.constraintlayout.core.motion.CustomVariable) r2
            r7.append(r1)
            java.lang.String r1 = ": "
            r7.append(r1)
            int r1 = r2.getType()
            java.lang.String r3 = ",\n"
            java.lang.String r4 = "',\n"
            java.lang.String r5 = "'"
            switch(r1) {
                case 900: goto L129;
                case 901: goto L11e;
                case 902: goto L10c;
                case 903: goto Lfe;
                case 904: goto Lf0;
                case 905: goto L11e;
                default: goto Lef;
            }
        Lef:
            goto Lc6
        Lf0:
            r7.append(r5)
            boolean r1 = r2.getBooleanValue()
            r7.append(r1)
            r7.append(r4)
            goto Lc6
        Lfe:
            r7.append(r5)
            java.lang.String r1 = r2.getStringValue()
            r7.append(r1)
            r7.append(r4)
            goto Lc6
        L10c:
            r7.append(r5)
            int r1 = r2.getIntegerValue()
            java.lang.String r1 = androidx.constraintlayout.core.motion.CustomVariable.colorString(r1)
            r7.append(r1)
            r7.append(r4)
            goto Lc6
        L11e:
            float r1 = r2.getFloatValue()
            r7.append(r1)
            r7.append(r3)
            goto Lc6
        L129:
            int r1 = r2.getIntegerValue()
            r7.append(r1)
            r7.append(r3)
            goto Lc6
        L134:
            r7.append(r0)
        L137:
            r7.append(r0)
            return r7
    }

    public void setCustomAttribute(java.lang.String r3, int r4, float r5) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r2.mCustom
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L14
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r4 = r2.mCustom
            java.lang.Object r3 = r4.get(r3)
            androidx.constraintlayout.core.motion.CustomVariable r3 = (androidx.constraintlayout.core.motion.CustomVariable) r3
            r3.setFloatValue(r5)
            goto L1e
        L14:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r2.mCustom
            androidx.constraintlayout.core.motion.CustomVariable r1 = new androidx.constraintlayout.core.motion.CustomVariable
            r1.<init>(r3, r4, r5)
            r0.put(r3, r1)
        L1e:
            return
    }

    public void setCustomAttribute(java.lang.String r3, int r4, int r5) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r2.mCustom
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L14
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r4 = r2.mCustom
            java.lang.Object r3 = r4.get(r3)
            androidx.constraintlayout.core.motion.CustomVariable r3 = (androidx.constraintlayout.core.motion.CustomVariable) r3
            r3.setIntValue(r5)
            goto L1e
        L14:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r2.mCustom
            androidx.constraintlayout.core.motion.CustomVariable r1 = new androidx.constraintlayout.core.motion.CustomVariable
            r1.<init>(r3, r4, r5)
            r0.put(r3, r1)
        L1e:
            return
    }

    public void setCustomAttribute(java.lang.String r3, int r4, java.lang.String r5) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r2.mCustom
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L14
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r4 = r2.mCustom
            java.lang.Object r3 = r4.get(r3)
            androidx.constraintlayout.core.motion.CustomVariable r3 = (androidx.constraintlayout.core.motion.CustomVariable) r3
            r3.setStringValue(r5)
            goto L1e
        L14:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r2.mCustom
            androidx.constraintlayout.core.motion.CustomVariable r1 = new androidx.constraintlayout.core.motion.CustomVariable
            r1.<init>(r3, r4, r5)
            r0.put(r3, r1)
        L1e:
            return
    }

    public void setCustomAttribute(java.lang.String r3, int r4, boolean r5) {
            r2 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r2.mCustom
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L14
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r4 = r2.mCustom
            java.lang.Object r3 = r4.get(r3)
            androidx.constraintlayout.core.motion.CustomVariable r3 = (androidx.constraintlayout.core.motion.CustomVariable) r3
            r3.setBooleanValue(r5)
            goto L1e
        L14:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r2.mCustom
            androidx.constraintlayout.core.motion.CustomVariable r1 = new androidx.constraintlayout.core.motion.CustomVariable
            r1.<init>(r3, r4, r5)
            r0.put(r3, r1)
        L1e:
            return
    }

    public void setCustomValue(androidx.constraintlayout.core.motion.CustomAttribute r1, float[] r2) {
            r0 = this;
            return
    }

    public boolean setValue(java.lang.String r8, androidx.constraintlayout.core.parser.CLElement r9) throws androidx.constraintlayout.core.parser.CLParsingException {
            r7 = this;
            java.util.Objects.requireNonNull(r8)
            int r0 = r8.hashCode()
            r1 = 16
            r2 = 0
            r3 = 1
            r4 = -1
            switch(r0) {
                case -1881940865: goto Lf4;
                case -1383228885: goto Le9;
                case -1349088399: goto Lde;
                case -1249320806: goto Ld2;
                case -1249320805: goto Lc6;
                case -1249320804: goto Lba;
                case -1225497657: goto Lae;
                case -1225497656: goto La2;
                case -1225497655: goto L93;
                case -987906986: goto L85;
                case -987906985: goto L77;
                case -908189618: goto L68;
                case -908189617: goto L59;
                case 115029: goto L4a;
                case 3317767: goto L3c;
                case 92909918: goto L2e;
                case 108511772: goto L1f;
                case 642850769: goto L11;
                default: goto Lf;
            }
        Lf:
            goto Lfe
        L11:
            java.lang.String r0 = "interpolatedPos"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L1b
            goto Lfe
        L1b:
            r4 = 17
            goto Lfe
        L1f:
            java.lang.String r0 = "right"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L2a
            goto Lfe
        L2a:
            r4 = 16
            goto Lfe
        L2e:
            java.lang.String r0 = "alpha"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L38
            goto Lfe
        L38:
            r4 = 15
            goto Lfe
        L3c:
            java.lang.String r0 = "left"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L46
            goto Lfe
        L46:
            r4 = 14
            goto Lfe
        L4a:
            java.lang.String r0 = "top"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L55
            goto Lfe
        L55:
            r4 = 13
            goto Lfe
        L59:
            java.lang.String r0 = "scaleY"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L64
            goto Lfe
        L64:
            r4 = 12
            goto Lfe
        L68:
            java.lang.String r0 = "scaleX"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L73
            goto Lfe
        L73:
            r4 = 11
            goto Lfe
        L77:
            java.lang.String r0 = "pivotY"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L81
            goto Lfe
        L81:
            r4 = 10
            goto Lfe
        L85:
            java.lang.String r0 = "pivotX"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L8f
            goto Lfe
        L8f:
            r4 = 9
            goto Lfe
        L93:
            java.lang.String r0 = "translationZ"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L9e
            goto Lfe
        L9e:
            r4 = 8
            goto Lfe
        La2:
            java.lang.String r0 = "translationY"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto Lac
            goto Lfe
        Lac:
            r4 = 7
            goto Lfe
        Lae:
            java.lang.String r0 = "translationX"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto Lb8
            goto Lfe
        Lb8:
            r4 = 6
            goto Lfe
        Lba:
            java.lang.String r0 = "rotationZ"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto Lc4
            goto Lfe
        Lc4:
            r4 = 5
            goto Lfe
        Lc6:
            java.lang.String r0 = "rotationY"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto Ld0
            goto Lfe
        Ld0:
            r4 = 4
            goto Lfe
        Ld2:
            java.lang.String r0 = "rotationX"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto Ldc
            goto Lfe
        Ldc:
            r4 = 3
            goto Lfe
        Lde:
            java.lang.String r0 = "custom"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto Le7
            goto Lfe
        Le7:
            r4 = 2
            goto Lfe
        Le9:
            java.lang.String r0 = "bottom"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto Lf2
            goto Lfe
        Lf2:
            r4 = 1
            goto Lfe
        Lf4:
            java.lang.String r0 = "phone_orientation"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto Lfd
            goto Lfe
        Lfd:
            r4 = 0
        Lfe:
            switch(r4) {
                case 0: goto L1cf;
                case 1: goto L1c8;
                case 2: goto L177;
                case 3: goto L170;
                case 4: goto L169;
                case 5: goto L162;
                case 6: goto L15a;
                case 7: goto L152;
                case 8: goto L14a;
                case 9: goto L142;
                case 10: goto L13a;
                case 11: goto L132;
                case 12: goto L12a;
                case 13: goto L122;
                case 14: goto L11a;
                case 15: goto L112;
                case 16: goto L10a;
                case 17: goto L102;
                default: goto L101;
            }
        L101:
            return r2
        L102:
            float r8 = r9.getFloat()
            r7.interpolatedPos = r8
            goto L1d5
        L10a:
            int r8 = r9.getInt()
            r7.right = r8
            goto L1d5
        L112:
            float r8 = r9.getFloat()
            r7.alpha = r8
            goto L1d5
        L11a:
            int r8 = r9.getInt()
            r7.left = r8
            goto L1d5
        L122:
            int r8 = r9.getInt()
            r7.top = r8
            goto L1d5
        L12a:
            float r8 = r9.getFloat()
            r7.scaleY = r8
            goto L1d5
        L132:
            float r8 = r9.getFloat()
            r7.scaleX = r8
            goto L1d5
        L13a:
            float r8 = r9.getFloat()
            r7.pivotY = r8
            goto L1d5
        L142:
            float r8 = r9.getFloat()
            r7.pivotX = r8
            goto L1d5
        L14a:
            float r8 = r9.getFloat()
            r7.translationZ = r8
            goto L1d5
        L152:
            float r8 = r9.getFloat()
            r7.translationY = r8
            goto L1d5
        L15a:
            float r8 = r9.getFloat()
            r7.translationX = r8
            goto L1d5
        L162:
            float r8 = r9.getFloat()
            r7.rotationZ = r8
            goto L1d5
        L169:
            float r8 = r9.getFloat()
            r7.rotationY = r8
            goto L1d5
        L170:
            float r8 = r9.getFloat()
            r7.rotationX = r8
            goto L1d5
        L177:
            androidx.constraintlayout.core.parser.CLObject r9 = (androidx.constraintlayout.core.parser.CLObject) r9
            int r8 = r9.size()
        L17d:
            if (r2 >= r8) goto L1d5
            androidx.constraintlayout.core.parser.CLElement r0 = r9.get(r2)
            androidx.constraintlayout.core.parser.CLKey r0 = (androidx.constraintlayout.core.parser.CLKey) r0
            r0.content()
            androidx.constraintlayout.core.parser.CLElement r4 = r0.getValue()
            java.lang.String r5 = r4.content()
            java.lang.String r6 = "#[0-9a-fA-F]+"
            boolean r6 = r5.matches(r6)
            if (r6 == 0) goto L1aa
            java.lang.String r4 = r5.substring(r3)
            int r4 = java.lang.Integer.parseInt(r4, r1)
            java.lang.String r0 = r0.content()
            r5 = 902(0x386, float:1.264E-42)
            r7.setCustomAttribute(r0, r5, r4)
            goto L1c5
        L1aa:
            boolean r6 = r4 instanceof androidx.constraintlayout.core.parser.CLNumber
            if (r6 == 0) goto L1bc
            java.lang.String r0 = r0.content()
            r5 = 901(0x385, float:1.263E-42)
            float r4 = r4.getFloat()
            r7.setCustomAttribute(r0, r5, r4)
            goto L1c5
        L1bc:
            java.lang.String r0 = r0.content()
            r4 = 903(0x387, float:1.265E-42)
            r7.setCustomAttribute(r0, r4, r5)
        L1c5:
            int r2 = r2 + 1
            goto L17d
        L1c8:
            int r8 = r9.getInt()
            r7.bottom = r8
            goto L1d5
        L1cf:
            float r8 = r9.getFloat()
            androidx.constraintlayout.core.state.WidgetFrame.phone_orientation = r8
        L1d5:
            return r3
    }

    public androidx.constraintlayout.core.state.WidgetFrame update() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.widget
            if (r0 == 0) goto L29
            int r0 = r0.getLeft()
            r1.left = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.widget
            int r0 = r0.getTop()
            r1.top = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.widget
            int r0 = r0.getRight()
            r1.right = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.widget
            int r0 = r0.getBottom()
            r1.bottom = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.widget
            androidx.constraintlayout.core.state.WidgetFrame r0 = r0.frame
            r1.updateAttributes(r0)
        L29:
            return r1
    }

    public androidx.constraintlayout.core.state.WidgetFrame update(androidx.constraintlayout.core.widgets.ConstraintWidget r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return r0
        L3:
            r0.widget = r1
            r0.update()
            return r0
    }

    public void updateAttributes(androidx.constraintlayout.core.state.WidgetFrame r4) {
            r3 = this;
            float r0 = r4.pivotX
            r3.pivotX = r0
            float r0 = r4.pivotY
            r3.pivotY = r0
            float r0 = r4.rotationX
            r3.rotationX = r0
            float r0 = r4.rotationY
            r3.rotationY = r0
            float r0 = r4.rotationZ
            r3.rotationZ = r0
            float r0 = r4.translationX
            r3.translationX = r0
            float r0 = r4.translationY
            r3.translationY = r0
            float r0 = r4.translationZ
            r3.translationZ = r0
            float r0 = r4.scaleX
            r3.scaleX = r0
            float r0 = r4.scaleY
            r3.scaleY = r0
            float r0 = r4.alpha
            r3.alpha = r0
            int r0 = r4.visibility
            r3.visibility = r0
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r0 = r3.mCustom
            r0.clear()
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r4 = r4.mCustom
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L3f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r4.next()
            androidx.constraintlayout.core.motion.CustomVariable r0 = (androidx.constraintlayout.core.motion.CustomVariable) r0
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r1 = r3.mCustom
            java.lang.String r2 = r0.getName()
            androidx.constraintlayout.core.motion.CustomVariable r0 = r0.copy()
            r1.put(r2, r0)
            goto L3f
        L59:
            return
    }

    public int width() {
            r2 = this;
            int r0 = r2.right
            int r1 = r2.left
            int r0 = r0 - r1
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            return r0
    }
}
