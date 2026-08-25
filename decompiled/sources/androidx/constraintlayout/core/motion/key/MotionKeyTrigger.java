package androidx.constraintlayout.core.motion.key;

/* JADX INFO: loaded from: classes.dex */
public class MotionKeyTrigger extends androidx.constraintlayout.core.motion.key.MotionKey {
    public static final java.lang.String CROSS = "CROSS";
    public static final int KEY_TYPE = 5;
    public static final java.lang.String NEGATIVE_CROSS = "negativeCross";
    public static final java.lang.String POSITIVE_CROSS = "positiveCross";
    public static final java.lang.String POST_LAYOUT = "postLayout";
    private static final java.lang.String TAG = "KeyTrigger";
    public static final java.lang.String TRIGGER_COLLISION_ID = "triggerCollisionId";
    public static final java.lang.String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
    public static final java.lang.String TRIGGER_ID = "triggerID";
    public static final java.lang.String TRIGGER_RECEIVER = "triggerReceiver";
    public static final java.lang.String TRIGGER_SLACK = "triggerSlack";
    public static final int TYPE_CROSS = 312;
    public static final int TYPE_NEGATIVE_CROSS = 310;
    public static final int TYPE_POSITIVE_CROSS = 309;
    public static final int TYPE_POST_LAYOUT = 304;
    public static final int TYPE_TRIGGER_COLLISION_ID = 307;
    public static final int TYPE_TRIGGER_COLLISION_VIEW = 306;
    public static final int TYPE_TRIGGER_ID = 308;
    public static final int TYPE_TRIGGER_RECEIVER = 311;
    public static final int TYPE_TRIGGER_SLACK = 305;
    public static final int TYPE_VIEW_TRANSITION_ON_CROSS = 301;
    public static final int TYPE_VIEW_TRANSITION_ON_NEGATIVE_CROSS = 303;
    public static final int TYPE_VIEW_TRANSITION_ON_POSITIVE_CROSS = 302;
    public static final java.lang.String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
    public static final java.lang.String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
    public static final java.lang.String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";
    private java.lang.String mCross;
    private int mCurveFit;
    private boolean mFireCrossReset;
    private float mFireLastPos;
    private boolean mFireNegativeReset;
    private boolean mFirePositiveReset;
    private float mFireThreshold;
    private java.lang.String mNegativeCross;
    private java.lang.String mPositiveCross;
    private boolean mPostLayout;
    private int mTriggerCollisionId;
    private int mTriggerID;
    private int mTriggerReceiver;

    public MotionKeyTrigger() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.mCurveFit = r0
            r0 = 0
            r2.mCross = r0
            int r1 = androidx.constraintlayout.core.motion.key.MotionKey.UNSET
            r2.mTriggerReceiver = r1
            r2.mNegativeCross = r0
            r2.mPositiveCross = r0
            r2.mTriggerID = r1
            r2.mTriggerCollisionId = r1
            r0 = 1
            r2.mFireCrossReset = r0
            r2.mFireNegativeReset = r0
            r2.mFirePositiveReset = r0
            r0 = 2143289344(0x7fc00000, float:NaN)
            r2.mFireThreshold = r0
            r0 = 0
            r2.mPostLayout = r0
            androidx.constraintlayout.core.motion.utils.FloatRect r0 = new androidx.constraintlayout.core.motion.utils.FloatRect
            r0.<init>()
            androidx.constraintlayout.core.motion.utils.FloatRect r0 = new androidx.constraintlayout.core.motion.utils.FloatRect
            r0.<init>()
            r0 = 5
            r2.mType = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mCustom = r0
            return
    }

    private void fireCustom(java.lang.String r5, androidx.constraintlayout.core.motion.MotionWidget r6) {
            r4 = this;
            int r0 = r5.length()
            r1 = 1
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto L16
            java.lang.String r5 = r5.substring(r1)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r1)
        L16:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r1 = r4.mCustom
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r3 = r2.toLowerCase(r3)
            if (r0 != 0) goto L3a
            boolean r3 = r3.matches(r5)
            if (r3 == 0) goto L20
        L3a:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.CustomVariable> r3 = r4.mCustom
            java.lang.Object r2 = r3.get(r2)
            androidx.constraintlayout.core.motion.CustomVariable r2 = (androidx.constraintlayout.core.motion.CustomVariable) r2
            if (r2 == 0) goto L20
            r2.applyToWidget(r6)
            goto L20
        L48:
            return
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(java.util.HashMap<java.lang.String, androidx.constraintlayout.core.motion.utils.SplineSet> r1) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public androidx.constraintlayout.core.motion.key.MotionKey clone() {
            r1 = this;
            androidx.constraintlayout.core.motion.key.MotionKeyTrigger r0 = new androidx.constraintlayout.core.motion.key.MotionKeyTrigger
            r0.<init>()
            androidx.constraintlayout.core.motion.key.MotionKeyTrigger r0 = r0.copy(r1)
            return r0
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* JADX INFO: renamed from: clone */
    public /* bridge */ /* synthetic */ java.lang.Object mo4clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            androidx.constraintlayout.core.motion.key.MotionKey r0 = r1.clone()
            return r0
    }

    public void conditionallyFire(float r1, androidx.constraintlayout.core.motion.MotionWidget r2) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public /* bridge */ /* synthetic */ androidx.constraintlayout.core.motion.key.MotionKey copy(androidx.constraintlayout.core.motion.key.MotionKey r1) {
            r0 = this;
            androidx.constraintlayout.core.motion.key.MotionKeyTrigger r1 = r0.copy(r1)
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public androidx.constraintlayout.core.motion.key.MotionKeyTrigger copy(androidx.constraintlayout.core.motion.key.MotionKey r2) {
            r1 = this;
            super.copy(r2)
            androidx.constraintlayout.core.motion.key.MotionKeyTrigger r2 = (androidx.constraintlayout.core.motion.key.MotionKeyTrigger) r2
            int r0 = r2.mCurveFit
            r1.mCurveFit = r0
            java.lang.String r0 = r2.mCross
            r1.mCross = r0
            int r0 = r2.mTriggerReceiver
            r1.mTriggerReceiver = r0
            java.lang.String r0 = r2.mNegativeCross
            r1.mNegativeCross = r0
            java.lang.String r0 = r2.mPositiveCross
            r1.mPositiveCross = r0
            int r0 = r2.mTriggerID
            r1.mTriggerID = r0
            int r0 = r2.mTriggerCollisionId
            r1.mTriggerCollisionId = r0
            boolean r0 = r2.mFireCrossReset
            r1.mFireCrossReset = r0
            boolean r0 = r2.mFireNegativeReset
            r1.mFireNegativeReset = r0
            boolean r0 = r2.mFirePositiveReset
            r1.mFirePositiveReset = r0
            float r0 = r2.mFireThreshold
            r1.mFireThreshold = r0
            float r0 = r2.mFireLastPos
            r1.mFireLastPos = r0
            boolean r2 = r2.mPostLayout
            r1.mPostLayout = r2
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(java.util.HashSet<java.lang.String> r1) {
            r0 = this;
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(java.lang.String r3) {
            r2 = this;
            java.util.Objects.requireNonNull(r3)
            int r0 = r3.hashCode()
            r1 = -1
            switch(r0) {
                case -1594793529: goto L8a;
                case -966421266: goto L7e;
                case -786670827: goto L72;
                case -648752941: goto L66;
                case -638126837: goto L5b;
                case -76025313: goto L4f;
                case -9754574: goto L43;
                case 364489912: goto L37;
                case 1301930599: goto L29;
                case 1401391082: goto L1c;
                case 1535404999: goto Le;
                default: goto Lb;
            }
        Lb:
            r3 = -1
            goto L95
        Le:
            java.lang.String r0 = "triggerReceiver"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L18
            goto Lb
        L18:
            r3 = 10
            goto L95
        L1c:
            java.lang.String r0 = "postLayout"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L25
            goto Lb
        L25:
            r3 = 9
            goto L95
        L29:
            java.lang.String r0 = "viewTransitionOnCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L33
            goto Lb
        L33:
            r3 = 8
            goto L95
        L37:
            java.lang.String r0 = "triggerSlack"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L41
            goto Lb
        L41:
            r3 = 7
            goto L95
        L43:
            java.lang.String r0 = "viewTransitionOnNegativeCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L4d
            goto Lb
        L4d:
            r3 = 6
            goto L95
        L4f:
            java.lang.String r0 = "triggerCollisionView"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L59
            goto Lb
        L59:
            r3 = 5
            goto L95
        L5b:
            java.lang.String r0 = "negativeCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L64
            goto Lb
        L64:
            r3 = 4
            goto L95
        L66:
            java.lang.String r0 = "triggerID"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L70
            goto Lb
        L70:
            r3 = 3
            goto L95
        L72:
            java.lang.String r0 = "triggerCollisionId"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L7c
            goto Lb
        L7c:
            r3 = 2
            goto L95
        L7e:
            java.lang.String r0 = "viewTransitionOnPositiveCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L88
            goto Lb
        L88:
            r3 = 1
            goto L95
        L8a:
            java.lang.String r0 = "positiveCross"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L94
            goto Lb
        L94:
            r3 = 0
        L95:
            switch(r3) {
                case 0: goto Lb7;
                case 1: goto Lb4;
                case 2: goto Lb1;
                case 3: goto Lae;
                case 4: goto Lab;
                case 5: goto La8;
                case 6: goto La5;
                case 7: goto La2;
                case 8: goto L9f;
                case 9: goto L9c;
                case 10: goto L99;
                default: goto L98;
            }
        L98:
            return r1
        L99:
            r3 = 311(0x137, float:4.36E-43)
            return r3
        L9c:
            r3 = 304(0x130, float:4.26E-43)
            return r3
        L9f:
            r3 = 301(0x12d, float:4.22E-43)
            return r3
        La2:
            r3 = 305(0x131, float:4.27E-43)
            return r3
        La5:
            r3 = 303(0x12f, float:4.25E-43)
            return r3
        La8:
            r3 = 306(0x132, float:4.29E-43)
            return r3
        Lab:
            r3 = 310(0x136, float:4.34E-43)
            return r3
        Lae:
            r3 = 308(0x134, float:4.32E-43)
            return r3
        Lb1:
            r3 = 307(0x133, float:4.3E-43)
            return r3
        Lb4:
            r3 = 302(0x12e, float:4.23E-43)
            return r3
        Lb7:
            r3 = 309(0x135, float:4.33E-43)
            return r3
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, float r3) {
            r1 = this;
            r0 = 305(0x131, float:4.27E-43)
            if (r2 == r0) goto L9
            boolean r2 = super.setValue(r2, r3)
            return r2
        L9:
            r2 = 1
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, int r3) {
            r1 = this;
            r0 = 307(0x133, float:4.3E-43)
            if (r2 == r0) goto L2f
            r0 = 308(0x134, float:4.32E-43)
            if (r2 == r0) goto L17
            r0 = 311(0x137, float:4.36E-43)
            if (r2 == r0) goto L14
            switch(r2) {
                case 301: goto L31;
                case 302: goto L31;
                case 303: goto L31;
                default: goto Lf;
            }
        Lf:
            boolean r2 = super.setValue(r2, r3)
            return r2
        L14:
            r1.mTriggerReceiver = r3
            goto L31
        L17:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L24
            int r2 = r2.intValue()
            goto L2c
        L24:
            java.lang.String r2 = r2.toString()
            int r2 = java.lang.Integer.parseInt(r2)
        L2c:
            r1.mTriggerID = r2
            goto L31
        L2f:
            r1.mTriggerCollisionId = r3
        L31:
            r2 = 1
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, java.lang.String r3) {
            r1 = this;
            r0 = 309(0x135, float:4.33E-43)
            if (r2 == r0) goto L17
            r0 = 310(0x136, float:4.34E-43)
            if (r2 == r0) goto L14
            r0 = 312(0x138, float:4.37E-43)
            if (r2 == r0) goto L11
            boolean r2 = super.setValue(r2, r3)
            return r2
        L11:
            r1.mCross = r3
            goto L19
        L14:
            r1.mNegativeCross = r3
            goto L19
        L17:
            r1.mPositiveCross = r3
        L19:
            r2 = 1
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int r2, boolean r3) {
            r1 = this;
            r0 = 304(0x130, float:4.26E-43)
            if (r2 == r0) goto L9
            boolean r2 = super.setValue(r2, r3)
            return r2
        L9:
            r1.mPostLayout = r3
            r2 = 1
            return r2
    }
}
