package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProperties {
    public static final int BASELINE = 5;
    public static final int BOTTOM = 4;
    public static final int END = 7;
    public static final int LEFT = 1;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int PARENT_ID = 0;
    public static final int RIGHT = 2;
    public static final int START = 6;
    public static final int TOP = 3;
    public static final int UNSET = -1;
    public static final int WRAP_CONTENT = -2;
    public androidx.constraintlayout.widget.ConstraintLayout.LayoutParams mParams;
    public android.view.View mView;

    public ConstraintProperties(android.view.View r3) {
            r2 = this;
            r2.<init>()
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r1 == 0) goto L12
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
            r2.mParams = r0
            r2.mView = r3
            return
        L12:
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.String r0 = "Only children of ConstraintLayout.LayoutParams supported"
            r3.<init>(r0)
            throw r3
    }

    private java.lang.String sideToString(int r1) {
            r0 = this;
            switch(r1) {
                case 1: goto L1c;
                case 2: goto L18;
                case 3: goto L14;
                case 4: goto L11;
                case 5: goto Le;
                case 6: goto La;
                case 7: goto L7;
                default: goto L3;
            }
        L3:
            java.lang.String r1 = "undefined"
            return r1
        L7:
            java.lang.String r1 = "end"
            return r1
        La:
            java.lang.String r1 = "start"
            return r1
        Le:
            java.lang.String r1 = "baseline"
            return r1
        L11:
            java.lang.String r1 = "bottom"
            return r1
        L14:
            java.lang.String r1 = "top"
            return r1
        L18:
            java.lang.String r1 = "right"
            return r1
        L1c:
            java.lang.String r1 = "left"
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties addToHorizontalChain(int r5, int r6) {
            r4 = this;
            r0 = 2
            r1 = 1
            if (r5 != 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 2
        L7:
            r3 = 0
            r4.connect(r1, r5, r2, r3)
            if (r6 != 0) goto Lf
            r2 = 2
            goto L10
        Lf:
            r2 = 1
        L10:
            r4.connect(r0, r6, r2, r3)
            if (r5 == 0) goto L2f
            android.view.View r2 = r4.mView
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r5 = r2.findViewById(r5)
            androidx.constraintlayout.widget.ConstraintProperties r2 = new androidx.constraintlayout.widget.ConstraintProperties
            r2.<init>(r5)
            android.view.View r5 = r4.mView
            int r5 = r5.getId()
            r2.connect(r0, r5, r1, r3)
        L2f:
            if (r6 == 0) goto L4b
            android.view.View r5 = r4.mView
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r5 = r5.findViewById(r6)
            androidx.constraintlayout.widget.ConstraintProperties r6 = new androidx.constraintlayout.widget.ConstraintProperties
            r6.<init>(r5)
            android.view.View r5 = r4.mView
            int r5 = r5.getId()
            r6.connect(r1, r5, r0, r3)
        L4b:
            return r4
    }

    public androidx.constraintlayout.widget.ConstraintProperties addToHorizontalChainRTL(int r5, int r6) {
            r4 = this;
            r0 = 7
            r1 = 6
            if (r5 != 0) goto L6
            r2 = 6
            goto L7
        L6:
            r2 = 7
        L7:
            r3 = 0
            r4.connect(r1, r5, r2, r3)
            if (r6 != 0) goto Lf
            r2 = 7
            goto L10
        Lf:
            r2 = 6
        L10:
            r4.connect(r0, r6, r2, r3)
            if (r5 == 0) goto L2f
            android.view.View r2 = r4.mView
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r5 = r2.findViewById(r5)
            androidx.constraintlayout.widget.ConstraintProperties r2 = new androidx.constraintlayout.widget.ConstraintProperties
            r2.<init>(r5)
            android.view.View r5 = r4.mView
            int r5 = r5.getId()
            r2.connect(r0, r5, r1, r3)
        L2f:
            if (r6 == 0) goto L4b
            android.view.View r5 = r4.mView
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r5 = r5.findViewById(r6)
            androidx.constraintlayout.widget.ConstraintProperties r6 = new androidx.constraintlayout.widget.ConstraintProperties
            r6.<init>(r5)
            android.view.View r5 = r4.mView
            int r5 = r5.getId()
            r6.connect(r1, r5, r0, r3)
        L4b:
            return r4
    }

    public androidx.constraintlayout.widget.ConstraintProperties addToVerticalChain(int r5, int r6) {
            r4 = this;
            r0 = 4
            r1 = 3
            if (r5 != 0) goto L6
            r2 = 3
            goto L7
        L6:
            r2 = 4
        L7:
            r3 = 0
            r4.connect(r1, r5, r2, r3)
            if (r6 != 0) goto Lf
            r2 = 4
            goto L10
        Lf:
            r2 = 3
        L10:
            r4.connect(r0, r6, r2, r3)
            if (r5 == 0) goto L2f
            android.view.View r2 = r4.mView
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r5 = r2.findViewById(r5)
            androidx.constraintlayout.widget.ConstraintProperties r2 = new androidx.constraintlayout.widget.ConstraintProperties
            r2.<init>(r5)
            android.view.View r5 = r4.mView
            int r5 = r5.getId()
            r2.connect(r0, r5, r1, r3)
        L2f:
            if (r6 == 0) goto L4b
            android.view.View r5 = r4.mView
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r5 = r5.findViewById(r6)
            androidx.constraintlayout.widget.ConstraintProperties r6 = new androidx.constraintlayout.widget.ConstraintProperties
            r6.<init>(r5)
            android.view.View r5 = r4.mView
            int r5 = r5.getId()
            r6.connect(r1, r5, r0, r3)
        L4b:
            return r4
    }

    public androidx.constraintlayout.widget.ConstraintProperties alpha(float r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setAlpha(r2)
            return r1
    }

    public void apply() {
            r0 = this;
            return
    }

    public androidx.constraintlayout.widget.ConstraintProperties center(int r3, int r4, int r5, int r6, int r7, int r8, float r9) {
            r2 = this;
            java.lang.String r0 = "margin must be > 0"
            if (r5 < 0) goto L50
            if (r8 < 0) goto L4a
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L42
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto L42
            r0 = 2
            r1 = 1
            if (r4 == r1) goto L37
            if (r4 != r0) goto L18
            goto L37
        L18:
            r0 = 7
            r1 = 6
            if (r4 == r1) goto L2c
            if (r4 != r0) goto L1f
            goto L2c
        L1f:
            r0 = 3
            r2.connect(r0, r3, r4, r5)
            r3 = 4
            r2.connect(r3, r6, r7, r8)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = r2.mParams
            r3.verticalBias = r9
            goto L41
        L2c:
            r2.connect(r1, r3, r4, r5)
            r2.connect(r0, r6, r7, r8)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = r2.mParams
            r3.horizontalBias = r9
            goto L41
        L37:
            r2.connect(r1, r3, r4, r5)
            r2.connect(r0, r6, r7, r8)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = r2.mParams
            r3.horizontalBias = r9
        L41:
            return r2
        L42:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "bias must be between 0 and 1 inclusive"
            r3.<init>(r4)
            throw r3
        L4a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r0)
            throw r3
        L50:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r0)
            throw r3
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerHorizontally(int r9) {
            r8 = this;
            if (r9 != 0) goto Lf
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = 0
            r7 = 1056964608(0x3f000000, float:0.5)
            r0 = r8
            r0.center(r1, r2, r3, r4, r5, r6, r7)
            goto L1b
        Lf:
            r2 = 2
            r3 = 0
            r5 = 1
            r6 = 0
            r7 = 1056964608(0x3f000000, float:0.5)
            r0 = r8
            r1 = r9
            r4 = r9
            r0.center(r1, r2, r3, r4, r5, r6, r7)
        L1b:
            return r8
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerHorizontally(int r2, int r3, int r4, int r5, int r6, int r7, float r8) {
            r1 = this;
            r0 = 1
            r1.connect(r0, r2, r3, r4)
            r2 = 2
            r1.connect(r2, r5, r6, r7)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = r1.mParams
            r2.horizontalBias = r8
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerHorizontallyRtl(int r9) {
            r8 = this;
            if (r9 != 0) goto Lf
            r1 = 0
            r2 = 6
            r3 = 0
            r4 = 0
            r5 = 7
            r6 = 0
            r7 = 1056964608(0x3f000000, float:0.5)
            r0 = r8
            r0.center(r1, r2, r3, r4, r5, r6, r7)
            goto L1b
        Lf:
            r2 = 7
            r3 = 0
            r5 = 6
            r6 = 0
            r7 = 1056964608(0x3f000000, float:0.5)
            r0 = r8
            r1 = r9
            r4 = r9
            r0.center(r1, r2, r3, r4, r5, r6, r7)
        L1b:
            return r8
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerHorizontallyRtl(int r2, int r3, int r4, int r5, int r6, int r7, float r8) {
            r1 = this;
            r0 = 6
            r1.connect(r0, r2, r3, r4)
            r2 = 7
            r1.connect(r2, r5, r6, r7)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = r1.mParams
            r2.horizontalBias = r8
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerVertically(int r9) {
            r8 = this;
            if (r9 != 0) goto Lf
            r1 = 0
            r2 = 3
            r3 = 0
            r4 = 0
            r5 = 4
            r6 = 0
            r7 = 1056964608(0x3f000000, float:0.5)
            r0 = r8
            r0.center(r1, r2, r3, r4, r5, r6, r7)
            goto L1b
        Lf:
            r2 = 4
            r3 = 0
            r5 = 3
            r6 = 0
            r7 = 1056964608(0x3f000000, float:0.5)
            r0 = r8
            r1 = r9
            r4 = r9
            r0.center(r1, r2, r3, r4, r5, r6, r7)
        L1b:
            return r8
    }

    public androidx.constraintlayout.widget.ConstraintProperties centerVertically(int r2, int r3, int r4, int r5, int r6, int r7, float r8) {
            r1 = this;
            r0 = 3
            r1.connect(r0, r2, r3, r4)
            r2 = 4
            r1.connect(r2, r5, r6, r7)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = r1.mParams
            r2.verticalBias = r8
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties connect(int r10, int r11, int r12, int r13) {
            r9 = this;
            r0 = 2
            r1 = 7
            r2 = 6
            r3 = 1
            r4 = 4
            r5 = 3
            java.lang.String r6 = "right to "
            java.lang.String r7 = " undefined"
            r8 = -1
            switch(r10) {
                case 1: goto L159;
                case 2: goto L131;
                case 3: goto Lfd;
                case 4: goto Lc8;
                case 5: goto L84;
                case 6: goto L5a;
                case 7: goto L30;
                default: goto Lf;
            }
        Lf:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r10 = r9.sideToString(r10)
            r13.append(r10)
            java.lang.String r10 = " to "
            r13.append(r10)
            java.lang.String r10 = r9.sideToString(r12)
            java.lang.String r12 = " unknown"
            java.lang.String r10 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r13, r10, r12)
            r11.<init>(r10)
            throw r11
        L30:
            if (r12 != r1) goto L39
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.endToEnd = r11
            r10.endToStart = r8
            goto L41
        L39:
            if (r12 != r2) goto L48
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.endToStart = r11
            r10.endToEnd = r8
        L41:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.setMarginEnd(r13)
            goto L16e
        L48:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            java.lang.String r12 = r9.sideToString(r12)
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12, r7)
            r10.<init>(r11)
            throw r10
        L5a:
            if (r12 != r2) goto L63
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.startToStart = r11
            r10.startToEnd = r8
            goto L6b
        L63:
            if (r12 != r1) goto L72
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.startToEnd = r11
            r10.startToStart = r8
        L6b:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.setMarginStart(r13)
            goto L16e
        L72:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            java.lang.String r12 = r9.sideToString(r12)
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12, r7)
            r10.<init>(r11)
            throw r10
        L84:
            r10 = 5
            if (r12 != r10) goto L93
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.baselineToBaseline = r11
            r10.bottomToBottom = r8
            r10.bottomToTop = r8
            r10.topToTop = r8
            r10.topToBottom = r8
        L93:
            if (r12 != r5) goto La2
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.baselineToTop = r11
            r10.bottomToBottom = r8
            r10.bottomToTop = r8
            r10.topToTop = r8
            r10.topToBottom = r8
            goto Lb0
        La2:
            if (r12 != r4) goto Lb6
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.baselineToBottom = r11
            r10.bottomToBottom = r8
            r10.bottomToTop = r8
            r10.topToTop = r8
            r10.topToBottom = r8
        Lb0:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.baselineMargin = r13
            goto L16e
        Lb6:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            java.lang.String r12 = r9.sideToString(r12)
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12, r7)
            r10.<init>(r11)
            throw r10
        Lc8:
            if (r12 != r4) goto Ld7
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.bottomToBottom = r11
            r10.bottomToTop = r8
            r10.baselineToBaseline = r8
            r10.baselineToTop = r8
            r10.baselineToBottom = r8
            goto Le5
        Ld7:
            if (r12 != r5) goto Leb
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.bottomToTop = r11
            r10.bottomToBottom = r8
            r10.baselineToBaseline = r8
            r10.baselineToTop = r8
            r10.baselineToBottom = r8
        Le5:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.bottomMargin = r13
            goto L16e
        Leb:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            java.lang.String r12 = r9.sideToString(r12)
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12, r7)
            r10.<init>(r11)
            throw r10
        Lfd:
            if (r12 != r5) goto L10c
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.topToTop = r11
            r10.topToBottom = r8
            r10.baselineToBaseline = r8
            r10.baselineToTop = r8
            r10.baselineToBottom = r8
            goto L11a
        L10c:
            if (r12 != r4) goto L11f
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.topToBottom = r11
            r10.topToTop = r8
            r10.baselineToBaseline = r8
            r10.baselineToTop = r8
            r10.baselineToBottom = r8
        L11a:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.topMargin = r13
            goto L16e
        L11f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            java.lang.String r12 = r9.sideToString(r12)
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12, r7)
            r10.<init>(r11)
            throw r10
        L131:
            if (r12 != r3) goto L13a
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.rightToLeft = r11
            r10.rightToRight = r8
            goto L142
        L13a:
            if (r12 != r0) goto L147
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.rightToRight = r11
            r10.rightToLeft = r8
        L142:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.rightMargin = r13
            goto L16e
        L147:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            java.lang.String r12 = r9.sideToString(r12)
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12, r7)
            r10.<init>(r11)
            throw r10
        L159:
            if (r12 != r3) goto L162
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.leftToLeft = r11
            r10.leftToRight = r8
            goto L16a
        L162:
            if (r12 != r0) goto L16f
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.leftToRight = r11
            r10.leftToLeft = r8
        L16a:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r10 = r9.mParams
            r10.leftMargin = r13
        L16e:
            return r9
        L16f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Left to "
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11)
            java.lang.String r12 = r9.sideToString(r12)
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12, r7)
            r10.<init>(r11)
            throw r10
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainDefaultHeight(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.matchConstraintDefaultHeight = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainDefaultWidth(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.matchConstraintDefaultWidth = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainHeight(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.height = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainMaxHeight(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.matchConstraintMaxHeight = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainMaxWidth(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.matchConstraintMaxWidth = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainMinHeight(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.matchConstraintMinHeight = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainMinWidth(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.matchConstraintMinWidth = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties constrainWidth(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.width = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties dimensionRatio(java.lang.String r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.dimensionRatio = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties elevation(float r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setElevation(r2)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties goneMargin(int r1, int r2) {
            r0 = this;
            switch(r1) {
                case 1: goto L2d;
                case 2: goto L28;
                case 3: goto L23;
                case 4: goto L1e;
                case 5: goto L16;
                case 6: goto L11;
                case 7: goto Lc;
                default: goto L3;
            }
        L3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "unknown constraint"
            r1.<init>(r2)
            throw r1
        Lc:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.goneEndMargin = r2
            goto L31
        L11:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.goneStartMargin = r2
            goto L31
        L16:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "baseline does not support margins"
            r1.<init>(r2)
            throw r1
        L1e:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.goneBottomMargin = r2
            goto L31
        L23:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.goneTopMargin = r2
            goto L31
        L28:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.goneRightMargin = r2
            goto L31
        L2d:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.goneLeftMargin = r2
        L31:
            return r0
    }

    public androidx.constraintlayout.widget.ConstraintProperties horizontalBias(float r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.horizontalBias = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties horizontalChainStyle(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.horizontalChainStyle = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties horizontalWeight(float r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.horizontalWeight = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties margin(int r1, int r2) {
            r0 = this;
            switch(r1) {
                case 1: goto L2f;
                case 2: goto L2a;
                case 3: goto L25;
                case 4: goto L20;
                case 5: goto L18;
                case 6: goto L12;
                case 7: goto Lc;
                default: goto L3;
            }
        L3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "unknown constraint"
            r1.<init>(r2)
            throw r1
        Lc:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.setMarginEnd(r2)
            goto L33
        L12:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.setMarginStart(r2)
            goto L33
        L18:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "baseline does not support margins"
            r1.<init>(r2)
            throw r1
        L20:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.bottomMargin = r2
            goto L33
        L25:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.topMargin = r2
            goto L33
        L2a:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.rightMargin = r2
            goto L33
        L2f:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r0.mParams
            r1.leftMargin = r2
        L33:
            return r0
    }

    public androidx.constraintlayout.widget.ConstraintProperties removeConstraints(int r3) {
            r2 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -1
            switch(r3) {
                case 1: goto L51;
                case 2: goto L46;
                case 3: goto L3b;
                case 4: goto L30;
                case 5: goto L2b;
                case 6: goto L1d;
                case 7: goto Lf;
                default: goto L6;
            }
        L6:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unknown constraint"
            r3.<init>(r0)
            throw r3
        Lf:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = r2.mParams
            r3.endToStart = r1
            r3.endToEnd = r1
            r3.setMarginEnd(r1)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = r2.mParams
            r3.goneEndMargin = r0
            goto L5b
        L1d:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = r2.mParams
            r3.startToEnd = r1
            r3.startToStart = r1
            r3.setMarginStart(r1)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = r2.mParams
            r3.goneStartMargin = r0
            goto L5b
        L2b:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = r2.mParams
            r3.baselineToBaseline = r1
            goto L5b
        L30:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = r2.mParams
            r3.bottomToTop = r1
            r3.bottomToBottom = r1
            r3.bottomMargin = r1
            r3.goneBottomMargin = r0
            goto L5b
        L3b:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = r2.mParams
            r3.topToBottom = r1
            r3.topToTop = r1
            r3.topMargin = r1
            r3.goneTopMargin = r0
            goto L5b
        L46:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = r2.mParams
            r3.rightToRight = r1
            r3.rightToLeft = r1
            r3.rightMargin = r1
            r3.goneRightMargin = r0
            goto L5b
        L51:
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = r2.mParams
            r3.leftToRight = r1
            r3.leftToLeft = r1
            r3.leftMargin = r1
            r3.goneLeftMargin = r0
        L5b:
            return r2
    }

    public androidx.constraintlayout.widget.ConstraintProperties removeFromHorizontalChain() {
            r10 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r10.mParams
            int r1 = r0.leftToRight
            int r2 = r0.rightToLeft
            r3 = 0
            r4 = -1
            if (r1 != r4) goto L60
            if (r2 == r4) goto Ld
            goto L60
        Ld:
            int r2 = r0.startToEnd
            int r0 = r0.endToStart
            r5 = 7
            r6 = 6
            if (r2 != r4) goto L17
            if (r0 == r4) goto L59
        L17:
            android.view.View r7 = r10.mView
            android.view.ViewParent r7 = r7.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            android.view.View r7 = r7.findViewById(r2)
            androidx.constraintlayout.widget.ConstraintProperties r8 = new androidx.constraintlayout.widget.ConstraintProperties
            r8.<init>(r7)
            android.view.View r7 = r10.mView
            android.view.ViewParent r7 = r7.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            android.view.View r7 = r7.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintProperties r9 = new androidx.constraintlayout.widget.ConstraintProperties
            r9.<init>(r7)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r7 = r10.mParams
            if (r2 == r4) goto L46
            if (r0 == r4) goto L46
            r8.connect(r5, r0, r6, r3)
            r9.connect(r6, r1, r5, r3)
            goto L59
        L46:
            if (r1 != r4) goto L4a
            if (r0 == r4) goto L59
        L4a:
            int r0 = r7.rightToRight
            if (r0 == r4) goto L52
            r8.connect(r5, r0, r5, r3)
            goto L59
        L52:
            int r0 = r7.leftToLeft
            if (r0 == r4) goto L59
            r9.connect(r6, r0, r6, r3)
        L59:
            r10.removeConstraints(r6)
            r10.removeConstraints(r5)
            goto Laa
        L60:
            android.view.View r0 = r10.mView
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r0.findViewById(r1)
            androidx.constraintlayout.widget.ConstraintProperties r5 = new androidx.constraintlayout.widget.ConstraintProperties
            r5.<init>(r0)
            android.view.View r0 = r10.mView
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r0.findViewById(r2)
            androidx.constraintlayout.widget.ConstraintProperties r6 = new androidx.constraintlayout.widget.ConstraintProperties
            r6.<init>(r0)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r10.mParams
            r7 = 1
            r8 = 2
            if (r1 == r4) goto L91
            if (r2 == r4) goto L91
            r5.connect(r8, r2, r7, r3)
            r6.connect(r7, r1, r8, r3)
            goto La4
        L91:
            if (r1 != r4) goto L95
            if (r2 == r4) goto La4
        L95:
            int r1 = r0.rightToRight
            if (r1 == r4) goto L9d
            r5.connect(r8, r1, r8, r3)
            goto La4
        L9d:
            int r0 = r0.leftToLeft
            if (r0 == r4) goto La4
            r6.connect(r7, r0, r7, r3)
        La4:
            r10.removeConstraints(r7)
            r10.removeConstraints(r8)
        Laa:
            return r10
    }

    public androidx.constraintlayout.widget.ConstraintProperties removeFromVerticalChain() {
            r9 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r9.mParams
            int r1 = r0.topToBottom
            int r0 = r0.bottomToTop
            r2 = 4
            r3 = 3
            r4 = -1
            if (r1 != r4) goto Ld
            if (r0 == r4) goto L50
        Ld:
            android.view.View r5 = r9.mView
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r5 = r5.findViewById(r1)
            androidx.constraintlayout.widget.ConstraintProperties r6 = new androidx.constraintlayout.widget.ConstraintProperties
            r6.<init>(r5)
            android.view.View r5 = r9.mView
            android.view.ViewParent r5 = r5.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r5 = r5.findViewById(r0)
            androidx.constraintlayout.widget.ConstraintProperties r7 = new androidx.constraintlayout.widget.ConstraintProperties
            r7.<init>(r5)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r5 = r9.mParams
            r8 = 0
            if (r1 == r4) goto L3d
            if (r0 == r4) goto L3d
            r6.connect(r2, r0, r3, r8)
            r7.connect(r3, r1, r2, r8)
            goto L50
        L3d:
            if (r1 != r4) goto L41
            if (r0 == r4) goto L50
        L41:
            int r0 = r5.bottomToBottom
            if (r0 == r4) goto L49
            r6.connect(r2, r0, r2, r8)
            goto L50
        L49:
            int r0 = r5.topToTop
            if (r0 == r4) goto L50
            r7.connect(r3, r0, r3, r8)
        L50:
            r9.removeConstraints(r3)
            r9.removeConstraints(r2)
            return r9
    }

    public androidx.constraintlayout.widget.ConstraintProperties rotation(float r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setRotation(r2)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties rotationX(float r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setRotationX(r2)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties rotationY(float r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setRotationY(r2)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties scaleX(float r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setScaleY(r2)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties scaleY(float r1) {
            r0 = this;
            return r0
    }

    public androidx.constraintlayout.widget.ConstraintProperties transformPivot(float r2, float r3) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setPivotX(r2)
            android.view.View r2 = r1.mView
            r2.setPivotY(r3)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties transformPivotX(float r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setPivotX(r2)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties transformPivotY(float r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setPivotY(r2)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties translation(float r2, float r3) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setTranslationX(r2)
            android.view.View r2 = r1.mView
            r2.setTranslationY(r3)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties translationX(float r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setTranslationX(r2)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties translationY(float r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setTranslationY(r2)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties translationZ(float r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setTranslationZ(r2)
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties verticalBias(float r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.verticalBias = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties verticalChainStyle(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.verticalChainStyle = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties verticalWeight(float r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = r1.mParams
            r0.verticalWeight = r2
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintProperties visibility(int r2) {
            r1 = this;
            android.view.View r0 = r1.mView
            r0.setVisibility(r2)
            return r1
    }
}
