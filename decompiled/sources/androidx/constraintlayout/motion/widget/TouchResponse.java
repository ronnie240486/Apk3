package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes2.dex */
class TouchResponse {
    public static final int COMPLETE_MODE_CONTINUOUS_VELOCITY = 0;
    public static final int COMPLETE_MODE_SPRING = 1;
    private static final boolean DEBUG = false;
    private static final float EPSILON = 1.0E-7f;
    private static final int SEC_TO_MILLISECONDS = 1000;
    private static final int SIDE_BOTTOM = 3;
    private static final int SIDE_END = 6;
    private static final int SIDE_LEFT = 1;
    private static final int SIDE_MIDDLE = 4;
    private static final int SIDE_RIGHT = 2;
    private static final int SIDE_START = 5;
    private static final int SIDE_TOP = 0;
    private static final java.lang.String TAG = "TouchResponse";
    private static final float[][] TOUCH_DIRECTION = null;
    private static final int TOUCH_DOWN = 1;
    private static final int TOUCH_END = 5;
    private static final int TOUCH_LEFT = 2;
    private static final int TOUCH_RIGHT = 3;
    private static final float[][] TOUCH_SIDES = null;
    private static final int TOUCH_START = 4;
    private static final int TOUCH_UP = 0;
    private float[] mAnchorDpDt;
    private int mAutoCompleteMode;
    private float mDragScale;
    private boolean mDragStarted;
    private float mDragThreshold;
    private int mFlags;
    public boolean mIsRotateMode;
    private float mLastTouchX;
    private float mLastTouchY;
    private int mLimitBoundsTo;
    private float mMaxAcceleration;
    private float mMaxVelocity;
    private final androidx.constraintlayout.motion.widget.MotionLayout mMotionLayout;
    private boolean mMoveWhenScrollAtTop;
    private int mOnTouchUp;
    public float mRotateCenterX;
    public float mRotateCenterY;
    private int mRotationCenterId;
    private int mSpringBoundary;
    private float mSpringDamping;
    private float mSpringMass;
    private float mSpringStiffness;
    private float mSpringStopThreshold;
    private int[] mTempLoc;
    private int mTouchAnchorId;
    private int mTouchAnchorSide;
    private float mTouchAnchorX;
    private float mTouchAnchorY;
    private float mTouchDirectionX;
    private float mTouchDirectionY;
    private int mTouchRegionId;
    private int mTouchSide;



    static {
            r0 = 7
            float[][] r0 = new float[r0][]
            r1 = 2
            float[] r2 = new float[r1]
            r2 = {x006c: FILL_ARRAY_DATA , data: [1056964608, 0} // fill-array
            r3 = 0
            r0[r3] = r2
            float[] r2 = new float[r1]
            r2 = {x0074: FILL_ARRAY_DATA , data: [0, 1056964608} // fill-array
            r4 = 1
            r0[r4] = r2
            float[] r2 = new float[r1]
            r2 = {x007c: FILL_ARRAY_DATA , data: [1065353216, 1056964608} // fill-array
            r0[r1] = r2
            float[] r2 = new float[r1]
            r2 = {x0084: FILL_ARRAY_DATA , data: [1056964608, 1065353216} // fill-array
            r5 = 3
            r0[r5] = r2
            float[] r2 = new float[r1]
            r2 = {x008c: FILL_ARRAY_DATA , data: [1056964608, 1056964608} // fill-array
            r6 = 4
            r0[r6] = r2
            float[] r2 = new float[r1]
            r2 = {x0094: FILL_ARRAY_DATA , data: [0, 1056964608} // fill-array
            r7 = 5
            r0[r7] = r2
            float[] r2 = new float[r1]
            r2 = {x009c: FILL_ARRAY_DATA , data: [1065353216, 1056964608} // fill-array
            r8 = 6
            r0[r8] = r2
            androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_SIDES = r0
            float[][] r0 = new float[r8][]
            float[] r2 = new float[r1]
            r2 = {x00a4: FILL_ARRAY_DATA , data: [0, -1082130432} // fill-array
            r0[r3] = r2
            float[] r2 = new float[r1]
            r2 = {x00ac: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            r0[r4] = r2
            float[] r2 = new float[r1]
            r2 = {x00b4: FILL_ARRAY_DATA , data: [-1082130432, 0} // fill-array
            r0[r1] = r2
            float[] r2 = new float[r1]
            r2 = {x00bc: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            r0[r5] = r2
            float[] r2 = new float[r1]
            r2 = {x00c4: FILL_ARRAY_DATA , data: [-1082130432, 0} // fill-array
            r0[r6] = r2
            float[] r1 = new float[r1]
            r1 = {x00cc: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            r0[r7] = r1
            androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_DIRECTION = r0
            return
    }

    public TouchResponse(android.content.Context r5, androidx.constraintlayout.motion.widget.MotionLayout r6, org.xmlpull.v1.XmlPullParser r7) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.mTouchAnchorSide = r0
            r4.mTouchSide = r0
            r4.mOnTouchUp = r0
            r1 = -1
            r4.mTouchAnchorId = r1
            r4.mTouchRegionId = r1
            r4.mLimitBoundsTo = r1
            r2 = 1056964608(0x3f000000, float:0.5)
            r4.mTouchAnchorY = r2
            r4.mTouchAnchorX = r2
            r4.mRotateCenterX = r2
            r4.mRotateCenterY = r2
            r4.mRotationCenterId = r1
            r4.mIsRotateMode = r0
            r1 = 0
            r4.mTouchDirectionX = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r4.mTouchDirectionY = r1
            r4.mDragStarted = r0
            r2 = 2
            float[] r3 = new float[r2]
            r4.mAnchorDpDt = r3
            int[] r2 = new int[r2]
            r4.mTempLoc = r2
            r2 = 1082130432(0x40800000, float:4.0)
            r4.mMaxVelocity = r2
            r2 = 1067030938(0x3f99999a, float:1.2)
            r4.mMaxAcceleration = r2
            r2 = 1
            r4.mMoveWhenScrollAtTop = r2
            r4.mDragScale = r1
            r4.mFlags = r0
            r2 = 1092616192(0x41200000, float:10.0)
            r4.mDragThreshold = r2
            r4.mSpringDamping = r2
            r4.mSpringMass = r1
            r1 = 2143289344(0x7fc00000, float:NaN)
            r4.mSpringStiffness = r1
            r4.mSpringStopThreshold = r1
            r4.mSpringBoundary = r0
            r4.mAutoCompleteMode = r0
            r4.mMotionLayout = r6
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r7)
            r4.fillFromAttributeList(r5, r6)
            return
    }

    public TouchResponse(androidx.constraintlayout.motion.widget.MotionLayout r6, androidx.constraintlayout.motion.widget.OnSwipe r7) {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.mTouchAnchorSide = r0
            r5.mTouchSide = r0
            r5.mOnTouchUp = r0
            r1 = -1
            r5.mTouchAnchorId = r1
            r5.mTouchRegionId = r1
            r5.mLimitBoundsTo = r1
            r2 = 1056964608(0x3f000000, float:0.5)
            r5.mTouchAnchorY = r2
            r5.mTouchAnchorX = r2
            r5.mRotateCenterX = r2
            r5.mRotateCenterY = r2
            r5.mRotationCenterId = r1
            r5.mIsRotateMode = r0
            r2 = 0
            r5.mTouchDirectionX = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            r5.mTouchDirectionY = r2
            r5.mDragStarted = r0
            r3 = 2
            float[] r4 = new float[r3]
            r5.mAnchorDpDt = r4
            int[] r3 = new int[r3]
            r5.mTempLoc = r3
            r3 = 1082130432(0x40800000, float:4.0)
            r5.mMaxVelocity = r3
            r3 = 1067030938(0x3f99999a, float:1.2)
            r5.mMaxAcceleration = r3
            r3 = 1
            r5.mMoveWhenScrollAtTop = r3
            r5.mDragScale = r2
            r5.mFlags = r0
            r4 = 1092616192(0x41200000, float:10.0)
            r5.mDragThreshold = r4
            r5.mSpringDamping = r4
            r5.mSpringMass = r2
            r2 = 2143289344(0x7fc00000, float:NaN)
            r5.mSpringStiffness = r2
            r5.mSpringStopThreshold = r2
            r5.mSpringBoundary = r0
            r5.mAutoCompleteMode = r0
            r5.mMotionLayout = r6
            int r6 = r7.getTouchAnchorId()
            r5.mTouchAnchorId = r6
            int r6 = r7.getTouchAnchorSide()
            r5.mTouchAnchorSide = r6
            if (r6 == r1) goto L71
            float[][] r1 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_SIDES
            r4 = r1[r6]
            r4 = r4[r0]
            r5.mTouchAnchorX = r4
            r6 = r1[r6]
            r6 = r6[r3]
            r5.mTouchAnchorY = r6
        L71:
            int r6 = r7.getDragDirection()
            r5.mTouchSide = r6
            float[][] r1 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_DIRECTION
            int r4 = r1.length
            if (r6 >= r4) goto L89
            r2 = r1[r6]
            r0 = r2[r0]
            r5.mTouchDirectionX = r0
            r6 = r1[r6]
            r6 = r6[r3]
            r5.mTouchDirectionY = r6
            goto L8f
        L89:
            r5.mTouchDirectionY = r2
            r5.mTouchDirectionX = r2
            r5.mIsRotateMode = r3
        L8f:
            float r6 = r7.getMaxVelocity()
            r5.mMaxVelocity = r6
            float r6 = r7.getMaxAcceleration()
            r5.mMaxAcceleration = r6
            boolean r6 = r7.getMoveWhenScrollAtTop()
            r5.mMoveWhenScrollAtTop = r6
            float r6 = r7.getDragScale()
            r5.mDragScale = r6
            float r6 = r7.getDragThreshold()
            r5.mDragThreshold = r6
            int r6 = r7.getTouchRegionId()
            r5.mTouchRegionId = r6
            int r6 = r7.getOnTouchUp()
            r5.mOnTouchUp = r6
            int r6 = r7.getNestedScrollFlags()
            r5.mFlags = r6
            int r6 = r7.getLimitBoundsTo()
            r5.mLimitBoundsTo = r6
            int r6 = r7.getRotationCenterId()
            r5.mRotationCenterId = r6
            int r6 = r7.getSpringBoundary()
            r5.mSpringBoundary = r6
            float r6 = r7.getSpringDamping()
            r5.mSpringDamping = r6
            float r6 = r7.getSpringMass()
            r5.mSpringMass = r6
            float r6 = r7.getSpringStiffness()
            r5.mSpringStiffness = r6
            float r6 = r7.getSpringStopThreshold()
            r5.mSpringStopThreshold = r6
            int r6 = r7.getAutoCompleteMode()
            r5.mAutoCompleteMode = r6
            return
    }

    private void fill(android.content.res.TypedArray r8) {
            r7 = this;
            int r0 = r8.getIndexCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L136
            int r3 = r8.getIndex(r2)
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_touchAnchorId
            if (r3 != r4) goto L1a
            int r4 = r7.mTouchAnchorId
            int r3 = r8.getResourceId(r3, r4)
            r7.mTouchAnchorId = r3
            goto L132
        L1a:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_touchAnchorSide
            r5 = 1
            if (r3 != r4) goto L37
            int r4 = r7.mTouchAnchorSide
            int r3 = r8.getInt(r3, r4)
            r7.mTouchAnchorSide = r3
            float[][] r4 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_SIDES
            r6 = r4[r3]
            r6 = r6[r1]
            r7.mTouchAnchorX = r6
            r3 = r4[r3]
            r3 = r3[r5]
            r7.mTouchAnchorY = r3
            goto L132
        L37:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_dragDirection
            if (r3 != r4) goto L60
            int r4 = r7.mTouchSide
            int r3 = r8.getInt(r3, r4)
            r7.mTouchSide = r3
            float[][] r4 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_DIRECTION
            int r6 = r4.length
            if (r3 >= r6) goto L56
            r6 = r4[r3]
            r6 = r6[r1]
            r7.mTouchDirectionX = r6
            r3 = r4[r3]
            r3 = r3[r5]
            r7.mTouchDirectionY = r3
            goto L132
        L56:
            r3 = 2143289344(0x7fc00000, float:NaN)
            r7.mTouchDirectionY = r3
            r7.mTouchDirectionX = r3
            r7.mIsRotateMode = r5
            goto L132
        L60:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_maxVelocity
            if (r3 != r4) goto L6e
            float r4 = r7.mMaxVelocity
            float r3 = r8.getFloat(r3, r4)
            r7.mMaxVelocity = r3
            goto L132
        L6e:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_maxAcceleration
            if (r3 != r4) goto L7c
            float r4 = r7.mMaxAcceleration
            float r3 = r8.getFloat(r3, r4)
            r7.mMaxAcceleration = r3
            goto L132
        L7c:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_moveWhenScrollAtTop
            if (r3 != r4) goto L8a
            boolean r4 = r7.mMoveWhenScrollAtTop
            boolean r3 = r8.getBoolean(r3, r4)
            r7.mMoveWhenScrollAtTop = r3
            goto L132
        L8a:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_dragScale
            if (r3 != r4) goto L98
            float r4 = r7.mDragScale
            float r3 = r8.getFloat(r3, r4)
            r7.mDragScale = r3
            goto L132
        L98:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_dragThreshold
            if (r3 != r4) goto La6
            float r4 = r7.mDragThreshold
            float r3 = r8.getFloat(r3, r4)
            r7.mDragThreshold = r3
            goto L132
        La6:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_touchRegionId
            if (r3 != r4) goto Lb4
            int r4 = r7.mTouchRegionId
            int r3 = r8.getResourceId(r3, r4)
            r7.mTouchRegionId = r3
            goto L132
        Lb4:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_onTouchUp
            if (r3 != r4) goto Lc2
            int r4 = r7.mOnTouchUp
            int r3 = r8.getInt(r3, r4)
            r7.mOnTouchUp = r3
            goto L132
        Lc2:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_nestedScrollFlags
            if (r3 != r4) goto Lcd
            int r3 = r8.getInteger(r3, r1)
            r7.mFlags = r3
            goto L132
        Lcd:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_limitBoundsTo
            if (r3 != r4) goto Ld8
            int r3 = r8.getResourceId(r3, r1)
            r7.mLimitBoundsTo = r3
            goto L132
        Ld8:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_rotationCenterId
            if (r3 != r4) goto Le5
            int r4 = r7.mRotationCenterId
            int r3 = r8.getResourceId(r3, r4)
            r7.mRotationCenterId = r3
            goto L132
        Le5:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_springDamping
            if (r3 != r4) goto Lf2
            float r4 = r7.mSpringDamping
            float r3 = r8.getFloat(r3, r4)
            r7.mSpringDamping = r3
            goto L132
        Lf2:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_springMass
            if (r3 != r4) goto Lff
            float r4 = r7.mSpringMass
            float r3 = r8.getFloat(r3, r4)
            r7.mSpringMass = r3
            goto L132
        Lff:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_springStiffness
            if (r3 != r4) goto L10c
            float r4 = r7.mSpringStiffness
            float r3 = r8.getFloat(r3, r4)
            r7.mSpringStiffness = r3
            goto L132
        L10c:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_springStopThreshold
            if (r3 != r4) goto L119
            float r4 = r7.mSpringStopThreshold
            float r3 = r8.getFloat(r3, r4)
            r7.mSpringStopThreshold = r3
            goto L132
        L119:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_springBoundary
            if (r3 != r4) goto L126
            int r4 = r7.mSpringBoundary
            int r3 = r8.getInt(r3, r4)
            r7.mSpringBoundary = r3
            goto L132
        L126:
            int r4 = androidx.constraintlayout.widget.R.styleable.OnSwipe_autoCompleteMode
            if (r3 != r4) goto L132
            int r4 = r7.mAutoCompleteMode
            int r3 = r8.getInt(r3, r4)
            r7.mAutoCompleteMode = r3
        L132:
            int r2 = r2 + 1
            goto L6
        L136:
            return
    }

    private void fillFromAttributeList(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int[] r0 = androidx.constraintlayout.widget.R.styleable.OnSwipe
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            r1.fill(r2)
            r2.recycle()
            return
    }

    public final float dot(float r2, float r3) {
            r1 = this;
            float r0 = r1.mTouchDirectionX
            float r2 = r2 * r0
            float r0 = r1.mTouchDirectionY
            float r3 = r3 * r0
            float r3 = r3 + r2
            return r3
    }

    public int getAnchorId() {
            r1 = this;
            int r0 = r1.mTouchAnchorId
            return r0
    }

    public int getAutoCompleteMode() {
            r1 = this;
            int r0 = r1.mAutoCompleteMode
            return r0
    }

    public int getFlags() {
            r1 = this;
            int r0 = r1.mFlags
            return r0
    }

    public final android.graphics.RectF getLimitBoundsTo(android.view.ViewGroup r4, android.graphics.RectF r5) {
            r3 = this;
            int r0 = r3.mLimitBoundsTo
            r1 = 0
            r2 = -1
            if (r0 != r2) goto L7
            return r1
        L7:
            android.view.View r4 = r4.findViewById(r0)
            if (r4 != 0) goto Le
            return r1
        Le:
            int r0 = r4.getLeft()
            float r0 = (float) r0
            int r1 = r4.getTop()
            float r1 = (float) r1
            int r2 = r4.getRight()
            float r2 = (float) r2
            int r4 = r4.getBottom()
            float r4 = (float) r4
            r5.set(r0, r1, r2, r4)
            return r5
    }

    public final float getMaxAcceleration() {
            r1 = this;
            float r0 = r1.mMaxAcceleration
            return r0
    }

    public float getMaxVelocity() {
            r1 = this;
            float r0 = r1.mMaxVelocity
            return r0
    }

    public final boolean getMoveWhenScrollAtTop() {
            r1 = this;
            boolean r0 = r1.mMoveWhenScrollAtTop
            return r0
    }

    public final float getProgressDirection(float r8, float r9) {
            r7 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r7.mMotionLayout
            float r3 = r0.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r7.mMotionLayout
            int r2 = r7.mTouchAnchorId
            float r4 = r7.mTouchAnchorX
            float r5 = r7.mTouchAnchorY
            float[] r6 = r7.mAnchorDpDt
            r1.getAnchorDpDt(r2, r3, r4, r5, r6)
            float r0 = r7.mTouchDirectionX
            r1 = 869711765(0x33d6bf95, float:1.0E-7)
            r2 = 0
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 == 0) goto L2e
            float[] r9 = r7.mAnchorDpDt
            r3 = 0
            r4 = r9[r3]
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L28
            r9[r3] = r1
        L28:
            float r8 = r8 * r0
            r9 = r9[r3]
            float r8 = r8 / r9
            goto L41
        L2e:
            float[] r8 = r7.mAnchorDpDt
            r0 = 1
            r3 = r8[r0]
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L39
            r8[r0] = r1
        L39:
            float r1 = r7.mTouchDirectionY
            float r9 = r9 * r1
            r8 = r8[r0]
            float r8 = r9 / r8
        L41:
            return r8
    }

    public int getSpringBoundary() {
            r1 = this;
            int r0 = r1.mSpringBoundary
            return r0
    }

    public float getSpringDamping() {
            r1 = this;
            float r0 = r1.mSpringDamping
            return r0
    }

    public float getSpringMass() {
            r1 = this;
            float r0 = r1.mSpringMass
            return r0
    }

    public float getSpringStiffness() {
            r1 = this;
            float r0 = r1.mSpringStiffness
            return r0
    }

    public float getSpringStopThreshold() {
            r1 = this;
            float r0 = r1.mSpringStopThreshold
            return r0
    }

    public final android.graphics.RectF getTouchRegion(android.view.ViewGroup r4, android.graphics.RectF r5) {
            r3 = this;
            int r0 = r3.mTouchRegionId
            r1 = 0
            r2 = -1
            if (r0 != r2) goto L7
            return r1
        L7:
            android.view.View r4 = r4.findViewById(r0)
            if (r4 != 0) goto Le
            return r1
        Le:
            int r0 = r4.getLeft()
            float r0 = (float) r0
            int r1 = r4.getTop()
            float r1 = (float) r1
            int r2 = r4.getRight()
            float r2 = (float) r2
            int r4 = r4.getBottom()
            float r4 = (float) r4
            r5.set(r0, r1, r2, r4)
            return r5
    }

    public final int getTouchRegionId() {
            r1 = this;
            int r0 = r1.mTouchRegionId
            return r0
    }

    public final boolean isDragStarted() {
            r1 = this;
            boolean r0 = r1.mDragStarted
            return r0
    }

    public final void processTouchEvent(android.view.MotionEvent r28, androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker r29) {
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            boolean r3 = r0.mIsRotateMode
            r6 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            r8 = 0
            r11 = 1000(0x3e8, float:1.401E-42)
            r12 = 1
            r13 = -1
            r9 = 3
            r17 = 1077936128(0x40400000, float:3.0)
            r10 = 2
            if (r3 == 0) goto L369
            r2.addMovement(r1)
            int r3 = r28.getAction()
            if (r3 == 0) goto L359
            r18 = 1073741824(0x40000000, float:2.0)
            r19 = 1135869952(0x43b40000, float:360.0)
            if (r3 == r12) goto L1db
            if (r3 == r10) goto L2b
            goto L368
        L2b:
            r28.getRawY()
            r28.getRawX()
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r3 = r3 / r18
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.mMotionLayout
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r4 = r4 / r18
            int r5 = r0.mRotationCenterId
            if (r5 == r13) goto L7e
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            android.view.View r3 = r3.findViewById(r5)
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.mMotionLayout
            int[] r5 = r0.mTempLoc
            r4.getLocationOnScreen(r5)
            int[] r4 = r0.mTempLoc
            r4 = r4[r8]
            float r4 = (float) r4
            int r5 = r3.getLeft()
            int r9 = r3.getRight()
            int r9 = r9 + r5
            float r5 = (float) r9
            float r5 = r5 / r18
            float r4 = r4 + r5
            int[] r5 = r0.mTempLoc
            r5 = r5[r12]
            float r5 = (float) r5
            int r9 = r3.getTop()
            int r3 = r3.getBottom()
            int r3 = r3 + r9
            float r3 = (float) r3
            float r3 = r3 / r18
            float r3 = r3 + r5
            r26 = r4
            r4 = r3
            r3 = r26
            goto Lcf
        L7e:
            int r5 = r0.mTouchAnchorId
            if (r5 == r13) goto Lcf
            androidx.constraintlayout.motion.widget.MotionLayout r9 = r0.mMotionLayout
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r10 = r9.mFrameArrayList
            android.view.View r5 = r9.findViewById(r5)
            java.lang.Object r5 = r10.get(r5)
            androidx.constraintlayout.motion.widget.MotionController r5 = (androidx.constraintlayout.motion.widget.MotionController) r5
            androidx.constraintlayout.motion.widget.MotionLayout r9 = r0.mMotionLayout
            int r5 = r5.getAnimateRelativeTo()
            android.view.View r5 = r9.findViewById(r5)
            if (r5 != 0) goto La4
            java.lang.String r5 = "TouchResponse"
            java.lang.String r9 = "could not find view to animate to"
            android.util.Log.e(r5, r9)
            goto Lcf
        La4:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            int[] r4 = r0.mTempLoc
            r3.getLocationOnScreen(r4)
            int[] r3 = r0.mTempLoc
            r3 = r3[r8]
            float r3 = (float) r3
            int r4 = r5.getLeft()
            int r9 = r5.getRight()
            int r9 = r9 + r4
            float r4 = (float) r9
            float r4 = r4 / r18
            float r3 = r3 + r4
            int[] r4 = r0.mTempLoc
            r4 = r4[r12]
            float r4 = (float) r4
            int r9 = r5.getTop()
            int r5 = r5.getBottom()
            int r5 = r5 + r9
            float r5 = (float) r5
            float r5 = r5 / r18
            float r4 = r4 + r5
        Lcf:
            float r5 = r28.getRawX()
            float r5 = r5 - r3
            float r9 = r28.getRawY()
            float r9 = r9 - r4
            float r10 = r28.getRawY()
            float r10 = r10 - r4
            r16 = r9
            double r8 = (double) r10
            float r10 = r28.getRawX()
            float r10 = r10 - r3
            double r14 = (double) r10
            double r8 = java.lang.Math.atan2(r8, r14)
            float r10 = r0.mLastTouchY
            float r10 = r10 - r4
            double r14 = (double) r10
            float r4 = r0.mLastTouchX
            float r4 = r4 - r3
            double r3 = (double) r4
            double r3 = java.lang.Math.atan2(r14, r3)
            double r3 = r8 - r3
            r14 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r3 = r3 * r14
            r14 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r3 = r3 / r14
            float r3 = (float) r3
            r4 = 1134886912(0x43a50000, float:330.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L110
            float r3 = r3 - r19
            goto L118
        L110:
            r4 = -1012596736(0xffffffffc3a50000, float:-330.0)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L118
            float r3 = r3 + r19
        L118:
            float r4 = java.lang.Math.abs(r3)
            double r14 = (double) r4
            int r4 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r4 > 0) goto L125
            boolean r4 = r0.mDragStarted
            if (r4 == 0) goto L368
        L125:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.mMotionLayout
            float r4 = r4.getProgress()
            boolean r6 = r0.mDragStarted
            if (r6 != 0) goto L136
            r0.mDragStarted = r12
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r0.mMotionLayout
            r6.setProgress(r4)
        L136:
            int r6 = r0.mTouchAnchorId
            if (r6 == r13) goto L15e
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.mMotionLayout
            float r10 = r0.mTouchAnchorX
            float r13 = r0.mTouchAnchorY
            float[] r14 = r0.mAnchorDpDt
            r20 = r7
            r21 = r6
            r22 = r4
            r23 = r10
            r24 = r13
            r25 = r14
            r20.getAnchorDpDt(r21, r22, r23, r24, r25)
            float[] r6 = r0.mAnchorDpDt
            r7 = r6[r12]
            double r13 = (double) r7
            double r13 = java.lang.Math.toDegrees(r13)
            float r7 = (float) r13
            r6[r12] = r7
            goto L162
        L15e:
            float[] r6 = r0.mAnchorDpDt
            r6[r12] = r19
        L162:
            float r6 = r0.mDragScale
            float r3 = r3 * r6
            float[] r6 = r0.mAnchorDpDt
            r6 = r6[r12]
            float r3 = r3 / r6
            float r3 = r3 + r4
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = java.lang.Math.min(r3, r4)
            r6 = 0
            float r3 = java.lang.Math.max(r3, r6)
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.mMotionLayout
            float r7 = r7.getProgress()
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 == 0) goto L1c8
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 == 0) goto L189
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 != 0) goto L192
        L189:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.mMotionLayout
            if (r6 != 0) goto L18e
            goto L18f
        L18e:
            r12 = 0
        L18f:
            r4.endTrigger(r12)
        L192:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.mMotionLayout
            r4.setProgress(r3)
            r2.computeCurrentVelocity(r11)
            float r3 = r29.getXVelocity()
            float r2 = r29.getYVelocity()
            double r6 = (double) r2
            double r2 = (double) r3
            double r10 = java.lang.Math.hypot(r6, r2)
            double r2 = java.lang.Math.atan2(r6, r2)
            double r2 = r2 - r8
            double r2 = java.lang.Math.sin(r2)
            double r2 = r2 * r10
            double r4 = (double) r5
            r9 = r16
            double r6 = (double) r9
            double r4 = java.lang.Math.hypot(r4, r6)
            double r2 = r2 / r4
            float r2 = (float) r2
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            double r4 = (double) r2
            double r4 = java.lang.Math.toDegrees(r4)
            float r2 = (float) r4
            r3.mLastVelocity = r2
            goto L1cd
        L1c8:
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r0.mMotionLayout
            r3 = 0
            r2.mLastVelocity = r3
        L1cd:
            float r2 = r28.getRawX()
            r0.mLastTouchX = r2
            float r1 = r28.getRawY()
            r0.mLastTouchY = r1
            goto L368
        L1db:
            r3 = 0
            r0.mDragStarted = r3
            r3 = 16
            r2.computeCurrentVelocity(r3)
            float r3 = r29.getXVelocity()
            float r2 = r29.getYVelocity()
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r0.mMotionLayout
            float r6 = r6.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.mMotionLayout
            int r7 = r7.getWidth()
            float r7 = (float) r7
            float r7 = r7 / r18
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.mMotionLayout
            int r8 = r8.getHeight()
            float r8 = (float) r8
            float r8 = r8 / r18
            int r10 = r0.mRotationCenterId
            if (r10 == r13) goto L235
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.mMotionLayout
            android.view.View r7 = r7.findViewById(r10)
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.mMotionLayout
            int[] r10 = r0.mTempLoc
            r8.getLocationOnScreen(r10)
            int[] r8 = r0.mTempLoc
            r10 = 0
            r8 = r8[r10]
            float r8 = (float) r8
            int r10 = r7.getLeft()
            int r11 = r7.getRight()
            int r11 = r11 + r10
            float r10 = (float) r11
            float r10 = r10 / r18
            float r10 = r10 + r8
            int[] r8 = r0.mTempLoc
            r8 = r8[r12]
            float r8 = (float) r8
            int r11 = r7.getTop()
            int r7 = r7.getBottom()
            goto L278
        L235:
            int r10 = r0.mTouchAnchorId
            if (r10 == r13) goto L27e
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r0.mMotionLayout
            java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.MotionController> r8 = r7.mFrameArrayList
            android.view.View r7 = r7.findViewById(r10)
            java.lang.Object r7 = r8.get(r7)
            androidx.constraintlayout.motion.widget.MotionController r7 = (androidx.constraintlayout.motion.widget.MotionController) r7
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.mMotionLayout
            int r7 = r7.getAnimateRelativeTo()
            android.view.View r7 = r8.findViewById(r7)
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.mMotionLayout
            int[] r10 = r0.mTempLoc
            r8.getLocationOnScreen(r10)
            int[] r8 = r0.mTempLoc
            r10 = 0
            r8 = r8[r10]
            float r8 = (float) r8
            int r10 = r7.getLeft()
            int r11 = r7.getRight()
            int r11 = r11 + r10
            float r10 = (float) r11
            float r10 = r10 / r18
            float r10 = r10 + r8
            int[] r8 = r0.mTempLoc
            r8 = r8[r12]
            float r8 = (float) r8
            int r11 = r7.getTop()
            int r7 = r7.getBottom()
        L278:
            int r7 = r7 + r11
            float r7 = (float) r7
            float r7 = r7 / r18
            float r8 = r8 + r7
            r7 = r10
        L27e:
            float r10 = r28.getRawX()
            float r10 = r10 - r7
            float r1 = r28.getRawY()
            float r1 = r1 - r8
            double r7 = (double) r1
            double r14 = (double) r10
            double r7 = java.lang.Math.atan2(r7, r14)
            double r7 = java.lang.Math.toDegrees(r7)
            int r11 = r0.mTouchAnchorId
            if (r11 == r13) goto L2ba
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r0.mMotionLayout
            float r14 = r0.mTouchAnchorX
            float r15 = r0.mTouchAnchorY
            float[] r4 = r0.mAnchorDpDt
            r20 = r13
            r21 = r11
            r22 = r6
            r23 = r14
            r24 = r15
            r25 = r4
            r20.getAnchorDpDt(r21, r22, r23, r24, r25)
            float[] r4 = r0.mAnchorDpDt
            r5 = r4[r12]
            double r13 = (double) r5
            double r13 = java.lang.Math.toDegrees(r13)
            float r5 = (float) r13
            r4[r12] = r5
            goto L2be
        L2ba:
            float[] r4 = r0.mAnchorDpDt
            r4[r12] = r19
        L2be:
            float r2 = r2 + r1
            double r1 = (double) r2
            float r3 = r3 + r10
            double r3 = (double) r3
            double r1 = java.lang.Math.atan2(r1, r3)
            double r1 = java.lang.Math.toDegrees(r1)
            double r1 = r1 - r7
            float r1 = (float) r1
            r2 = 1115291648(0x427a0000, float:62.5)
            float r1 = r1 * r2
            boolean r2 = java.lang.Float.isNaN(r1)
            if (r2 != 0) goto L2e3
            float r2 = r1 * r17
            float r3 = r0.mDragScale
            float r2 = r2 * r3
            float[] r3 = r0.mAnchorDpDt
            r3 = r3[r12]
            float r2 = r2 / r3
            float r2 = r2 + r6
            goto L2e4
        L2e3:
            r2 = r6
        L2e4:
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L346
            r3 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L346
            int r3 = r0.mOnTouchUp
            if (r3 == r9) goto L346
            float r4 = r0.mDragScale
            float r1 = r1 * r4
            float[] r4 = r0.mAnchorDpDt
            r4 = r4[r12]
            float r1 = r1 / r4
            double r4 = (double) r2
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r2 >= 0) goto L305
            r2 = 0
            goto L307
        L305:
            r2 = 1065353216(0x3f800000, float:1.0)
        L307:
            r4 = 6
            if (r3 != r4) goto L317
            float r2 = r6 + r1
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L315
            float r1 = java.lang.Math.abs(r1)
        L315:
            r2 = 1065353216(0x3f800000, float:1.0)
        L317:
            int r3 = r0.mOnTouchUp
            r4 = 7
            if (r3 != r4) goto L32a
            float r2 = r6 + r1
            r3 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L329
            float r1 = java.lang.Math.abs(r1)
            float r1 = -r1
        L329:
            r2 = 0
        L32a:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            int r4 = r0.mOnTouchUp
            float r1 = r1 * r17
            r3.touchAnimateTo(r4, r2, r1)
            r1 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 >= 0) goto L33e
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 > 0) goto L368
        L33e:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r1.setState(r2)
            goto L368
        L346:
            r1 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L351
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L368
        L351:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r1.setState(r2)
            goto L368
        L359:
            float r2 = r28.getRawX()
            r0.mLastTouchX = r2
            float r1 = r28.getRawY()
            r0.mLastTouchY = r1
            r1 = 0
            r0.mDragStarted = r1
        L368:
            return
        L369:
            r2.addMovement(r1)
            int r3 = r28.getAction()
            if (r3 == 0) goto L57d
            if (r3 == r12) goto L4a2
            if (r3 == r10) goto L378
            goto L58c
        L378:
            float r3 = r28.getRawY()
            float r4 = r0.mLastTouchY
            float r3 = r3 - r4
            float r4 = r28.getRawX()
            float r5 = r0.mLastTouchX
            float r4 = r4 - r5
            float r5 = r0.mTouchDirectionX
            float r5 = r5 * r4
            float r8 = r0.mTouchDirectionY
            float r8 = r8 * r3
            float r8 = r8 + r5
            float r5 = java.lang.Math.abs(r8)
            float r8 = r0.mDragThreshold
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 > 0) goto L39d
            boolean r5 = r0.mDragStarted
            if (r5 == 0) goto L58c
        L39d:
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r0.mMotionLayout
            float r5 = r5.getProgress()
            boolean r8 = r0.mDragStarted
            if (r8 != 0) goto L3ae
            r0.mDragStarted = r12
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.mMotionLayout
            r8.setProgress(r5)
        L3ae:
            int r8 = r0.mTouchAnchorId
            if (r8 == r13) goto L3cb
            androidx.constraintlayout.motion.widget.MotionLayout r9 = r0.mMotionLayout
            float r10 = r0.mTouchAnchorX
            float r13 = r0.mTouchAnchorY
            float[] r14 = r0.mAnchorDpDt
            r20 = r9
            r21 = r8
            r22 = r5
            r23 = r10
            r24 = r13
            r25 = r14
            r20.getAnchorDpDt(r21, r22, r23, r24, r25)
            r10 = 0
            goto L3eb
        L3cb:
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r0.mMotionLayout
            int r8 = r8.getWidth()
            androidx.constraintlayout.motion.widget.MotionLayout r9 = r0.mMotionLayout
            int r9 = r9.getHeight()
            int r8 = java.lang.Math.min(r8, r9)
            float r8 = (float) r8
            float[] r9 = r0.mAnchorDpDt
            float r10 = r0.mTouchDirectionY
            float r10 = r10 * r8
            r9[r12] = r10
            float r10 = r0.mTouchDirectionX
            float r8 = r8 * r10
            r10 = 0
            r9[r10] = r8
        L3eb:
            float r8 = r0.mTouchDirectionX
            float[] r9 = r0.mAnchorDpDt
            r13 = r9[r10]
            float r8 = r8 * r13
            float r10 = r0.mTouchDirectionY
            r9 = r9[r12]
            float r10 = r10 * r9
            float r10 = r10 + r8
            float r8 = r0.mDragScale
            float r10 = r10 * r8
            float r8 = java.lang.Math.abs(r10)
            double r8 = (double) r8
            r10 = 1008981770(0x3c23d70a, float:0.01)
            int r13 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r13 >= 0) goto L412
            float[] r6 = r0.mAnchorDpDt
            r7 = 0
            r6[r7] = r10
            r6[r12] = r10
            goto L413
        L412:
            r7 = 0
        L413:
            float r6 = r0.mTouchDirectionX
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L420
            float[] r3 = r0.mAnchorDpDt
            r3 = r3[r7]
            float r4 = r4 / r3
            goto L426
        L420:
            float[] r4 = r0.mAnchorDpDt
            r4 = r4[r12]
            float r4 = r3 / r4
        L426:
            float r5 = r5 + r4
            r3 = 1065353216(0x3f800000, float:1.0)
            float r4 = java.lang.Math.min(r5, r3)
            r3 = 0
            float r4 = java.lang.Math.max(r4, r3)
            int r3 = r0.mOnTouchUp
            r5 = 6
            if (r3 != r5) goto L43b
            float r4 = java.lang.Math.max(r4, r10)
        L43b:
            int r3 = r0.mOnTouchUp
            r5 = 7
            if (r3 != r5) goto L447
            r3 = 1065185444(0x3f7d70a4, float:0.99)
            float r4 = java.lang.Math.min(r4, r3)
        L447:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            float r3 = r3.getProgress()
            int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r5 == 0) goto L48f
            r5 = 0
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 == 0) goto L45c
            r5 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L466
        L45c:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            if (r6 != 0) goto L462
            r5 = 1
            goto L463
        L462:
            r5 = 0
        L463:
            r3.endTrigger(r5)
        L466:
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            r3.setProgress(r4)
            r2.computeCurrentVelocity(r11)
            float r3 = r29.getXVelocity()
            float r2 = r29.getYVelocity()
            float r4 = r0.mTouchDirectionX
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L484
            float[] r2 = r0.mAnchorDpDt
            r4 = 0
            r2 = r2[r4]
            float r3 = r3 / r2
            goto L48a
        L484:
            float[] r3 = r0.mAnchorDpDt
            r3 = r3[r12]
            float r3 = r2 / r3
        L48a:
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r0.mMotionLayout
            r2.mLastVelocity = r3
            goto L494
        L48f:
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r0.mMotionLayout
            r3 = 0
            r2.mLastVelocity = r3
        L494:
            float r2 = r28.getRawX()
            r0.mLastTouchX = r2
            float r1 = r28.getRawY()
            r0.mLastTouchY = r1
            goto L58c
        L4a2:
            r1 = 0
            r0.mDragStarted = r1
            r2.computeCurrentVelocity(r11)
            float r1 = r29.getXVelocity()
            float r2 = r29.getYVelocity()
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r0.mMotionLayout
            float r3 = r3.getProgress()
            int r4 = r0.mTouchAnchorId
            if (r4 == r13) goto L4d3
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r0.mMotionLayout
            float r6 = r0.mTouchAnchorX
            float r7 = r0.mTouchAnchorY
            float[] r8 = r0.mAnchorDpDt
            r20 = r5
            r21 = r4
            r22 = r3
            r23 = r6
            r24 = r7
            r25 = r8
            r20.getAnchorDpDt(r21, r22, r23, r24, r25)
            r6 = 0
            goto L4f3
        L4d3:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.mMotionLayout
            int r4 = r4.getWidth()
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r0.mMotionLayout
            int r5 = r5.getHeight()
            int r4 = java.lang.Math.min(r4, r5)
            float r4 = (float) r4
            float[] r5 = r0.mAnchorDpDt
            float r6 = r0.mTouchDirectionY
            float r6 = r6 * r4
            r5[r12] = r6
            float r6 = r0.mTouchDirectionX
            float r4 = r4 * r6
            r6 = 0
            r5[r6] = r4
        L4f3:
            float r4 = r0.mTouchDirectionX
            float[] r5 = r0.mAnchorDpDt
            r7 = r5[r6]
            r7 = r5[r12]
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 == 0) goto L504
            r2 = r5[r6]
            float r1 = r1 / r2
            goto L508
        L504:
            r1 = r5[r12]
            float r1 = r2 / r1
        L508:
            boolean r2 = java.lang.Float.isNaN(r1)
            if (r2 != 0) goto L512
            float r2 = r1 / r17
            float r2 = r2 + r3
            goto L513
        L512:
            r2 = r3
        L513:
            r4 = 0
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 == 0) goto L56a
            r4 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 == 0) goto L56a
            int r4 = r0.mOnTouchUp
            if (r4 == r9) goto L56a
            double r5 = (double) r2
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L52b
            r2 = 0
            goto L52d
        L52b:
            r2 = 1065353216(0x3f800000, float:1.0)
        L52d:
            r5 = 6
            if (r4 != r5) goto L53d
            float r2 = r3 + r1
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L53b
            float r1 = java.lang.Math.abs(r1)
        L53b:
            r2 = 1065353216(0x3f800000, float:1.0)
        L53d:
            int r4 = r0.mOnTouchUp
            r5 = 7
            if (r4 != r5) goto L550
            float r2 = r3 + r1
            r4 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L54f
            float r1 = java.lang.Math.abs(r1)
            float r1 = -r1
        L54f:
            r2 = 0
        L550:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r0.mMotionLayout
            int r5 = r0.mOnTouchUp
            r4.touchAnimateTo(r5, r2, r1)
            r1 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L562
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L58c
        L562:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r1.setState(r2)
            goto L58c
        L56a:
            r1 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L575
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L58c
        L575:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.mMotionLayout
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r2 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            r1.setState(r2)
            goto L58c
        L57d:
            float r2 = r28.getRawX()
            r0.mLastTouchX = r2
            float r1 = r28.getRawY()
            r0.mLastTouchY = r1
            r1 = 0
            r0.mDragStarted = r1
        L58c:
            return
    }

    public final void scrollMove(float r9, float r10) {
            r8 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r8.mMotionLayout
            float r0 = r0.getProgress()
            boolean r1 = r8.mDragStarted
            r7 = 1
            if (r1 != 0) goto L12
            r8.mDragStarted = r7
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r8.mMotionLayout
            r1.setProgress(r0)
        L12:
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r8.mMotionLayout
            int r2 = r8.mTouchAnchorId
            float r4 = r8.mTouchAnchorX
            float r5 = r8.mTouchAnchorY
            float[] r6 = r8.mAnchorDpDt
            r3 = r0
            r1.getAnchorDpDt(r2, r3, r4, r5, r6)
            float r1 = r8.mTouchDirectionX
            float[] r2 = r8.mAnchorDpDt
            r3 = 0
            r4 = r2[r3]
            float r1 = r1 * r4
            float r4 = r8.mTouchDirectionY
            r2 = r2[r7]
            float r4 = r4 * r2
            float r4 = r4 + r1
            float r1 = java.lang.Math.abs(r4)
            double r1 = (double) r1
            r4 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 >= 0) goto L47
            float[] r1 = r8.mAnchorDpDt
            r2 = 1008981770(0x3c23d70a, float:0.01)
            r1[r3] = r2
            r1[r7] = r2
        L47:
            float r1 = r8.mTouchDirectionX
            r2 = 0
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 == 0) goto L56
            float r9 = r9 * r1
            float[] r10 = r8.mAnchorDpDt
            r10 = r10[r3]
            float r9 = r9 / r10
            goto L60
        L56:
            float r9 = r8.mTouchDirectionY
            float r10 = r10 * r9
            float[] r9 = r8.mAnchorDpDt
            r9 = r9[r7]
            float r9 = r10 / r9
        L60:
            float r0 = r0 + r9
            r9 = 1065353216(0x3f800000, float:1.0)
            float r9 = java.lang.Math.min(r0, r9)
            float r9 = java.lang.Math.max(r9, r2)
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r8.mMotionLayout
            float r10 = r10.getProgress()
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r10 == 0) goto L7a
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r8.mMotionLayout
            r10.setProgress(r9)
        L7a:
            return
    }

    public final void scrollUp(float r9, float r10) {
            r8 = this;
            r0 = 0
            r8.mDragStarted = r0
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r8.mMotionLayout
            float r1 = r1.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r8.mMotionLayout
            int r3 = r8.mTouchAnchorId
            float r5 = r8.mTouchAnchorX
            float r6 = r8.mTouchAnchorY
            float[] r7 = r8.mAnchorDpDt
            r4 = r1
            r2.getAnchorDpDt(r3, r4, r5, r6, r7)
            float r2 = r8.mTouchDirectionX
            float[] r3 = r8.mAnchorDpDt
            r4 = r3[r0]
            float r4 = r8.mTouchDirectionY
            r5 = 1
            r6 = r3[r5]
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 == 0) goto L2d
            float r9 = r9 * r2
            r10 = r3[r0]
            float r9 = r9 / r10
            goto L33
        L2d:
            float r10 = r10 * r4
            r9 = r3[r5]
            float r9 = r10 / r9
        L33:
            boolean r10 = java.lang.Float.isNaN(r9)
            if (r10 != 0) goto L3e
            r10 = 1077936128(0x40400000, float:3.0)
            float r10 = r9 / r10
            float r1 = r1 + r10
        L3e:
            int r10 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r10 == 0) goto L63
            r10 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r2 == 0) goto L4a
            r2 = 1
            goto L4b
        L4a:
            r2 = 0
        L4b:
            int r3 = r8.mOnTouchUp
            r4 = 3
            if (r3 == r4) goto L51
            r0 = 1
        L51:
            r0 = r0 & r2
            if (r0 == 0) goto L63
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r8.mMotionLayout
            double r1 = (double) r1
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r7 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r7 >= 0) goto L5e
            goto L60
        L5e:
            r6 = 1065353216(0x3f800000, float:1.0)
        L60:
            r0.touchAnimateTo(r3, r6, r9)
        L63:
            return
    }

    public void setAnchorId(int r1) {
            r0 = this;
            r0.mTouchAnchorId = r1
            return
    }

    public final void setDown(float r1, float r2) {
            r0 = this;
            r0.mLastTouchX = r1
            r0.mLastTouchY = r2
            return
    }

    public void setMaxAcceleration(float r1) {
            r0 = this;
            r0.mMaxAcceleration = r1
            return
    }

    public void setMaxVelocity(float r1) {
            r0 = this;
            r0.mMaxVelocity = r1
            return
    }

    public void setRTL(boolean r8) {
            r7 = this;
            r0 = 6
            r1 = 3
            r2 = 4
            r3 = 1
            r4 = 5
            r5 = 2
            if (r8 == 0) goto L1d
            float[][] r8 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_DIRECTION
            r1 = r8[r1]
            r8[r2] = r1
            r1 = r8[r5]
            r8[r4] = r1
            float[][] r8 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_SIDES
            r1 = r8[r5]
            r8[r4] = r1
            r1 = r8[r3]
            r8[r0] = r1
            goto L31
        L1d:
            float[][] r8 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_DIRECTION
            r6 = r8[r5]
            r8[r2] = r6
            r1 = r8[r1]
            r8[r4] = r1
            float[][] r8 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_SIDES
            r1 = r8[r3]
            r8[r4] = r1
            r1 = r8[r5]
            r8[r0] = r1
        L31:
            float[][] r8 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_SIDES
            int r0 = r7.mTouchAnchorSide
            r1 = r8[r0]
            r2 = 0
            r1 = r1[r2]
            r7.mTouchAnchorX = r1
            r8 = r8[r0]
            r8 = r8[r3]
            r7.mTouchAnchorY = r8
            int r8 = r7.mTouchSide
            float[][] r0 = androidx.constraintlayout.motion.widget.TouchResponse.TOUCH_DIRECTION
            int r1 = r0.length
            if (r8 < r1) goto L4a
            return
        L4a:
            r1 = r0[r8]
            r1 = r1[r2]
            r7.mTouchDirectionX = r1
            r8 = r0[r8]
            r8 = r8[r3]
            r7.mTouchDirectionY = r8
            return
    }

    public void setTouchAnchorLocation(float r1, float r2) {
            r0 = this;
            r0.mTouchAnchorX = r1
            r0.mTouchAnchorY = r2
            return
    }

    public void setTouchUpMode(int r1) {
            r0 = this;
            r0.mOnTouchUp = r1
            return
    }

    public final void setUpTouchEvent(float r1, float r2) {
            r0 = this;
            r0.mLastTouchX = r1
            r0.mLastTouchY = r2
            r1 = 0
            r0.mDragStarted = r1
            return
    }

    public final void setupTouch() {
            r4 = this;
            int r0 = r4.mTouchAnchorId
            r1 = -1
            if (r0 == r1) goto L2c
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r4.mMotionLayout
            android.view.View r0 = r1.findViewById(r0)
            if (r0 != 0) goto L2d
            java.lang.String r1 = "cannot find TouchAnchorId @id/"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r4.mMotionLayout
            android.content.Context r2 = r2.getContext()
            int r3 = r4.mTouchAnchorId
            java.lang.String r2 = androidx.constraintlayout.motion.widget.Debug.getName(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TouchResponse"
            android.util.Log.e(r2, r1)
            goto L2d
        L2c:
            r0 = 0
        L2d:
            boolean r1 = r0 instanceof androidx.core.widget.NestedScrollView
            if (r1 == 0) goto L43
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            androidx.constraintlayout.motion.widget.TouchResponse$1 r1 = new androidx.constraintlayout.motion.widget.TouchResponse$1
            r1.<init>()
            r0.setOnTouchListener(r1)
            androidx.constraintlayout.motion.widget.TouchResponse$2 r1 = new androidx.constraintlayout.motion.widget.TouchResponse$2
            r1.<init>()
            r0.setOnScrollChangeListener(r1)
        L43:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            float r0 = r2.mTouchDirectionX
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto Lc
            java.lang.String r0 = "rotation"
            goto L24
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r1 = r2.mTouchDirectionX
            r0.append(r1)
            java.lang.String r1 = " , "
            r0.append(r1)
            float r1 = r2.mTouchDirectionY
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L24:
            return r0
    }
}
