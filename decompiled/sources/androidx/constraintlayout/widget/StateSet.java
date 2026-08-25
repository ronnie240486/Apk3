package androidx.constraintlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class StateSet {
    private static final boolean DEBUG = false;
    public static final java.lang.String TAG = "ConstraintLayoutStates";
    private android.util.SparseArray<androidx.constraintlayout.widget.ConstraintSet> mConstraintSetMap;
    private androidx.constraintlayout.widget.ConstraintsChangedListener mConstraintsChangedListener;
    public int mCurrentConstraintNumber;
    public int mCurrentStateId;
    public int mDefaultState;
    private android.util.SparseArray<androidx.constraintlayout.widget.StateSet.State> mStateList;

    /* JADX INFO: loaded from: classes3.dex */
    public static class State {
        public int mConstraintID;
        public int mId;
        public java.util.ArrayList<androidx.constraintlayout.widget.StateSet.Variant> mVariants;

        public State(android.content.Context r6, org.xmlpull.v1.XmlPullParser r7) {
                r5 = this;
                r5.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r5.mVariants = r0
                r0 = -1
                r5.mConstraintID = r0
                android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)
                int[] r0 = androidx.constraintlayout.widget.R.styleable.State
                android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r0)
                int r0 = r7.getIndexCount()
                r1 = 0
            L1c:
                if (r1 >= r0) goto L56
                int r2 = r7.getIndex(r1)
                int r3 = androidx.constraintlayout.widget.R.styleable.State_android_id
                if (r2 != r3) goto L2f
                int r3 = r5.mId
                int r2 = r7.getResourceId(r2, r3)
                r5.mId = r2
                goto L53
            L2f:
                int r3 = androidx.constraintlayout.widget.R.styleable.State_constraints
                if (r2 != r3) goto L53
                int r3 = r5.mConstraintID
                int r2 = r7.getResourceId(r2, r3)
                r5.mConstraintID = r2
                android.content.res.Resources r2 = r6.getResources()
                int r3 = r5.mConstraintID
                java.lang.String r2 = r2.getResourceTypeName(r3)
                android.content.res.Resources r3 = r6.getResources()
                int r4 = r5.mConstraintID
                r3.getResourceName(r4)
                java.lang.String r3 = "layout"
                r3.equals(r2)
            L53:
                int r1 = r1 + 1
                goto L1c
            L56:
                r7.recycle()
                return
        }

        public int findMatch(float r3, float r4) {
                r2 = this;
                r0 = 0
            L1:
                java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r1 = r2.mVariants
                int r1 = r1.size()
                if (r0 >= r1) goto L1b
                java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r1 = r2.mVariants
                java.lang.Object r1 = r1.get(r0)
                androidx.constraintlayout.widget.StateSet$Variant r1 = (androidx.constraintlayout.widget.StateSet.Variant) r1
                boolean r1 = r1.match(r3, r4)
                if (r1 == 0) goto L18
                return r0
            L18:
                int r0 = r0 + 1
                goto L1
            L1b:
                r3 = -1
                return r3
        }
    }

    public static class Variant {
        public int mConstraintID;
        public float mMaxHeight;
        public float mMaxWidth;
        public float mMinHeight;
        public float mMinWidth;

        public Variant(android.content.Context r6, org.xmlpull.v1.XmlPullParser r7) {
                r5 = this;
                r5.<init>()
                r0 = 2143289344(0x7fc00000, float:NaN)
                r5.mMinWidth = r0
                r5.mMinHeight = r0
                r5.mMaxWidth = r0
                r5.mMaxHeight = r0
                r0 = -1
                r5.mConstraintID = r0
                android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r7)
                int[] r0 = androidx.constraintlayout.widget.R.styleable.Variant
                android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r0)
                int r0 = r7.getIndexCount()
                r1 = 0
            L1f:
                if (r1 >= r0) goto L88
                int r2 = r7.getIndex(r1)
                int r3 = androidx.constraintlayout.widget.R.styleable.Variant_constraints
                if (r2 != r3) goto L4a
                int r3 = r5.mConstraintID
                int r2 = r7.getResourceId(r2, r3)
                r5.mConstraintID = r2
                android.content.res.Resources r2 = r6.getResources()
                int r3 = r5.mConstraintID
                java.lang.String r2 = r2.getResourceTypeName(r3)
                android.content.res.Resources r3 = r6.getResources()
                int r4 = r5.mConstraintID
                r3.getResourceName(r4)
                java.lang.String r3 = "layout"
                r3.equals(r2)
                goto L85
            L4a:
                int r3 = androidx.constraintlayout.widget.R.styleable.Variant_region_heightLessThan
                if (r2 != r3) goto L57
                float r3 = r5.mMaxHeight
                float r2 = r7.getDimension(r2, r3)
                r5.mMaxHeight = r2
                goto L85
            L57:
                int r3 = androidx.constraintlayout.widget.R.styleable.Variant_region_heightMoreThan
                if (r2 != r3) goto L64
                float r3 = r5.mMinHeight
                float r2 = r7.getDimension(r2, r3)
                r5.mMinHeight = r2
                goto L85
            L64:
                int r3 = androidx.constraintlayout.widget.R.styleable.Variant_region_widthLessThan
                if (r2 != r3) goto L71
                float r3 = r5.mMaxWidth
                float r2 = r7.getDimension(r2, r3)
                r5.mMaxWidth = r2
                goto L85
            L71:
                int r3 = androidx.constraintlayout.widget.R.styleable.Variant_region_widthMoreThan
                if (r2 != r3) goto L7e
                float r3 = r5.mMinWidth
                float r2 = r7.getDimension(r2, r3)
                r5.mMinWidth = r2
                goto L85
            L7e:
                java.lang.String r2 = "ConstraintLayoutStates"
                java.lang.String r3 = "Unknown tag"
                android.util.Log.v(r2, r3)
            L85:
                int r1 = r1 + 1
                goto L1f
            L88:
                r7.recycle()
                return
        }

        public final boolean match(float r3, float r4) {
                r2 = this;
                float r0 = r2.mMinWidth
                boolean r0 = java.lang.Float.isNaN(r0)
                r1 = 0
                if (r0 != 0) goto L10
                float r0 = r2.mMinWidth
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 >= 0) goto L10
                return r1
            L10:
                float r0 = r2.mMinHeight
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 != 0) goto L1f
                float r0 = r2.mMinHeight
                int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r0 >= 0) goto L1f
                return r1
            L1f:
                float r0 = r2.mMaxWidth
                boolean r0 = java.lang.Float.isNaN(r0)
                if (r0 != 0) goto L2e
                float r0 = r2.mMaxWidth
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 <= 0) goto L2e
                return r1
            L2e:
                float r3 = r2.mMaxHeight
                boolean r3 = java.lang.Float.isNaN(r3)
                if (r3 != 0) goto L3d
                float r3 = r2.mMaxHeight
                int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
                if (r3 <= 0) goto L3d
                return r1
            L3d:
                r3 = 1
                return r3
        }
    }

    public StateSet(android.content.Context r2, org.xmlpull.v1.XmlPullParser r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mDefaultState = r0
            r1.mCurrentStateId = r0
            r1.mCurrentConstraintNumber = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.mStateList = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r1.mConstraintSetMap = r0
            r0 = 0
            r1.mConstraintsChangedListener = r0
            r1.load(r2, r3)
            return
    }

    private void load(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
            r9 = this;
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)
            int[] r1 = androidx.constraintlayout.widget.R.styleable.StateSet
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r0, r1)
            int r1 = r0.getIndexCount()
            r2 = 0
            r3 = 0
        L10:
            if (r3 >= r1) goto L25
            int r4 = r0.getIndex(r3)
            int r5 = androidx.constraintlayout.widget.R.styleable.StateSet_defaultState
            if (r4 != r5) goto L22
            int r5 = r9.mDefaultState
            int r4 = r0.getResourceId(r4, r5)
            r9.mDefaultState = r4
        L22:
            int r3 = r3 + 1
            goto L10
        L25:
            r0.recycle()
            r0 = 0
            int r1 = r11.getEventType()     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La5
        L2d:
            r3 = 1
            if (r1 == r3) goto La9
            if (r1 == 0) goto L98
            java.lang.String r4 = "StateSet"
            r5 = 3
            r6 = 2
            if (r1 == r6) goto L46
            if (r1 == r5) goto L3b
            goto L9b
        L3b:
            java.lang.String r1 = r11.getName()     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La5
            boolean r1 = r4.equals(r1)     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La5
            if (r1 == 0) goto L9b
            return
        L46:
            java.lang.String r1 = r11.getName()     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La5
            r7 = -1
            int r8 = r1.hashCode()     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La5
            switch(r8) {
                case 80204913: goto L6e;
                case 1301459538: goto L64;
                case 1382829617: goto L5d;
                case 1901439077: goto L53;
                default: goto L52;
            }     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La5
        L52:
            goto L78
        L53:
            java.lang.String r3 = "Variant"
            boolean r1 = r1.equals(r3)     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La5
            if (r1 == 0) goto L78
            r3 = 3
            goto L79
        L5d:
            boolean r1 = r1.equals(r4)     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La5
            if (r1 == 0) goto L78
            goto L79
        L64:
            java.lang.String r3 = "LayoutDescription"
            boolean r1 = r1.equals(r3)     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La5
            if (r1 == 0) goto L78
            r3 = 0
            goto L79
        L6e:
            java.lang.String r3 = "State"
            boolean r1 = r1.equals(r3)     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La5
            if (r1 == 0) goto L78
            r3 = 2
            goto L79
        L78:
            r3 = -1
        L79:
            if (r3 == r6) goto L8b
            if (r3 == r5) goto L7e
            goto L9b
        L7e:
            androidx.constraintlayout.widget.StateSet$Variant r1 = new androidx.constraintlayout.widget.StateSet$Variant     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La5
            r1.<init>(r10, r11)     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La5
            if (r0 == 0) goto L9b
            java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r3 = r0.mVariants     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La5
            r3.add(r1)     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La5
            goto L9b
        L8b:
            androidx.constraintlayout.widget.StateSet$State r0 = new androidx.constraintlayout.widget.StateSet$State     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La5
            r0.<init>(r10, r11)     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La5
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r1 = r9.mStateList     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La5
            int r3 = r0.mId     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La5
            r1.put(r3, r0)     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La5
            goto L9b
        L98:
            r11.getName()     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La5
        L9b:
            int r1 = r11.next()     // Catch: java.io.IOException -> La0 org.xmlpull.v1.XmlPullParserException -> La5
            goto L2d
        La0:
            r10 = move-exception
            r10.printStackTrace()
            goto La9
        La5:
            r10 = move-exception
            r10.printStackTrace()
        La9:
            return
    }

    public int convertToConstraintSet(int r5, int r6, float r7, float r8) {
            r4 = this;
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r0 = r4.mStateList
            java.lang.Object r0 = r0.get(r6)
            androidx.constraintlayout.widget.StateSet$State r0 = (androidx.constraintlayout.widget.StateSet.State) r0
            if (r0 != 0) goto Lb
            return r6
        Lb:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r1 == 0) goto L3e
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 != 0) goto L16
            goto L3e
        L16:
            r6 = 0
            java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r1 = r0.mVariants
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.widget.StateSet$Variant r2 = (androidx.constraintlayout.widget.StateSet.Variant) r2
            boolean r3 = r2.match(r7, r8)
            if (r3 == 0) goto L1d
            int r6 = r2.mConstraintID
            if (r5 != r6) goto L34
            return r5
        L34:
            r6 = r2
            goto L1d
        L36:
            if (r6 == 0) goto L3b
            int r5 = r6.mConstraintID
            return r5
        L3b:
            int r5 = r0.mConstraintID
            return r5
        L3e:
            int r6 = r0.mConstraintID
            if (r6 != r5) goto L43
            return r5
        L43:
            java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r6 = r0.mVariants
            java.util.Iterator r6 = r6.iterator()
        L49:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L5a
            java.lang.Object r7 = r6.next()
            androidx.constraintlayout.widget.StateSet$Variant r7 = (androidx.constraintlayout.widget.StateSet.Variant) r7
            int r7 = r7.mConstraintID
            if (r5 != r7) goto L49
            return r5
        L5a:
            int r5 = r0.mConstraintID
            return r5
    }

    public boolean needsToChange(int r5, float r6, float r7) {
            r4 = this;
            int r0 = r4.mCurrentStateId
            r1 = 1
            if (r0 == r5) goto L6
            return r1
        L6:
            r2 = -1
            r3 = 0
            if (r5 != r2) goto L11
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r5 = r4.mStateList
            java.lang.Object r5 = r5.valueAt(r3)
            goto L17
        L11:
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r5 = r4.mStateList
            java.lang.Object r5 = r5.get(r0)
        L17:
            androidx.constraintlayout.widget.StateSet$State r5 = (androidx.constraintlayout.widget.StateSet.State) r5
            int r0 = r4.mCurrentConstraintNumber
            if (r0 == r2) goto L2c
            java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r2 = r5.mVariants
            java.lang.Object r0 = r2.get(r0)
            androidx.constraintlayout.widget.StateSet$Variant r0 = (androidx.constraintlayout.widget.StateSet.Variant) r0
            boolean r0 = r0.match(r6, r7)
            if (r0 == 0) goto L2c
            return r3
        L2c:
            int r0 = r4.mCurrentConstraintNumber
            int r5 = r5.findMatch(r6, r7)
            if (r0 != r5) goto L35
            return r3
        L35:
            return r1
    }

    public void setOnConstraintsChanged(androidx.constraintlayout.widget.ConstraintsChangedListener r1) {
            r0 = this;
            r0.mConstraintsChangedListener = r1
            return
    }

    public int stateGetConstraintID(int r2, int r3, int r4) {
            r1 = this;
            float r3 = (float) r3
            float r4 = (float) r4
            r0 = -1
            int r2 = r1.updateConstraints(r0, r2, r3, r4)
            return r2
    }

    public int updateConstraints(int r3, int r4, float r5, float r6) {
            r2 = this;
            r0 = -1
            if (r3 != r4) goto L46
            if (r4 != r0) goto Lf
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r4 = r2.mStateList
            r1 = 0
            java.lang.Object r4 = r4.valueAt(r1)
            androidx.constraintlayout.widget.StateSet$State r4 = (androidx.constraintlayout.widget.StateSet.State) r4
            goto L19
        Lf:
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r4 = r2.mStateList
            int r1 = r2.mCurrentStateId
            java.lang.Object r4 = r4.get(r1)
            androidx.constraintlayout.widget.StateSet$State r4 = (androidx.constraintlayout.widget.StateSet.State) r4
        L19:
            if (r4 != 0) goto L1c
            return r0
        L1c:
            int r1 = r2.mCurrentConstraintNumber
            if (r1 == r0) goto L2f
            java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r1 = r4.mVariants
            java.lang.Object r1 = r1.get(r3)
            androidx.constraintlayout.widget.StateSet$Variant r1 = (androidx.constraintlayout.widget.StateSet.Variant) r1
            boolean r1 = r1.match(r5, r6)
            if (r1 == 0) goto L2f
            return r3
        L2f:
            int r5 = r4.findMatch(r5, r6)
            if (r3 != r5) goto L36
            return r3
        L36:
            if (r5 != r0) goto L3b
            int r3 = r4.mConstraintID
            goto L45
        L3b:
            java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r3 = r4.mVariants
            java.lang.Object r3 = r3.get(r5)
            androidx.constraintlayout.widget.StateSet$Variant r3 = (androidx.constraintlayout.widget.StateSet.Variant) r3
            int r3 = r3.mConstraintID
        L45:
            return r3
        L46:
            android.util.SparseArray<androidx.constraintlayout.widget.StateSet$State> r3 = r2.mStateList
            java.lang.Object r3 = r3.get(r4)
            androidx.constraintlayout.widget.StateSet$State r3 = (androidx.constraintlayout.widget.StateSet.State) r3
            if (r3 != 0) goto L51
            return r0
        L51:
            int r4 = r3.findMatch(r5, r6)
            if (r4 != r0) goto L5a
            int r3 = r3.mConstraintID
            goto L64
        L5a:
            java.util.ArrayList<androidx.constraintlayout.widget.StateSet$Variant> r3 = r3.mVariants
            java.lang.Object r3 = r3.get(r4)
            androidx.constraintlayout.widget.StateSet$Variant r3 = (androidx.constraintlayout.widget.StateSet.Variant) r3
            int r3 = r3.mConstraintID
        L64:
            return r3
    }
}
