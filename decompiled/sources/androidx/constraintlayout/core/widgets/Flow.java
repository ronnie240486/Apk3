package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes3.dex */
public class Flow extends androidx.constraintlayout.core.widgets.VirtualLayout {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_CHAIN_NEW = 3;
    public static final int WRAP_NONE = 0;
    private androidx.constraintlayout.core.widgets.ConstraintWidget[] mAlignedBiggestElementsInCols;
    private androidx.constraintlayout.core.widgets.ConstraintWidget[] mAlignedBiggestElementsInRows;
    private int[] mAlignedDimensions;
    private java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow.WidgetsList> mChainList;
    private androidx.constraintlayout.core.widgets.ConstraintWidget[] mDisplayedWidgets;
    private int mDisplayedWidgetsCount;
    private float mFirstHorizontalBias;
    private int mFirstHorizontalStyle;
    private float mFirstVerticalBias;
    private int mFirstVerticalStyle;
    private int mHorizontalAlign;
    private float mHorizontalBias;
    private int mHorizontalGap;
    private int mHorizontalStyle;
    private float mLastHorizontalBias;
    private int mLastHorizontalStyle;
    private float mLastVerticalBias;
    private int mLastVerticalStyle;
    private int mMaxElementsWrap;
    private int mOrientation;
    private int mVerticalAlign;
    private float mVerticalBias;
    private int mVerticalGap;
    private int mVerticalStyle;
    private int mWrapMode;

    /* JADX INFO: loaded from: classes.dex */
    public class WidgetsList {
        private androidx.constraintlayout.core.widgets.ConstraintWidget biggest;
        public int biggestDimension;
        private androidx.constraintlayout.core.widgets.ConstraintAnchor mBottom;
        private int mCount;
        private int mHeight;
        private androidx.constraintlayout.core.widgets.ConstraintAnchor mLeft;
        private int mMax;
        private int mNbMatchConstraintsWidgets;
        private int mOrientation;
        private int mPaddingBottom;
        private int mPaddingLeft;
        private int mPaddingRight;
        private int mPaddingTop;
        private androidx.constraintlayout.core.widgets.ConstraintAnchor mRight;
        private int mStartIndex;
        private androidx.constraintlayout.core.widgets.ConstraintAnchor mTop;
        private int mWidth;
        public final /* synthetic */ androidx.constraintlayout.core.widgets.Flow this$0;

        public WidgetsList(androidx.constraintlayout.core.widgets.Flow r2, int r3, androidx.constraintlayout.core.widgets.ConstraintAnchor r4, androidx.constraintlayout.core.widgets.ConstraintAnchor r5, androidx.constraintlayout.core.widgets.ConstraintAnchor r6, androidx.constraintlayout.core.widgets.ConstraintAnchor r7, int r8) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                r0 = 0
                r1.biggest = r0
                r0 = 0
                r1.biggestDimension = r0
                r1.mPaddingLeft = r0
                r1.mPaddingTop = r0
                r1.mPaddingRight = r0
                r1.mPaddingBottom = r0
                r1.mWidth = r0
                r1.mHeight = r0
                r1.mStartIndex = r0
                r1.mCount = r0
                r1.mNbMatchConstraintsWidgets = r0
                r1.mMax = r0
                r1.mOrientation = r3
                r1.mLeft = r4
                r1.mTop = r5
                r1.mRight = r6
                r1.mBottom = r7
                int r3 = r2.getPaddingLeft()
                r1.mPaddingLeft = r3
                int r3 = r2.getPaddingTop()
                r1.mPaddingTop = r3
                int r3 = r2.getPaddingRight()
                r1.mPaddingRight = r3
                int r2 = r2.getPaddingBottom()
                r1.mPaddingBottom = r2
                r1.mMax = r8
                return
        }

        public static /* synthetic */ androidx.constraintlayout.core.widgets.ConstraintWidget access$2000(androidx.constraintlayout.core.widgets.Flow.WidgetsList r0) {
                androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.biggest
                return r0
        }

        private void recomputeDimensions() {
                r9 = this;
                r0 = 0
                r9.mWidth = r0
                r9.mHeight = r0
                r1 = 0
                r9.biggest = r1
                r9.biggestDimension = r0
                int r1 = r9.mCount
                r2 = 0
            Ld:
                if (r2 >= r1) goto L90
                int r3 = r9.mStartIndex
                int r3 = r3 + r2
                androidx.constraintlayout.core.widgets.Flow r4 = r9.this$0
                int r4 = androidx.constraintlayout.core.widgets.Flow.access$400(r4)
                if (r3 < r4) goto L1c
                goto L90
            L1c:
                androidx.constraintlayout.core.widgets.Flow r3 = r9.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r3 = androidx.constraintlayout.core.widgets.Flow.access$500(r3)
                int r4 = r9.mStartIndex
                int r4 = r4 + r2
                r3 = r3[r4]
                int r4 = r9.mOrientation
                r5 = 8
                if (r4 != 0) goto L5b
                int r4 = r3.getWidth()
                androidx.constraintlayout.core.widgets.Flow r6 = r9.this$0
                int r6 = androidx.constraintlayout.core.widgets.Flow.access$000(r6)
                int r7 = r3.getVisibility()
                if (r7 != r5) goto L3e
                r6 = 0
            L3e:
                int r5 = r9.mWidth
                int r4 = r4 + r6
                int r4 = r4 + r5
                r9.mWidth = r4
                androidx.constraintlayout.core.widgets.Flow r4 = r9.this$0
                int r5 = r9.mMax
                int r4 = androidx.constraintlayout.core.widgets.Flow.access$300(r4, r3, r5)
                androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r9.biggest
                if (r5 == 0) goto L54
                int r5 = r9.biggestDimension
                if (r5 >= r4) goto L8c
            L54:
                r9.biggest = r3
                r9.biggestDimension = r4
                r9.mHeight = r4
                goto L8c
            L5b:
                androidx.constraintlayout.core.widgets.Flow r4 = r9.this$0
                int r6 = r9.mMax
                int r4 = androidx.constraintlayout.core.widgets.Flow.access$200(r4, r3, r6)
                androidx.constraintlayout.core.widgets.Flow r6 = r9.this$0
                int r7 = r9.mMax
                int r6 = androidx.constraintlayout.core.widgets.Flow.access$300(r6, r3, r7)
                androidx.constraintlayout.core.widgets.Flow r7 = r9.this$0
                int r7 = androidx.constraintlayout.core.widgets.Flow.access$100(r7)
                int r8 = r3.getVisibility()
                if (r8 != r5) goto L78
                r7 = 0
            L78:
                int r5 = r9.mHeight
                int r6 = r6 + r7
                int r6 = r6 + r5
                r9.mHeight = r6
                androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r9.biggest
                if (r5 == 0) goto L86
                int r5 = r9.biggestDimension
                if (r5 >= r4) goto L8c
            L86:
                r9.biggest = r3
                r9.biggestDimension = r4
                r9.mWidth = r4
            L8c:
                int r2 = r2 + 1
                goto Ld
            L90:
                return
        }

        public void add(androidx.constraintlayout.core.widgets.ConstraintWidget r7) {
                r6 = this;
                int r0 = r6.mOrientation
                r1 = 8
                r2 = 0
                if (r0 != 0) goto L49
                androidx.constraintlayout.core.widgets.Flow r0 = r6.this$0
                int r3 = r6.mMax
                int r0 = androidx.constraintlayout.core.widgets.Flow.access$200(r0, r7, r3)
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r7.getHorizontalDimensionBehaviour()
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r3 != r4) goto L1e
                int r0 = r6.mNbMatchConstraintsWidgets
                int r0 = r0 + 1
                r6.mNbMatchConstraintsWidgets = r0
                r0 = 0
            L1e:
                androidx.constraintlayout.core.widgets.Flow r3 = r6.this$0
                int r3 = androidx.constraintlayout.core.widgets.Flow.access$000(r3)
                int r4 = r7.getVisibility()
                if (r4 != r1) goto L2b
                goto L2c
            L2b:
                r2 = r3
            L2c:
                int r1 = r6.mWidth
                int r0 = r0 + r2
                int r0 = r0 + r1
                r6.mWidth = r0
                androidx.constraintlayout.core.widgets.Flow r0 = r6.this$0
                int r1 = r6.mMax
                int r0 = androidx.constraintlayout.core.widgets.Flow.access$300(r0, r7, r1)
                androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r6.biggest
                if (r1 == 0) goto L42
                int r1 = r6.biggestDimension
                if (r1 >= r0) goto L8a
            L42:
                r6.biggest = r7
                r6.biggestDimension = r0
                r6.mHeight = r0
                goto L8a
            L49:
                androidx.constraintlayout.core.widgets.Flow r0 = r6.this$0
                int r3 = r6.mMax
                int r0 = androidx.constraintlayout.core.widgets.Flow.access$200(r0, r7, r3)
                androidx.constraintlayout.core.widgets.Flow r3 = r6.this$0
                int r4 = r6.mMax
                int r3 = androidx.constraintlayout.core.widgets.Flow.access$300(r3, r7, r4)
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r7.getVerticalDimensionBehaviour()
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r4 != r5) goto L68
                int r3 = r6.mNbMatchConstraintsWidgets
                int r3 = r3 + 1
                r6.mNbMatchConstraintsWidgets = r3
                r3 = 0
            L68:
                androidx.constraintlayout.core.widgets.Flow r4 = r6.this$0
                int r4 = androidx.constraintlayout.core.widgets.Flow.access$100(r4)
                int r5 = r7.getVisibility()
                if (r5 != r1) goto L75
                goto L76
            L75:
                r2 = r4
            L76:
                int r1 = r6.mHeight
                int r3 = r3 + r2
                int r3 = r3 + r1
                r6.mHeight = r3
                androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r6.biggest
                if (r1 == 0) goto L84
                int r1 = r6.biggestDimension
                if (r1 >= r0) goto L8a
            L84:
                r6.biggest = r7
                r6.biggestDimension = r0
                r6.mWidth = r0
            L8a:
                int r7 = r6.mCount
                int r7 = r7 + 1
                r6.mCount = r7
                return
        }

        public void clear() {
                r2 = this;
                r0 = 0
                r2.biggestDimension = r0
                r1 = 0
                r2.biggest = r1
                r2.mWidth = r0
                r2.mHeight = r0
                r2.mStartIndex = r0
                r2.mCount = r0
                r2.mNbMatchConstraintsWidgets = r0
                return
        }

        public void createConstraints(boolean r17, int r18, boolean r19) {
                r16 = this;
                r0 = r16
                int r1 = r0.mCount
                r2 = 0
                r3 = 0
            L6:
                if (r3 >= r1) goto L27
                int r4 = r0.mStartIndex
                int r4 = r4 + r3
                androidx.constraintlayout.core.widgets.Flow r5 = r0.this$0
                int r5 = androidx.constraintlayout.core.widgets.Flow.access$400(r5)
                if (r4 < r5) goto L14
                goto L27
            L14:
                androidx.constraintlayout.core.widgets.Flow r4 = r0.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r4 = androidx.constraintlayout.core.widgets.Flow.access$500(r4)
                int r5 = r0.mStartIndex
                int r5 = r5 + r3
                r4 = r4[r5]
                if (r4 == 0) goto L24
                r4.resetAnchors()
            L24:
                int r3 = r3 + 1
                goto L6
            L27:
                if (r1 == 0) goto L382
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.biggest
                if (r3 != 0) goto L2f
                goto L382
            L2f:
                if (r19 == 0) goto L35
                if (r18 != 0) goto L35
                r4 = 1
                goto L36
            L35:
                r4 = 0
            L36:
                r5 = -1
                r6 = 0
                r7 = -1
                r8 = -1
            L3a:
                if (r6 >= r1) goto L69
                if (r17 == 0) goto L42
                int r9 = r1 + (-1)
                int r9 = r9 - r6
                goto L43
            L42:
                r9 = r6
            L43:
                int r10 = r0.mStartIndex
                int r10 = r10 + r9
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.core.widgets.Flow.access$400(r11)
                if (r10 < r11) goto L4f
                goto L69
            L4f:
                androidx.constraintlayout.core.widgets.Flow r10 = r0.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = androidx.constraintlayout.core.widgets.Flow.access$500(r10)
                int r11 = r0.mStartIndex
                int r11 = r11 + r9
                r9 = r10[r11]
                if (r9 == 0) goto L66
                int r9 = r9.getVisibility()
                if (r9 != 0) goto L66
                if (r7 != r5) goto L65
                r7 = r6
            L65:
                r8 = r6
            L66:
                int r6 = r6 + 1
                goto L3a
            L69:
                r6 = 0
                int r9 = r0.mOrientation
                if (r9 != 0) goto L20c
                androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r0.biggest
                androidx.constraintlayout.core.widgets.Flow r10 = r0.this$0
                int r10 = androidx.constraintlayout.core.widgets.Flow.access$600(r10)
                r9.setVerticalChainStyle(r10)
                int r10 = r0.mPaddingTop
                if (r18 <= 0) goto L84
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.core.widgets.Flow.access$100(r11)
                int r10 = r10 + r11
            L84:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.mTop
                r11.connect(r12, r10)
                if (r19 == 0) goto L96
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r9.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mBottom
                int r12 = r0.mPaddingBottom
                r10.connect(r11, r12)
            L96:
                if (r18 <= 0) goto La3
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.mTop
                androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r10.mOwner
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r10.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mTop
                r10.connect(r11, r2)
            La3:
                androidx.constraintlayout.core.widgets.Flow r10 = r0.this$0
                int r10 = androidx.constraintlayout.core.widgets.Flow.access$700(r10)
                r11 = 3
                if (r10 != r11) goto Ldd
                boolean r10 = r9.hasBaseline()
                if (r10 != 0) goto Ldd
                r10 = 0
            Lb3:
                if (r10 >= r1) goto Ldd
                if (r17 == 0) goto Lbb
                int r12 = r1 + (-1)
                int r12 = r12 - r10
                goto Lbc
            Lbb:
                r12 = r10
            Lbc:
                int r13 = r0.mStartIndex
                int r13 = r13 + r12
                androidx.constraintlayout.core.widgets.Flow r14 = r0.this$0
                int r14 = androidx.constraintlayout.core.widgets.Flow.access$400(r14)
                if (r13 < r14) goto Lc8
                goto Ldd
            Lc8:
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r13 = androidx.constraintlayout.core.widgets.Flow.access$500(r13)
                int r14 = r0.mStartIndex
                int r14 = r14 + r12
                r12 = r13[r14]
                boolean r13 = r12.hasBaseline()
                if (r13 == 0) goto Lda
                goto Lde
            Lda:
                int r10 = r10 + 1
                goto Lb3
            Ldd:
                r12 = r9
            Lde:
                r10 = 0
            Ldf:
                if (r10 >= r1) goto L382
                if (r17 == 0) goto Le7
                int r13 = r1 + (-1)
                int r13 = r13 - r10
                goto Le8
            Le7:
                r13 = r10
            Le8:
                int r14 = r0.mStartIndex
                int r14 = r14 + r13
                androidx.constraintlayout.core.widgets.Flow r15 = r0.this$0
                int r15 = androidx.constraintlayout.core.widgets.Flow.access$400(r15)
                if (r14 < r15) goto Lf5
                goto L382
            Lf5:
                androidx.constraintlayout.core.widgets.Flow r14 = r0.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r14 = androidx.constraintlayout.core.widgets.Flow.access$500(r14)
                int r15 = r0.mStartIndex
                int r15 = r15 + r13
                r14 = r14[r15]
                if (r14 != 0) goto L106
                r14 = r6
            L103:
                r6 = 3
                goto L206
            L106:
                if (r10 != 0) goto L111
                androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r14.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mLeft
                int r3 = r0.mPaddingLeft
                r14.connect(r15, r11, r3)
            L111:
                if (r13 != 0) goto L16f
                androidx.constraintlayout.core.widgets.Flow r3 = r0.this$0
                int r3 = androidx.constraintlayout.core.widgets.Flow.access$800(r3)
                r11 = 1065353216(0x3f800000, float:1.0)
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                float r13 = androidx.constraintlayout.core.widgets.Flow.access$900(r13)
                if (r17 == 0) goto L125
                float r13 = r11 - r13
            L125:
                int r15 = r0.mStartIndex
                if (r15 != 0) goto L149
                androidx.constraintlayout.core.widgets.Flow r15 = r0.this$0
                int r15 = androidx.constraintlayout.core.widgets.Flow.access$1000(r15)
                if (r15 == r5) goto L149
                androidx.constraintlayout.core.widgets.Flow r3 = r0.this$0
                int r3 = androidx.constraintlayout.core.widgets.Flow.access$1000(r3)
                if (r17 == 0) goto L141
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                float r13 = androidx.constraintlayout.core.widgets.Flow.access$1100(r13)
            L13f:
                float r11 = r11 - r13
                goto L147
            L141:
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                float r11 = androidx.constraintlayout.core.widgets.Flow.access$1100(r11)
            L147:
                r13 = r11
                goto L169
            L149:
                if (r19 == 0) goto L169
                androidx.constraintlayout.core.widgets.Flow r15 = r0.this$0
                int r15 = androidx.constraintlayout.core.widgets.Flow.access$1200(r15)
                if (r15 == r5) goto L169
                androidx.constraintlayout.core.widgets.Flow r3 = r0.this$0
                int r3 = androidx.constraintlayout.core.widgets.Flow.access$1200(r3)
                if (r17 == 0) goto L162
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                float r13 = androidx.constraintlayout.core.widgets.Flow.access$1300(r13)
                goto L13f
            L162:
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                float r11 = androidx.constraintlayout.core.widgets.Flow.access$1300(r11)
                goto L147
            L169:
                r14.setHorizontalChainStyle(r3)
                r14.setHorizontalBiasPercent(r13)
            L16f:
                int r3 = r1 + (-1)
                if (r10 != r3) goto L17c
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mRight
                int r13 = r0.mPaddingRight
                r14.connect(r3, r11, r13)
            L17c:
                if (r6 == 0) goto L1a7
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.mRight
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                int r13 = androidx.constraintlayout.core.widgets.Flow.access$000(r13)
                r3.connect(r11, r13)
                if (r10 != r7) goto L194
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mLeft
                int r11 = r0.mPaddingLeft
                r3.setGoneMargin(r11)
            L194:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r6.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r14.mLeft
                r3.connect(r11, r2)
                r3 = 1
                int r11 = r8 + 1
                if (r10 != r11) goto L1a7
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r6.mRight
                int r6 = r0.mPaddingRight
                r3.setGoneMargin(r6)
            L1a7:
                if (r14 == r9) goto L103
                androidx.constraintlayout.core.widgets.Flow r3 = r0.this$0
                int r3 = androidx.constraintlayout.core.widgets.Flow.access$700(r3)
                r6 = 3
                if (r3 != r6) goto L1c8
                boolean r3 = r12.hasBaseline()
                if (r3 == 0) goto L1c8
                if (r14 == r12) goto L1c8
                boolean r3 = r14.hasBaseline()
                if (r3 == 0) goto L1c8
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mBaseline
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r12.mBaseline
                r3.connect(r11, r2)
                goto L206
            L1c8:
                androidx.constraintlayout.core.widgets.Flow r3 = r0.this$0
                int r3 = androidx.constraintlayout.core.widgets.Flow.access$700(r3)
                if (r3 == 0) goto L1ff
                r11 = 1
                if (r3 == r11) goto L1f7
                if (r4 == 0) goto L1e8
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mTop
                int r13 = r0.mPaddingTop
                r3.connect(r11, r13)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mBottom
                int r13 = r0.mPaddingBottom
                r3.connect(r11, r13)
                goto L206
            L1e8:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mTop
                r3.connect(r11, r2)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mBottom
                r3.connect(r11, r2)
                goto L206
            L1f7:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mBottom
                r3.connect(r11, r2)
                goto L206
            L1ff:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r14.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mTop
                r3.connect(r11, r2)
            L206:
                int r10 = r10 + 1
                r6 = r14
                r11 = 3
                goto Ldf
            L20c:
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.biggest
                androidx.constraintlayout.core.widgets.Flow r9 = r0.this$0
                int r9 = androidx.constraintlayout.core.widgets.Flow.access$800(r9)
                r3.setHorizontalChainStyle(r9)
                int r9 = r0.mPaddingLeft
                if (r18 <= 0) goto L222
                androidx.constraintlayout.core.widgets.Flow r10 = r0.this$0
                int r10 = androidx.constraintlayout.core.widgets.Flow.access$000(r10)
                int r9 = r9 + r10
            L222:
                if (r17 == 0) goto L244
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mRight
                r10.connect(r11, r9)
                if (r19 == 0) goto L236
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r3.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.mLeft
                int r11 = r0.mPaddingRight
                r9.connect(r10, r11)
            L236:
                if (r18 <= 0) goto L263
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r0.mRight
                androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r9.mOwner
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.mRight
                r9.connect(r10, r2)
                goto L263
            L244:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mLeft
                r10.connect(r11, r9)
                if (r19 == 0) goto L256
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r3.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r0.mRight
                int r11 = r0.mPaddingRight
                r9.connect(r10, r11)
            L256:
                if (r18 <= 0) goto L263
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r0.mLeft
                androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r9.mOwner
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r3.mLeft
                r9.connect(r10, r2)
            L263:
                r9 = 0
            L264:
                if (r9 >= r1) goto L382
                int r10 = r0.mStartIndex
                int r10 = r10 + r9
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.core.widgets.Flow.access$400(r11)
                if (r10 < r11) goto L273
                goto L382
            L273:
                androidx.constraintlayout.core.widgets.Flow r10 = r0.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = androidx.constraintlayout.core.widgets.Flow.access$500(r10)
                int r11 = r0.mStartIndex
                int r11 = r11 + r9
                r10 = r10[r11]
                if (r10 != 0) goto L283
                r12 = 1
                goto L37e
            L283:
                if (r9 != 0) goto L2cf
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.mTop
                int r13 = r0.mPaddingTop
                r10.connect(r11, r12, r13)
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.core.widgets.Flow.access$600(r11)
                androidx.constraintlayout.core.widgets.Flow r12 = r0.this$0
                float r12 = androidx.constraintlayout.core.widgets.Flow.access$1400(r12)
                int r13 = r0.mStartIndex
                if (r13 != 0) goto L2b3
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                int r13 = androidx.constraintlayout.core.widgets.Flow.access$1500(r13)
                if (r13 == r5) goto L2b3
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.core.widgets.Flow.access$1500(r11)
                androidx.constraintlayout.core.widgets.Flow r12 = r0.this$0
                float r12 = androidx.constraintlayout.core.widgets.Flow.access$1600(r12)
                goto L2c9
            L2b3:
                if (r19 == 0) goto L2c9
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                int r13 = androidx.constraintlayout.core.widgets.Flow.access$1700(r13)
                if (r13 == r5) goto L2c9
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.core.widgets.Flow.access$1700(r11)
                androidx.constraintlayout.core.widgets.Flow r12 = r0.this$0
                float r12 = androidx.constraintlayout.core.widgets.Flow.access$1800(r12)
            L2c9:
                r10.setVerticalChainStyle(r11)
                r10.setVerticalBiasPercent(r12)
            L2cf:
                int r11 = r1 + (-1)
                if (r9 != r11) goto L2dc
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r0.mBottom
                int r13 = r0.mPaddingBottom
                r10.connect(r11, r12, r13)
            L2dc:
                if (r6 == 0) goto L307
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.mTop
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r6.mBottom
                androidx.constraintlayout.core.widgets.Flow r13 = r0.this$0
                int r13 = androidx.constraintlayout.core.widgets.Flow.access$100(r13)
                r11.connect(r12, r13)
                if (r9 != r7) goto L2f4
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r10.mTop
                int r12 = r0.mPaddingTop
                r11.setGoneMargin(r12)
            L2f4:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r6.mBottom
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r10.mTop
                r11.connect(r12, r2)
                r11 = 1
                int r12 = r8 + 1
                if (r9 != r12) goto L307
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.mBottom
                int r11 = r0.mPaddingBottom
                r6.setGoneMargin(r11)
            L307:
                if (r10 == r3) goto L37c
                r6 = 2
                if (r17 == 0) goto L339
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.core.widgets.Flow.access$1900(r11)
                if (r11 == 0) goto L331
                r12 = 1
                if (r11 == r12) goto L329
                if (r11 == r6) goto L31a
                goto L37c
            L31a:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mLeft
                r6.connect(r11, r2)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mRight
                r6.connect(r11, r2)
                goto L37c
            L329:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mLeft
                r6.connect(r11, r2)
                goto L37c
            L331:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mRight
                r6.connect(r11, r2)
                goto L37c
            L339:
                androidx.constraintlayout.core.widgets.Flow r11 = r0.this$0
                int r11 = androidx.constraintlayout.core.widgets.Flow.access$1900(r11)
                if (r11 == 0) goto L373
                r12 = 1
                if (r11 == r12) goto L36b
                if (r11 == r6) goto L347
                goto L37d
            L347:
                if (r4 == 0) goto L35c
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mLeft
                int r13 = r0.mPaddingLeft
                r6.connect(r11, r13)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r0.mRight
                int r13 = r0.mPaddingRight
                r6.connect(r11, r13)
                goto L37d
            L35c:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mLeft
                r6.connect(r11, r2)
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mRight
                r6.connect(r11, r2)
                goto L37d
            L36b:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mRight
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mRight
                r6.connect(r11, r2)
                goto L37d
            L373:
                r12 = 1
                androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r10.mLeft
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r3.mLeft
                r6.connect(r11, r2)
                goto L37d
            L37c:
                r12 = 1
            L37d:
                r6 = r10
            L37e:
                int r9 = r9 + 1
                goto L264
            L382:
                return
        }

        public int getHeight() {
                r2 = this;
                int r0 = r2.mOrientation
                r1 = 1
                if (r0 != r1) goto Lf
                int r0 = r2.mHeight
                androidx.constraintlayout.core.widgets.Flow r1 = r2.this$0
                int r1 = androidx.constraintlayout.core.widgets.Flow.access$100(r1)
                int r0 = r0 - r1
                return r0
            Lf:
                int r0 = r2.mHeight
                return r0
        }

        public int getWidth() {
                r2 = this;
                int r0 = r2.mOrientation
                if (r0 != 0) goto Le
                int r0 = r2.mWidth
                androidx.constraintlayout.core.widgets.Flow r1 = r2.this$0
                int r1 = androidx.constraintlayout.core.widgets.Flow.access$000(r1)
                int r0 = r0 - r1
                return r0
            Le:
                int r0 = r2.mWidth
                return r0
        }

        public void measureMatchConstraints(int r9) {
                r8 = this;
                int r0 = r8.mNbMatchConstraintsWidgets
                if (r0 != 0) goto L5
                return
            L5:
                int r1 = r8.mCount
                int r9 = r9 / r0
                r0 = 0
            L9:
                if (r0 >= r1) goto L66
                int r2 = r8.mStartIndex
                int r2 = r2 + r0
                androidx.constraintlayout.core.widgets.Flow r3 = r8.this$0
                int r3 = androidx.constraintlayout.core.widgets.Flow.access$400(r3)
                if (r2 < r3) goto L17
                goto L66
            L17:
                androidx.constraintlayout.core.widgets.Flow r2 = r8.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget[] r2 = androidx.constraintlayout.core.widgets.Flow.access$500(r2)
                int r3 = r8.mStartIndex
                int r3 = r3 + r0
                r3 = r2[r3]
                int r2 = r8.mOrientation
                if (r2 != 0) goto L45
                if (r3 == 0) goto L63
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r3.getHorizontalDimensionBehaviour()
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r2 != r4) goto L63
                int r2 = r3.mMatchConstraintDefaultWidth
                if (r2 != 0) goto L63
                androidx.constraintlayout.core.widgets.Flow r2 = r8.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = r3.getVerticalDimensionBehaviour()
                int r7 = r3.getHeight()
                r5 = r9
                r2.measure(r3, r4, r5, r6, r7)
                goto L63
            L45:
                if (r3 == 0) goto L63
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r3.getVerticalDimensionBehaviour()
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r2 != r4) goto L63
                int r2 = r3.mMatchConstraintDefaultHeight
                if (r2 != 0) goto L63
                androidx.constraintlayout.core.widgets.Flow r2 = r8.this$0
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r3.getHorizontalDimensionBehaviour()
                int r5 = r3.getWidth()
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r6 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                r7 = r9
                r2.measure(r3, r4, r5, r6, r7)
            L63:
                int r0 = r0 + 1
                goto L9
            L66:
                r8.recomputeDimensions()
                return
        }

        public void setStartIndex(int r1) {
                r0 = this;
                r0.mStartIndex = r1
                return
        }

        public void setup(int r1, androidx.constraintlayout.core.widgets.ConstraintAnchor r2, androidx.constraintlayout.core.widgets.ConstraintAnchor r3, androidx.constraintlayout.core.widgets.ConstraintAnchor r4, androidx.constraintlayout.core.widgets.ConstraintAnchor r5, int r6, int r7, int r8, int r9, int r10) {
                r0 = this;
                r0.mOrientation = r1
                r0.mLeft = r2
                r0.mTop = r3
                r0.mRight = r4
                r0.mBottom = r5
                r0.mPaddingLeft = r6
                r0.mPaddingTop = r7
                r0.mPaddingRight = r8
                r0.mPaddingBottom = r9
                r0.mMax = r10
                return
        }
    }

    public Flow() {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.mHorizontalStyle = r0
            r3.mVerticalStyle = r0
            r3.mFirstHorizontalStyle = r0
            r3.mFirstVerticalStyle = r0
            r3.mLastHorizontalStyle = r0
            r3.mLastVerticalStyle = r0
            r1 = 1056964608(0x3f000000, float:0.5)
            r3.mHorizontalBias = r1
            r3.mVerticalBias = r1
            r3.mFirstHorizontalBias = r1
            r3.mFirstVerticalBias = r1
            r3.mLastHorizontalBias = r1
            r3.mLastVerticalBias = r1
            r1 = 0
            r3.mHorizontalGap = r1
            r3.mVerticalGap = r1
            r2 = 2
            r3.mHorizontalAlign = r2
            r3.mVerticalAlign = r2
            r3.mWrapMode = r1
            r3.mMaxElementsWrap = r0
            r3.mOrientation = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mChainList = r0
            r0 = 0
            r3.mAlignedBiggestElementsInRows = r0
            r3.mAlignedBiggestElementsInCols = r0
            r3.mAlignedDimensions = r0
            r3.mDisplayedWidgetsCount = r1
            return
    }

    public static /* synthetic */ int access$000(androidx.constraintlayout.core.widgets.Flow r0) {
            int r0 = r0.mHorizontalGap
            return r0
    }

    public static /* synthetic */ int access$100(androidx.constraintlayout.core.widgets.Flow r0) {
            int r0 = r0.mVerticalGap
            return r0
    }

    public static /* synthetic */ int access$1000(androidx.constraintlayout.core.widgets.Flow r0) {
            int r0 = r0.mFirstHorizontalStyle
            return r0
    }

    public static /* synthetic */ float access$1100(androidx.constraintlayout.core.widgets.Flow r0) {
            float r0 = r0.mFirstHorizontalBias
            return r0
    }

    public static /* synthetic */ int access$1200(androidx.constraintlayout.core.widgets.Flow r0) {
            int r0 = r0.mLastHorizontalStyle
            return r0
    }

    public static /* synthetic */ float access$1300(androidx.constraintlayout.core.widgets.Flow r0) {
            float r0 = r0.mLastHorizontalBias
            return r0
    }

    public static /* synthetic */ float access$1400(androidx.constraintlayout.core.widgets.Flow r0) {
            float r0 = r0.mVerticalBias
            return r0
    }

    public static /* synthetic */ int access$1500(androidx.constraintlayout.core.widgets.Flow r0) {
            int r0 = r0.mFirstVerticalStyle
            return r0
    }

    public static /* synthetic */ float access$1600(androidx.constraintlayout.core.widgets.Flow r0) {
            float r0 = r0.mFirstVerticalBias
            return r0
    }

    public static /* synthetic */ int access$1700(androidx.constraintlayout.core.widgets.Flow r0) {
            int r0 = r0.mLastVerticalStyle
            return r0
    }

    public static /* synthetic */ float access$1800(androidx.constraintlayout.core.widgets.Flow r0) {
            float r0 = r0.mLastVerticalBias
            return r0
    }

    public static /* synthetic */ int access$1900(androidx.constraintlayout.core.widgets.Flow r0) {
            int r0 = r0.mHorizontalAlign
            return r0
    }

    public static /* synthetic */ int access$200(androidx.constraintlayout.core.widgets.Flow r0, androidx.constraintlayout.core.widgets.ConstraintWidget r1, int r2) {
            int r0 = r0.getWidgetWidth(r1, r2)
            return r0
    }

    public static /* synthetic */ int access$300(androidx.constraintlayout.core.widgets.Flow r0, androidx.constraintlayout.core.widgets.ConstraintWidget r1, int r2) {
            int r0 = r0.getWidgetHeight(r1, r2)
            return r0
    }

    public static /* synthetic */ int access$400(androidx.constraintlayout.core.widgets.Flow r0) {
            int r0 = r0.mDisplayedWidgetsCount
            return r0
    }

    public static /* synthetic */ androidx.constraintlayout.core.widgets.ConstraintWidget[] access$500(androidx.constraintlayout.core.widgets.Flow r0) {
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r0.mDisplayedWidgets
            return r0
    }

    public static /* synthetic */ int access$600(androidx.constraintlayout.core.widgets.Flow r0) {
            int r0 = r0.mVerticalStyle
            return r0
    }

    public static /* synthetic */ int access$700(androidx.constraintlayout.core.widgets.Flow r0) {
            int r0 = r0.mVerticalAlign
            return r0
    }

    public static /* synthetic */ int access$800(androidx.constraintlayout.core.widgets.Flow r0) {
            int r0 = r0.mHorizontalStyle
            return r0
    }

    public static /* synthetic */ float access$900(androidx.constraintlayout.core.widgets.Flow r0) {
            float r0 = r0.mHorizontalBias
            return r0
    }

    private void createAlignedConstraints(boolean r12) {
            r11 = this;
            int[] r0 = r11.mAlignedDimensions
            if (r0 == 0) goto L121
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r11.mAlignedBiggestElementsInCols
            if (r0 == 0) goto L121
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r0 = r11.mAlignedBiggestElementsInRows
            if (r0 != 0) goto Le
            goto L121
        Le:
            r0 = 0
            r1 = 0
        L10:
            int r2 = r11.mDisplayedWidgetsCount
            if (r1 >= r2) goto L1e
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r2 = r11.mDisplayedWidgets
            r2 = r2[r1]
            r2.resetAnchors()
            int r1 = r1 + 1
            goto L10
        L1e:
            int[] r1 = r11.mAlignedDimensions
            r2 = r1[r0]
            r3 = 1
            r1 = r1[r3]
            r4 = 0
            float r5 = r11.mHorizontalBias
            r6 = 0
        L29:
            r7 = 8
            if (r6 >= r2) goto L84
            if (r12 == 0) goto L38
            int r5 = r2 - r6
            int r5 = r5 - r3
            r8 = 1065353216(0x3f800000, float:1.0)
            float r9 = r11.mHorizontalBias
            float r8 = r8 - r9
            goto L3a
        L38:
            r8 = r5
            r5 = r6
        L3a:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r9 = r11.mAlignedBiggestElementsInCols
            r5 = r9[r5]
            if (r5 == 0) goto L80
            int r9 = r5.getVisibility()
            if (r9 != r7) goto L47
            goto L80
        L47:
            if (r6 != 0) goto L5c
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r5.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r11.mLeft
            int r10 = r11.getPaddingLeft()
            r5.connect(r7, r9, r10)
            int r7 = r11.mHorizontalStyle
            r5.setHorizontalChainStyle(r7)
            r5.setHorizontalBiasPercent(r8)
        L5c:
            int r7 = r2 + (-1)
            if (r6 != r7) goto L6b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r5.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r11.mRight
            int r10 = r11.getPaddingRight()
            r5.connect(r7, r9, r10)
        L6b:
            if (r6 <= 0) goto L7f
            if (r4 == 0) goto L7f
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r5.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r4.mRight
            int r10 = r11.mHorizontalGap
            r5.connect(r7, r9, r10)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r7 = r4.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r5.mLeft
            r4.connect(r7, r9, r0)
        L7f:
            r4 = r5
        L80:
            int r6 = r6 + 1
            r5 = r8
            goto L29
        L84:
            r12 = 0
        L85:
            if (r12 >= r1) goto Ld2
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r5 = r11.mAlignedBiggestElementsInRows
            r5 = r5[r12]
            if (r5 == 0) goto Lcf
            int r6 = r5.getVisibility()
            if (r6 != r7) goto L94
            goto Lcf
        L94:
            if (r12 != 0) goto Lab
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r5.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r11.mTop
            int r9 = r11.getPaddingTop()
            r5.connect(r6, r8, r9)
            int r6 = r11.mVerticalStyle
            r5.setVerticalChainStyle(r6)
            float r6 = r11.mVerticalBias
            r5.setVerticalBiasPercent(r6)
        Lab:
            int r6 = r1 + (-1)
            if (r12 != r6) goto Lba
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r5.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r11.mBottom
            int r9 = r11.getPaddingBottom()
            r5.connect(r6, r8, r9)
        Lba:
            if (r12 <= 0) goto Lce
            if (r4 == 0) goto Lce
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r5.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r4.mBottom
            int r9 = r11.mVerticalGap
            r5.connect(r6, r8, r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r4.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r5.mTop
            r4.connect(r6, r8, r0)
        Lce:
            r4 = r5
        Lcf:
            int r12 = r12 + 1
            goto L85
        Ld2:
            r12 = 0
        Ld3:
            if (r12 >= r2) goto L121
            r4 = 0
        Ld6:
            if (r4 >= r1) goto L11e
            int r5 = r4 * r2
            int r5 = r5 + r12
            int r6 = r11.mOrientation
            if (r6 != r3) goto Le2
            int r5 = r12 * r1
            int r5 = r5 + r4
        Le2:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r6 = r11.mDisplayedWidgets
            int r8 = r6.length
            if (r5 < r8) goto Le8
            goto L11b
        Le8:
            r5 = r6[r5]
            if (r5 == 0) goto L11b
            int r6 = r5.getVisibility()
            if (r6 != r7) goto Lf3
            goto L11b
        Lf3:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r6 = r11.mAlignedBiggestElementsInCols
            r6 = r6[r12]
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r8 = r11.mAlignedBiggestElementsInRows
            r8 = r8[r4]
            if (r5 == r6) goto L10b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r5.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r6.mLeft
            r5.connect(r9, r10, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r5.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r6.mRight
            r5.connect(r9, r6, r0)
        L10b:
            if (r5 == r8) goto L11b
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r5.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.mTop
            r5.connect(r6, r9, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r5.mBottom
            androidx.constraintlayout.core.widgets.ConstraintAnchor r8 = r8.mBottom
            r5.connect(r6, r8, r0)
        L11b:
            int r4 = r4 + 1
            goto Ld6
        L11e:
            int r12 = r12 + 1
            goto Ld3
        L121:
            return
    }

    private final int getWidgetHeight(androidx.constraintlayout.core.widgets.ConstraintWidget r10, int r11) {
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r10.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r2) goto L4d
            int r1 = r10.mMatchConstraintDefaultHeight
            if (r1 != 0) goto L11
            return r0
        L11:
            r0 = 2
            r2 = 1
            if (r1 != r0) goto L35
            float r0 = r10.mMatchConstraintPercentHeight
            float r11 = (float) r11
            float r0 = r0 * r11
            int r11 = (int) r0
            int r0 = r10.getHeight()
            if (r11 == r0) goto L34
            r10.setMeasureRequested(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = r10.getHorizontalDimensionBehaviour()
            int r6 = r10.getWidth()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r3 = r9
            r4 = r10
            r8 = r11
            r3.measure(r4, r5, r6, r7, r8)
        L34:
            return r11
        L35:
            if (r1 != r2) goto L3c
            int r10 = r10.getHeight()
            return r10
        L3c:
            r11 = 3
            if (r1 != r11) goto L4d
            int r11 = r10.getWidth()
            float r11 = (float) r11
            float r10 = r10.mDimensionRatio
            float r11 = r11 * r10
            r10 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 + r10
            int r10 = (int) r11
            return r10
        L4d:
            int r10 = r10.getHeight()
            return r10
    }

    private final int getWidgetWidth(androidx.constraintlayout.core.widgets.ConstraintWidget r10, int r11) {
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = r10.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r1 != r2) goto L4d
            int r1 = r10.mMatchConstraintDefaultWidth
            if (r1 != 0) goto L11
            return r0
        L11:
            r0 = 2
            r2 = 1
            if (r1 != r0) goto L35
            float r0 = r10.mMatchConstraintPercentWidth
            float r11 = (float) r11
            float r0 = r0 * r11
            int r11 = (int) r0
            int r0 = r10.getWidth()
            if (r11 == r0) goto L34
            r10.setMeasureRequested(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r10.getVerticalDimensionBehaviour()
            int r8 = r10.getHeight()
            r3 = r9
            r4 = r10
            r6 = r11
            r3.measure(r4, r5, r6, r7, r8)
        L34:
            return r11
        L35:
            if (r1 != r2) goto L3c
            int r10 = r10.getWidth()
            return r10
        L3c:
            r11 = 3
            if (r1 != r11) goto L4d
            int r11 = r10.getHeight()
            float r11 = (float) r11
            float r10 = r10.mDimensionRatio
            float r11 = r11 * r10
            r10 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 + r10
            int r10 = (int) r11
            return r10
        L4d:
            int r10 = r10.getWidth()
            return r10
    }

    private void measureAligned(androidx.constraintlayout.core.widgets.ConstraintWidget[] r17, int r18, int r19, int r20, int[] r21) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = 0
            if (r3 != 0) goto L30
            int r6 = r0.mMaxElementsWrap
            if (r6 > 0) goto L2d
            r6 = 0
            r7 = 0
            r8 = 0
        L14:
            if (r7 >= r2) goto L2d
            if (r7 <= 0) goto L1b
            int r9 = r0.mHorizontalGap
            int r8 = r8 + r9
        L1b:
            r9 = r1[r7]
            if (r9 != 0) goto L20
            goto L2a
        L20:
            int r9 = r0.getWidgetWidth(r9, r4)
            int r8 = r8 + r9
            if (r8 <= r4) goto L28
            goto L2d
        L28:
            int r6 = r6 + 1
        L2a:
            int r7 = r7 + 1
            goto L14
        L2d:
            r7 = r6
            r6 = 0
            goto L51
        L30:
            int r6 = r0.mMaxElementsWrap
            if (r6 > 0) goto L50
            r6 = 0
            r7 = 0
            r8 = 0
        L37:
            if (r7 >= r2) goto L50
            if (r7 <= 0) goto L3e
            int r9 = r0.mVerticalGap
            int r8 = r8 + r9
        L3e:
            r9 = r1[r7]
            if (r9 != 0) goto L43
            goto L4d
        L43:
            int r9 = r0.getWidgetHeight(r9, r4)
            int r8 = r8 + r9
            if (r8 <= r4) goto L4b
            goto L50
        L4b:
            int r6 = r6 + 1
        L4d:
            int r7 = r7 + 1
            goto L37
        L50:
            r7 = 0
        L51:
            int[] r8 = r0.mAlignedDimensions
            if (r8 != 0) goto L5a
            r8 = 2
            int[] r8 = new int[r8]
            r0.mAlignedDimensions = r8
        L5a:
            r8 = 1
            if (r6 != 0) goto L5f
            if (r3 == r8) goto L63
        L5f:
            if (r7 != 0) goto L65
            if (r3 != 0) goto L65
        L63:
            r9 = 1
            goto L66
        L65:
            r9 = 0
        L66:
            if (r9 != 0) goto L12b
            if (r3 != 0) goto L74
            float r6 = (float) r2
            float r10 = (float) r7
            float r6 = r6 / r10
            double r10 = (double) r6
            double r10 = java.lang.Math.ceil(r10)
            int r6 = (int) r10
            goto L7d
        L74:
            float r7 = (float) r2
            float r10 = (float) r6
            float r7 = r7 / r10
            double r10 = (double) r7
            double r10 = java.lang.Math.ceil(r10)
            int r7 = (int) r10
        L7d:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = r0.mAlignedBiggestElementsInCols
            r11 = 0
            if (r10 == 0) goto L8a
            int r12 = r10.length
            if (r12 >= r7) goto L86
            goto L8a
        L86:
            java.util.Arrays.fill(r10, r11)
            goto L8e
        L8a:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r7]
            r0.mAlignedBiggestElementsInCols = r10
        L8e:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = r0.mAlignedBiggestElementsInRows
            if (r10 == 0) goto L9a
            int r12 = r10.length
            if (r12 >= r6) goto L96
            goto L9a
        L96:
            java.util.Arrays.fill(r10, r11)
            goto L9e
        L9a:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r10 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r6]
            r0.mAlignedBiggestElementsInRows = r10
        L9e:
            r10 = 0
        L9f:
            if (r10 >= r7) goto Le7
            r11 = 0
        La2:
            if (r11 >= r6) goto Le4
            int r12 = r11 * r7
            int r12 = r12 + r10
            if (r3 != r8) goto Lac
            int r12 = r10 * r6
            int r12 = r12 + r11
        Lac:
            int r13 = r1.length
            if (r12 < r13) goto Lb0
            goto Le1
        Lb0:
            r12 = r1[r12]
            if (r12 != 0) goto Lb5
            goto Le1
        Lb5:
            int r13 = r0.getWidgetWidth(r12, r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r14 = r0.mAlignedBiggestElementsInCols
            r15 = r14[r10]
            if (r15 == 0) goto Lc7
            r14 = r14[r10]
            int r14 = r14.getWidth()
            if (r14 >= r13) goto Lcb
        Lc7:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r13 = r0.mAlignedBiggestElementsInCols
            r13[r10] = r12
        Lcb:
            int r13 = r0.getWidgetHeight(r12, r4)
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r14 = r0.mAlignedBiggestElementsInRows
            r15 = r14[r11]
            if (r15 == 0) goto Ldd
            r14 = r14[r11]
            int r14 = r14.getHeight()
            if (r14 >= r13) goto Le1
        Ldd:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r13 = r0.mAlignedBiggestElementsInRows
            r13[r11] = r12
        Le1:
            int r11 = r11 + 1
            goto La2
        Le4:
            int r10 = r10 + 1
            goto L9f
        Le7:
            r10 = 0
            r11 = 0
        Le9:
            if (r10 >= r7) goto Lfe
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r12 = r0.mAlignedBiggestElementsInCols
            r12 = r12[r10]
            if (r12 == 0) goto Lfb
            if (r10 <= 0) goto Lf6
            int r13 = r0.mHorizontalGap
            int r11 = r11 + r13
        Lf6:
            int r12 = r0.getWidgetWidth(r12, r4)
            int r11 = r11 + r12
        Lfb:
            int r10 = r10 + 1
            goto Le9
        Lfe:
            r10 = 0
            r12 = 0
        L100:
            if (r10 >= r6) goto L115
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r13 = r0.mAlignedBiggestElementsInRows
            r13 = r13[r10]
            if (r13 == 0) goto L112
            if (r10 <= 0) goto L10d
            int r14 = r0.mVerticalGap
            int r12 = r12 + r14
        L10d:
            int r13 = r0.getWidgetHeight(r13, r4)
            int r12 = r12 + r13
        L112:
            int r10 = r10 + 1
            goto L100
        L115:
            r21[r5] = r11
            r21[r8] = r12
            if (r3 != 0) goto L123
            if (r11 <= r4) goto L63
            if (r7 <= r8) goto L63
            int r7 = r7 + (-1)
            goto L66
        L123:
            if (r12 <= r4) goto L63
            if (r6 <= r8) goto L63
            int r6 = r6 + (-1)
            goto L66
        L12b:
            int[] r1 = r0.mAlignedDimensions
            r1[r5] = r7
            r1[r8] = r6
            return
    }

    private void measureChainWrap(androidx.constraintlayout.core.widgets.ConstraintWidget[] r29, int r30, int r31, int r32, int[] r33) {
            r28 = this;
            r8 = r28
            r9 = r30
            r15 = r32
            if (r9 != 0) goto L9
            return
        L9:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            r0.clear()
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r10 = new androidx.constraintlayout.core.widgets.Flow$WidgetsList
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.mBottom
            r0 = r10
            r1 = r28
            r2 = r31
            r7 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            r0.add(r10)
            r20 = 1
            r21 = 0
            if (r31 != 0) goto L8f
            r0 = 0
            r1 = 0
            r11 = 0
        L30:
            if (r11 >= r9) goto Lf1
            r12 = r29[r11]
            int r13 = r8.getWidgetWidth(r12, r15)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r12.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r3) goto L42
            int r0 = r0 + 1
        L42:
            r14 = r0
            if (r1 == r15) goto L4b
            int r0 = r8.mHorizontalGap
            int r0 = r0 + r1
            int r0 = r0 + r13
            if (r0 <= r15) goto L53
        L4b:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r10)
            if (r0 == 0) goto L53
            r0 = 1
            goto L54
        L53:
            r0 = 0
        L54:
            if (r0 != 0) goto L61
            if (r11 <= 0) goto L61
            int r2 = r8.mMaxElementsWrap
            if (r2 <= 0) goto L61
            int r2 = r11 % r2
            if (r2 != 0) goto L61
            r0 = 1
        L61:
            if (r0 == 0) goto L81
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r10 = new androidx.constraintlayout.core.widgets.Flow$WidgetsList
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.mBottom
            r0 = r10
            r1 = r28
            r2 = r31
            r7 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.setStartIndex(r11)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            r0.add(r10)
        L7f:
            r1 = r13
            goto L88
        L81:
            if (r11 <= 0) goto L7f
            int r0 = r8.mHorizontalGap
            int r0 = r0 + r13
            int r0 = r0 + r1
            r1 = r0
        L88:
            r10.add(r12)
            int r11 = r11 + 1
            r0 = r14
            goto L30
        L8f:
            r0 = 0
            r1 = 0
            r11 = 0
        L92:
            if (r11 >= r9) goto Lf1
            r12 = r29[r11]
            int r13 = r8.getWidgetHeight(r12, r15)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r12.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r3) goto La4
            int r0 = r0 + 1
        La4:
            r14 = r0
            if (r1 == r15) goto Lad
            int r0 = r8.mVerticalGap
            int r0 = r0 + r1
            int r0 = r0 + r13
            if (r0 <= r15) goto Lb5
        Lad:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r10)
            if (r0 == 0) goto Lb5
            r0 = 1
            goto Lb6
        Lb5:
            r0 = 0
        Lb6:
            if (r0 != 0) goto Lc3
            if (r11 <= 0) goto Lc3
            int r2 = r8.mMaxElementsWrap
            if (r2 <= 0) goto Lc3
            int r2 = r11 % r2
            if (r2 != 0) goto Lc3
            r0 = 1
        Lc3:
            if (r0 == 0) goto Le3
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r10 = new androidx.constraintlayout.core.widgets.Flow$WidgetsList
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.mBottom
            r0 = r10
            r1 = r28
            r2 = r31
            r7 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.setStartIndex(r11)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            r0.add(r10)
        Le1:
            r1 = r13
            goto Lea
        Le3:
            if (r11 <= 0) goto Le1
            int r0 = r8.mVerticalGap
            int r0 = r0 + r13
            int r0 = r0 + r1
            r1 = r0
        Lea:
            r10.add(r12)
            int r11 = r11 + 1
            r0 = r14
            goto L92
        Lf1:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r1 = r8.mChainList
            int r1 = r1.size()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r8.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.mBottom
            int r6 = r28.getPaddingLeft()
            int r7 = r28.getPaddingTop()
            int r9 = r28.getPaddingRight()
            int r10 = r28.getPaddingBottom()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r28.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r11 == r12) goto L120
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r28.getVerticalDimensionBehaviour()
            if (r11 != r12) goto L11e
            goto L120
        L11e:
            r11 = 0
            goto L121
        L120:
            r11 = 1
        L121:
            if (r0 <= 0) goto L148
            if (r11 == 0) goto L148
            r0 = 0
        L126:
            if (r0 >= r1) goto L148
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r11 = r8.mChainList
            java.lang.Object r11 = r11.get(r0)
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r11 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r11
            if (r31 != 0) goto L13c
            int r12 = r11.getWidth()
            int r12 = r15 - r12
            r11.measureMatchConstraints(r12)
            goto L145
        L13c:
            int r12 = r11.getHeight()
            int r12 = r15 - r12
            r11.measureMatchConstraints(r12)
        L145:
            int r0 = r0 + 1
            goto L126
        L148:
            r22 = r7
            r0 = r9
            r12 = 0
            r13 = 0
            r14 = 0
            r7 = r6
            r6 = r3
            r3 = r2
            r2 = r10
        L152:
            if (r14 >= r1) goto L229
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r9 = r8.mChainList
            java.lang.Object r9 = r9.get(r14)
            r23 = r9
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r23 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r23
            if (r31 != 0) goto L1c2
            int r2 = r1 + (-1)
            if (r14 >= r2) goto L176
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r2 = r8.mChainList
            int r5 = r14 + 1
            java.lang.Object r2 = r2.get(r5)
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r2 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTop
            r5 = 0
            goto L17c
        L176:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r8.mBottom
            int r5 = r28.getPaddingBottom()
        L17c:
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r23)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mBottom
            r9 = r23
            r10 = r31
            r24 = r11
            r11 = r3
            r29 = r3
            r3 = r12
            r12 = r6
            r6 = r13
            r13 = r4
            r30 = r4
            r4 = r14
            r14 = r2
            r15 = r7
            r16 = r22
            r17 = r0
            r18 = r5
            r19 = r32
            r9.setup(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            int r9 = r23.getWidth()
            int r6 = java.lang.Math.max(r6, r9)
            int r9 = r23.getHeight()
            int r12 = r3 + r9
            if (r4 <= 0) goto L1b2
            int r3 = r8.mVerticalGap
            int r12 = r12 + r3
        L1b2:
            r3 = r29
            r13 = r6
            r6 = r24
            r22 = 0
            r24 = r30
            r27 = r5
            r5 = r2
            r2 = r27
            goto L221
        L1c2:
            r29 = r3
            r3 = r12
            r0 = r13
            r4 = r14
            int r9 = r1 + (-1)
            if (r4 >= r9) goto L1e0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r9 = r8.mChainList
            int r14 = r4 + 1
            java.lang.Object r9 = r9.get(r14)
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r9 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r9
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.mLeft
            r24 = r9
            r25 = 0
            goto L1ea
        L1e0:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.mRight
            int r10 = r28.getPaddingRight()
            r24 = r9
            r25 = r10
        L1ea:
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r23)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r9.mRight
            r9 = r23
            r10 = r31
            r11 = r29
            r12 = r6
            r13 = r24
            r14 = r5
            r26 = r15
            r15 = r7
            r16 = r22
            r17 = r25
            r18 = r2
            r19 = r32
            r9.setup(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            int r7 = r23.getWidth()
            int r13 = r0 + r7
            int r0 = r23.getHeight()
            int r0 = java.lang.Math.max(r3, r0)
            if (r4 <= 0) goto L21b
            int r3 = r8.mHorizontalGap
            int r13 = r13 + r3
        L21b:
            r12 = r0
            r0 = r25
            r3 = r26
            r7 = 0
        L221:
            int r14 = r4 + 1
            r15 = r32
            r4 = r24
            goto L152
        L229:
            r3 = r12
            r0 = r13
            r33[r21] = r0
            r33[r20] = r3
            return
    }

    private void measureChainWrap_new(androidx.constraintlayout.core.widgets.ConstraintWidget[] r29, int r30, int r31, int r32, int[] r33) {
            r28 = this;
            r8 = r28
            r9 = r30
            r15 = r32
            if (r9 != 0) goto L9
            return
        L9:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            r0.clear()
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r10 = new androidx.constraintlayout.core.widgets.Flow$WidgetsList
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.mBottom
            r0 = r10
            r1 = r28
            r2 = r31
            r7 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            r0.add(r10)
            r20 = 1
            r21 = 0
            if (r31 != 0) goto L96
            r0 = 0
            r1 = 0
            r2 = 0
            r11 = 0
        L31:
            if (r11 >= r9) goto Lf6
            int r12 = r0 + 1
            r13 = r29[r11]
            int r14 = r8.getWidgetWidth(r13, r15)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = r13.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r0 != r3) goto L45
            int r1 = r1 + 1
        L45:
            r16 = r1
            if (r2 == r15) goto L4f
            int r0 = r8.mHorizontalGap
            int r0 = r0 + r2
            int r0 = r0 + r14
            if (r0 <= r15) goto L57
        L4f:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r10)
            if (r0 == 0) goto L57
            r0 = 1
            goto L58
        L57:
            r0 = 0
        L58:
            if (r0 != 0) goto L63
            if (r11 <= 0) goto L63
            int r1 = r8.mMaxElementsWrap
            if (r1 <= 0) goto L63
            if (r12 <= r1) goto L63
            r0 = 1
        L63:
            if (r0 == 0) goto L84
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r10 = new androidx.constraintlayout.core.widgets.Flow$WidgetsList
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.mBottom
            r0 = r10
            r1 = r28
            r2 = r31
            r7 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.setStartIndex(r11)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            r0.add(r10)
            r0 = r12
            r2 = r14
            goto L8e
        L84:
            if (r11 <= 0) goto L8c
            int r0 = r8.mHorizontalGap
            int r0 = r0 + r14
            int r0 = r0 + r2
            r2 = r0
            goto L8d
        L8c:
            r2 = r14
        L8d:
            r0 = 0
        L8e:
            r10.add(r13)
            int r11 = r11 + 1
            r1 = r16
            goto L31
        L96:
            r0 = 0
            r1 = 0
            r11 = 0
        L99:
            if (r11 >= r9) goto Lf6
            r12 = r29[r11]
            int r13 = r8.getWidgetHeight(r12, r15)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r2 = r12.getVerticalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r2 != r3) goto Lab
            int r1 = r1 + 1
        Lab:
            r14 = r1
            if (r0 == r15) goto Lb4
            int r1 = r8.mVerticalGap
            int r1 = r1 + r0
            int r1 = r1 + r13
            if (r1 <= r15) goto Lbc
        Lb4:
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r10)
            if (r1 == 0) goto Lbc
            r1 = 1
            goto Lbd
        Lbc:
            r1 = 0
        Lbd:
            if (r1 != 0) goto Lc8
            if (r11 <= 0) goto Lc8
            int r2 = r8.mMaxElementsWrap
            if (r2 <= 0) goto Lc8
            if (r2 >= 0) goto Lc8
            r1 = 1
        Lc8:
            if (r1 == 0) goto Le8
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r10 = new androidx.constraintlayout.core.widgets.Flow$WidgetsList
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.mBottom
            r0 = r10
            r1 = r28
            r2 = r31
            r7 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.setStartIndex(r11)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            r0.add(r10)
        Le6:
            r0 = r13
            goto Lef
        Le8:
            if (r11 <= 0) goto Le6
            int r1 = r8.mVerticalGap
            int r1 = r1 + r13
            int r1 = r1 + r0
            r0 = r1
        Lef:
            r10.add(r12)
            int r11 = r11 + 1
            r1 = r14
            goto L99
        Lf6:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            int r0 = r0.size()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r8.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.mBottom
            int r6 = r28.getPaddingLeft()
            int r7 = r28.getPaddingTop()
            int r9 = r28.getPaddingRight()
            int r10 = r28.getPaddingBottom()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r28.getHorizontalDimensionBehaviour()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r11 == r12) goto L125
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r28.getVerticalDimensionBehaviour()
            if (r11 != r12) goto L123
            goto L125
        L123:
            r11 = 0
            goto L126
        L125:
            r11 = 1
        L126:
            if (r1 <= 0) goto L14d
            if (r11 == 0) goto L14d
            r1 = 0
        L12b:
            if (r1 >= r0) goto L14d
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r11 = r8.mChainList
            java.lang.Object r11 = r11.get(r1)
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r11 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r11
            if (r31 != 0) goto L141
            int r12 = r11.getWidth()
            int r12 = r15 - r12
            r11.measureMatchConstraints(r12)
            goto L14a
        L141:
            int r12 = r11.getHeight()
            int r12 = r15 - r12
            r11.measureMatchConstraints(r12)
        L14a:
            int r1 = r1 + 1
            goto L12b
        L14d:
            r22 = r7
            r1 = r9
            r12 = 0
            r13 = 0
            r14 = 0
            r7 = r6
            r6 = r3
            r3 = r2
            r2 = r10
        L157:
            if (r14 >= r0) goto L22e
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r9 = r8.mChainList
            java.lang.Object r9 = r9.get(r14)
            r23 = r9
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r23 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r23
            if (r31 != 0) goto L1c7
            int r2 = r0 + (-1)
            if (r14 >= r2) goto L17b
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r2 = r8.mChainList
            int r5 = r14 + 1
            java.lang.Object r2 = r2.get(r5)
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r2 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r2)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r2.mTop
            r5 = 0
            goto L181
        L17b:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r8.mBottom
            int r5 = r28.getPaddingBottom()
        L181:
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r23)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r9.mBottom
            r9 = r23
            r10 = r31
            r24 = r11
            r11 = r3
            r29 = r3
            r3 = r12
            r12 = r6
            r6 = r13
            r13 = r4
            r30 = r4
            r4 = r14
            r14 = r2
            r15 = r7
            r16 = r22
            r17 = r1
            r18 = r5
            r19 = r32
            r9.setup(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            int r9 = r23.getWidth()
            int r6 = java.lang.Math.max(r6, r9)
            int r9 = r23.getHeight()
            int r12 = r3 + r9
            if (r4 <= 0) goto L1b7
            int r3 = r8.mVerticalGap
            int r12 = r12 + r3
        L1b7:
            r3 = r29
            r13 = r6
            r6 = r24
            r22 = 0
            r24 = r30
            r27 = r5
            r5 = r2
            r2 = r27
            goto L226
        L1c7:
            r29 = r3
            r3 = r12
            r1 = r13
            r4 = r14
            int r9 = r0 + (-1)
            if (r4 >= r9) goto L1e5
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r9 = r8.mChainList
            int r14 = r4 + 1
            java.lang.Object r9 = r9.get(r14)
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r9 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r9
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r9)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r9.mLeft
            r24 = r9
            r25 = 0
            goto L1ef
        L1e5:
            androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r8.mRight
            int r10 = r28.getPaddingRight()
            r24 = r9
            r25 = r10
        L1ef:
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = androidx.constraintlayout.core.widgets.Flow.WidgetsList.access$2000(r23)
            androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r9.mRight
            r9 = r23
            r10 = r31
            r11 = r29
            r12 = r6
            r13 = r24
            r14 = r5
            r26 = r15
            r15 = r7
            r16 = r22
            r17 = r25
            r18 = r2
            r19 = r32
            r9.setup(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            int r7 = r23.getWidth()
            int r13 = r1 + r7
            int r1 = r23.getHeight()
            int r1 = java.lang.Math.max(r3, r1)
            if (r4 <= 0) goto L220
            int r3 = r8.mHorizontalGap
            int r13 = r13 + r3
        L220:
            r12 = r1
            r1 = r25
            r3 = r26
            r7 = 0
        L226:
            int r14 = r4 + 1
            r15 = r32
            r4 = r24
            goto L157
        L22e:
            r3 = r12
            r1 = r13
            r33[r21] = r1
            r33[r20] = r3
            return
    }

    private void measureNoWrap(androidx.constraintlayout.core.widgets.ConstraintWidget[] r23, int r24, int r25, int r26, int[] r27) {
            r22 = this;
            r8 = r22
            r9 = r24
            if (r9 != 0) goto L7
            return
        L7:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            int r0 = r0.size()
            r10 = 0
            if (r0 != 0) goto L2a
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r11 = new androidx.constraintlayout.core.widgets.Flow$WidgetsList
            androidx.constraintlayout.core.widgets.ConstraintAnchor r3 = r8.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r4 = r8.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r5 = r8.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r6 = r8.mBottom
            r0 = r11
            r1 = r22
            r2 = r25
            r7 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            r0.add(r11)
            goto L57
        L2a:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r0 = r8.mChainList
            java.lang.Object r0 = r0.get(r10)
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r0 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r0
            r0.clear()
            androidx.constraintlayout.core.widgets.ConstraintAnchor r13 = r8.mLeft
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r8.mTop
            androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r8.mRight
            androidx.constraintlayout.core.widgets.ConstraintAnchor r1 = r8.mBottom
            int r17 = r22.getPaddingLeft()
            int r18 = r22.getPaddingTop()
            int r19 = r22.getPaddingRight()
            int r20 = r22.getPaddingBottom()
            r11 = r0
            r12 = r25
            r16 = r1
            r21 = r26
            r11.setup(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
        L57:
            r0 = 0
        L58:
            if (r0 >= r9) goto L62
            r1 = r23[r0]
            r11.add(r1)
            int r0 = r0 + 1
            goto L58
        L62:
            int r0 = r11.getWidth()
            r27[r10] = r0
            int r0 = r11.getHeight()
            r1 = 1
            r27[r1] = r0
            return
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(androidx.constraintlayout.core.LinearSystem r6, boolean r7) {
            r5 = this;
            super.addToSolver(r6, r7)
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.getParent()
            r7 = 0
            r0 = 1
            if (r6 == 0) goto L19
            androidx.constraintlayout.core.widgets.ConstraintWidget r6 = r5.getParent()
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r6 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r6
            boolean r6 = r6.isRtl()
            if (r6 == 0) goto L19
            r6 = 1
            goto L1a
        L19:
            r6 = 0
        L1a:
            int r1 = r5.mWrapMode
            if (r1 == 0) goto L67
            if (r1 == r0) goto L49
            r2 = 2
            if (r1 == r2) goto L45
            r2 = 3
            if (r1 == r2) goto L27
            goto L7a
        L27:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r1 = r5.mChainList
            int r1 = r1.size()
            r2 = 0
        L2e:
            if (r2 >= r1) goto L7a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r3 = r5.mChainList
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r3 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r3
            int r4 = r1 + (-1)
            if (r2 != r4) goto L3e
            r4 = 1
            goto L3f
        L3e:
            r4 = 0
        L3f:
            r3.createConstraints(r6, r2, r4)
            int r2 = r2 + 1
            goto L2e
        L45:
            r5.createAlignedConstraints(r6)
            goto L7a
        L49:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r1 = r5.mChainList
            int r1 = r1.size()
            r2 = 0
        L50:
            if (r2 >= r1) goto L7a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r3 = r5.mChainList
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r3 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r3
            int r4 = r1 + (-1)
            if (r2 != r4) goto L60
            r4 = 1
            goto L61
        L60:
            r4 = 0
        L61:
            r3.createConstraints(r6, r2, r4)
            int r2 = r2 + 1
            goto L50
        L67:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r1 = r5.mChainList
            int r1 = r1.size()
            if (r1 <= 0) goto L7a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.Flow$WidgetsList> r1 = r5.mChainList
            java.lang.Object r1 = r1.get(r7)
            androidx.constraintlayout.core.widgets.Flow$WidgetsList r1 = (androidx.constraintlayout.core.widgets.Flow.WidgetsList) r1
            r1.createConstraints(r6, r7, r0)
        L7a:
            r5.needsCallbackFromSolver(r7)
            return
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(androidx.constraintlayout.core.widgets.ConstraintWidget r1, java.util.HashMap<androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.ConstraintWidget> r2) {
            r0 = this;
            super.copy(r1, r2)
            androidx.constraintlayout.core.widgets.Flow r1 = (androidx.constraintlayout.core.widgets.Flow) r1
            int r2 = r1.mHorizontalStyle
            r0.mHorizontalStyle = r2
            int r2 = r1.mVerticalStyle
            r0.mVerticalStyle = r2
            int r2 = r1.mFirstHorizontalStyle
            r0.mFirstHorizontalStyle = r2
            int r2 = r1.mFirstVerticalStyle
            r0.mFirstVerticalStyle = r2
            int r2 = r1.mLastHorizontalStyle
            r0.mLastHorizontalStyle = r2
            int r2 = r1.mLastVerticalStyle
            r0.mLastVerticalStyle = r2
            float r2 = r1.mHorizontalBias
            r0.mHorizontalBias = r2
            float r2 = r1.mVerticalBias
            r0.mVerticalBias = r2
            float r2 = r1.mFirstHorizontalBias
            r0.mFirstHorizontalBias = r2
            float r2 = r1.mFirstVerticalBias
            r0.mFirstVerticalBias = r2
            float r2 = r1.mLastHorizontalBias
            r0.mLastHorizontalBias = r2
            float r2 = r1.mLastVerticalBias
            r0.mLastVerticalBias = r2
            int r2 = r1.mHorizontalGap
            r0.mHorizontalGap = r2
            int r2 = r1.mVerticalGap
            r0.mVerticalGap = r2
            int r2 = r1.mHorizontalAlign
            r0.mHorizontalAlign = r2
            int r2 = r1.mVerticalAlign
            r0.mVerticalAlign = r2
            int r2 = r1.mWrapMode
            r0.mWrapMode = r2
            int r2 = r1.mMaxElementsWrap
            r0.mMaxElementsWrap = r2
            int r1 = r1.mOrientation
            r0.mOrientation = r1
            return
    }

    public float getMaxElementsWrap() {
            r1 = this;
            int r0 = r1.mMaxElementsWrap
            float r0 = (float) r0
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void measure(int r18, int r19, int r20, int r21) {
            r17 = this;
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            int r0 = r6.mWidgetsCount
            r11 = 1
            r12 = 0
            if (r0 <= 0) goto L90
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r6.mParent
            if (r0 == 0) goto L1b
            androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r0 = (androidx.constraintlayout.core.widgets.ConstraintWidgetContainer) r0
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measurer r0 = r0.getMeasurer()
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 != 0) goto L20
            r0 = 0
            goto L87
        L20:
            r1 = 0
        L21:
            int r2 = r6.mWidgetsCount
            if (r1 >= r2) goto L86
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r2 = r6.mWidgets
            r2 = r2[r1]
            if (r2 != 0) goto L2c
            goto L83
        L2c:
            boolean r3 = r2 instanceof androidx.constraintlayout.core.widgets.Guideline
            if (r3 == 0) goto L31
            goto L83
        L31:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r2.getDimensionBehaviour(r12)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r2.getDimensionBehaviour(r11)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r3 != r5) goto L49
            int r13 = r2.mMatchConstraintDefaultWidth
            if (r13 == r11) goto L49
            if (r4 != r5) goto L49
            int r13 = r2.mMatchConstraintDefaultHeight
            if (r13 == r11) goto L49
            r13 = 1
            goto L4a
        L49:
            r13 = 0
        L4a:
            if (r13 == 0) goto L4d
            goto L83
        L4d:
            if (r3 != r5) goto L51
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L51:
            if (r4 != r5) goto L55
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
        L55:
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r5 = r6.mMeasure
            r5.horizontalBehavior = r3
            r5.verticalBehavior = r4
            int r3 = r2.getWidth()
            r5.horizontalDimension = r3
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r6.mMeasure
            int r4 = r2.getHeight()
            r3.verticalDimension = r4
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r6.mMeasure
            r0.measure(r2, r3)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r6.mMeasure
            int r3 = r3.measuredWidth
            r2.setWidth(r3)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r6.mMeasure
            int r3 = r3.measuredHeight
            r2.setHeight(r3)
            androidx.constraintlayout.core.widgets.analyzer.BasicMeasure$Measure r3 = r6.mMeasure
            int r3 = r3.measuredBaseline
            r2.setBaselineDistance(r3)
        L83:
            int r1 = r1 + 1
            goto L21
        L86:
            r0 = 1
        L87:
            if (r0 != 0) goto L90
            r6.setMeasure(r12, r12)
            r6.needsCallbackFromSolver(r12)
            return
        L90:
            int r13 = r17.getPaddingLeft()
            int r14 = r17.getPaddingRight()
            int r15 = r17.getPaddingTop()
            int r16 = r17.getPaddingBottom()
            r0 = 2
            int[] r5 = new int[r0]
            int r1 = r8 - r13
            int r1 = r1 - r14
            int r2 = r6.mOrientation
            if (r2 != r11) goto Lae
            int r1 = r10 - r15
            int r1 = r1 - r16
        Lae:
            r4 = r1
            r1 = -1
            if (r2 != 0) goto Lbf
            int r2 = r6.mHorizontalStyle
            if (r2 != r1) goto Lb8
            r6.mHorizontalStyle = r12
        Lb8:
            int r2 = r6.mVerticalStyle
            if (r2 != r1) goto Lcb
            r6.mVerticalStyle = r12
            goto Lcb
        Lbf:
            int r2 = r6.mHorizontalStyle
            if (r2 != r1) goto Lc5
            r6.mHorizontalStyle = r12
        Lc5:
            int r2 = r6.mVerticalStyle
            if (r2 != r1) goto Lcb
            r6.mVerticalStyle = r12
        Lcb:
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r6.mWidgets
            r2 = 0
            r3 = 0
        Lcf:
            int r12 = r6.mWidgetsCount
            r0 = 8
            if (r2 >= r12) goto Le5
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r12 = r6.mWidgets
            r12 = r12[r2]
            int r12 = r12.getVisibility()
            if (r12 != r0) goto Le1
            int r3 = r3 + 1
        Le1:
            int r2 = r2 + 1
            r0 = 2
            goto Lcf
        Le5:
            if (r3 <= 0) goto L104
            int r12 = r12 - r3
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = new androidx.constraintlayout.core.widgets.ConstraintWidget[r12]
            r2 = 0
            r3 = 0
        Lec:
            int r12 = r6.mWidgetsCount
            if (r2 >= r12) goto L102
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r12 = r6.mWidgets
            r12 = r12[r2]
            int r11 = r12.getVisibility()
            if (r11 == r0) goto Lfe
            r1[r3] = r12
            int r3 = r3 + 1
        Lfe:
            int r2 = r2 + 1
            r11 = 1
            goto Lec
        L102:
            r2 = r3
            goto L105
        L104:
            r2 = r12
        L105:
            r6.mDisplayedWidgets = r1
            r6.mDisplayedWidgetsCount = r2
            int r0 = r6.mWrapMode
            if (r0 == 0) goto L134
            r3 = 1
            if (r0 == r3) goto L12b
            r3 = 2
            if (r0 == r3) goto L122
            r3 = 3
            if (r0 == r3) goto L119
            r11 = r5
        L117:
            r0 = 0
            goto L13d
        L119:
            int r3 = r6.mOrientation
            r0 = r17
            r11 = r5
            r0.measureChainWrap_new(r1, r2, r3, r4, r5)
            goto L117
        L122:
            r11 = r5
            int r3 = r6.mOrientation
            r0 = r17
            r0.measureAligned(r1, r2, r3, r4, r5)
            goto L117
        L12b:
            r11 = r5
            int r3 = r6.mOrientation
            r0 = r17
            r0.measureChainWrap(r1, r2, r3, r4, r5)
            goto L117
        L134:
            r11 = r5
            int r3 = r6.mOrientation
            r0 = r17
            r0.measureNoWrap(r1, r2, r3, r4, r5)
            goto L117
        L13d:
            r1 = r11[r0]
            int r1 = r1 + r13
            int r1 = r1 + r14
            r2 = 1
            r3 = r11[r2]
            int r3 = r3 + r15
            int r3 = r3 + r16
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 1073741824(0x40000000, float:2.0)
            if (r7 != r5) goto L14f
            r1 = r8
            goto L15a
        L14f:
            if (r7 != r4) goto L156
            int r1 = java.lang.Math.min(r1, r8)
            goto L15a
        L156:
            if (r7 != 0) goto L159
            goto L15a
        L159:
            r1 = 0
        L15a:
            if (r9 != r5) goto L15e
            r3 = r10
            goto L169
        L15e:
            if (r9 != r4) goto L165
            int r3 = java.lang.Math.min(r3, r10)
            goto L169
        L165:
            if (r9 != 0) goto L168
            goto L169
        L168:
            r3 = 0
        L169:
            r6.setMeasure(r1, r3)
            r6.setWidth(r1)
            r6.setHeight(r3)
            int r1 = r6.mWidgetsCount
            if (r1 <= 0) goto L178
            r11 = 1
            goto L179
        L178:
            r11 = 0
        L179:
            r6.needsCallbackFromSolver(r11)
            return
    }

    public void setFirstHorizontalBias(float r1) {
            r0 = this;
            r0.mFirstHorizontalBias = r1
            return
    }

    public void setFirstHorizontalStyle(int r1) {
            r0 = this;
            r0.mFirstHorizontalStyle = r1
            return
    }

    public void setFirstVerticalBias(float r1) {
            r0 = this;
            r0.mFirstVerticalBias = r1
            return
    }

    public void setFirstVerticalStyle(int r1) {
            r0 = this;
            r0.mFirstVerticalStyle = r1
            return
    }

    public void setHorizontalAlign(int r1) {
            r0 = this;
            r0.mHorizontalAlign = r1
            return
    }

    public void setHorizontalBias(float r1) {
            r0 = this;
            r0.mHorizontalBias = r1
            return
    }

    public void setHorizontalGap(int r1) {
            r0 = this;
            r0.mHorizontalGap = r1
            return
    }

    public void setHorizontalStyle(int r1) {
            r0 = this;
            r0.mHorizontalStyle = r1
            return
    }

    public void setLastHorizontalBias(float r1) {
            r0 = this;
            r0.mLastHorizontalBias = r1
            return
    }

    public void setLastHorizontalStyle(int r1) {
            r0 = this;
            r0.mLastHorizontalStyle = r1
            return
    }

    public void setLastVerticalBias(float r1) {
            r0 = this;
            r0.mLastVerticalBias = r1
            return
    }

    public void setLastVerticalStyle(int r1) {
            r0 = this;
            r0.mLastVerticalStyle = r1
            return
    }

    public void setMaxElementsWrap(int r1) {
            r0 = this;
            r0.mMaxElementsWrap = r1
            return
    }

    public void setOrientation(int r1) {
            r0 = this;
            r0.mOrientation = r1
            return
    }

    public void setVerticalAlign(int r1) {
            r0 = this;
            r0.mVerticalAlign = r1
            return
    }

    public void setVerticalBias(float r1) {
            r0 = this;
            r0.mVerticalBias = r1
            return
    }

    public void setVerticalGap(int r1) {
            r0 = this;
            r0.mVerticalGap = r1
            return
    }

    public void setVerticalStyle(int r1) {
            r0 = this;
            r0.mVerticalStyle = r1
            return
    }

    public void setWrapMode(int r1) {
            r0 = this;
            r0.mWrapMode = r1
            return
    }
}
