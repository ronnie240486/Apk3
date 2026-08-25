package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintSet {
    private static final int ALPHA = 43;
    private static final int ANIMATE_CIRCLE_ANGLE_TO = 82;
    private static final int ANIMATE_RELATIVE_TO = 64;
    private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
    private static final int BARRIER_DIRECTION = 72;
    private static final int BARRIER_MARGIN = 73;
    private static final int BARRIER_TYPE = 1;
    public static final int BASELINE = 5;
    private static final int BASELINE_MARGIN = 93;
    private static final int BASELINE_TO_BASELINE = 1;
    private static final int BASELINE_TO_BOTTOM = 92;
    private static final int BASELINE_TO_TOP = 91;
    public static final int BOTTOM = 4;
    private static final int BOTTOM_MARGIN = 2;
    private static final int BOTTOM_TO_BOTTOM = 3;
    private static final int BOTTOM_TO_TOP = 4;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    private static final int CHAIN_USE_RTL = 71;
    private static final int CIRCLE = 61;
    private static final int CIRCLE_ANGLE = 63;
    private static final int CIRCLE_RADIUS = 62;
    public static final int CIRCLE_REFERENCE = 8;
    private static final int CONSTRAINED_HEIGHT = 81;
    private static final int CONSTRAINED_WIDTH = 80;
    private static final int CONSTRAINT_REFERENCED_IDS = 74;
    private static final int CONSTRAINT_TAG = 77;
    private static final boolean DEBUG = false;
    private static final int DIMENSION_RATIO = 5;
    private static final int DRAW_PATH = 66;
    private static final int EDITOR_ABSOLUTE_X = 6;
    private static final int EDITOR_ABSOLUTE_Y = 7;
    private static final int ELEVATION = 44;
    public static final int END = 7;
    private static final int END_MARGIN = 8;
    private static final int END_TO_END = 9;
    private static final int END_TO_START = 10;
    private static final java.lang.String ERROR_MESSAGE = "XML parser error must be within a Constraint ";
    public static final int GONE = 8;
    private static final int GONE_BASELINE_MARGIN = 94;
    private static final int GONE_BOTTOM_MARGIN = 11;
    private static final int GONE_END_MARGIN = 12;
    private static final int GONE_LEFT_MARGIN = 13;
    private static final int GONE_RIGHT_MARGIN = 14;
    private static final int GONE_START_MARGIN = 15;
    private static final int GONE_TOP_MARGIN = 16;
    private static final int GUIDELINE_USE_RTL = 99;
    private static final int GUIDE_BEGIN = 17;
    private static final int GUIDE_END = 18;
    private static final int GUIDE_PERCENT = 19;
    private static final int HEIGHT_DEFAULT = 55;
    private static final int HEIGHT_MAX = 57;
    private static final int HEIGHT_MIN = 59;
    private static final int HEIGHT_PERCENT = 70;
    public static final int HORIZONTAL = 0;
    private static final int HORIZONTAL_BIAS = 20;
    public static final int HORIZONTAL_GUIDELINE = 0;
    private static final int HORIZONTAL_STYLE = 41;
    private static final int HORIZONTAL_WEIGHT = 39;
    private static final int INTERNAL_MATCH_CONSTRAINT = -3;
    private static final int INTERNAL_MATCH_PARENT = -1;
    private static final int INTERNAL_WRAP_CONTENT = -2;
    private static final int INTERNAL_WRAP_CONTENT_CONSTRAINED = -4;
    public static final int INVISIBLE = 4;
    private static final java.lang.String KEY_PERCENT_PARENT = "parent";
    private static final java.lang.String KEY_RATIO = "ratio";
    private static final java.lang.String KEY_WEIGHT = "weight";
    private static final int LAYOUT_CONSTRAINT_HEIGHT = 96;
    private static final int LAYOUT_CONSTRAINT_WIDTH = 95;
    private static final int LAYOUT_HEIGHT = 21;
    private static final int LAYOUT_VISIBILITY = 22;
    private static final int LAYOUT_WIDTH = 23;
    private static final int LAYOUT_WRAP_BEHAVIOR = 97;
    public static final int LEFT = 1;
    private static final int LEFT_MARGIN = 24;
    private static final int LEFT_TO_LEFT = 25;
    private static final int LEFT_TO_RIGHT = 26;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    private static final int MOTION_STAGGER = 79;
    private static final int MOTION_TARGET = 98;
    private static final int ORIENTATION = 27;
    public static final int PARENT_ID = 0;
    private static final int PATH_MOTION_ARC = 76;
    private static final int PROGRESS = 68;
    private static final int QUANTIZE_MOTION_INTERPOLATOR = 86;
    private static final int QUANTIZE_MOTION_INTERPOLATOR_ID = 89;
    private static final int QUANTIZE_MOTION_INTERPOLATOR_STR = 90;
    private static final int QUANTIZE_MOTION_INTERPOLATOR_TYPE = 88;
    private static final int QUANTIZE_MOTION_PHASE = 85;
    private static final int QUANTIZE_MOTION_STEPS = 84;
    public static final int RIGHT = 2;
    private static final int RIGHT_MARGIN = 28;
    private static final int RIGHT_TO_LEFT = 29;
    private static final int RIGHT_TO_RIGHT = 30;
    public static final int ROTATE_LEFT_OF_PORTRATE = 4;
    public static final int ROTATE_NONE = 0;
    public static final int ROTATE_PORTRATE_OF_LEFT = 2;
    public static final int ROTATE_PORTRATE_OF_RIGHT = 1;
    public static final int ROTATE_RIGHT_OF_PORTRATE = 3;
    private static final int ROTATION = 60;
    private static final int ROTATION_X = 45;
    private static final int ROTATION_Y = 46;
    private static final int SCALE_X = 47;
    private static final int SCALE_Y = 48;
    public static final int START = 6;
    private static final int START_MARGIN = 31;
    private static final int START_TO_END = 32;
    private static final int START_TO_START = 33;
    private static final java.lang.String TAG = "ConstraintSet";
    public static final int TOP = 3;
    private static final int TOP_MARGIN = 34;
    private static final int TOP_TO_BOTTOM = 35;
    private static final int TOP_TO_TOP = 36;
    private static final int TRANSFORM_PIVOT_TARGET = 83;
    private static final int TRANSFORM_PIVOT_X = 49;
    private static final int TRANSFORM_PIVOT_Y = 50;
    private static final int TRANSITION_EASING = 65;
    private static final int TRANSITION_PATH_ROTATE = 67;
    private static final int TRANSLATION_X = 51;
    private static final int TRANSLATION_Y = 52;
    private static final int TRANSLATION_Z = 53;
    public static final int UNSET = -1;
    private static final int UNUSED = 87;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_BIAS = 37;
    public static final int VERTICAL_GUIDELINE = 1;
    private static final int VERTICAL_STYLE = 42;
    private static final int VERTICAL_WEIGHT = 40;
    private static final int VIEW_ID = 38;
    private static final int[] VISIBILITY_FLAGS = null;
    private static final int VISIBILITY_MODE = 78;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 0;
    private static final int WIDTH_DEFAULT = 54;
    private static final int WIDTH_MAX = 56;
    private static final int WIDTH_MIN = 58;
    private static final int WIDTH_PERCENT = 69;
    public static final int WRAP_CONTENT = -2;
    private static android.util.SparseIntArray mapToConstant;
    private static android.util.SparseIntArray overrideMapToConstant;
    public java.lang.String derivedState;
    private java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet.Constraint> mConstraints;
    private boolean mForceId;
    public java.lang.String mIdString;
    public int mRotate;
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> mSavedAttributes;
    private boolean mValidate;

    /* JADX INFO: loaded from: classes2.dex */
    public static class Constraint {
        public final androidx.constraintlayout.widget.ConstraintSet.Layout layout;
        public java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> mCustomConstraints;
        public androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta mDelta;
        public java.lang.String mTargetString;
        public int mViewId;
        public final androidx.constraintlayout.widget.ConstraintSet.Motion motion;
        public final androidx.constraintlayout.widget.ConstraintSet.PropertySet propertySet;
        public final androidx.constraintlayout.widget.ConstraintSet.Transform transform;

        /* JADX INFO: loaded from: classes.dex */
        public static class Delta {
            private static final int INITIAL_BOOLEAN = 4;
            private static final int INITIAL_FLOAT = 10;
            private static final int INITIAL_INT = 10;
            private static final int INITIAL_STRING = 5;
            public int mCountBoolean;
            public int mCountFloat;
            public int mCountInt;
            public int mCountString;
            public int[] mTypeBoolean;
            public int[] mTypeFloat;
            public int[] mTypeInt;
            public int[] mTypeString;
            public boolean[] mValueBoolean;
            public float[] mValueFloat;
            public int[] mValueInt;
            public java.lang.String[] mValueString;

            public Delta() {
                    r3 = this;
                    r3.<init>()
                    r0 = 10
                    int[] r1 = new int[r0]
                    r3.mTypeInt = r1
                    int[] r1 = new int[r0]
                    r3.mValueInt = r1
                    r1 = 0
                    r3.mCountInt = r1
                    int[] r2 = new int[r0]
                    r3.mTypeFloat = r2
                    float[] r0 = new float[r0]
                    r3.mValueFloat = r0
                    r3.mCountFloat = r1
                    r0 = 5
                    int[] r2 = new int[r0]
                    r3.mTypeString = r2
                    java.lang.String[] r0 = new java.lang.String[r0]
                    r3.mValueString = r0
                    r3.mCountString = r1
                    r0 = 4
                    int[] r2 = new int[r0]
                    r3.mTypeBoolean = r2
                    boolean[] r0 = new boolean[r0]
                    r3.mValueBoolean = r0
                    r3.mCountBoolean = r1
                    return
            }

            public final void add(int r4, float r5) {
                    r3 = this;
                    int r0 = r3.mCountFloat
                    int[] r1 = r3.mTypeFloat
                    int r2 = r1.length
                    if (r0 < r2) goto L1b
                    int r0 = r1.length
                    int r0 = r0 * 2
                    int[] r0 = java.util.Arrays.copyOf(r1, r0)
                    r3.mTypeFloat = r0
                    float[] r0 = r3.mValueFloat
                    int r1 = r0.length
                    int r1 = r1 * 2
                    float[] r0 = java.util.Arrays.copyOf(r0, r1)
                    r3.mValueFloat = r0
                L1b:
                    int[] r0 = r3.mTypeFloat
                    int r1 = r3.mCountFloat
                    r0[r1] = r4
                    float[] r4 = r3.mValueFloat
                    int r0 = r1 + 1
                    r3.mCountFloat = r0
                    r4[r1] = r5
                    return
            }

            public final void add(int r4, int r5) {
                    r3 = this;
                    int r0 = r3.mCountInt
                    int[] r1 = r3.mTypeInt
                    int r2 = r1.length
                    if (r0 < r2) goto L1b
                    int r0 = r1.length
                    int r0 = r0 * 2
                    int[] r0 = java.util.Arrays.copyOf(r1, r0)
                    r3.mTypeInt = r0
                    int[] r0 = r3.mValueInt
                    int r1 = r0.length
                    int r1 = r1 * 2
                    int[] r0 = java.util.Arrays.copyOf(r0, r1)
                    r3.mValueInt = r0
                L1b:
                    int[] r0 = r3.mTypeInt
                    int r1 = r3.mCountInt
                    r0[r1] = r4
                    int[] r4 = r3.mValueInt
                    int r0 = r1 + 1
                    r3.mCountInt = r0
                    r4[r1] = r5
                    return
            }

            public final void add(int r4, java.lang.String r5) {
                    r3 = this;
                    int r0 = r3.mCountString
                    int[] r1 = r3.mTypeString
                    int r2 = r1.length
                    if (r0 < r2) goto L1d
                    int r0 = r1.length
                    int r0 = r0 * 2
                    int[] r0 = java.util.Arrays.copyOf(r1, r0)
                    r3.mTypeString = r0
                    java.lang.String[] r0 = r3.mValueString
                    int r1 = r0.length
                    int r1 = r1 * 2
                    java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
                    java.lang.String[] r0 = (java.lang.String[]) r0
                    r3.mValueString = r0
                L1d:
                    int[] r0 = r3.mTypeString
                    int r1 = r3.mCountString
                    r0[r1] = r4
                    java.lang.String[] r4 = r3.mValueString
                    int r0 = r1 + 1
                    r3.mCountString = r0
                    r4[r1] = r5
                    return
            }

            public final void add(int r4, boolean r5) {
                    r3 = this;
                    int r0 = r3.mCountBoolean
                    int[] r1 = r3.mTypeBoolean
                    int r2 = r1.length
                    if (r0 < r2) goto L1b
                    int r0 = r1.length
                    int r0 = r0 * 2
                    int[] r0 = java.util.Arrays.copyOf(r1, r0)
                    r3.mTypeBoolean = r0
                    boolean[] r0 = r3.mValueBoolean
                    int r1 = r0.length
                    int r1 = r1 * 2
                    boolean[] r0 = java.util.Arrays.copyOf(r0, r1)
                    r3.mValueBoolean = r0
                L1b:
                    int[] r0 = r3.mTypeBoolean
                    int r1 = r3.mCountBoolean
                    r0[r1] = r4
                    boolean[] r4 = r3.mValueBoolean
                    int r0 = r1 + 1
                    r3.mCountBoolean = r0
                    r4[r1] = r5
                    return
            }

            public final void applyDelta(androidx.constraintlayout.widget.ConstraintSet.Constraint r5) {
                    r4 = this;
                    r0 = 0
                    r1 = 0
                L2:
                    int r2 = r4.mCountInt
                    if (r1 >= r2) goto L14
                    int[] r2 = r4.mTypeInt
                    r2 = r2[r1]
                    int[] r3 = r4.mValueInt
                    r3 = r3[r1]
                    androidx.constraintlayout.widget.ConstraintSet.access$300(r5, r2, r3)
                    int r1 = r1 + 1
                    goto L2
                L14:
                    r1 = 0
                L15:
                    int r2 = r4.mCountFloat
                    if (r1 >= r2) goto L27
                    int[] r2 = r4.mTypeFloat
                    r2 = r2[r1]
                    float[] r3 = r4.mValueFloat
                    r3 = r3[r1]
                    androidx.constraintlayout.widget.ConstraintSet.access$400(r5, r2, r3)
                    int r1 = r1 + 1
                    goto L15
                L27:
                    r1 = 0
                L28:
                    int r2 = r4.mCountString
                    if (r1 >= r2) goto L3a
                    int[] r2 = r4.mTypeString
                    r2 = r2[r1]
                    java.lang.String[] r3 = r4.mValueString
                    r3 = r3[r1]
                    androidx.constraintlayout.widget.ConstraintSet.access$500(r5, r2, r3)
                    int r1 = r1 + 1
                    goto L28
                L3a:
                    int r1 = r4.mCountBoolean
                    if (r0 >= r1) goto L4c
                    int[] r1 = r4.mTypeBoolean
                    r1 = r1[r0]
                    boolean[] r2 = r4.mValueBoolean
                    boolean r2 = r2[r0]
                    androidx.constraintlayout.widget.ConstraintSet.access$600(r5, r1, r2)
                    int r0 = r0 + 1
                    goto L3a
                L4c:
                    return
            }
        }

        public Constraint() {
                r1 = this;
                r1.<init>()
                androidx.constraintlayout.widget.ConstraintSet$PropertySet r0 = new androidx.constraintlayout.widget.ConstraintSet$PropertySet
                r0.<init>()
                r1.propertySet = r0
                androidx.constraintlayout.widget.ConstraintSet$Motion r0 = new androidx.constraintlayout.widget.ConstraintSet$Motion
                r0.<init>()
                r1.motion = r0
                androidx.constraintlayout.widget.ConstraintSet$Layout r0 = new androidx.constraintlayout.widget.ConstraintSet$Layout
                r0.<init>()
                r1.layout = r0
                androidx.constraintlayout.widget.ConstraintSet$Transform r0 = new androidx.constraintlayout.widget.ConstraintSet$Transform
                r0.<init>()
                r1.transform = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r1.mCustomConstraints = r0
                return
        }

        public static /* synthetic */ void access$000(androidx.constraintlayout.widget.ConstraintSet.Constraint r0, int r1, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r2) {
                r0.fillFrom(r1, r2)
                return
        }

        public static /* synthetic */ void access$1000(androidx.constraintlayout.widget.ConstraintSet.Constraint r0, java.lang.String r1, int r2) {
                r0.setColorValue(r1, r2)
                return
        }

        public static /* synthetic */ void access$1100(androidx.constraintlayout.widget.ConstraintSet.Constraint r0, java.lang.String r1, float r2) {
                r0.setFloatValue(r1, r2)
                return
        }

        public static /* synthetic */ void access$1200(androidx.constraintlayout.widget.ConstraintSet.Constraint r0, java.lang.String r1, java.lang.String r2) {
                r0.setStringValue(r1, r2)
                return
        }

        public static /* synthetic */ void access$700(androidx.constraintlayout.widget.ConstraintSet.Constraint r0, androidx.constraintlayout.widget.ConstraintHelper r1, int r2, androidx.constraintlayout.widget.Constraints.LayoutParams r3) {
                r0.fillFromConstraints(r1, r2, r3)
                return
        }

        public static /* synthetic */ void access$800(androidx.constraintlayout.widget.ConstraintSet.Constraint r0, int r1, androidx.constraintlayout.widget.Constraints.LayoutParams r2) {
                r0.fillFromConstraints(r1, r2)
                return
        }

        public static /* synthetic */ void access$900(androidx.constraintlayout.widget.ConstraintSet.Constraint r0, java.lang.String r1, int r2) {
                r0.setIntValue(r1, r2)
                return
        }

        private void fillFrom(int r2, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r3) {
                r1 = this;
                r1.mViewId = r2
                androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r1.layout
                int r0 = r3.leftToLeft
                r2.leftToLeft = r0
                int r0 = r3.leftToRight
                r2.leftToRight = r0
                int r0 = r3.rightToLeft
                r2.rightToLeft = r0
                int r0 = r3.rightToRight
                r2.rightToRight = r0
                int r0 = r3.topToTop
                r2.topToTop = r0
                int r0 = r3.topToBottom
                r2.topToBottom = r0
                int r0 = r3.bottomToTop
                r2.bottomToTop = r0
                int r0 = r3.bottomToBottom
                r2.bottomToBottom = r0
                int r0 = r3.baselineToBaseline
                r2.baselineToBaseline = r0
                int r0 = r3.baselineToTop
                r2.baselineToTop = r0
                int r0 = r3.baselineToBottom
                r2.baselineToBottom = r0
                int r0 = r3.startToEnd
                r2.startToEnd = r0
                int r0 = r3.startToStart
                r2.startToStart = r0
                int r0 = r3.endToStart
                r2.endToStart = r0
                int r0 = r3.endToEnd
                r2.endToEnd = r0
                float r0 = r3.horizontalBias
                r2.horizontalBias = r0
                float r0 = r3.verticalBias
                r2.verticalBias = r0
                java.lang.String r0 = r3.dimensionRatio
                r2.dimensionRatio = r0
                int r0 = r3.circleConstraint
                r2.circleConstraint = r0
                int r0 = r3.circleRadius
                r2.circleRadius = r0
                float r0 = r3.circleAngle
                r2.circleAngle = r0
                int r0 = r3.editorAbsoluteX
                r2.editorAbsoluteX = r0
                int r0 = r3.editorAbsoluteY
                r2.editorAbsoluteY = r0
                int r0 = r3.orientation
                r2.orientation = r0
                float r0 = r3.guidePercent
                r2.guidePercent = r0
                int r0 = r3.guideBegin
                r2.guideBegin = r0
                int r0 = r3.guideEnd
                r2.guideEnd = r0
                int r0 = r3.width
                r2.mWidth = r0
                int r0 = r3.height
                r2.mHeight = r0
                int r0 = r3.leftMargin
                r2.leftMargin = r0
                int r0 = r3.rightMargin
                r2.rightMargin = r0
                int r0 = r3.topMargin
                r2.topMargin = r0
                int r0 = r3.bottomMargin
                r2.bottomMargin = r0
                int r0 = r3.baselineMargin
                r2.baselineMargin = r0
                float r0 = r3.verticalWeight
                r2.verticalWeight = r0
                float r0 = r3.horizontalWeight
                r2.horizontalWeight = r0
                int r0 = r3.verticalChainStyle
                r2.verticalChainStyle = r0
                int r0 = r3.horizontalChainStyle
                r2.horizontalChainStyle = r0
                boolean r0 = r3.constrainedWidth
                r2.constrainedWidth = r0
                boolean r0 = r3.constrainedHeight
                r2.constrainedHeight = r0
                int r0 = r3.matchConstraintDefaultWidth
                r2.widthDefault = r0
                int r0 = r3.matchConstraintDefaultHeight
                r2.heightDefault = r0
                int r0 = r3.matchConstraintMaxWidth
                r2.widthMax = r0
                int r0 = r3.matchConstraintMaxHeight
                r2.heightMax = r0
                int r0 = r3.matchConstraintMinWidth
                r2.widthMin = r0
                int r0 = r3.matchConstraintMinHeight
                r2.heightMin = r0
                float r0 = r3.matchConstraintPercentWidth
                r2.widthPercent = r0
                float r0 = r3.matchConstraintPercentHeight
                r2.heightPercent = r0
                java.lang.String r0 = r3.constraintTag
                r2.mConstraintTag = r0
                int r0 = r3.goneTopMargin
                r2.goneTopMargin = r0
                int r0 = r3.goneBottomMargin
                r2.goneBottomMargin = r0
                int r0 = r3.goneLeftMargin
                r2.goneLeftMargin = r0
                int r0 = r3.goneRightMargin
                r2.goneRightMargin = r0
                int r0 = r3.goneStartMargin
                r2.goneStartMargin = r0
                int r0 = r3.goneEndMargin
                r2.goneEndMargin = r0
                int r0 = r3.goneBaselineMargin
                r2.goneBaselineMargin = r0
                int r0 = r3.wrapBehaviorInParent
                r2.mWrapBehavior = r0
                int r0 = r3.getMarginEnd()
                r2.endMargin = r0
                androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r1.layout
                int r3 = r3.getMarginStart()
                r2.startMargin = r3
                return
        }

        private void fillFromConstraints(int r2, androidx.constraintlayout.widget.Constraints.LayoutParams r3) {
                r1 = this;
                r1.fillFrom(r2, r3)
                androidx.constraintlayout.widget.ConstraintSet$PropertySet r2 = r1.propertySet
                float r0 = r3.alpha
                r2.alpha = r0
                androidx.constraintlayout.widget.ConstraintSet$Transform r2 = r1.transform
                float r0 = r3.rotation
                r2.rotation = r0
                float r0 = r3.rotationX
                r2.rotationX = r0
                float r0 = r3.rotationY
                r2.rotationY = r0
                float r0 = r3.scaleX
                r2.scaleX = r0
                float r0 = r3.scaleY
                r2.scaleY = r0
                float r0 = r3.transformPivotX
                r2.transformPivotX = r0
                float r0 = r3.transformPivotY
                r2.transformPivotY = r0
                float r0 = r3.translationX
                r2.translationX = r0
                float r0 = r3.translationY
                r2.translationY = r0
                float r0 = r3.translationZ
                r2.translationZ = r0
                float r0 = r3.elevation
                r2.elevation = r0
                boolean r3 = r3.applyElevation
                r2.applyElevation = r3
                return
        }

        private void fillFromConstraints(androidx.constraintlayout.widget.ConstraintHelper r1, int r2, androidx.constraintlayout.widget.Constraints.LayoutParams r3) {
                r0 = this;
                r0.fillFromConstraints(r2, r3)
                boolean r2 = r1 instanceof androidx.constraintlayout.widget.Barrier
                if (r2 == 0) goto L24
                androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r0.layout
                r3 = 1
                r2.mHelperType = r3
                androidx.constraintlayout.widget.Barrier r1 = (androidx.constraintlayout.widget.Barrier) r1
                int r3 = r1.getType()
                r2.mBarrierDirection = r3
                androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r0.layout
                int[] r3 = r1.getReferencedIds()
                r2.mReferenceIds = r3
                androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r0.layout
                int r1 = r1.getMargin()
                r2.mBarrierMargin = r1
            L24:
                return
        }

        private androidx.constraintlayout.widget.ConstraintAttribute get(java.lang.String r2, androidx.constraintlayout.widget.ConstraintAttribute.AttributeType r3) {
                r1 = this;
                java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r1.mCustomConstraints
                boolean r0 = r0.containsKey(r2)
                if (r0 == 0) goto L32
                java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r1.mCustomConstraints
                java.lang.Object r2 = r0.get(r2)
                androidx.constraintlayout.widget.ConstraintAttribute r2 = (androidx.constraintlayout.widget.ConstraintAttribute) r2
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = r2.getType()
                if (r0 != r3) goto L17
                goto L3d
            L17:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "ConstraintAttribute is already a "
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r2 = r2.getType()
                java.lang.String r2 = r2.name()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r3.<init>(r2)
                throw r3
            L32:
                androidx.constraintlayout.widget.ConstraintAttribute r0 = new androidx.constraintlayout.widget.ConstraintAttribute
                r0.<init>(r2, r3)
                java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r1.mCustomConstraints
                r3.put(r2, r0)
                r2 = r0
            L3d:
                return r2
        }

        private void setColorValue(java.lang.String r2, int r3) {
                r1 = this;
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE
                androidx.constraintlayout.widget.ConstraintAttribute r2 = r1.get(r2, r0)
                r2.setColorValue(r3)
                return
        }

        private void setFloatValue(java.lang.String r2, float r3) {
                r1 = this;
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE
                androidx.constraintlayout.widget.ConstraintAttribute r2 = r1.get(r2, r0)
                r2.setFloatValue(r3)
                return
        }

        private void setIntValue(java.lang.String r2, int r3) {
                r1 = this;
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE
                androidx.constraintlayout.widget.ConstraintAttribute r2 = r1.get(r2, r0)
                r2.setIntValue(r3)
                return
        }

        private void setStringValue(java.lang.String r2, java.lang.String r3) {
                r1 = this;
                androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE
                androidx.constraintlayout.widget.ConstraintAttribute r2 = r1.get(r2, r0)
                r2.setStringValue(r3)
                return
        }

        public void applyDelta(androidx.constraintlayout.widget.ConstraintSet.Constraint r2) {
                r1 = this;
                androidx.constraintlayout.widget.ConstraintSet$Constraint$Delta r0 = r1.mDelta
                if (r0 == 0) goto L7
                r0.applyDelta(r2)
            L7:
                return
        }

        public void applyTo(androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r3) {
                r2 = this;
                androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r2.layout
                int r1 = r0.leftToLeft
                r3.leftToLeft = r1
                int r1 = r0.leftToRight
                r3.leftToRight = r1
                int r1 = r0.rightToLeft
                r3.rightToLeft = r1
                int r1 = r0.rightToRight
                r3.rightToRight = r1
                int r1 = r0.topToTop
                r3.topToTop = r1
                int r1 = r0.topToBottom
                r3.topToBottom = r1
                int r1 = r0.bottomToTop
                r3.bottomToTop = r1
                int r1 = r0.bottomToBottom
                r3.bottomToBottom = r1
                int r1 = r0.baselineToBaseline
                r3.baselineToBaseline = r1
                int r1 = r0.baselineToTop
                r3.baselineToTop = r1
                int r1 = r0.baselineToBottom
                r3.baselineToBottom = r1
                int r1 = r0.startToEnd
                r3.startToEnd = r1
                int r1 = r0.startToStart
                r3.startToStart = r1
                int r1 = r0.endToStart
                r3.endToStart = r1
                int r1 = r0.endToEnd
                r3.endToEnd = r1
                int r1 = r0.leftMargin
                r3.leftMargin = r1
                int r1 = r0.rightMargin
                r3.rightMargin = r1
                int r1 = r0.topMargin
                r3.topMargin = r1
                int r1 = r0.bottomMargin
                r3.bottomMargin = r1
                int r1 = r0.goneStartMargin
                r3.goneStartMargin = r1
                int r1 = r0.goneEndMargin
                r3.goneEndMargin = r1
                int r1 = r0.goneTopMargin
                r3.goneTopMargin = r1
                int r1 = r0.goneBottomMargin
                r3.goneBottomMargin = r1
                float r1 = r0.horizontalBias
                r3.horizontalBias = r1
                float r1 = r0.verticalBias
                r3.verticalBias = r1
                int r1 = r0.circleConstraint
                r3.circleConstraint = r1
                int r1 = r0.circleRadius
                r3.circleRadius = r1
                float r1 = r0.circleAngle
                r3.circleAngle = r1
                java.lang.String r1 = r0.dimensionRatio
                r3.dimensionRatio = r1
                int r1 = r0.editorAbsoluteX
                r3.editorAbsoluteX = r1
                int r1 = r0.editorAbsoluteY
                r3.editorAbsoluteY = r1
                float r1 = r0.verticalWeight
                r3.verticalWeight = r1
                float r1 = r0.horizontalWeight
                r3.horizontalWeight = r1
                int r1 = r0.verticalChainStyle
                r3.verticalChainStyle = r1
                int r1 = r0.horizontalChainStyle
                r3.horizontalChainStyle = r1
                boolean r1 = r0.constrainedWidth
                r3.constrainedWidth = r1
                boolean r1 = r0.constrainedHeight
                r3.constrainedHeight = r1
                int r1 = r0.widthDefault
                r3.matchConstraintDefaultWidth = r1
                int r1 = r0.heightDefault
                r3.matchConstraintDefaultHeight = r1
                int r1 = r0.widthMax
                r3.matchConstraintMaxWidth = r1
                int r1 = r0.heightMax
                r3.matchConstraintMaxHeight = r1
                int r1 = r0.widthMin
                r3.matchConstraintMinWidth = r1
                int r1 = r0.heightMin
                r3.matchConstraintMinHeight = r1
                float r1 = r0.widthPercent
                r3.matchConstraintPercentWidth = r1
                float r1 = r0.heightPercent
                r3.matchConstraintPercentHeight = r1
                int r1 = r0.orientation
                r3.orientation = r1
                float r1 = r0.guidePercent
                r3.guidePercent = r1
                int r1 = r0.guideBegin
                r3.guideBegin = r1
                int r1 = r0.guideEnd
                r3.guideEnd = r1
                int r1 = r0.mWidth
                r3.width = r1
                int r1 = r0.mHeight
                r3.height = r1
                java.lang.String r1 = r0.mConstraintTag
                if (r1 == 0) goto Ld4
                r3.constraintTag = r1
            Ld4:
                int r1 = r0.mWrapBehavior
                r3.wrapBehaviorInParent = r1
                int r0 = r0.startMargin
                r3.setMarginStart(r0)
                androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r2.layout
                int r0 = r0.endMargin
                r3.setMarginEnd(r0)
                r3.validate()
                return
        }

        public androidx.constraintlayout.widget.ConstraintSet.Constraint clone() {
                r3 = this;
                androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = new androidx.constraintlayout.widget.ConstraintSet$Constraint
                r0.<init>()
                androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r0.layout
                androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r3.layout
                r1.copyFrom(r2)
                androidx.constraintlayout.widget.ConstraintSet$Motion r1 = r0.motion
                androidx.constraintlayout.widget.ConstraintSet$Motion r2 = r3.motion
                r1.copyFrom(r2)
                androidx.constraintlayout.widget.ConstraintSet$PropertySet r1 = r0.propertySet
                androidx.constraintlayout.widget.ConstraintSet$PropertySet r2 = r3.propertySet
                r1.copyFrom(r2)
                androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r0.transform
                androidx.constraintlayout.widget.ConstraintSet$Transform r2 = r3.transform
                r1.copyFrom(r2)
                int r1 = r3.mViewId
                r0.mViewId = r1
                androidx.constraintlayout.widget.ConstraintSet$Constraint$Delta r1 = r3.mDelta
                r0.mDelta = r1
                return r0
        }

        /* JADX INFO: renamed from: clone, reason: collision with other method in class */
        public /* bridge */ /* synthetic */ java.lang.Object m9clone() throws java.lang.CloneNotSupportedException {
                r1 = this;
                androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = r1.clone()
                return r0
        }

        public void printDelta(java.lang.String r7) {
                r6 = this;
                androidx.constraintlayout.widget.ConstraintSet$Constraint$Delta r0 = r6.mDelta
                if (r0 == 0) goto Lb2
                java.util.Objects.requireNonNull(r0)
                java.lang.String r1 = "int"
                android.util.Log.v(r7, r1)
                r1 = 0
                r2 = 0
            Le:
                int r3 = r0.mCountInt
                java.lang.String r4 = " = "
                if (r2 >= r3) goto L34
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                int[] r5 = r0.mTypeInt
                r5 = r5[r2]
                r3.append(r5)
                r3.append(r4)
                int[] r4 = r0.mValueInt
                r4 = r4[r2]
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                android.util.Log.v(r7, r3)
                int r2 = r2 + 1
                goto Le
            L34:
                java.lang.String r2 = "float"
                android.util.Log.v(r7, r2)
                r2 = 0
            L3a:
                int r3 = r0.mCountFloat
                if (r2 >= r3) goto L5e
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                int[] r5 = r0.mTypeFloat
                r5 = r5[r2]
                r3.append(r5)
                r3.append(r4)
                float[] r5 = r0.mValueFloat
                r5 = r5[r2]
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                android.util.Log.v(r7, r3)
                int r2 = r2 + 1
                goto L3a
            L5e:
                java.lang.String r2 = "strings"
                android.util.Log.v(r7, r2)
                r2 = 0
            L65:
                int r3 = r0.mCountString
                if (r2 >= r3) goto L89
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                int[] r5 = r0.mTypeString
                r5 = r5[r2]
                r3.append(r5)
                r3.append(r4)
                java.lang.String[] r5 = r0.mValueString
                r5 = r5[r2]
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                android.util.Log.v(r7, r3)
                int r2 = r2 + 1
                goto L65
            L89:
                java.lang.String r2 = "boolean"
                android.util.Log.v(r7, r2)
            L8e:
                int r2 = r0.mCountBoolean
                if (r1 >= r2) goto Lb7
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                int[] r3 = r0.mTypeBoolean
                r3 = r3[r1]
                r2.append(r3)
                r2.append(r4)
                boolean[] r3 = r0.mValueBoolean
                boolean r3 = r3[r1]
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                android.util.Log.v(r7, r2)
                int r1 = r1 + 1
                goto L8e
            Lb2:
                java.lang.String r0 = "DELTA IS NULL"
                android.util.Log.v(r7, r0)
            Lb7:
                return
        }
    }

    public static class Layout {
        private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
        private static final int BARRIER_DIRECTION = 72;
        private static final int BARRIER_MARGIN = 73;
        private static final int BASELINE_MARGIN = 80;
        private static final int BASELINE_TO_BASELINE = 1;
        private static final int BASELINE_TO_BOTTOM = 78;
        private static final int BASELINE_TO_TOP = 77;
        private static final int BOTTOM_MARGIN = 2;
        private static final int BOTTOM_TO_BOTTOM = 3;
        private static final int BOTTOM_TO_TOP = 4;
        private static final int CHAIN_USE_RTL = 71;
        private static final int CIRCLE = 61;
        private static final int CIRCLE_ANGLE = 63;
        private static final int CIRCLE_RADIUS = 62;
        private static final int CONSTRAINED_HEIGHT = 88;
        private static final int CONSTRAINED_WIDTH = 87;
        private static final int CONSTRAINT_REFERENCED_IDS = 74;
        private static final int CONSTRAINT_TAG = 89;
        private static final int DIMENSION_RATIO = 5;
        private static final int EDITOR_ABSOLUTE_X = 6;
        private static final int EDITOR_ABSOLUTE_Y = 7;
        private static final int END_MARGIN = 8;
        private static final int END_TO_END = 9;
        private static final int END_TO_START = 10;
        private static final int GONE_BASELINE_MARGIN = 79;
        private static final int GONE_BOTTOM_MARGIN = 11;
        private static final int GONE_END_MARGIN = 12;
        private static final int GONE_LEFT_MARGIN = 13;
        private static final int GONE_RIGHT_MARGIN = 14;
        private static final int GONE_START_MARGIN = 15;
        private static final int GONE_TOP_MARGIN = 16;
        private static final int GUIDE_BEGIN = 17;
        private static final int GUIDE_END = 18;
        private static final int GUIDE_PERCENT = 19;
        private static final int GUIDE_USE_RTL = 90;
        private static final int HEIGHT_DEFAULT = 82;
        private static final int HEIGHT_MAX = 83;
        private static final int HEIGHT_MIN = 85;
        private static final int HEIGHT_PERCENT = 70;
        private static final int HORIZONTAL_BIAS = 20;
        private static final int HORIZONTAL_STYLE = 39;
        private static final int HORIZONTAL_WEIGHT = 37;
        private static final int LAYOUT_CONSTRAINT_HEIGHT = 42;
        private static final int LAYOUT_CONSTRAINT_WIDTH = 41;
        private static final int LAYOUT_HEIGHT = 21;
        private static final int LAYOUT_WIDTH = 22;
        private static final int LAYOUT_WRAP_BEHAVIOR = 76;
        private static final int LEFT_MARGIN = 23;
        private static final int LEFT_TO_LEFT = 24;
        private static final int LEFT_TO_RIGHT = 25;
        private static final int ORIENTATION = 26;
        private static final int RIGHT_MARGIN = 27;
        private static final int RIGHT_TO_LEFT = 28;
        private static final int RIGHT_TO_RIGHT = 29;
        private static final int START_MARGIN = 30;
        private static final int START_TO_END = 31;
        private static final int START_TO_START = 32;
        private static final int TOP_MARGIN = 33;
        private static final int TOP_TO_BOTTOM = 34;
        private static final int TOP_TO_TOP = 35;
        public static final int UNSET = -1;
        public static final int UNSET_GONE_MARGIN = Integer.MIN_VALUE;
        private static final int UNUSED = 91;
        private static final int VERTICAL_BIAS = 36;
        private static final int VERTICAL_STYLE = 40;
        private static final int VERTICAL_WEIGHT = 38;
        private static final int WIDTH_DEFAULT = 81;
        private static final int WIDTH_MAX = 84;
        private static final int WIDTH_MIN = 86;
        private static final int WIDTH_PERCENT = 69;
        private static android.util.SparseIntArray mapToConstant;
        public int baselineMargin;
        public int baselineToBaseline;
        public int baselineToBottom;
        public int baselineToTop;
        public int bottomMargin;
        public int bottomToBottom;
        public int bottomToTop;
        public float circleAngle;
        public int circleConstraint;
        public int circleRadius;
        public boolean constrainedHeight;
        public boolean constrainedWidth;
        public java.lang.String dimensionRatio;
        public int editorAbsoluteX;
        public int editorAbsoluteY;
        public int endMargin;
        public int endToEnd;
        public int endToStart;
        public int goneBaselineMargin;
        public int goneBottomMargin;
        public int goneEndMargin;
        public int goneLeftMargin;
        public int goneRightMargin;
        public int goneStartMargin;
        public int goneTopMargin;
        public int guideBegin;
        public int guideEnd;
        public float guidePercent;
        public boolean guidelineUseRtl;
        public int heightDefault;
        public int heightMax;
        public int heightMin;
        public float heightPercent;
        public float horizontalBias;
        public int horizontalChainStyle;
        public float horizontalWeight;
        public int leftMargin;
        public int leftToLeft;
        public int leftToRight;
        public boolean mApply;
        public boolean mBarrierAllowsGoneWidgets;
        public int mBarrierDirection;
        public int mBarrierMargin;
        public java.lang.String mConstraintTag;
        public int mHeight;
        public int mHelperType;
        public boolean mIsGuideline;
        public boolean mOverride;
        public java.lang.String mReferenceIdString;
        public int[] mReferenceIds;
        public int mWidth;
        public int mWrapBehavior;
        public int orientation;
        public int rightMargin;
        public int rightToLeft;
        public int rightToRight;
        public int startMargin;
        public int startToEnd;
        public int startToStart;
        public int topMargin;
        public int topToBottom;
        public int topToTop;
        public float verticalBias;
        public int verticalChainStyle;
        public float verticalWeight;
        public int widthDefault;
        public int widthMax;
        public int widthMin;
        public float widthPercent;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant = r0
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintLeft_toLeftOf
                r2 = 24
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintLeft_toRightOf
                r2 = 25
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintRight_toLeftOf
                r2 = 28
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintRight_toRightOf
                r2 = 29
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintTop_toTopOf
                r2 = 35
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintTop_toBottomOf
                r2 = 34
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBottom_toTopOf
                r2 = 4
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBottom_toBottomOf
                r2 = 3
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBaseline_toBaselineOf
                r2 = 1
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_editor_absoluteX
                r2 = 6
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_editor_absoluteY
                r2 = 7
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintGuide_begin
                r2 = 17
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintGuide_end
                r2 = 18
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintGuide_percent
                r2 = 19
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_guidelineUseRtl
                r2 = 90
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_android_orientation
                r2 = 26
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintStart_toEndOf
                r2 = 31
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintStart_toStartOf
                r2 = 32
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintEnd_toStartOf
                r2 = 10
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintEnd_toEndOf
                r2 = 9
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginLeft
                r2 = 13
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginTop
                r2 = 16
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginRight
                r2 = 14
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginBottom
                r2 = 11
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginStart
                r2 = 15
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_goneMarginEnd
                r2 = 12
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintVertical_weight
                r2 = 38
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHorizontal_weight
                r2 = 37
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHorizontal_chainStyle
                r2 = 39
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintVertical_chainStyle
                r2 = 40
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHorizontal_bias
                r2 = 20
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintVertical_bias
                r2 = 36
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintDimensionRatio
                r2 = 5
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintLeft_creator
                r2 = 91
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintTop_creator
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintRight_creator
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBottom_creator
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintBaseline_creator
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginLeft
                r2 = 23
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginRight
                r2 = 27
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginStart
                r2 = 30
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginEnd
                r2 = 8
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginTop
                r2 = 33
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_android_layout_marginBottom
                r2 = 2
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_android_layout_width
                r2 = 22
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_android_layout_height
                r2 = 21
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintWidth
                r2 = 41
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHeight
                r3 = 42
                r0.append(r1, r3)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constrainedWidth
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constrainedHeight
                r0.append(r1, r3)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_wrapBehaviorInParent
                r2 = 76
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintCircle
                r2 = 61
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintCircleRadius
                r2 = 62
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintCircleAngle
                r2 = 63
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintWidth_percent
                r2 = 69
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_layout_constraintHeight_percent
                r2 = 70
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_chainUseRtl
                r2 = 71
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_barrierDirection
                r2 = 72
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_barrierMargin
                r2 = 73
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_constraint_referenced_ids
                r2 = 74
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Layout_barrierAllowsGoneWidgets
                r2 = 75
                r0.append(r1, r2)
                return
        }

        public Layout() {
                r5 = this;
                r5.<init>()
                r0 = 0
                r5.mIsGuideline = r0
                r5.mApply = r0
                r5.mOverride = r0
                r1 = -1
                r5.guideBegin = r1
                r5.guideEnd = r1
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                r5.guidePercent = r2
                r3 = 1
                r5.guidelineUseRtl = r3
                r5.leftToLeft = r1
                r5.leftToRight = r1
                r5.rightToLeft = r1
                r5.rightToRight = r1
                r5.topToTop = r1
                r5.topToBottom = r1
                r5.bottomToTop = r1
                r5.bottomToBottom = r1
                r5.baselineToBaseline = r1
                r5.baselineToTop = r1
                r5.baselineToBottom = r1
                r5.startToEnd = r1
                r5.startToStart = r1
                r5.endToStart = r1
                r5.endToEnd = r1
                r4 = 1056964608(0x3f000000, float:0.5)
                r5.horizontalBias = r4
                r5.verticalBias = r4
                r4 = 0
                r5.dimensionRatio = r4
                r5.circleConstraint = r1
                r5.circleRadius = r0
                r4 = 0
                r5.circleAngle = r4
                r5.editorAbsoluteX = r1
                r5.editorAbsoluteY = r1
                r5.orientation = r1
                r5.leftMargin = r0
                r5.rightMargin = r0
                r5.topMargin = r0
                r5.bottomMargin = r0
                r5.endMargin = r0
                r5.startMargin = r0
                r5.baselineMargin = r0
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5.goneLeftMargin = r4
                r5.goneTopMargin = r4
                r5.goneRightMargin = r4
                r5.goneBottomMargin = r4
                r5.goneEndMargin = r4
                r5.goneStartMargin = r4
                r5.goneBaselineMargin = r4
                r5.verticalWeight = r2
                r5.horizontalWeight = r2
                r5.horizontalChainStyle = r0
                r5.verticalChainStyle = r0
                r5.widthDefault = r0
                r5.heightDefault = r0
                r5.widthMax = r0
                r5.heightMax = r0
                r5.widthMin = r0
                r5.heightMin = r0
                r2 = 1065353216(0x3f800000, float:1.0)
                r5.widthPercent = r2
                r5.heightPercent = r2
                r5.mBarrierDirection = r1
                r5.mBarrierMargin = r0
                r5.mHelperType = r1
                r5.constrainedWidth = r0
                r5.constrainedHeight = r0
                r5.mBarrierAllowsGoneWidgets = r3
                r5.mWrapBehavior = r0
                return
        }

        public void copyFrom(androidx.constraintlayout.widget.ConstraintSet.Layout r3) {
                r2 = this;
                boolean r0 = r3.mIsGuideline
                r2.mIsGuideline = r0
                int r0 = r3.mWidth
                r2.mWidth = r0
                boolean r0 = r3.mApply
                r2.mApply = r0
                int r0 = r3.mHeight
                r2.mHeight = r0
                int r0 = r3.guideBegin
                r2.guideBegin = r0
                int r0 = r3.guideEnd
                r2.guideEnd = r0
                float r0 = r3.guidePercent
                r2.guidePercent = r0
                boolean r0 = r3.guidelineUseRtl
                r2.guidelineUseRtl = r0
                int r0 = r3.leftToLeft
                r2.leftToLeft = r0
                int r0 = r3.leftToRight
                r2.leftToRight = r0
                int r0 = r3.rightToLeft
                r2.rightToLeft = r0
                int r0 = r3.rightToRight
                r2.rightToRight = r0
                int r0 = r3.topToTop
                r2.topToTop = r0
                int r0 = r3.topToBottom
                r2.topToBottom = r0
                int r0 = r3.bottomToTop
                r2.bottomToTop = r0
                int r0 = r3.bottomToBottom
                r2.bottomToBottom = r0
                int r0 = r3.baselineToBaseline
                r2.baselineToBaseline = r0
                int r0 = r3.baselineToTop
                r2.baselineToTop = r0
                int r0 = r3.baselineToBottom
                r2.baselineToBottom = r0
                int r0 = r3.startToEnd
                r2.startToEnd = r0
                int r0 = r3.startToStart
                r2.startToStart = r0
                int r0 = r3.endToStart
                r2.endToStart = r0
                int r0 = r3.endToEnd
                r2.endToEnd = r0
                float r0 = r3.horizontalBias
                r2.horizontalBias = r0
                float r0 = r3.verticalBias
                r2.verticalBias = r0
                java.lang.String r0 = r3.dimensionRatio
                r2.dimensionRatio = r0
                int r0 = r3.circleConstraint
                r2.circleConstraint = r0
                int r0 = r3.circleRadius
                r2.circleRadius = r0
                float r0 = r3.circleAngle
                r2.circleAngle = r0
                int r0 = r3.editorAbsoluteX
                r2.editorAbsoluteX = r0
                int r0 = r3.editorAbsoluteY
                r2.editorAbsoluteY = r0
                int r0 = r3.orientation
                r2.orientation = r0
                int r0 = r3.leftMargin
                r2.leftMargin = r0
                int r0 = r3.rightMargin
                r2.rightMargin = r0
                int r0 = r3.topMargin
                r2.topMargin = r0
                int r0 = r3.bottomMargin
                r2.bottomMargin = r0
                int r0 = r3.endMargin
                r2.endMargin = r0
                int r0 = r3.startMargin
                r2.startMargin = r0
                int r0 = r3.baselineMargin
                r2.baselineMargin = r0
                int r0 = r3.goneLeftMargin
                r2.goneLeftMargin = r0
                int r0 = r3.goneTopMargin
                r2.goneTopMargin = r0
                int r0 = r3.goneRightMargin
                r2.goneRightMargin = r0
                int r0 = r3.goneBottomMargin
                r2.goneBottomMargin = r0
                int r0 = r3.goneEndMargin
                r2.goneEndMargin = r0
                int r0 = r3.goneStartMargin
                r2.goneStartMargin = r0
                int r0 = r3.goneBaselineMargin
                r2.goneBaselineMargin = r0
                float r0 = r3.verticalWeight
                r2.verticalWeight = r0
                float r0 = r3.horizontalWeight
                r2.horizontalWeight = r0
                int r0 = r3.horizontalChainStyle
                r2.horizontalChainStyle = r0
                int r0 = r3.verticalChainStyle
                r2.verticalChainStyle = r0
                int r0 = r3.widthDefault
                r2.widthDefault = r0
                int r0 = r3.heightDefault
                r2.heightDefault = r0
                int r0 = r3.widthMax
                r2.widthMax = r0
                int r0 = r3.heightMax
                r2.heightMax = r0
                int r0 = r3.widthMin
                r2.widthMin = r0
                int r0 = r3.heightMin
                r2.heightMin = r0
                float r0 = r3.widthPercent
                r2.widthPercent = r0
                float r0 = r3.heightPercent
                r2.heightPercent = r0
                int r0 = r3.mBarrierDirection
                r2.mBarrierDirection = r0
                int r0 = r3.mBarrierMargin
                r2.mBarrierMargin = r0
                int r0 = r3.mHelperType
                r2.mHelperType = r0
                java.lang.String r0 = r3.mConstraintTag
                r2.mConstraintTag = r0
                int[] r0 = r3.mReferenceIds
                if (r0 == 0) goto L108
                java.lang.String r1 = r3.mReferenceIdString
                if (r1 != 0) goto L108
                int r1 = r0.length
                int[] r0 = java.util.Arrays.copyOf(r0, r1)
                r2.mReferenceIds = r0
                goto L10b
            L108:
                r0 = 0
                r2.mReferenceIds = r0
            L10b:
                java.lang.String r0 = r3.mReferenceIdString
                r2.mReferenceIdString = r0
                boolean r0 = r3.constrainedWidth
                r2.constrainedWidth = r0
                boolean r0 = r3.constrainedHeight
                r2.constrainedHeight = r0
                boolean r0 = r3.mBarrierAllowsGoneWidgets
                r2.mBarrierAllowsGoneWidgets = r0
                int r3 = r3.mWrapBehavior
                r2.mWrapBehavior = r3
                return
        }

        public void dump(androidx.constraintlayout.motion.widget.MotionScene r10, java.lang.StringBuilder r11) {
                r9 = this;
                java.lang.Class r0 = r9.getClass()
                java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
                java.lang.String r1 = "\n"
                r11.append(r1)
                r1 = 0
            Le:
                int r2 = r0.length
                if (r1 >= r2) goto L80
                r2 = r0[r1]
                java.lang.String r3 = r2.getName()
                int r4 = r2.getModifiers()
                boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
                if (r4 == 0) goto L22
                goto L7d
            L22:
                java.lang.Object r4 = r2.get(r9)     // Catch: java.lang.IllegalAccessException -> L79
                java.lang.Class r2 = r2.getType()     // Catch: java.lang.IllegalAccessException -> L79
                java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.IllegalAccessException -> L79
                java.lang.String r6 = "\"\n"
                java.lang.String r7 = " = \""
                java.lang.String r8 = "    "
                if (r2 != r5) goto L59
                java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.IllegalAccessException -> L79
                int r2 = r4.intValue()     // Catch: java.lang.IllegalAccessException -> L79
                r5 = -1
                if (r2 == r5) goto L7d
                int r2 = r4.intValue()     // Catch: java.lang.IllegalAccessException -> L79
                java.lang.String r2 = r10.lookUpConstraintName(r2)     // Catch: java.lang.IllegalAccessException -> L79
                r11.append(r8)     // Catch: java.lang.IllegalAccessException -> L79
                r11.append(r3)     // Catch: java.lang.IllegalAccessException -> L79
                r11.append(r7)     // Catch: java.lang.IllegalAccessException -> L79
                if (r2 != 0) goto L51
                goto L52
            L51:
                r4 = r2
            L52:
                r11.append(r4)     // Catch: java.lang.IllegalAccessException -> L79
                r11.append(r6)     // Catch: java.lang.IllegalAccessException -> L79
                goto L7d
            L59:
                java.lang.Class r5 = java.lang.Float.TYPE     // Catch: java.lang.IllegalAccessException -> L79
                if (r2 != r5) goto L7d
                java.lang.Float r4 = (java.lang.Float) r4     // Catch: java.lang.IllegalAccessException -> L79
                float r2 = r4.floatValue()     // Catch: java.lang.IllegalAccessException -> L79
                r5 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r2 == 0) goto L7d
                r11.append(r8)     // Catch: java.lang.IllegalAccessException -> L79
                r11.append(r3)     // Catch: java.lang.IllegalAccessException -> L79
                r11.append(r7)     // Catch: java.lang.IllegalAccessException -> L79
                r11.append(r4)     // Catch: java.lang.IllegalAccessException -> L79
                r11.append(r6)     // Catch: java.lang.IllegalAccessException -> L79
                goto L7d
            L79:
                r2 = move-exception
                r2.printStackTrace()
            L7d:
                int r1 = r1 + 1
                goto Le
            L80:
                return
        }

        public final void fillFromAttributeList(android.content.Context r9, android.util.AttributeSet r10) {
                r8 = this;
                int[] r0 = androidx.constraintlayout.widget.R.styleable.Layout
                android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r10, r0)
                r10 = 1
                r8.mApply = r10
                int r0 = r9.getIndexCount()
                r1 = 0
                r2 = 0
            Lf:
                if (r2 >= r0) goto L2ec
                int r3 = r9.getIndex(r2)
                android.util.SparseIntArray r4 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r4 = r4.get(r3)
                switch(r4) {
                    case 1: goto L1da;
                    case 2: goto L1d0;
                    case 3: goto L1c6;
                    case 4: goto L1bc;
                    case 5: goto L1b4;
                    case 6: goto L1aa;
                    case 7: goto L1a0;
                    case 8: goto L196;
                    case 9: goto L18c;
                    case 10: goto L182;
                    case 11: goto L178;
                    case 12: goto L16e;
                    case 13: goto L164;
                    case 14: goto L15a;
                    case 15: goto L150;
                    case 16: goto L146;
                    case 17: goto L13c;
                    case 18: goto L132;
                    case 19: goto L128;
                    case 20: goto L11e;
                    case 21: goto L114;
                    case 22: goto L10a;
                    case 23: goto L100;
                    case 24: goto Lf6;
                    case 25: goto Lec;
                    case 26: goto Le2;
                    case 27: goto Ld8;
                    case 28: goto Lce;
                    case 29: goto Lc4;
                    case 30: goto Lba;
                    case 31: goto Lb0;
                    case 32: goto La6;
                    case 33: goto L9c;
                    case 34: goto L92;
                    case 35: goto L88;
                    case 36: goto L7e;
                    case 37: goto L74;
                    case 38: goto L6a;
                    case 39: goto L60;
                    case 40: goto L56;
                    case 41: goto L51;
                    case 42: goto L4c;
                    default: goto L1e;
                }
            L1e:
                switch(r4) {
                    case 61: goto L1f8;
                    case 62: goto L1ee;
                    case 63: goto L1e4;
                    default: goto L21;
                }
            L21:
                r5 = 1065353216(0x3f800000, float:1.0)
                java.lang.String r6 = "   "
                java.lang.String r7 = "ConstraintSet"
                switch(r4) {
                    case 69: goto L2e2;
                    case 70: goto L2db;
                    case 71: goto L2d5;
                    case 72: goto L2cc;
                    case 73: goto L2c3;
                    case 74: goto L2bc;
                    case 75: goto L2b3;
                    case 76: goto L2aa;
                    case 77: goto L2a1;
                    case 78: goto L298;
                    case 79: goto L28f;
                    case 80: goto L286;
                    case 81: goto L27d;
                    case 82: goto L273;
                    case 83: goto L269;
                    case 84: goto L25f;
                    case 85: goto L255;
                    case 86: goto L24b;
                    case 87: goto L241;
                    case 88: goto L237;
                    case 89: goto L22f;
                    case 90: goto L225;
                    case 91: goto L202;
                    default: goto L2a;
                }
            L2a:
                java.lang.String r4 = "Unknown attribute 0x"
                java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
                java.lang.String r5 = java.lang.Integer.toHexString(r3)
                r4.append(r5)
                r4.append(r6)
                android.util.SparseIntArray r5 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r3 = r5.get(r3)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                android.util.Log.w(r7, r3)
                goto L2e8
            L4c:
                androidx.constraintlayout.widget.ConstraintSet.parseDimensionConstraints(r8, r9, r3, r10)
                goto L2e8
            L51:
                androidx.constraintlayout.widget.ConstraintSet.parseDimensionConstraints(r8, r9, r3, r1)
                goto L2e8
            L56:
                int r4 = r8.verticalChainStyle
                int r3 = r9.getInt(r3, r4)
                r8.verticalChainStyle = r3
                goto L2e8
            L60:
                int r4 = r8.horizontalChainStyle
                int r3 = r9.getInt(r3, r4)
                r8.horizontalChainStyle = r3
                goto L2e8
            L6a:
                float r4 = r8.verticalWeight
                float r3 = r9.getFloat(r3, r4)
                r8.verticalWeight = r3
                goto L2e8
            L74:
                float r4 = r8.horizontalWeight
                float r3 = r9.getFloat(r3, r4)
                r8.horizontalWeight = r3
                goto L2e8
            L7e:
                float r4 = r8.verticalBias
                float r3 = r9.getFloat(r3, r4)
                r8.verticalBias = r3
                goto L2e8
            L88:
                int r4 = r8.topToTop
                int r3 = androidx.constraintlayout.widget.ConstraintSet.access$100(r9, r3, r4)
                r8.topToTop = r3
                goto L2e8
            L92:
                int r4 = r8.topToBottom
                int r3 = androidx.constraintlayout.widget.ConstraintSet.access$100(r9, r3, r4)
                r8.topToBottom = r3
                goto L2e8
            L9c:
                int r4 = r8.topMargin
                int r3 = r9.getDimensionPixelSize(r3, r4)
                r8.topMargin = r3
                goto L2e8
            La6:
                int r4 = r8.startToStart
                int r3 = androidx.constraintlayout.widget.ConstraintSet.access$100(r9, r3, r4)
                r8.startToStart = r3
                goto L2e8
            Lb0:
                int r4 = r8.startToEnd
                int r3 = androidx.constraintlayout.widget.ConstraintSet.access$100(r9, r3, r4)
                r8.startToEnd = r3
                goto L2e8
            Lba:
                int r4 = r8.startMargin
                int r3 = r9.getDimensionPixelSize(r3, r4)
                r8.startMargin = r3
                goto L2e8
            Lc4:
                int r4 = r8.rightToRight
                int r3 = androidx.constraintlayout.widget.ConstraintSet.access$100(r9, r3, r4)
                r8.rightToRight = r3
                goto L2e8
            Lce:
                int r4 = r8.rightToLeft
                int r3 = androidx.constraintlayout.widget.ConstraintSet.access$100(r9, r3, r4)
                r8.rightToLeft = r3
                goto L2e8
            Ld8:
                int r4 = r8.rightMargin
                int r3 = r9.getDimensionPixelSize(r3, r4)
                r8.rightMargin = r3
                goto L2e8
            Le2:
                int r4 = r8.orientation
                int r3 = r9.getInt(r3, r4)
                r8.orientation = r3
                goto L2e8
            Lec:
                int r4 = r8.leftToRight
                int r3 = androidx.constraintlayout.widget.ConstraintSet.access$100(r9, r3, r4)
                r8.leftToRight = r3
                goto L2e8
            Lf6:
                int r4 = r8.leftToLeft
                int r3 = androidx.constraintlayout.widget.ConstraintSet.access$100(r9, r3, r4)
                r8.leftToLeft = r3
                goto L2e8
            L100:
                int r4 = r8.leftMargin
                int r3 = r9.getDimensionPixelSize(r3, r4)
                r8.leftMargin = r3
                goto L2e8
            L10a:
                int r4 = r8.mWidth
                int r3 = r9.getLayoutDimension(r3, r4)
                r8.mWidth = r3
                goto L2e8
            L114:
                int r4 = r8.mHeight
                int r3 = r9.getLayoutDimension(r3, r4)
                r8.mHeight = r3
                goto L2e8
            L11e:
                float r4 = r8.horizontalBias
                float r3 = r9.getFloat(r3, r4)
                r8.horizontalBias = r3
                goto L2e8
            L128:
                float r4 = r8.guidePercent
                float r3 = r9.getFloat(r3, r4)
                r8.guidePercent = r3
                goto L2e8
            L132:
                int r4 = r8.guideEnd
                int r3 = r9.getDimensionPixelOffset(r3, r4)
                r8.guideEnd = r3
                goto L2e8
            L13c:
                int r4 = r8.guideBegin
                int r3 = r9.getDimensionPixelOffset(r3, r4)
                r8.guideBegin = r3
                goto L2e8
            L146:
                int r4 = r8.goneTopMargin
                int r3 = r9.getDimensionPixelSize(r3, r4)
                r8.goneTopMargin = r3
                goto L2e8
            L150:
                int r4 = r8.goneStartMargin
                int r3 = r9.getDimensionPixelSize(r3, r4)
                r8.goneStartMargin = r3
                goto L2e8
            L15a:
                int r4 = r8.goneRightMargin
                int r3 = r9.getDimensionPixelSize(r3, r4)
                r8.goneRightMargin = r3
                goto L2e8
            L164:
                int r4 = r8.goneLeftMargin
                int r3 = r9.getDimensionPixelSize(r3, r4)
                r8.goneLeftMargin = r3
                goto L2e8
            L16e:
                int r4 = r8.goneEndMargin
                int r3 = r9.getDimensionPixelSize(r3, r4)
                r8.goneEndMargin = r3
                goto L2e8
            L178:
                int r4 = r8.goneBottomMargin
                int r3 = r9.getDimensionPixelSize(r3, r4)
                r8.goneBottomMargin = r3
                goto L2e8
            L182:
                int r4 = r8.endToStart
                int r3 = androidx.constraintlayout.widget.ConstraintSet.access$100(r9, r3, r4)
                r8.endToStart = r3
                goto L2e8
            L18c:
                int r4 = r8.endToEnd
                int r3 = androidx.constraintlayout.widget.ConstraintSet.access$100(r9, r3, r4)
                r8.endToEnd = r3
                goto L2e8
            L196:
                int r4 = r8.endMargin
                int r3 = r9.getDimensionPixelSize(r3, r4)
                r8.endMargin = r3
                goto L2e8
            L1a0:
                int r4 = r8.editorAbsoluteY
                int r3 = r9.getDimensionPixelOffset(r3, r4)
                r8.editorAbsoluteY = r3
                goto L2e8
            L1aa:
                int r4 = r8.editorAbsoluteX
                int r3 = r9.getDimensionPixelOffset(r3, r4)
                r8.editorAbsoluteX = r3
                goto L2e8
            L1b4:
                java.lang.String r3 = r9.getString(r3)
                r8.dimensionRatio = r3
                goto L2e8
            L1bc:
                int r4 = r8.bottomToTop
                int r3 = androidx.constraintlayout.widget.ConstraintSet.access$100(r9, r3, r4)
                r8.bottomToTop = r3
                goto L2e8
            L1c6:
                int r4 = r8.bottomToBottom
                int r3 = androidx.constraintlayout.widget.ConstraintSet.access$100(r9, r3, r4)
                r8.bottomToBottom = r3
                goto L2e8
            L1d0:
                int r4 = r8.bottomMargin
                int r3 = r9.getDimensionPixelSize(r3, r4)
                r8.bottomMargin = r3
                goto L2e8
            L1da:
                int r4 = r8.baselineToBaseline
                int r3 = androidx.constraintlayout.widget.ConstraintSet.access$100(r9, r3, r4)
                r8.baselineToBaseline = r3
                goto L2e8
            L1e4:
                float r4 = r8.circleAngle
                float r3 = r9.getFloat(r3, r4)
                r8.circleAngle = r3
                goto L2e8
            L1ee:
                int r4 = r8.circleRadius
                int r3 = r9.getDimensionPixelSize(r3, r4)
                r8.circleRadius = r3
                goto L2e8
            L1f8:
                int r4 = r8.circleConstraint
                int r3 = androidx.constraintlayout.widget.ConstraintSet.access$100(r9, r3, r4)
                r8.circleConstraint = r3
                goto L2e8
            L202:
                java.lang.String r4 = "unused attribute 0x"
                java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
                java.lang.String r5 = java.lang.Integer.toHexString(r3)
                r4.append(r5)
                r4.append(r6)
                android.util.SparseIntArray r5 = androidx.constraintlayout.widget.ConstraintSet.Layout.mapToConstant
                int r3 = r5.get(r3)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                android.util.Log.w(r7, r3)
                goto L2e8
            L225:
                boolean r4 = r8.guidelineUseRtl
                boolean r3 = r9.getBoolean(r3, r4)
                r8.guidelineUseRtl = r3
                goto L2e8
            L22f:
                java.lang.String r3 = r9.getString(r3)
                r8.mConstraintTag = r3
                goto L2e8
            L237:
                boolean r4 = r8.constrainedHeight
                boolean r3 = r9.getBoolean(r3, r4)
                r8.constrainedHeight = r3
                goto L2e8
            L241:
                boolean r4 = r8.constrainedWidth
                boolean r3 = r9.getBoolean(r3, r4)
                r8.constrainedWidth = r3
                goto L2e8
            L24b:
                int r4 = r8.widthMin
                int r3 = r9.getDimensionPixelSize(r3, r4)
                r8.widthMin = r3
                goto L2e8
            L255:
                int r4 = r8.heightMin
                int r3 = r9.getDimensionPixelSize(r3, r4)
                r8.heightMin = r3
                goto L2e8
            L25f:
                int r4 = r8.widthMax
                int r3 = r9.getDimensionPixelSize(r3, r4)
                r8.widthMax = r3
                goto L2e8
            L269:
                int r4 = r8.heightMax
                int r3 = r9.getDimensionPixelSize(r3, r4)
                r8.heightMax = r3
                goto L2e8
            L273:
                int r4 = r8.heightDefault
                int r3 = r9.getInt(r3, r4)
                r8.heightDefault = r3
                goto L2e8
            L27d:
                int r4 = r8.widthDefault
                int r3 = r9.getInt(r3, r4)
                r8.widthDefault = r3
                goto L2e8
            L286:
                int r4 = r8.baselineMargin
                int r3 = r9.getDimensionPixelSize(r3, r4)
                r8.baselineMargin = r3
                goto L2e8
            L28f:
                int r4 = r8.goneBaselineMargin
                int r3 = r9.getDimensionPixelSize(r3, r4)
                r8.goneBaselineMargin = r3
                goto L2e8
            L298:
                int r4 = r8.baselineToBottom
                int r3 = androidx.constraintlayout.widget.ConstraintSet.access$100(r9, r3, r4)
                r8.baselineToBottom = r3
                goto L2e8
            L2a1:
                int r4 = r8.baselineToTop
                int r3 = androidx.constraintlayout.widget.ConstraintSet.access$100(r9, r3, r4)
                r8.baselineToTop = r3
                goto L2e8
            L2aa:
                int r4 = r8.mWrapBehavior
                int r3 = r9.getInt(r3, r4)
                r8.mWrapBehavior = r3
                goto L2e8
            L2b3:
                boolean r4 = r8.mBarrierAllowsGoneWidgets
                boolean r3 = r9.getBoolean(r3, r4)
                r8.mBarrierAllowsGoneWidgets = r3
                goto L2e8
            L2bc:
                java.lang.String r3 = r9.getString(r3)
                r8.mReferenceIdString = r3
                goto L2e8
            L2c3:
                int r4 = r8.mBarrierMargin
                int r3 = r9.getDimensionPixelSize(r3, r4)
                r8.mBarrierMargin = r3
                goto L2e8
            L2cc:
                int r4 = r8.mBarrierDirection
                int r3 = r9.getInt(r3, r4)
                r8.mBarrierDirection = r3
                goto L2e8
            L2d5:
                java.lang.String r3 = "CURRENTLY UNSUPPORTED"
                android.util.Log.e(r7, r3)
                goto L2e8
            L2db:
                float r3 = r9.getFloat(r3, r5)
                r8.heightPercent = r3
                goto L2e8
            L2e2:
                float r3 = r9.getFloat(r3, r5)
                r8.widthPercent = r3
            L2e8:
                int r2 = r2 + 1
                goto Lf
            L2ec:
                r9.recycle()
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class Motion {
        private static final int ANIMATE_CIRCLE_ANGLE_TO = 6;
        private static final int ANIMATE_RELATIVE_TO = 5;
        private static final int INTERPOLATOR_REFERENCE_ID = -2;
        private static final int INTERPOLATOR_UNDEFINED = -3;
        private static final int MOTION_DRAW_PATH = 4;
        private static final int MOTION_STAGGER = 7;
        private static final int PATH_MOTION_ARC = 2;
        private static final int QUANTIZE_MOTION_INTERPOLATOR = 10;
        private static final int QUANTIZE_MOTION_PHASE = 9;
        private static final int QUANTIZE_MOTION_STEPS = 8;
        private static final int SPLINE_STRING = -1;
        private static final int TRANSITION_EASING = 3;
        private static final int TRANSITION_PATH_ROTATE = 1;
        private static android.util.SparseIntArray mapToConstant;
        public int mAnimateCircleAngleTo;
        public int mAnimateRelativeTo;
        public boolean mApply;
        public int mDrawPath;
        public float mMotionStagger;
        public int mPathMotionArc;
        public float mPathRotate;
        public int mPolarRelativeTo;
        public int mQuantizeInterpolatorID;
        public java.lang.String mQuantizeInterpolatorString;
        public int mQuantizeInterpolatorType;
        public float mQuantizeMotionPhase;
        public int mQuantizeMotionSteps;
        public java.lang.String mTransitionEasing;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                androidx.constraintlayout.widget.ConstraintSet.Motion.mapToConstant = r0
                int r1 = androidx.constraintlayout.widget.R.styleable.Motion_motionPathRotate
                r2 = 1
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Motion.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Motion_pathMotionArc
                r2 = 2
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Motion.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Motion_transitionEasing
                r2 = 3
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Motion.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Motion_drawPath
                r2 = 4
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Motion.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Motion_animateRelativeTo
                r2 = 5
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Motion.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Motion_animateCircleAngleTo
                r2 = 6
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Motion.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Motion_motionStagger
                r2 = 7
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Motion.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Motion_quantizeMotionSteps
                r2 = 8
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Motion.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Motion_quantizeMotionPhase
                r2 = 9
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Motion.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Motion_quantizeMotionInterpolator
                r2 = 10
                r0.append(r1, r2)
                return
        }

        public Motion() {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.mApply = r0
                r1 = -1
                r3.mAnimateRelativeTo = r1
                r3.mAnimateCircleAngleTo = r0
                r2 = 0
                r3.mTransitionEasing = r2
                r3.mPathMotionArc = r1
                r3.mDrawPath = r0
                r0 = 2143289344(0x7fc00000, float:NaN)
                r3.mMotionStagger = r0
                r3.mPolarRelativeTo = r1
                r3.mPathRotate = r0
                r3.mQuantizeMotionPhase = r0
                r3.mQuantizeMotionSteps = r1
                r3.mQuantizeInterpolatorString = r2
                r0 = -3
                r3.mQuantizeInterpolatorType = r0
                r3.mQuantizeInterpolatorID = r1
                return
        }

        public void copyFrom(androidx.constraintlayout.widget.ConstraintSet.Motion r2) {
                r1 = this;
                boolean r0 = r2.mApply
                r1.mApply = r0
                int r0 = r2.mAnimateRelativeTo
                r1.mAnimateRelativeTo = r0
                java.lang.String r0 = r2.mTransitionEasing
                r1.mTransitionEasing = r0
                int r0 = r2.mPathMotionArc
                r1.mPathMotionArc = r0
                int r0 = r2.mDrawPath
                r1.mDrawPath = r0
                float r0 = r2.mPathRotate
                r1.mPathRotate = r0
                float r0 = r2.mMotionStagger
                r1.mMotionStagger = r0
                int r2 = r2.mPolarRelativeTo
                r1.mPolarRelativeTo = r2
                return
        }

        public final void fillFromAttributeList(android.content.Context r9, android.util.AttributeSet r10) {
                r8 = this;
                int[] r0 = androidx.constraintlayout.widget.R.styleable.Motion
                android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r10, r0)
                r10 = 1
                r8.mApply = r10
                int r0 = r9.getIndexCount()
                r1 = 0
                r2 = 0
            Lf:
                if (r2 >= r0) goto Lc1
                int r3 = r9.getIndex(r2)
                android.util.SparseIntArray r4 = androidx.constraintlayout.widget.ConstraintSet.Motion.mapToConstant
                int r4 = r4.get(r3)
                r5 = 3
                switch(r4) {
                    case 1: goto Lb5;
                    case 2: goto Lac;
                    case 3: goto L92;
                    case 4: goto L8b;
                    case 5: goto L82;
                    case 6: goto L79;
                    case 7: goto L70;
                    case 8: goto L67;
                    case 9: goto L5e;
                    case 10: goto L21;
                    default: goto L1f;
                }
            L1f:
                goto Lbd
            L21:
                android.util.TypedValue r4 = r9.peekValue(r3)
                int r4 = r4.type
                r6 = -2
                r7 = -1
                if (r4 != r10) goto L37
                int r3 = r9.getResourceId(r3, r7)
                r8.mQuantizeInterpolatorID = r3
                if (r3 == r7) goto Lbd
                r8.mQuantizeInterpolatorType = r6
                goto Lbd
            L37:
                if (r4 != r5) goto L55
                java.lang.String r4 = r9.getString(r3)
                r8.mQuantizeInterpolatorString = r4
                java.lang.String r5 = "/"
                int r4 = r4.indexOf(r5)
                if (r4 <= 0) goto L51
                int r3 = r9.getResourceId(r3, r7)
                r8.mQuantizeInterpolatorID = r3
                r8.mQuantizeInterpolatorType = r6
                goto Lbd
            L51:
                r8.mQuantizeInterpolatorType = r7
                goto Lbd
            L55:
                int r4 = r8.mQuantizeInterpolatorID
                int r3 = r9.getInteger(r3, r4)
                r8.mQuantizeInterpolatorType = r3
                goto Lbd
            L5e:
                float r4 = r8.mQuantizeMotionPhase
                float r3 = r9.getFloat(r3, r4)
                r8.mQuantizeMotionPhase = r3
                goto Lbd
            L67:
                int r4 = r8.mQuantizeMotionSteps
                int r3 = r9.getInteger(r3, r4)
                r8.mQuantizeMotionSteps = r3
                goto Lbd
            L70:
                float r4 = r8.mMotionStagger
                float r3 = r9.getFloat(r3, r4)
                r8.mMotionStagger = r3
                goto Lbd
            L79:
                int r4 = r8.mAnimateCircleAngleTo
                int r3 = r9.getInteger(r3, r4)
                r8.mAnimateCircleAngleTo = r3
                goto Lbd
            L82:
                int r4 = r8.mAnimateRelativeTo
                int r3 = androidx.constraintlayout.widget.ConstraintSet.access$100(r9, r3, r4)
                r8.mAnimateRelativeTo = r3
                goto Lbd
            L8b:
                int r3 = r9.getInt(r3, r1)
                r8.mDrawPath = r3
                goto Lbd
            L92:
                android.util.TypedValue r4 = r9.peekValue(r3)
                int r4 = r4.type
                if (r4 != r5) goto La1
                java.lang.String r3 = r9.getString(r3)
                r8.mTransitionEasing = r3
                goto Lbd
            La1:
                java.lang.String[] r4 = androidx.constraintlayout.core.motion.utils.Easing.NAMED_EASING
                int r3 = r9.getInteger(r3, r1)
                r3 = r4[r3]
                r8.mTransitionEasing = r3
                goto Lbd
            Lac:
                int r4 = r8.mPathMotionArc
                int r3 = r9.getInt(r3, r4)
                r8.mPathMotionArc = r3
                goto Lbd
            Lb5:
                float r4 = r8.mPathRotate
                float r3 = r9.getFloat(r3, r4)
                r8.mPathRotate = r3
            Lbd:
                int r2 = r2 + 1
                goto Lf
            Lc1:
                r9.recycle()
                return
        }
    }

    public static class PropertySet {
        public float alpha;
        public boolean mApply;
        public float mProgress;
        public int mVisibilityMode;
        public int visibility;

        public PropertySet() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mApply = r0
                r1.visibility = r0
                r1.mVisibilityMode = r0
                r0 = 1065353216(0x3f800000, float:1.0)
                r1.alpha = r0
                r0 = 2143289344(0x7fc00000, float:NaN)
                r1.mProgress = r0
                return
        }

        public void copyFrom(androidx.constraintlayout.widget.ConstraintSet.PropertySet r2) {
                r1 = this;
                boolean r0 = r2.mApply
                r1.mApply = r0
                int r0 = r2.visibility
                r1.visibility = r0
                float r0 = r2.alpha
                r1.alpha = r0
                float r0 = r2.mProgress
                r1.mProgress = r0
                int r2 = r2.mVisibilityMode
                r1.mVisibilityMode = r2
                return
        }

        public final void fillFromAttributeList(android.content.Context r4, android.util.AttributeSet r5) {
                r3 = this;
                int[] r0 = androidx.constraintlayout.widget.R.styleable.PropertySet
                android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0)
                r5 = 1
                r3.mApply = r5
                int r5 = r4.getIndexCount()
                r0 = 0
            Le:
                if (r0 >= r5) goto L54
                int r1 = r4.getIndex(r0)
                int r2 = androidx.constraintlayout.widget.R.styleable.PropertySet_android_alpha
                if (r1 != r2) goto L21
                float r2 = r3.alpha
                float r1 = r4.getFloat(r1, r2)
                r3.alpha = r1
                goto L51
            L21:
                int r2 = androidx.constraintlayout.widget.R.styleable.PropertySet_android_visibility
                if (r1 != r2) goto L38
                int r2 = r3.visibility
                int r1 = r4.getInt(r1, r2)
                r3.visibility = r1
                int[] r1 = androidx.constraintlayout.widget.ConstraintSet.access$200()
                int r2 = r3.visibility
                r1 = r1[r2]
                r3.visibility = r1
                goto L51
            L38:
                int r2 = androidx.constraintlayout.widget.R.styleable.PropertySet_visibilityMode
                if (r1 != r2) goto L45
                int r2 = r3.mVisibilityMode
                int r1 = r4.getInt(r1, r2)
                r3.mVisibilityMode = r1
                goto L51
            L45:
                int r2 = androidx.constraintlayout.widget.R.styleable.PropertySet_motionProgress
                if (r1 != r2) goto L51
                float r2 = r3.mProgress
                float r1 = r4.getFloat(r1, r2)
                r3.mProgress = r1
            L51:
                int r0 = r0 + 1
                goto Le
            L54:
                r4.recycle()
                return
        }
    }

    public static class Transform {
        private static final int ELEVATION = 11;
        private static final int ROTATION = 1;
        private static final int ROTATION_X = 2;
        private static final int ROTATION_Y = 3;
        private static final int SCALE_X = 4;
        private static final int SCALE_Y = 5;
        private static final int TRANSFORM_PIVOT_TARGET = 12;
        private static final int TRANSFORM_PIVOT_X = 6;
        private static final int TRANSFORM_PIVOT_Y = 7;
        private static final int TRANSLATION_X = 8;
        private static final int TRANSLATION_Y = 9;
        private static final int TRANSLATION_Z = 10;
        private static android.util.SparseIntArray mapToConstant;
        public boolean applyElevation;
        public float elevation;
        public boolean mApply;
        public float rotation;
        public float rotationX;
        public float rotationY;
        public float scaleX;
        public float scaleY;
        public int transformPivotTarget;
        public float transformPivotX;
        public float transformPivotY;
        public float translationX;
        public float translationY;
        public float translationZ;

        static {
                android.util.SparseIntArray r0 = new android.util.SparseIntArray
                r0.<init>()
                androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant = r0
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_android_rotation
                r2 = 1
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_android_rotationX
                r2 = 2
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_android_rotationY
                r2 = 3
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_android_scaleX
                r2 = 4
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_android_scaleY
                r2 = 5
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_android_transformPivotX
                r2 = 6
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_android_transformPivotY
                r2 = 7
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_android_translationX
                r2 = 8
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_android_translationY
                r2 = 9
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_android_translationZ
                r2 = 10
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_android_elevation
                r2 = 11
                r0.append(r1, r2)
                android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r1 = androidx.constraintlayout.widget.R.styleable.Transform_transformPivotTarget
                r2 = 12
                r0.append(r1, r2)
                return
        }

        public Transform() {
                r3 = this;
                r3.<init>()
                r0 = 0
                r3.mApply = r0
                r1 = 0
                r3.rotation = r1
                r3.rotationX = r1
                r3.rotationY = r1
                r2 = 1065353216(0x3f800000, float:1.0)
                r3.scaleX = r2
                r3.scaleY = r2
                r2 = 2143289344(0x7fc00000, float:NaN)
                r3.transformPivotX = r2
                r3.transformPivotY = r2
                r2 = -1
                r3.transformPivotTarget = r2
                r3.translationX = r1
                r3.translationY = r1
                r3.translationZ = r1
                r3.applyElevation = r0
                r3.elevation = r1
                return
        }

        public void copyFrom(androidx.constraintlayout.widget.ConstraintSet.Transform r2) {
                r1 = this;
                boolean r0 = r2.mApply
                r1.mApply = r0
                float r0 = r2.rotation
                r1.rotation = r0
                float r0 = r2.rotationX
                r1.rotationX = r0
                float r0 = r2.rotationY
                r1.rotationY = r0
                float r0 = r2.scaleX
                r1.scaleX = r0
                float r0 = r2.scaleY
                r1.scaleY = r0
                float r0 = r2.transformPivotX
                r1.transformPivotX = r0
                float r0 = r2.transformPivotY
                r1.transformPivotY = r0
                int r0 = r2.transformPivotTarget
                r1.transformPivotTarget = r0
                float r0 = r2.translationX
                r1.translationX = r0
                float r0 = r2.translationY
                r1.translationY = r0
                float r0 = r2.translationZ
                r1.translationZ = r0
                boolean r0 = r2.applyElevation
                r1.applyElevation = r0
                float r2 = r2.elevation
                r1.elevation = r2
                return
        }

        public final void fillFromAttributeList(android.content.Context r5, android.util.AttributeSet r6) {
                r4 = this;
                int[] r0 = androidx.constraintlayout.widget.R.styleable.Transform
                android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r0)
                r6 = 1
                r4.mApply = r6
                int r0 = r5.getIndexCount()
                r1 = 0
            Le:
                if (r1 >= r0) goto L90
                int r2 = r5.getIndex(r1)
                android.util.SparseIntArray r3 = androidx.constraintlayout.widget.ConstraintSet.Transform.mapToConstant
                int r3 = r3.get(r2)
                switch(r3) {
                    case 1: goto L84;
                    case 2: goto L7b;
                    case 3: goto L72;
                    case 4: goto L69;
                    case 5: goto L60;
                    case 6: goto L57;
                    case 7: goto L4e;
                    case 8: goto L45;
                    case 9: goto L3c;
                    case 10: goto L33;
                    case 11: goto L28;
                    case 12: goto L1f;
                    default: goto L1d;
                }
            L1d:
                goto L8c
            L1f:
                int r3 = r4.transformPivotTarget
                int r2 = androidx.constraintlayout.widget.ConstraintSet.access$100(r5, r2, r3)
                r4.transformPivotTarget = r2
                goto L8c
            L28:
                r4.applyElevation = r6
                float r3 = r4.elevation
                float r2 = r5.getDimension(r2, r3)
                r4.elevation = r2
                goto L8c
            L33:
                float r3 = r4.translationZ
                float r2 = r5.getDimension(r2, r3)
                r4.translationZ = r2
                goto L8c
            L3c:
                float r3 = r4.translationY
                float r2 = r5.getDimension(r2, r3)
                r4.translationY = r2
                goto L8c
            L45:
                float r3 = r4.translationX
                float r2 = r5.getDimension(r2, r3)
                r4.translationX = r2
                goto L8c
            L4e:
                float r3 = r4.transformPivotY
                float r2 = r5.getDimension(r2, r3)
                r4.transformPivotY = r2
                goto L8c
            L57:
                float r3 = r4.transformPivotX
                float r2 = r5.getDimension(r2, r3)
                r4.transformPivotX = r2
                goto L8c
            L60:
                float r3 = r4.scaleY
                float r2 = r5.getFloat(r2, r3)
                r4.scaleY = r2
                goto L8c
            L69:
                float r3 = r4.scaleX
                float r2 = r5.getFloat(r2, r3)
                r4.scaleX = r2
                goto L8c
            L72:
                float r3 = r4.rotationY
                float r2 = r5.getFloat(r2, r3)
                r4.rotationY = r2
                goto L8c
            L7b:
                float r3 = r4.rotationX
                float r2 = r5.getFloat(r2, r3)
                r4.rotationX = r2
                goto L8c
            L84:
                float r3 = r4.rotation
                float r2 = r5.getFloat(r2, r3)
                r4.rotation = r2
            L8c:
                int r1 = r1 + 1
                goto Le
            L90:
                r5.recycle()
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class WriteJsonEngine {
        private static final java.lang.String SPACE = "       ";
        public android.content.Context context;
        public java.util.HashMap<java.lang.Integer, java.lang.String> idMap;
        public final /* synthetic */ androidx.constraintlayout.widget.ConstraintSet this$0;
        public int unknownCount;
        public java.io.Writer writer;

        public WriteJsonEngine(androidx.constraintlayout.widget.ConstraintSet r1, java.io.Writer r2, androidx.constraintlayout.widget.ConstraintLayout r3) throws java.io.IOException {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 0
                r0.unknownCount = r1
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.idMap = r1
                r0.writer = r2
                android.content.Context r1 = r3.getContext()
                r0.context = r1
                return
        }

        private void writeDimension(java.lang.String r4, int r5, int r6, float r7, int r8, int r9, boolean r10) throws java.io.IOException {
                r3 = this;
                r10 = -1
                java.lang.String r0 = "       "
                if (r5 != 0) goto Ld4
                r5 = 2
                r1 = 1
                if (r9 != r10) goto L4e
                if (r8 == r10) goto Lc
                goto L4e
            Lc:
                if (r6 == r1) goto L34
                if (r6 == r5) goto L12
                goto L12e
            L12:
                java.io.Writer r5 = r3.writer
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r0)
                r6.append(r4)
                java.lang.String r4 = ": '"
                r6.append(r4)
                r6.append(r7)
                java.lang.String r4 = "%',\n"
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                r5.write(r4)
                return
            L34:
                java.io.Writer r5 = r3.writer
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r0)
                r6.append(r4)
                java.lang.String r4 = ": '???????????',\n"
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                r5.write(r4)
                return
            L4e:
                java.lang.String r10 = "}\n"
                java.lang.String r2 = ", "
                if (r6 == 0) goto Lae
                if (r6 == r1) goto L88
                if (r6 == r5) goto L5a
                goto Ld3
            L5a:
                java.io.Writer r5 = r3.writer
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r0)
                r6.append(r4)
                java.lang.String r4 = ": {'"
                r6.append(r4)
                r6.append(r7)
                java.lang.String r4 = "'% ,"
                r6.append(r4)
                r6.append(r8)
                r6.append(r2)
                r6.append(r9)
                r6.append(r10)
                java.lang.String r4 = r6.toString()
                r5.write(r4)
                return
            L88:
                java.io.Writer r5 = r3.writer
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r0)
                r6.append(r4)
                java.lang.String r4 = ": {'wrap' ,"
                r6.append(r4)
                r6.append(r8)
                r6.append(r2)
                r6.append(r9)
                r6.append(r10)
                java.lang.String r4 = r6.toString()
                r5.write(r4)
                return
            Lae:
                java.io.Writer r5 = r3.writer
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r0)
                r6.append(r4)
                java.lang.String r4 = ": {'spread' ,"
                r6.append(r4)
                r6.append(r8)
                r6.append(r2)
                r6.append(r9)
                r6.append(r10)
                java.lang.String r4 = r6.toString()
                r5.write(r4)
            Ld3:
                return
            Ld4:
                r6 = -2
                if (r5 != r6) goto Lf1
                java.io.Writer r5 = r3.writer
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r0)
                r6.append(r4)
                java.lang.String r4 = ": 'wrap'\n"
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                r5.write(r4)
                goto L12e
            Lf1:
                if (r5 != r10) goto L10d
                java.io.Writer r5 = r3.writer
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r0)
                r6.append(r4)
                java.lang.String r4 = ": 'parent'\n"
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                r5.write(r4)
                goto L12e
            L10d:
                java.io.Writer r6 = r3.writer
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r0)
                r7.append(r4)
                java.lang.String r4 = ": "
                r7.append(r4)
                r7.append(r5)
                java.lang.String r4 = ",\n"
                r7.append(r4)
                java.lang.String r4 = r7.toString()
                r6.write(r4)
            L12e:
                return
        }

        private void writeGuideline(int r1, int r2, int r3, float r4) {
                r0 = this;
                return
        }

        public final java.lang.String getName(int r5) {
                r4 = this;
                java.util.HashMap<java.lang.Integer, java.lang.String> r0 = r4.idMap
                java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
                boolean r0 = r0.containsKey(r1)
                java.lang.String r1 = "'"
                if (r0 == 0) goto L23
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r4.idMap
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r5 = r2.get(r5)
                java.lang.String r5 = (java.lang.String) r5
                java.lang.String r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r5, r1)
                return r5
            L23:
                if (r5 != 0) goto L28
                java.lang.String r5 = "'parent'"
                return r5
            L28:
                r0 = -1
                java.lang.String r2 = "unknown"
                if (r5 == r0) goto L39
                android.content.Context r0 = r4.context     // Catch: java.lang.Exception -> L4f
                android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Exception -> L4f
                java.lang.String r0 = r0.getResourceEntryName(r5)     // Catch: java.lang.Exception -> L4f
                goto L60
            L39:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4f
                r0.<init>()     // Catch: java.lang.Exception -> L4f
                r0.append(r2)     // Catch: java.lang.Exception -> L4f
                int r3 = r4.unknownCount     // Catch: java.lang.Exception -> L4f
                int r3 = r3 + 1
                r4.unknownCount = r3     // Catch: java.lang.Exception -> L4f
                r0.append(r3)     // Catch: java.lang.Exception -> L4f
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L4f
                goto L60
            L4f:
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
                int r2 = r4.unknownCount
                int r2 = r2 + 1
                r4.unknownCount = r2
                r0.append(r2)
                java.lang.String r0 = r0.toString()
            L60:
                java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r4.idMap
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r2.put(r5, r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r1)
                r5.append(r0)
                r5.append(r1)
                java.lang.String r5 = r5.toString()
                return r5
        }

        public final void writeConstraint(java.lang.String r4, int r5, java.lang.String r6, int r7) throws java.io.IOException {
                r3 = this;
                r0 = -1
                if (r5 != r0) goto L4
                return
            L4:
                java.io.Writer r0 = r3.writer
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "       "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.write(r4)
                java.io.Writer r4 = r3.writer
                java.lang.String r0 = ":["
                r4.write(r0)
                java.io.Writer r4 = r3.writer
                java.lang.String r5 = r3.getName(r5)
                r4.write(r5)
                java.io.Writer r4 = r3.writer
                java.lang.String r5 = " , "
                r4.write(r5)
                java.io.Writer r4 = r3.writer
                r4.write(r6)
                if (r7 == 0) goto L4c
                java.io.Writer r4 = r3.writer
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                r6.append(r7)
                java.lang.String r5 = r6.toString()
                r4.write(r5)
            L4c:
                java.io.Writer r4 = r3.writer
                java.lang.String r5 = "],\n"
                r4.write(r5)
                return
        }

        public final void writeLayout() throws java.io.IOException {
                r11 = this;
                java.io.Writer r0 = r11.writer
                java.lang.String r1 = "\n'ConstraintSet':{\n"
                r0.write(r1)
                androidx.constraintlayout.widget.ConstraintSet r0 = r11.this$0
                java.util.HashMap r0 = androidx.constraintlayout.widget.ConstraintSet.access$1300(r0)
                java.util.Set r0 = r0.keySet()
                java.util.Iterator r8 = r0.iterator()
            L15:
                boolean r0 = r8.hasNext()
                java.lang.String r9 = "}\n"
                if (r0 == 0) goto L200
                java.lang.Object r0 = r8.next()
                java.lang.Integer r0 = (java.lang.Integer) r0
                androidx.constraintlayout.widget.ConstraintSet r1 = r11.this$0
                java.util.HashMap r1 = androidx.constraintlayout.widget.ConstraintSet.access$1300(r1)
                java.lang.Object r1 = r1.get(r0)
                androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r1
                int r0 = r0.intValue()
                java.lang.String r0 = r11.getName(r0)
                java.io.Writer r2 = r11.writer
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r0)
                java.lang.String r0 = ":{\n"
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.write(r0)
                androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r1.layout
                int r2 = r10.mHeight
                int r3 = r10.heightDefault
                float r4 = r10.heightPercent
                int r5 = r10.heightMin
                int r6 = r10.heightMax
                boolean r7 = r10.constrainedHeight
                java.lang.String r1 = "height"
                r0 = r11
                r0.writeDimension(r1, r2, r3, r4, r5, r6, r7)
                int r2 = r10.mWidth
                int r3 = r10.widthDefault
                float r4 = r10.widthPercent
                int r5 = r10.widthMin
                int r6 = r10.widthMax
                boolean r7 = r10.constrainedWidth
                java.lang.String r1 = "width"
                r0.writeDimension(r1, r2, r3, r4, r5, r6, r7)
                int r0 = r10.leftToLeft
                int r1 = r10.leftMargin
                java.lang.String r2 = "'left'"
                r11.writeConstraint(r2, r0, r2, r1)
                int r0 = r10.leftToRight
                int r1 = r10.leftMargin
                java.lang.String r3 = "'right'"
                r11.writeConstraint(r2, r0, r3, r1)
                int r0 = r10.rightToLeft
                int r1 = r10.rightMargin
                r11.writeConstraint(r3, r0, r2, r1)
                int r0 = r10.rightToRight
                int r1 = r10.rightMargin
                r11.writeConstraint(r3, r0, r3, r1)
                int r0 = r10.baselineToBaseline
                java.lang.String r1 = "'baseline'"
                r2 = -1
                r11.writeConstraint(r1, r0, r1, r2)
                int r0 = r10.baselineToTop
                java.lang.String r3 = "'top'"
                r11.writeConstraint(r1, r0, r3, r2)
                int r0 = r10.baselineToBottom
                java.lang.String r4 = "'bottom'"
                r11.writeConstraint(r1, r0, r4, r2)
                int r0 = r10.topToBottom
                int r1 = r10.topMargin
                r11.writeConstraint(r3, r0, r4, r1)
                int r0 = r10.topToTop
                int r1 = r10.topMargin
                r11.writeConstraint(r3, r0, r3, r1)
                int r0 = r10.bottomToBottom
                int r1 = r10.bottomMargin
                r11.writeConstraint(r4, r0, r4, r1)
                int r0 = r10.bottomToTop
                int r1 = r10.bottomMargin
                r11.writeConstraint(r4, r0, r3, r1)
                int r0 = r10.startToStart
                int r1 = r10.startMargin
                java.lang.String r3 = "'start'"
                r11.writeConstraint(r3, r0, r3, r1)
                int r0 = r10.startToEnd
                int r1 = r10.startMargin
                java.lang.String r4 = "'end'"
                r11.writeConstraint(r3, r0, r4, r1)
                int r0 = r10.endToStart
                int r1 = r10.endMargin
                r11.writeConstraint(r4, r0, r3, r1)
                int r0 = r10.endToEnd
                int r1 = r10.endMargin
                r11.writeConstraint(r4, r0, r4, r1)
                float r0 = r10.horizontalBias
                java.lang.String r1 = "'horizontalBias'"
                r11.writeVariable$1(r1, r0)
                float r0 = r10.verticalBias
                java.lang.String r1 = "'verticalBias'"
                r11.writeVariable$1(r1, r0)
                int r0 = r10.circleConstraint
                float r1 = r10.circleAngle
                int r3 = r10.circleRadius
                java.lang.String r4 = ", "
                if (r0 != r2) goto Lff
                goto L140
            Lff:
                java.io.Writer r2 = r11.writer
                java.lang.String r5 = "       circle"
                r2.write(r5)
                java.io.Writer r2 = r11.writer
                java.lang.String r5 = ":["
                r2.write(r5)
                java.io.Writer r2 = r11.writer
                java.lang.String r0 = r11.getName(r0)
                r2.write(r0)
                java.io.Writer r0 = r11.writer
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r4)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.write(r1)
                java.io.Writer r0 = r11.writer
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r2 = "]"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.write(r1)
            L140:
                int r0 = r10.orientation
                int r1 = r10.guideBegin
                int r2 = r10.guideEnd
                float r3 = r10.guidePercent
                r11.writeGuideline(r0, r1, r2, r3)
                java.lang.String r0 = r10.dimensionRatio
                java.lang.String r1 = "'dimensionRatio'"
                r11.writeVariable(r1, r0)
                int r0 = r10.mBarrierMargin
                java.lang.String r1 = "'barrierMargin'"
                r11.writeVariable(r1, r0)
                int r0 = r10.mHelperType
                java.lang.String r1 = "'type'"
                r11.writeVariable(r1, r0)
                java.lang.String r0 = r10.mReferenceIdString
                java.lang.String r1 = "'ReferenceId'"
                r11.writeVariable(r1, r0)
                boolean r0 = r10.mBarrierAllowsGoneWidgets
                java.lang.String r1 = ": "
                r2 = 1
                if (r0 != r2) goto L16f
                goto L191
            L16f:
                java.io.Writer r2 = r11.writer
                java.lang.String r3 = "       'mBarrierAllowsGoneWidgets'"
                r2.write(r3)
                java.io.Writer r2 = r11.writer
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r1)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.write(r0)
                java.io.Writer r0 = r11.writer
                java.lang.String r2 = ",\n"
                r0.write(r2)
            L191:
                int r0 = r10.mWrapBehavior
                java.lang.String r2 = "'WrapBehavior'"
                r11.writeVariable(r2, r0)
                float r0 = r10.verticalWeight
                java.lang.String r2 = "'verticalWeight'"
                r11.writeVariable(r2, r0)
                float r0 = r10.horizontalWeight
                java.lang.String r2 = "'horizontalWeight'"
                r11.writeVariable(r2, r0)
                int r0 = r10.horizontalChainStyle
                java.lang.String r2 = "'horizontalChainStyle'"
                r11.writeVariable(r2, r0)
                int r0 = r10.verticalChainStyle
                java.lang.String r2 = "'verticalChainStyle'"
                r11.writeVariable(r2, r0)
                int r0 = r10.mBarrierDirection
                java.lang.String r2 = "'barrierDirection'"
                r11.writeVariable(r2, r0)
                int[] r0 = r10.mReferenceIds
                if (r0 == 0) goto L1f9
                java.io.Writer r2 = r11.writer
                java.lang.String r3 = "       'ReferenceIds'"
                r2.write(r3)
                java.io.Writer r2 = r11.writer
                r2.write(r1)
                r1 = 0
            L1cc:
                int r2 = r0.length
                if (r1 >= r2) goto L1f2
                java.io.Writer r2 = r11.writer
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                if (r1 != 0) goto L1db
                java.lang.String r5 = "["
                goto L1dc
            L1db:
                r5 = r4
            L1dc:
                r3.append(r5)
                r5 = r0[r1]
                java.lang.String r5 = r11.getName(r5)
                r3.append(r5)
                java.lang.String r3 = r3.toString()
                r2.write(r3)
                int r1 = r1 + 1
                goto L1cc
            L1f2:
                java.io.Writer r0 = r11.writer
                java.lang.String r1 = "],\n"
                r0.write(r1)
            L1f9:
                java.io.Writer r0 = r11.writer
                r0.write(r9)
                goto L15
            L200:
                java.io.Writer r0 = r11.writer
                r0.write(r9)
                return
        }

        public final void writeVariable(java.lang.String r4, float r5) throws java.io.IOException {
                r3 = this;
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 != 0) goto L7
                return
            L7:
                java.io.Writer r0 = r3.writer
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "       "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.write(r4)
                java.io.Writer r4 = r3.writer
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = ": "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r4.write(r5)
                java.io.Writer r4 = r3.writer
                java.lang.String r5 = ",\n"
                r4.write(r5)
                return
        }

        public final void writeVariable(java.lang.String r4, int r5) throws java.io.IOException {
                r3 = this;
                if (r5 == 0) goto L40
                r0 = -1
                if (r5 != r0) goto L6
                goto L40
            L6:
                java.io.Writer r0 = r3.writer
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "       "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.write(r4)
                java.io.Writer r4 = r3.writer
                java.lang.String r0 = ":"
                r4.write(r0)
                java.io.Writer r4 = r3.writer
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = ", "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r4.write(r5)
                java.io.Writer r4 = r3.writer
                java.lang.String r5 = "\n"
                r4.write(r5)
            L40:
                return
        }

        public final void writeVariable(java.lang.String r4, java.lang.String r5) throws java.io.IOException {
                r3 = this;
                if (r5 != 0) goto L3
                return
            L3:
                java.io.Writer r0 = r3.writer
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "       "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.write(r4)
                java.io.Writer r4 = r3.writer
                java.lang.String r0 = ":"
                r4.write(r0)
                java.io.Writer r4 = r3.writer
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = ", "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r4.write(r5)
                java.io.Writer r4 = r3.writer
                java.lang.String r5 = "\n"
                r4.write(r5)
                return
        }

        public final void writeVariable$1(java.lang.String r4, float r5) throws java.io.IOException {
                r3 = this;
                r0 = 1056964608(0x3f000000, float:0.5)
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 != 0) goto L7
                return
            L7:
                java.io.Writer r0 = r3.writer
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "       "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.write(r4)
                java.io.Writer r4 = r3.writer
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = ": "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r4.write(r5)
                java.io.Writer r4 = r3.writer
                java.lang.String r5 = ",\n"
                r4.write(r5)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class WriteXmlEngine {
        private static final java.lang.String SPACE = "\n       ";
        public android.content.Context context;
        public java.util.HashMap<java.lang.Integer, java.lang.String> idMap;
        public final /* synthetic */ androidx.constraintlayout.widget.ConstraintSet this$0;
        public int unknownCount;
        public java.io.Writer writer;

        public WriteXmlEngine(androidx.constraintlayout.widget.ConstraintSet r1, java.io.Writer r2, androidx.constraintlayout.widget.ConstraintLayout r3) throws java.io.IOException {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 0
                r0.unknownCount = r1
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.idMap = r1
                r0.writer = r2
                android.content.Context r1 = r3.getContext()
                r0.context = r1
                return
        }

        private void writeBaseDimension(java.lang.String r3, int r4, int r5) throws java.io.IOException {
                r2 = this;
                if (r4 == r5) goto L5f
                r5 = -2
                java.lang.String r0 = "\n       "
                if (r4 != r5) goto L21
                java.io.Writer r4 = r2.writer
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r0)
                r5.append(r3)
                java.lang.String r3 = "=\"wrap_content\""
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                r4.write(r3)
                goto L5f
            L21:
                r5 = -1
                if (r4 != r5) goto L3e
                java.io.Writer r4 = r2.writer
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r0)
                r5.append(r3)
                java.lang.String r3 = "=\"match_parent\""
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                r4.write(r3)
                goto L5f
            L3e:
                java.io.Writer r5 = r2.writer
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                r1.append(r3)
                java.lang.String r3 = "=\""
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = "dp\""
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r5.write(r3)
            L5f:
                return
        }

        private void writeBoolen(java.lang.String r3, boolean r4, boolean r5) throws java.io.IOException {
                r2 = this;
                if (r4 == r5) goto L25
                java.io.Writer r5 = r2.writer
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "\n       "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = "=\""
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = "dp\""
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r5.write(r3)
            L25:
                return
        }

        private void writeDimension(java.lang.String r3, int r4, int r5) throws java.io.IOException {
                r2 = this;
                if (r4 == r5) goto L25
                java.io.Writer r5 = r2.writer
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "\n       "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = "=\""
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = "dp\""
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r5.write(r3)
            L25:
                return
        }

        private void writeEnum(java.lang.String r3, int r4, java.lang.String[] r5, int r6) throws java.io.IOException {
                r2 = this;
                if (r4 == r6) goto L1d
                java.io.Writer r6 = r2.writer
                java.lang.String r0 = "\n       "
                java.lang.String r1 = "=\""
                java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m25m(r0, r3, r1)
                r4 = r5[r4]
                r3.append(r4)
                java.lang.String r4 = "\""
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r6.write(r3)
            L1d:
                return
        }

        public final java.lang.String getName(int r6) {
                r5 = this;
                java.util.HashMap<java.lang.Integer, java.lang.String> r0 = r5.idMap
                java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
                boolean r0 = r0.containsKey(r1)
                java.lang.String r1 = ""
                java.lang.String r2 = "@+id/"
                if (r0 == 0) goto L25
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
                java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r5.idMap
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r6 = r2.get(r6)
                java.lang.String r6 = (java.lang.String) r6
                java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r6, r1)
                return r6
            L25:
                if (r6 != 0) goto L2a
                java.lang.String r6 = "parent"
                return r6
            L2a:
                r0 = -1
                java.lang.String r3 = "unknown"
                if (r6 == r0) goto L3b
                android.content.Context r0 = r5.context     // Catch: java.lang.Exception -> L51
                android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Exception -> L51
                java.lang.String r0 = r0.getResourceEntryName(r6)     // Catch: java.lang.Exception -> L51
                goto L62
            L3b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L51
                r0.<init>()     // Catch: java.lang.Exception -> L51
                r0.append(r3)     // Catch: java.lang.Exception -> L51
                int r4 = r5.unknownCount     // Catch: java.lang.Exception -> L51
                int r4 = r4 + 1
                r5.unknownCount = r4     // Catch: java.lang.Exception -> L51
                r0.append(r4)     // Catch: java.lang.Exception -> L51
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L51
                goto L62
            L51:
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
                int r3 = r5.unknownCount
                int r3 = r3 + 1
                r5.unknownCount = r3
                r0.append(r3)
                java.lang.String r0 = r0.toString()
            L62:
                java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r5.idMap
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r3.put(r6, r0)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r2)
                r6.append(r0)
                r6.append(r1)
                java.lang.String r6 = r6.toString()
                return r6
        }

        public final void writeLayout() throws java.io.IOException {
                r15 = this;
                java.io.Writer r0 = r15.writer
                java.lang.String r1 = "\n<ConstraintSet>\n"
                r0.write(r1)
                androidx.constraintlayout.widget.ConstraintSet r0 = r15.this$0
                java.util.HashMap r0 = androidx.constraintlayout.widget.ConstraintSet.access$1300(r0)
                java.util.Set r0 = r0.keySet()
                java.util.Iterator r0 = r0.iterator()
            L15:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2be
                java.lang.Object r1 = r0.next()
                java.lang.Integer r1 = (java.lang.Integer) r1
                androidx.constraintlayout.widget.ConstraintSet r2 = r15.this$0
                java.util.HashMap r2 = androidx.constraintlayout.widget.ConstraintSet.access$1300(r2)
                java.lang.Object r2 = r2.get(r1)
                androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r2
                int r1 = r1.intValue()
                java.lang.String r1 = r15.getName(r1)
                java.io.Writer r3 = r15.writer
                java.lang.String r4 = "  <Constraint"
                r3.write(r4)
                java.io.Writer r3 = r15.writer
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "\n       android:id=\""
                r4.append(r5)
                r4.append(r1)
                java.lang.String r1 = "\""
                r4.append(r1)
                java.lang.String r1 = r4.toString()
                r3.write(r1)
                androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r2.layout
                int r2 = r1.mWidth
                r3 = -5
                java.lang.String r4 = "android:layout_width"
                r15.writeBaseDimension(r4, r2, r3)
                int r2 = r1.mHeight
                java.lang.String r4 = "android:layout_height"
                r15.writeBaseDimension(r4, r2, r3)
                int r2 = r1.guideBegin
                float r2 = (float) r2
                r3 = -1082130432(0xffffffffbf800000, float:-1.0)
                java.lang.String r4 = "app:layout_constraintGuide_begin"
                r15.writeVariable(r4, r2, r3)
                int r2 = r1.guideEnd
                float r2 = (float) r2
                java.lang.String r4 = "app:layout_constraintGuide_end"
                r15.writeVariable(r4, r2, r3)
                float r2 = r1.guidePercent
                java.lang.String r4 = "app:layout_constraintGuide_percent"
                r15.writeVariable(r4, r2, r3)
                float r2 = r1.horizontalBias
                r3 = 1056964608(0x3f000000, float:0.5)
                java.lang.String r4 = "app:layout_constraintHorizontal_bias"
                r15.writeVariable(r4, r2, r3)
                float r2 = r1.verticalBias
                java.lang.String r4 = "app:layout_constraintVertical_bias"
                r15.writeVariable(r4, r2, r3)
                java.lang.String r2 = r1.dimensionRatio
                java.lang.String r3 = "app:layout_constraintDimensionRatio"
                r15.writeVariable(r3, r2)
                int r2 = r1.circleConstraint
                java.lang.String r3 = "app:layout_constraintCircle"
                r15.writeXmlConstraint(r3, r2)
                int r2 = r1.circleRadius
                float r2 = (float) r2
                r3 = 0
                java.lang.String r4 = "app:layout_constraintCircleRadius"
                r15.writeVariable(r4, r2, r3)
                float r2 = r1.circleAngle
                java.lang.String r4 = "app:layout_constraintCircleAngle"
                r15.writeVariable(r4, r2, r3)
                int r2 = r1.orientation
                float r2 = (float) r2
                r3 = -1082130432(0xffffffffbf800000, float:-1.0)
                java.lang.String r4 = "android:orientation"
                r15.writeVariable(r4, r2, r3)
                float r2 = r1.verticalWeight
                java.lang.String r3 = "app:layout_constraintVertical_weight"
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                r15.writeVariable(r3, r2, r4)
                float r2 = r1.horizontalWeight
                java.lang.String r4 = "app:layout_constraintHorizontal_weight"
                r5 = -1082130432(0xffffffffbf800000, float:-1.0)
                r15.writeVariable(r4, r2, r5)
                int r2 = r1.horizontalChainStyle
                float r2 = (float) r2
                java.lang.String r5 = "app:layout_constraintHorizontal_chainStyle"
                r6 = 0
                r15.writeVariable(r5, r2, r6)
                int r2 = r1.verticalChainStyle
                float r2 = (float) r2
                java.lang.String r6 = "app:layout_constraintVertical_chainStyle"
                r7 = 0
                r15.writeVariable(r6, r2, r7)
                int r2 = r1.mBarrierDirection
                float r2 = (float) r2
                java.lang.String r7 = "app:barrierDirection"
                r8 = -1082130432(0xffffffffbf800000, float:-1.0)
                r15.writeVariable(r7, r2, r8)
                int r2 = r1.mBarrierMargin
                float r2 = (float) r2
                r8 = 0
                java.lang.String r9 = "app:barrierMargin"
                r15.writeVariable(r9, r2, r8)
                int r2 = r1.leftMargin
                r8 = 0
                java.lang.String r9 = "app:layout_marginLeft"
                r15.writeDimension(r9, r2, r8)
                int r2 = r1.goneLeftMargin
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                java.lang.String r10 = "app:layout_goneMarginLeft"
                r15.writeDimension(r10, r2, r9)
                int r2 = r1.rightMargin
                java.lang.String r9 = "app:layout_marginRight"
                r15.writeDimension(r9, r2, r8)
                int r2 = r1.goneRightMargin
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                java.lang.String r10 = "app:layout_goneMarginRight"
                r15.writeDimension(r10, r2, r9)
                int r2 = r1.startMargin
                java.lang.String r9 = "app:layout_marginStart"
                r15.writeDimension(r9, r2, r8)
                int r2 = r1.goneStartMargin
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                java.lang.String r10 = "app:layout_goneMarginStart"
                r15.writeDimension(r10, r2, r9)
                int r2 = r1.endMargin
                java.lang.String r9 = "app:layout_marginEnd"
                r15.writeDimension(r9, r2, r8)
                int r2 = r1.goneEndMargin
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                java.lang.String r10 = "app:layout_goneMarginEnd"
                r15.writeDimension(r10, r2, r9)
                int r2 = r1.topMargin
                java.lang.String r9 = "app:layout_marginTop"
                r15.writeDimension(r9, r2, r8)
                int r2 = r1.goneTopMargin
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                java.lang.String r10 = "app:layout_goneMarginTop"
                r15.writeDimension(r10, r2, r9)
                int r2 = r1.bottomMargin
                java.lang.String r9 = "app:layout_marginBottom"
                r15.writeDimension(r9, r2, r8)
                int r2 = r1.goneBottomMargin
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                java.lang.String r10 = "app:layout_goneMarginBottom"
                r15.writeDimension(r10, r2, r9)
                int r2 = r1.goneBaselineMargin
                java.lang.String r10 = "app:goneBaselineMargin"
                r15.writeDimension(r10, r2, r9)
                int r2 = r1.baselineMargin
                java.lang.String r9 = "app:baselineMargin"
                r15.writeDimension(r9, r2, r8)
                boolean r2 = r1.constrainedWidth
                java.lang.String r9 = "app:layout_constrainedWidth"
                r15.writeBoolen(r9, r2, r8)
                boolean r2 = r1.constrainedHeight
                java.lang.String r9 = "app:layout_constrainedHeight"
                r15.writeBoolen(r9, r2, r8)
                boolean r2 = r1.mBarrierAllowsGoneWidgets
                r9 = 1
                java.lang.String r10 = "app:barrierAllowsGoneWidgets"
                r15.writeBoolen(r10, r2, r9)
                int r2 = r1.mWrapBehavior
                float r2 = (float) r2
                r9 = 0
                java.lang.String r10 = "app:layout_wrapBehaviorInParent"
                r15.writeVariable(r10, r2, r9)
                int r2 = r1.baselineToBaseline
                java.lang.String r9 = "app:baselineToBaseline"
                r15.writeXmlConstraint(r9, r2)
                int r2 = r1.baselineToBottom
                java.lang.String r9 = "app:baselineToBottom"
                r15.writeXmlConstraint(r9, r2)
                int r2 = r1.baselineToTop
                java.lang.String r9 = "app:baselineToTop"
                r15.writeXmlConstraint(r9, r2)
                int r2 = r1.bottomToBottom
                java.lang.String r9 = "app:layout_constraintBottom_toBottomOf"
                r15.writeXmlConstraint(r9, r2)
                int r2 = r1.bottomToTop
                java.lang.String r9 = "app:layout_constraintBottom_toTopOf"
                r15.writeXmlConstraint(r9, r2)
                int r2 = r1.endToEnd
                java.lang.String r9 = "app:layout_constraintEnd_toEndOf"
                r15.writeXmlConstraint(r9, r2)
                int r2 = r1.endToStart
                java.lang.String r9 = "app:layout_constraintEnd_toStartOf"
                r15.writeXmlConstraint(r9, r2)
                int r2 = r1.leftToLeft
                java.lang.String r9 = "app:layout_constraintLeft_toLeftOf"
                r15.writeXmlConstraint(r9, r2)
                int r2 = r1.leftToRight
                java.lang.String r9 = "app:layout_constraintLeft_toRightOf"
                r15.writeXmlConstraint(r9, r2)
                int r2 = r1.rightToLeft
                java.lang.String r9 = "app:layout_constraintRight_toLeftOf"
                r15.writeXmlConstraint(r9, r2)
                int r2 = r1.rightToRight
                java.lang.String r9 = "app:layout_constraintRight_toRightOf"
                r15.writeXmlConstraint(r9, r2)
                int r2 = r1.startToEnd
                java.lang.String r9 = "app:layout_constraintStart_toEndOf"
                r15.writeXmlConstraint(r9, r2)
                int r2 = r1.startToStart
                java.lang.String r9 = "app:layout_constraintStart_toStartOf"
                r15.writeXmlConstraint(r9, r2)
                int r2 = r1.topToBottom
                java.lang.String r9 = "app:layout_constraintTop_toBottomOf"
                r15.writeXmlConstraint(r9, r2)
                int r2 = r1.topToTop
                java.lang.String r9 = "app:layout_constraintTop_toTopOf"
                r15.writeXmlConstraint(r9, r2)
                java.lang.String r2 = "spread"
                java.lang.String r9 = "wrap"
                java.lang.String r10 = "percent"
                java.lang.String[] r2 = new java.lang.String[]{r2, r9, r10}
                int r9 = r1.heightDefault
                java.lang.String r10 = "app:layout_constraintHeight_default"
                r15.writeEnum(r10, r9, r2, r8)
                float r9 = r1.heightPercent
                r10 = 1065353216(0x3f800000, float:1.0)
                java.lang.String r11 = "app:layout_constraintHeight_percent"
                r15.writeVariable(r11, r9, r10)
                int r9 = r1.heightMin
                java.lang.String r10 = "app:layout_constraintHeight_min"
                r15.writeDimension(r10, r9, r8)
                int r9 = r1.heightMax
                java.lang.String r10 = "app:layout_constraintHeight_max"
                r15.writeDimension(r10, r9, r8)
                boolean r9 = r1.constrainedHeight
                java.lang.String r10 = "android:layout_constrainedHeight"
                r15.writeBoolen(r10, r9, r8)
                int r9 = r1.widthDefault
                java.lang.String r10 = "app:layout_constraintWidth_default"
                r15.writeEnum(r10, r9, r2, r8)
                float r2 = r1.widthPercent
                r9 = 1065353216(0x3f800000, float:1.0)
                java.lang.String r10 = "app:layout_constraintWidth_percent"
                r15.writeVariable(r10, r2, r9)
                int r2 = r1.widthMin
                java.lang.String r9 = "app:layout_constraintWidth_min"
                r15.writeDimension(r9, r2, r8)
                int r2 = r1.widthMax
                java.lang.String r9 = "app:layout_constraintWidth_max"
                r15.writeDimension(r9, r2, r8)
                boolean r2 = r1.constrainedWidth
                java.lang.String r9 = "android:layout_constrainedWidth"
                r15.writeBoolen(r9, r2, r8)
                float r2 = r1.verticalWeight
                r9 = -1082130432(0xffffffffbf800000, float:-1.0)
                r15.writeVariable(r3, r2, r9)
                float r2 = r1.horizontalWeight
                r3 = -1082130432(0xffffffffbf800000, float:-1.0)
                r15.writeVariable(r4, r2, r3)
                int r2 = r1.horizontalChainStyle
                r15.writeVariable(r5, r2)
                int r2 = r1.verticalChainStyle
                r15.writeVariable(r6, r2)
                java.lang.String r9 = "left"
                java.lang.String r10 = "right"
                java.lang.String r11 = "top"
                java.lang.String r12 = "bottom"
                java.lang.String r13 = "start"
                java.lang.String r14 = "end"
                java.lang.String[] r2 = new java.lang.String[]{r9, r10, r11, r12, r13, r14}
                int r3 = r1.mBarrierDirection
                r4 = -1
                r15.writeEnum(r7, r3, r2, r4)
                java.lang.String r2 = r1.mConstraintTag
                java.lang.String r3 = "app:layout_constraintTag"
                r15.writeVariable(r3, r2)
                int[] r1 = r1.mReferenceIds
                if (r1 == 0) goto L2b5
                java.io.Writer r2 = r15.writer
                java.lang.String r3 = "\n       'ReferenceIds'"
                r2.write(r3)
                java.io.Writer r2 = r15.writer
                java.lang.String r3 = ":"
                r2.write(r3)
            L287:
                int r2 = r1.length
                if (r8 >= r2) goto L2ae
                java.io.Writer r2 = r15.writer
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                if (r8 != 0) goto L296
                java.lang.String r4 = "["
                goto L298
            L296:
                java.lang.String r4 = ", "
            L298:
                r3.append(r4)
                r4 = r1[r8]
                java.lang.String r4 = r15.getName(r4)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.write(r3)
                int r8 = r8 + 1
                goto L287
            L2ae:
                java.io.Writer r1 = r15.writer
                java.lang.String r2 = "],\n"
                r1.write(r2)
            L2b5:
                java.io.Writer r1 = r15.writer
                java.lang.String r2 = " />\n"
                r1.write(r2)
                goto L15
            L2be:
                java.io.Writer r0 = r15.writer
                java.lang.String r1 = "</ConstraintSet>\n"
                r0.write(r1)
                return
        }

        public final void writeVariable(java.lang.String r3, float r4, float r5) throws java.io.IOException {
                r2 = this;
                int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r5 != 0) goto L5
                return
            L5:
                java.io.Writer r5 = r2.writer
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "\n       "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r5.write(r3)
                java.io.Writer r3 = r2.writer
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "=\""
                r5.append(r0)
                r5.append(r4)
                java.lang.String r4 = "\""
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                r3.write(r4)
                return
        }

        public final void writeVariable(java.lang.String r4, int r5) throws java.io.IOException {
                r3 = this;
                if (r5 == 0) goto L29
                r0 = -1
                if (r5 != r0) goto L6
                goto L29
            L6:
                java.io.Writer r0 = r3.writer
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "\n       "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = "=\""
                r1.append(r4)
                r1.append(r5)
                java.lang.String r4 = "\"\n"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.write(r4)
            L29:
                return
        }

        public final void writeVariable(java.lang.String r4, java.lang.String r5) throws java.io.IOException {
                r3 = this;
                if (r5 == 0) goto L3b
                r0 = 0
                boolean r0 = r5.equals(r0)
                if (r0 == 0) goto La
                goto L3b
            La:
                java.io.Writer r0 = r3.writer
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "\n       "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.write(r4)
                java.io.Writer r4 = r3.writer
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "=\""
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = "\""
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r4.write(r5)
            L3b:
                return
        }

        public final void writeXmlConstraint(java.lang.String r4, int r5) throws java.io.IOException {
                r3 = this;
                r0 = -1
                if (r5 != r0) goto L4
                return
            L4:
                java.io.Writer r0 = r3.writer
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "\n       "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.write(r4)
                java.io.Writer r4 = r3.writer
                java.lang.String r0 = "=\""
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.String r5 = r3.getName(r5)
                r0.append(r5)
                java.lang.String r5 = "\""
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r4.write(r5)
                return
        }
    }

    static {
            r0 = 3
            int[] r1 = new int[r0]
            r1 = {x0608: FILL_ARRAY_DATA , data: [0, 4, 8} // fill-array
            androidx.constraintlayout.widget.ConstraintSet.VISIBILITY_FLAGS = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            androidx.constraintlayout.widget.ConstraintSet.mapToConstant = r1
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant = r1
            android.util.SparseIntArray r1 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r2 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintLeft_toLeftOf
            r3 = 25
            r1.append(r2, r3)
            android.util.SparseIntArray r1 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r2 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintLeft_toRightOf
            r3 = 26
            r1.append(r2, r3)
            android.util.SparseIntArray r1 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r2 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintRight_toLeftOf
            r3 = 29
            r1.append(r2, r3)
            android.util.SparseIntArray r1 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r2 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintRight_toRightOf
            r3 = 30
            r1.append(r2, r3)
            android.util.SparseIntArray r1 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r2 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintTop_toTopOf
            r3 = 36
            r1.append(r2, r3)
            android.util.SparseIntArray r1 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r2 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintTop_toBottomOf
            r3 = 35
            r1.append(r2, r3)
            android.util.SparseIntArray r1 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r2 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBottom_toTopOf
            r3 = 4
            r1.append(r2, r3)
            android.util.SparseIntArray r1 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r2 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBottom_toBottomOf
            r1.append(r2, r0)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBaseline_toBaselineOf
            r2 = 1
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBaseline_toTopOf
            r2 = 91
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBaseline_toBottomOf
            r2 = 92
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_editor_absoluteX
            r2 = 6
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_editor_absoluteY
            r3 = 7
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintGuide_begin
            r4 = 17
            r0.append(r1, r4)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintGuide_end
            r4 = 18
            r0.append(r1, r4)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintGuide_percent
            r4 = 19
            r0.append(r1, r4)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_guidelineUseRtl
            r4 = 99
            r0.append(r1, r4)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_orientation
            r4 = 27
            r0.append(r1, r4)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintStart_toEndOf
            r5 = 32
            r0.append(r1, r5)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintStart_toStartOf
            r5 = 33
            r0.append(r1, r5)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintEnd_toStartOf
            r5 = 10
            r0.append(r1, r5)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintEnd_toEndOf
            r5 = 9
            r0.append(r1, r5)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginLeft
            r5 = 13
            r0.append(r1, r5)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginTop
            r6 = 16
            r0.append(r1, r6)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginRight
            r7 = 14
            r0.append(r1, r7)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginBottom
            r8 = 11
            r0.append(r1, r8)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginStart
            r9 = 15
            r0.append(r1, r9)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_goneMarginEnd
            r10 = 12
            r0.append(r1, r10)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintVertical_weight
            r11 = 40
            r0.append(r1, r11)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHorizontal_weight
            r12 = 39
            r0.append(r1, r12)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHorizontal_chainStyle
            r13 = 41
            r0.append(r1, r13)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintVertical_chainStyle
            r14 = 42
            r0.append(r1, r14)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHorizontal_bias
            r15 = 20
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintVertical_bias
            r15 = 37
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintDimensionRatio
            r15 = 5
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintLeft_creator
            r15 = 87
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintTop_creator
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintRight_creator
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBottom_creator
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintBaseline_creator
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginLeft
            r15 = 24
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginRight
            r15 = 28
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginStart
            r15 = 31
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginEnd
            r15 = 8
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginTop
            r15 = 34
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginBottom
            r15 = 2
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_width
            r15 = 23
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_height
            r15 = 21
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth
            r15 = 95
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight
            r15 = 96
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_visibility
            r15 = 22
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_alpha
            r15 = 43
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_elevation
            r15 = 44
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_rotationX
            r15 = 45
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_rotationY
            r15 = 46
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_rotation
            r15 = 60
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_scaleX
            r15 = 47
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_scaleY
            r15 = 48
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_transformPivotX
            r15 = 49
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_transformPivotY
            r15 = 50
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_translationX
            r15 = 51
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_translationY
            r15 = 52
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_translationZ
            r15 = 53
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth_default
            r15 = 54
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight_default
            r15 = 55
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth_max
            r15 = 56
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight_max
            r15 = 57
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth_min
            r15 = 58
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight_min
            r15 = 59
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintCircle
            r15 = 61
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintCircleRadius
            r15 = 62
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintCircleAngle
            r15 = 63
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_animateRelativeTo
            r15 = 64
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_transitionEasing
            r15 = 65
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_drawPath
            r15 = 66
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_transitionPathRotate
            r15 = 67
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_motionStagger
            r15 = 79
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_android_id
            r15 = 38
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_motionProgress
            r15 = 68
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintWidth_percent
            r15 = 69
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintHeight_percent
            r15 = 70
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_wrapBehaviorInParent
            r15 = 97
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_chainUseRtl
            r15 = 71
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_barrierDirection
            r15 = 72
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_barrierMargin
            r15 = 73
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_constraint_referenced_ids
            r15 = 74
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_barrierAllowsGoneWidgets
            r15 = 75
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_pathMotionArc
            r15 = 76
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constraintTag
            r15 = 77
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_visibilityMode
            r15 = 78
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constrainedWidth
            r15 = 80
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_layout_constrainedHeight
            r15 = 81
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_polarRelativeTo
            r15 = 82
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_transformPivotTarget
            r15 = 83
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_quantizeMotionSteps
            r15 = 84
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_quantizeMotionPhase
            r15 = 85
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.Constraint_quantizeMotionInterpolator
            r15 = 86
            r0.append(r1, r15)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_editor_absoluteY
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            r0.append(r1, r3)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_orientation
            r0.append(r1, r4)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_goneMarginLeft
            r0.append(r1, r5)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_goneMarginTop
            r0.append(r1, r6)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_goneMarginRight
            r0.append(r1, r7)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_goneMarginBottom
            r0.append(r1, r8)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_goneMarginStart
            r0.append(r1, r9)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_goneMarginEnd
            r0.append(r1, r10)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintVertical_weight
            r0.append(r1, r11)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHorizontal_weight
            r0.append(r1, r12)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHorizontal_chainStyle
            r0.append(r1, r13)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintVertical_chainStyle
            r0.append(r1, r14)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHorizontal_bias
            r2 = 20
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintVertical_bias
            r2 = 37
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintDimensionRatio
            r2 = 5
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintLeft_creator
            r2 = 87
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintTop_creator
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintRight_creator
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintBottom_creator
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintBaseline_creator
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_marginLeft
            r2 = 24
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_marginRight
            r2 = 28
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_marginStart
            r2 = 31
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_marginEnd
            r2 = 8
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_marginTop
            r2 = 34
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_marginBottom
            r2 = 2
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_width
            r2 = 23
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_layout_height
            r2 = 21
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintWidth
            r2 = 95
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHeight
            r2 = 96
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_visibility
            r2 = 22
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_alpha
            r2 = 43
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_elevation
            r2 = 44
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_rotationX
            r2 = 45
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_rotationY
            r2 = 46
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_rotation
            r2 = 60
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_scaleX
            r2 = 47
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_scaleY
            r2 = 48
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_transformPivotX
            r2 = 49
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_transformPivotY
            r2 = 50
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_translationX
            r2 = 51
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_translationY
            r2 = 52
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_translationZ
            r2 = 53
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintWidth_default
            r2 = 54
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHeight_default
            r2 = 55
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintWidth_max
            r2 = 56
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHeight_max
            r2 = 57
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintWidth_min
            r2 = 58
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHeight_min
            r2 = 59
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintCircleRadius
            r2 = 62
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintCircleAngle
            r2 = 63
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_animateRelativeTo
            r2 = 64
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_transitionEasing
            r2 = 65
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_drawPath
            r2 = 66
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_transitionPathRotate
            r2 = 67
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_motionStagger
            r2 = 79
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_android_id
            r2 = 38
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_motionTarget
            r2 = 98
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_motionProgress
            r2 = 68
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintWidth_percent
            r2 = 69
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintHeight_percent
            r2 = 70
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_chainUseRtl
            r2 = 71
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_barrierDirection
            r2 = 72
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_barrierMargin
            r2 = 73
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_constraint_referenced_ids
            r2 = 74
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_barrierAllowsGoneWidgets
            r2 = 75
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_pathMotionArc
            r2 = 76
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constraintTag
            r2 = 77
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_visibilityMode
            r2 = 78
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constrainedWidth
            r2 = 80
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_constrainedHeight
            r2 = 81
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_polarRelativeTo
            r2 = 82
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_transformPivotTarget
            r2 = 83
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_quantizeMotionSteps
            r2 = 84
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_quantizeMotionPhase
            r2 = 85
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_quantizeMotionInterpolator
            r2 = 86
            r0.append(r1, r2)
            android.util.SparseIntArray r0 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride_layout_wrapBehaviorInParent
            r2 = 97
            r0.append(r1, r2)
            return
    }

    public ConstraintSet() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.derivedState = r0
            r0 = 0
            r1.mRotate = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mSavedAttributes = r0
            r0 = 1
            r1.mForceId = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mConstraints = r0
            return
    }

    public static /* synthetic */ int access$100(android.content.res.TypedArray r0, int r1, int r2) {
            int r0 = lookupID(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ java.util.HashMap access$1300(androidx.constraintlayout.widget.ConstraintSet r0) {
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r0.mConstraints
            return r0
    }

    public static /* synthetic */ int[] access$200() {
            int[] r0 = androidx.constraintlayout.widget.ConstraintSet.VISIBILITY_FLAGS
            return r0
    }

    public static /* synthetic */ void access$300(androidx.constraintlayout.widget.ConstraintSet.Constraint r0, int r1, int r2) {
            setDeltaValue(r0, r1, r2)
            return
    }

    public static /* synthetic */ void access$400(androidx.constraintlayout.widget.ConstraintSet.Constraint r0, int r1, float r2) {
            setDeltaValue(r0, r1, r2)
            return
    }

    public static /* synthetic */ void access$500(androidx.constraintlayout.widget.ConstraintSet.Constraint r0, int r1, java.lang.String r2) {
            setDeltaValue(r0, r1, r2)
            return
    }

    public static /* synthetic */ void access$600(androidx.constraintlayout.widget.ConstraintSet.Constraint r0, int r1, boolean r2) {
            setDeltaValue(r0, r1, r2)
            return
    }

    private void addAttributes(androidx.constraintlayout.widget.ConstraintAttribute.AttributeType r5, java.lang.String... r6) {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r6.length
            if (r0 >= r1) goto L4e
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r1 = r4.mSavedAttributes
            r2 = r6[r0]
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L3d
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r1 = r4.mSavedAttributes
            r2 = r6[r0]
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintAttribute r1 = (androidx.constraintlayout.widget.ConstraintAttribute) r1
            if (r1 != 0) goto L1b
            goto L4b
        L1b:
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r2 = r1.getType()
            if (r2 != r5) goto L22
            goto L4b
        L22:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "ConstraintAttribute is already a "
            java.lang.StringBuilder r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = r1.getType()
            java.lang.String r0 = r0.name()
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L3d:
            androidx.constraintlayout.widget.ConstraintAttribute r1 = new androidx.constraintlayout.widget.ConstraintAttribute
            r2 = r6[r0]
            r1.<init>(r2, r5)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r4.mSavedAttributes
            r3 = r6[r0]
            r2.put(r3, r1)
        L4b:
            int r0 = r0 + 1
            goto L1
        L4e:
            return
    }

    public static androidx.constraintlayout.widget.ConstraintSet.Constraint buildDelta(android.content.Context r2, org.xmlpull.v1.XmlPullParser r3) {
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r3)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = new androidx.constraintlayout.widget.ConstraintSet$Constraint
            r0.<init>()
            int[] r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r1)
            populateOverride(r2, r0, r3)
            r3.recycle()
            return r0
    }

    private int[] convertReferenceString(android.view.View r10, java.lang.String r11) {
            r9 = this;
            java.lang.String r0 = ","
            java.lang.String[] r11 = r11.split(r0)
            android.content.Context r0 = r10.getContext()
            int r1 = r11.length
            int[] r1 = new int[r1]
            r2 = 0
            r3 = 0
            r4 = 0
        L10:
            int r5 = r11.length
            if (r3 >= r5) goto L64
            r5 = r11[r3]
            java.lang.String r5 = r5.trim()
            java.lang.Class<androidx.constraintlayout.widget.R$id> r6 = androidx.constraintlayout.widget.R.id.class
            java.lang.reflect.Field r6 = r6.getField(r5)     // Catch: java.lang.Exception -> L25
            r7 = 0
            int r6 = r6.getInt(r7)     // Catch: java.lang.Exception -> L25
            goto L26
        L25:
            r6 = 0
        L26:
            if (r6 != 0) goto L36
            android.content.res.Resources r6 = r0.getResources()
            java.lang.String r7 = r0.getPackageName()
            java.lang.String r8 = "id"
            int r6 = r6.getIdentifier(r5, r8, r7)
        L36:
            if (r6 != 0) goto L5c
            boolean r7 = r10.isInEditMode()
            if (r7 == 0) goto L5c
            android.view.ViewParent r7 = r10.getParent()
            boolean r7 = r7 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r7 == 0) goto L5c
            android.view.ViewParent r7 = r10.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            java.lang.Object r5 = r7.getDesignInformation(r2, r5)
            if (r5 == 0) goto L5c
            boolean r7 = r5 instanceof java.lang.Integer
            if (r7 == 0) goto L5c
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r6 = r5.intValue()
        L5c:
            int r5 = r4 + 1
            r1[r4] = r6
            int r3 = r3 + 1
            r4 = r5
            goto L10
        L64:
            int r10 = r11.length
            if (r4 == r10) goto L6b
            int[] r1 = java.util.Arrays.copyOf(r1, r4)
        L6b:
            return r1
    }

    private void createHorizontalChain(int r13, int r14, int r15, int r16, int[] r17, float[] r18, int r19, int r20, int r21) {
            r12 = this;
            r6 = r12
            r7 = r17
            r8 = r18
            int r0 = r7.length
            java.lang.String r1 = "must have 2 or more widgets in a chain"
            r2 = 2
            if (r0 < r2) goto L7f
            if (r8 == 0) goto L18
            int r0 = r8.length
            int r2 = r7.length
            if (r0 != r2) goto L12
            goto L18
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L18:
            r0 = 0
            if (r8 == 0) goto L27
            r1 = r7[r0]
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r12.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r2 = r8[r0]
            r1.horizontalWeight = r2
        L27:
            r1 = r7[r0]
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r12.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r2 = r19
            r1.horizontalChainStyle = r2
            r1 = r7[r0]
            r5 = -1
            r0 = r12
            r2 = r20
            r3 = r13
            r4 = r14
            r0.connect(r1, r2, r3, r4, r5)
            r9 = 1
            r10 = 1
        L40:
            int r0 = r7.length
            if (r10 >= r0) goto L70
            r0 = r7[r10]
            r1 = r7[r10]
            int r11 = r10 + (-1)
            r3 = r7[r11]
            r5 = -1
            r0 = r12
            r2 = r20
            r4 = r21
            r0.connect(r1, r2, r3, r4, r5)
            r1 = r7[r11]
            r3 = r7[r10]
            r2 = r21
            r4 = r20
            r0.connect(r1, r2, r3, r4, r5)
            if (r8 == 0) goto L6d
            r0 = r7[r10]
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = r12.get(r0)
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r0.layout
            r1 = r8[r10]
            r0.horizontalWeight = r1
        L6d:
            int r10 = r10 + 1
            goto L40
        L70:
            int r0 = r7.length
            int r0 = r0 - r9
            r1 = r7[r0]
            r5 = -1
            r0 = r12
            r2 = r21
            r3 = r15
            r4 = r16
            r0.connect(r1, r2, r3, r4, r5)
            return
        L7f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    private androidx.constraintlayout.widget.ConstraintSet.Constraint fillFromAttributeList(android.content.Context r3, android.util.AttributeSet r4, boolean r5) {
            r2 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = new androidx.constraintlayout.widget.ConstraintSet$Constraint
            r0.<init>()
            if (r5 == 0) goto La
            int[] r1 = androidx.constraintlayout.widget.R.styleable.ConstraintOverride
            goto Lc
        La:
            int[] r1 = androidx.constraintlayout.widget.R.styleable.Constraint
        Lc:
            android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r1)
            r2.populateConstraint(r3, r0, r4, r5)
            r4.recycle()
            return r0
    }

    private androidx.constraintlayout.widget.ConstraintSet.Constraint get(int r4) {
            r3 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r3.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L1a
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r3.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = new androidx.constraintlayout.widget.ConstraintSet$Constraint
            r2.<init>()
            r0.put(r1, r2)
        L1a:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r3.mConstraints
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r4 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r4
            return r4
    }

    private static int lookupID(android.content.res.TypedArray r1, int r2, int r3) {
            int r3 = r1.getResourceId(r2, r3)
            r0 = -1
            if (r3 != r0) goto Lb
            int r3 = r1.getInt(r2, r0)
        Lb:
            return r3
    }

    public static void parseDimensionConstraints(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
            if (r8 != 0) goto L3
            return
        L3:
            android.util.TypedValue r0 = r9.peekValue(r10)
            int r0 = r0.type
            r1 = 3
            r2 = 21
            r3 = 23
            r4 = 1
            r5 = -1
            r6 = 5
            r7 = 0
            if (r0 == r1) goto L6c
            r1 = -2
            if (r0 == r6) goto L28
            int r9 = r9.getInt(r10, r7)
            r10 = -4
            if (r9 == r10) goto L26
            r10 = -3
            if (r9 == r10) goto L2d
            if (r9 == r1) goto L2c
            if (r9 == r5) goto L2c
            goto L2d
        L26:
            r7 = -2
            goto L2e
        L28:
            int r9 = r9.getDimensionPixelSize(r10, r7)
        L2c:
            r7 = r9
        L2d:
            r4 = 0
        L2e:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r9 == 0) goto L40
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r8 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r8
            if (r11 != 0) goto L3b
            r8.width = r7
            r8.constrainedWidth = r4
            goto L6b
        L3b:
            r8.height = r7
            r8.constrainedHeight = r4
            goto L6b
        L40:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.ConstraintSet.Layout
            if (r9 == 0) goto L52
            androidx.constraintlayout.widget.ConstraintSet$Layout r8 = (androidx.constraintlayout.widget.ConstraintSet.Layout) r8
            if (r11 != 0) goto L4d
            r8.mWidth = r7
            r8.constrainedWidth = r4
            goto L6b
        L4d:
            r8.mHeight = r7
            r8.constrainedHeight = r4
            goto L6b
        L52:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta
            if (r9 == 0) goto L6b
            androidx.constraintlayout.widget.ConstraintSet$Constraint$Delta r8 = (androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) r8
            if (r11 != 0) goto L63
            r8.add(r3, r7)
            r9 = 80
            r8.add(r9, r4)
            goto L6b
        L63:
            r8.add(r2, r7)
            r9 = 81
            r8.add(r9, r4)
        L6b:
            return
        L6c:
            java.lang.String r9 = r9.getString(r10)
            if (r9 != 0) goto L74
            goto L176
        L74:
            r10 = 61
            int r10 = r9.indexOf(r10)
            int r0 = r9.length()
            if (r10 <= 0) goto L176
            int r0 = r0 + r5
            if (r10 >= r0) goto L176
            java.lang.String r0 = r9.substring(r7, r10)
            int r10 = r10 + r4
            java.lang.String r9 = r9.substring(r10)
            int r10 = r9.length()
            if (r10 <= 0) goto L176
            java.lang.String r10 = r0.trim()
            java.lang.String r9 = r9.trim()
            java.lang.String r0 = "ratio"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto Lca
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r10 == 0) goto Lb5
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r8 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r8
            if (r11 != 0) goto Lae
            r8.width = r7
            goto Lb0
        Lae:
            r8.height = r7
        Lb0:
            parseDimensionRatioString(r8, r9)
            goto L176
        Lb5:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintSet.Layout
            if (r10 == 0) goto Lbf
            androidx.constraintlayout.widget.ConstraintSet$Layout r8 = (androidx.constraintlayout.widget.ConstraintSet.Layout) r8
            r8.dimensionRatio = r9
            goto L176
        Lbf:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta
            if (r10 == 0) goto L176
            androidx.constraintlayout.widget.ConstraintSet$Constraint$Delta r8 = (androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) r8
            r8.add(r6, r9)
            goto L176
        Lca:
            java.lang.String r0 = "weight"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L119
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L176
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams     // Catch: java.lang.NumberFormatException -> L176
            if (r10 == 0) goto Leb
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r8 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r8     // Catch: java.lang.NumberFormatException -> L176
            if (r11 != 0) goto Le5
            r8.width = r7     // Catch: java.lang.NumberFormatException -> L176
            r8.horizontalWeight = r9     // Catch: java.lang.NumberFormatException -> L176
            goto L176
        Le5:
            r8.height = r7     // Catch: java.lang.NumberFormatException -> L176
            r8.verticalWeight = r9     // Catch: java.lang.NumberFormatException -> L176
            goto L176
        Leb:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintSet.Layout     // Catch: java.lang.NumberFormatException -> L176
            if (r10 == 0) goto Lff
            androidx.constraintlayout.widget.ConstraintSet$Layout r8 = (androidx.constraintlayout.widget.ConstraintSet.Layout) r8     // Catch: java.lang.NumberFormatException -> L176
            if (r11 != 0) goto Lf9
            r8.mWidth = r7     // Catch: java.lang.NumberFormatException -> L176
            r8.horizontalWeight = r9     // Catch: java.lang.NumberFormatException -> L176
            goto L176
        Lf9:
            r8.mHeight = r7     // Catch: java.lang.NumberFormatException -> L176
            r8.verticalWeight = r9     // Catch: java.lang.NumberFormatException -> L176
            goto L176
        Lff:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta     // Catch: java.lang.NumberFormatException -> L176
            if (r10 == 0) goto L176
            androidx.constraintlayout.widget.ConstraintSet$Constraint$Delta r8 = (androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) r8     // Catch: java.lang.NumberFormatException -> L176
            if (r11 != 0) goto L110
            r8.add(r3, r7)     // Catch: java.lang.NumberFormatException -> L176
            r10 = 39
            r8.add(r10, r9)     // Catch: java.lang.NumberFormatException -> L176
            goto L176
        L110:
            r8.add(r2, r7)     // Catch: java.lang.NumberFormatException -> L176
            r10 = 40
            r8.add(r10, r9)     // Catch: java.lang.NumberFormatException -> L176
            goto L176
        L119:
            java.lang.String r0 = "parent"
            boolean r10 = r0.equalsIgnoreCase(r10)
            if (r10 == 0) goto L176
            r10 = 1065353216(0x3f800000, float:1.0)
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L176
            float r9 = java.lang.Math.min(r10, r9)     // Catch: java.lang.NumberFormatException -> L176
            r10 = 0
            float r9 = java.lang.Math.max(r10, r9)     // Catch: java.lang.NumberFormatException -> L176
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams     // Catch: java.lang.NumberFormatException -> L176
            r0 = 2
            if (r10 == 0) goto L147
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r8 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r8     // Catch: java.lang.NumberFormatException -> L176
            if (r11 != 0) goto L140
            r8.width = r7     // Catch: java.lang.NumberFormatException -> L176
            r8.matchConstraintPercentWidth = r9     // Catch: java.lang.NumberFormatException -> L176
            r8.matchConstraintDefaultWidth = r0     // Catch: java.lang.NumberFormatException -> L176
            goto L176
        L140:
            r8.height = r7     // Catch: java.lang.NumberFormatException -> L176
            r8.matchConstraintPercentHeight = r9     // Catch: java.lang.NumberFormatException -> L176
            r8.matchConstraintDefaultHeight = r0     // Catch: java.lang.NumberFormatException -> L176
            goto L176
        L147:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintSet.Layout     // Catch: java.lang.NumberFormatException -> L176
            if (r10 == 0) goto L15d
            androidx.constraintlayout.widget.ConstraintSet$Layout r8 = (androidx.constraintlayout.widget.ConstraintSet.Layout) r8     // Catch: java.lang.NumberFormatException -> L176
            if (r11 != 0) goto L156
            r8.mWidth = r7     // Catch: java.lang.NumberFormatException -> L176
            r8.widthPercent = r9     // Catch: java.lang.NumberFormatException -> L176
            r8.widthDefault = r0     // Catch: java.lang.NumberFormatException -> L176
            goto L176
        L156:
            r8.mHeight = r7     // Catch: java.lang.NumberFormatException -> L176
            r8.heightPercent = r9     // Catch: java.lang.NumberFormatException -> L176
            r8.heightDefault = r0     // Catch: java.lang.NumberFormatException -> L176
            goto L176
        L15d:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta     // Catch: java.lang.NumberFormatException -> L176
            if (r9 == 0) goto L176
            androidx.constraintlayout.widget.ConstraintSet$Constraint$Delta r8 = (androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) r8     // Catch: java.lang.NumberFormatException -> L176
            if (r11 != 0) goto L16e
            r8.add(r3, r7)     // Catch: java.lang.NumberFormatException -> L176
            r9 = 54
            r8.add(r9, r0)     // Catch: java.lang.NumberFormatException -> L176
            goto L176
        L16e:
            r8.add(r2, r7)     // Catch: java.lang.NumberFormatException -> L176
            r9 = 55
            r8.add(r9, r0)     // Catch: java.lang.NumberFormatException -> L176
        L176:
            return
    }

    public static void parseDimensionRatioString(androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r7, java.lang.String r8) {
            if (r8 == 0) goto L7a
            int r0 = r8.length()
            r1 = 44
            int r1 = r8.indexOf(r1)
            r2 = 0
            r3 = -1
            r4 = 1
            if (r1 <= 0) goto L30
            int r5 = r0 + (-1)
            if (r1 >= r5) goto L30
            java.lang.String r5 = r8.substring(r2, r1)
            java.lang.String r6 = "W"
            boolean r6 = r5.equalsIgnoreCase(r6)
            if (r6 == 0) goto L22
            goto L2d
        L22:
            java.lang.String r2 = "H"
            boolean r2 = r5.equalsIgnoreCase(r2)
            if (r2 == 0) goto L2c
            r2 = 1
            goto L2d
        L2c:
            r2 = -1
        L2d:
            int r1 = r1 + r4
            r3 = r2
            r2 = r1
        L30:
            r1 = 58
            int r1 = r8.indexOf(r1)
            if (r1 < 0) goto L6d
            int r0 = r0 - r4
            if (r1 >= r0) goto L6d
            java.lang.String r0 = r8.substring(r2, r1)
            int r1 = r1 + r4
            java.lang.String r1 = r8.substring(r1)
            int r2 = r0.length()
            if (r2 <= 0) goto L7a
            int r2 = r1.length()
            if (r2 <= 0) goto L7a
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L7a
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L7a
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L7a
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto L7a
            if (r3 != r4) goto L68
            float r1 = r1 / r0
            java.lang.Math.abs(r1)     // Catch: java.lang.NumberFormatException -> L7a
            goto L7a
        L68:
            float r0 = r0 / r1
            java.lang.Math.abs(r0)     // Catch: java.lang.NumberFormatException -> L7a
            goto L7a
        L6d:
            java.lang.String r0 = r8.substring(r2)
            int r1 = r0.length()
            if (r1 <= 0) goto L7a
            java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L7a
        L7a:
            r7.dimensionRatio = r8
            return
    }

    private void populateConstraint(android.content.Context r9, androidx.constraintlayout.widget.ConstraintSet.Constraint r10, android.content.res.TypedArray r11, boolean r12) {
            r8 = this;
            if (r12 == 0) goto L6
            populateOverride(r9, r10, r11)
            return
        L6:
            int r9 = r11.getIndexCount()
            r12 = 0
            r0 = 0
        Lc:
            if (r0 >= r9) goto L522
            int r1 = r11.getIndex(r0)
            int r2 = androidx.constraintlayout.widget.R.styleable.Constraint_android_id
            r3 = 1
            if (r1 == r2) goto L2f
            int r2 = androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginStart
            if (r2 == r1) goto L2f
            int r2 = androidx.constraintlayout.widget.R.styleable.Constraint_android_layout_marginEnd
            if (r2 == r1) goto L2f
            androidx.constraintlayout.widget.ConstraintSet$Motion r2 = r10.motion
            r2.mApply = r3
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            r2.mApply = r3
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r2 = r10.propertySet
            r2.mApply = r3
            androidx.constraintlayout.widget.ConstraintSet$Transform r2 = r10.transform
            r2.mApply = r3
        L2f:
            android.util.SparseIntArray r2 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r2 = r2.get(r1)
            java.lang.String r4 = "   "
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 3
            java.lang.String r7 = "ConstraintSet"
            switch(r2) {
                case 1: goto L514;
                case 2: goto L509;
                case 3: goto L4fe;
                case 4: goto L4f3;
                case 5: goto L4ea;
                case 6: goto L4df;
                case 7: goto L4d4;
                case 8: goto L4c9;
                case 9: goto L4be;
                case 10: goto L4b3;
                case 11: goto L4a7;
                case 12: goto L49b;
                case 13: goto L48f;
                case 14: goto L483;
                case 15: goto L477;
                case 16: goto L46b;
                case 17: goto L45f;
                case 18: goto L453;
                case 19: goto L447;
                case 20: goto L43b;
                case 21: goto L42f;
                case 22: goto L419;
                case 23: goto L40d;
                case 24: goto L401;
                case 25: goto L3f5;
                case 26: goto L3e9;
                case 27: goto L3dd;
                case 28: goto L3d1;
                case 29: goto L3c5;
                case 30: goto L3b9;
                case 31: goto L3ad;
                case 32: goto L3a1;
                case 33: goto L395;
                case 34: goto L389;
                case 35: goto L37d;
                case 36: goto L371;
                case 37: goto L365;
                case 38: goto L35b;
                case 39: goto L34f;
                case 40: goto L343;
                case 41: goto L337;
                case 42: goto L32b;
                case 43: goto L31f;
                case 44: goto L311;
                case 45: goto L305;
                case 46: goto L2f9;
                case 47: goto L2ed;
                case 48: goto L2e1;
                case 49: goto L2d5;
                case 50: goto L2c9;
                case 51: goto L2bd;
                case 52: goto L2b1;
                case 53: goto L2a5;
                case 54: goto L299;
                case 55: goto L28d;
                case 56: goto L281;
                case 57: goto L275;
                case 58: goto L269;
                case 59: goto L25d;
                case 60: goto L251;
                case 61: goto L245;
                case 62: goto L239;
                case 63: goto L22d;
                case 64: goto L221;
                case 65: goto L201;
                case 66: goto L1f7;
                case 67: goto L1eb;
                case 68: goto L1df;
                case 69: goto L1d5;
                case 70: goto L1cb;
                case 71: goto L1c4;
                case 72: goto L1b8;
                case 73: goto L1ac;
                case 74: goto L1a2;
                case 75: goto L196;
                case 76: goto L18a;
                case 77: goto L180;
                case 78: goto L174;
                case 79: goto L168;
                case 80: goto L15c;
                case 81: goto L150;
                case 82: goto L144;
                case 83: goto L138;
                case 84: goto L12c;
                case 85: goto L120;
                case 86: goto Lce;
                case 87: goto Lab;
                case 88: goto L3f;
                case 89: goto L3f;
                case 90: goto L3f;
                case 91: goto L9f;
                case 92: goto L93;
                case 93: goto L87;
                case 94: goto L7b;
                case 95: goto L74;
                case 96: goto L6d;
                case 97: goto L61;
                default: goto L3f;
            }
        L3f:
            java.lang.String r2 = "Unknown attribute 0x"
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.lang.String r3 = java.lang.Integer.toHexString(r1)
            r2.append(r3)
            r2.append(r4)
            android.util.SparseIntArray r3 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = r3.get(r1)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.w(r7, r1)
            goto L51e
        L61:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.mWrapBehavior
            int r1 = r11.getInt(r1, r3)
            r2.mWrapBehavior = r1
            goto L51e
        L6d:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            parseDimensionConstraints(r2, r11, r1, r3)
            goto L51e
        L74:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            parseDimensionConstraints(r2, r11, r1, r12)
            goto L51e
        L7b:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.goneBaselineMargin
            int r1 = r11.getDimensionPixelSize(r1, r3)
            r2.goneBaselineMargin = r1
            goto L51e
        L87:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.baselineMargin
            int r1 = r11.getDimensionPixelSize(r1, r3)
            r2.baselineMargin = r1
            goto L51e
        L93:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.baselineToBottom
            int r1 = lookupID(r11, r1, r3)
            r2.baselineToBottom = r1
            goto L51e
        L9f:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.baselineToTop
            int r1 = lookupID(r11, r1, r3)
            r2.baselineToTop = r1
            goto L51e
        Lab:
            java.lang.String r2 = "unused attribute 0x"
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.lang.String r3 = java.lang.Integer.toHexString(r1)
            r2.append(r3)
            r2.append(r4)
            android.util.SparseIntArray r3 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r1 = r3.get(r1)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.w(r7, r1)
            goto L51e
        Lce:
            android.util.TypedValue r2 = r11.peekValue(r1)
            int r2 = r2.type
            r4 = -2
            r5 = -1
            if (r2 != r3) goto Lea
            androidx.constraintlayout.widget.ConstraintSet$Motion r2 = r10.motion
            int r1 = r11.getResourceId(r1, r5)
            r2.mQuantizeInterpolatorID = r1
            androidx.constraintlayout.widget.ConstraintSet$Motion r1 = r10.motion
            int r2 = r1.mQuantizeInterpolatorID
            if (r2 == r5) goto L51e
            r1.mQuantizeInterpolatorType = r4
            goto L51e
        Lea:
            if (r2 != r6) goto L114
            androidx.constraintlayout.widget.ConstraintSet$Motion r2 = r10.motion
            java.lang.String r3 = r11.getString(r1)
            r2.mQuantizeInterpolatorString = r3
            androidx.constraintlayout.widget.ConstraintSet$Motion r2 = r10.motion
            java.lang.String r2 = r2.mQuantizeInterpolatorString
            java.lang.String r3 = "/"
            int r2 = r2.indexOf(r3)
            if (r2 <= 0) goto L10e
            androidx.constraintlayout.widget.ConstraintSet$Motion r2 = r10.motion
            int r1 = r11.getResourceId(r1, r5)
            r2.mQuantizeInterpolatorID = r1
            androidx.constraintlayout.widget.ConstraintSet$Motion r1 = r10.motion
            r1.mQuantizeInterpolatorType = r4
            goto L51e
        L10e:
            androidx.constraintlayout.widget.ConstraintSet$Motion r1 = r10.motion
            r1.mQuantizeInterpolatorType = r5
            goto L51e
        L114:
            androidx.constraintlayout.widget.ConstraintSet$Motion r2 = r10.motion
            int r3 = r2.mQuantizeInterpolatorID
            int r1 = r11.getInteger(r1, r3)
            r2.mQuantizeInterpolatorType = r1
            goto L51e
        L120:
            androidx.constraintlayout.widget.ConstraintSet$Motion r2 = r10.motion
            float r3 = r2.mQuantizeMotionPhase
            float r1 = r11.getFloat(r1, r3)
            r2.mQuantizeMotionPhase = r1
            goto L51e
        L12c:
            androidx.constraintlayout.widget.ConstraintSet$Motion r2 = r10.motion
            int r3 = r2.mQuantizeMotionSteps
            int r1 = r11.getInteger(r1, r3)
            r2.mQuantizeMotionSteps = r1
            goto L51e
        L138:
            androidx.constraintlayout.widget.ConstraintSet$Transform r2 = r10.transform
            int r3 = r2.transformPivotTarget
            int r1 = lookupID(r11, r1, r3)
            r2.transformPivotTarget = r1
            goto L51e
        L144:
            androidx.constraintlayout.widget.ConstraintSet$Motion r2 = r10.motion
            int r3 = r2.mAnimateCircleAngleTo
            int r1 = r11.getInteger(r1, r3)
            r2.mAnimateCircleAngleTo = r1
            goto L51e
        L150:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            boolean r3 = r2.constrainedHeight
            boolean r1 = r11.getBoolean(r1, r3)
            r2.constrainedHeight = r1
            goto L51e
        L15c:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            boolean r3 = r2.constrainedWidth
            boolean r1 = r11.getBoolean(r1, r3)
            r2.constrainedWidth = r1
            goto L51e
        L168:
            androidx.constraintlayout.widget.ConstraintSet$Motion r2 = r10.motion
            float r3 = r2.mMotionStagger
            float r1 = r11.getFloat(r1, r3)
            r2.mMotionStagger = r1
            goto L51e
        L174:
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r2 = r10.propertySet
            int r3 = r2.mVisibilityMode
            int r1 = r11.getInt(r1, r3)
            r2.mVisibilityMode = r1
            goto L51e
        L180:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            java.lang.String r1 = r11.getString(r1)
            r2.mConstraintTag = r1
            goto L51e
        L18a:
            androidx.constraintlayout.widget.ConstraintSet$Motion r2 = r10.motion
            int r3 = r2.mPathMotionArc
            int r1 = r11.getInt(r1, r3)
            r2.mPathMotionArc = r1
            goto L51e
        L196:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            boolean r3 = r2.mBarrierAllowsGoneWidgets
            boolean r1 = r11.getBoolean(r1, r3)
            r2.mBarrierAllowsGoneWidgets = r1
            goto L51e
        L1a2:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            java.lang.String r1 = r11.getString(r1)
            r2.mReferenceIdString = r1
            goto L51e
        L1ac:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.mBarrierMargin
            int r1 = r11.getDimensionPixelSize(r1, r3)
            r2.mBarrierMargin = r1
            goto L51e
        L1b8:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.mBarrierDirection
            int r1 = r11.getInt(r1, r3)
            r2.mBarrierDirection = r1
            goto L51e
        L1c4:
            java.lang.String r1 = "CURRENTLY UNSUPPORTED"
            android.util.Log.e(r7, r1)
            goto L51e
        L1cb:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            float r1 = r11.getFloat(r1, r5)
            r2.heightPercent = r1
            goto L51e
        L1d5:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            float r1 = r11.getFloat(r1, r5)
            r2.widthPercent = r1
            goto L51e
        L1df:
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r2 = r10.propertySet
            float r3 = r2.mProgress
            float r1 = r11.getFloat(r1, r3)
            r2.mProgress = r1
            goto L51e
        L1eb:
            androidx.constraintlayout.widget.ConstraintSet$Motion r2 = r10.motion
            float r3 = r2.mPathRotate
            float r1 = r11.getFloat(r1, r3)
            r2.mPathRotate = r1
            goto L51e
        L1f7:
            androidx.constraintlayout.widget.ConstraintSet$Motion r2 = r10.motion
            int r1 = r11.getInt(r1, r12)
            r2.mDrawPath = r1
            goto L51e
        L201:
            android.util.TypedValue r2 = r11.peekValue(r1)
            int r2 = r2.type
            if (r2 != r6) goto L213
            androidx.constraintlayout.widget.ConstraintSet$Motion r2 = r10.motion
            java.lang.String r1 = r11.getString(r1)
            r2.mTransitionEasing = r1
            goto L51e
        L213:
            androidx.constraintlayout.widget.ConstraintSet$Motion r2 = r10.motion
            java.lang.String[] r3 = androidx.constraintlayout.core.motion.utils.Easing.NAMED_EASING
            int r1 = r11.getInteger(r1, r12)
            r1 = r3[r1]
            r2.mTransitionEasing = r1
            goto L51e
        L221:
            androidx.constraintlayout.widget.ConstraintSet$Motion r2 = r10.motion
            int r3 = r2.mAnimateRelativeTo
            int r1 = lookupID(r11, r1, r3)
            r2.mAnimateRelativeTo = r1
            goto L51e
        L22d:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            float r3 = r2.circleAngle
            float r1 = r11.getFloat(r1, r3)
            r2.circleAngle = r1
            goto L51e
        L239:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.circleRadius
            int r1 = r11.getDimensionPixelSize(r1, r3)
            r2.circleRadius = r1
            goto L51e
        L245:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.circleConstraint
            int r1 = lookupID(r11, r1, r3)
            r2.circleConstraint = r1
            goto L51e
        L251:
            androidx.constraintlayout.widget.ConstraintSet$Transform r2 = r10.transform
            float r3 = r2.rotation
            float r1 = r11.getFloat(r1, r3)
            r2.rotation = r1
            goto L51e
        L25d:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.heightMin
            int r1 = r11.getDimensionPixelSize(r1, r3)
            r2.heightMin = r1
            goto L51e
        L269:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.widthMin
            int r1 = r11.getDimensionPixelSize(r1, r3)
            r2.widthMin = r1
            goto L51e
        L275:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.heightMax
            int r1 = r11.getDimensionPixelSize(r1, r3)
            r2.heightMax = r1
            goto L51e
        L281:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.widthMax
            int r1 = r11.getDimensionPixelSize(r1, r3)
            r2.widthMax = r1
            goto L51e
        L28d:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.heightDefault
            int r1 = r11.getInt(r1, r3)
            r2.heightDefault = r1
            goto L51e
        L299:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.widthDefault
            int r1 = r11.getInt(r1, r3)
            r2.widthDefault = r1
            goto L51e
        L2a5:
            androidx.constraintlayout.widget.ConstraintSet$Transform r2 = r10.transform
            float r3 = r2.translationZ
            float r1 = r11.getDimension(r1, r3)
            r2.translationZ = r1
            goto L51e
        L2b1:
            androidx.constraintlayout.widget.ConstraintSet$Transform r2 = r10.transform
            float r3 = r2.translationY
            float r1 = r11.getDimension(r1, r3)
            r2.translationY = r1
            goto L51e
        L2bd:
            androidx.constraintlayout.widget.ConstraintSet$Transform r2 = r10.transform
            float r3 = r2.translationX
            float r1 = r11.getDimension(r1, r3)
            r2.translationX = r1
            goto L51e
        L2c9:
            androidx.constraintlayout.widget.ConstraintSet$Transform r2 = r10.transform
            float r3 = r2.transformPivotY
            float r1 = r11.getDimension(r1, r3)
            r2.transformPivotY = r1
            goto L51e
        L2d5:
            androidx.constraintlayout.widget.ConstraintSet$Transform r2 = r10.transform
            float r3 = r2.transformPivotX
            float r1 = r11.getDimension(r1, r3)
            r2.transformPivotX = r1
            goto L51e
        L2e1:
            androidx.constraintlayout.widget.ConstraintSet$Transform r2 = r10.transform
            float r3 = r2.scaleY
            float r1 = r11.getFloat(r1, r3)
            r2.scaleY = r1
            goto L51e
        L2ed:
            androidx.constraintlayout.widget.ConstraintSet$Transform r2 = r10.transform
            float r3 = r2.scaleX
            float r1 = r11.getFloat(r1, r3)
            r2.scaleX = r1
            goto L51e
        L2f9:
            androidx.constraintlayout.widget.ConstraintSet$Transform r2 = r10.transform
            float r3 = r2.rotationY
            float r1 = r11.getFloat(r1, r3)
            r2.rotationY = r1
            goto L51e
        L305:
            androidx.constraintlayout.widget.ConstraintSet$Transform r2 = r10.transform
            float r3 = r2.rotationX
            float r1 = r11.getFloat(r1, r3)
            r2.rotationX = r1
            goto L51e
        L311:
            androidx.constraintlayout.widget.ConstraintSet$Transform r2 = r10.transform
            r2.applyElevation = r3
            float r3 = r2.elevation
            float r1 = r11.getDimension(r1, r3)
            r2.elevation = r1
            goto L51e
        L31f:
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r2 = r10.propertySet
            float r3 = r2.alpha
            float r1 = r11.getFloat(r1, r3)
            r2.alpha = r1
            goto L51e
        L32b:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.verticalChainStyle
            int r1 = r11.getInt(r1, r3)
            r2.verticalChainStyle = r1
            goto L51e
        L337:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.horizontalChainStyle
            int r1 = r11.getInt(r1, r3)
            r2.horizontalChainStyle = r1
            goto L51e
        L343:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            float r3 = r2.verticalWeight
            float r1 = r11.getFloat(r1, r3)
            r2.verticalWeight = r1
            goto L51e
        L34f:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            float r3 = r2.horizontalWeight
            float r1 = r11.getFloat(r1, r3)
            r2.horizontalWeight = r1
            goto L51e
        L35b:
            int r2 = r10.mViewId
            int r1 = r11.getResourceId(r1, r2)
            r10.mViewId = r1
            goto L51e
        L365:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            float r3 = r2.verticalBias
            float r1 = r11.getFloat(r1, r3)
            r2.verticalBias = r1
            goto L51e
        L371:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.topToTop
            int r1 = lookupID(r11, r1, r3)
            r2.topToTop = r1
            goto L51e
        L37d:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.topToBottom
            int r1 = lookupID(r11, r1, r3)
            r2.topToBottom = r1
            goto L51e
        L389:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.topMargin
            int r1 = r11.getDimensionPixelSize(r1, r3)
            r2.topMargin = r1
            goto L51e
        L395:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.startToStart
            int r1 = lookupID(r11, r1, r3)
            r2.startToStart = r1
            goto L51e
        L3a1:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.startToEnd
            int r1 = lookupID(r11, r1, r3)
            r2.startToEnd = r1
            goto L51e
        L3ad:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.startMargin
            int r1 = r11.getDimensionPixelSize(r1, r3)
            r2.startMargin = r1
            goto L51e
        L3b9:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.rightToRight
            int r1 = lookupID(r11, r1, r3)
            r2.rightToRight = r1
            goto L51e
        L3c5:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.rightToLeft
            int r1 = lookupID(r11, r1, r3)
            r2.rightToLeft = r1
            goto L51e
        L3d1:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.rightMargin
            int r1 = r11.getDimensionPixelSize(r1, r3)
            r2.rightMargin = r1
            goto L51e
        L3dd:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.orientation
            int r1 = r11.getInt(r1, r3)
            r2.orientation = r1
            goto L51e
        L3e9:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.leftToRight
            int r1 = lookupID(r11, r1, r3)
            r2.leftToRight = r1
            goto L51e
        L3f5:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.leftToLeft
            int r1 = lookupID(r11, r1, r3)
            r2.leftToLeft = r1
            goto L51e
        L401:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.leftMargin
            int r1 = r11.getDimensionPixelSize(r1, r3)
            r2.leftMargin = r1
            goto L51e
        L40d:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.mWidth
            int r1 = r11.getLayoutDimension(r1, r3)
            r2.mWidth = r1
            goto L51e
        L419:
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r2 = r10.propertySet
            int r3 = r2.visibility
            int r1 = r11.getInt(r1, r3)
            r2.visibility = r1
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r1 = r10.propertySet
            int[] r2 = androidx.constraintlayout.widget.ConstraintSet.VISIBILITY_FLAGS
            int r3 = r1.visibility
            r2 = r2[r3]
            r1.visibility = r2
            goto L51e
        L42f:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.mHeight
            int r1 = r11.getLayoutDimension(r1, r3)
            r2.mHeight = r1
            goto L51e
        L43b:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            float r3 = r2.horizontalBias
            float r1 = r11.getFloat(r1, r3)
            r2.horizontalBias = r1
            goto L51e
        L447:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            float r3 = r2.guidePercent
            float r1 = r11.getFloat(r1, r3)
            r2.guidePercent = r1
            goto L51e
        L453:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.guideEnd
            int r1 = r11.getDimensionPixelOffset(r1, r3)
            r2.guideEnd = r1
            goto L51e
        L45f:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.guideBegin
            int r1 = r11.getDimensionPixelOffset(r1, r3)
            r2.guideBegin = r1
            goto L51e
        L46b:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.goneTopMargin
            int r1 = r11.getDimensionPixelSize(r1, r3)
            r2.goneTopMargin = r1
            goto L51e
        L477:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.goneStartMargin
            int r1 = r11.getDimensionPixelSize(r1, r3)
            r2.goneStartMargin = r1
            goto L51e
        L483:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.goneRightMargin
            int r1 = r11.getDimensionPixelSize(r1, r3)
            r2.goneRightMargin = r1
            goto L51e
        L48f:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.goneLeftMargin
            int r1 = r11.getDimensionPixelSize(r1, r3)
            r2.goneLeftMargin = r1
            goto L51e
        L49b:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.goneEndMargin
            int r1 = r11.getDimensionPixelSize(r1, r3)
            r2.goneEndMargin = r1
            goto L51e
        L4a7:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.goneBottomMargin
            int r1 = r11.getDimensionPixelSize(r1, r3)
            r2.goneBottomMargin = r1
            goto L51e
        L4b3:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.endToStart
            int r1 = lookupID(r11, r1, r3)
            r2.endToStart = r1
            goto L51e
        L4be:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.endToEnd
            int r1 = lookupID(r11, r1, r3)
            r2.endToEnd = r1
            goto L51e
        L4c9:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.endMargin
            int r1 = r11.getDimensionPixelSize(r1, r3)
            r2.endMargin = r1
            goto L51e
        L4d4:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.editorAbsoluteY
            int r1 = r11.getDimensionPixelOffset(r1, r3)
            r2.editorAbsoluteY = r1
            goto L51e
        L4df:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.editorAbsoluteX
            int r1 = r11.getDimensionPixelOffset(r1, r3)
            r2.editorAbsoluteX = r1
            goto L51e
        L4ea:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            java.lang.String r1 = r11.getString(r1)
            r2.dimensionRatio = r1
            goto L51e
        L4f3:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.bottomToTop
            int r1 = lookupID(r11, r1, r3)
            r2.bottomToTop = r1
            goto L51e
        L4fe:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.bottomToBottom
            int r1 = lookupID(r11, r1, r3)
            r2.bottomToBottom = r1
            goto L51e
        L509:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.bottomMargin
            int r1 = r11.getDimensionPixelSize(r1, r3)
            r2.bottomMargin = r1
            goto L51e
        L514:
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r10.layout
            int r3 = r2.baselineToBaseline
            int r1 = lookupID(r11, r1, r3)
            r2.baselineToBaseline = r1
        L51e:
            int r0 = r0 + 1
            goto Lc
        L522:
            androidx.constraintlayout.widget.ConstraintSet$Layout r9 = r10.layout
            java.lang.String r10 = r9.mReferenceIdString
            if (r10 == 0) goto L52b
            r10 = 0
            r9.mReferenceIds = r10
        L52b:
            return
    }

    private static void populateOverride(android.content.Context r11, androidx.constraintlayout.widget.ConstraintSet.Constraint r12, android.content.res.TypedArray r13) {
            int r11 = r13.getIndexCount()
            androidx.constraintlayout.widget.ConstraintSet$Constraint$Delta r0 = new androidx.constraintlayout.widget.ConstraintSet$Constraint$Delta
            r0.<init>()
            r12.mDelta = r0
            androidx.constraintlayout.widget.ConstraintSet$Motion r1 = r12.motion
            r2 = 0
            r1.mApply = r2
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r12.layout
            r1.mApply = r2
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r1 = r12.propertySet
            r1.mApply = r2
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r12.transform
            r1.mApply = r2
            r1 = 0
        L1d:
            if (r1 >= r11) goto L583
            int r3 = r13.getIndex(r1)
            android.util.SparseIntArray r4 = androidx.constraintlayout.widget.ConstraintSet.overrideMapToConstant
            int r4 = r4.get(r3)
            r5 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r6 = "   "
            r7 = 3
            java.lang.String r8 = "ConstraintSet"
            r9 = 1
            r10 = -1
            switch(r4) {
                case 2: goto L573;
                case 3: goto L35;
                case 4: goto L35;
                case 5: goto L56a;
                case 6: goto L55d;
                case 7: goto L550;
                case 8: goto L542;
                case 9: goto L35;
                case 10: goto L35;
                case 11: goto L534;
                case 12: goto L526;
                case 13: goto L518;
                case 14: goto L50a;
                case 15: goto L4fb;
                case 16: goto L4ec;
                case 17: goto L4dd;
                case 18: goto L4ce;
                case 19: goto L4bf;
                case 20: goto L4b0;
                case 21: goto L4a1;
                case 22: goto L48e;
                case 23: goto L47f;
                case 24: goto L470;
                case 25: goto L35;
                case 26: goto L35;
                case 27: goto L461;
                case 28: goto L452;
                case 29: goto L35;
                case 30: goto L35;
                case 31: goto L443;
                case 32: goto L35;
                case 33: goto L35;
                case 34: goto L434;
                case 35: goto L35;
                case 36: goto L35;
                case 37: goto L425;
                case 38: goto L416;
                case 39: goto L407;
                case 40: goto L3f8;
                case 41: goto L3e9;
                case 42: goto L3da;
                case 43: goto L3cb;
                case 44: goto L3b9;
                case 45: goto L3aa;
                case 46: goto L39b;
                case 47: goto L38c;
                case 48: goto L37d;
                case 49: goto L36e;
                case 50: goto L35f;
                case 51: goto L350;
                case 52: goto L341;
                case 53: goto L332;
                case 54: goto L323;
                case 55: goto L314;
                case 56: goto L305;
                case 57: goto L2f6;
                case 58: goto L2e7;
                case 59: goto L2d8;
                case 60: goto L2c9;
                case 61: goto L35;
                case 62: goto L2ba;
                case 63: goto L2ab;
                case 64: goto L29c;
                case 65: goto L27c;
                case 66: goto L271;
                case 67: goto L262;
                case 68: goto L253;
                case 69: goto L248;
                case 70: goto L23d;
                case 71: goto L236;
                case 72: goto L227;
                case 73: goto L218;
                case 74: goto L20d;
                case 75: goto L1fe;
                case 76: goto L1ef;
                case 77: goto L1e4;
                case 78: goto L1d5;
                case 79: goto L1c6;
                case 80: goto L1b7;
                case 81: goto L1a8;
                case 82: goto L199;
                case 83: goto L18a;
                case 84: goto L17b;
                case 85: goto L16c;
                case 86: goto Lf0;
                case 87: goto Lcd;
                case 88: goto L35;
                case 89: goto L35;
                case 90: goto L35;
                case 91: goto L35;
                case 92: goto L35;
                case 93: goto Lbe;
                case 94: goto Laf;
                case 95: goto Laa;
                case 96: goto La5;
                case 97: goto L96;
                case 98: goto L66;
                case 99: goto L57;
                default: goto L35;
            }
        L35:
            java.lang.String r4 = "Unknown attribute 0x"
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            java.lang.String r5 = java.lang.Integer.toHexString(r3)
            r4.append(r5)
            r4.append(r6)
            android.util.SparseIntArray r5 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r3 = r5.get(r3)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r8, r3)
            goto L57f
        L57:
            r4 = 99
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            boolean r5 = r5.guidelineUseRtl
            boolean r3 = r13.getBoolean(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L66:
            boolean r4 = androidx.constraintlayout.motion.widget.MotionLayout.IS_IN_EDIT_MODE
            if (r4 == 0) goto L7c
            int r4 = r12.mViewId
            int r4 = r13.getResourceId(r3, r4)
            r12.mViewId = r4
            if (r4 != r10) goto L57f
            java.lang.String r3 = r13.getString(r3)
            r12.mTargetString = r3
            goto L57f
        L7c:
            android.util.TypedValue r4 = r13.peekValue(r3)
            int r4 = r4.type
            if (r4 != r7) goto L8c
            java.lang.String r3 = r13.getString(r3)
            r12.mTargetString = r3
            goto L57f
        L8c:
            int r4 = r12.mViewId
            int r3 = r13.getResourceId(r3, r4)
            r12.mViewId = r3
            goto L57f
        L96:
            r4 = 97
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.mWrapBehavior
            int r3 = r13.getInt(r3, r5)
            r0.add(r4, r3)
            goto L57f
        La5:
            parseDimensionConstraints(r0, r13, r3, r9)
            goto L57f
        Laa:
            parseDimensionConstraints(r0, r13, r3, r2)
            goto L57f
        Laf:
            r4 = 94
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.goneBaselineMargin
            int r3 = r13.getDimensionPixelSize(r3, r5)
            r0.add(r4, r3)
            goto L57f
        Lbe:
            r4 = 93
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.baselineMargin
            int r3 = r13.getDimensionPixelSize(r3, r5)
            r0.add(r4, r3)
            goto L57f
        Lcd:
            java.lang.String r4 = "unused attribute 0x"
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            java.lang.String r5 = java.lang.Integer.toHexString(r3)
            r4.append(r5)
            r4.append(r6)
            android.util.SparseIntArray r5 = androidx.constraintlayout.widget.ConstraintSet.mapToConstant
            int r3 = r5.get(r3)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r8, r3)
            goto L57f
        Lf0:
            android.util.TypedValue r4 = r13.peekValue(r3)
            int r4 = r4.type
            r5 = -2
            r6 = 89
            r8 = 88
            if (r4 != r9) goto L119
            androidx.constraintlayout.widget.ConstraintSet$Motion r4 = r12.motion
            int r3 = r13.getResourceId(r3, r10)
            r4.mQuantizeInterpolatorID = r3
            androidx.constraintlayout.widget.ConstraintSet$Motion r3 = r12.motion
            int r3 = r3.mQuantizeInterpolatorID
            r0.add(r6, r3)
            androidx.constraintlayout.widget.ConstraintSet$Motion r3 = r12.motion
            int r4 = r3.mQuantizeInterpolatorID
            if (r4 == r10) goto L57f
            r3.mQuantizeInterpolatorType = r5
            r0.add(r8, r5)
            goto L57f
        L119:
            if (r4 != r7) goto L159
            androidx.constraintlayout.widget.ConstraintSet$Motion r4 = r12.motion
            java.lang.String r7 = r13.getString(r3)
            r4.mQuantizeInterpolatorString = r7
            r4 = 90
            androidx.constraintlayout.widget.ConstraintSet$Motion r7 = r12.motion
            java.lang.String r7 = r7.mQuantizeInterpolatorString
            r0.add(r4, r7)
            androidx.constraintlayout.widget.ConstraintSet$Motion r4 = r12.motion
            java.lang.String r4 = r4.mQuantizeInterpolatorString
            java.lang.String r7 = "/"
            int r4 = r4.indexOf(r7)
            if (r4 <= 0) goto L150
            androidx.constraintlayout.widget.ConstraintSet$Motion r4 = r12.motion
            int r3 = r13.getResourceId(r3, r10)
            r4.mQuantizeInterpolatorID = r3
            androidx.constraintlayout.widget.ConstraintSet$Motion r3 = r12.motion
            int r3 = r3.mQuantizeInterpolatorID
            r0.add(r6, r3)
            androidx.constraintlayout.widget.ConstraintSet$Motion r3 = r12.motion
            r3.mQuantizeInterpolatorType = r5
            r0.add(r8, r5)
            goto L57f
        L150:
            androidx.constraintlayout.widget.ConstraintSet$Motion r3 = r12.motion
            r3.mQuantizeInterpolatorType = r10
            r0.add(r8, r10)
            goto L57f
        L159:
            androidx.constraintlayout.widget.ConstraintSet$Motion r4 = r12.motion
            int r5 = r4.mQuantizeInterpolatorID
            int r3 = r13.getInteger(r3, r5)
            r4.mQuantizeInterpolatorType = r3
            androidx.constraintlayout.widget.ConstraintSet$Motion r3 = r12.motion
            int r3 = r3.mQuantizeInterpolatorType
            r0.add(r8, r3)
            goto L57f
        L16c:
            r4 = 85
            androidx.constraintlayout.widget.ConstraintSet$Motion r5 = r12.motion
            float r5 = r5.mQuantizeMotionPhase
            float r3 = r13.getFloat(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L17b:
            r4 = 84
            androidx.constraintlayout.widget.ConstraintSet$Motion r5 = r12.motion
            int r5 = r5.mQuantizeMotionSteps
            int r3 = r13.getInteger(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L18a:
            r4 = 83
            androidx.constraintlayout.widget.ConstraintSet$Transform r5 = r12.transform
            int r5 = r5.transformPivotTarget
            int r3 = lookupID(r13, r3, r5)
            r0.add(r4, r3)
            goto L57f
        L199:
            r4 = 82
            androidx.constraintlayout.widget.ConstraintSet$Motion r5 = r12.motion
            int r5 = r5.mAnimateCircleAngleTo
            int r3 = r13.getInteger(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L1a8:
            r4 = 81
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            boolean r5 = r5.constrainedHeight
            boolean r3 = r13.getBoolean(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L1b7:
            r4 = 80
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            boolean r5 = r5.constrainedWidth
            boolean r3 = r13.getBoolean(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L1c6:
            r4 = 79
            androidx.constraintlayout.widget.ConstraintSet$Motion r5 = r12.motion
            float r5 = r5.mMotionStagger
            float r3 = r13.getFloat(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L1d5:
            r4 = 78
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r5 = r12.propertySet
            int r5 = r5.mVisibilityMode
            int r3 = r13.getInt(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L1e4:
            r4 = 77
            java.lang.String r3 = r13.getString(r3)
            r0.add(r4, r3)
            goto L57f
        L1ef:
            r4 = 76
            androidx.constraintlayout.widget.ConstraintSet$Motion r5 = r12.motion
            int r5 = r5.mPathMotionArc
            int r3 = r13.getInt(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L1fe:
            r4 = 75
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            boolean r5 = r5.mBarrierAllowsGoneWidgets
            boolean r3 = r13.getBoolean(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L20d:
            r4 = 74
            java.lang.String r3 = r13.getString(r3)
            r0.add(r4, r3)
            goto L57f
        L218:
            r4 = 73
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.mBarrierMargin
            int r3 = r13.getDimensionPixelSize(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L227:
            r4 = 72
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.mBarrierDirection
            int r3 = r13.getInt(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L236:
            java.lang.String r3 = "CURRENTLY UNSUPPORTED"
            android.util.Log.e(r8, r3)
            goto L57f
        L23d:
            r4 = 70
            float r3 = r13.getFloat(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L248:
            r4 = 69
            float r3 = r13.getFloat(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L253:
            r4 = 68
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r5 = r12.propertySet
            float r5 = r5.mProgress
            float r3 = r13.getFloat(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L262:
            r4 = 67
            androidx.constraintlayout.widget.ConstraintSet$Motion r5 = r12.motion
            float r5 = r5.mPathRotate
            float r3 = r13.getFloat(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L271:
            r4 = 66
            int r3 = r13.getInt(r3, r2)
            r0.add(r4, r3)
            goto L57f
        L27c:
            android.util.TypedValue r4 = r13.peekValue(r3)
            int r4 = r4.type
            r5 = 65
            if (r4 != r7) goto L28f
            java.lang.String r3 = r13.getString(r3)
            r0.add(r5, r3)
            goto L57f
        L28f:
            java.lang.String[] r4 = androidx.constraintlayout.core.motion.utils.Easing.NAMED_EASING
            int r3 = r13.getInteger(r3, r2)
            r3 = r4[r3]
            r0.add(r5, r3)
            goto L57f
        L29c:
            r4 = 64
            androidx.constraintlayout.widget.ConstraintSet$Motion r5 = r12.motion
            int r5 = r5.mAnimateRelativeTo
            int r3 = lookupID(r13, r3, r5)
            r0.add(r4, r3)
            goto L57f
        L2ab:
            r4 = 63
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            float r5 = r5.circleAngle
            float r3 = r13.getFloat(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L2ba:
            r4 = 62
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.circleRadius
            int r3 = r13.getDimensionPixelSize(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L2c9:
            r4 = 60
            androidx.constraintlayout.widget.ConstraintSet$Transform r5 = r12.transform
            float r5 = r5.rotation
            float r3 = r13.getFloat(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L2d8:
            r4 = 59
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.heightMin
            int r3 = r13.getDimensionPixelSize(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L2e7:
            r4 = 58
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.widthMin
            int r3 = r13.getDimensionPixelSize(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L2f6:
            r4 = 57
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.heightMax
            int r3 = r13.getDimensionPixelSize(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L305:
            r4 = 56
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.widthMax
            int r3 = r13.getDimensionPixelSize(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L314:
            r4 = 55
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.heightDefault
            int r3 = r13.getInt(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L323:
            r4 = 54
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.widthDefault
            int r3 = r13.getInt(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L332:
            r4 = 53
            androidx.constraintlayout.widget.ConstraintSet$Transform r5 = r12.transform
            float r5 = r5.translationZ
            float r3 = r13.getDimension(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L341:
            r4 = 52
            androidx.constraintlayout.widget.ConstraintSet$Transform r5 = r12.transform
            float r5 = r5.translationY
            float r3 = r13.getDimension(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L350:
            r4 = 51
            androidx.constraintlayout.widget.ConstraintSet$Transform r5 = r12.transform
            float r5 = r5.translationX
            float r3 = r13.getDimension(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L35f:
            r4 = 50
            androidx.constraintlayout.widget.ConstraintSet$Transform r5 = r12.transform
            float r5 = r5.transformPivotY
            float r3 = r13.getDimension(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L36e:
            r4 = 49
            androidx.constraintlayout.widget.ConstraintSet$Transform r5 = r12.transform
            float r5 = r5.transformPivotX
            float r3 = r13.getDimension(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L37d:
            r4 = 48
            androidx.constraintlayout.widget.ConstraintSet$Transform r5 = r12.transform
            float r5 = r5.scaleY
            float r3 = r13.getFloat(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L38c:
            r4 = 47
            androidx.constraintlayout.widget.ConstraintSet$Transform r5 = r12.transform
            float r5 = r5.scaleX
            float r3 = r13.getFloat(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L39b:
            r4 = 46
            androidx.constraintlayout.widget.ConstraintSet$Transform r5 = r12.transform
            float r5 = r5.rotationY
            float r3 = r13.getFloat(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L3aa:
            r4 = 45
            androidx.constraintlayout.widget.ConstraintSet$Transform r5 = r12.transform
            float r5 = r5.rotationX
            float r3 = r13.getFloat(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L3b9:
            r4 = 44
            r0.add(r4, r9)
            androidx.constraintlayout.widget.ConstraintSet$Transform r5 = r12.transform
            float r5 = r5.elevation
            float r3 = r13.getDimension(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L3cb:
            r4 = 43
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r5 = r12.propertySet
            float r5 = r5.alpha
            float r3 = r13.getFloat(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L3da:
            r4 = 42
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.verticalChainStyle
            int r3 = r13.getInt(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L3e9:
            r4 = 41
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.horizontalChainStyle
            int r3 = r13.getInt(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L3f8:
            r4 = 40
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            float r5 = r5.verticalWeight
            float r3 = r13.getFloat(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L407:
            r4 = 39
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            float r5 = r5.horizontalWeight
            float r3 = r13.getFloat(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L416:
            int r4 = r12.mViewId
            int r3 = r13.getResourceId(r3, r4)
            r12.mViewId = r3
            r4 = 38
            r0.add(r4, r3)
            goto L57f
        L425:
            r4 = 37
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            float r5 = r5.verticalBias
            float r3 = r13.getFloat(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L434:
            r4 = 34
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.topMargin
            int r3 = r13.getDimensionPixelSize(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L443:
            r4 = 31
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.startMargin
            int r3 = r13.getDimensionPixelSize(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L452:
            r4 = 28
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.rightMargin
            int r3 = r13.getDimensionPixelSize(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L461:
            r4 = 27
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.orientation
            int r3 = r13.getInt(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L470:
            r4 = 24
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.leftMargin
            int r3 = r13.getDimensionPixelSize(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L47f:
            r4 = 23
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.mWidth
            int r3 = r13.getLayoutDimension(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L48e:
            r4 = 22
            int[] r5 = androidx.constraintlayout.widget.ConstraintSet.VISIBILITY_FLAGS
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r6 = r12.propertySet
            int r6 = r6.visibility
            int r3 = r13.getInt(r3, r6)
            r3 = r5[r3]
            r0.add(r4, r3)
            goto L57f
        L4a1:
            r4 = 21
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.mHeight
            int r3 = r13.getLayoutDimension(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L4b0:
            r4 = 20
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            float r5 = r5.horizontalBias
            float r3 = r13.getFloat(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L4bf:
            r4 = 19
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            float r5 = r5.guidePercent
            float r3 = r13.getFloat(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L4ce:
            r4 = 18
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.guideEnd
            int r3 = r13.getDimensionPixelOffset(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L4dd:
            r4 = 17
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.guideBegin
            int r3 = r13.getDimensionPixelOffset(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L4ec:
            r4 = 16
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.goneTopMargin
            int r3 = r13.getDimensionPixelSize(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L4fb:
            r4 = 15
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.goneStartMargin
            int r3 = r13.getDimensionPixelSize(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L50a:
            r4 = 14
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.goneRightMargin
            int r3 = r13.getDimensionPixelSize(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L518:
            r4 = 13
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.goneLeftMargin
            int r3 = r13.getDimensionPixelSize(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L526:
            r4 = 12
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.goneEndMargin
            int r3 = r13.getDimensionPixelSize(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L534:
            r4 = 11
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.goneBottomMargin
            int r3 = r13.getDimensionPixelSize(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L542:
            r4 = 8
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.endMargin
            int r3 = r13.getDimensionPixelSize(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L550:
            r4 = 7
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.editorAbsoluteY
            int r3 = r13.getDimensionPixelOffset(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L55d:
            r4 = 6
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.editorAbsoluteX
            int r3 = r13.getDimensionPixelOffset(r3, r5)
            r0.add(r4, r3)
            goto L57f
        L56a:
            r4 = 5
            java.lang.String r3 = r13.getString(r3)
            r0.add(r4, r3)
            goto L57f
        L573:
            r4 = 2
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r12.layout
            int r5 = r5.bottomMargin
            int r3 = r13.getDimensionPixelSize(r3, r5)
            r0.add(r4, r3)
        L57f:
            int r1 = r1 + 1
            goto L1d
        L583:
            return
    }

    private static void setDeltaValue(androidx.constraintlayout.widget.ConstraintSet.Constraint r1, int r2, float r3) {
            r0 = 19
            if (r2 == r0) goto Lb3
            r0 = 20
            if (r2 == r0) goto Lae
            r0 = 37
            if (r2 == r0) goto La9
            r0 = 60
            if (r2 == r0) goto La4
            r0 = 63
            if (r2 == r0) goto L9f
            r0 = 79
            if (r2 == r0) goto L9a
            r0 = 85
            if (r2 == r0) goto L95
            r0 = 87
            if (r2 == r0) goto Lb7
            r0 = 39
            if (r2 == r0) goto L90
            r0 = 40
            if (r2 == r0) goto L8b
            switch(r2) {
                case 43: goto L86;
                case 44: goto L7e;
                case 45: goto L79;
                case 46: goto L74;
                case 47: goto L6f;
                case 48: goto L6a;
                case 49: goto L65;
                case 50: goto L60;
                case 51: goto L5b;
                case 52: goto L55;
                case 53: goto L4f;
                default: goto L2b;
            }
        L2b:
            switch(r2) {
                case 67: goto L49;
                case 68: goto L43;
                case 69: goto L3d;
                case 70: goto L37;
                default: goto L2e;
            }
        L2e:
            java.lang.String r1 = "ConstraintSet"
            java.lang.String r2 = "Unknown attribute 0x"
            android.util.Log.w(r1, r2)
            goto Lb7
        L37:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.heightPercent = r3
            goto Lb7
        L3d:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.widthPercent = r3
            goto Lb7
        L43:
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r1 = r1.propertySet
            r1.mProgress = r3
            goto Lb7
        L49:
            androidx.constraintlayout.widget.ConstraintSet$Motion r1 = r1.motion
            r1.mPathRotate = r3
            goto Lb7
        L4f:
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.translationZ = r3
            goto Lb7
        L55:
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.translationY = r3
            goto Lb7
        L5b:
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.translationX = r3
            goto Lb7
        L60:
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.transformPivotY = r3
            goto Lb7
        L65:
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.transformPivotX = r3
            goto Lb7
        L6a:
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.scaleY = r3
            goto Lb7
        L6f:
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.scaleX = r3
            goto Lb7
        L74:
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.rotationY = r3
            goto Lb7
        L79:
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.rotationX = r3
            goto Lb7
        L7e:
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.elevation = r3
            r2 = 1
            r1.applyElevation = r2
            goto Lb7
        L86:
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r1 = r1.propertySet
            r1.alpha = r3
            goto Lb7
        L8b:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.verticalWeight = r3
            goto Lb7
        L90:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.horizontalWeight = r3
            goto Lb7
        L95:
            androidx.constraintlayout.widget.ConstraintSet$Motion r1 = r1.motion
            r1.mQuantizeMotionPhase = r3
            goto Lb7
        L9a:
            androidx.constraintlayout.widget.ConstraintSet$Motion r1 = r1.motion
            r1.mMotionStagger = r3
            goto Lb7
        L9f:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.circleAngle = r3
            goto Lb7
        La4:
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.rotation = r3
            goto Lb7
        La9:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.verticalBias = r3
            goto Lb7
        Lae:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.horizontalBias = r3
            goto Lb7
        Lb3:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.guidePercent = r3
        Lb7:
            return
    }

    private static void setDeltaValue(androidx.constraintlayout.widget.ConstraintSet.Constraint r1, int r2, int r3) {
            r0 = 6
            if (r2 == r0) goto L136
            r0 = 7
            if (r2 == r0) goto L131
            r0 = 8
            if (r2 == r0) goto L12c
            r0 = 27
            if (r2 == r0) goto L127
            r0 = 28
            if (r2 == r0) goto L122
            r0 = 41
            if (r2 == r0) goto L11d
            r0 = 42
            if (r2 == r0) goto L118
            r0 = 61
            if (r2 == r0) goto L113
            r0 = 62
            if (r2 == r0) goto L10e
            r0 = 72
            if (r2 == r0) goto L109
            r0 = 73
            if (r2 == r0) goto L104
            switch(r2) {
                case 2: goto Lff;
                case 11: goto Lfa;
                case 12: goto Lf5;
                case 13: goto Lf0;
                case 14: goto Leb;
                case 15: goto Le6;
                case 16: goto Le1;
                case 17: goto Ldc;
                case 18: goto Ld6;
                case 31: goto Ld0;
                case 34: goto Lca;
                case 38: goto Lc6;
                case 64: goto Lc0;
                case 66: goto Lba;
                case 76: goto Lb4;
                case 78: goto Lae;
                case 93: goto La8;
                case 94: goto La2;
                case 97: goto L9c;
                default: goto L2d;
            }
        L2d:
            switch(r2) {
                case 21: goto L96;
                case 22: goto L90;
                case 23: goto L8a;
                case 24: goto L84;
                default: goto L30;
            }
        L30:
            switch(r2) {
                case 54: goto L7e;
                case 55: goto L78;
                case 56: goto L72;
                case 57: goto L6c;
                case 58: goto L66;
                case 59: goto L60;
                default: goto L33;
            }
        L33:
            switch(r2) {
                case 82: goto L5a;
                case 83: goto L54;
                case 84: goto L4e;
                default: goto L36;
            }
        L36:
            switch(r2) {
                case 87: goto L13a;
                case 88: goto L48;
                case 89: goto L42;
                default: goto L39;
            }
        L39:
            java.lang.String r1 = "ConstraintSet"
            java.lang.String r2 = "Unknown attribute 0x"
            android.util.Log.w(r1, r2)
            goto L13a
        L42:
            androidx.constraintlayout.widget.ConstraintSet$Motion r1 = r1.motion
            r1.mQuantizeInterpolatorID = r3
            goto L13a
        L48:
            androidx.constraintlayout.widget.ConstraintSet$Motion r1 = r1.motion
            r1.mQuantizeInterpolatorType = r3
            goto L13a
        L4e:
            androidx.constraintlayout.widget.ConstraintSet$Motion r1 = r1.motion
            r1.mQuantizeMotionSteps = r3
            goto L13a
        L54:
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.transformPivotTarget = r3
            goto L13a
        L5a:
            androidx.constraintlayout.widget.ConstraintSet$Motion r1 = r1.motion
            r1.mAnimateCircleAngleTo = r3
            goto L13a
        L60:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.heightMin = r3
            goto L13a
        L66:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.widthMin = r3
            goto L13a
        L6c:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.heightMax = r3
            goto L13a
        L72:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.widthMax = r3
            goto L13a
        L78:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.heightDefault = r3
            goto L13a
        L7e:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.widthDefault = r3
            goto L13a
        L84:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.leftMargin = r3
            goto L13a
        L8a:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.mWidth = r3
            goto L13a
        L90:
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r1 = r1.propertySet
            r1.visibility = r3
            goto L13a
        L96:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.mHeight = r3
            goto L13a
        L9c:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.mWrapBehavior = r3
            goto L13a
        La2:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.goneBaselineMargin = r3
            goto L13a
        La8:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.baselineMargin = r3
            goto L13a
        Lae:
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r1 = r1.propertySet
            r1.mVisibilityMode = r3
            goto L13a
        Lb4:
            androidx.constraintlayout.widget.ConstraintSet$Motion r1 = r1.motion
            r1.mPathMotionArc = r3
            goto L13a
        Lba:
            androidx.constraintlayout.widget.ConstraintSet$Motion r1 = r1.motion
            r1.mDrawPath = r3
            goto L13a
        Lc0:
            androidx.constraintlayout.widget.ConstraintSet$Motion r1 = r1.motion
            r1.mAnimateRelativeTo = r3
            goto L13a
        Lc6:
            r1.mViewId = r3
            goto L13a
        Lca:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.topMargin = r3
            goto L13a
        Ld0:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.startMargin = r3
            goto L13a
        Ld6:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.guideEnd = r3
            goto L13a
        Ldc:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.guideBegin = r3
            goto L13a
        Le1:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.goneTopMargin = r3
            goto L13a
        Le6:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.goneStartMargin = r3
            goto L13a
        Leb:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.goneRightMargin = r3
            goto L13a
        Lf0:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.goneLeftMargin = r3
            goto L13a
        Lf5:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.goneEndMargin = r3
            goto L13a
        Lfa:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.goneBottomMargin = r3
            goto L13a
        Lff:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.bottomMargin = r3
            goto L13a
        L104:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.mBarrierMargin = r3
            goto L13a
        L109:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.mBarrierDirection = r3
            goto L13a
        L10e:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.circleRadius = r3
            goto L13a
        L113:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.circleConstraint = r3
            goto L13a
        L118:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.verticalChainStyle = r3
            goto L13a
        L11d:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.horizontalChainStyle = r3
            goto L13a
        L122:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.rightMargin = r3
            goto L13a
        L127:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.orientation = r3
            goto L13a
        L12c:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.endMargin = r3
            goto L13a
        L131:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.editorAbsoluteY = r3
            goto L13a
        L136:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.editorAbsoluteX = r3
        L13a:
            return
    }

    private static void setDeltaValue(androidx.constraintlayout.widget.ConstraintSet.Constraint r1, int r2, java.lang.String r3) {
            r0 = 5
            if (r2 == r0) goto L36
            r0 = 65
            if (r2 == r0) goto L31
            r0 = 74
            if (r2 == r0) goto L29
            r0 = 77
            if (r2 == r0) goto L24
            r0 = 87
            if (r2 == r0) goto L3a
            r0 = 90
            if (r2 == r0) goto L1f
            java.lang.String r1 = "ConstraintSet"
            java.lang.String r2 = "Unknown attribute 0x"
            android.util.Log.w(r1, r2)
            goto L3a
        L1f:
            androidx.constraintlayout.widget.ConstraintSet$Motion r1 = r1.motion
            r1.mQuantizeInterpolatorString = r3
            goto L3a
        L24:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.mConstraintTag = r3
            goto L3a
        L29:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.mReferenceIdString = r3
            r2 = 0
            r1.mReferenceIds = r2
            goto L3a
        L31:
            androidx.constraintlayout.widget.ConstraintSet$Motion r1 = r1.motion
            r1.mTransitionEasing = r3
            goto L3a
        L36:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.dimensionRatio = r3
        L3a:
            return
    }

    private static void setDeltaValue(androidx.constraintlayout.widget.ConstraintSet.Constraint r1, int r2, boolean r3) {
            r0 = 44
            if (r2 == r0) goto L2b
            r0 = 75
            if (r2 == r0) goto L26
            r0 = 87
            if (r2 == r0) goto L2f
            r0 = 80
            if (r2 == r0) goto L21
            r0 = 81
            if (r2 == r0) goto L1c
            java.lang.String r1 = "ConstraintSet"
            java.lang.String r2 = "Unknown attribute 0x"
            android.util.Log.w(r1, r2)
            goto L2f
        L1c:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.constrainedHeight = r3
            goto L2f
        L21:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.constrainedWidth = r3
            goto L2f
        L26:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.mBarrierAllowsGoneWidgets = r3
            goto L2f
        L2b:
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.applyElevation = r3
        L2f:
            return
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

    private static java.lang.String[] splitString(java.lang.String r6) {
            char[] r6 = r6.toCharArray()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
            r3 = 0
        Lc:
            int r4 = r6.length
            if (r1 >= r4) goto L2f
            char r4 = r6[r1]
            r5 = 44
            if (r4 != r5) goto L24
            if (r3 != 0) goto L24
            java.lang.String r4 = new java.lang.String
            int r5 = r1 - r2
            r4.<init>(r6, r2, r5)
            r0.add(r4)
            int r2 = r1 + 1
            goto L2c
        L24:
            char r4 = r6[r1]
            r5 = 34
            if (r4 != r5) goto L2c
            r3 = r3 ^ 1
        L2c:
            int r1 = r1 + 1
            goto Lc
        L2f:
            java.lang.String r1 = new java.lang.String
            int r3 = r6.length
            int r3 = r3 - r2
            r1.<init>(r6, r2, r3)
            r0.add(r1)
            int r6 = r0.size()
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r6 = r0.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            return r6
    }

    public void addColorAttributes(java.lang.String... r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.COLOR_TYPE
            r1.addAttributes(r0, r2)
            return
    }

    public void addFloatAttributes(java.lang.String... r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.FLOAT_TYPE
            r1.addAttributes(r0, r2)
            return
    }

    public void addIntAttributes(java.lang.String... r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.INT_TYPE
            r1.addAttributes(r0, r2)
            return
    }

    public void addStringAttributes(java.lang.String... r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintAttribute$AttributeType r0 = androidx.constraintlayout.widget.ConstraintAttribute.AttributeType.STRING_TYPE
            r1.addAttributes(r0, r2)
            return
    }

    public void addToHorizontalChain(int r9, int r10, int r11) {
            r8 = this;
            r6 = 1
            r7 = 2
            if (r10 != 0) goto L6
            r4 = 1
            goto L7
        L6:
            r4 = 2
        L7:
            r5 = 0
            r2 = 1
            r0 = r8
            r1 = r9
            r3 = r10
            r0.connect(r1, r2, r3, r4, r5)
            r2 = 2
            if (r11 != 0) goto L14
            r4 = 2
            goto L15
        L14:
            r4 = 1
        L15:
            r5 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            r0.connect(r1, r2, r3, r4, r5)
            if (r10 == 0) goto L27
            r2 = 2
            r4 = 1
            r5 = 0
            r0 = r8
            r1 = r10
            r3 = r9
            r0.connect(r1, r2, r3, r4, r5)
        L27:
            if (r11 == 0) goto L32
            r2 = 1
            r4 = 2
            r5 = 0
            r0 = r8
            r1 = r11
            r3 = r9
            r0.connect(r1, r2, r3, r4, r5)
        L32:
            return
    }

    public void addToHorizontalChainRTL(int r9, int r10, int r11) {
            r8 = this;
            r6 = 6
            r7 = 7
            if (r10 != 0) goto L6
            r4 = 6
            goto L7
        L6:
            r4 = 7
        L7:
            r5 = 0
            r2 = 6
            r0 = r8
            r1 = r9
            r3 = r10
            r0.connect(r1, r2, r3, r4, r5)
            r2 = 7
            if (r11 != 0) goto L14
            r4 = 7
            goto L15
        L14:
            r4 = 6
        L15:
            r5 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            r0.connect(r1, r2, r3, r4, r5)
            if (r10 == 0) goto L27
            r2 = 7
            r4 = 6
            r5 = 0
            r0 = r8
            r1 = r10
            r3 = r9
            r0.connect(r1, r2, r3, r4, r5)
        L27:
            if (r11 == 0) goto L32
            r2 = 6
            r4 = 7
            r5 = 0
            r0 = r8
            r1 = r11
            r3 = r9
            r0.connect(r1, r2, r3, r4, r5)
        L32:
            return
    }

    public void addToVerticalChain(int r9, int r10, int r11) {
            r8 = this;
            r6 = 3
            r7 = 4
            if (r10 != 0) goto L6
            r4 = 3
            goto L7
        L6:
            r4 = 4
        L7:
            r5 = 0
            r2 = 3
            r0 = r8
            r1 = r9
            r3 = r10
            r0.connect(r1, r2, r3, r4, r5)
            r2 = 4
            if (r11 != 0) goto L14
            r4 = 4
            goto L15
        L14:
            r4 = 3
        L15:
            r5 = 0
            r0 = r8
            r1 = r9
            r3 = r11
            r0.connect(r1, r2, r3, r4, r5)
            if (r10 == 0) goto L27
            r2 = 4
            r4 = 3
            r5 = 0
            r0 = r8
            r1 = r10
            r3 = r9
            r0.connect(r1, r2, r3, r4, r5)
        L27:
            if (r11 == 0) goto L32
            r2 = 3
            r4 = 4
            r5 = 0
            r0 = r8
            r1 = r11
            r3 = r9
            r0.connect(r1, r2, r3, r4, r5)
        L32:
            return
    }

    public void applyCustomAttributes(androidx.constraintlayout.widget.ConstraintLayout r7) {
            r6 = this;
            int r0 = r7.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L65
            android.view.View r2 = r7.getChildAt(r1)
            int r3 = r2.getId()
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r4 = r6.mConstraints
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r4 = r4.containsKey(r5)
            if (r4 != 0) goto L32
            java.lang.String r3 = "id unknown "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            java.lang.String r2 = androidx.constraintlayout.motion.widget.Debug.getName(r2)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "ConstraintSet"
            android.util.Log.w(r3, r2)
            goto L62
        L32:
            boolean r4 = r6.mForceId
            if (r4 == 0) goto L42
            r4 = -1
            if (r3 == r4) goto L3a
            goto L42
        L3a:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            r7.<init>(r0)
            throw r7
        L42:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r4 = r6.mConstraints
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r4 = r4.containsKey(r5)
            if (r4 == 0) goto L62
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r4 = r6.mConstraints
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r4.get(r3)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r3 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r3
            if (r3 != 0) goto L5d
            goto L62
        L5d:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r3.mCustomConstraints
            androidx.constraintlayout.widget.ConstraintAttribute.setAttributes(r2, r3)
        L62:
            int r1 = r1 + 1
            goto L5
        L65:
            return
    }

    public void applyDeltaFrom(androidx.constraintlayout.widget.ConstraintSet r6) {
            r5 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r6 = r6.mConstraints
            java.util.Collection r6 = r6.values()
            java.util.Iterator r6 = r6.iterator()
        La:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r6.next()
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r0
            androidx.constraintlayout.widget.ConstraintSet$Constraint$Delta r1 = r0.mDelta
            if (r1 == 0) goto La
            java.lang.String r1 = r0.mTargetString
            if (r1 == 0) goto L5d
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r1 = r5.mConstraints
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L28:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r5.getConstraint(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r2.layout
            java.lang.String r3 = r3.mConstraintTag
            if (r3 == 0) goto L28
            java.lang.String r4 = r0.mTargetString
            boolean r3 = r4.matches(r3)
            if (r3 == 0) goto L28
            androidx.constraintlayout.widget.ConstraintSet$Constraint$Delta r3 = r0.mDelta
            r3.applyDelta(r2)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r2.mCustomConstraints
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r0.mCustomConstraints
            java.lang.Object r3 = r3.clone()
            java.util.HashMap r3 = (java.util.HashMap) r3
            r2.putAll(r3)
            goto L28
        L5d:
            int r1 = r0.mViewId
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r5.getConstraint(r1)
            androidx.constraintlayout.widget.ConstraintSet$Constraint$Delta r0 = r0.mDelta
            r0.applyDelta(r1)
            goto La
        L69:
            return
    }

    public void applyTo(androidx.constraintlayout.widget.ConstraintLayout r2) {
            r1 = this;
            r0 = 1
            r1.applyToInternal(r2, r0)
            r0 = 0
            r2.setConstraintSet(r0)
            r2.requestLayout()
            return
    }

    public void applyToHelper(androidx.constraintlayout.widget.ConstraintHelper r4, androidx.constraintlayout.core.widgets.ConstraintWidget r5, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r6, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r7) {
            r3 = this;
            int r0 = r4.getId()
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r1 = r3.mConstraints
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L27
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r1 = r3.mConstraints
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r0
            if (r0 == 0) goto L27
            boolean r1 = r5 instanceof androidx.constraintlayout.core.widgets.HelperWidget
            if (r1 == 0) goto L27
            androidx.constraintlayout.core.widgets.HelperWidget r5 = (androidx.constraintlayout.core.widgets.HelperWidget) r5
            r4.loadParameters(r0, r5, r6, r7)
        L27:
            return
    }

    public final void applyToInternal(androidx.constraintlayout.widget.ConstraintLayout r12, boolean r13) {
            r11 = this;
            int r0 = r12.getChildCount()
            java.util.HashSet r1 = new java.util.HashSet
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r2 = r11.mConstraints
            java.util.Set r2 = r2.keySet()
            r1.<init>(r2)
            r2 = 0
            r3 = 0
        L11:
            r4 = 1
            if (r3 >= r0) goto L1b0
            android.view.View r5 = r12.getChildAt(r3)
            int r6 = r5.getId()
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r7 = r11.mConstraints
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r7 = r7.containsKey(r8)
            java.lang.String r8 = "ConstraintSet"
            if (r7 != 0) goto L40
            java.lang.String r4 = "id unknown "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
            java.lang.String r5 = androidx.constraintlayout.motion.widget.Debug.getName(r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r8, r4)
            goto L1ac
        L40:
            boolean r7 = r11.mForceId
            r9 = -1
            if (r7 == 0) goto L50
            if (r6 == r9) goto L48
            goto L50
        L48:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.String r13 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            r12.<init>(r13)
            throw r12
        L50:
            if (r6 != r9) goto L54
            goto L1ac
        L54:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r7 = r11.mConstraints
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            boolean r7 = r7.containsKey(r10)
            if (r7 == 0) goto L198
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r1.remove(r7)
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r7 = r11.mConstraints
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r7.get(r8)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r7 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r7
            if (r7 != 0) goto L77
            goto L1ac
        L77:
            boolean r8 = r5 instanceof androidx.constraintlayout.widget.Barrier
            if (r8 == 0) goto Lb5
            androidx.constraintlayout.widget.ConstraintSet$Layout r8 = r7.layout
            r8.mHelperType = r4
            r4 = r5
            androidx.constraintlayout.widget.Barrier r4 = (androidx.constraintlayout.widget.Barrier) r4
            r4.setId(r6)
            androidx.constraintlayout.widget.ConstraintSet$Layout r6 = r7.layout
            int r6 = r6.mBarrierDirection
            r4.setType(r6)
            androidx.constraintlayout.widget.ConstraintSet$Layout r6 = r7.layout
            int r6 = r6.mBarrierMargin
            r4.setMargin(r6)
            androidx.constraintlayout.widget.ConstraintSet$Layout r6 = r7.layout
            boolean r6 = r6.mBarrierAllowsGoneWidgets
            r4.setAllowsGoneWidget(r6)
            androidx.constraintlayout.widget.ConstraintSet$Layout r6 = r7.layout
            int[] r8 = r6.mReferenceIds
            if (r8 == 0) goto La4
            r4.setReferencedIds(r8)
            goto Lb5
        La4:
            java.lang.String r8 = r6.mReferenceIdString
            if (r8 == 0) goto Lb5
            int[] r8 = r11.convertReferenceString(r4, r8)
            r6.mReferenceIds = r8
            androidx.constraintlayout.widget.ConstraintSet$Layout r6 = r7.layout
            int[] r6 = r6.mReferenceIds
            r4.setReferencedIds(r6)
        Lb5:
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r4 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r4
            r4.validate()
            r7.applyTo(r4)
            if (r13 == 0) goto Lc8
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r6 = r7.mCustomConstraints
            androidx.constraintlayout.widget.ConstraintAttribute.setAttributes(r5, r6)
        Lc8:
            r5.setLayoutParams(r4)
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r4 = r7.propertySet
            int r6 = r4.mVisibilityMode
            if (r6 != 0) goto Ld6
            int r4 = r4.visibility
            r5.setVisibility(r4)
        Ld6:
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r4 = r7.propertySet
            float r4 = r4.alpha
            r5.setAlpha(r4)
            androidx.constraintlayout.widget.ConstraintSet$Transform r4 = r7.transform
            float r4 = r4.rotation
            r5.setRotation(r4)
            androidx.constraintlayout.widget.ConstraintSet$Transform r4 = r7.transform
            float r4 = r4.rotationX
            r5.setRotationX(r4)
            androidx.constraintlayout.widget.ConstraintSet$Transform r4 = r7.transform
            float r4 = r4.rotationY
            r5.setRotationY(r4)
            androidx.constraintlayout.widget.ConstraintSet$Transform r4 = r7.transform
            float r4 = r4.scaleX
            r5.setScaleX(r4)
            androidx.constraintlayout.widget.ConstraintSet$Transform r4 = r7.transform
            float r4 = r4.scaleY
            r5.setScaleY(r4)
            androidx.constraintlayout.widget.ConstraintSet$Transform r4 = r7.transform
            int r6 = r4.transformPivotTarget
            if (r6 == r9) goto L157
            android.view.ViewParent r4 = r5.getParent()
            android.view.View r4 = (android.view.View) r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r6 = r7.transform
            int r6 = r6.transformPivotTarget
            android.view.View r4 = r4.findViewById(r6)
            if (r4 == 0) goto L177
            int r6 = r4.getTop()
            int r8 = r4.getBottom()
            int r8 = r8 + r6
            float r6 = (float) r8
            r8 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r8
            int r9 = r4.getLeft()
            int r4 = r4.getRight()
            int r4 = r4 + r9
            float r4 = (float) r4
            float r4 = r4 / r8
            int r8 = r5.getRight()
            int r9 = r5.getLeft()
            int r8 = r8 - r9
            if (r8 <= 0) goto L177
            int r8 = r5.getBottom()
            int r9 = r5.getTop()
            int r8 = r8 - r9
            if (r8 <= 0) goto L177
            int r8 = r5.getLeft()
            float r8 = (float) r8
            float r4 = r4 - r8
            int r8 = r5.getTop()
            float r8 = (float) r8
            float r6 = r6 - r8
            r5.setPivotX(r4)
            r5.setPivotY(r6)
            goto L177
        L157:
            float r4 = r4.transformPivotX
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L166
            androidx.constraintlayout.widget.ConstraintSet$Transform r4 = r7.transform
            float r4 = r4.transformPivotX
            r5.setPivotX(r4)
        L166:
            androidx.constraintlayout.widget.ConstraintSet$Transform r4 = r7.transform
            float r4 = r4.transformPivotY
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L177
            androidx.constraintlayout.widget.ConstraintSet$Transform r4 = r7.transform
            float r4 = r4.transformPivotY
            r5.setPivotY(r4)
        L177:
            androidx.constraintlayout.widget.ConstraintSet$Transform r4 = r7.transform
            float r4 = r4.translationX
            r5.setTranslationX(r4)
            androidx.constraintlayout.widget.ConstraintSet$Transform r4 = r7.transform
            float r4 = r4.translationY
            r5.setTranslationY(r4)
            androidx.constraintlayout.widget.ConstraintSet$Transform r4 = r7.transform
            float r4 = r4.translationZ
            r5.setTranslationZ(r4)
            androidx.constraintlayout.widget.ConstraintSet$Transform r4 = r7.transform
            boolean r6 = r4.applyElevation
            if (r6 == 0) goto L1ac
            float r4 = r4.elevation
            r5.setElevation(r4)
            goto L1ac
        L198:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "WARNING NO CONSTRAINTS for view "
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r8, r4)
        L1ac:
            int r3 = r3 + 1
            goto L11
        L1b0:
            java.util.Iterator r13 = r1.iterator()
        L1b4:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L239
            java.lang.Object r1 = r13.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r3 = r11.mConstraints
            java.lang.Object r3 = r3.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r3 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r3
            if (r3 != 0) goto L1cb
            goto L1b4
        L1cb:
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r3.layout
            int r5 = r5.mHelperType
            if (r5 != r4) goto L217
            androidx.constraintlayout.widget.Barrier r5 = new androidx.constraintlayout.widget.Barrier
            android.content.Context r6 = r12.getContext()
            r5.<init>(r6)
            int r6 = r1.intValue()
            r5.setId(r6)
            androidx.constraintlayout.widget.ConstraintSet$Layout r6 = r3.layout
            int[] r7 = r6.mReferenceIds
            if (r7 == 0) goto L1eb
            r5.setReferencedIds(r7)
            goto L1fc
        L1eb:
            java.lang.String r7 = r6.mReferenceIdString
            if (r7 == 0) goto L1fc
            int[] r7 = r11.convertReferenceString(r5, r7)
            r6.mReferenceIds = r7
            androidx.constraintlayout.widget.ConstraintSet$Layout r6 = r3.layout
            int[] r6 = r6.mReferenceIds
            r5.setReferencedIds(r6)
        L1fc:
            androidx.constraintlayout.widget.ConstraintSet$Layout r6 = r3.layout
            int r6 = r6.mBarrierDirection
            r5.setType(r6)
            androidx.constraintlayout.widget.ConstraintSet$Layout r6 = r3.layout
            int r6 = r6.mBarrierMargin
            r5.setMargin(r6)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r6 = r12.generateDefaultLayoutParams()
            r5.validateParams()
            r3.applyTo(r6)
            r12.addView(r5, r6)
        L217:
            androidx.constraintlayout.widget.ConstraintSet$Layout r5 = r3.layout
            boolean r5 = r5.mIsGuideline
            if (r5 == 0) goto L1b4
            androidx.constraintlayout.widget.Guideline r5 = new androidx.constraintlayout.widget.Guideline
            android.content.Context r6 = r12.getContext()
            r5.<init>(r6)
            int r1 = r1.intValue()
            r5.setId(r1)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = r12.generateDefaultLayoutParams()
            r3.applyTo(r1)
            r12.addView(r5, r1)
            goto L1b4
        L239:
            if (r2 >= r0) goto L24b
            android.view.View r13 = r12.getChildAt(r2)
            boolean r1 = r13 instanceof androidx.constraintlayout.widget.ConstraintHelper
            if (r1 == 0) goto L248
            androidx.constraintlayout.widget.ConstraintHelper r13 = (androidx.constraintlayout.widget.ConstraintHelper) r13
            r13.applyLayoutFeaturesInConstraintSet(r12)
        L248:
            int r2 = r2 + 1
            goto L239
        L24b:
            return
    }

    public void applyToLayoutParams(int r3, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r4) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r2.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L1d
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r2.mConstraints
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r3 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r3
            if (r3 == 0) goto L1d
            r3.applyTo(r4)
        L1d:
            return
    }

    public void applyToWithoutCustom(androidx.constraintlayout.widget.ConstraintLayout r2) {
            r1 = this;
            r0 = 0
            r1.applyToInternal(r2, r0)
            r0 = 0
            r2.setConstraintSet(r0)
            return
    }

    public void center(int r9, int r10, int r11, int r12, int r13, int r14, int r15, float r16) {
            r8 = this;
            r6 = r8
            r4 = r11
            r7 = r16
            java.lang.String r0 = "margin must be > 0"
            if (r12 < 0) goto L9a
            if (r15 < 0) goto L94
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8c
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L8c
            r0 = 1
            if (r4 == r0) goto L69
            r0 = 2
            if (r4 != r0) goto L1c
            goto L69
        L1c:
            r0 = 6
            if (r4 == r0) goto L46
            r0 = 7
            if (r4 != r0) goto L23
            goto L46
        L23:
            r2 = 3
            r0 = r8
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.connect(r1, r2, r3, r4, r5)
            r2 = 4
            r3 = r13
            r4 = r14
            r5 = r15
            r0.connect(r1, r2, r3, r4, r5)
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r6.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.Object r0 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r0
            if (r0 == 0) goto L8b
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r0.layout
            r0.verticalBias = r7
            goto L8b
        L46:
            r2 = 6
            r0 = r8
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.connect(r1, r2, r3, r4, r5)
            r2 = 7
            r3 = r13
            r4 = r14
            r5 = r15
            r0.connect(r1, r2, r3, r4, r5)
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r6.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.Object r0 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r0
            if (r0 == 0) goto L8b
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r0.layout
            r0.horizontalBias = r7
            goto L8b
        L69:
            r2 = 1
            r0 = r8
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.connect(r1, r2, r3, r4, r5)
            r2 = 2
            r3 = r13
            r4 = r14
            r5 = r15
            r0.connect(r1, r2, r3, r4, r5)
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r6.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.Object r0 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r0
            if (r0 == 0) goto L8b
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r0.layout
            r0.horizontalBias = r7
        L8b:
            return
        L8c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "bias must be between 0 and 1 inclusive"
            r0.<init>(r1)
            throw r0
        L94:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L9a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
    }

    public void centerHorizontally(int r10, int r11) {
            r9 = this;
            if (r11 != 0) goto L10
            r2 = 0
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 2
            r7 = 0
            r8 = 1056964608(0x3f000000, float:0.5)
            r0 = r9
            r1 = r10
            r0.center(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L1d
        L10:
            r3 = 2
            r4 = 0
            r6 = 1
            r7 = 0
            r8 = 1056964608(0x3f000000, float:0.5)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r11
            r0.center(r1, r2, r3, r4, r5, r6, r7, r8)
        L1d:
            return
    }

    public void centerHorizontally(int r10, int r11, int r12, int r13, int r14, int r15, int r16, float r17) {
            r9 = this;
            r2 = 1
            r0 = r9
            r1 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.connect(r1, r2, r3, r4, r5)
            r5 = 2
            r3 = r9
            r4 = r10
            r6 = r14
            r7 = r15
            r8 = r16
            r3.connect(r4, r5, r6, r7, r8)
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r1 = r0.mConstraints
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r1
            if (r1 == 0) goto L27
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r2 = r17
            r1.horizontalBias = r2
        L27:
            return
    }

    public void centerHorizontallyRtl(int r10, int r11) {
            r9 = this;
            if (r11 != 0) goto L10
            r2 = 0
            r3 = 6
            r4 = 0
            r5 = 0
            r6 = 7
            r7 = 0
            r8 = 1056964608(0x3f000000, float:0.5)
            r0 = r9
            r1 = r10
            r0.center(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L1d
        L10:
            r3 = 7
            r4 = 0
            r6 = 6
            r7 = 0
            r8 = 1056964608(0x3f000000, float:0.5)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r11
            r0.center(r1, r2, r3, r4, r5, r6, r7, r8)
        L1d:
            return
    }

    public void centerHorizontallyRtl(int r10, int r11, int r12, int r13, int r14, int r15, int r16, float r17) {
            r9 = this;
            r2 = 6
            r0 = r9
            r1 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.connect(r1, r2, r3, r4, r5)
            r5 = 7
            r3 = r9
            r4 = r10
            r6 = r14
            r7 = r15
            r8 = r16
            r3.connect(r4, r5, r6, r7, r8)
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r1 = r0.mConstraints
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r1
            if (r1 == 0) goto L27
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r2 = r17
            r1.horizontalBias = r2
        L27:
            return
    }

    public void centerVertically(int r10, int r11) {
            r9 = this;
            if (r11 != 0) goto L10
            r2 = 0
            r3 = 3
            r4 = 0
            r5 = 0
            r6 = 4
            r7 = 0
            r8 = 1056964608(0x3f000000, float:0.5)
            r0 = r9
            r1 = r10
            r0.center(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L1d
        L10:
            r3 = 4
            r4 = 0
            r6 = 3
            r7 = 0
            r8 = 1056964608(0x3f000000, float:0.5)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r11
            r0.center(r1, r2, r3, r4, r5, r6, r7, r8)
        L1d:
            return
    }

    public void centerVertically(int r10, int r11, int r12, int r13, int r14, int r15, int r16, float r17) {
            r9 = this;
            r2 = 3
            r0 = r9
            r1 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.connect(r1, r2, r3, r4, r5)
            r5 = 4
            r3 = r9
            r4 = r10
            r6 = r14
            r7 = r15
            r8 = r16
            r3.connect(r4, r5, r6, r7, r8)
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r1 = r0.mConstraints
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r1
            if (r1 == 0) goto L27
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r2 = r17
            r1.verticalBias = r2
        L27:
            return
    }

    public void clear(int r2) {
            r1 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r1.mConstraints
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
            return
    }

    public void clear(int r4, int r5) {
            r3 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r3.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L84
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r3.mConstraints
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r4 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r4
            if (r4 != 0) goto L1b
            return
        L1b:
            r0 = 0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            switch(r5) {
                case 1: goto L7a;
                case 2: goto L6f;
                case 3: goto L64;
                case 4: goto L59;
                case 5: goto L4c;
                case 6: goto L41;
                case 7: goto L36;
                case 8: goto L2b;
                default: goto L22;
            }
        L22:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "unknown constraint"
            r4.<init>(r5)
            throw r4
        L2b:
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = r4.layout
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.circleAngle = r5
            r4.circleRadius = r2
            r4.circleConstraint = r2
            goto L84
        L36:
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = r4.layout
            r4.endToStart = r2
            r4.endToEnd = r2
            r4.endMargin = r0
            r4.goneEndMargin = r1
            goto L84
        L41:
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = r4.layout
            r4.startToEnd = r2
            r4.startToStart = r2
            r4.startMargin = r0
            r4.goneStartMargin = r1
            goto L84
        L4c:
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = r4.layout
            r4.baselineToBaseline = r2
            r4.baselineToTop = r2
            r4.baselineToBottom = r2
            r4.baselineMargin = r0
            r4.goneBaselineMargin = r1
            goto L84
        L59:
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = r4.layout
            r4.bottomToTop = r2
            r4.bottomToBottom = r2
            r4.bottomMargin = r0
            r4.goneBottomMargin = r1
            goto L84
        L64:
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = r4.layout
            r4.topToBottom = r2
            r4.topToTop = r2
            r4.topMargin = r0
            r4.goneTopMargin = r1
            goto L84
        L6f:
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = r4.layout
            r4.rightToRight = r2
            r4.rightToLeft = r2
            r4.rightMargin = r2
            r4.goneRightMargin = r1
            goto L84
        L7a:
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = r4.layout
            r4.leftToRight = r2
            r4.leftToLeft = r2
            r4.leftMargin = r2
            r4.goneLeftMargin = r1
        L84:
            return
    }

    public void clone(android.content.Context r2, int r3) {
            r1 = this;
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r0 = 0
            android.view.View r2 = r2.inflate(r3, r0)
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            r1.clone(r2)
            return
    }

    public void clone(androidx.constraintlayout.widget.ConstraintLayout r12) {
            r11 = this;
            int r0 = r12.getChildCount()
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r1 = r11.mConstraints
            r1.clear()
            r1 = 0
        La:
            if (r1 >= r0) goto Lff
            android.view.View r2 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r3
            int r4 = r2.getId()
            boolean r5 = r11.mForceId
            if (r5 == 0) goto L2a
            r5 = -1
            if (r4 == r5) goto L22
            goto L2a
        L22:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.String r0 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            r12.<init>(r0)
            throw r12
        L2a:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r5 = r11.mConstraints
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            boolean r5 = r5.containsKey(r6)
            if (r5 != 0) goto L44
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r5 = r11.mConstraints
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r7 = new androidx.constraintlayout.widget.ConstraintSet$Constraint
            r7.<init>()
            r5.put(r6, r7)
        L44:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r5 = r11.mConstraints
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r5.get(r6)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r5 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r5
            if (r5 != 0) goto L54
            goto Lfb
        L54:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r6 = r11.mSavedAttributes
            java.util.HashMap r6 = androidx.constraintlayout.widget.ConstraintAttribute.extractAttributes(r6, r2)
            r5.mCustomConstraints = r6
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$000(r5, r4, r3)
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r3 = r5.propertySet
            int r4 = r2.getVisibility()
            r3.visibility = r4
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r3 = r5.propertySet
            float r4 = r2.getAlpha()
            r3.alpha = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getRotation()
            r3.rotation = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getRotationX()
            r3.rotationX = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getRotationY()
            r3.rotationY = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getScaleX()
            r3.scaleX = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getScaleY()
            r3.scaleY = r4
            float r3 = r2.getPivotX()
            float r4 = r2.getPivotY()
            double r6 = (double) r3
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto Lab
            double r6 = (double) r4
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto Lb1
        Lab:
            androidx.constraintlayout.widget.ConstraintSet$Transform r6 = r5.transform
            r6.transformPivotX = r3
            r6.transformPivotY = r4
        Lb1:
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getTranslationX()
            r3.translationX = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getTranslationY()
            r3.translationY = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getTranslationZ()
            r3.translationZ = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            boolean r4 = r3.applyElevation
            if (r4 == 0) goto Ld5
            float r4 = r2.getElevation()
            r3.elevation = r4
        Ld5:
            boolean r3 = r2 instanceof androidx.constraintlayout.widget.Barrier
            if (r3 == 0) goto Lfb
            androidx.constraintlayout.widget.Barrier r2 = (androidx.constraintlayout.widget.Barrier) r2
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r5.layout
            boolean r4 = r2.getAllowsGoneWidget()
            r3.mBarrierAllowsGoneWidgets = r4
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r5.layout
            int[] r4 = r2.getReferencedIds()
            r3.mReferenceIds = r4
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r5.layout
            int r4 = r2.getType()
            r3.mBarrierDirection = r4
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r5.layout
            int r2 = r2.getMargin()
            r3.mBarrierMargin = r2
        Lfb:
            int r1 = r1 + 1
            goto La
        Lff:
            return
    }

    public void clone(androidx.constraintlayout.widget.ConstraintSet r5) {
            r4 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r4.mConstraints
            r0.clear()
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r5.mConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r2 = r5.mConstraints
            java.lang.Object r2 = r2.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r2
            if (r2 != 0) goto L26
            goto Lf
        L26:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r3 = r4.mConstraints
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r2.clone()
            r3.put(r1, r2)
            goto Lf
        L30:
            return
    }

    public void clone(androidx.constraintlayout.widget.Constraints r9) {
            r8 = this;
            int r0 = r9.getChildCount()
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r1 = r8.mConstraints
            r1.clear()
            r1 = 0
        La:
            if (r1 >= r0) goto L62
            android.view.View r2 = r9.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.constraintlayout.widget.Constraints$LayoutParams r3 = (androidx.constraintlayout.widget.Constraints.LayoutParams) r3
            int r4 = r2.getId()
            boolean r5 = r8.mForceId
            if (r5 == 0) goto L2a
            r5 = -1
            if (r4 == r5) goto L22
            goto L2a
        L22:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r0 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            r9.<init>(r0)
            throw r9
        L2a:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r5 = r8.mConstraints
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            boolean r5 = r5.containsKey(r6)
            if (r5 != 0) goto L44
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r5 = r8.mConstraints
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r7 = new androidx.constraintlayout.widget.ConstraintSet$Constraint
            r7.<init>()
            r5.put(r6, r7)
        L44:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r5 = r8.mConstraints
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r5.get(r6)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r5 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r5
            if (r5 != 0) goto L53
            goto L5f
        L53:
            boolean r6 = r2 instanceof androidx.constraintlayout.widget.ConstraintHelper
            if (r6 == 0) goto L5c
            androidx.constraintlayout.widget.ConstraintHelper r2 = (androidx.constraintlayout.widget.ConstraintHelper) r2
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$700(r5, r2, r4, r3)
        L5c:
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$800(r5, r4, r3)
        L5f:
            int r1 = r1 + 1
            goto La
        L62:
            return
    }

    public void connect(int r10, int r11, int r12, int r13) {
            r9 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r9.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L1a
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r9.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = new androidx.constraintlayout.widget.ConstraintSet$Constraint
            r2.<init>()
            r0.put(r1, r2)
        L1a:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r9.mConstraints
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r10 = r0.get(r10)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r10 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r10
            if (r10 != 0) goto L29
            return
        L29:
            r0 = 2
            r1 = 7
            r2 = 6
            r3 = 1
            r4 = 4
            r5 = 3
            java.lang.String r6 = "right to "
            java.lang.String r7 = " undefined"
            r8 = -1
            switch(r11) {
                case 1: goto L16e;
                case 2: goto L14a;
                case 3: goto L11a;
                case 4: goto Le8;
                case 5: goto La5;
                case 6: goto L7f;
                case 7: goto L59;
                default: goto L38;
            }
        L38:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r11 = r9.sideToString(r11)
            r12.append(r11)
            java.lang.String r11 = " to "
            r12.append(r11)
            java.lang.String r11 = r9.sideToString(r13)
            java.lang.String r13 = " unknown"
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r12, r11, r13)
            r10.<init>(r11)
            throw r10
        L59:
            if (r13 != r1) goto L63
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.endToEnd = r12
            r10.endToStart = r8
            goto L17f
        L63:
            if (r13 != r2) goto L6d
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.endToStart = r12
            r10.endToEnd = r8
            goto L17f
        L6d:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            java.lang.String r12 = r9.sideToString(r13)
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12, r7)
            r10.<init>(r11)
            throw r10
        L7f:
            if (r13 != r2) goto L89
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.startToStart = r12
            r10.startToEnd = r8
            goto L17f
        L89:
            if (r13 != r1) goto L93
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.startToEnd = r12
            r10.startToStart = r8
            goto L17f
        L93:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            java.lang.String r12 = r9.sideToString(r13)
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12, r7)
            r10.<init>(r11)
            throw r10
        La5:
            r11 = 5
            if (r13 != r11) goto Lb6
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.baselineToBaseline = r12
            r10.bottomToBottom = r8
            r10.bottomToTop = r8
            r10.topToTop = r8
            r10.topToBottom = r8
            goto L17f
        Lb6:
            if (r13 != r5) goto Lc6
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.baselineToTop = r12
            r10.bottomToBottom = r8
            r10.bottomToTop = r8
            r10.topToTop = r8
            r10.topToBottom = r8
            goto L17f
        Lc6:
            if (r13 != r4) goto Ld6
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.baselineToBottom = r12
            r10.bottomToBottom = r8
            r10.bottomToTop = r8
            r10.topToTop = r8
            r10.topToBottom = r8
            goto L17f
        Ld6:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            java.lang.String r12 = r9.sideToString(r13)
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12, r7)
            r10.<init>(r11)
            throw r10
        Le8:
            if (r13 != r4) goto Lf8
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.bottomToBottom = r12
            r10.bottomToTop = r8
            r10.baselineToBaseline = r8
            r10.baselineToTop = r8
            r10.baselineToBottom = r8
            goto L17f
        Lf8:
            if (r13 != r5) goto L108
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.bottomToTop = r12
            r10.bottomToBottom = r8
            r10.baselineToBaseline = r8
            r10.baselineToTop = r8
            r10.baselineToBottom = r8
            goto L17f
        L108:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            java.lang.String r12 = r9.sideToString(r13)
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12, r7)
            r10.<init>(r11)
            throw r10
        L11a:
            if (r13 != r5) goto L129
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.topToTop = r12
            r10.topToBottom = r8
            r10.baselineToBaseline = r8
            r10.baselineToTop = r8
            r10.baselineToBottom = r8
            goto L17f
        L129:
            if (r13 != r4) goto L138
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.topToBottom = r12
            r10.topToTop = r8
            r10.baselineToBaseline = r8
            r10.baselineToTop = r8
            r10.baselineToBottom = r8
            goto L17f
        L138:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            java.lang.String r12 = r9.sideToString(r13)
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12, r7)
            r10.<init>(r11)
            throw r10
        L14a:
            if (r13 != r3) goto L153
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.rightToLeft = r12
            r10.rightToRight = r8
            goto L17f
        L153:
            if (r13 != r0) goto L15c
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.rightToRight = r12
            r10.rightToLeft = r8
            goto L17f
        L15c:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            java.lang.String r12 = r9.sideToString(r13)
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12, r7)
            r10.<init>(r11)
            throw r10
        L16e:
            if (r13 != r3) goto L177
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.leftToLeft = r12
            r10.leftToRight = r8
            goto L17f
        L177:
            if (r13 != r0) goto L180
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.leftToRight = r12
            r10.leftToLeft = r8
        L17f:
            return
        L180:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "left to "
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11)
            java.lang.String r12 = r9.sideToString(r13)
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12, r7)
            r10.<init>(r11)
            throw r10
    }

    public void connect(int r10, int r11, int r12, int r13, int r14) {
            r9 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r9.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L1a
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r9.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = new androidx.constraintlayout.widget.ConstraintSet$Constraint
            r2.<init>()
            r0.put(r1, r2)
        L1a:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r9.mConstraints
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r10 = r0.get(r10)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r10 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r10
            if (r10 != 0) goto L29
            return
        L29:
            r0 = 2
            r1 = 7
            r2 = 6
            r3 = 1
            r4 = 4
            r5 = 3
            java.lang.String r6 = "right to "
            java.lang.String r7 = " undefined"
            r8 = -1
            switch(r11) {
                case 1: goto L17f;
                case 2: goto L157;
                case 3: goto L123;
                case 4: goto Lee;
                case 5: goto Lab;
                case 6: goto L82;
                case 7: goto L59;
                default: goto L38;
            }
        L38:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r11 = r9.sideToString(r11)
            r12.append(r11)
            java.lang.String r11 = " to "
            r12.append(r11)
            java.lang.String r11 = r9.sideToString(r13)
            java.lang.String r13 = " unknown"
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r12, r11, r13)
            r10.<init>(r11)
            throw r10
        L59:
            if (r13 != r1) goto L62
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.endToEnd = r12
            r11.endToStart = r8
            goto L6a
        L62:
            if (r13 != r2) goto L70
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.endToStart = r12
            r11.endToEnd = r8
        L6a:
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.endMargin = r14
            goto L194
        L70:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            java.lang.String r12 = r9.sideToString(r13)
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12, r7)
            r10.<init>(r11)
            throw r10
        L82:
            if (r13 != r2) goto L8b
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.startToStart = r12
            r11.startToEnd = r8
            goto L93
        L8b:
            if (r13 != r1) goto L99
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.startToEnd = r12
            r11.startToStart = r8
        L93:
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.startMargin = r14
            goto L194
        L99:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            java.lang.String r12 = r9.sideToString(r13)
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12, r7)
            r10.<init>(r11)
            throw r10
        Lab:
            r11 = 5
            if (r13 != r11) goto Lbc
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.baselineToBaseline = r12
            r10.bottomToBottom = r8
            r10.bottomToTop = r8
            r10.topToTop = r8
            r10.topToBottom = r8
            goto L194
        Lbc:
            if (r13 != r5) goto Lcc
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.baselineToTop = r12
            r10.bottomToBottom = r8
            r10.bottomToTop = r8
            r10.topToTop = r8
            r10.topToBottom = r8
            goto L194
        Lcc:
            if (r13 != r4) goto Ldc
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.baselineToBottom = r12
            r10.bottomToBottom = r8
            r10.bottomToTop = r8
            r10.topToTop = r8
            r10.topToBottom = r8
            goto L194
        Ldc:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            java.lang.String r12 = r9.sideToString(r13)
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12, r7)
            r10.<init>(r11)
            throw r10
        Lee:
            if (r13 != r4) goto Lfd
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.bottomToBottom = r12
            r11.bottomToTop = r8
            r11.baselineToBaseline = r8
            r11.baselineToTop = r8
            r11.baselineToBottom = r8
            goto L10b
        Lfd:
            if (r13 != r5) goto L111
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.bottomToTop = r12
            r11.bottomToBottom = r8
            r11.baselineToBaseline = r8
            r11.baselineToTop = r8
            r11.baselineToBottom = r8
        L10b:
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.bottomMargin = r14
            goto L194
        L111:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            java.lang.String r12 = r9.sideToString(r13)
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12, r7)
            r10.<init>(r11)
            throw r10
        L123:
            if (r13 != r5) goto L132
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.topToTop = r12
            r11.topToBottom = r8
            r11.baselineToBaseline = r8
            r11.baselineToTop = r8
            r11.baselineToBottom = r8
            goto L140
        L132:
            if (r13 != r4) goto L145
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.topToBottom = r12
            r11.topToTop = r8
            r11.baselineToBaseline = r8
            r11.baselineToTop = r8
            r11.baselineToBottom = r8
        L140:
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.topMargin = r14
            goto L194
        L145:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            java.lang.String r12 = r9.sideToString(r13)
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12, r7)
            r10.<init>(r11)
            throw r10
        L157:
            if (r13 != r3) goto L160
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.rightToLeft = r12
            r11.rightToRight = r8
            goto L168
        L160:
            if (r13 != r0) goto L16d
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.rightToRight = r12
            r11.rightToLeft = r8
        L168:
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.rightMargin = r14
            goto L194
        L16d:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r6)
            java.lang.String r12 = r9.sideToString(r13)
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12, r7)
            r10.<init>(r11)
            throw r10
        L17f:
            if (r13 != r3) goto L188
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.leftToLeft = r12
            r11.leftToRight = r8
            goto L190
        L188:
            if (r13 != r0) goto L195
            androidx.constraintlayout.widget.ConstraintSet$Layout r11 = r10.layout
            r11.leftToRight = r12
            r11.leftToLeft = r8
        L190:
            androidx.constraintlayout.widget.ConstraintSet$Layout r10 = r10.layout
            r10.leftMargin = r14
        L194:
            return
        L195:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Left to "
            java.lang.StringBuilder r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11)
            java.lang.String r12 = r9.sideToString(r13)
            java.lang.String r11 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r11, r12, r7)
            r10.<init>(r11)
            throw r10
    }

    public void constrainCircle(int r1, int r2, int r3, float r4) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.circleConstraint = r2
            r1.circleRadius = r3
            r1.circleAngle = r4
            return
    }

    public void constrainDefaultHeight(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.heightDefault = r2
            return
    }

    public void constrainDefaultWidth(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.widthDefault = r2
            return
    }

    public void constrainHeight(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.mHeight = r2
            return
    }

    public void constrainMaxHeight(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.heightMax = r2
            return
    }

    public void constrainMaxWidth(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.widthMax = r2
            return
    }

    public void constrainMinHeight(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.heightMin = r2
            return
    }

    public void constrainMinWidth(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.widthMin = r2
            return
    }

    public void constrainPercentHeight(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.heightPercent = r2
            return
    }

    public void constrainPercentWidth(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.widthPercent = r2
            return
    }

    public void constrainWidth(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.mWidth = r2
            return
    }

    public void constrainedHeight(int r1, boolean r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.constrainedHeight = r2
            return
    }

    public void constrainedWidth(int r1, boolean r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.constrainedWidth = r2
            return
    }

    public void create(int r2, int r3) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r2.layout
            r0 = 1
            r2.mIsGuideline = r0
            r2.orientation = r3
            return
    }

    public void createBarrier(int r2, int r3, int r4, int... r5) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r2.layout
            r0 = 1
            r2.mHelperType = r0
            r2.mBarrierDirection = r3
            r2.mBarrierMargin = r4
            r3 = 0
            r2.mIsGuideline = r3
            r2.mReferenceIds = r5
            return
    }

    public void createHorizontalChain(int r11, int r12, int r13, int r14, int[] r15, float[] r16, int r17) {
            r10 = this;
            r8 = 1
            r9 = 2
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r0.createHorizontalChain(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public void createHorizontalChainRtl(int r11, int r12, int r13, int r14, int[] r15, float[] r16, int r17) {
            r10 = this;
            r8 = 6
            r9 = 7
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r0.createHorizontalChain(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public void createVerticalChain(int r13, int r14, int r15, int r16, int[] r17, float[] r18, int r19) {
            r12 = this;
            r6 = r12
            r7 = r17
            r8 = r18
            int r0 = r7.length
            java.lang.String r1 = "must have 2 or more widgets in a chain"
            r2 = 2
            if (r0 < r2) goto L79
            if (r8 == 0) goto L18
            int r0 = r8.length
            int r2 = r7.length
            if (r0 != r2) goto L12
            goto L18
        L12:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L18:
            r0 = 0
            if (r8 == 0) goto L27
            r1 = r7[r0]
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r12.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r2 = r8[r0]
            r1.verticalWeight = r2
        L27:
            r1 = r7[r0]
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r12.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r2 = r19
            r1.verticalChainStyle = r2
            r1 = r7[r0]
            r2 = 3
            r5 = 0
            r0 = r12
            r3 = r13
            r4 = r14
            r0.connect(r1, r2, r3, r4, r5)
            r9 = 1
            r10 = 1
        L3f:
            int r0 = r7.length
            if (r10 >= r0) goto L6b
            r0 = r7[r10]
            r1 = r7[r10]
            r2 = 3
            int r11 = r10 + (-1)
            r3 = r7[r11]
            r4 = 4
            r5 = 0
            r0 = r12
            r0.connect(r1, r2, r3, r4, r5)
            r1 = r7[r11]
            r2 = 4
            r3 = r7[r10]
            r4 = 3
            r0.connect(r1, r2, r3, r4, r5)
            if (r8 == 0) goto L68
            r0 = r7[r10]
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = r12.get(r0)
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r0.layout
            r1 = r8[r10]
            r0.verticalWeight = r1
        L68:
            int r10 = r10 + 1
            goto L3f
        L6b:
            int r0 = r7.length
            int r0 = r0 - r9
            r1 = r7[r0]
            r2 = 4
            r5 = 0
            r0 = r12
            r3 = r15
            r4 = r16
            r0.connect(r1, r2, r3, r4, r5)
            return
        L79:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    public void dump(androidx.constraintlayout.motion.widget.MotionScene r7, int... r8) {
            r6 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r6.mConstraints
            java.util.Set r0 = r0.keySet()
            int r1 = r8.length
            r2 = 0
            if (r1 == 0) goto L1f
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r1 = r8.length
            r3 = 0
        L11:
            if (r3 >= r1) goto L25
            r4 = r8[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
            int r3 = r3 + 1
            goto L11
        L1f:
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>(r0)
            r0 = r8
        L25:
            java.io.PrintStream r8 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = r0.size()
            r1.append(r3)
            java.lang.String r3 = " constraints"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r8.println(r1)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.Integer[] r1 = new java.lang.Integer[r2]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.Integer[] r0 = (java.lang.Integer[]) r0
            int r1 = r0.length
        L4d:
            if (r2 >= r1) goto L76
            r3 = r0[r2]
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r4 = r6.mConstraints
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r4 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r4
            if (r4 != 0) goto L5c
            goto L73
        L5c:
            java.lang.String r5 = "<Constraint id="
            r8.append(r5)
            r8.append(r3)
            java.lang.String r3 = " \n"
            r8.append(r3)
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r4.layout
            r3.dump(r7, r8)
            java.lang.String r3 = "/>\n"
            r8.append(r3)
        L73:
            int r2 = r2 + 1
            goto L4d
        L76:
            java.io.PrintStream r7 = java.lang.System.out
            java.lang.String r8 = r8.toString()
            r7.println(r8)
            return
    }

    public boolean getApplyElevation(int r1) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            boolean r1 = r1.applyElevation
            return r1
    }

    public androidx.constraintlayout.widget.ConstraintSet.Constraint getConstraint(int r3) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r2.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L19
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r2.mConstraints
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r3 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r3
            return r3
        L19:
            r3 = 0
            return r3
    }

    public java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> getCustomAttributeSet() {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r1.mSavedAttributes
            return r0
    }

    public int getHeight(int r1) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            int r1 = r1.mHeight
            return r1
    }

    public int[] getKnownIds() {
            r5 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r5.mConstraints
            java.util.Set r0 = r0.keySet()
            r1 = 0
            java.lang.Integer[] r2 = new java.lang.Integer[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.Integer[] r0 = (java.lang.Integer[]) r0
            int r2 = r0.length
            int[] r3 = new int[r2]
        L12:
            if (r1 >= r2) goto L1f
            r4 = r0[r1]
            int r4 = r4.intValue()
            r3[r1] = r4
            int r1 = r1 + 1
            goto L12
        L1f:
            return r3
    }

    public androidx.constraintlayout.widget.ConstraintSet.Constraint getParameters(int r1) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            return r1
    }

    public int[] getReferencedIds(int r2) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r2.layout
            int[] r2 = r2.mReferenceIds
            if (r2 != 0) goto Le
            r2 = 0
            int[] r2 = new int[r2]
            return r2
        Le:
            int r0 = r2.length
            int[] r2 = java.util.Arrays.copyOf(r2, r0)
            return r2
    }

    public int getVisibility(int r1) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r1 = r1.propertySet
            int r1 = r1.visibility
            return r1
    }

    public int getVisibilityMode(int r1) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r1 = r1.propertySet
            int r1 = r1.mVisibilityMode
            return r1
    }

    public int getWidth(int r1) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            int r1 = r1.mWidth
            return r1
    }

    public boolean isForceId() {
            r1 = this;
            boolean r0 = r1.mForceId
            return r0
    }

    public void load(android.content.Context r5, int r6) {
            r4 = this;
            android.content.res.Resources r0 = r5.getResources()
            android.content.res.XmlResourceParser r6 = r0.getXml(r6)
            int r0 = r6.getEventType()     // Catch: java.io.IOException -> L42 org.xmlpull.v1.XmlPullParserException -> L47
        Lc:
            r1 = 1
            if (r0 == r1) goto L4b
            if (r0 == 0) goto L3a
            r2 = 2
            if (r0 == r2) goto L15
            goto L3d
        L15:
            java.lang.String r0 = r6.getName()     // Catch: java.io.IOException -> L42 org.xmlpull.v1.XmlPullParserException -> L47
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r6)     // Catch: java.io.IOException -> L42 org.xmlpull.v1.XmlPullParserException -> L47
            r3 = 0
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r4.fillFromAttributeList(r5, r2, r3)     // Catch: java.io.IOException -> L42 org.xmlpull.v1.XmlPullParserException -> L47
            java.lang.String r3 = "Guideline"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch: java.io.IOException -> L42 org.xmlpull.v1.XmlPullParserException -> L47
            if (r0 == 0) goto L2e
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r2.layout     // Catch: java.io.IOException -> L42 org.xmlpull.v1.XmlPullParserException -> L47
            r0.mIsGuideline = r1     // Catch: java.io.IOException -> L42 org.xmlpull.v1.XmlPullParserException -> L47
        L2e:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r4.mConstraints     // Catch: java.io.IOException -> L42 org.xmlpull.v1.XmlPullParserException -> L47
            int r1 = r2.mViewId     // Catch: java.io.IOException -> L42 org.xmlpull.v1.XmlPullParserException -> L47
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.io.IOException -> L42 org.xmlpull.v1.XmlPullParserException -> L47
            r0.put(r1, r2)     // Catch: java.io.IOException -> L42 org.xmlpull.v1.XmlPullParserException -> L47
            goto L3d
        L3a:
            r6.getName()     // Catch: java.io.IOException -> L42 org.xmlpull.v1.XmlPullParserException -> L47
        L3d:
            int r0 = r6.next()     // Catch: java.io.IOException -> L42 org.xmlpull.v1.XmlPullParserException -> L47
            goto Lc
        L42:
            r5 = move-exception
            r5.printStackTrace()
            goto L4b
        L47:
            r5 = move-exception
            r5.printStackTrace()
        L4b:
            return
    }

    public void load(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
            r9 = this;
            int r0 = r11.getEventType()     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r1 = 0
            r2 = r1
        L6:
            r3 = 1
            if (r0 == r3) goto L1da
            if (r0 == 0) goto L1c8
            r4 = -1
            r5 = 3
            r6 = 2
            r7 = 0
            if (r0 == r6) goto L67
            if (r0 == r5) goto L15
            goto L1cb
        L15:
            java.lang.String r0 = r11.getName()     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            java.lang.String r0 = r0.toLowerCase(r8)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            int r8 = r0.hashCode()     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            switch(r8) {
                case -2075718416: goto L45;
                case -190376483: goto L3b;
                case 426575017: goto L31;
                case 2146106725: goto L27;
                default: goto L26;
            }     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
        L26:
            goto L4e
        L27:
            java.lang.String r8 = "constraintset"
            boolean r0 = r0.equals(r8)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            if (r0 == 0) goto L4e
            r4 = 0
            goto L4e
        L31:
            java.lang.String r7 = "constraintoverride"
            boolean r0 = r0.equals(r7)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            if (r0 == 0) goto L4e
            r4 = 2
            goto L4e
        L3b:
            java.lang.String r7 = "constraint"
            boolean r0 = r0.equals(r7)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            if (r0 == 0) goto L4e
            r4 = 1
            goto L4e
        L45:
            java.lang.String r7 = "guideline"
            boolean r0 = r0.equals(r7)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            if (r0 == 0) goto L4e
            r4 = 3
        L4e:
            if (r4 == 0) goto L66
            if (r4 == r3) goto L58
            if (r4 == r6) goto L58
            if (r4 == r5) goto L58
            goto L1cb
        L58:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r9.mConstraints     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            int r3 = r2.mViewId     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r0.put(r3, r2)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r2 = r1
            goto L1cb
        L66:
            return
        L67:
            java.lang.String r0 = r11.getName()     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            int r8 = r0.hashCode()     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            switch(r8) {
                case -2025855158: goto Ld0;
                case -1984451626: goto Lc6;
                case -1962203927: goto Lbc;
                case -1269513683: goto Lb2;
                case -1238332596: goto La8;
                case -71750448: goto L9e;
                case 366511058: goto L93;
                case 1331510167: goto L89;
                case 1791837707: goto L7e;
                case 1803088381: goto L74;
                default: goto L72;
            }     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
        L72:
            goto Ld9
        L74:
            java.lang.String r5 = "Constraint"
            boolean r0 = r0.equals(r5)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            if (r0 == 0) goto Ld9
            r4 = 0
            goto Ld9
        L7e:
            java.lang.String r5 = "CustomAttribute"
            boolean r0 = r0.equals(r5)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            if (r0 == 0) goto Ld9
            r4 = 8
            goto Ld9
        L89:
            java.lang.String r6 = "Barrier"
            boolean r0 = r0.equals(r6)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            if (r0 == 0) goto Ld9
            r4 = 3
            goto Ld9
        L93:
            java.lang.String r5 = "CustomMethod"
            boolean r0 = r0.equals(r5)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            if (r0 == 0) goto Ld9
            r4 = 9
            goto Ld9
        L9e:
            java.lang.String r5 = "Guideline"
            boolean r0 = r0.equals(r5)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            if (r0 == 0) goto Ld9
            r4 = 2
            goto Ld9
        La8:
            java.lang.String r5 = "Transform"
            boolean r0 = r0.equals(r5)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            if (r0 == 0) goto Ld9
            r4 = 5
            goto Ld9
        Lb2:
            java.lang.String r5 = "PropertySet"
            boolean r0 = r0.equals(r5)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            if (r0 == 0) goto Ld9
            r4 = 4
            goto Ld9
        Lbc:
            java.lang.String r5 = "ConstraintOverride"
            boolean r0 = r0.equals(r5)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            if (r0 == 0) goto Ld9
            r4 = 1
            goto Ld9
        Lc6:
            java.lang.String r5 = "Motion"
            boolean r0 = r0.equals(r5)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            if (r0 == 0) goto Ld9
            r4 = 7
            goto Ld9
        Ld0:
            java.lang.String r5 = "Layout"
            boolean r0 = r0.equals(r5)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            if (r0 == 0) goto Ld9
            r4 = 6
        Ld9:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r4) {
                case 0: goto L1be;
                case 1: goto L1b5;
                case 2: goto L1a6;
                case 3: goto L199;
                case 4: goto L174;
                case 5: goto L14e;
                case 6: goto L128;
                case 7: goto L102;
                case 8: goto Le0;
                case 9: goto Le0;
                default: goto Lde;
            }
        Lde:
            goto L1cb
        Le0:
            if (r2 == 0) goto Le9
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r2.mCustomConstraints     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            androidx.constraintlayout.widget.ConstraintAttribute.parse(r10, r11, r0)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            goto L1cb
        Le9:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r1.<init>()     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r1.append(r0)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            int r11 = r11.getLineNumber()     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r1.append(r11)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            java.lang.String r11 = r1.toString()     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r10.<init>(r11)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            throw r10     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
        L102:
            if (r2 == 0) goto L10f
            androidx.constraintlayout.widget.ConstraintSet$Motion r0 = r2.motion     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r0.fillFromAttributeList(r10, r3)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            goto L1cb
        L10f:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r1.<init>()     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r1.append(r0)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            int r11 = r11.getLineNumber()     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r1.append(r11)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            java.lang.String r11 = r1.toString()     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r10.<init>(r11)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            throw r10     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
        L128:
            if (r2 == 0) goto L135
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r2.layout     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r0.fillFromAttributeList(r10, r3)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            goto L1cb
        L135:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r1.<init>()     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r1.append(r0)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            int r11 = r11.getLineNumber()     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r1.append(r11)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            java.lang.String r11 = r1.toString()     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r10.<init>(r11)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            throw r10     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
        L14e:
            if (r2 == 0) goto L15b
            androidx.constraintlayout.widget.ConstraintSet$Transform r0 = r2.transform     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r0.fillFromAttributeList(r10, r3)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            goto L1cb
        L15b:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r1.<init>()     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r1.append(r0)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            int r11 = r11.getLineNumber()     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r1.append(r11)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            java.lang.String r11 = r1.toString()     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r10.<init>(r11)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            throw r10     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
        L174:
            if (r2 == 0) goto L180
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r0 = r2.propertySet     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r0.fillFromAttributeList(r10, r3)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            goto L1cb
        L180:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r1.<init>()     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r1.append(r0)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            int r11 = r11.getLineNumber()     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r1.append(r11)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            java.lang.String r11 = r1.toString()     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r10.<init>(r11)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            throw r10     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
        L199:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = r9.fillFromAttributeList(r10, r0, r7)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r0.layout     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r2.mHelperType = r3     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            goto L1c6
        L1a6:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = r9.fillFromAttributeList(r10, r0, r7)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r0.layout     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r2.mIsGuideline = r3     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            r2.mApply = r3     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            goto L1c6
        L1b5:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = r9.fillFromAttributeList(r10, r0, r3)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            goto L1c6
        L1be:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = r9.fillFromAttributeList(r10, r0, r7)     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
        L1c6:
            r2 = r0
            goto L1cb
        L1c8:
            r11.getName()     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
        L1cb:
            int r0 = r11.next()     // Catch: java.io.IOException -> L1d1 org.xmlpull.v1.XmlPullParserException -> L1d6
            goto L6
        L1d1:
            r10 = move-exception
            r10.printStackTrace()
            goto L1da
        L1d6:
            r10 = move-exception
            r10.printStackTrace()
        L1da:
            return
    }

    public void parseColorAttributes(androidx.constraintlayout.widget.ConstraintSet.Constraint r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = ","
            java.lang.String[] r7 = r7.split(r0)
            r0 = 0
            r1 = 0
        L8:
            int r2 = r7.length
            if (r1 >= r2) goto L3b
            r2 = r7[r1]
            java.lang.String r3 = "="
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            r4 = 2
            if (r3 == r4) goto L2c
            java.lang.String r2 = " Unable to parse "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            r3 = r7[r1]
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "ConstraintSet"
            android.util.Log.w(r3, r2)
            goto L38
        L2c:
            r3 = r2[r0]
            r4 = 1
            r2 = r2[r4]
            int r2 = android.graphics.Color.parseColor(r2)
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$1000(r6, r3, r2)
        L38:
            int r1 = r1 + 1
            goto L8
        L3b:
            return
    }

    public void parseFloatAttributes(androidx.constraintlayout.widget.ConstraintSet.Constraint r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = ","
            java.lang.String[] r7 = r7.split(r0)
            r0 = 0
            r1 = 0
        L8:
            int r2 = r7.length
            if (r1 >= r2) goto L3b
            r2 = r7[r1]
            java.lang.String r3 = "="
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            r4 = 2
            if (r3 == r4) goto L2c
            java.lang.String r2 = " Unable to parse "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            r3 = r7[r1]
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "ConstraintSet"
            android.util.Log.w(r3, r2)
            goto L38
        L2c:
            r3 = r2[r0]
            r4 = 1
            r2 = r2[r4]
            float r2 = java.lang.Float.parseFloat(r2)
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$1100(r6, r3, r2)
        L38:
            int r1 = r1 + 1
            goto L8
        L3b:
            return
    }

    public void parseIntAttributes(androidx.constraintlayout.widget.ConstraintSet.Constraint r6, java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = ","
            java.lang.String[] r7 = r7.split(r0)
            r0 = 0
            r1 = 0
        L8:
            int r2 = r7.length
            if (r1 >= r2) goto L40
            r2 = r7[r1]
            java.lang.String r3 = "="
            java.lang.String[] r2 = r2.split(r3)
            int r3 = r2.length
            r4 = 2
            if (r3 == r4) goto L2c
            java.lang.String r2 = " Unable to parse "
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            r3 = r7[r1]
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "ConstraintSet"
            android.util.Log.w(r3, r2)
            goto L3d
        L2c:
            r3 = r2[r0]
            r4 = 1
            r2 = r2[r4]
            java.lang.Integer r2 = java.lang.Integer.decode(r2)
            int r2 = r2.intValue()
            float r2 = (float) r2
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$1100(r6, r3, r2)
        L3d:
            int r1 = r1 + 1
            goto L8
        L40:
            return
    }

    public void parseStringAttributes(androidx.constraintlayout.widget.ConstraintSet.Constraint r6, java.lang.String r7) {
            r5 = this;
            java.lang.String[] r7 = splitString(r7)
            r0 = 0
            r1 = 0
        L6:
            int r2 = r7.length
            if (r1 >= r2) goto L30
            r2 = r7[r1]
            java.lang.String r3 = "="
            java.lang.String[] r2 = r2.split(r3)
            java.lang.String r3 = " Unable to parse "
            java.lang.StringBuilder r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r3)
            r4 = r7[r1]
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ConstraintSet"
            android.util.Log.w(r4, r3)
            r3 = r2[r0]
            r4 = 1
            r2 = r2[r4]
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$1200(r6, r3, r2)
            int r1 = r1 + 1
            goto L6
        L30:
            return
    }

    public void readFallback(androidx.constraintlayout.widget.ConstraintLayout r12) {
            r11 = this;
            int r0 = r12.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L113
            android.view.View r2 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r3 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r3
            int r4 = r2.getId()
            boolean r5 = r11.mForceId
            if (r5 == 0) goto L25
            r5 = -1
            if (r4 == r5) goto L1d
            goto L25
        L1d:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException
            java.lang.String r0 = "All children of ConstraintLayout must have ids to use ConstraintSet"
            r12.<init>(r0)
            throw r12
        L25:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r5 = r11.mConstraints
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            boolean r5 = r5.containsKey(r6)
            if (r5 != 0) goto L3f
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r5 = r11.mConstraints
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r7 = new androidx.constraintlayout.widget.ConstraintSet$Constraint
            r7.<init>()
            r5.put(r6, r7)
        L3f:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r5 = r11.mConstraints
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r5.get(r6)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r5 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r5
            if (r5 != 0) goto L4f
            goto L10f
        L4f:
            androidx.constraintlayout.widget.ConstraintSet$Layout r6 = r5.layout
            boolean r6 = r6.mApply
            r7 = 1
            if (r6 != 0) goto L8b
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$000(r5, r4, r3)
            boolean r3 = r2 instanceof androidx.constraintlayout.widget.ConstraintHelper
            if (r3 == 0) goto L87
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r5.layout
            r4 = r2
            androidx.constraintlayout.widget.ConstraintHelper r4 = (androidx.constraintlayout.widget.ConstraintHelper) r4
            int[] r4 = r4.getReferencedIds()
            r3.mReferenceIds = r4
            boolean r3 = r2 instanceof androidx.constraintlayout.widget.Barrier
            if (r3 == 0) goto L87
            r3 = r2
            androidx.constraintlayout.widget.Barrier r3 = (androidx.constraintlayout.widget.Barrier) r3
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = r5.layout
            boolean r6 = r3.getAllowsGoneWidget()
            r4.mBarrierAllowsGoneWidgets = r6
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = r5.layout
            int r6 = r3.getType()
            r4.mBarrierDirection = r6
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = r5.layout
            int r3 = r3.getMargin()
            r4.mBarrierMargin = r3
        L87:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r5.layout
            r3.mApply = r7
        L8b:
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r3 = r5.propertySet
            boolean r4 = r3.mApply
            if (r4 != 0) goto La3
            int r4 = r2.getVisibility()
            r3.visibility = r4
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r3 = r5.propertySet
            float r4 = r2.getAlpha()
            r3.alpha = r4
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r3 = r5.propertySet
            r3.mApply = r7
        La3:
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            boolean r4 = r3.mApply
            if (r4 != 0) goto L10f
            r3.mApply = r7
            float r4 = r2.getRotation()
            r3.rotation = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getRotationX()
            r3.rotationX = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getRotationY()
            r3.rotationY = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getScaleX()
            r3.scaleX = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getScaleY()
            r3.scaleY = r4
            float r3 = r2.getPivotX()
            float r4 = r2.getPivotY()
            double r6 = (double) r3
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto Le5
            double r6 = (double) r4
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto Leb
        Le5:
            androidx.constraintlayout.widget.ConstraintSet$Transform r6 = r5.transform
            r6.transformPivotX = r3
            r6.transformPivotY = r4
        Leb:
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getTranslationX()
            r3.translationX = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getTranslationY()
            r3.translationY = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            float r4 = r2.getTranslationZ()
            r3.translationZ = r4
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r5.transform
            boolean r4 = r3.applyElevation
            if (r4 == 0) goto L10f
            float r2 = r2.getElevation()
            r3.elevation = r2
        L10f:
            int r1 = r1 + 1
            goto L5
        L113:
            return
    }

    public void readFallback(androidx.constraintlayout.widget.ConstraintSet r8) {
            r7 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r8.mConstraints
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La3
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r2 = r1.intValue()
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r3 = r8.mConstraints
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r1
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r3 = r7.mConstraints
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r3 = r3.containsKey(r4)
            if (r3 != 0) goto L3c
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r3 = r7.mConstraints
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r5 = new androidx.constraintlayout.widget.ConstraintSet$Constraint
            r5.<init>()
            r3.put(r4, r5)
        L3c:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r3 = r7.mConstraints
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r3.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r2
            if (r2 != 0) goto L4b
            goto La
        L4b:
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r2.layout
            boolean r4 = r3.mApply
            if (r4 != 0) goto L56
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = r1.layout
            r3.copyFrom(r4)
        L56:
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r3 = r2.propertySet
            boolean r4 = r3.mApply
            if (r4 != 0) goto L61
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r4 = r1.propertySet
            r3.copyFrom(r4)
        L61:
            androidx.constraintlayout.widget.ConstraintSet$Transform r3 = r2.transform
            boolean r4 = r3.mApply
            if (r4 != 0) goto L6c
            androidx.constraintlayout.widget.ConstraintSet$Transform r4 = r1.transform
            r3.copyFrom(r4)
        L6c:
            androidx.constraintlayout.widget.ConstraintSet$Motion r3 = r2.motion
            boolean r4 = r3.mApply
            if (r4 != 0) goto L77
            androidx.constraintlayout.widget.ConstraintSet$Motion r4 = r1.motion
            r3.copyFrom(r4)
        L77:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r3 = r1.mCustomConstraints
            java.util.Set r3 = r3.keySet()
            java.util.Iterator r3 = r3.iterator()
        L81:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto La
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r5 = r2.mCustomConstraints
            boolean r5 = r5.containsKey(r4)
            if (r5 != 0) goto L81
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r5 = r2.mCustomConstraints
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r6 = r1.mCustomConstraints
            java.lang.Object r6 = r6.get(r4)
            androidx.constraintlayout.widget.ConstraintAttribute r6 = (androidx.constraintlayout.widget.ConstraintAttribute) r6
            r5.put(r4, r6)
            goto L81
        La3:
            return
    }

    public void removeAttribute(java.lang.String r2) {
            r1 = this;
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r1.mSavedAttributes
            r0.remove(r2)
            return
    }

    public void removeFromHorizontalChain(int r9) {
            r8 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r8.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L9f
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r8.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.Object r0 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r0
            if (r0 != 0) goto L1b
            return
        L1b:
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r0.layout
            int r6 = r0.leftToRight
            int r7 = r0.rightToLeft
            r1 = -1
            if (r6 != r1) goto L69
            if (r7 == r1) goto L27
            goto L69
        L27:
            int r2 = r0.startToEnd
            int r7 = r0.endToStart
            if (r2 != r1) goto L2f
            if (r7 == r1) goto L60
        L2f:
            if (r2 == r1) goto L45
            if (r7 == r1) goto L45
            r3 = 7
            r4 = 6
            r5 = 0
            r0 = r8
            r1 = r2
            r2 = r3
            r3 = r7
            r0.connect(r1, r2, r3, r4, r5)
            r2 = 6
            r4 = 7
            r1 = r7
            r3 = r6
            r0.connect(r1, r2, r3, r4, r5)
            goto L60
        L45:
            if (r7 == r1) goto L60
            int r3 = r0.rightToRight
            if (r3 == r1) goto L54
            r2 = 7
            r4 = 7
            r5 = 0
            r0 = r8
            r1 = r6
            r0.connect(r1, r2, r3, r4, r5)
            goto L60
        L54:
            int r3 = r0.leftToLeft
            if (r3 == r1) goto L60
            r2 = 6
            r4 = 6
            r5 = 0
            r0 = r8
            r1 = r7
            r0.connect(r1, r2, r3, r4, r5)
        L60:
            r0 = 6
            r8.clear(r9, r0)
            r0 = 7
            r8.clear(r9, r0)
            goto L9f
        L69:
            if (r6 == r1) goto L7e
            if (r7 == r1) goto L7e
            r2 = 2
            r4 = 1
            r5 = 0
            r0 = r8
            r1 = r6
            r3 = r7
            r0.connect(r1, r2, r3, r4, r5)
            r2 = 1
            r4 = 2
            r1 = r7
            r3 = r6
            r0.connect(r1, r2, r3, r4, r5)
            goto L97
        L7e:
            int r3 = r0.rightToRight
            if (r3 == r1) goto L8b
            r2 = 2
            r4 = 2
            r5 = 0
            r0 = r8
            r1 = r6
            r0.connect(r1, r2, r3, r4, r5)
            goto L97
        L8b:
            int r3 = r0.leftToLeft
            if (r3 == r1) goto L97
            r2 = 1
            r4 = 1
            r5 = 0
            r0 = r8
            r1 = r7
            r0.connect(r1, r2, r3, r4, r5)
        L97:
            r0 = 1
            r8.clear(r9, r0)
            r0 = 2
            r8.clear(r9, r0)
        L9f:
            return
    }

    public void removeFromVerticalChain(int r10) {
            r9 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r9.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L54
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r0 = r9.mConstraints
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            java.lang.Object r0 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r0
            if (r0 != 0) goto L1b
            return
        L1b:
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r0.layout
            int r7 = r0.topToBottom
            int r8 = r0.bottomToTop
            r1 = -1
            if (r7 != r1) goto L26
            if (r8 == r1) goto L54
        L26:
            if (r7 == r1) goto L3b
            if (r8 == r1) goto L3b
            r3 = 4
            r5 = 3
            r6 = 0
            r1 = r9
            r2 = r7
            r4 = r8
            r1.connect(r2, r3, r4, r5, r6)
            r3 = 3
            r5 = 4
            r2 = r8
            r4 = r7
            r1.connect(r2, r3, r4, r5, r6)
            goto L54
        L3b:
            int r4 = r0.bottomToBottom
            if (r4 == r1) goto L48
            r3 = 4
            r5 = 4
            r6 = 0
            r1 = r9
            r2 = r7
            r1.connect(r2, r3, r4, r5, r6)
            goto L54
        L48:
            int r4 = r0.topToTop
            if (r4 == r1) goto L54
            r3 = 3
            r5 = 3
            r6 = 0
            r1 = r9
            r2 = r8
            r1.connect(r2, r3, r4, r5, r6)
        L54:
            r0 = 3
            r9.clear(r10, r0)
            r0 = 4
            r9.clear(r10, r0)
            return
    }

    public void setAlpha(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r1 = r1.propertySet
            r1.alpha = r2
            return
    }

    public void setApplyElevation(int r1, boolean r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.applyElevation = r2
            return
    }

    public void setBarrierType(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.mHelperType = r2
            return
    }

    public void setColorValue(int r1, java.lang.String r2, int r3) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$1000(r1, r2, r3)
            return
    }

    public void setDimensionRatio(int r1, java.lang.String r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.dimensionRatio = r2
            return
    }

    public void setEditorAbsoluteX(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.editorAbsoluteX = r2
            return
    }

    public void setEditorAbsoluteY(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.editorAbsoluteY = r2
            return
    }

    public void setElevation(int r2, float r3) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Transform r0 = r0.transform
            r0.elevation = r3
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Transform r2 = r2.transform
            r3 = 1
            r2.applyElevation = r3
            return
    }

    public void setFloatValue(int r1, java.lang.String r2, float r3) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$1100(r1, r2, r3)
            return
    }

    public void setForceId(boolean r1) {
            r0 = this;
            r0.mForceId = r1
            return
    }

    public void setGoneMargin(int r1, int r2, int r3) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            switch(r2) {
                case 1: goto L2e;
                case 2: goto L29;
                case 3: goto L24;
                case 4: goto L1f;
                case 5: goto L1a;
                case 6: goto L15;
                case 7: goto L10;
                default: goto L7;
            }
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "unknown constraint"
            r1.<init>(r2)
            throw r1
        L10:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.goneEndMargin = r3
            goto L32
        L15:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.goneStartMargin = r3
            goto L32
        L1a:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.goneBaselineMargin = r3
            goto L32
        L1f:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.goneBottomMargin = r3
            goto L32
        L24:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.goneTopMargin = r3
            goto L32
        L29:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.goneRightMargin = r3
            goto L32
        L2e:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.goneLeftMargin = r3
        L32:
            return
    }

    public void setGuidelineBegin(int r2, int r3) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r0.layout
            r0.guideBegin = r3
            androidx.constraintlayout.widget.ConstraintSet$Constraint r3 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r3.layout
            r0 = -1
            r3.guideEnd = r0
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r2.layout
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.guidePercent = r3
            return
    }

    public void setGuidelineEnd(int r2, int r3) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r0.layout
            r0.guideEnd = r3
            androidx.constraintlayout.widget.ConstraintSet$Constraint r3 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r3.layout
            r0 = -1
            r3.guideBegin = r0
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r2.layout
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.guidePercent = r3
            return
    }

    public void setGuidelinePercent(int r2, float r3) {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r0 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r0 = r0.layout
            r0.guidePercent = r3
            androidx.constraintlayout.widget.ConstraintSet$Constraint r3 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r3 = r3.layout
            r0 = -1
            r3.guideEnd = r0
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r2.layout
            r2.guideBegin = r0
            return
    }

    public void setHorizontalBias(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.horizontalBias = r2
            return
    }

    public void setHorizontalChainStyle(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.horizontalChainStyle = r2
            return
    }

    public void setHorizontalWeight(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.horizontalWeight = r2
            return
    }

    public void setIntValue(int r1, java.lang.String r2, int r3) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$900(r1, r2, r3)
            return
    }

    public void setLayoutWrapBehavior(int r2, int r3) {
            r1 = this;
            if (r3 < 0) goto Ld
            r0 = 3
            if (r3 > r0) goto Ld
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Layout r2 = r2.layout
            r2.mWrapBehavior = r3
        Ld:
            return
    }

    public void setMargin(int r1, int r2, int r3) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            switch(r2) {
                case 1: goto L2e;
                case 2: goto L29;
                case 3: goto L24;
                case 4: goto L1f;
                case 5: goto L1a;
                case 6: goto L15;
                case 7: goto L10;
                default: goto L7;
            }
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "unknown constraint"
            r1.<init>(r2)
            throw r1
        L10:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.endMargin = r3
            goto L32
        L15:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.startMargin = r3
            goto L32
        L1a:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.baselineMargin = r3
            goto L32
        L1f:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.bottomMargin = r3
            goto L32
        L24:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.topMargin = r3
            goto L32
        L29:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.rightMargin = r3
            goto L32
        L2e:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.leftMargin = r3
        L32:
            return
    }

    public void setReferencedIds(int r1, int... r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.mReferenceIds = r2
            return
    }

    public void setRotation(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.rotation = r2
            return
    }

    public void setRotationX(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.rotationX = r2
            return
    }

    public void setRotationY(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.rotationY = r2
            return
    }

    public void setScaleX(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.scaleX = r2
            return
    }

    public void setScaleY(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.scaleY = r2
            return
    }

    public void setStringValue(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet.Constraint.access$1200(r1, r2, r3)
            return
    }

    public void setTransformPivot(int r1, float r2, float r3) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.transformPivotY = r3
            r1.transformPivotX = r2
            return
    }

    public void setTransformPivotX(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.transformPivotX = r2
            return
    }

    public void setTransformPivotY(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.transformPivotY = r2
            return
    }

    public void setTranslation(int r1, float r2, float r3) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.translationX = r2
            r1.translationY = r3
            return
    }

    public void setTranslationX(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.translationX = r2
            return
    }

    public void setTranslationY(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.translationY = r2
            return
    }

    public void setTranslationZ(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Transform r1 = r1.transform
            r1.translationZ = r2
            return
    }

    public void setValidateOnParse(boolean r1) {
            r0 = this;
            r0.mValidate = r1
            return
    }

    public void setVerticalBias(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.verticalBias = r2
            return
    }

    public void setVerticalChainStyle(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.verticalChainStyle = r2
            return
    }

    public void setVerticalWeight(int r1, float r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            r1.verticalWeight = r2
            return
    }

    public void setVisibility(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r1 = r1.propertySet
            r1.visibility = r2
            return
    }

    public void setVisibilityMode(int r1, int r2) {
            r0 = this;
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = r0.get(r1)
            androidx.constraintlayout.widget.ConstraintSet$PropertySet r1 = r1.propertySet
            r1.mVisibilityMode = r2
            return
    }

    public void writeState(java.io.Writer r3, androidx.constraintlayout.widget.ConstraintLayout r4, int r5) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "\n---------------------------------------------\n"
            r3.write(r0)
            r1 = 1
            r5 = r5 & r1
            if (r5 != r1) goto L12
            androidx.constraintlayout.widget.ConstraintSet$WriteXmlEngine r5 = new androidx.constraintlayout.widget.ConstraintSet$WriteXmlEngine
            r5.<init>(r2, r3, r4)
            r5.writeLayout()
            goto L1a
        L12:
            androidx.constraintlayout.widget.ConstraintSet$WriteJsonEngine r5 = new androidx.constraintlayout.widget.ConstraintSet$WriteJsonEngine
            r5.<init>(r2, r3, r4)
            r5.writeLayout()
        L1a:
            r3.write(r0)
            return
    }
}
