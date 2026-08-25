package androidx.constraintlayout.motion.widget;

/* JADX INFO: loaded from: classes.dex */
public class KeyFrames {
    private static final java.lang.String CUSTOM_ATTRIBUTE = "CustomAttribute";
    private static final java.lang.String CUSTOM_METHOD = "CustomMethod";
    private static final java.lang.String TAG = "KeyFrames";
    public static final int UNSET = -1;
    public static java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> sKeyMakers;
    private java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> mFramesMap;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.constraintlayout.motion.widget.KeyFrames.sKeyMakers = r0
            java.lang.String r1 = "KeyAttribute"
            java.lang.Class<androidx.constraintlayout.motion.widget.KeyAttributes> r2 = androidx.constraintlayout.motion.widget.KeyAttributes.class
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.reflect.Constructor r2 = r2.getConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L52
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L52
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> r0 = androidx.constraintlayout.motion.widget.KeyFrames.sKeyMakers     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.String r1 = "KeyPosition"
            java.lang.Class<androidx.constraintlayout.motion.widget.KeyPosition> r2 = androidx.constraintlayout.motion.widget.KeyPosition.class
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.reflect.Constructor r2 = r2.getConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L52
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L52
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> r0 = androidx.constraintlayout.motion.widget.KeyFrames.sKeyMakers     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.String r1 = "KeyCycle"
            java.lang.Class<androidx.constraintlayout.motion.widget.KeyCycle> r2 = androidx.constraintlayout.motion.widget.KeyCycle.class
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.reflect.Constructor r2 = r2.getConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L52
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L52
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> r0 = androidx.constraintlayout.motion.widget.KeyFrames.sKeyMakers     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.String r1 = "KeyTimeCycle"
            java.lang.Class<androidx.constraintlayout.motion.widget.KeyTimeCycle> r2 = androidx.constraintlayout.motion.widget.KeyTimeCycle.class
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.reflect.Constructor r2 = r2.getConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L52
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L52
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> r0 = androidx.constraintlayout.motion.widget.KeyFrames.sKeyMakers     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.String r1 = "KeyTrigger"
            java.lang.Class<androidx.constraintlayout.motion.widget.KeyTrigger> r2 = androidx.constraintlayout.motion.widget.KeyTrigger.class
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L52
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L52
            goto L5b
        L52:
            r0 = move-exception
            java.lang.String r1 = "KeyFrames"
            java.lang.String r2 = "unable to load"
            android.util.Log.e(r1, r2, r0)
        L5b:
            return
    }

    public KeyFrames() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mFramesMap = r0
            return
    }

    public KeyFrames(android.content.Context r7, org.xmlpull.v1.XmlPullParser r8) {
            r6 = this;
            r6.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.mFramesMap = r0
            r0 = 0
            int r1 = r8.getEventType()     // Catch: java.io.IOException -> La6 org.xmlpull.v1.XmlPullParserException -> Lab
        Lf:
            r2 = 1
            if (r1 == r2) goto Laf
            r2 = 2
            if (r1 == r2) goto L27
            r2 = 3
            if (r1 == r2) goto L1a
            goto La0
        L1a:
            java.lang.String r1 = "KeyFrameSet"
            java.lang.String r2 = r8.getName()     // Catch: java.io.IOException -> La6 org.xmlpull.v1.XmlPullParserException -> Lab
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> La6 org.xmlpull.v1.XmlPullParserException -> Lab
            if (r1 == 0) goto La0
            return
        L27:
            java.lang.String r1 = r8.getName()     // Catch: java.io.IOException -> La6 org.xmlpull.v1.XmlPullParserException -> Lab
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> r2 = androidx.constraintlayout.motion.widget.KeyFrames.sKeyMakers     // Catch: java.io.IOException -> La6 org.xmlpull.v1.XmlPullParserException -> Lab
            boolean r2 = r2.containsKey(r1)     // Catch: java.io.IOException -> La6 org.xmlpull.v1.XmlPullParserException -> Lab
            if (r2 == 0) goto L7d
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends androidx.constraintlayout.motion.widget.Key>> r2 = androidx.constraintlayout.motion.widget.KeyFrames.sKeyMakers     // Catch: java.lang.Exception -> L6f
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Exception -> L6f
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2     // Catch: java.lang.Exception -> L6f
            if (r2 == 0) goto L53
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L6f
            java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.Exception -> L6f
            androidx.constraintlayout.motion.widget.Key r1 = (androidx.constraintlayout.motion.widget.Key) r1     // Catch: java.lang.Exception -> L6f
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r8)     // Catch: java.lang.Exception -> L51
            r1.load(r7, r0)     // Catch: java.lang.Exception -> L51
            r6.addKey(r1)     // Catch: java.lang.Exception -> L51
            goto L7b
        L51:
            r0 = move-exception
            goto L73
        L53:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch: java.lang.Exception -> L6f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6f
            r3.<init>()     // Catch: java.lang.Exception -> L6f
            java.lang.String r4 = "Keymaker for "
            r3.append(r4)     // Catch: java.lang.Exception -> L6f
            r3.append(r1)     // Catch: java.lang.Exception -> L6f
            java.lang.String r1 = " not found"
            r3.append(r1)     // Catch: java.lang.Exception -> L6f
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L6f
            r2.<init>(r1)     // Catch: java.lang.Exception -> L6f
            throw r2     // Catch: java.lang.Exception -> L6f
        L6f:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L73:
            java.lang.String r2 = "KeyFrames"
            java.lang.String r3 = "unable to create "
            android.util.Log.e(r2, r3, r0)     // Catch: java.io.IOException -> La6 org.xmlpull.v1.XmlPullParserException -> Lab
        L7b:
            r0 = r1
            goto La0
        L7d:
            java.lang.String r2 = "CustomAttribute"
            boolean r2 = r1.equalsIgnoreCase(r2)     // Catch: java.io.IOException -> La6 org.xmlpull.v1.XmlPullParserException -> Lab
            if (r2 == 0) goto L8f
            if (r0 == 0) goto La0
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r1 = r0.mCustomConstraints     // Catch: java.io.IOException -> La6 org.xmlpull.v1.XmlPullParserException -> Lab
            if (r1 == 0) goto La0
            androidx.constraintlayout.widget.ConstraintAttribute.parse(r7, r8, r1)     // Catch: java.io.IOException -> La6 org.xmlpull.v1.XmlPullParserException -> Lab
            goto La0
        L8f:
            java.lang.String r2 = "CustomMethod"
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch: java.io.IOException -> La6 org.xmlpull.v1.XmlPullParserException -> Lab
            if (r1 == 0) goto La0
            if (r0 == 0) goto La0
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r1 = r0.mCustomConstraints     // Catch: java.io.IOException -> La6 org.xmlpull.v1.XmlPullParserException -> Lab
            if (r1 == 0) goto La0
            androidx.constraintlayout.widget.ConstraintAttribute.parse(r7, r8, r1)     // Catch: java.io.IOException -> La6 org.xmlpull.v1.XmlPullParserException -> Lab
        La0:
            int r1 = r8.next()     // Catch: java.io.IOException -> La6 org.xmlpull.v1.XmlPullParserException -> Lab
            goto Lf
        La6:
            r7 = move-exception
            r7.printStackTrace()
            goto Laf
        Lab:
            r7 = move-exception
            r7.printStackTrace()
        Laf:
            return
    }

    public void addAllFrames(androidx.constraintlayout.motion.widget.MotionController r3) {
            r2 = this;
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r2.mFramesMap
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L12
            r3.addKeys(r0)
        L12:
            return
    }

    public void addFrames(androidx.constraintlayout.motion.widget.MotionController r5) {
            r4 = this;
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r4.mFramesMap
            int r1 = r5.mId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L13
            r5.addKeys(r0)
        L13:
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r4.mFramesMap
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L4f
            java.util.Iterator r0 = r0.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.motion.widget.Key r1 = (androidx.constraintlayout.motion.widget.Key) r1
            android.view.View r2 = r5.mView
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r2
            java.lang.String r2 = r2.constraintTag
            java.lang.String r3 = r1.mTargetString
            if (r3 == 0) goto L48
            if (r2 != 0) goto L43
            goto L48
        L43:
            boolean r2 = r2.matches(r3)
            goto L49
        L48:
            r2 = 0
        L49:
            if (r2 == 0) goto L26
            r5.addKey(r1)
            goto L26
        L4f:
            return
    }

    public void addKey(androidx.constraintlayout.motion.widget.Key r4) {
            r3 = this;
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r3.mFramesMap
            int r1 = r4.mTargetId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L1e
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r3.mFramesMap
            int r1 = r4.mTargetId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.put(r1, r2)
        L1e:
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r3.mFramesMap
            int r1 = r4.mTargetId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L31
            r0.add(r4)
        L31:
            return
    }

    public java.util.ArrayList<androidx.constraintlayout.motion.widget.Key> getKeyFramesForView(int r2) {
            r1 = this;
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r1.mFramesMap
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            return r2
    }

    public java.util.Set<java.lang.Integer> getKeys() {
            r1 = this;
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<androidx.constraintlayout.motion.widget.Key>> r0 = r1.mFramesMap
            java.util.Set r0 = r0.keySet()
            return r0
    }
}
