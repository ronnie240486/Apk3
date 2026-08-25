package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes2.dex */
public class ConstraintWidget {
    public static final int ANCHOR_BASELINE = 4;
    public static final int ANCHOR_BOTTOM = 3;
    public static final int ANCHOR_LEFT = 0;
    public static final int ANCHOR_RIGHT = 1;
    public static final int ANCHOR_TOP = 2;
    private static final boolean AUTOTAG_CENTER = false;
    public static final int BOTH = 2;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    public static final int UNKNOWN = -1;
    private static final boolean USE_WRAP_DIMENSION_FOR_SPREAD = false;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    private static final int WRAP = -2;
    public static final int WRAP_BEHAVIOR_HORIZONTAL_ONLY = 1;
    public static final int WRAP_BEHAVIOR_INCLUDED = 0;
    public static final int WRAP_BEHAVIOR_SKIPPED = 3;
    public static final int WRAP_BEHAVIOR_VERTICAL_ONLY = 2;
    private boolean OPTIMIZE_WRAP;
    private boolean OPTIMIZE_WRAP_ON_RESOLVED;
    public androidx.constraintlayout.core.state.WidgetFrame frame;
    private boolean hasBaseline;
    public androidx.constraintlayout.core.widgets.analyzer.ChainRun horizontalChainRun;
    public int horizontalGroup;
    public androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun horizontalRun;
    private boolean horizontalSolvingPass;
    private boolean inPlaceholder;
    public boolean[] isTerminalWidget;
    public java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> mAnchors;
    private boolean mAnimated;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mBaseline;
    public int mBaselineDistance;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mBottom;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mCenter;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mCenterX;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mCenterY;
    private float mCircleConstraintAngle;
    private java.lang.Object mCompanionWidget;
    private int mContainerItemSkip;
    private java.lang.String mDebugName;
    public float mDimensionRatio;
    public int mDimensionRatioSide;
    public int mHeight;
    private int mHeightOverride;
    public float mHorizontalBiasPercent;
    public int mHorizontalChainStyle;
    public androidx.constraintlayout.core.widgets.ConstraintWidget mHorizontalNextWidget;
    public int mHorizontalResolution;
    private boolean mInVirtualLayout;
    public boolean mIsHeightWrapContent;
    private boolean[] mIsInBarrier;
    public boolean mIsWidthWrapContent;
    private int mLastHorizontalMeasureSpec;
    private int mLastVerticalMeasureSpec;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mLeft;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor[] mListAnchors;
    public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[] mListDimensionBehaviors;
    public androidx.constraintlayout.core.widgets.ConstraintWidget[] mListNextMatchConstraintsWidget;
    public int mMatchConstraintDefaultHeight;
    public int mMatchConstraintDefaultWidth;
    public int mMatchConstraintMaxHeight;
    public int mMatchConstraintMaxWidth;
    public int mMatchConstraintMinHeight;
    public int mMatchConstraintMinWidth;
    public float mMatchConstraintPercentHeight;
    public float mMatchConstraintPercentWidth;
    private int[] mMaxDimension;
    private boolean mMeasureRequested;
    public int mMinHeight;
    public int mMinWidth;
    public androidx.constraintlayout.core.widgets.ConstraintWidget[] mNextChainWidget;
    public int mOffsetX;
    public int mOffsetY;
    public androidx.constraintlayout.core.widgets.ConstraintWidget mParent;
    public float mResolvedDimensionRatio;
    public int mResolvedDimensionRatioSide;
    public int[] mResolvedMatchConstraintDefault;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mRight;
    public androidx.constraintlayout.core.widgets.ConstraintAnchor mTop;
    private java.lang.String mType;
    public float mVerticalBiasPercent;
    public int mVerticalChainStyle;
    public androidx.constraintlayout.core.widgets.ConstraintWidget mVerticalNextWidget;
    public int mVerticalResolution;
    private int mVisibility;
    public float[] mWeight;
    public int mWidth;
    private int mWidthOverride;
    private int mWrapBehaviorInParent;
    public int mX;
    public int mY;
    public boolean measured;
    private boolean resolvedHorizontal;
    private boolean resolvedVertical;
    public androidx.constraintlayout.core.widgets.analyzer.WidgetRun[] run;
    public java.lang.String stringId;
    public androidx.constraintlayout.core.widgets.analyzer.ChainRun verticalChainRun;
    public int verticalGroup;
    public androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun verticalRun;
    private boolean verticalSolvingPass;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.ConstraintWidget$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type = null;
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour = null;

        static {
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.core.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour = r0
                r1 = 1
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour     // Catch: java.lang.NoSuchFieldError -> L1d
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour     // Catch: java.lang.NoSuchFieldError -> L28
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour     // Catch: java.lang.NoSuchFieldError -> L33
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                androidx.constraintlayout.core.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type = r4
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch: java.lang.NoSuchFieldError -> L44
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r4[r5] = r1     // Catch: java.lang.NoSuchFieldError -> L44
            L44:
                int[] r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L4e
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch: java.lang.NoSuchFieldError -> L4e
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L4e
                r1[r4] = r0     // Catch: java.lang.NoSuchFieldError -> L4e
            L4e:
                int[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L58
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch: java.lang.NoSuchFieldError -> L58
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L58
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L58
            L58:
                int[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L62
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch: java.lang.NoSuchFieldError -> L62
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L62
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L62
            L62:
                int[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L6d
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch: java.lang.NoSuchFieldError -> L6d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6d
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6d
            L6d:
                int[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L78
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L83
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X     // Catch: java.lang.NoSuchFieldError -> L83
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L83
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L83
            L83:
                int[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L8f
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch: java.lang.NoSuchFieldError -> L8f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8f
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8f
            L8f:
                int[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type     // Catch: java.lang.NoSuchFieldError -> L9b
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE     // Catch: java.lang.NoSuchFieldError -> L9b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9b
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9b
            L9b:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final enum DimensionBehaviour extends java.lang.Enum<androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour> {
        private static final /* synthetic */ androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[] $VALUES = null;
        public static final androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour FIXED = null;
        public static final androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour MATCH_CONSTRAINT = null;
        public static final androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour MATCH_PARENT = null;
        public static final androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour WRAP_CONTENT = null;

        static {
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = new androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour
                java.lang.String r1 = "FIXED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED = r0
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = new androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour
                java.lang.String r3 = "WRAP_CONTENT"
                r4 = 1
                r1.<init>(r3, r4)
                androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT = r1
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = new androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour
                java.lang.String r5 = "MATCH_CONSTRAINT"
                r6 = 2
                r3.<init>(r5, r6)
                androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT = r3
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = new androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour
                java.lang.String r7 = "MATCH_PARENT"
                r8 = 3
                r5.<init>(r7, r8)
                androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT = r5
                r7 = 4
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r7 = new androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.$VALUES = r7
                return
        }

        private DimensionBehaviour(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour> r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = (androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour) r1
                return r1
        }

        public static androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[] values() {
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = (androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[]) r0
                return r0
        }
    }

    public ConstraintWidget() {
            r10 = this;
            r10.<init>()
            r0 = 0
            r10.measured = r0
            r1 = 2
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun[] r2 = new androidx.constraintlayout.core.widgets.analyzer.WidgetRun[r1]
            r10.run = r2
            r2 = 0
            r10.horizontalRun = r2
            r10.verticalRun = r2
            boolean[] r3 = new boolean[r1]
            r3 = {x012a: FILL_ARRAY_DATA , data: [1, 1} // fill-array
            r10.isTerminalWidget = r3
            r3 = 1
            r10.mMeasureRequested = r3
            r10.OPTIMIZE_WRAP = r0
            r10.OPTIMIZE_WRAP_ON_RESOLVED = r3
            r4 = -1
            r10.mWidthOverride = r4
            r10.mHeightOverride = r4
            androidx.constraintlayout.core.state.WidgetFrame r5 = new androidx.constraintlayout.core.state.WidgetFrame
            r5.<init>(r10)
            r10.frame = r5
            r10.resolvedHorizontal = r0
            r10.resolvedVertical = r0
            r10.horizontalSolvingPass = r0
            r10.verticalSolvingPass = r0
            r10.mHorizontalResolution = r4
            r10.mVerticalResolution = r4
            r10.mWrapBehaviorInParent = r0
            r10.mMatchConstraintDefaultWidth = r0
            r10.mMatchConstraintDefaultHeight = r0
            int[] r5 = new int[r1]
            r10.mResolvedMatchConstraintDefault = r5
            r10.mMatchConstraintMinWidth = r0
            r10.mMatchConstraintMaxWidth = r0
            r5 = 1065353216(0x3f800000, float:1.0)
            r10.mMatchConstraintPercentWidth = r5
            r10.mMatchConstraintMinHeight = r0
            r10.mMatchConstraintMaxHeight = r0
            r10.mMatchConstraintPercentHeight = r5
            r10.mResolvedDimensionRatioSide = r4
            r10.mResolvedDimensionRatio = r5
            int[] r5 = new int[r1]
            r5 = {x0130: FILL_ARRAY_DATA , data: [2147483647, 2147483647} // fill-array
            r10.mMaxDimension = r5
            r5 = 0
            r10.mCircleConstraintAngle = r5
            r10.hasBaseline = r0
            r10.mInVirtualLayout = r0
            r10.mLastHorizontalMeasureSpec = r0
            r10.mLastVerticalMeasureSpec = r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            r6.<init>(r10, r7)
            r10.mLeft = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            r6.<init>(r10, r7)
            r10.mTop = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            r6.<init>(r10, r7)
            r10.mRight = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            r6.<init>(r10, r7)
            r10.mBottom = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            r6.<init>(r10, r7)
            r10.mBaseline = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            r6.<init>(r10, r7)
            r10.mCenterX = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            r6.<init>(r10, r7)
            r10.mCenterY = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            r6.<init>(r10, r7)
            r10.mCenter = r6
            r7 = 6
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = new androidx.constraintlayout.core.widgets.ConstraintAnchor[r7]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mLeft
            r7[r0] = r8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mRight
            r7[r3] = r8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mTop
            r7[r1] = r8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mBottom
            r9 = 3
            r7[r9] = r8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mBaseline
            r9 = 4
            r7[r9] = r8
            r8 = 5
            r7[r8] = r6
            r10.mListAnchors = r7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r10.mAnchors = r6
            boolean[] r6 = new boolean[r1]
            r10.mIsInBarrier = r6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r6 = new androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6[r0] = r7
            r6[r3] = r7
            r10.mListDimensionBehaviors = r6
            r10.mParent = r2
            r10.mWidth = r0
            r10.mHeight = r0
            r10.mDimensionRatio = r5
            r10.mDimensionRatioSide = r4
            r10.mX = r0
            r10.mY = r0
            r10.mOffsetX = r0
            r10.mOffsetY = r0
            r10.mBaselineDistance = r0
            float r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DEFAULT_BIAS
            r10.mHorizontalBiasPercent = r5
            r10.mVerticalBiasPercent = r5
            r10.mContainerItemSkip = r0
            r10.mVisibility = r0
            r10.mAnimated = r0
            r10.mDebugName = r2
            r10.mType = r2
            r10.mHorizontalChainStyle = r0
            r10.mVerticalChainStyle = r0
            float[] r5 = new float[r1]
            r5 = {x0138: FILL_ARRAY_DATA , data: [-1082130432, -1082130432} // fill-array
            r10.mWeight = r5
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r1]
            r5[r0] = r2
            r5[r3] = r2
            r10.mListNextMatchConstraintsWidget = r5
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r1]
            r1[r0] = r2
            r1[r3] = r2
            r10.mNextChainWidget = r1
            r10.mHorizontalNextWidget = r2
            r10.mVerticalNextWidget = r2
            r10.horizontalGroup = r4
            r10.verticalGroup = r4
            r10.addAnchors()
            return
    }

    public ConstraintWidget(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r0, r2, r3)
            return
    }

    public ConstraintWidget(int r11, int r12, int r13, int r14) {
            r10 = this;
            r10.<init>()
            r0 = 0
            r10.measured = r0
            r1 = 2
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun[] r2 = new androidx.constraintlayout.core.widgets.analyzer.WidgetRun[r1]
            r10.run = r2
            r2 = 0
            r10.horizontalRun = r2
            r10.verticalRun = r2
            boolean[] r3 = new boolean[r1]
            r3 = {x012a: FILL_ARRAY_DATA , data: [1, 1} // fill-array
            r10.isTerminalWidget = r3
            r3 = 1
            r10.mMeasureRequested = r3
            r10.OPTIMIZE_WRAP = r0
            r10.OPTIMIZE_WRAP_ON_RESOLVED = r3
            r4 = -1
            r10.mWidthOverride = r4
            r10.mHeightOverride = r4
            androidx.constraintlayout.core.state.WidgetFrame r5 = new androidx.constraintlayout.core.state.WidgetFrame
            r5.<init>(r10)
            r10.frame = r5
            r10.resolvedHorizontal = r0
            r10.resolvedVertical = r0
            r10.horizontalSolvingPass = r0
            r10.verticalSolvingPass = r0
            r10.mHorizontalResolution = r4
            r10.mVerticalResolution = r4
            r10.mWrapBehaviorInParent = r0
            r10.mMatchConstraintDefaultWidth = r0
            r10.mMatchConstraintDefaultHeight = r0
            int[] r5 = new int[r1]
            r10.mResolvedMatchConstraintDefault = r5
            r10.mMatchConstraintMinWidth = r0
            r10.mMatchConstraintMaxWidth = r0
            r5 = 1065353216(0x3f800000, float:1.0)
            r10.mMatchConstraintPercentWidth = r5
            r10.mMatchConstraintMinHeight = r0
            r10.mMatchConstraintMaxHeight = r0
            r10.mMatchConstraintPercentHeight = r5
            r10.mResolvedDimensionRatioSide = r4
            r10.mResolvedDimensionRatio = r5
            int[] r5 = new int[r1]
            r5 = {x0130: FILL_ARRAY_DATA , data: [2147483647, 2147483647} // fill-array
            r10.mMaxDimension = r5
            r5 = 0
            r10.mCircleConstraintAngle = r5
            r10.hasBaseline = r0
            r10.mInVirtualLayout = r0
            r10.mLastHorizontalMeasureSpec = r0
            r10.mLastVerticalMeasureSpec = r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            r6.<init>(r10, r7)
            r10.mLeft = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            r6.<init>(r10, r7)
            r10.mTop = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            r6.<init>(r10, r7)
            r10.mRight = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            r6.<init>(r10, r7)
            r10.mBottom = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            r6.<init>(r10, r7)
            r10.mBaseline = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            r6.<init>(r10, r7)
            r10.mCenterX = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            r6.<init>(r10, r7)
            r10.mCenterY = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            r6.<init>(r10, r7)
            r10.mCenter = r6
            r7 = 6
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = new androidx.constraintlayout.core.widgets.ConstraintAnchor[r7]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mLeft
            r7[r0] = r8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mRight
            r7[r3] = r8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mTop
            r7[r1] = r8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mBottom
            r9 = 3
            r7[r9] = r8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mBaseline
            r9 = 4
            r7[r9] = r8
            r8 = 5
            r7[r8] = r6
            r10.mListAnchors = r7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r10.mAnchors = r6
            boolean[] r6 = new boolean[r1]
            r10.mIsInBarrier = r6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r6 = new androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6[r0] = r7
            r6[r3] = r7
            r10.mListDimensionBehaviors = r6
            r10.mParent = r2
            r10.mDimensionRatio = r5
            r10.mDimensionRatioSide = r4
            r10.mOffsetX = r0
            r10.mOffsetY = r0
            r10.mBaselineDistance = r0
            float r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DEFAULT_BIAS
            r10.mHorizontalBiasPercent = r5
            r10.mVerticalBiasPercent = r5
            r10.mContainerItemSkip = r0
            r10.mVisibility = r0
            r10.mAnimated = r0
            r10.mDebugName = r2
            r10.mType = r2
            r10.mHorizontalChainStyle = r0
            r10.mVerticalChainStyle = r0
            float[] r5 = new float[r1]
            r5 = {x0138: FILL_ARRAY_DATA , data: [-1082130432, -1082130432} // fill-array
            r10.mWeight = r5
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r1]
            r5[r0] = r2
            r5[r3] = r2
            r10.mListNextMatchConstraintsWidget = r5
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r1]
            r1[r0] = r2
            r1[r3] = r2
            r10.mNextChainWidget = r1
            r10.mHorizontalNextWidget = r2
            r10.mVerticalNextWidget = r2
            r10.horizontalGroup = r4
            r10.verticalGroup = r4
            r10.mX = r11
            r10.mY = r12
            r10.mWidth = r13
            r10.mHeight = r14
            r10.addAnchors()
            return
    }

    public ConstraintWidget(java.lang.String r11) {
            r10 = this;
            r10.<init>()
            r0 = 0
            r10.measured = r0
            r1 = 2
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun[] r2 = new androidx.constraintlayout.core.widgets.analyzer.WidgetRun[r1]
            r10.run = r2
            r2 = 0
            r10.horizontalRun = r2
            r10.verticalRun = r2
            boolean[] r3 = new boolean[r1]
            r3 = {x012e: FILL_ARRAY_DATA , data: [1, 1} // fill-array
            r10.isTerminalWidget = r3
            r3 = 1
            r10.mMeasureRequested = r3
            r10.OPTIMIZE_WRAP = r0
            r10.OPTIMIZE_WRAP_ON_RESOLVED = r3
            r4 = -1
            r10.mWidthOverride = r4
            r10.mHeightOverride = r4
            androidx.constraintlayout.core.state.WidgetFrame r5 = new androidx.constraintlayout.core.state.WidgetFrame
            r5.<init>(r10)
            r10.frame = r5
            r10.resolvedHorizontal = r0
            r10.resolvedVertical = r0
            r10.horizontalSolvingPass = r0
            r10.verticalSolvingPass = r0
            r10.mHorizontalResolution = r4
            r10.mVerticalResolution = r4
            r10.mWrapBehaviorInParent = r0
            r10.mMatchConstraintDefaultWidth = r0
            r10.mMatchConstraintDefaultHeight = r0
            int[] r5 = new int[r1]
            r10.mResolvedMatchConstraintDefault = r5
            r10.mMatchConstraintMinWidth = r0
            r10.mMatchConstraintMaxWidth = r0
            r5 = 1065353216(0x3f800000, float:1.0)
            r10.mMatchConstraintPercentWidth = r5
            r10.mMatchConstraintMinHeight = r0
            r10.mMatchConstraintMaxHeight = r0
            r10.mMatchConstraintPercentHeight = r5
            r10.mResolvedDimensionRatioSide = r4
            r10.mResolvedDimensionRatio = r5
            int[] r5 = new int[r1]
            r5 = {x0134: FILL_ARRAY_DATA , data: [2147483647, 2147483647} // fill-array
            r10.mMaxDimension = r5
            r5 = 0
            r10.mCircleConstraintAngle = r5
            r10.hasBaseline = r0
            r10.mInVirtualLayout = r0
            r10.mLastHorizontalMeasureSpec = r0
            r10.mLastVerticalMeasureSpec = r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            r6.<init>(r10, r7)
            r10.mLeft = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            r6.<init>(r10, r7)
            r10.mTop = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            r6.<init>(r10, r7)
            r10.mRight = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            r6.<init>(r10, r7)
            r10.mBottom = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            r6.<init>(r10, r7)
            r10.mBaseline = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            r6.<init>(r10, r7)
            r10.mCenterX = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            r6.<init>(r10, r7)
            r10.mCenterY = r6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = new androidx.constraintlayout.core.widgets.ConstraintAnchor
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r7 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            r6.<init>(r10, r7)
            r10.mCenter = r6
            r7 = 6
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r7 = new androidx.constraintlayout.core.widgets.ConstraintAnchor[r7]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mLeft
            r7[r0] = r8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mRight
            r7[r3] = r8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mTop
            r7[r1] = r8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mBottom
            r9 = 3
            r7[r9] = r8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r10.mBaseline
            r9 = 4
            r7[r9] = r8
            r8 = 5
            r7[r8] = r6
            r10.mListAnchors = r7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r10.mAnchors = r6
            boolean[] r6 = new boolean[r1]
            r10.mIsInBarrier = r6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r6 = new androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6[r0] = r7
            r6[r3] = r7
            r10.mListDimensionBehaviors = r6
            r10.mParent = r2
            r10.mWidth = r0
            r10.mHeight = r0
            r10.mDimensionRatio = r5
            r10.mDimensionRatioSide = r4
            r10.mX = r0
            r10.mY = r0
            r10.mOffsetX = r0
            r10.mOffsetY = r0
            r10.mBaselineDistance = r0
            float r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DEFAULT_BIAS
            r10.mHorizontalBiasPercent = r5
            r10.mVerticalBiasPercent = r5
            r10.mContainerItemSkip = r0
            r10.mVisibility = r0
            r10.mAnimated = r0
            r10.mDebugName = r2
            r10.mType = r2
            r10.mHorizontalChainStyle = r0
            r10.mVerticalChainStyle = r0
            float[] r5 = new float[r1]
            r5 = {x013c: FILL_ARRAY_DATA , data: [-1082130432, -1082130432} // fill-array
            r10.mWeight = r5
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r1]
            r5[r0] = r2
            r5[r3] = r2
            r10.mListNextMatchConstraintsWidget = r5
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r1]
            r1[r0] = r2
            r1[r3] = r2
            r10.mNextChainWidget = r1
            r10.mHorizontalNextWidget = r2
            r10.mVerticalNextWidget = r2
            r10.horizontalGroup = r4
            r10.verticalGroup = r4
            r10.addAnchors()
            r10.setDebugName(r11)
            return
    }

    public ConstraintWidget(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r0.setDebugName(r1)
            return
    }

    public ConstraintWidget(java.lang.String r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r0.<init>(r2, r3, r4, r5)
            r0.setDebugName(r1)
            return
    }

    private void addAnchors() {
            r2 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mLeft
            r0.add(r1)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mTop
            r0.add(r1)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mRight
            r0.add(r1)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mBottom
            r0.add(r1)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mCenterX
            r0.add(r1)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mCenterY
            r0.add(r1)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mCenter
            r0.add(r1)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r2.mAnchors
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r2.mBaseline
            r0.add(r1)
            return
    }

    private void applyConstraints(androidx.constraintlayout.core.LinearSystem r32, boolean r33, boolean r34, boolean r35, boolean r36, androidx.constraintlayout.core.SolverVariable r37, androidx.constraintlayout.core.SolverVariable r38, androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r39, boolean r40, androidx.constraintlayout.core.widgets.ConstraintAnchor r41, androidx.constraintlayout.core.widgets.ConstraintAnchor r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, int r53, int r54, int r55, int r56, float r57, boolean r58) {
            r31 = this;
            r0 = r31
            r10 = r32
            r11 = r37
            r12 = r38
            r13 = r41
            r14 = r42
            r15 = r45
            r1 = r46
            r2 = r54
            r3 = r55
            r4 = r56
            androidx.constraintlayout.core.SolverVariable r9 = r10.createObjectVariable(r13)
            androidx.constraintlayout.core.SolverVariable r8 = r10.createObjectVariable(r14)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r41.getTarget()
            androidx.constraintlayout.core.SolverVariable r7 = r10.createObjectVariable(r5)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r42.getTarget()
            androidx.constraintlayout.core.SolverVariable r6 = r10.createObjectVariable(r5)
            androidx.constraintlayout.core.Metrics r5 = androidx.constraintlayout.core.LinearSystem.getMetrics()
            if (r5 == 0) goto L40
            androidx.constraintlayout.core.Metrics r5 = androidx.constraintlayout.core.LinearSystem.getMetrics()
            long r11 = r5.nonresolvedWidgets
            r16 = 1
            long r11 = r11 + r16
            r5.nonresolvedWidgets = r11
        L40:
            boolean r11 = r41.isConnected()
            boolean r12 = r42.isConnected()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r0.mCenter
            boolean r16 = r5.isConnected()
            if (r12 == 0) goto L53
            int r5 = r11 + 1
            goto L54
        L53:
            r5 = r11
        L54:
            if (r16 == 0) goto L58
            int r5 = r5 + 1
        L58:
            if (r48 == 0) goto L5d
            r18 = 3
            goto L5f
        L5d:
            r18 = r53
        L5f:
            int[] r17 = androidx.constraintlayout.core.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintWidget$DimensionBehaviour
            int r19 = r39.ordinal()
            r2 = r17[r19]
            r14 = 1
            if (r2 == r14) goto L73
            r14 = 2
            if (r2 == r14) goto L73
            r14 = 3
            if (r2 == r14) goto L73
            r14 = 4
            if (r2 == r14) goto L78
        L73:
            r2 = r18
        L75:
            r18 = 0
            goto L7e
        L78:
            r2 = r18
            if (r2 == r14) goto L75
            r18 = 1
        L7e:
            int r14 = r0.mWidthOverride
            r13 = -1
            if (r14 == r13) goto L8c
            if (r33 == 0) goto L8c
            r0.mWidthOverride = r13
            r21 = r6
            r18 = 0
            goto L90
        L8c:
            r14 = r44
            r21 = r6
        L90:
            int r6 = r0.mHeightOverride
            if (r6 == r13) goto L9b
            if (r33 != 0) goto L9b
            r0.mHeightOverride = r13
            r14 = r6
            r18 = 0
        L9b:
            int r6 = r0.mVisibility
            r13 = 8
            if (r6 != r13) goto La4
            r14 = 0
            r18 = 0
        La4:
            if (r58 == 0) goto Lbd
            if (r11 != 0) goto Lb2
            if (r12 != 0) goto Lb2
            if (r16 != 0) goto Lb2
            r6 = r43
            r10.addEquality(r9, r6)
            goto Lbd
        Lb2:
            if (r11 == 0) goto Lbd
            if (r12 != 0) goto Lbd
            int r6 = r41.getMargin()
            r10.addEquality(r9, r7, r6, r13)
        Lbd:
            if (r18 != 0) goto Leb
            if (r40 == 0) goto Ld6
            r6 = 3
            r13 = 0
            r10.addEquality(r8, r9, r13, r6)
            r6 = 8
            if (r15 <= 0) goto Lcd
            r10.addGreaterThan(r8, r9, r15, r6)
        Lcd:
            r14 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r14) goto Ldc
            r10.addLowerThan(r8, r9, r1, r6)
            goto Ldc
        Ld6:
            r6 = 8
            r13 = 0
            r10.addEquality(r8, r9, r14, r6)
        Ldc:
            r1 = r4
            r40 = r5
            r13 = r7
            r15 = r8
            r23 = r18
            r14 = r21
            r18 = r36
        Le7:
            r21 = r3
            goto L1ea
        Leb:
            r1 = 2
            r13 = 0
            if (r5 == r1) goto L111
            if (r48 != 0) goto L111
            r1 = 1
            if (r2 == r1) goto Lf6
            if (r2 != 0) goto L111
        Lf6:
            int r1 = java.lang.Math.max(r3, r14)
            if (r4 <= 0) goto L100
            int r1 = java.lang.Math.min(r4, r1)
        L100:
            r6 = 8
            r10.addEquality(r8, r9, r1, r6)
            r18 = r36
            r1 = r4
            r40 = r5
            r13 = r7
            r15 = r8
            r14 = r21
            r23 = 0
            goto Le7
        L111:
            r1 = -2
            if (r3 != r1) goto L116
            r6 = r14
            goto L117
        L116:
            r6 = r3
        L117:
            if (r4 != r1) goto L11b
            r1 = r14
            goto L11c
        L11b:
            r1 = r4
        L11c:
            if (r14 <= 0) goto L122
            r3 = 1
            if (r2 == r3) goto L122
            r14 = 0
        L122:
            if (r6 <= 0) goto L12d
            r3 = 8
            r10.addGreaterThan(r8, r9, r6, r3)
            int r14 = java.lang.Math.max(r14, r6)
        L12d:
            if (r1 <= 0) goto L146
            if (r34 == 0) goto L136
            r3 = 1
            if (r2 != r3) goto L136
            r3 = 0
            goto L137
        L136:
            r3 = 1
        L137:
            if (r3 == 0) goto L13f
            r3 = 8
            r10.addLowerThan(r8, r9, r1, r3)
            goto L141
        L13f:
            r3 = 8
        L141:
            int r14 = java.lang.Math.min(r14, r1)
            goto L148
        L146:
            r3 = 8
        L148:
            r4 = 1
            if (r2 != r4) goto L171
            if (r34 == 0) goto L152
            r10.addEquality(r8, r9, r14, r3)
            r4 = 5
            goto L163
        L152:
            if (r50 == 0) goto L15c
            r4 = 5
            r10.addEquality(r8, r9, r14, r4)
            r10.addLowerThan(r8, r9, r14, r3)
            goto L163
        L15c:
            r4 = 5
            r10.addEquality(r8, r9, r14, r4)
            r10.addLowerThan(r8, r9, r14, r3)
        L163:
            r40 = r5
            r13 = r7
            r15 = r8
            r23 = r18
            r14 = r21
            r18 = r36
            r21 = r6
            goto L1ea
        L171:
            r4 = 5
            r14 = 2
            if (r2 != r14) goto L1de
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = r41.getType()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            if (r3 == r4) goto L19f
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = r41.getType()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r13 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r3 != r13) goto L186
            goto L19f
        L186:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.getAnchor(r4)
            androidx.constraintlayout.core.SolverVariable r3 = r10.createObjectVariable(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r0.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r13 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getAnchor(r13)
            androidx.constraintlayout.core.SolverVariable r4 = r10.createObjectVariable(r4)
            goto L1b5
        L19f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.getAnchor(r4)
            androidx.constraintlayout.core.SolverVariable r3 = r10.createObjectVariable(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r0.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r13 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getAnchor(r13)
            androidx.constraintlayout.core.SolverVariable r4 = r10.createObjectVariable(r4)
        L1b5:
            r23 = r3
            r13 = r4
            androidx.constraintlayout.core.ArrayRow r3 = r32.createRow()
            r24 = 5
            r4 = r8
            r14 = r5
            r5 = r9
            r40 = r14
            r14 = r21
            r21 = r6
            r6 = r13
            r13 = r7
            r7 = r23
            r15 = r8
            r8 = r57
            androidx.constraintlayout.core.ArrayRow r3 = r3.createRowDimensionRatio(r4, r5, r6, r7, r8)
            r10.addConstraint(r3)
            if (r34 == 0) goto L1d9
            r18 = 0
        L1d9:
            r23 = r18
            r18 = r36
            goto L1ea
        L1de:
            r40 = r5
            r13 = r7
            r15 = r8
            r14 = r21
            r21 = r6
            r23 = r18
            r18 = 1
        L1ea:
            if (r58 == 0) goto L4fc
            if (r50 == 0) goto L1fa
            r1 = r37
            r4 = r38
            r5 = r40
            r2 = r15
            r3 = 0
            r6 = 2
            r15 = r9
            goto L506
        L1fa:
            if (r11 != 0) goto L202
            if (r12 != 0) goto L202
            if (r16 != 0) goto L202
            goto L4c4
        L202:
            if (r11 == 0) goto L21e
            if (r12 != 0) goto L21e
            r7 = r41
            r8 = 0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r7.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.mOwner
            if (r34 == 0) goto L216
            boolean r1 = r1 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r1 == 0) goto L216
            r13 = 8
            goto L217
        L216:
            r13 = 5
        L217:
            r22 = r34
            r6 = r13
            r2 = r15
            r3 = 0
            goto L4ca
        L21e:
            r7 = r41
            r8 = 0
            if (r11 != 0) goto L254
            if (r12 == 0) goto L254
            int r1 = r42.getMargin()
            int r1 = -r1
            r2 = 8
            r10.addEquality(r15, r14, r1, r2)
            if (r34 == 0) goto L4c4
            boolean r1 = r0.OPTIMIZE_WRAP
            if (r1 == 0) goto L24b
            boolean r1 = r9.isFinalValue
            if (r1 == 0) goto L24b
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.mParent
            if (r1 == 0) goto L24b
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r1 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r1
            if (r33 == 0) goto L246
            r1.addHorizontalWrapMinVariable(r7)
            goto L4c4
        L246:
            r1.addVerticalWrapMinVariable(r7)
            goto L4c4
        L24b:
            r6 = r37
            r1 = 5
            r10.addGreaterThan(r9, r6, r8, r1)
            r2 = r15
            goto L4c6
        L254:
            r6 = r37
            if (r11 == 0) goto L4c4
            if (r12 == 0) goto L4c4
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r7.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r3.mOwner
            r12 = r42
            r3 = 2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r12.mTarget
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r4.mOwner
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r31.getParent()
            r16 = 6
            if (r23 == 0) goto L357
            if (r2 != 0) goto L2c1
            if (r1 != 0) goto L298
            if (r21 != 0) goto L298
            boolean r1 = r13.isFinalValue
            if (r1 == 0) goto L28d
            boolean r1 = r14.isFinalValue
            if (r1 == 0) goto L28d
            int r1 = r41.getMargin()
            r2 = 8
            r10.addEquality(r9, r13, r1, r2)
            int r1 = r42.getMargin()
            int r1 = -r1
            r10.addEquality(r15, r14, r1, r2)
            return
        L28d:
            r1 = 8
            r3 = 8
            r19 = 0
            r22 = 1
            r24 = 0
            goto L2a0
        L298:
            r1 = 5
            r3 = 5
            r19 = 1
            r22 = 0
            r24 = 1
        L2a0:
            boolean r8 = r11 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r8 != 0) goto L2b5
            boolean r8 = r5 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r8 == 0) goto L2a9
            goto L2b5
        L2a9:
            r8 = r38
            r25 = r22
            r22 = r19
            r19 = r3
        L2b1:
            r3 = r1
            r1 = 6
            goto L3a1
        L2b5:
            r8 = r38
            r3 = r1
            r25 = r22
            r1 = 6
            r22 = r19
            r19 = 4
            goto L3a1
        L2c1:
            if (r2 != r3) goto L2d8
            boolean r1 = r11 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r1 != 0) goto L2d4
            boolean r1 = r5 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r1 == 0) goto L2cc
            goto L2d4
        L2cc:
            r8 = r38
            r1 = 6
            r3 = 5
            r19 = 5
            goto L39b
        L2d4:
            r8 = r38
            goto L397
        L2d8:
            r8 = 1
            if (r2 != r8) goto L2e2
            r8 = r38
            r1 = 6
            r3 = 8
            goto L399
        L2e2:
            r8 = 3
            if (r2 != r8) goto L34c
            int r8 = r0.mResolvedDimensionRatioSide
            r3 = -1
            if (r8 != r3) goto L304
            if (r51 == 0) goto L2f4
            r8 = r38
            if (r34 == 0) goto L2f2
            r1 = 5
            goto L2f8
        L2f2:
            r1 = 4
            goto L2f8
        L2f4:
            r8 = r38
            r1 = 8
        L2f8:
            r3 = 8
        L2fa:
            r19 = 5
        L2fc:
            r22 = 1
            r24 = 1
            r25 = 1
            goto L3a1
        L304:
            if (r48 == 0) goto L325
            r3 = r54
            r8 = 2
            if (r3 == r8) goto L311
            r1 = 1
            if (r3 != r1) goto L30f
            goto L311
        L30f:
            r1 = 0
            goto L312
        L311:
            r1 = 1
        L312:
            if (r1 != 0) goto L318
            r1 = 8
            r3 = 5
            goto L31a
        L318:
            r1 = 5
            r3 = 4
        L31a:
            r8 = r38
            r19 = r3
            r22 = 1
            r24 = 1
            r25 = 1
            goto L2b1
        L325:
            if (r1 <= 0) goto L32c
            r8 = r38
            r1 = 6
            r3 = 5
            goto L2fa
        L32c:
            if (r1 != 0) goto L345
            if (r21 != 0) goto L345
            if (r51 != 0) goto L339
            r8 = r38
            r1 = 6
            r3 = 5
            r19 = 8
            goto L2fc
        L339:
            if (r11 == r4) goto L33f
            if (r5 == r4) goto L33f
            r1 = 4
            goto L340
        L33f:
            r1 = 5
        L340:
            r8 = r38
            r3 = r1
            r1 = 6
            goto L349
        L345:
            r8 = r38
            r1 = 6
            r3 = 5
        L349:
            r19 = 4
            goto L2fc
        L34c:
            r8 = r38
            r1 = 6
            r3 = 5
            r19 = 4
            r22 = 0
            r24 = 0
            goto L39f
        L357:
            boolean r1 = r13.isFinalValue
            if (r1 == 0) goto L2d4
            boolean r1 = r14.isFinalValue
            if (r1 == 0) goto L2d4
            int r1 = r41.getMargin()
            int r2 = r42.getMargin()
            r3 = 8
            r48 = r32
            r49 = r9
            r50 = r13
            r51 = r1
            r52 = r47
            r53 = r14
            r54 = r15
            r55 = r2
            r56 = r3
            r48.addCentering(r49, r50, r51, r52, r53, r54, r55, r56)
            if (r34 == 0) goto L396
            if (r18 == 0) goto L396
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r12.mTarget
            if (r1 == 0) goto L38d
            int r13 = r42.getMargin()
            r8 = r38
            goto L390
        L38d:
            r8 = r38
            r13 = 0
        L390:
            if (r14 == r8) goto L396
            r1 = 5
            r10.addGreaterThan(r8, r15, r13, r1)
        L396:
            return
        L397:
            r1 = 6
            r3 = 5
        L399:
            r19 = 4
        L39b:
            r22 = 1
            r24 = 1
        L39f:
            r25 = 0
        L3a1:
            if (r24 == 0) goto L3ac
            if (r13 != r14) goto L3ac
            if (r11 == r4) goto L3ac
            r24 = 0
            r26 = 0
            goto L3ae
        L3ac:
            r26 = 1
        L3ae:
            if (r22 == 0) goto L3f4
            if (r23 != 0) goto L3c3
            if (r49 != 0) goto L3c3
            if (r51 != 0) goto L3c3
            if (r13 != r6) goto L3c3
            if (r14 != r8) goto L3c3
            r22 = 0
            r26 = 8
            r27 = 8
            r28 = 0
            goto L3cb
        L3c3:
            r22 = r34
            r27 = r1
            r28 = r26
            r26 = r3
        L3cb:
            int r29 = r41.getMargin()
            int r30 = r42.getMargin()
            r1 = r32
            r3 = r2
            r2 = r9
            r12 = r3
            r3 = r13
            r39 = r12
            r12 = r4
            r4 = r29
            r29 = r12
            r12 = r5
            r5 = r47
            r6 = r14
            r7 = r15
            r8 = r30
            r20 = r15
            r15 = r9
            r9 = r27
            r1.addCentering(r2, r3, r4, r5, r6, r7, r8, r9)
            r3 = r26
            r26 = r28
            goto L3fe
        L3f4:
            r39 = r2
            r29 = r4
            r12 = r5
            r20 = r15
            r15 = r9
            r22 = r34
        L3fe:
            int r1 = r0.mVisibility
            r2 = 8
            if (r1 != r2) goto L40b
            boolean r1 = r42.hasDependents()
            if (r1 != 0) goto L40b
            return
        L40b:
            if (r24 == 0) goto L42e
            if (r22 == 0) goto L41c
            if (r13 == r14) goto L41c
            if (r23 != 0) goto L41c
            boolean r1 = r11 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r1 != 0) goto L41b
            boolean r1 = r12 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r1 == 0) goto L41c
        L41b:
            r3 = 6
        L41c:
            int r1 = r41.getMargin()
            r10.addGreaterThan(r15, r13, r1, r3)
            int r1 = r42.getMargin()
            int r1 = -r1
            r2 = r20
            r10.addLowerThan(r2, r14, r1, r3)
            goto L430
        L42e:
            r2 = r20
        L430:
            if (r22 == 0) goto L445
            if (r52 == 0) goto L445
            boolean r1 = r11 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r1 != 0) goto L445
            boolean r1 = r12 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r1 != 0) goto L445
            r1 = r29
            if (r12 == r1) goto L447
            r3 = 6
            r4 = 6
            r26 = 1
            goto L449
        L445:
            r1 = r29
        L447:
            r4 = r19
        L449:
            if (r26 == 0) goto L492
            if (r25 == 0) goto L472
            if (r51 == 0) goto L451
            if (r35 == 0) goto L472
        L451:
            if (r11 == r1) goto L458
            if (r12 != r1) goto L456
            goto L458
        L456:
            r6 = r4
            goto L459
        L458:
            r6 = 6
        L459:
            boolean r5 = r11 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r5 != 0) goto L461
            boolean r5 = r12 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r5 == 0) goto L462
        L461:
            r6 = 5
        L462:
            boolean r5 = r11 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r5 != 0) goto L46a
            boolean r5 = r12 instanceof androidx.constraintlayout.core.widgets.Barrier
            if (r5 == 0) goto L46b
        L46a:
            r6 = 5
        L46b:
            if (r51 == 0) goto L46e
            r6 = 5
        L46e:
            int r4 = java.lang.Math.max(r6, r4)
        L472:
            if (r22 == 0) goto L483
            int r3 = java.lang.Math.min(r3, r4)
            if (r48 == 0) goto L482
            if (r51 != 0) goto L482
            if (r11 == r1) goto L480
            if (r12 != r1) goto L482
        L480:
            r4 = 4
            goto L483
        L482:
            r4 = r3
        L483:
            int r1 = r41.getMargin()
            r10.addEquality(r15, r13, r1, r4)
            int r1 = r42.getMargin()
            int r1 = -r1
            r10.addEquality(r2, r14, r1, r4)
        L492:
            if (r22 == 0) goto L4a4
            r1 = r37
            if (r1 != r13) goto L49d
            int r3 = r41.getMargin()
            goto L49e
        L49d:
            r3 = 0
        L49e:
            if (r13 == r1) goto L4a4
            r4 = 5
            r10.addGreaterThan(r15, r1, r3, r4)
        L4a4:
            if (r22 == 0) goto L4c1
            if (r23 == 0) goto L4c1
            if (r45 != 0) goto L4c1
            if (r21 != 0) goto L4c1
            if (r23 == 0) goto L4bb
            r1 = r39
            r3 = 3
            if (r1 != r3) goto L4bb
            r1 = 8
            r3 = 0
            r10.addGreaterThan(r2, r15, r3, r1)
            r1 = 5
            goto L4c9
        L4bb:
            r3 = 0
            r1 = 5
            r10.addGreaterThan(r2, r15, r3, r1)
            goto L4c9
        L4c1:
            r1 = 5
            r3 = 0
            goto L4c9
        L4c4:
            r2 = r15
            r1 = 5
        L4c6:
            r3 = 0
            r22 = r34
        L4c9:
            r6 = 5
        L4ca:
            if (r22 == 0) goto L4fb
            if (r18 == 0) goto L4fb
            r1 = r42
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r1.mTarget
            if (r4 == 0) goto L4db
            int r13 = r42.getMargin()
            r4 = r38
            goto L4de
        L4db:
            r4 = r38
            r13 = 0
        L4de:
            if (r14 == r4) goto L4fb
            boolean r3 = r0.OPTIMIZE_WRAP
            if (r3 == 0) goto L4f8
            boolean r3 = r2.isFinalValue
            if (r3 == 0) goto L4f8
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.mParent
            if (r3 == 0) goto L4f8
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r3 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r3
            if (r33 == 0) goto L4f4
            r3.addHorizontalWrapMaxVariable(r1)
            goto L4f7
        L4f4:
            r3.addVerticalWrapMaxVariable(r1)
        L4f7:
            return
        L4f8:
            r10.addGreaterThan(r4, r2, r13, r6)
        L4fb:
            return
        L4fc:
            r1 = r37
            r4 = r38
            r2 = r15
            r3 = 0
            r15 = r9
            r5 = r40
            r6 = 2
        L506:
            if (r5 >= r6) goto L547
            if (r34 == 0) goto L547
            if (r18 == 0) goto L547
            r5 = 8
            r10.addGreaterThan(r15, r1, r3, r5)
            if (r33 != 0) goto L51c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 != 0) goto L51a
            goto L51c
        L51a:
            r13 = 0
            goto L51d
        L51c:
            r13 = 1
        L51d:
            if (r33 != 0) goto L53f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L53f
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.mOwner
            float r5 = r1.mDimensionRatio
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 == 0) goto L53d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r1.mListDimensionBehaviors
            r5 = r1[r3]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r6) goto L53d
            r5 = 1
            r1 = r1[r5]
            if (r1 != r6) goto L53d
            r14 = 1
            goto L540
        L53d:
            r14 = 0
            goto L540
        L53f:
            r14 = r13
        L540:
            if (r14 == 0) goto L547
            r1 = 8
            r10.addGreaterThan(r4, r2, r3, r1)
        L547:
            return
    }

    private void getSceneString(java.lang.StringBuilder r1, java.lang.String r2, int r3, int r4, int r5, int r6, int r7, int r8, float r9, float r10) {
            r0 = this;
            r1.append(r2)
            java.lang.String r2 = " :  {\n"
            r1.append(r2)
            java.lang.String r2 = "      size"
            r6 = 0
            r0.serializeAttribute(r1, r2, r3, r6)
            java.lang.String r2 = "      min"
            r0.serializeAttribute(r1, r2, r4, r6)
            java.lang.String r2 = "      max"
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0.serializeAttribute(r1, r2, r5, r3)
            java.lang.String r2 = "      matchMin"
            r0.serializeAttribute(r1, r2, r7, r6)
            java.lang.String r2 = "      matchDef"
            r0.serializeAttribute(r1, r2, r8, r6)
            java.lang.String r2 = "      matchPercent"
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.serializeAttribute(r1, r2, r9, r3)
            java.lang.String r2 = "    },\n"
            r1.append(r2)
            return
    }

    private void getSceneString(java.lang.StringBuilder r3, java.lang.String r4, androidx.constraintlayout.core.widgets.ConstraintAnchor r5) {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r5.mTarget
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "    "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = " : [ '"
            r3.append(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r5.mTarget
            r3.append(r4)
            java.lang.String r4 = "'"
            r3.append(r4)
            int r4 = r5.mGoneMargin
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r0) goto L26
            int r4 = r5.mMargin
            if (r4 == 0) goto L3f
        L26:
            java.lang.String r4 = ","
            r3.append(r4)
            int r1 = r5.mMargin
            r3.append(r1)
            int r1 = r5.mGoneMargin
            if (r1 == r0) goto L3f
            r3.append(r4)
            int r5 = r5.mGoneMargin
            r3.append(r5)
            r3.append(r4)
        L3f:
            java.lang.String r4 = " ] ,\n"
            r3.append(r4)
            return
    }

    private boolean isChainHead(int r5) {
            r4 = this;
            int r5 = r5 * 2
            androidx.constraintlayout.core.widgets.ConstraintAnchor[] r0 = r4.mListAnchors
            r1 = r0[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            r2 = 1
            if (r1 == 0) goto L27
            r1 = r0[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            r3 = r0[r5]
            if (r1 == r3) goto L27
            int r5 = r5 + r2
            r1 = r0[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == 0) goto L27
            r1 = r0[r5]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            r5 = r0[r5]
            if (r1 != r5) goto L27
            goto L28
        L27:
            r2 = 0
        L28:
            return r2
    }

    private void serializeAnchor(java.lang.StringBuilder r2, java.lang.String r3, androidx.constraintlayout.core.widgets.ConstraintAnchor r4) {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r4.mTarget
            if (r0 != 0) goto L5
            return
        L5:
            r2.append(r3)
            java.lang.String r3 = " : [ '"
            r2.append(r3)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r4.mTarget
            r2.append(r3)
            java.lang.String r3 = "',"
            r2.append(r3)
            int r3 = r4.mMargin
            r2.append(r3)
            java.lang.String r3 = ","
            r2.append(r3)
            int r4 = r4.mGoneMargin
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = " ] ,\n"
            r2.append(r3)
            return
    }

    private void serializeAttribute(java.lang.StringBuilder r1, java.lang.String r2, float r3, float r4) {
            r0 = this;
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 != 0) goto L5
            return
        L5:
            r1.append(r2)
            java.lang.String r2 = " :   "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ",\n"
            r1.append(r2)
            return
    }

    private void serializeAttribute(java.lang.StringBuilder r1, java.lang.String r2, int r3, int r4) {
            r0 = this;
            if (r3 != r4) goto L3
            return
        L3:
            r1.append(r2)
            java.lang.String r2 = " :   "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ",\n"
            r1.append(r2)
            return
    }

    private void serializeCircle(java.lang.StringBuilder r2, androidx.constraintlayout.core.widgets.ConstraintAnchor r3, float r4) {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "circle : [ '"
            r2.append(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.mTarget
            r2.append(r0)
            java.lang.String r0 = "',"
            r2.append(r0)
            int r3 = r3.mMargin
            r2.append(r3)
            java.lang.String r3 = ","
            r2.append(r3)
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = " ] ,\n"
            r2.append(r3)
            return
    }

    private void serializeDimensionRatio(java.lang.StringBuilder r2, java.lang.String r3, float r4, int r5) {
            r1 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L6
            return
        L6:
            r2.append(r3)
            java.lang.String r3 = " :  ["
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = ","
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = ""
            r2.append(r3)
            java.lang.String r3 = "],\n"
            r2.append(r3)
            return
    }

    private void serializeSize(java.lang.StringBuilder r1, java.lang.String r2, int r3, int r4, int r5, int r6, int r7, int r8, float r9, float r10) {
            r0 = this;
            r1.append(r2)
            java.lang.String r2 = " :  {\n"
            r1.append(r2)
            java.lang.String r2 = "size"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.serializeAttribute(r1, r2, r3, r6)
            java.lang.String r2 = "min"
            r3 = 0
            r0.serializeAttribute(r1, r2, r4, r3)
            java.lang.String r2 = "max"
            r4 = 2147483647(0x7fffffff, float:NaN)
            r0.serializeAttribute(r1, r2, r5, r4)
            java.lang.String r2 = "matchMin"
            r0.serializeAttribute(r1, r2, r7, r3)
            java.lang.String r2 = "matchDef"
            r0.serializeAttribute(r1, r2, r8, r3)
            java.lang.String r2 = "matchPercent"
            r3 = 1
            r0.serializeAttribute(r1, r2, r8, r3)
            java.lang.String r2 = "},\n"
            r1.append(r2)
            return
    }

    public void addChildrenToSolverByDependency(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r8, androidx.constraintlayout.core.LinearSystem r9, java.util.HashSet<androidx.constraintlayout.core.widgets.ConstraintWidget> r10, int r11, boolean r12) {
            r7 = this;
            if (r12 == 0) goto L18
            boolean r12 = r10.contains(r7)
            if (r12 != 0) goto L9
            return
        L9:
            androidx.constraintlayout.core.widgets.Optimizer.checkMatchParent(r8, r9, r7)
            r10.remove(r7)
            r12 = 64
            boolean r12 = r8.optimizeFor(r12)
            r7.addToSolver(r9, r12)
        L18:
            if (r11 != 0) goto L60
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r7.mLeft
            java.util.HashSet r12 = r12.getDependents()
            if (r12 == 0) goto L3d
            java.util.Iterator r12 = r12.iterator()
        L26:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r12.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.mOwner
            r6 = 1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.addChildrenToSolverByDependency(r2, r3, r4, r5, r6)
            goto L26
        L3d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r7.mRight
            java.util.HashSet r12 = r12.getDependents()
            if (r12 == 0) goto Lc9
            java.util.Iterator r12 = r12.iterator()
        L49:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto Lc9
            java.lang.Object r0 = r12.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.mOwner
            r6 = 1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.addChildrenToSolverByDependency(r2, r3, r4, r5, r6)
            goto L49
        L60:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r7.mTop
            java.util.HashSet r12 = r12.getDependents()
            if (r12 == 0) goto L83
            java.util.Iterator r12 = r12.iterator()
        L6c:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r0 = r12.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.mOwner
            r6 = 1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.addChildrenToSolverByDependency(r2, r3, r4, r5, r6)
            goto L6c
        L83:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r7.mBottom
            java.util.HashSet r12 = r12.getDependents()
            if (r12 == 0) goto La6
            java.util.Iterator r12 = r12.iterator()
        L8f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto La6
            java.lang.Object r0 = r12.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.mOwner
            r6 = 1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.addChildrenToSolverByDependency(r2, r3, r4, r5, r6)
            goto L8f
        La6:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r7.mBaseline
            java.util.HashSet r12 = r12.getDependents()
            if (r12 == 0) goto Lc9
            java.util.Iterator r12 = r12.iterator()
        Lb2:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto Lc9
            java.lang.Object r0 = r12.next()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r0.mOwner
            r6 = 1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.addChildrenToSolverByDependency(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lca
            goto Lb2
        Lc9:
            return
        Lca:
            r8 = move-exception
            throw r8
    }

    public final boolean addFirst() {
            r1 = this;
            boolean r0 = r1 instanceof androidx.constraintlayout.core.widgets.VirtualLayout
            if (r0 != 0) goto Lb
            boolean r0 = r1 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    public void addToSolver(androidx.constraintlayout.core.LinearSystem r54, boolean r55) {
            r53 = this;
            r15 = r53
            r14 = r54
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mLeft
            androidx.constraintlayout.core.SolverVariable r13 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mRight
            androidx.constraintlayout.core.SolverVariable r12 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mTop
            androidx.constraintlayout.core.SolverVariable r11 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBottom
            androidx.constraintlayout.core.SolverVariable r10 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBaseline
            androidx.constraintlayout.core.SolverVariable r9 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            r8 = 2
            r1 = 3
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L54
            if (r0 == 0) goto L36
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r0.mListDimensionBehaviors
            r2 = r2[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r2 != r3) goto L36
            r2 = 1
            goto L37
        L36:
            r2 = 0
        L37:
            if (r0 == 0) goto L43
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r0.mListDimensionBehaviors
            r0 = r0[r7]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r3) goto L43
            r0 = 1
            goto L44
        L43:
            r0 = 0
        L44:
            int r3 = r15.mWrapBehaviorInParent
            if (r3 == r7) goto L52
            if (r3 == r8) goto L4f
            if (r3 == r1) goto L54
            r5 = r0
            r4 = r2
            goto L56
        L4f:
            r5 = r0
            r4 = 0
            goto L56
        L52:
            r4 = r2
            goto L55
        L54:
            r4 = 0
        L55:
            r5 = 0
        L56:
            int r0 = r15.mVisibility
            r3 = 8
            if (r0 != r3) goto L71
            boolean r0 = r15.mAnimated
            if (r0 != 0) goto L71
            boolean r0 = r53.hasDependencies()
            if (r0 != 0) goto L71
            boolean[] r0 = r15.mIsInBarrier
            boolean r2 = r0[r6]
            if (r2 != 0) goto L71
            boolean r0 = r0[r7]
            if (r0 != 0) goto L71
            return
        L71:
            boolean r0 = r15.resolvedHorizontal
            r2 = 5
            if (r0 != 0) goto L7a
            boolean r8 = r15.resolvedVertical
            if (r8 == 0) goto Lf7
        L7a:
            if (r0 == 0) goto La9
            int r0 = r15.mX
            r14.addEquality(r13, r0)
            int r0 = r15.mX
            int r8 = r15.mWidth
            int r0 = r0 + r8
            r14.addEquality(r12, r0)
            if (r4 == 0) goto La9
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto La9
            boolean r8 = r15.OPTIMIZE_WRAP_ON_RESOLVED
            if (r8 == 0) goto La0
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.mLeft
            r0.addHorizontalWrapMinVariable(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.mRight
            r0.addHorizontalWrapMaxVariable(r8)
            goto La9
        La0:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r14.addGreaterThan(r0, r12, r6, r2)
        La9:
            boolean r0 = r15.resolvedVertical
            if (r0 == 0) goto Lea
            int r0 = r15.mY
            r14.addEquality(r11, r0)
            int r0 = r15.mY
            int r8 = r15.mHeight
            int r0 = r0 + r8
            r14.addEquality(r10, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBaseline
            boolean r0 = r0.hasDependents()
            if (r0 == 0) goto Lca
            int r0 = r15.mY
            int r8 = r15.mBaselineDistance
            int r0 = r0 + r8
            r14.addEquality(r9, r0)
        Lca:
            if (r5 == 0) goto Lea
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto Lea
            boolean r8 = r15.OPTIMIZE_WRAP_ON_RESOLVED
            if (r8 == 0) goto Le1
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.mTop
            r0.addVerticalWrapMinVariable(r8)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r15.mBottom
            r0.addVerticalWrapMaxVariable(r8)
            goto Lea
        Le1:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r14.addGreaterThan(r0, r10, r6, r2)
        Lea:
            boolean r0 = r15.resolvedHorizontal
            if (r0 == 0) goto Lf7
            boolean r0 = r15.resolvedVertical
            if (r0 == 0) goto Lf7
            r15.resolvedHorizontal = r6
            r15.resolvedVertical = r6
            return
        Lf7:
            androidx.constraintlayout.core.Metrics r0 = androidx.constraintlayout.core.LinearSystem.sMetrics
            r17 = 1
            if (r0 == 0) goto L103
            long r1 = r0.widgets
            long r1 = r1 + r17
            r0.widgets = r1
        L103:
            if (r55 == 0) goto L192
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r1 = r15.horizontalRun
            if (r1 == 0) goto L192
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r15.verticalRun
            if (r2 == 0) goto L192
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r8 = r1.start
            boolean r7 = r8.resolved
            if (r7 == 0) goto L192
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            boolean r1 = r1.resolved
            if (r1 == 0) goto L192
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.start
            boolean r1 = r1.resolved
            if (r1 == 0) goto L192
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.end
            boolean r1 = r1.resolved
            if (r1 == 0) goto L192
            if (r0 == 0) goto L12d
            long r1 = r0.graphSolved
            long r1 = r1 + r17
            r0.graphSolved = r1
        L12d:
            int r0 = r8.value
            r14.addEquality(r13, r0)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.value
            r14.addEquality(r12, r0)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            int r0 = r0.value
            r14.addEquality(r11, r0)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.value
            r14.addEquality(r10, r0)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.baseline
            int r0 = r0.value
            r14.addEquality(r9, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L18d
            if (r4 == 0) goto L173
            boolean[] r0 = r15.isTerminalWidget
            boolean r0 = r0[r6]
            if (r0 == 0) goto L173
            boolean r0 = r53.isInHorizontalChain()
            if (r0 != 0) goto L173
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r14.addGreaterThan(r0, r12, r6, r3)
        L173:
            if (r5 == 0) goto L18d
            boolean[] r0 = r15.isTerminalWidget
            r1 = 1
            boolean r0 = r0[r1]
            if (r0 == 0) goto L18d
            boolean r0 = r53.isInVerticalChain()
            if (r0 != 0) goto L18d
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r14.addGreaterThan(r0, r10, r6, r3)
        L18d:
            r15.resolvedHorizontal = r6
            r15.resolvedVertical = r6
            return
        L192:
            if (r0 == 0) goto L19a
            long r1 = r0.linearSolved
            long r1 = r1 + r17
            r0.linearSolved = r1
        L19a:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L20e
            boolean r0 = r15.isChainHead(r6)
            if (r0 == 0) goto L1ad
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            r0.addChain(r15, r6)
            r0 = 1
            goto L1b1
        L1ad:
            boolean r0 = r53.isInHorizontalChain()
        L1b1:
            r1 = 1
            boolean r2 = r15.isChainHead(r1)
            if (r2 == 0) goto L1c1
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r2 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r2
            r2.addChain(r15, r1)
            r1 = 1
            goto L1c5
        L1c1:
            boolean r1 = r53.isInVerticalChain()
        L1c5:
            if (r0 != 0) goto L1e5
            if (r4 == 0) goto L1e5
            int r2 = r15.mVisibility
            if (r2 == r3) goto L1e5
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L1e5
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L1e5
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mRight
            androidx.constraintlayout.core.SolverVariable r2 = r14.createObjectVariable(r2)
            r7 = 1
            r14.addGreaterThan(r2, r12, r6, r7)
        L1e5:
            if (r1 != 0) goto L209
            if (r5 == 0) goto L209
            int r2 = r15.mVisibility
            if (r2 == r3) goto L209
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L209
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            if (r2 != 0) goto L209
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mBaseline
            if (r2 != 0) goto L209
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mBottom
            androidx.constraintlayout.core.SolverVariable r2 = r14.createObjectVariable(r2)
            r7 = 1
            r14.addGreaterThan(r2, r10, r6, r7)
        L209:
            r29 = r0
            r28 = r1
            goto L212
        L20e:
            r28 = 0
            r29 = 0
        L212:
            int r0 = r15.mWidth
            int r1 = r15.mMinWidth
            if (r0 >= r1) goto L219
            goto L21a
        L219:
            r1 = r0
        L21a:
            int r2 = r15.mHeight
            int r7 = r15.mMinHeight
            if (r2 >= r7) goto L221
            goto L222
        L221:
            r7 = r2
        L222:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r15.mListDimensionBehaviors
            r3 = r8[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r22 = r1
            if (r3 == r6) goto L22e
            r3 = 1
            goto L22f
        L22e:
            r3 = 0
        L22f:
            r21 = 1
            r1 = r8[r21]
            r23 = r7
            if (r1 == r6) goto L239
            r1 = 1
            goto L23a
        L239:
            r1 = 0
        L23a:
            int r7 = r15.mDimensionRatioSide
            r15.mResolvedDimensionRatioSide = r7
            r27 = r9
            float r9 = r15.mDimensionRatio
            r15.mResolvedDimensionRatio = r9
            r30 = r10
            int r10 = r15.mMatchConstraintDefaultWidth
            r31 = r11
            int r11 = r15.mMatchConstraintDefaultHeight
            r24 = 0
            r25 = 4
            r32 = r12
            int r24 = (r9 > r24 ? 1 : (r9 == r24 ? 0 : -1))
            if (r24 <= 0) goto L2e0
            int r12 = r15.mVisibility
            r33 = r13
            r13 = 8
            if (r12 == r13) goto L2e2
            r12 = 0
            r13 = r8[r12]
            if (r13 != r6) goto L266
            if (r10 != 0) goto L266
            r10 = 3
        L266:
            r12 = 1
            r13 = r8[r12]
            if (r13 != r6) goto L26e
            if (r11 != 0) goto L26e
            r11 = 3
        L26e:
            r13 = 0
            r14 = r8[r13]
            if (r14 != r6) goto L280
            r13 = r8[r12]
            if (r13 != r6) goto L280
            r12 = 3
            if (r10 != r12) goto L281
            if (r11 != r12) goto L281
            r15.setupDimensionRatio(r4, r5, r3, r1)
            goto L2d4
        L280:
            r12 = 3
        L281:
            r1 = 0
            r3 = r8[r1]
            if (r3 != r6) goto L2a6
            if (r10 != r12) goto L2a6
            r3 = r8
            r15.mResolvedDimensionRatioSide = r1
            float r0 = (float) r2
            float r9 = r9 * r0
            int r1 = (int) r9
            r2 = 1
            r0 = r3[r2]
            if (r0 == r6) goto L29e
            r36 = r11
            r35 = r23
            r0 = 0
            r34 = 0
            r37 = 4
            goto L2ed
        L29e:
            r37 = r10
            r36 = r11
            r35 = r23
            r0 = 0
            goto L2dd
        L2a6:
            r3 = r8
            r2 = 1
            r1 = r3[r2]
            if (r1 != r6) goto L2d4
            r1 = 3
            if (r11 != r1) goto L2d4
            r15.mResolvedDimensionRatioSide = r2
            r1 = -1
            if (r7 != r1) goto L2b9
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r9
            r15.mResolvedDimensionRatio = r1
        L2b9:
            float r1 = r15.mResolvedDimensionRatio
            float r0 = (float) r0
            float r1 = r1 * r0
            int r7 = (int) r1
            r0 = 0
            r1 = r3[r0]
            r35 = r7
            r37 = r10
            if (r1 == r6) goto L2cf
            r1 = r22
            r34 = 0
            r36 = 4
            goto L2ed
        L2cf:
            r36 = r11
            r1 = r22
            goto L2dd
        L2d4:
            r0 = 0
            r37 = r10
            r36 = r11
            r1 = r22
            r35 = r23
        L2dd:
            r34 = 1
            goto L2ed
        L2e0:
            r33 = r13
        L2e2:
            r0 = 0
            r37 = r10
            r36 = r11
            r1 = r22
            r35 = r23
            r34 = 0
        L2ed:
            int[] r2 = r15.mResolvedMatchConstraintDefault
            r2[r0] = r37
            r0 = 1
            r2[r0] = r36
            if (r34 == 0) goto L300
            int r0 = r15.mResolvedDimensionRatioSide
            r2 = -1
            if (r0 == 0) goto L2fd
            if (r0 != r2) goto L301
        L2fd:
            r20 = 1
            goto L303
        L300:
            r2 = -1
        L301:
            r20 = 0
        L303:
            if (r34 == 0) goto L30f
            int r0 = r15.mResolvedDimensionRatioSide
            r3 = 1
            if (r0 == r3) goto L30c
            if (r0 != r2) goto L30f
        L30c:
            r38 = 1
            goto L311
        L30f:
            r38 = 0
        L311:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r2 = 0
            r0 = r0[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r0 != r14) goto L320
            boolean r0 = r15 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r0 == 0) goto L320
            r9 = 1
            goto L321
        L320:
            r9 = 0
        L321:
            if (r9 == 0) goto L325
            r13 = 0
            goto L326
        L325:
            r13 = r1
        L326:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mCenter
            boolean r0 = r0.isConnected()
            r1 = 1
            r39 = r0 ^ 1
            boolean[] r0 = r15.mIsInBarrier
            r2 = 0
            boolean r22 = r0[r2]
            boolean r40 = r0[r1]
            int r0 = r15.mHorizontalResolution
            r41 = 0
            r8 = 2
            if (r0 == r8) goto L447
            boolean r0 = r15.resolvedHorizontal
            if (r0 != 0) goto L447
            if (r55 == 0) goto L3a2
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            if (r0 == 0) goto L3a2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.start
            boolean r2 = r1.resolved
            if (r2 == 0) goto L3a2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            boolean r0 = r0.resolved
            if (r0 != 0) goto L354
            goto L3a2
        L354:
            if (r55 == 0) goto L39e
            int r0 = r1.value
            r12 = r54
            r11 = r33
            r12.addEquality(r11, r0)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r15.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.value
            r10 = r32
            r12.addEquality(r10, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L38a
            if (r4 == 0) goto L38a
            boolean[] r0 = r15.isTerminalWidget
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L38a
            boolean r0 = r53.isInHorizontalChain()
            if (r0 != 0) goto L38a
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.core.SolverVariable r0 = r12.createObjectVariable(r0)
            r3 = 8
            r12.addGreaterThan(r0, r10, r1, r3)
        L38a:
            r43 = r4
            r47 = r5
            r48 = r6
            r52 = r14
            r49 = r27
            r50 = r30
            r51 = r31
            r30 = r10
            r31 = r11
            goto L459
        L39e:
            r12 = r54
            goto L447
        L3a2:
            r12 = r54
            r10 = r32
            r11 = r33
            r3 = 8
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L3b6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mRight
            androidx.constraintlayout.core.SolverVariable r0 = r12.createObjectVariable(r0)
            r7 = r0
            goto L3b8
        L3b6:
            r7 = r41
        L3b8:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L3c5
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mLeft
            androidx.constraintlayout.core.SolverVariable r0 = r12.createObjectVariable(r0)
            r16 = r0
            goto L3c7
        L3c5:
            r16 = r41
        L3c7:
            boolean[] r0 = r15.isTerminalWidget
            r17 = 0
            boolean r18 = r0[r17]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r23 = r0[r17]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r15.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r15.mRight
            r33 = r2
            int r2 = r15.mX
            r42 = r2
            int r2 = r15.mMinWidth
            int[] r3 = r15.mMaxDimension
            r44 = r3[r17]
            float r3 = r15.mHorizontalBiasPercent
            r21 = 1
            r0 = r0[r21]
            if (r0 != r6) goto L3ec
            r45 = 1
            goto L3ee
        L3ec:
            r45 = 0
        L3ee:
            int r0 = r15.mMatchConstraintMinWidth
            r24 = r0
            int r0 = r15.mMatchConstraintMaxWidth
            r25 = r0
            float r0 = r15.mMatchConstraintPercentWidth
            r26 = r0
            r0 = r53
            r46 = r1
            r1 = r54
            r19 = r33
            r32 = r42
            r33 = r2
            r2 = 1
            r42 = r3
            r3 = r4
            r43 = r4
            r4 = r5
            r47 = r5
            r5 = r18
            r48 = r6
            r6 = r16
            r8 = r23
            r49 = r27
            r16 = r10
            r50 = r30
            r10 = r46
            r17 = r11
            r51 = r31
            r11 = r19
            r30 = r16
            r12 = r32
            r31 = r17
            r52 = r14
            r14 = r33
            r15 = r44
            r16 = r42
            r17 = r20
            r18 = r45
            r19 = r29
            r20 = r28
            r21 = r22
            r22 = r37
            r23 = r36
            r27 = r39
            r0.applyConstraints(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L459
        L447:
            r43 = r4
            r47 = r5
            r48 = r6
            r52 = r14
            r49 = r27
            r50 = r30
            r51 = r31
            r30 = r32
            r31 = r33
        L459:
            if (r55 == 0) goto L4bf
            r15 = r53
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            if (r0 == 0) goto L4b2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.start
            boolean r2 = r1.resolved
            if (r2 == 0) goto L4b2
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            boolean r0 = r0.resolved
            if (r0 == 0) goto L4b2
            int r0 = r1.value
            r14 = r54
            r13 = r51
            r14.addEquality(r13, r0)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.value
            r12 = r50
            r14.addEquality(r12, r0)
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r15.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.baseline
            int r0 = r0.value
            r1 = r49
            r14.addEquality(r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L4ac
            if (r28 != 0) goto L4ac
            if (r47 == 0) goto L4ac
            boolean[] r2 = r15.isTerminalWidget
            r11 = 1
            boolean r2 = r2[r11]
            if (r2 == 0) goto L4a8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r2 = 8
            r10 = 0
            r14.addGreaterThan(r0, r12, r10, r2)
            goto L4b0
        L4a8:
            r2 = 8
            r10 = 0
            goto L4b0
        L4ac:
            r2 = 8
            r10 = 0
            r11 = 1
        L4b0:
            r7 = 0
            goto L4ce
        L4b2:
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
            r2 = 8
            r10 = 0
            r11 = 1
            goto L4cd
        L4bf:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r53
            r14 = r54
            r1 = r49
            r12 = r50
            r13 = r51
        L4cd:
            r7 = 1
        L4ce:
            int r0 = r15.mVerticalResolution
            r3 = 2
            if (r0 != r3) goto L4d5
            r6 = 0
            goto L4d6
        L4d5:
            r6 = r7
        L4d6:
            if (r6 == 0) goto L5b6
            boolean r0 = r15.resolvedVertical
            if (r0 != 0) goto L5b6
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r0 = r0[r11]
            r3 = r52
            if (r0 != r3) goto L4ea
            boolean r0 = r15 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r0 == 0) goto L4ea
            r9 = 1
            goto L4eb
        L4ea:
            r9 = 0
        L4eb:
            if (r9 == 0) goto L4ef
            r35 = 0
        L4ef:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L4fb
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r7 = r0
            goto L4fd
        L4fb:
            r7 = r41
        L4fd:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r15.mParent
            if (r0 == 0) goto L509
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTop
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r6 = r0
            goto L50b
        L509:
            r6 = r41
        L50b:
            int r0 = r15.mBaselineDistance
            if (r0 > 0) goto L513
            int r0 = r15.mVisibility
            if (r0 != r2) goto L553
        L513:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r0.mTarget
            if (r3 == 0) goto L540
            int r0 = r53.getBaselineDistance()
            r14.addEquality(r1, r13, r0, r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.mTarget
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.mBaseline
            int r3 = r3.getMargin()
            r14.addEquality(r1, r0, r3, r2)
            if (r47 == 0) goto L53d
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r15.mBottom
            androidx.constraintlayout.core.SolverVariable r0 = r14.createObjectVariable(r0)
            r1 = 5
            r14.addGreaterThan(r7, r0, r10, r1)
        L53d:
            r27 = 0
            goto L555
        L540:
            int r3 = r15.mVisibility
            if (r3 != r2) goto L54c
            int r0 = r0.getMargin()
            r14.addEquality(r1, r13, r0, r2)
            goto L553
        L54c:
            int r0 = r53.getBaselineDistance()
            r14.addEquality(r1, r13, r0, r2)
        L553:
            r27 = r39
        L555:
            boolean[] r0 = r15.isTerminalWidget
            boolean r5 = r0[r11]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r15.mListDimensionBehaviors
            r8 = r0[r11]
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r15.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r15.mBottom
            int r1 = r15.mY
            int r2 = r15.mMinHeight
            int[] r10 = r15.mMaxDimension
            r16 = r10[r11]
            float r10 = r15.mVerticalBiasPercent
            r17 = 0
            r0 = r0[r17]
            r11 = r48
            if (r0 != r11) goto L576
            r18 = 1
            goto L578
        L576:
            r18 = 0
        L578:
            int r0 = r15.mMatchConstraintMinHeight
            r24 = r0
            int r0 = r15.mMatchConstraintMaxHeight
            r25 = r0
            float r0 = r15.mMatchConstraintPercentHeight
            r26 = r0
            r0 = r53
            r19 = r1
            r1 = r54
            r20 = r2
            r2 = 0
            r11 = r3
            r3 = r47
            r21 = r4
            r4 = r43
            r17 = r10
            r10 = r21
            r32 = r12
            r12 = r19
            r33 = r13
            r13 = r35
            r14 = r20
            r15 = r16
            r16 = r17
            r17 = r38
            r19 = r28
            r20 = r29
            r21 = r40
            r22 = r36
            r23 = r37
            r0.applyConstraints(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L5ba
        L5b6:
            r32 = r12
            r33 = r13
        L5ba:
            if (r34 == 0) goto L5e7
            r6 = 8
            r7 = r53
            int r0 = r7.mResolvedDimensionRatioSide
            r1 = 1
            if (r0 != r1) goto L5d5
            float r5 = r7.mResolvedDimensionRatio
            r0 = r54
            r1 = r32
            r2 = r33
            r3 = r30
            r4 = r31
            r0.addRatio(r1, r2, r3, r4, r5, r6)
            goto L5e9
        L5d5:
            float r5 = r7.mResolvedDimensionRatio
            r6 = 8
            r0 = r54
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r0.addRatio(r1, r2, r3, r4, r5, r6)
            goto L5e9
        L5e7:
            r7 = r53
        L5e9:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r7.mCenter
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L611
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r7.mCenter
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.getTarget()
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getOwner()
            float r1 = r7.mCircleConstraintAngle
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r7.mCenter
            int r2 = r2.getMargin()
            r3 = r54
            r3.addCenterPoint(r7, r0, r1, r2)
        L611:
            r0 = 0
            r7.resolvedHorizontal = r0
            r7.resolvedVertical = r0
            return
    }

    public boolean allowedInBarrier() {
            r2 = this;
            int r0 = r2.mVisibility
            r1 = 8
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public void connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r2, androidx.constraintlayout.core.widgets.ConstraintWidget r3, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r4) {
            r1 = this;
            r0 = 0
            r1.connect(r2, r3, r4, r0)
            return
    }

    public void connect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r9, androidx.constraintlayout.core.widgets.ConstraintWidget r10, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r11, int r12) {
            r8 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            r1 = 0
            if (r9 != r0) goto Lbf
            if (r11 != r0) goto L84
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r8.getAnchor(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r12 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r8.getAnchor(r12)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.getAnchor(r3)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.getAnchor(r5)
            r7 = 1
            if (r11 == 0) goto L28
            boolean r11 = r11.isConnected()
            if (r11 != 0) goto L30
        L28:
            if (r2 == 0) goto L32
            boolean r11 = r2.isConnected()
            if (r11 == 0) goto L32
        L30:
            r9 = 0
            goto L39
        L32:
            r8.connect(r9, r10, r9, r1)
            r8.connect(r12, r10, r12, r1)
            r9 = 1
        L39:
            if (r4 == 0) goto L41
            boolean r11 = r4.isConnected()
            if (r11 != 0) goto L49
        L41:
            if (r6 == 0) goto L4b
            boolean r11 = r6.isConnected()
            if (r11 == 0) goto L4b
        L49:
            r7 = 0
            goto L51
        L4b:
            r8.connect(r3, r10, r3, r1)
            r8.connect(r5, r10, r5, r1)
        L51:
            if (r9 == 0) goto L62
            if (r7 == 0) goto L62
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.getAnchor(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.getAnchor(r0)
            r9.connect(r10, r1)
            goto L1f8
        L62:
            if (r9 == 0) goto L73
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r8.getAnchor(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.getAnchor(r9)
            r11.connect(r9, r1)
            goto L1f8
        L73:
            if (r7 == 0) goto L1f8
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r8.getAnchor(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.getAnchor(r9)
            r11.connect(r9, r1)
            goto L1f8
        L84:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            if (r11 == r9) goto Laa
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r12 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            if (r11 != r12) goto L8d
            goto Laa
        L8d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            if (r11 == r9) goto L95
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r12 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r11 != r12) goto L1f8
        L95:
            r8.connect(r9, r10, r11, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            r8.connect(r9, r10, r11, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.getAnchor(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.getAnchor(r11)
            r9.connect(r10, r1)
            goto L1f8
        Laa:
            r8.connect(r9, r10, r11, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            r8.connect(r9, r10, r11, r1)     // Catch: java.lang.Throwable -> L1f9
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.getAnchor(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.getAnchor(r11)
            r9.connect(r10, r1)
            goto L1f8
        Lbf:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            if (r9 != r2) goto Le8
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            if (r11 == r3) goto Lcb
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            if (r11 != r4) goto Le8
        Lcb:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.getAnchor(r3)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.getAnchor(r11)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r8.getAnchor(r11)
            r9.connect(r10, r1)
            r11.connect(r10, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.getAnchor(r2)
            r9.connect(r10, r1)
            goto L1f8
        Le8:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            if (r9 != r3) goto L111
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            if (r11 == r4) goto Lf4
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r11 != r5) goto L111
        Lf4:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.getAnchor(r11)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r8.getAnchor(r4)
            r10.connect(r9, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r10 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r8.getAnchor(r10)
            r10.connect(r9, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r8.getAnchor(r3)
            r10.connect(r9, r1)
            goto L1f8
        L111:
            if (r9 != r2) goto L13c
            if (r11 != r2) goto L13c
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r8.getAnchor(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.getAnchor(r9)
            r12.connect(r9, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r8.getAnchor(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.getAnchor(r9)
            r12.connect(r9, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.getAnchor(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.getAnchor(r11)
            r9.connect(r10, r1)
            goto L1f8
        L13c:
            if (r9 != r3) goto L167
            if (r11 != r3) goto L167
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r8.getAnchor(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.getAnchor(r9)
            r12.connect(r9, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r8.getAnchor(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r10.getAnchor(r9)
            r12.connect(r9, r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.getAnchor(r3)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.getAnchor(r11)
            r9.connect(r10, r1)
            goto L1f8
        L167:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.getAnchor(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.getAnchor(r11)
            boolean r11 = r1.isValidConnection(r10)
            if (r11 == 0) goto L1f8
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            if (r9 != r11) goto L190
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r9 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.getAnchor(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r8.getAnchor(r11)
            if (r9 == 0) goto L18a
            r9.reset()
        L18a:
            if (r11 == 0) goto L1f5
            r11.reset()
            goto L1f5
        L190:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            if (r9 == r4) goto L1c7
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            if (r9 != r4) goto L199
            goto L1c7
        L199:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            if (r9 == r11) goto L1a1
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            if (r9 != r11) goto L1f5
        L1a1:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r8.getAnchor(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r11.getTarget()
            if (r0 == r10) goto L1ae
            r11.reset()
        L1ae:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.getAnchor(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.getOpposite()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r8.getAnchor(r2)
            boolean r0 = r11.isConnected()
            if (r0 == 0) goto L1f5
            r9.reset()
            r11.reset()
            goto L1f5
        L1c7:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r8.getAnchor(r11)
            if (r11 == 0) goto L1d0
            r11.reset()
        L1d0:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r8.getAnchor(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r11.getTarget()
            if (r0 == r10) goto L1dd
            r11.reset()
        L1dd:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.getAnchor(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.getOpposite()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r8.getAnchor(r3)
            boolean r0 = r11.isConnected()
            if (r0 == 0) goto L1f5
            r9.reset()
            r11.reset()
        L1f5:
            r1.connect(r10, r12)
        L1f8:
            return
        L1f9:
            r9 = move-exception
            throw r9
    }

    public void connect(androidx.constraintlayout.core.widgets.ConstraintAnchor r2, androidx.constraintlayout.core.widgets.ConstraintAnchor r3, int r4) {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.getOwner()
            if (r0 != r1) goto L15
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = r2.getType()
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r3.getOwner()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = r3.getType()
            r1.connect(r2, r0, r3, r4)
        L15:
            return
    }

    public void connectCircularConstraint(androidx.constraintlayout.core.widgets.ConstraintWidget r7, float r8, int r9) {
            r6 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            r5 = 0
            r0 = r6
            r1 = r3
            r2 = r7
            r4 = r9
            r0.immediateConnect(r1, r2, r3, r4, r5)
            r6.mCircleConstraintAngle = r8
            return
    }

    public void copy(androidx.constraintlayout.core.widgets.ConstraintWidget r7, java.util.HashMap<androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget> r8) {
            r6 = this;
            int r0 = r7.mHorizontalResolution
            r6.mHorizontalResolution = r0
            int r0 = r7.mVerticalResolution
            r6.mVerticalResolution = r0
            int r0 = r7.mMatchConstraintDefaultWidth
            r6.mMatchConstraintDefaultWidth = r0
            int r0 = r7.mMatchConstraintDefaultHeight
            r6.mMatchConstraintDefaultHeight = r0
            int[] r0 = r6.mResolvedMatchConstraintDefault
            int[] r1 = r7.mResolvedMatchConstraintDefault
            r2 = 0
            r3 = r1[r2]
            r0[r2] = r3
            r3 = 1
            r1 = r1[r3]
            r0[r3] = r1
            int r0 = r7.mMatchConstraintMinWidth
            r6.mMatchConstraintMinWidth = r0
            int r0 = r7.mMatchConstraintMaxWidth
            r6.mMatchConstraintMaxWidth = r0
            int r0 = r7.mMatchConstraintMinHeight
            r6.mMatchConstraintMinHeight = r0
            int r0 = r7.mMatchConstraintMaxHeight
            r6.mMatchConstraintMaxHeight = r0
            float r0 = r7.mMatchConstraintPercentHeight
            r6.mMatchConstraintPercentHeight = r0
            boolean r0 = r7.mIsWidthWrapContent
            r6.mIsWidthWrapContent = r0
            boolean r0 = r7.mIsHeightWrapContent
            r6.mIsHeightWrapContent = r0
            int r0 = r7.mResolvedDimensionRatioSide
            r6.mResolvedDimensionRatioSide = r0
            float r0 = r7.mResolvedDimensionRatio
            r6.mResolvedDimensionRatio = r0
            int[] r0 = r7.mMaxDimension
            int r1 = r0.length
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r6.mMaxDimension = r0
            float r0 = r7.mCircleConstraintAngle
            r6.mCircleConstraintAngle = r0
            boolean r0 = r7.hasBaseline
            r6.hasBaseline = r0
            boolean r0 = r7.inPlaceholder
            r6.inPlaceholder = r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mLeft
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mTop
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mRight
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mBottom
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mBaseline
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mCenterX
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mCenterY
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mCenter
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r6.mListDimensionBehaviors
            r1 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = (androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour[]) r0
            r6.mListDimensionBehaviors = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.mParent
            r1 = 0
            if (r0 != 0) goto L91
            r0 = r1
            goto L99
        L91:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.mParent
            java.lang.Object r0 = r8.get(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r0
        L99:
            r6.mParent = r0
            int r0 = r7.mWidth
            r6.mWidth = r0
            int r0 = r7.mHeight
            r6.mHeight = r0
            float r0 = r7.mDimensionRatio
            r6.mDimensionRatio = r0
            int r0 = r7.mDimensionRatioSide
            r6.mDimensionRatioSide = r0
            int r0 = r7.mX
            r6.mX = r0
            int r0 = r7.mY
            r6.mY = r0
            int r0 = r7.mOffsetX
            r6.mOffsetX = r0
            int r0 = r7.mOffsetY
            r6.mOffsetY = r0
            int r0 = r7.mBaselineDistance
            r6.mBaselineDistance = r0
            int r0 = r7.mMinWidth
            r6.mMinWidth = r0
            int r0 = r7.mMinHeight
            r6.mMinHeight = r0
            float r0 = r7.mHorizontalBiasPercent
            r6.mHorizontalBiasPercent = r0
            float r0 = r7.mVerticalBiasPercent
            r6.mVerticalBiasPercent = r0
            java.lang.Object r0 = r7.mCompanionWidget
            r6.mCompanionWidget = r0
            int r0 = r7.mContainerItemSkip
            r6.mContainerItemSkip = r0
            int r0 = r7.mVisibility
            r6.mVisibility = r0
            boolean r0 = r7.mAnimated
            r6.mAnimated = r0
            java.lang.String r0 = r7.mDebugName
            r6.mDebugName = r0
            java.lang.String r0 = r7.mType
            r6.mType = r0
            int r0 = r7.mHorizontalChainStyle
            r6.mHorizontalChainStyle = r0
            int r0 = r7.mVerticalChainStyle
            r6.mVerticalChainStyle = r0
            float[] r0 = r6.mWeight
            float[] r4 = r7.mWeight
            r5 = r4[r2]
            r0[r2] = r5
            r4 = r4[r3]
            r0[r3] = r4
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r6.mListNextMatchConstraintsWidget
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = r7.mListNextMatchConstraintsWidget
            r5 = r4[r2]
            r0[r2] = r5
            r4 = r4[r3]
            r0[r3] = r4
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r6.mNextChainWidget
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = r7.mNextChainWidget
            r5 = r4[r2]
            r0[r2] = r5
            r2 = r4[r3]
            r0[r3] = r2
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r7.mHorizontalNextWidget
            if (r0 != 0) goto L119
            r0 = r1
            goto L11f
        L119:
            java.lang.Object r0 = r8.get(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r0
        L11f:
            r6.mHorizontalNextWidget = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r7.mVerticalNextWidget
            if (r7 != 0) goto L126
            goto L12d
        L126:
            java.lang.Object r7 = r8.get(r7)
            r1 = r7
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r1
        L12d:
            r6.mVerticalNextWidget = r1
            return
    }

    public void createObjectVariables(androidx.constraintlayout.core.LinearSystem r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mLeft
            r2.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mTop
            r2.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mRight
            r2.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mBottom
            r2.createObjectVariable(r0)
            int r0 = r1.mBaselineDistance
            if (r0 <= 0) goto L1d
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mBaseline
            r2.createObjectVariable(r0)
        L1d:
            return
    }

    public void ensureMeasureRequested() {
            r1 = this;
            r0 = 1
            r1.mMeasureRequested = r0
            return
    }

    public void ensureWidgetRuns() {
            r1 = this;
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r1.horizontalRun
            if (r0 != 0) goto Lb
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = new androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun
            r0.<init>(r1)
            r1.horizontalRun = r0
        Lb:
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r1.verticalRun
            if (r0 != 0) goto L16
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = new androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun
            r0.<init>(r1)
            r1.verticalRun = r0
        L16:
            return
    }

    public androidx.constraintlayout.core.widgets.ConstraintAnchor getAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r3) {
            r2 = this;
            int[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2c;
                case 2: goto L29;
                case 3: goto L26;
                case 4: goto L23;
                case 5: goto L20;
                case 6: goto L1d;
                case 7: goto L1a;
                case 8: goto L17;
                case 9: goto L15;
                default: goto Lb;
            }
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r3 = r3.name()
            r0.<init>(r3)
            throw r0
        L15:
            r3 = 0
            return r3
        L17:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mCenterY
            return r3
        L1a:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mCenterX
            return r3
        L1d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mCenter
            return r3
        L20:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mBaseline
            return r3
        L23:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mBottom
            return r3
        L26:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mRight
            return r3
        L29:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mTop
            return r3
        L2c:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mLeft
            return r3
    }

    public java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> getAnchors() {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r1.mAnchors
            return r0
    }

    public int getBaselineDistance() {
            r1 = this;
            int r0 = r1.mBaselineDistance
            return r0
    }

    public float getBiasPercent(int r2) {
            r1 = this;
            if (r2 != 0) goto L5
            float r2 = r1.mHorizontalBiasPercent
            return r2
        L5:
            r0 = 1
            if (r2 != r0) goto Lb
            float r2 = r1.mVerticalBiasPercent
            return r2
        Lb:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r2
    }

    public int getBottom() {
            r2 = this;
            int r0 = r2.getY()
            int r1 = r2.mHeight
            int r0 = r0 + r1
            return r0
    }

    public java.lang.Object getCompanionWidget() {
            r1 = this;
            java.lang.Object r0 = r1.mCompanionWidget
            return r0
    }

    public int getContainerItemSkip() {
            r1 = this;
            int r0 = r1.mContainerItemSkip
            return r0
    }

    public java.lang.String getDebugName() {
            r1 = this;
            java.lang.String r0 = r1.mDebugName
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour getDimensionBehaviour(int r2) {
            r1 = this;
            if (r2 != 0) goto L7
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r1.getHorizontalDimensionBehaviour()
            return r2
        L7:
            r0 = 1
            if (r2 != r0) goto Lf
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r1.getVerticalDimensionBehaviour()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public float getDimensionRatio() {
            r1 = this;
            float r0 = r1.mDimensionRatio
            return r0
    }

    public int getDimensionRatioSide() {
            r1 = this;
            int r0 = r1.mDimensionRatioSide
            return r0
    }

    public boolean getHasBaseline() {
            r1 = this;
            boolean r0 = r1.hasBaseline
            return r0
    }

    public int getHeight() {
            r2 = this;
            int r0 = r2.mVisibility
            r1 = 8
            if (r0 != r1) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r2.mHeight
            return r0
    }

    public float getHorizontalBiasPercent() {
            r1 = this;
            float r0 = r1.mHorizontalBiasPercent
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getHorizontalChainControlWidget() {
            r5 = this;
            boolean r0 = r5.isInHorizontalChain()
            r1 = 0
            if (r0 == 0) goto L46
            r2 = r5
            r0 = r1
        L9:
            if (r0 != 0) goto L45
            if (r2 == 0) goto L45
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.getAnchor(r3)
            if (r3 != 0) goto L17
            r3 = r1
            goto L1b
        L17:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.getTarget()
        L1b:
            if (r3 != 0) goto L1f
            r3 = r1
            goto L23
        L1f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.getOwner()
        L23:
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r5.getParent()
            if (r3 != r4) goto L2b
            r1 = r2
            goto L46
        L2b:
            if (r3 != 0) goto L2f
            r4 = r1
            goto L39
        L2f:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getTarget()
        L39:
            if (r4 == 0) goto L43
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r4.getOwner()
            if (r4 == r2) goto L43
            r0 = r2
            goto L9
        L43:
            r2 = r3
            goto L9
        L45:
            r1 = r0
        L46:
            return r1
    }

    public int getHorizontalChainStyle() {
            r1 = this;
            int r0 = r1.mHorizontalChainStyle
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour getHorizontalDimensionBehaviour() {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r2.mListDimensionBehaviors
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    public int getHorizontalMargin() {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mLeft
            r1 = 0
            if (r0 == 0) goto L8
            int r0 = r0.mMargin
            int r1 = r1 + r0
        L8:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mRight
            if (r0 == 0) goto Lf
            int r0 = r0.mMargin
            int r1 = r1 + r0
        Lf:
            return r1
    }

    public int getLastHorizontalMeasureSpec() {
            r1 = this;
            int r0 = r1.mLastHorizontalMeasureSpec
            return r0
    }

    public int getLastVerticalMeasureSpec() {
            r1 = this;
            int r0 = r1.mLastVerticalMeasureSpec
            return r0
    }

    public int getLeft() {
            r1 = this;
            int r0 = r1.getX()
            return r0
    }

    public int getLength(int r2) {
            r1 = this;
            if (r2 != 0) goto L7
            int r2 = r1.getWidth()
            return r2
        L7:
            r0 = 1
            if (r2 != r0) goto Lf
            int r2 = r1.getHeight()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public int getMaxHeight() {
            r2 = this;
            int[] r0 = r2.mMaxDimension
            r1 = 1
            r0 = r0[r1]
            return r0
    }

    public int getMaxWidth() {
            r2 = this;
            int[] r0 = r2.mMaxDimension
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    public int getMinHeight() {
            r1 = this;
            int r0 = r1.mMinHeight
            return r0
    }

    public int getMinWidth() {
            r1 = this;
            int r0 = r1.mMinWidth
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getNextChainMember(int r3) {
            r2 = this;
            if (r3 != 0) goto Lf
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 == 0) goto L1f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 != r3) goto L1f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.mOwner
            return r3
        Lf:
            r0 = 1
            if (r3 != r0) goto L1f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 == 0) goto L1f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 != r3) goto L1f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.mOwner
            return r3
        L1f:
            r3 = 0
            return r3
    }

    public int getOptimizerWrapHeight() {
            r4 = this;
            int r0 = r4.mHeight
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r4.mListDimensionBehaviors
            r2 = 1
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r3) goto L25
            int r1 = r4.mMatchConstraintDefaultHeight
            if (r1 != r2) goto L16
            int r1 = r4.mMatchConstraintMinHeight
            int r0 = java.lang.Math.max(r1, r0)
            goto L1e
        L16:
            int r0 = r4.mMatchConstraintMinHeight
            if (r0 <= 0) goto L1d
            r4.mHeight = r0
            goto L1e
        L1d:
            r0 = 0
        L1e:
            int r1 = r4.mMatchConstraintMaxHeight
            if (r1 <= 0) goto L25
            if (r1 >= r0) goto L25
            r0 = r1
        L25:
            return r0
    }

    public int getOptimizerWrapWidth() {
            r4 = this;
            int r0 = r4.mWidth
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r1 = r4.mListDimensionBehaviors
            r2 = 0
            r1 = r1[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r3) goto L26
            int r1 = r4.mMatchConstraintDefaultWidth
            r3 = 1
            if (r1 != r3) goto L17
            int r1 = r4.mMatchConstraintMinWidth
            int r0 = java.lang.Math.max(r1, r0)
            goto L1f
        L17:
            int r0 = r4.mMatchConstraintMinWidth
            if (r0 <= 0) goto L1e
            r4.mWidth = r0
            goto L1f
        L1e:
            r0 = 0
        L1f:
            int r1 = r4.mMatchConstraintMaxWidth
            if (r1 <= 0) goto L26
            if (r1 >= r0) goto L26
            r0 = r1
        L26:
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getParent() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.mParent
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getPreviousChainMember(int r3) {
            r2 = this;
            if (r3 != 0) goto Lf
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 == 0) goto L1f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 != r3) goto L1f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.mOwner
            return r3
        Lf:
            r0 = 1
            if (r3 != r0) goto L1f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.mTarget
            if (r0 == 0) goto L1f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 != r3) goto L1f
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.mOwner
            return r3
        L1f:
            r3 = 0
            return r3
    }

    public int getRight() {
            r2 = this;
            int r0 = r2.getX()
            int r1 = r2.mWidth
            int r0 = r0 + r1
            return r0
    }

    public androidx.constraintlayout.core.widgets.analyzer.WidgetRun getRun(int r2) {
            r1 = this;
            if (r2 != 0) goto L5
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r1.horizontalRun
            return r2
        L5:
            r0 = 1
            if (r2 != r0) goto Lb
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r1.verticalRun
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public void getSceneString(java.lang.StringBuilder r13) {
            r12 = this;
            java.lang.String r0 = "  "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.String r1 = r12.stringId
            r0.append(r1)
            java.lang.String r1 = ":{\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r13.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "    actualWidth:"
            r0.append(r1)
            int r1 = r12.mWidth
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r13.append(r0)
            java.lang.String r0 = "\n"
            r13.append(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "    actualHeight:"
            r1.append(r2)
            int r2 = r12.mHeight
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r13.append(r1)
            r13.append(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "    actualLeft:"
            r1.append(r2)
            int r2 = r12.mX
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r13.append(r1)
            r13.append(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "    actualTop:"
            r1.append(r2)
            int r2 = r12.mY
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r13.append(r1)
            r13.append(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r12.mLeft
            java.lang.String r1 = "left"
            r12.getSceneString(r13, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r12.mTop
            java.lang.String r1 = "top"
            r12.getSceneString(r13, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r12.mRight
            java.lang.String r1 = "right"
            r12.getSceneString(r13, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r12.mBottom
            java.lang.String r1 = "bottom"
            r12.getSceneString(r13, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r12.mBaseline
            java.lang.String r1 = "baseline"
            r12.getSceneString(r13, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r12.mCenterX
            java.lang.String r1 = "centerX"
            r12.getSceneString(r13, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r12.mCenterY
            java.lang.String r1 = "centerY"
            r12.getSceneString(r13, r1, r0)
            int r3 = r12.mWidth
            int r4 = r12.mMinWidth
            int[] r0 = r12.mMaxDimension
            r11 = 0
            r5 = r0[r11]
            int r6 = r12.mWidthOverride
            int r7 = r12.mMatchConstraintMinWidth
            int r8 = r12.mMatchConstraintDefaultWidth
            float r9 = r12.mMatchConstraintPercentWidth
            float[] r0 = r12.mWeight
            r10 = r0[r11]
            java.lang.String r2 = "    width"
            r0 = r12
            r1 = r13
            r0.getSceneString(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int r3 = r12.mHeight
            int r4 = r12.mMinHeight
            int[] r0 = r12.mMaxDimension
            r1 = 1
            r5 = r0[r1]
            int r6 = r12.mHeightOverride
            int r7 = r12.mMatchConstraintMinHeight
            int r8 = r12.mMatchConstraintDefaultHeight
            float r9 = r12.mMatchConstraintPercentHeight
            float[] r0 = r12.mWeight
            r10 = r0[r1]
            java.lang.String r2 = "    height"
            r0 = r12
            r1 = r13
            r0.getSceneString(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            float r0 = r12.mDimensionRatio
            int r1 = r12.mDimensionRatioSide
            java.lang.String r2 = "    dimensionRatio"
            r12.serializeDimensionRatio(r13, r2, r0, r1)
            float r0 = r12.mHorizontalBiasPercent
            float r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DEFAULT_BIAS
            java.lang.String r2 = "    horizontalBias"
            r12.serializeAttribute(r13, r2, r0, r1)
            float r0 = r12.mVerticalBiasPercent
            float r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DEFAULT_BIAS
            java.lang.String r2 = "    verticalBias"
            r12.serializeAttribute(r13, r2, r0, r1)
            int r0 = r12.mHorizontalChainStyle
            java.lang.String r1 = "    horizontalChainStyle"
            r12.serializeAttribute(r13, r1, r0, r11)
            int r0 = r12.mVerticalChainStyle
            java.lang.String r1 = "    verticalChainStyle"
            r12.serializeAttribute(r13, r1, r0, r11)
            java.lang.String r0 = "  }"
            r13.append(r0)
            return
    }

    public int getTop() {
            r1 = this;
            int r0 = r1.getY()
            return r0
    }

    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.mType
            return r0
    }

    public float getVerticalBiasPercent() {
            r1 = this;
            float r0 = r1.mVerticalBiasPercent
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget getVerticalChainControlWidget() {
            r5 = this;
            boolean r0 = r5.isInVerticalChain()
            r1 = 0
            if (r0 == 0) goto L46
            r2 = r5
            r0 = r1
        L9:
            if (r0 != 0) goto L45
            if (r2 == 0) goto L45
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r2.getAnchor(r3)
            if (r3 != 0) goto L17
            r3 = r1
            goto L1b
        L17:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.getTarget()
        L1b:
            if (r3 != 0) goto L1f
            r3 = r1
            goto L23
        L1f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.getOwner()
        L23:
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r5.getParent()
            if (r3 != r4) goto L2b
            r1 = r2
            goto L46
        L2b:
            if (r3 != 0) goto L2f
            r4 = r1
            goto L39
        L2f:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r4.getTarget()
        L39:
            if (r4 == 0) goto L43
            androidx.constraintlayout.core.widgets.ConstraintWidget r4 = r4.getOwner()
            if (r4 == r2) goto L43
            r0 = r2
            goto L9
        L43:
            r2 = r3
            goto L9
        L45:
            r1 = r0
        L46:
            return r1
    }

    public int getVerticalChainStyle() {
            r1 = this;
            int r0 = r1.mVerticalChainStyle
            return r0
    }

    public androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour getVerticalDimensionBehaviour() {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r2.mListDimensionBehaviors
            r1 = 1
            r0 = r0[r1]
            return r0
    }

    public int getVerticalMargin() {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mLeft
            r1 = 0
            if (r0 == 0) goto La
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mTop
            int r0 = r0.mMargin
            int r1 = r1 + r0
        La:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mRight
            if (r0 == 0) goto L13
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mBottom
            int r0 = r0.mMargin
            int r1 = r1 + r0
        L13:
            return r1
    }

    public int getVisibility() {
            r1 = this;
            int r0 = r1.mVisibility
            return r0
    }

    public int getWidth() {
            r2 = this;
            int r0 = r2.mVisibility
            r1 = 8
            if (r0 != r1) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r2.mWidth
            return r0
    }

    public int getWrapBehaviorInParent() {
            r1 = this;
            int r0 = r1.mWrapBehaviorInParent
            return r0
    }

    public int getX() {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.mParent
            if (r0 == 0) goto L10
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r1 == 0) goto L10
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            int r0 = r0.mPaddingLeft
            int r1 = r2.mX
            int r0 = r0 + r1
            return r0
        L10:
            int r0 = r2.mX
            return r0
    }

    public int getY() {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.mParent
            if (r0 == 0) goto L10
            boolean r1 = r0 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r1 == 0) goto L10
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            int r0 = r0.mPaddingTop
            int r1 = r2.mY
            int r0 = r0 + r1
            return r0
        L10:
            int r0 = r2.mY
            return r0
    }

    public boolean hasBaseline() {
            r1 = this;
            boolean r0 = r1.hasBaseline
            return r0
    }

    public boolean hasDanglingDimension(int r5) {
            r4 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            if (r5 != 0) goto L1d
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto Ld
            r5 = 1
            goto Le
        Ld:
            r5 = 0
        Le:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r4.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L16
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r5 = r5 + r3
            if (r5 >= r0) goto L1b
            goto L1c
        L1b:
            r1 = 0
        L1c:
            return r1
        L1d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L25
            r5 = 1
            goto L26
        L25:
            r5 = 0
        L26:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r4.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L2e
            r3 = 1
            goto L2f
        L2e:
            r3 = 0
        L2f:
            int r5 = r5 + r3
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r4.mBaseline
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r3.mTarget
            if (r3 == 0) goto L38
            r3 = 1
            goto L39
        L38:
            r3 = 0
        L39:
            int r5 = r5 + r3
            if (r5 >= r0) goto L3d
            goto L3e
        L3d:
            r1 = 0
        L3e:
            return r1
    }

    public boolean hasDependencies() {
            r4 = this;
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r0 = r4.mAnchors
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L1d
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r3 = r4.mAnchors
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r3
            boolean r3 = r3.hasDependents()
            if (r3 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            int r2 = r2 + 1
            goto L8
        L1d:
            return r1
    }

    public boolean hasDimensionOverride() {
            r2 = this;
            int r0 = r2.mWidthOverride
            r1 = -1
            if (r0 != r1) goto Lc
            int r0 = r2.mHeightOverride
            if (r0 == r1) goto La
            goto Lc
        La:
            r0 = 0
            goto Ld
        Lc:
            r0 = 1
        Ld:
            return r0
    }

    public boolean hasResolvedTargets(int r5, int r6) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L40
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L7c
            boolean r5 = r5.hasFinalValue()
            if (r5 == 0) goto L7c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L7c
            boolean r5 = r5.hasFinalValue()
            if (r5 == 0) goto L7c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            int r5 = r5.getFinalValue()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.mRight
            int r2 = r2.getMargin()
            int r5 = r5 - r2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            int r2 = r2.getFinalValue()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r4.mLeft
            int r3 = r3.getMargin()
            int r3 = r3 + r2
            int r5 = r5 - r3
            if (r5 < r6) goto L3e
            goto L3f
        L3e:
            r0 = 0
        L3f:
            return r0
        L40:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L7c
            boolean r5 = r5.hasFinalValue()
            if (r5 == 0) goto L7c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            if (r5 == 0) goto L7c
            boolean r5 = r5.hasFinalValue()
            if (r5 == 0) goto L7c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r4.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r5.mTarget
            int r5 = r5.getFinalValue()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.mBottom
            int r2 = r2.getMargin()
            int r5 = r5 - r2
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r4.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTarget
            int r2 = r2.getFinalValue()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r4.mTop
            int r3 = r3.getMargin()
            int r3 = r3 + r2
            int r5 = r5 - r3
            if (r5 < r6) goto L7a
            goto L7b
        L7a:
            r0 = 0
        L7b:
            return r0
        L7c:
            return r1
    }

    public void immediateConnect(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r1, androidx.constraintlayout.core.widgets.ConstraintWidget r2, androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r3, int r4, int r5) {
            r0 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.getAnchor(r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.getAnchor(r3)
            r3 = 1
            r1.connect(r2, r4, r5, r3)
            return
    }

    public boolean isAnimated() {
            r1 = this;
            boolean r0 = r1.mAnimated
            return r0
    }

    public boolean isHeightWrapContent() {
            r1 = this;
            boolean r0 = r1.mIsHeightWrapContent
            return r0
    }

    public boolean isHorizontalSolvingPassDone() {
            r1 = this;
            boolean r0 = r1.horizontalSolvingPass
            return r0
    }

    public boolean isInBarrier(int r2) {
            r1 = this;
            boolean[] r0 = r1.mIsInBarrier
            boolean r2 = r0[r2]
            return r2
    }

    public boolean isInHorizontalChain() {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 == 0) goto La
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == r0) goto L14
        La:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 == 0) goto L16
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 != r0) goto L16
        L14:
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public boolean isInPlaceholder() {
            r1 = this;
            boolean r0 = r1.inPlaceholder
            return r0
    }

    public boolean isInVerticalChain() {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 == 0) goto La
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 == r0) goto L14
        La:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r0.mTarget
            if (r1 == 0) goto L16
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.mTarget
            if (r1 != r0) goto L16
        L14:
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public boolean isInVirtualLayout() {
            r1 = this;
            boolean r0 = r1.mInVirtualLayout
            return r0
    }

    public boolean isMeasureRequested() {
            r2 = this;
            boolean r0 = r2.mMeasureRequested
            if (r0 == 0) goto Lc
            int r0 = r2.mVisibility
            r1 = 8
            if (r0 == r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public boolean isResolvedHorizontally() {
            r1 = this;
            boolean r0 = r1.resolvedHorizontal
            if (r0 != 0) goto L17
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mLeft
            boolean r0 = r0.hasFinalValue()
            if (r0 == 0) goto L15
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mRight
            boolean r0 = r0.hasFinalValue()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            return r0
    }

    public boolean isResolvedVertically() {
            r1 = this;
            boolean r0 = r1.resolvedVertical
            if (r0 != 0) goto L17
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mTop
            boolean r0 = r0.hasFinalValue()
            if (r0 == 0) goto L15
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mBottom
            boolean r0 = r0.hasFinalValue()
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            return r0
    }

    public boolean isRoot() {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r1.mParent
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isSpreadHeight() {
            r3 = this;
            int r0 = r3.mMatchConstraintDefaultHeight
            r1 = 1
            if (r0 != 0) goto L1d
            float r0 = r3.mDimensionRatio
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1d
            int r0 = r3.mMatchConstraintMinHeight
            if (r0 != 0) goto L1d
            int r0 = r3.mMatchConstraintMaxHeight
            if (r0 != 0) goto L1d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r3.mListDimensionBehaviors
            r0 = r0[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r2) goto L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            return r1
    }

    public boolean isSpreadWidth() {
            r3 = this;
            int r0 = r3.mMatchConstraintDefaultWidth
            r1 = 0
            if (r0 != 0) goto L1d
            float r0 = r3.mDimensionRatio
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1d
            int r0 = r3.mMatchConstraintMinWidth
            if (r0 != 0) goto L1d
            int r0 = r3.mMatchConstraintMaxWidth
            if (r0 != 0) goto L1d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r3.mListDimensionBehaviors
            r0 = r0[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r2) goto L1d
            r1 = 1
        L1d:
            return r1
    }

    public boolean isVerticalSolvingPassDone() {
            r1 = this;
            boolean r0 = r1.verticalSolvingPass
            return r0
    }

    public boolean isWidthWrapContent() {
            r1 = this;
            boolean r0 = r1.mIsWidthWrapContent
            return r0
    }

    public void markHorizontalSolvingPassDone() {
            r1 = this;
            r0 = 1
            r1.horizontalSolvingPass = r0
            return
    }

    public void markVerticalSolvingPassDone() {
            r1 = this;
            r0 = 1
            r1.verticalSolvingPass = r0
            return
    }

    public boolean oppositeDimensionDependsOn(int r5) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r4.mListDimensionBehaviors
            r5 = r3[r5]
            r2 = r3[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r3) goto L14
            if (r2 != r3) goto L14
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    public boolean oppositeDimensionsTied() {
            r5 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r5.mListDimensionBehaviors
            r1 = 0
            r2 = r0[r1]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r4 = 1
            if (r2 != r3) goto Lf
            r0 = r0[r4]
            if (r0 != r3) goto Lf
            r1 = 1
        Lf:
            return r1
    }

    public void reset() {
            r6 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mLeft
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mTop
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mRight
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mBottom
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mBaseline
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mCenterX
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mCenterY
            r0.reset()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mCenter
            r0.reset()
            r0 = 0
            r6.mParent = r0
            r1 = 0
            r6.mCircleConstraintAngle = r1
            r2 = 0
            r6.mWidth = r2
            r6.mHeight = r2
            r6.mDimensionRatio = r1
            r1 = -1
            r6.mDimensionRatioSide = r1
            r6.mX = r2
            r6.mY = r2
            r6.mOffsetX = r2
            r6.mOffsetY = r2
            r6.mBaselineDistance = r2
            r6.mMinWidth = r2
            r6.mMinHeight = r2
            float r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DEFAULT_BIAS
            r6.mHorizontalBiasPercent = r3
            r6.mVerticalBiasPercent = r3
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r3 = r6.mListDimensionBehaviors
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r3[r2] = r4
            r5 = 1
            r3[r5] = r4
            r6.mCompanionWidget = r0
            r6.mContainerItemSkip = r2
            r6.mVisibility = r2
            r6.mType = r0
            r6.mHorizontalChainStyle = r2
            r6.mVerticalChainStyle = r2
            float[] r0 = r6.mWeight
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0[r2] = r3
            r0[r5] = r3
            r6.mHorizontalResolution = r1
            r6.mVerticalResolution = r1
            int[] r0 = r6.mMaxDimension
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0[r2] = r3
            r0[r5] = r3
            r6.mMatchConstraintDefaultWidth = r2
            r6.mMatchConstraintDefaultHeight = r2
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.mMatchConstraintPercentWidth = r0
            r6.mMatchConstraintPercentHeight = r0
            r6.mMatchConstraintMaxWidth = r3
            r6.mMatchConstraintMaxHeight = r3
            r6.mMatchConstraintMinWidth = r2
            r6.mMatchConstraintMinHeight = r2
            r6.mResolvedDimensionRatioSide = r1
            r6.mResolvedDimensionRatio = r0
            boolean[] r0 = r6.isTerminalWidget
            r0[r2] = r5
            r0[r5] = r5
            r6.mInVirtualLayout = r2
            boolean[] r0 = r6.mIsInBarrier
            r0[r2] = r2
            r0[r5] = r2
            r6.mMeasureRequested = r5
            int[] r0 = r6.mResolvedMatchConstraintDefault
            r0[r2] = r2
            r0[r5] = r2
            r6.mWidthOverride = r1
            r6.mHeightOverride = r1
            return
    }

    public void resetAllConstraints() {
            r1 = this;
            r1.resetAnchors()
            float r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DEFAULT_BIAS
            r1.setVerticalBiasPercent(r0)
            float r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DEFAULT_BIAS
            r1.setHorizontalBiasPercent(r0)
            return
    }

    public void resetAnchor(androidx.constraintlayout.core.widgets.ConstraintAnchor r9) {
            r8 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.getParent()
            if (r0 == 0) goto L1b
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.getParent()
            boolean r0 = r0 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r0 == 0) goto L1b
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r8.getParent()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            boolean r0 = r0.handlesInternalConstraints()
            if (r0 == 0) goto L1b
            return
        L1b:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r8.getAnchor(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.getAnchor(r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r8.getAnchor(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.getAnchor(r3)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.getAnchor(r4)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.getAnchor(r5)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.getAnchor(r6)
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r9 != r4) goto L87
            boolean r4 = r0.isConnected()
            if (r4 == 0) goto L65
            boolean r4 = r1.isConnected()
            if (r4 == 0) goto L65
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r0.getTarget()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r1.getTarget()
            if (r4 != r5) goto L65
            r0.reset()
            r1.reset()
        L65:
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L81
            boolean r0 = r3.isConnected()
            if (r0 == 0) goto L81
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.getTarget()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r3.getTarget()
            if (r0 != r1) goto L81
            r2.reset()
            r3.reset()
        L81:
            r8.mHorizontalBiasPercent = r7
            r8.mVerticalBiasPercent = r7
            goto L109
        L87:
            if (r9 != r5) goto Lb0
            boolean r2 = r0.isConnected()
            if (r2 == 0) goto Lad
            boolean r2 = r1.isConnected()
            if (r2 == 0) goto Lad
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r0.getTarget()
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.getOwner()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.getTarget()
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.getOwner()
            if (r2 != r3) goto Lad
            r0.reset()
            r1.reset()
        Lad:
            r8.mHorizontalBiasPercent = r7
            goto L109
        Lb0:
            if (r9 != r6) goto Ld9
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto Ld6
            boolean r0 = r3.isConnected()
            if (r0 == 0) goto Ld6
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.getTarget()
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.getOwner()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r3.getTarget()
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.getOwner()
            if (r0 != r1) goto Ld6
            r2.reset()
            r3.reset()
        Ld6:
            r8.mVerticalBiasPercent = r7
            goto L109
        Ld9:
            if (r9 == r0) goto Lf6
            if (r9 != r1) goto Lde
            goto Lf6
        Lde:
            if (r9 == r2) goto Le2
            if (r9 != r3) goto L109
        Le2:
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L109
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r2.getTarget()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r3.getTarget()
            if (r0 != r1) goto L109
            r4.reset()
            goto L109
        Lf6:
            boolean r2 = r0.isConnected()
            if (r2 == 0) goto L109
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r0.getTarget()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r1.getTarget()
            if (r0 != r1) goto L109
            r4.reset()
        L109:
            r9.reset()
            return
    }

    public void resetAnchors() {
            r3 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r3.getParent()
            if (r0 == 0) goto L17
            boolean r0 = r0 instanceof androidx.constraintlayout.core.widgets.ConstraintWidgetContainer
            if (r0 == 0) goto L17
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r3.getParent()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            boolean r0 = r0.handlesInternalConstraints()
            if (r0 == 0) goto L17
            return
        L17:
            r0 = 0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r1 = r3.mAnchors
            int r1 = r1.size()
        L1e:
            if (r0 >= r1) goto L2e
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r2 = r3.mAnchors
            java.lang.Object r2 = r2.get(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r2
            r2.reset()
            int r0 = r0 + 1
            goto L1e
        L2e:
            return
    }

    public void resetFinalResolution() {
            r3 = this;
            r0 = 0
            r3.resolvedHorizontal = r0
            r3.resolvedVertical = r0
            r3.horizontalSolvingPass = r0
            r3.verticalSolvingPass = r0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r1 = r3.mAnchors
            int r1 = r1.size()
        Lf:
            if (r0 >= r1) goto L1f
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintAnchor> r2 = r3.mAnchors
            java.lang.Object r2 = r2.get(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = (androidx.constraintlayout.core.widgets.ConstraintAnchor) r2
            r2.resetFinalResolution()
            int r0 = r0 + 1
            goto Lf
        L1f:
            return
    }

    public void resetSolverVariables(androidx.constraintlayout.core.Cache r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mLeft
            r0.resetSolverVariable(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mTop
            r0.resetSolverVariable(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mRight
            r0.resetSolverVariable(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mBottom
            r0.resetSolverVariable(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mBaseline
            r0.resetSolverVariable(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mCenter
            r0.resetSolverVariable(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mCenterX
            r0.resetSolverVariable(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mCenterY
            r0.resetSolverVariable(r2)
            return
    }

    public void resetSolvingPassFlag() {
            r1 = this;
            r0 = 0
            r1.horizontalSolvingPass = r0
            r1.verticalSolvingPass = r0
            return
    }

    public java.lang.StringBuilder serialize(java.lang.StringBuilder r12) {
            r11 = this;
            java.lang.String r0 = "{\n"
            r12.append(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r11.mLeft
            java.lang.String r1 = "left"
            r11.serializeAnchor(r12, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r11.mTop
            java.lang.String r1 = "top"
            r11.serializeAnchor(r12, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r11.mRight
            java.lang.String r1 = "right"
            r11.serializeAnchor(r12, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r11.mBottom
            java.lang.String r1 = "bottom"
            r11.serializeAnchor(r12, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r11.mBaseline
            java.lang.String r1 = "baseline"
            r11.serializeAnchor(r12, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r11.mCenterX
            java.lang.String r1 = "centerX"
            r11.serializeAnchor(r12, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r11.mCenterY
            java.lang.String r1 = "centerY"
            r11.serializeAnchor(r12, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r11.mCenter
            float r1 = r11.mCircleConstraintAngle
            r11.serializeCircle(r12, r0, r1)
            int r3 = r11.mWidth
            int r4 = r11.mMinWidth
            int[] r0 = r11.mMaxDimension
            r1 = 0
            r5 = r0[r1]
            int r6 = r11.mWidthOverride
            int r7 = r11.mMatchConstraintMinWidth
            int r8 = r11.mMatchConstraintDefaultWidth
            float r9 = r11.mMatchConstraintPercentWidth
            float[] r0 = r11.mWeight
            r10 = r0[r1]
            java.lang.String r2 = "width"
            r0 = r11
            r1 = r12
            r0.serializeSize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int r3 = r11.mHeight
            int r4 = r11.mMinHeight
            int[] r0 = r11.mMaxDimension
            r1 = 1
            r5 = r0[r1]
            int r6 = r11.mHeightOverride
            int r7 = r11.mMatchConstraintMinHeight
            int r8 = r11.mMatchConstraintDefaultHeight
            float r9 = r11.mMatchConstraintPercentHeight
            float[] r0 = r11.mWeight
            r10 = r0[r1]
            java.lang.String r2 = "height"
            r0 = r11
            r1 = r12
            r0.serializeSize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            float r0 = r11.mDimensionRatio
            int r1 = r11.mDimensionRatioSide
            java.lang.String r2 = "dimensionRatio"
            r11.serializeDimensionRatio(r12, r2, r0, r1)
            float r0 = r11.mHorizontalBiasPercent
            float r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DEFAULT_BIAS
            java.lang.String r2 = "horizontalBias"
            r11.serializeAttribute(r12, r2, r0, r1)
            float r0 = r11.mVerticalBiasPercent
            float r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DEFAULT_BIAS
            java.lang.String r2 = "verticalBias"
            r11.serializeAttribute(r12, r2, r0, r1)
            java.lang.String r0 = "}\n"
            r12.append(r0)
            return r12
    }

    public void setAnimated(boolean r1) {
            r0 = this;
            r0.mAnimated = r1
            return
    }

    public void setBaselineDistance(int r1) {
            r0 = this;
            r0.mBaselineDistance = r1
            if (r1 <= 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            r0.hasBaseline = r1
            return
    }

    public void setCompanionWidget(java.lang.Object r1) {
            r0 = this;
            r0.mCompanionWidget = r1
            return
    }

    public void setContainerItemSkip(int r1) {
            r0 = this;
            if (r1 < 0) goto L5
            r0.mContainerItemSkip = r1
            goto L8
        L5:
            r1 = 0
            r0.mContainerItemSkip = r1
        L8:
            return
    }

    public void setDebugName(java.lang.String r1) {
            r0 = this;
            r0.mDebugName = r1
            return
    }

    public void setDebugSolverName(androidx.constraintlayout.core.LinearSystem r7, java.lang.String r8) {
            r6 = this;
            r6.mDebugName = r8
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mLeft
            androidx.constraintlayout.core.SolverVariable r0 = r7.createObjectVariable(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r6.mTop
            androidx.constraintlayout.core.SolverVariable r1 = r7.createObjectVariable(r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r6.mRight
            androidx.constraintlayout.core.SolverVariable r2 = r7.createObjectVariable(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r6.mBottom
            androidx.constraintlayout.core.SolverVariable r3 = r7.createObjectVariable(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            java.lang.String r5 = ".left"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.setName(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r4 = ".top"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r1.setName(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".right"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.setName(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r1 = ".bottom"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.setName(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mBaseline
            androidx.constraintlayout.core.SolverVariable r7 = r7.createObjectVariable(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = ".baseline"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.setName(r8)
            return
    }

    public void setDimension(int r2, int r3) {
            r1 = this;
            r1.mWidth = r2
            int r0 = r1.mMinWidth
            if (r2 >= r0) goto L8
            r1.mWidth = r0
        L8:
            r1.mHeight = r3
            int r2 = r1.mMinHeight
            if (r3 >= r2) goto L10
            r1.mHeight = r2
        L10:
            return
    }

    public void setDimensionRatio(float r1, int r2) {
            r0 = this;
            r0.mDimensionRatio = r1
            r0.mDimensionRatioSide = r2
            return
    }

    public void setDimensionRatio(java.lang.String r9) {
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L8e
            int r1 = r9.length()
            if (r1 != 0) goto Lb
            goto L8e
        Lb:
            r1 = -1
            int r2 = r9.length()
            r3 = 44
            int r3 = r9.indexOf(r3)
            r4 = 0
            r5 = 1
            if (r3 <= 0) goto L37
            int r6 = r2 + (-1)
            if (r3 >= r6) goto L37
            java.lang.String r6 = r9.substring(r4, r3)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2c
            r1 = 0
            goto L35
        L2c:
            java.lang.String r4 = "H"
            boolean r4 = r6.equalsIgnoreCase(r4)
            if (r4 == 0) goto L35
            r1 = 1
        L35:
            int r4 = r3 + 1
        L37:
            r3 = 58
            int r3 = r9.indexOf(r3)
            if (r3 < 0) goto L75
            int r2 = r2 - r5
            if (r3 >= r2) goto L75
            java.lang.String r2 = r9.substring(r4, r3)
            int r3 = r3 + r5
            java.lang.String r9 = r9.substring(r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L84
            int r3 = r9.length()
            if (r3 <= 0) goto L84
            float r2 = java.lang.Float.parseFloat(r2)     // Catch: java.lang.NumberFormatException -> L84
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L84
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 <= 0) goto L84
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 <= 0) goto L84
            if (r1 != r5) goto L6f
            float r9 = r9 / r2
            float r9 = java.lang.Math.abs(r9)     // Catch: java.lang.NumberFormatException -> L84
            goto L85
        L6f:
            float r2 = r2 / r9
            float r9 = java.lang.Math.abs(r2)     // Catch: java.lang.NumberFormatException -> L84
            goto L85
        L75:
            java.lang.String r9 = r9.substring(r4)
            int r2 = r9.length()
            if (r2 <= 0) goto L84
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L84
            goto L85
        L84:
            r9 = 0
        L85:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8d
            r8.mDimensionRatio = r9
            r8.mDimensionRatioSide = r1
        L8d:
            return
        L8e:
            r8.mDimensionRatio = r0
            return
    }

    public void setFinalBaseline(int r4) {
            r3 = this;
            boolean r0 = r3.hasBaseline
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r3.mBaselineDistance
            int r0 = r4 - r0
            int r1 = r3.mHeight
            int r1 = r1 + r0
            r3.mY = r0
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r3.mTop
            r2.setFinalValue(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.mBottom
            r0.setFinalValue(r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r3.mBaseline
            r0.setFinalValue(r4)
            r4 = 1
            r3.resolvedVertical = r4
            return
    }

    public void setFinalFrame(int r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            r0.setFrame(r1, r2, r3, r4)
            r0.setBaselineDistance(r5)
            r1 = 0
            r2 = 1
            if (r6 != 0) goto Lf
            r0.resolvedHorizontal = r2
            r0.resolvedVertical = r1
            goto L22
        Lf:
            if (r6 != r2) goto L16
            r0.resolvedHorizontal = r1
            r0.resolvedVertical = r2
            goto L22
        L16:
            r3 = 2
            if (r6 != r3) goto L1e
            r0.resolvedHorizontal = r2
            r0.resolvedVertical = r2
            goto L22
        L1e:
            r0.resolvedHorizontal = r1
            r0.resolvedVertical = r1
        L22:
            return
    }

    public void setFinalHorizontal(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.resolvedHorizontal
            if (r0 == 0) goto L5
            return
        L5:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mLeft
            r0.setFinalValue(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mRight
            r0.setFinalValue(r3)
            r1.mX = r2
            int r3 = r3 - r2
            r1.mWidth = r3
            r2 = 1
            r1.resolvedHorizontal = r2
            return
    }

    public void setFinalLeft(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mLeft
            r0.setFinalValue(r2)
            r1.mX = r2
            return
    }

    public void setFinalTop(int r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mTop
            r0.setFinalValue(r2)
            r1.mY = r2
            return
    }

    public void setFinalVertical(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.resolvedVertical
            if (r0 == 0) goto L5
            return
        L5:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mTop
            r0.setFinalValue(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r1.mBottom
            r0.setFinalValue(r3)
            r1.mY = r2
            int r3 = r3 - r2
            r1.mHeight = r3
            boolean r3 = r1.hasBaseline
            if (r3 == 0) goto L20
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r1.mBaseline
            int r0 = r1.mBaselineDistance
            int r2 = r2 + r0
            r3.setFinalValue(r2)
        L20:
            r2 = 1
            r1.resolvedVertical = r2
            return
    }

    public void setFrame(int r2, int r3, int r4) {
            r1 = this;
            if (r4 != 0) goto L6
            r1.setHorizontalDimension(r2, r3)
            goto Lc
        L6:
            r0 = 1
            if (r4 != r0) goto Lc
            r1.setVerticalDimension(r2, r3)
        Lc:
            return
    }

    public void setFrame(int r4, int r5, int r6, int r7) {
            r3 = this;
            int r6 = r6 - r4
            int r7 = r7 - r5
            r3.mX = r4
            r3.mY = r5
            int r4 = r3.mVisibility
            r5 = 0
            r0 = 8
            if (r4 != r0) goto L12
            r3.mWidth = r5
            r3.mHeight = r5
            return
        L12:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r4 = r3.mListDimensionBehaviors
            r0 = r4[r5]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r0 != r1) goto L1f
            int r0 = r3.mWidth
            if (r6 >= r0) goto L1f
            r6 = r0
        L1f:
            r0 = 1
            r2 = r4[r0]
            if (r2 != r1) goto L29
            int r1 = r3.mHeight
            if (r7 >= r1) goto L29
            r7 = r1
        L29:
            r3.mWidth = r6
            r3.mHeight = r7
            int r1 = r3.mMinHeight
            if (r7 >= r1) goto L33
            r3.mHeight = r1
        L33:
            int r1 = r3.mMinWidth
            if (r6 >= r1) goto L39
            r3.mWidth = r1
        L39:
            int r1 = r3.mMatchConstraintMaxWidth
            if (r1 <= 0) goto L4b
            r4 = r4[r5]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r4 != r5) goto L4b
            int r4 = r3.mWidth
            int r4 = java.lang.Math.min(r4, r1)
            r3.mWidth = r4
        L4b:
            int r4 = r3.mMatchConstraintMaxHeight
            if (r4 <= 0) goto L5f
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r3.mListDimensionBehaviors
            r5 = r5[r0]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r5 != r0) goto L5f
            int r5 = r3.mHeight
            int r4 = java.lang.Math.min(r5, r4)
            r3.mHeight = r4
        L5f:
            int r4 = r3.mWidth
            if (r6 == r4) goto L65
            r3.mWidthOverride = r4
        L65:
            int r4 = r3.mHeight
            if (r7 == r4) goto L6b
            r3.mHeightOverride = r4
        L6b:
            return
    }

    public void setGoneMargin(androidx.constraintlayout.core.widgets.ConstraintAnchor.Type r2, int r3) {
            r1 = this;
            int[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L2c
            r0 = 2
            if (r2 == r0) goto L27
            r0 = 3
            if (r2 == r0) goto L22
            r0 = 4
            if (r2 == r0) goto L1d
            r0 = 5
            if (r2 == r0) goto L18
            goto L30
        L18:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mBaseline
            r2.mGoneMargin = r3
            goto L30
        L1d:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mBottom
            r2.mGoneMargin = r3
            goto L30
        L22:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mRight
            r2.mGoneMargin = r3
            goto L30
        L27:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mTop
            r2.mGoneMargin = r3
            goto L30
        L2c:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r1.mLeft
            r2.mGoneMargin = r3
        L30:
            return
    }

    public void setHasBaseline(boolean r1) {
            r0 = this;
            r0.hasBaseline = r1
            return
    }

    public void setHeight(int r2) {
            r1 = this;
            r1.mHeight = r2
            int r0 = r1.mMinHeight
            if (r2 >= r0) goto L8
            r1.mHeight = r0
        L8:
            return
    }

    public void setHeightWrapContent(boolean r1) {
            r0 = this;
            r0.mIsHeightWrapContent = r1
            return
    }

    public void setHorizontalBiasPercent(float r1) {
            r0 = this;
            r0.mHorizontalBiasPercent = r1
            return
    }

    public void setHorizontalChainStyle(int r1) {
            r0 = this;
            r0.mHorizontalChainStyle = r1
            return
    }

    public void setHorizontalDimension(int r1, int r2) {
            r0 = this;
            r0.mX = r1
            int r2 = r2 - r1
            r0.mWidth = r2
            int r1 = r0.mMinWidth
            if (r2 >= r1) goto Lb
            r0.mWidth = r1
        Lb:
            return
    }

    public void setHorizontalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r3) {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r2.mListDimensionBehaviors
            r1 = 0
            r0[r1] = r3
            return
    }

    public void setHorizontalMatchStyle(int r1, int r2, int r3, float r4) {
            r0 = this;
            r0.mMatchConstraintDefaultWidth = r1
            r0.mMatchConstraintMinWidth = r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r2) goto La
            r3 = 0
        La:
            r0.mMatchConstraintMaxWidth = r3
            r0.mMatchConstraintPercentWidth = r4
            r2 = 0
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1e
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L1e
            if (r1 != 0) goto L1e
            r1 = 2
            r0.mMatchConstraintDefaultWidth = r1
        L1e:
            return
    }

    public void setHorizontalWeight(float r3) {
            r2 = this;
            float[] r0 = r2.mWeight
            r1 = 0
            r0[r1] = r3
            return
    }

    public final void setInBarrier(int r2, boolean r3) {
            r1 = this;
            boolean[] r0 = r1.mIsInBarrier
            r0[r2] = r3
            return
    }

    public void setInPlaceholder(boolean r1) {
            r0 = this;
            r0.inPlaceholder = r1
            return
    }

    public void setInVirtualLayout(boolean r1) {
            r0 = this;
            r0.mInVirtualLayout = r1
            return
    }

    public void setLastMeasureSpec(int r1, int r2) {
            r0 = this;
            r0.mLastHorizontalMeasureSpec = r1
            r0.mLastVerticalMeasureSpec = r2
            r1 = 0
            r0.setMeasureRequested(r1)
            return
    }

    public void setLength(int r2, int r3) {
            r1 = this;
            if (r3 != 0) goto L6
            r1.setWidth(r2)
            goto Lc
        L6:
            r0 = 1
            if (r3 != r0) goto Lc
            r1.setHeight(r2)
        Lc:
            return
    }

    public void setMaxHeight(int r3) {
            r2 = this;
            int[] r0 = r2.mMaxDimension
            r1 = 1
            r0[r1] = r3
            return
    }

    public void setMaxWidth(int r3) {
            r2 = this;
            int[] r0 = r2.mMaxDimension
            r1 = 0
            r0[r1] = r3
            return
    }

    public void setMeasureRequested(boolean r1) {
            r0 = this;
            r0.mMeasureRequested = r1
            return
    }

    public void setMinHeight(int r1) {
            r0 = this;
            if (r1 >= 0) goto L6
            r1 = 0
            r0.mMinHeight = r1
            goto L8
        L6:
            r0.mMinHeight = r1
        L8:
            return
    }

    public void setMinWidth(int r1) {
            r0 = this;
            if (r1 >= 0) goto L6
            r1 = 0
            r0.mMinWidth = r1
            goto L8
        L6:
            r0.mMinWidth = r1
        L8:
            return
    }

    public void setOffset(int r1, int r2) {
            r0 = this;
            r0.mOffsetX = r1
            r0.mOffsetY = r2
            return
    }

    public void setOrigin(int r1, int r2) {
            r0 = this;
            r0.mX = r1
            r0.mY = r2
            return
    }

    public void setParent(androidx.constraintlayout.core.widgets.ConstraintWidget r1) {
            r0 = this;
            r0.mParent = r1
            return
    }

    public void setType(java.lang.String r1) {
            r0 = this;
            r0.mType = r1
            return
    }

    public void setVerticalBiasPercent(float r1) {
            r0 = this;
            r0.mVerticalBiasPercent = r1
            return
    }

    public void setVerticalChainStyle(int r1) {
            r0 = this;
            r0.mVerticalChainStyle = r1
            return
    }

    public void setVerticalDimension(int r1, int r2) {
            r0 = this;
            r0.mY = r1
            int r2 = r2 - r1
            r0.mHeight = r2
            int r1 = r0.mMinHeight
            if (r2 >= r1) goto Lb
            r0.mHeight = r1
        Lb:
            return
    }

    public void setVerticalDimensionBehaviour(androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour r3) {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = r2.mListDimensionBehaviors
            r1 = 1
            r0[r1] = r3
            return
    }

    public void setVerticalMatchStyle(int r1, int r2, int r3, float r4) {
            r0 = this;
            r0.mMatchConstraintDefaultHeight = r1
            r0.mMatchConstraintMinHeight = r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r2) goto La
            r3 = 0
        La:
            r0.mMatchConstraintMaxHeight = r3
            r0.mMatchConstraintPercentHeight = r4
            r2 = 0
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1e
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L1e
            if (r1 != 0) goto L1e
            r1 = 2
            r0.mMatchConstraintDefaultHeight = r1
        L1e:
            return
    }

    public void setVerticalWeight(float r3) {
            r2 = this;
            float[] r0 = r2.mWeight
            r1 = 1
            r0[r1] = r3
            return
    }

    public void setVisibility(int r1) {
            r0 = this;
            r0.mVisibility = r1
            return
    }

    public void setWidth(int r2) {
            r1 = this;
            r1.mWidth = r2
            int r0 = r1.mMinWidth
            if (r2 >= r0) goto L8
            r1.mWidth = r0
        L8:
            return
    }

    public void setWidthWrapContent(boolean r1) {
            r0 = this;
            r0.mIsWidthWrapContent = r1
            return
    }

    public void setWrapBehaviorInParent(int r2) {
            r1 = this;
            if (r2 < 0) goto L7
            r0 = 3
            if (r2 > r0) goto L7
            r1.mWrapBehaviorInParent = r2
        L7:
            return
    }

    public void setX(int r1) {
            r0 = this;
            r0.mX = r1
            return
    }

    public void setY(int r1) {
            r0 = this;
            r0.mY = r1
            return
    }

    public void setupDimensionRatio(boolean r4, boolean r5, boolean r6, boolean r7) {
            r3 = this;
            int r4 = r3.mResolvedDimensionRatioSide
            r5 = 1065353216(0x3f800000, float:1.0)
            r0 = 0
            r1 = -1
            r2 = 1
            if (r4 != r1) goto L20
            if (r6 == 0) goto L10
            if (r7 != 0) goto L10
            r3.mResolvedDimensionRatioSide = r0
            goto L20
        L10:
            if (r6 != 0) goto L20
            if (r7 == 0) goto L20
            r3.mResolvedDimensionRatioSide = r2
            int r4 = r3.mDimensionRatioSide
            if (r4 != r1) goto L20
            float r4 = r3.mResolvedDimensionRatio
            float r4 = r5 / r4
            r3.mResolvedDimensionRatio = r4
        L20:
            int r4 = r3.mResolvedDimensionRatioSide
            if (r4 != 0) goto L37
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mTop
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L34
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mBottom
            boolean r4 = r4.isConnected()
            if (r4 != 0) goto L37
        L34:
            r3.mResolvedDimensionRatioSide = r2
            goto L4d
        L37:
            int r4 = r3.mResolvedDimensionRatioSide
            if (r4 != r2) goto L4d
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mLeft
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L4b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mRight
            boolean r4 = r4.isConnected()
            if (r4 != 0) goto L4d
        L4b:
            r3.mResolvedDimensionRatioSide = r0
        L4d:
            int r4 = r3.mResolvedDimensionRatioSide
            if (r4 != r1) goto L9c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mTop
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L71
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mBottom
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L71
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mLeft
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L71
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mRight
            boolean r4 = r4.isConnected()
            if (r4 != 0) goto L9c
        L71:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mTop
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L84
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mBottom
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L84
            r3.mResolvedDimensionRatioSide = r0
            goto L9c
        L84:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mLeft
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L9c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r3.mRight
            boolean r4 = r4.isConnected()
            if (r4 == 0) goto L9c
            float r4 = r3.mResolvedDimensionRatio
            float r4 = r5 / r4
            r3.mResolvedDimensionRatio = r4
            r3.mResolvedDimensionRatioSide = r2
        L9c:
            int r4 = r3.mResolvedDimensionRatioSide
            if (r4 != r1) goto Lb8
            int r4 = r3.mMatchConstraintMinWidth
            if (r4 <= 0) goto Lab
            int r6 = r3.mMatchConstraintMinHeight
            if (r6 != 0) goto Lab
            r3.mResolvedDimensionRatioSide = r0
            goto Lb8
        Lab:
            if (r4 != 0) goto Lb8
            int r4 = r3.mMatchConstraintMinHeight
            if (r4 <= 0) goto Lb8
            float r4 = r3.mResolvedDimensionRatio
            float r5 = r5 / r4
            r3.mResolvedDimensionRatio = r5
            r3.mResolvedDimensionRatioSide = r2
        Lb8:
            return
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.mType
            java.lang.String r2 = " "
            java.lang.String r3 = ""
            if (r1 == 0) goto L1b
            java.lang.String r1 = "type: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r4 = r5.mType
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r4, r2)
            goto L1c
        L1b:
            r1 = r3
        L1c:
            r0.append(r1)
            java.lang.String r1 = r5.mDebugName
            if (r1 == 0) goto L2f
            java.lang.String r1 = "id: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r3 = r5.mDebugName
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3, r2)
        L2f:
            r0.append(r3)
            java.lang.String r1 = "("
            r0.append(r1)
            int r1 = r5.mX
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            int r1 = r5.mY
            r0.append(r1)
            java.lang.String r1 = ") - ("
            r0.append(r1)
            int r1 = r5.mWidth
            r0.append(r1)
            java.lang.String r1 = " x "
            r0.append(r1)
            int r1 = r5.mHeight
            java.lang.String r2 = ")"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
            return r0
    }

    public void updateFromRuns(boolean r8, boolean r9) {
            r7 = this;
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r7.horizontalRun
            boolean r0 = r0.isResolved()
            r8 = r8 & r0
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r7.verticalRun
            boolean r0 = r0.isResolved()
            r9 = r9 & r0
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r7.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.start
            int r1 = r1.value
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r7.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r2.start
            int r3 = r3.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            int r0 = r0.value
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.end
            int r2 = r2.value
            int r4 = r0 - r1
            int r5 = r2 - r3
            r6 = 0
            if (r4 < 0) goto L40
            if (r5 < 0) goto L40
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r4) goto L40
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r5) goto L40
            if (r3 == r4) goto L40
            if (r3 == r5) goto L40
            if (r0 == r4) goto L40
            if (r0 == r5) goto L40
            if (r2 == r4) goto L40
            if (r2 != r5) goto L44
        L40:
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L44:
            int r0 = r0 - r1
            int r2 = r2 - r3
            if (r8 == 0) goto L4a
            r7.mX = r1
        L4a:
            if (r9 == 0) goto L4e
            r7.mY = r3
        L4e:
            int r1 = r7.mVisibility
            r3 = 8
            if (r1 != r3) goto L59
            r7.mWidth = r6
            r7.mHeight = r6
            return
        L59:
            if (r8 == 0) goto L70
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r7.mListDimensionBehaviors
            r8 = r8[r6]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r8 != r1) goto L68
            int r8 = r7.mWidth
            if (r0 >= r8) goto L68
            r0 = r8
        L68:
            r7.mWidth = r0
            int r8 = r7.mMinWidth
            if (r0 >= r8) goto L70
            r7.mWidth = r8
        L70:
            if (r9 == 0) goto L88
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r8 = r7.mListDimensionBehaviors
            r9 = 1
            r8 = r8[r9]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r8 != r9) goto L80
            int r8 = r7.mHeight
            if (r2 >= r8) goto L80
            r2 = r8
        L80:
            r7.mHeight = r2
            int r8 = r7.mMinHeight
            if (r2 >= r8) goto L88
            r7.mHeight = r8
        L88:
            return
    }

    public void updateFromSolver(androidx.constraintlayout.core.LinearSystem r7, boolean r8) {
            r6 = this;
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mLeft
            int r0 = r7.getObjectVariableValue(r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r6.mTop
            int r1 = r7.getObjectVariableValue(r1)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r6.mRight
            int r2 = r7.getObjectVariableValue(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r6.mBottom
            int r7 = r7.getObjectVariableValue(r3)
            if (r8 == 0) goto L2e
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r3 = r6.horizontalRun
            if (r3 == 0) goto L2e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r4 = r3.start
            boolean r5 = r4.resolved
            if (r5 == 0) goto L2e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.end
            boolean r5 = r3.resolved
            if (r5 == 0) goto L2e
            int r0 = r4.value
            int r2 = r3.value
        L2e:
            if (r8 == 0) goto L44
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r8 = r6.verticalRun
            if (r8 == 0) goto L44
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r8.start
            boolean r4 = r3.resolved
            if (r4 == 0) goto L44
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r8 = r8.end
            boolean r4 = r8.resolved
            if (r4 == 0) goto L44
            int r1 = r3.value
            int r7 = r8.value
        L44:
            int r8 = r2 - r0
            int r3 = r7 - r1
            r4 = 0
            if (r8 < 0) goto L62
            if (r3 < 0) goto L62
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r8) goto L62
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r3) goto L62
            if (r1 == r8) goto L62
            if (r1 == r3) goto L62
            if (r2 == r8) goto L62
            if (r2 == r3) goto L62
            if (r7 == r8) goto L62
            if (r7 != r3) goto L66
        L62:
            r7 = 0
            r0 = 0
            r1 = 0
            r2 = 0
        L66:
            r6.setFrame(r0, r1, r2, r7)
            return
    }
}
