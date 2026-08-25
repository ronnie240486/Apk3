package androidx.constraintlayout.core.state;

/* JADX INFO: loaded from: classes2.dex */
public class ConstraintReference implements androidx.constraintlayout.core.state.Reference {
    private java.lang.Object key;
    public float mAlpha;
    public java.lang.Object mBaselineToBaseline;
    public java.lang.Object mBaselineToBottom;
    public java.lang.Object mBaselineToTop;
    public java.lang.Object mBottomToBottom;
    public java.lang.Object mBottomToTop;
    private float mCircularAngle;
    public java.lang.Object mCircularConstraint;
    private float mCircularDistance;
    private androidx.constraintlayout.core.widgets.ConstraintWidget mConstraintWidget;
    private java.util.HashMap<java.lang.String, java.lang.Integer> mCustomColors;
    private java.util.HashMap<java.lang.String, java.lang.Float> mCustomFloats;
    public java.lang.Object mEndToEnd;
    public java.lang.Object mEndToStart;
    public androidx.constraintlayout.core.state.helpers.Facade mFacade;
    public float mHorizontalBias;
    public int mHorizontalChainStyle;
    public float mHorizontalChainWeight;
    public androidx.constraintlayout.core.state.Dimension mHorizontalDimension;
    public androidx.constraintlayout.core.state.State.Constraint mLast;
    public java.lang.Object mLeftToLeft;
    public java.lang.Object mLeftToRight;
    public int mMarginBaseline;
    public int mMarginBaselineGone;
    public int mMarginBottom;
    public int mMarginBottomGone;
    public int mMarginEnd;
    public int mMarginEndGone;
    public int mMarginLeft;
    public int mMarginLeftGone;
    public int mMarginRight;
    public int mMarginRightGone;
    public int mMarginStart;
    public int mMarginStartGone;
    public int mMarginTop;
    public int mMarginTopGone;
    public float mPivotX;
    public float mPivotY;
    public java.lang.Object mRightToLeft;
    public java.lang.Object mRightToRight;
    public float mRotationX;
    public float mRotationY;
    public float mRotationZ;
    public float mScaleX;
    public float mScaleY;
    public java.lang.Object mStartToEnd;
    public java.lang.Object mStartToStart;
    public final androidx.constraintlayout.core.state.State mState;
    public java.lang.String mTag;
    public java.lang.Object mTopToBottom;
    public java.lang.Object mTopToTop;
    public float mTranslationX;
    public float mTranslationY;
    public float mTranslationZ;
    public float mVerticalBias;
    public int mVerticalChainStyle;
    public float mVerticalChainWeight;
    public androidx.constraintlayout.core.state.Dimension mVerticalDimension;
    private java.lang.Object mView;
    public int mVisibility;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.state.ConstraintReference$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Constraint = null;

        static {
                androidx.constraintlayout.core.state.State$Constraint[] r0 = androidx.constraintlayout.core.state.State.Constraint.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint = r0
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_LEFT     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_RIGHT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_LEFT     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_RIGHT     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L3e
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.START_TO_START     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L49
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.START_TO_END     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L54
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.END_TO_START     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L60
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.END_TO_END     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L6c
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.TOP_TO_TOP     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L78
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.TOP_TO_BOTTOM     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L84
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_TOP     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L90
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_BOTTOM     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> L9c
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BOTTOM     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> La8
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_TOP     // Catch: java.lang.NoSuchFieldError -> La8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r0 = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> Lb4
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BASELINE     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r0 = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> Lc0
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.CIRCULAR_CONSTRAINT     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                int[] r0 = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> Lcc
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.CENTER_HORIZONTALLY     // Catch: java.lang.NoSuchFieldError -> Lcc
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lcc
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lcc
            Lcc:
                int[] r0 = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint     // Catch: java.lang.NoSuchFieldError -> Ld8
                androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.CENTER_VERTICALLY     // Catch: java.lang.NoSuchFieldError -> Ld8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld8
                r2 = 18
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ld8
            Ld8:
                return
        }
    }

    public interface ConstraintReferenceFactory {
        androidx.constraintlayout.core.state.ConstraintReference create(androidx.constraintlayout.core.state.State r1);
    }

    public static class IncorrectConstraintException extends java.lang.Exception {
        private final java.util.ArrayList<java.lang.String> mErrors;

        public IncorrectConstraintException(java.util.ArrayList<java.lang.String> r1) {
                r0 = this;
                r0.<init>()
                r0.mErrors = r1
                return
        }

        public java.util.ArrayList<java.lang.String> getErrors() {
                r1 = this;
                java.util.ArrayList<java.lang.String> r0 = r1.mErrors
                return r0
        }

        @Override // java.lang.Throwable
        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "IncorrectConstraintException: "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.util.ArrayList<java.lang.String> r1 = r2.mErrors
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public ConstraintReference(androidx.constraintlayout.core.state.State r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.mTag = r0
            r3.mFacade = r0
            r1 = 0
            r3.mHorizontalChainStyle = r1
            r3.mVerticalChainStyle = r1
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.mHorizontalChainWeight = r2
            r3.mVerticalChainWeight = r2
            r2 = 1056964608(0x3f000000, float:0.5)
            r3.mHorizontalBias = r2
            r3.mVerticalBias = r2
            r3.mMarginLeft = r1
            r3.mMarginRight = r1
            r3.mMarginStart = r1
            r3.mMarginEnd = r1
            r3.mMarginTop = r1
            r3.mMarginBottom = r1
            r3.mMarginLeftGone = r1
            r3.mMarginRightGone = r1
            r3.mMarginStartGone = r1
            r3.mMarginEndGone = r1
            r3.mMarginTopGone = r1
            r3.mMarginBottomGone = r1
            r3.mMarginBaseline = r1
            r3.mMarginBaselineGone = r1
            r2 = 2143289344(0x7fc00000, float:NaN)
            r3.mPivotX = r2
            r3.mPivotY = r2
            r3.mRotationX = r2
            r3.mRotationY = r2
            r3.mRotationZ = r2
            r3.mTranslationX = r2
            r3.mTranslationY = r2
            r3.mTranslationZ = r2
            r3.mAlpha = r2
            r3.mScaleX = r2
            r3.mScaleY = r2
            r3.mVisibility = r1
            r3.mLeftToLeft = r0
            r3.mLeftToRight = r0
            r3.mRightToLeft = r0
            r3.mRightToRight = r0
            r3.mStartToStart = r0
            r3.mStartToEnd = r0
            r3.mEndToStart = r0
            r3.mEndToEnd = r0
            r3.mTopToTop = r0
            r3.mTopToBottom = r0
            r3.mBottomToTop = r0
            r3.mBottomToBottom = r0
            r3.mBaselineToBaseline = r0
            r3.mBaselineToTop = r0
            r3.mBaselineToBottom = r0
            r3.mCircularConstraint = r0
            r3.mLast = r0
            java.lang.Object r0 = androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION
            androidx.constraintlayout.core.state.Dimension r1 = androidx.constraintlayout.core.state.Dimension.Fixed(r0)
            r3.mHorizontalDimension = r1
            androidx.constraintlayout.core.state.Dimension r0 = androidx.constraintlayout.core.state.Dimension.Fixed(r0)
            r3.mVerticalDimension = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.mCustomColors = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.mCustomFloats = r0
            r3.mState = r4
            return
    }

    private void applyConnection(androidx.constraintlayout.core.widgets.ConstraintWidget r7, java.lang.Object r8, androidx.constraintlayout.core.state.State.Constraint r9) {
            r6 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r6.getTarget(r8)
            if (r2 != 0) goto L7
            return
        L7:
            int[] r8 = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint
            int r0 = r9.ordinal()
            r0 = r8[r0]
            int r9 = r9.ordinal()
            r8 = r8[r9]
            r9 = 0
            switch(r8) {
                case 1: goto L125;
                case 2: goto L111;
                case 3: goto Lfd;
                case 4: goto Leb;
                case 5: goto Ld9;
                case 6: goto Lc5;
                case 7: goto Lb1;
                case 8: goto L9e;
                case 9: goto L8b;
                case 10: goto L76;
                case 11: goto L61;
                case 12: goto L4e;
                case 13: goto L40;
                case 14: goto L32;
                case 15: goto L25;
                case 16: goto L1b;
                default: goto L19;
            }
        L19:
            goto L136
        L1b:
            float r8 = r6.mCircularAngle
            float r9 = r6.mCircularDistance
            int r9 = (int) r9
            r7.connectCircularConstraint(r2, r8, r9)
            goto L136
        L25:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            int r4 = r6.mMarginBaseline
            int r5 = r6.mMarginBaselineGone
            r0 = r7
            r1 = r3
            r0.immediateConnect(r1, r2, r3, r4, r5)
            goto L136
        L32:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            int r4 = r6.mMarginBaseline
            int r5 = r6.mMarginBaselineGone
            r0 = r7
            r0.immediateConnect(r1, r2, r3, r4, r5)
            goto L136
        L40:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            int r4 = r6.mMarginBaseline
            int r5 = r6.mMarginBaselineGone
            r0 = r7
            r0.immediateConnect(r1, r2, r3, r4, r5)
            goto L136
        L4e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginBottom
            int r1 = r6.mMarginBottomGone
            r7.connect(r8, r0, r1, r9)
            goto L136
        L61:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginBottom
            int r1 = r6.mMarginBottomGone
            r7.connect(r8, r0, r1, r9)
            goto L136
        L76:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginTop
            int r1 = r6.mMarginTopGone
            r7.connect(r8, r0, r1, r9)
            goto L136
        L8b:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginTop
            int r1 = r6.mMarginTopGone
            r7.connect(r8, r0, r1, r9)
            goto L136
        L9e:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginEnd
            int r1 = r6.mMarginEndGone
            r7.connect(r8, r0, r1, r9)
            goto L136
        Lb1:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginEnd
            int r1 = r6.mMarginEndGone
            r7.connect(r8, r0, r1, r9)
            goto L136
        Lc5:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginStart
            int r1 = r6.mMarginStartGone
            r7.connect(r8, r0, r1, r9)
            goto L136
        Ld9:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginStart
            int r1 = r6.mMarginStartGone
            r7.connect(r8, r0, r1, r9)
            goto L136
        Leb:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginRight
            int r1 = r6.mMarginRightGone
            r7.connect(r8, r0, r1, r9)
            goto L136
        Lfd:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginRight
            int r1 = r6.mMarginRightGone
            r7.connect(r8, r0, r1, r9)
            goto L136
        L111:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginLeft
            int r1 = r6.mMarginLeftGone
            r7.connect(r8, r0, r1, r9)
            goto L136
        L125:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r8 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r7.getAnchor(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r2.getAnchor(r8)
            int r0 = r6.mMarginLeft
            int r1 = r6.mMarginLeftGone
            r7.connect(r8, r0, r1, r9)
        L136:
            return
    }

    private void dereference() {
            r1 = this;
            java.lang.Object r0 = r1.mLeftToLeft
            java.lang.Object r0 = r1.get(r0)
            r1.mLeftToLeft = r0
            java.lang.Object r0 = r1.mLeftToRight
            java.lang.Object r0 = r1.get(r0)
            r1.mLeftToRight = r0
            java.lang.Object r0 = r1.mRightToLeft
            java.lang.Object r0 = r1.get(r0)
            r1.mRightToLeft = r0
            java.lang.Object r0 = r1.mRightToRight
            java.lang.Object r0 = r1.get(r0)
            r1.mRightToRight = r0
            java.lang.Object r0 = r1.mStartToStart
            java.lang.Object r0 = r1.get(r0)
            r1.mStartToStart = r0
            java.lang.Object r0 = r1.mStartToEnd
            java.lang.Object r0 = r1.get(r0)
            r1.mStartToEnd = r0
            java.lang.Object r0 = r1.mEndToStart
            java.lang.Object r0 = r1.get(r0)
            r1.mEndToStart = r0
            java.lang.Object r0 = r1.mEndToEnd
            java.lang.Object r0 = r1.get(r0)
            r1.mEndToEnd = r0
            java.lang.Object r0 = r1.mTopToTop
            java.lang.Object r0 = r1.get(r0)
            r1.mTopToTop = r0
            java.lang.Object r0 = r1.mTopToBottom
            java.lang.Object r0 = r1.get(r0)
            r1.mTopToBottom = r0
            java.lang.Object r0 = r1.mBottomToTop
            java.lang.Object r0 = r1.get(r0)
            r1.mBottomToTop = r0
            java.lang.Object r0 = r1.mBottomToBottom
            java.lang.Object r0 = r1.get(r0)
            r1.mBottomToBottom = r0
            java.lang.Object r0 = r1.mBaselineToBaseline
            java.lang.Object r0 = r1.get(r0)
            r1.mBaselineToBaseline = r0
            java.lang.Object r0 = r1.mBaselineToTop
            java.lang.Object r0 = r1.get(r0)
            r1.mBaselineToTop = r0
            java.lang.Object r0 = r1.mBaselineToBottom
            java.lang.Object r0 = r1.get(r0)
            r1.mBaselineToBottom = r0
            return
    }

    private java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            boolean r0 = r2 instanceof androidx.constraintlayout.core.state.ConstraintReference
            if (r0 != 0) goto L12
            androidx.constraintlayout.core.state.State r0 = r1.mState
            java.util.HashMap<java.lang.Object, androidx.constraintlayout.core.state.Reference> r0 = r0.mReferences
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.state.Reference r2 = (androidx.constraintlayout.core.state.Reference) r2
        L12:
            return r2
    }

    private androidx.constraintlayout.core.widgets.ConstraintWidget getTarget(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.constraintlayout.core.state.Reference
            if (r0 == 0) goto Lb
            androidx.constraintlayout.core.state.Reference r2 = (androidx.constraintlayout.core.state.Reference) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.getConstraintWidget()
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public void addCustomColor(java.lang.String r2, int r3) {
            r1 = this;
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r1.mCustomColors
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r2, r3)
            return
    }

    public void addCustomFloat(java.lang.String r2, float r3) {
            r1 = this;
            java.util.HashMap<java.lang.String, java.lang.Float> r0 = r1.mCustomFloats
            if (r0 != 0) goto Lb
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mCustomFloats = r0
        Lb:
            java.util.HashMap<java.lang.String, java.lang.Float> r0 = r1.mCustomFloats
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.put(r2, r3)
            return
    }

    public androidx.constraintlayout.core.state.ConstraintReference alpha(float r1) {
            r0 = this;
            r0.mAlpha = r1
            return r0
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void apply() {
            r5 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.mConstraintWidget
            if (r0 != 0) goto L5
            return
        L5:
            androidx.constraintlayout.core.state.helpers.Facade r0 = r5.mFacade
            if (r0 == 0) goto Lc
            r0.apply()
        Lc:
            androidx.constraintlayout.core.state.Dimension r0 = r5.mHorizontalDimension
            androidx.constraintlayout.core.state.State r1 = r5.mState
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r5.mConstraintWidget
            r3 = 0
            r0.apply(r1, r2, r3)
            androidx.constraintlayout.core.state.Dimension r0 = r5.mVerticalDimension
            androidx.constraintlayout.core.state.State r1 = r5.mState
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r5.mConstraintWidget
            r3 = 1
            r0.apply(r1, r2, r3)
            r5.dereference()
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.mConstraintWidget
            java.lang.Object r1 = r5.mLeftToLeft
            androidx.constraintlayout.core.state.State$Constraint r2 = androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_LEFT
            r5.applyConnection(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.mConstraintWidget
            java.lang.Object r1 = r5.mLeftToRight
            androidx.constraintlayout.core.state.State$Constraint r2 = androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_RIGHT
            r5.applyConnection(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.mConstraintWidget
            java.lang.Object r1 = r5.mRightToLeft
            androidx.constraintlayout.core.state.State$Constraint r2 = androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_LEFT
            r5.applyConnection(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.mConstraintWidget
            java.lang.Object r1 = r5.mRightToRight
            androidx.constraintlayout.core.state.State$Constraint r2 = androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_RIGHT
            r5.applyConnection(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.mConstraintWidget
            java.lang.Object r1 = r5.mStartToStart
            androidx.constraintlayout.core.state.State$Constraint r2 = androidx.constraintlayout.core.state.State.Constraint.START_TO_START
            r5.applyConnection(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.mConstraintWidget
            java.lang.Object r1 = r5.mStartToEnd
            androidx.constraintlayout.core.state.State$Constraint r2 = androidx.constraintlayout.core.state.State.Constraint.START_TO_END
            r5.applyConnection(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.mConstraintWidget
            java.lang.Object r1 = r5.mEndToStart
            androidx.constraintlayout.core.state.State$Constraint r2 = androidx.constraintlayout.core.state.State.Constraint.END_TO_START
            r5.applyConnection(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.mConstraintWidget
            java.lang.Object r1 = r5.mEndToEnd
            androidx.constraintlayout.core.state.State$Constraint r2 = androidx.constraintlayout.core.state.State.Constraint.END_TO_END
            r5.applyConnection(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.mConstraintWidget
            java.lang.Object r1 = r5.mTopToTop
            androidx.constraintlayout.core.state.State$Constraint r2 = androidx.constraintlayout.core.state.State.Constraint.TOP_TO_TOP
            r5.applyConnection(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.mConstraintWidget
            java.lang.Object r1 = r5.mTopToBottom
            androidx.constraintlayout.core.state.State$Constraint r2 = androidx.constraintlayout.core.state.State.Constraint.TOP_TO_BOTTOM
            r5.applyConnection(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.mConstraintWidget
            java.lang.Object r1 = r5.mBottomToTop
            androidx.constraintlayout.core.state.State$Constraint r2 = androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_TOP
            r5.applyConnection(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.mConstraintWidget
            java.lang.Object r1 = r5.mBottomToBottom
            androidx.constraintlayout.core.state.State$Constraint r2 = androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_BOTTOM
            r5.applyConnection(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.mConstraintWidget
            java.lang.Object r1 = r5.mBaselineToBaseline
            androidx.constraintlayout.core.state.State$Constraint r2 = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BASELINE
            r5.applyConnection(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.mConstraintWidget
            java.lang.Object r1 = r5.mBaselineToTop
            androidx.constraintlayout.core.state.State$Constraint r2 = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_TOP
            r5.applyConnection(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.mConstraintWidget
            java.lang.Object r1 = r5.mBaselineToBottom
            androidx.constraintlayout.core.state.State$Constraint r2 = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BOTTOM
            r5.applyConnection(r0, r1, r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.mConstraintWidget
            java.lang.Object r1 = r5.mCircularConstraint
            androidx.constraintlayout.core.state.State$Constraint r2 = androidx.constraintlayout.core.state.State.Constraint.CIRCULAR_CONSTRAINT
            r5.applyConnection(r0, r1, r2)
            int r0 = r5.mHorizontalChainStyle
            if (r0 == 0) goto Lbc
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r5.mConstraintWidget
            r1.setHorizontalChainStyle(r0)
        Lbc:
            int r0 = r5.mVerticalChainStyle
            if (r0 == 0) goto Lc5
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r5.mConstraintWidget
            r1.setVerticalChainStyle(r0)
        Lc5:
            float r0 = r5.mHorizontalChainWeight
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 == 0) goto Ld2
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r5.mConstraintWidget
            r2.setHorizontalWeight(r0)
        Ld2:
            float r0 = r5.mVerticalChainWeight
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto Ldd
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r5.mConstraintWidget
            r1.setVerticalWeight(r0)
        Ldd:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.mConstraintWidget
            float r1 = r5.mHorizontalBias
            r0.setHorizontalBiasPercent(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.mConstraintWidget
            float r1 = r5.mVerticalBias
            r0.setVerticalBiasPercent(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.mConstraintWidget
            androidx.constraintlayout.core.state.WidgetFrame r1 = r0.frame
            float r2 = r5.mPivotX
            r1.pivotX = r2
            float r2 = r5.mPivotY
            r1.pivotY = r2
            float r2 = r5.mRotationX
            r1.rotationX = r2
            float r2 = r5.mRotationY
            r1.rotationY = r2
            float r2 = r5.mRotationZ
            r1.rotationZ = r2
            float r2 = r5.mTranslationX
            r1.translationX = r2
            float r2 = r5.mTranslationY
            r1.translationY = r2
            float r2 = r5.mTranslationZ
            r1.translationZ = r2
            float r2 = r5.mScaleX
            r1.scaleX = r2
            float r2 = r5.mScaleY
            r1.scaleY = r2
            float r2 = r5.mAlpha
            r1.alpha = r2
            int r2 = r5.mVisibility
            r1.visibility = r2
            r0.setVisibility(r2)
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r5.mCustomColors
            if (r0 == 0) goto L150
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L12e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L150
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r5.mCustomColors
            java.lang.Object r2 = r2.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r5.mConstraintWidget
            androidx.constraintlayout.core.state.WidgetFrame r3 = r3.frame
            r4 = 902(0x386, float:1.264E-42)
            int r2 = r2.intValue()
            r3.setCustomAttribute(r1, r4, r2)
            goto L12e
        L150:
            java.util.HashMap<java.lang.String, java.lang.Float> r0 = r5.mCustomFloats
            if (r0 == 0) goto L17e
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L15c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L17e
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.HashMap<java.lang.String, java.lang.Float> r2 = r5.mCustomFloats
            java.lang.Object r2 = r2.get(r1)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r5.mConstraintWidget
            androidx.constraintlayout.core.state.WidgetFrame r3 = r3.frame
            r4 = 901(0x385, float:1.263E-42)
            r3.setCustomAttribute(r1, r4, r2)
            goto L15c
        L17e:
            return
    }

    public androidx.constraintlayout.core.state.ConstraintReference baseline() {
            r1 = this;
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BASELINE
            r1.mLast = r0
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference baselineToBaseline(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BASELINE
            r1.mLast = r0
            r1.mBaselineToBaseline = r2
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference baselineToBottom(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_BOTTOM
            r1.mLast = r0
            r1.mBaselineToBottom = r2
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference baselineToTop(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.BASELINE_TO_TOP
            r1.mLast = r0
            r1.mBaselineToTop = r2
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference bias(float r3) {
            r2 = this;
            androidx.constraintlayout.core.state.State$Constraint r0 = r2.mLast
            if (r0 != 0) goto L5
            return r2
        L5:
            int[] r1 = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 17
            if (r0 == r1) goto L1c
            r1 = 18
            if (r0 == r1) goto L19
            switch(r0) {
                case 1: goto L1c;
                case 2: goto L1c;
                case 3: goto L1c;
                case 4: goto L1c;
                case 5: goto L1c;
                case 6: goto L1c;
                case 7: goto L1c;
                case 8: goto L1c;
                case 9: goto L19;
                case 10: goto L19;
                case 11: goto L19;
                case 12: goto L19;
                default: goto L18;
            }
        L18:
            goto L1e
        L19:
            r2.mVerticalBias = r3
            goto L1e
        L1c:
            r2.mHorizontalBias = r3
        L1e:
            return r2
    }

    public androidx.constraintlayout.core.state.ConstraintReference bottom() {
            r1 = this;
            java.lang.Object r0 = r1.mBottomToTop
            if (r0 == 0) goto L9
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_TOP
            r1.mLast = r0
            goto Ld
        L9:
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_BOTTOM
            r1.mLast = r0
        Ld:
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference bottomToBottom(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_BOTTOM
            r1.mLast = r0
            r1.mBottomToBottom = r2
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference bottomToTop(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_TOP
            r1.mLast = r0
            r1.mBottomToTop = r2
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference centerHorizontally(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            r0.mStartToStart = r1
            r0.mEndToEnd = r1
            androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.CENTER_HORIZONTALLY
            r0.mLast = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.mHorizontalBias = r1
            return r0
    }

    public androidx.constraintlayout.core.state.ConstraintReference centerVertically(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            r0.mTopToTop = r1
            r0.mBottomToBottom = r1
            androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.CENTER_VERTICALLY
            r0.mLast = r1
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.mVerticalBias = r1
            return r0
    }

    public androidx.constraintlayout.core.state.ConstraintReference circularConstraint(java.lang.Object r1, float r2, float r3) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            r0.mCircularConstraint = r1
            r0.mCircularAngle = r2
            r0.mCircularDistance = r3
            androidx.constraintlayout.core.state.State$Constraint r1 = androidx.constraintlayout.core.state.State.Constraint.CIRCULAR_CONSTRAINT
            r0.mLast = r1
            return r0
    }

    public androidx.constraintlayout.core.state.ConstraintReference clear() {
            r4 = this;
            androidx.constraintlayout.core.state.State$Constraint r0 = r4.mLast
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L50
            int[] r3 = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint
            int r0 = r0.ordinal()
            r0 = r3[r0]
            switch(r0) {
                case 1: goto L47;
                case 2: goto L47;
                case 3: goto L3e;
                case 4: goto L3e;
                case 5: goto L35;
                case 6: goto L35;
                case 7: goto L2c;
                case 8: goto L2c;
                case 9: goto L23;
                case 10: goto L23;
                case 11: goto L1a;
                case 12: goto L1a;
                case 13: goto L11;
                case 14: goto L11;
                case 15: goto L17;
                case 16: goto L13;
                default: goto L11;
            }
        L11:
            goto L8a
        L13:
            r4.mCircularConstraint = r2
            goto L8a
        L17:
            r4.mBaselineToBaseline = r2
            goto L8a
        L1a:
            r4.mBottomToTop = r2
            r4.mBottomToBottom = r2
            r4.mMarginBottom = r1
            r4.mMarginBottomGone = r1
            goto L8a
        L23:
            r4.mTopToTop = r2
            r4.mTopToBottom = r2
            r4.mMarginTop = r1
            r4.mMarginTopGone = r1
            goto L8a
        L2c:
            r4.mEndToStart = r2
            r4.mEndToEnd = r2
            r4.mMarginEnd = r1
            r4.mMarginEndGone = r1
            goto L8a
        L35:
            r4.mStartToStart = r2
            r4.mStartToEnd = r2
            r4.mMarginStart = r1
            r4.mMarginStartGone = r1
            goto L8a
        L3e:
            r4.mRightToLeft = r2
            r4.mRightToRight = r2
            r4.mMarginRight = r1
            r4.mMarginRightGone = r1
            goto L8a
        L47:
            r4.mLeftToLeft = r2
            r4.mLeftToRight = r2
            r4.mMarginLeft = r1
            r4.mMarginLeftGone = r1
            goto L8a
        L50:
            r4.mLeftToLeft = r2
            r4.mLeftToRight = r2
            r4.mMarginLeft = r1
            r4.mRightToLeft = r2
            r4.mRightToRight = r2
            r4.mMarginRight = r1
            r4.mStartToStart = r2
            r4.mStartToEnd = r2
            r4.mMarginStart = r1
            r4.mEndToStart = r2
            r4.mEndToEnd = r2
            r4.mMarginEnd = r1
            r4.mTopToTop = r2
            r4.mTopToBottom = r2
            r4.mMarginTop = r1
            r4.mBottomToTop = r2
            r4.mBottomToBottom = r2
            r4.mMarginBottom = r1
            r4.mBaselineToBaseline = r2
            r4.mCircularConstraint = r2
            r0 = 1056964608(0x3f000000, float:0.5)
            r4.mHorizontalBias = r0
            r4.mVerticalBias = r0
            r4.mMarginLeftGone = r1
            r4.mMarginRightGone = r1
            r4.mMarginStartGone = r1
            r4.mMarginEndGone = r1
            r4.mMarginTopGone = r1
            r4.mMarginBottomGone = r1
        L8a:
            return r4
    }

    public androidx.constraintlayout.core.state.ConstraintReference clearHorizontal() {
            r1 = this;
            androidx.constraintlayout.core.state.ConstraintReference r0 = r1.start()
            r0.clear()
            androidx.constraintlayout.core.state.ConstraintReference r0 = r1.end()
            r0.clear()
            androidx.constraintlayout.core.state.ConstraintReference r0 = r1.left()
            r0.clear()
            androidx.constraintlayout.core.state.ConstraintReference r0 = r1.right()
            r0.clear()
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference clearVertical() {
            r1 = this;
            androidx.constraintlayout.core.state.ConstraintReference r0 = r1.top()
            r0.clear()
            androidx.constraintlayout.core.state.ConstraintReference r0 = r1.baseline()
            r0.clear()
            androidx.constraintlayout.core.state.ConstraintReference r0 = r1.bottom()
            r0.clear()
            return r1
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget createConstraintWidget() {
            r3 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = new androidx.constraintlayout.core.widgets.ConstraintWidget
            androidx.constraintlayout.core.state.Dimension r1 = r3.getWidth()
            int r1 = r1.mValue
            androidx.constraintlayout.core.state.Dimension r2 = r3.getHeight()
            int r2 = r2.mValue
            r0.<init>(r1, r2)
            return r0
    }

    public androidx.constraintlayout.core.state.ConstraintReference end() {
            r1 = this;
            java.lang.Object r0 = r1.mEndToStart
            if (r0 == 0) goto L9
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.END_TO_START
            r1.mLast = r0
            goto Ld
        L9:
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.END_TO_END
            r1.mLast = r0
        Ld:
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference endToEnd(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.END_TO_END
            r1.mLast = r0
            r1.mEndToEnd = r2
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference endToStart(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.END_TO_START
            r1.mLast = r0
            r1.mEndToStart = r2
            return r1
    }

    public float getAlpha() {
            r1 = this;
            float r0 = r1.mAlpha
            return r0
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public androidx.constraintlayout.core.widgets.ConstraintWidget getConstraintWidget() {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.mConstraintWidget
            if (r0 != 0) goto Lf
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.createConstraintWidget()
            r2.mConstraintWidget = r0
            java.lang.Object r1 = r2.mView
            r0.setCompanionWidget(r1)
        Lf:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.mConstraintWidget
            return r0
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public androidx.constraintlayout.core.state.helpers.Facade getFacade() {
            r1 = this;
            androidx.constraintlayout.core.state.helpers.Facade r0 = r1.mFacade
            return r0
    }

    public androidx.constraintlayout.core.state.Dimension getHeight() {
            r1 = this;
            androidx.constraintlayout.core.state.Dimension r0 = r1.mVerticalDimension
            return r0
    }

    public int getHorizontalChainStyle() {
            r1 = this;
            int r0 = r1.mHorizontalChainStyle
            return r0
    }

    public float getHorizontalChainWeight() {
            r1 = this;
            float r0 = r1.mHorizontalChainWeight
            return r0
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public java.lang.Object getKey() {
            r1 = this;
            java.lang.Object r0 = r1.key
            return r0
    }

    public float getPivotX() {
            r1 = this;
            float r0 = r1.mPivotX
            return r0
    }

    public float getPivotY() {
            r1 = this;
            float r0 = r1.mPivotY
            return r0
    }

    public float getRotationX() {
            r1 = this;
            float r0 = r1.mRotationX
            return r0
    }

    public float getRotationY() {
            r1 = this;
            float r0 = r1.mRotationY
            return r0
    }

    public float getRotationZ() {
            r1 = this;
            float r0 = r1.mRotationZ
            return r0
    }

    public float getScaleX() {
            r1 = this;
            float r0 = r1.mScaleX
            return r0
    }

    public float getScaleY() {
            r1 = this;
            float r0 = r1.mScaleY
            return r0
    }

    public java.lang.String getTag() {
            r1 = this;
            java.lang.String r0 = r1.mTag
            return r0
    }

    public float getTranslationX() {
            r1 = this;
            float r0 = r1.mTranslationX
            return r0
    }

    public float getTranslationY() {
            r1 = this;
            float r0 = r1.mTranslationY
            return r0
    }

    public float getTranslationZ() {
            r1 = this;
            float r0 = r1.mTranslationZ
            return r0
    }

    public int getVerticalChainStyle(int r1) {
            r0 = this;
            int r1 = r0.mVerticalChainStyle
            return r1
    }

    public float getVerticalChainWeight() {
            r1 = this;
            float r0 = r1.mVerticalChainWeight
            return r0
    }

    public java.lang.Object getView() {
            r1 = this;
            java.lang.Object r0 = r1.mView
            return r0
    }

    public androidx.constraintlayout.core.state.Dimension getWidth() {
            r1 = this;
            androidx.constraintlayout.core.state.Dimension r0 = r1.mHorizontalDimension
            return r0
    }

    public androidx.constraintlayout.core.state.ConstraintReference height(androidx.constraintlayout.core.state.Dimension r1) {
            r0 = this;
            androidx.constraintlayout.core.state.ConstraintReference r1 = r0.setHeight(r1)
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference horizontalBias(float r1) {
            r0 = this;
            r0.mHorizontalBias = r1
            return r0
    }

    public androidx.constraintlayout.core.state.ConstraintReference left() {
            r1 = this;
            java.lang.Object r0 = r1.mLeftToLeft
            if (r0 == 0) goto L9
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_LEFT
            r1.mLast = r0
            goto Ld
        L9:
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_RIGHT
            r1.mLast = r0
        Ld:
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference leftToLeft(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_LEFT
            r1.mLast = r0
            r1.mLeftToLeft = r2
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference leftToRight(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.LEFT_TO_RIGHT
            r1.mLast = r0
            r1.mLeftToRight = r2
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference margin(int r3) {
            r2 = this;
            androidx.constraintlayout.core.state.State$Constraint r0 = r2.mLast
            if (r0 == 0) goto L29
            int[] r1 = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L26;
                case 2: goto L26;
                case 3: goto L23;
                case 4: goto L23;
                case 5: goto L20;
                case 6: goto L20;
                case 7: goto L1d;
                case 8: goto L1d;
                case 9: goto L1a;
                case 10: goto L1a;
                case 11: goto L17;
                case 12: goto L17;
                case 13: goto L14;
                case 14: goto L14;
                case 15: goto L14;
                case 16: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L35
        L10:
            float r3 = (float) r3
            r2.mCircularDistance = r3
            goto L35
        L14:
            r2.mMarginBaseline = r3
            goto L35
        L17:
            r2.mMarginBottom = r3
            goto L35
        L1a:
            r2.mMarginTop = r3
            goto L35
        L1d:
            r2.mMarginEnd = r3
            goto L35
        L20:
            r2.mMarginStart = r3
            goto L35
        L23:
            r2.mMarginRight = r3
            goto L35
        L26:
            r2.mMarginLeft = r3
            goto L35
        L29:
            r2.mMarginLeft = r3
            r2.mMarginRight = r3
            r2.mMarginStart = r3
            r2.mMarginEnd = r3
            r2.mMarginTop = r3
            r2.mMarginBottom = r3
        L35:
            return r2
    }

    public androidx.constraintlayout.core.state.ConstraintReference margin(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State r0 = r1.mState
            int r2 = r0.convertDimension(r2)
            androidx.constraintlayout.core.state.ConstraintReference r2 = r1.margin(r2)
            return r2
    }

    public androidx.constraintlayout.core.state.ConstraintReference marginGone(int r3) {
            r2 = this;
            androidx.constraintlayout.core.state.State$Constraint r0 = r2.mLast
            if (r0 == 0) goto L25
            int[] r1 = androidx.constraintlayout.core.state.ConstraintReference.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L22;
                case 2: goto L22;
                case 3: goto L1f;
                case 4: goto L1f;
                case 5: goto L1c;
                case 6: goto L1c;
                case 7: goto L19;
                case 8: goto L19;
                case 9: goto L16;
                case 10: goto L16;
                case 11: goto L13;
                case 12: goto L13;
                case 13: goto L10;
                case 14: goto L10;
                case 15: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L31
        L10:
            r2.mMarginBaselineGone = r3
            goto L31
        L13:
            r2.mMarginBottomGone = r3
            goto L31
        L16:
            r2.mMarginTopGone = r3
            goto L31
        L19:
            r2.mMarginEndGone = r3
            goto L31
        L1c:
            r2.mMarginStartGone = r3
            goto L31
        L1f:
            r2.mMarginRightGone = r3
            goto L31
        L22:
            r2.mMarginLeftGone = r3
            goto L31
        L25:
            r2.mMarginLeftGone = r3
            r2.mMarginRightGone = r3
            r2.mMarginStartGone = r3
            r2.mMarginEndGone = r3
            r2.mMarginTopGone = r3
            r2.mMarginBottomGone = r3
        L31:
            return r2
    }

    public androidx.constraintlayout.core.state.ConstraintReference marginGone(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State r0 = r1.mState
            int r2 = r0.convertDimension(r2)
            androidx.constraintlayout.core.state.ConstraintReference r2 = r1.marginGone(r2)
            return r2
    }

    public androidx.constraintlayout.core.state.ConstraintReference pivotX(float r1) {
            r0 = this;
            r0.mPivotX = r1
            return r0
    }

    public androidx.constraintlayout.core.state.ConstraintReference pivotY(float r1) {
            r0 = this;
            r0.mPivotY = r1
            return r0
    }

    public androidx.constraintlayout.core.state.ConstraintReference right() {
            r1 = this;
            java.lang.Object r0 = r1.mRightToLeft
            if (r0 == 0) goto L9
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_LEFT
            r1.mLast = r0
            goto Ld
        L9:
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_RIGHT
            r1.mLast = r0
        Ld:
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference rightToLeft(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_LEFT
            r1.mLast = r0
            r1.mRightToLeft = r2
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference rightToRight(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.RIGHT_TO_RIGHT
            r1.mLast = r0
            r1.mRightToRight = r2
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference rotationX(float r1) {
            r0 = this;
            r0.mRotationX = r1
            return r0
    }

    public androidx.constraintlayout.core.state.ConstraintReference rotationY(float r1) {
            r0 = this;
            r0.mRotationY = r1
            return r0
    }

    public androidx.constraintlayout.core.state.ConstraintReference rotationZ(float r1) {
            r0 = this;
            r0.mRotationZ = r1
            return r0
    }

    public androidx.constraintlayout.core.state.ConstraintReference scaleX(float r1) {
            r0 = this;
            r0.mScaleX = r1
            return r0
    }

    public androidx.constraintlayout.core.state.ConstraintReference scaleY(float r1) {
            r0 = this;
            r0.mScaleY = r1
            return r0
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setConstraintWidget(androidx.constraintlayout.core.widgets.ConstraintWidget r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            r1.mConstraintWidget = r2
            java.lang.Object r0 = r1.mView
            r2.setCompanionWidget(r0)
            return
    }

    public void setFacade(androidx.constraintlayout.core.state.helpers.Facade r1) {
            r0 = this;
            r0.mFacade = r1
            if (r1 == 0) goto Lb
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.getConstraintWidget()
            r0.setConstraintWidget(r1)
        Lb:
            return
    }

    public androidx.constraintlayout.core.state.ConstraintReference setHeight(androidx.constraintlayout.core.state.Dimension r1) {
            r0 = this;
            r0.mVerticalDimension = r1
            return r0
    }

    public void setHorizontalChainStyle(int r1) {
            r0 = this;
            r0.mHorizontalChainStyle = r1
            return
    }

    public void setHorizontalChainWeight(float r1) {
            r0 = this;
            r0.mHorizontalChainWeight = r1
            return
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setKey(java.lang.Object r1) {
            r0 = this;
            r0.key = r1
            return
    }

    public void setTag(java.lang.String r1) {
            r0 = this;
            r0.mTag = r1
            return
    }

    public void setVerticalChainStyle(int r1) {
            r0 = this;
            r0.mVerticalChainStyle = r1
            return
    }

    public void setVerticalChainWeight(float r1) {
            r0 = this;
            r0.mVerticalChainWeight = r1
            return
    }

    public void setView(java.lang.Object r2) {
            r1 = this;
            r1.mView = r2
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.mConstraintWidget
            if (r0 == 0) goto L9
            r0.setCompanionWidget(r2)
        L9:
            return
    }

    public androidx.constraintlayout.core.state.ConstraintReference setWidth(androidx.constraintlayout.core.state.Dimension r1) {
            r0 = this;
            r0.mHorizontalDimension = r1
            return r0
    }

    public androidx.constraintlayout.core.state.ConstraintReference start() {
            r1 = this;
            java.lang.Object r0 = r1.mStartToStart
            if (r0 == 0) goto L9
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.START_TO_START
            r1.mLast = r0
            goto Ld
        L9:
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.START_TO_END
            r1.mLast = r0
        Ld:
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference startToEnd(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.START_TO_END
            r1.mLast = r0
            r1.mStartToEnd = r2
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference startToStart(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.START_TO_START
            r1.mLast = r0
            r1.mStartToStart = r2
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference top() {
            r1 = this;
            java.lang.Object r0 = r1.mTopToTop
            if (r0 == 0) goto L9
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.TOP_TO_TOP
            r1.mLast = r0
            goto Ld
        L9:
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.TOP_TO_BOTTOM
            r1.mLast = r0
        Ld:
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference topToBottom(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.TOP_TO_BOTTOM
            r1.mLast = r0
            r1.mTopToBottom = r2
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference topToTop(java.lang.Object r2) {
            r1 = this;
            androidx.constraintlayout.core.state.State$Constraint r0 = androidx.constraintlayout.core.state.State.Constraint.TOP_TO_TOP
            r1.mLast = r0
            r1.mTopToTop = r2
            return r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference translationX(float r1) {
            r0 = this;
            r0.mTranslationX = r1
            return r0
    }

    public androidx.constraintlayout.core.state.ConstraintReference translationY(float r1) {
            r0 = this;
            r0.mTranslationY = r1
            return r0
    }

    public androidx.constraintlayout.core.state.ConstraintReference translationZ(float r1) {
            r0 = this;
            r0.mTranslationZ = r1
            return r0
    }

    public void validate() throws androidx.constraintlayout.core.state.ConstraintReference.IncorrectConstraintException {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r1 = r2.mLeftToLeft
            if (r1 == 0) goto L12
            java.lang.Object r1 = r2.mLeftToRight
            if (r1 == 0) goto L12
            java.lang.String r1 = "LeftToLeft and LeftToRight both defined"
            r0.add(r1)
        L12:
            java.lang.Object r1 = r2.mRightToLeft
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r2.mRightToRight
            if (r1 == 0) goto L1f
            java.lang.String r1 = "RightToLeft and RightToRight both defined"
            r0.add(r1)
        L1f:
            java.lang.Object r1 = r2.mStartToStart
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r2.mStartToEnd
            if (r1 == 0) goto L2c
            java.lang.String r1 = "StartToStart and StartToEnd both defined"
            r0.add(r1)
        L2c:
            java.lang.Object r1 = r2.mEndToStart
            if (r1 == 0) goto L39
            java.lang.Object r1 = r2.mEndToEnd
            if (r1 == 0) goto L39
            java.lang.String r1 = "EndToStart and EndToEnd both defined"
            r0.add(r1)
        L39:
            java.lang.Object r1 = r2.mLeftToLeft
            if (r1 != 0) goto L49
            java.lang.Object r1 = r2.mLeftToRight
            if (r1 != 0) goto L49
            java.lang.Object r1 = r2.mRightToLeft
            if (r1 != 0) goto L49
            java.lang.Object r1 = r2.mRightToRight
            if (r1 == 0) goto L5e
        L49:
            java.lang.Object r1 = r2.mStartToStart
            if (r1 != 0) goto L59
            java.lang.Object r1 = r2.mStartToEnd
            if (r1 != 0) goto L59
            java.lang.Object r1 = r2.mEndToStart
            if (r1 != 0) goto L59
            java.lang.Object r1 = r2.mEndToEnd
            if (r1 == 0) goto L5e
        L59:
            java.lang.String r1 = "Both left/right and start/end constraints defined"
            r0.add(r1)
        L5e:
            int r1 = r0.size()
            if (r1 > 0) goto L65
            return
        L65:
            androidx.constraintlayout.core.state.ConstraintReference$IncorrectConstraintException r1 = new androidx.constraintlayout.core.state.ConstraintReference$IncorrectConstraintException
            r1.<init>(r0)
            throw r1
    }

    public androidx.constraintlayout.core.state.ConstraintReference verticalBias(float r1) {
            r0 = this;
            r0.mVerticalBias = r1
            return r0
    }

    public androidx.constraintlayout.core.state.ConstraintReference visibility(int r1) {
            r0 = this;
            r0.mVisibility = r1
            return r0
    }

    public androidx.constraintlayout.core.state.ConstraintReference width(androidx.constraintlayout.core.state.Dimension r1) {
            r0 = this;
            androidx.constraintlayout.core.state.ConstraintReference r1 = r0.setWidth(r1)
            return r1
    }
}
