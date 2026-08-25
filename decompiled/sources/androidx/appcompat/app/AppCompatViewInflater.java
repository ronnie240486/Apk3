package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatViewInflater {
    private static final java.lang.String LOG_TAG = "AppCompatViewInflater";
    private static final int[] sAccessibilityHeading = null;
    private static final int[] sAccessibilityPaneTitle = null;
    private static final java.lang.String[] sClassPrefixList = null;
    private static final androidx.collection.SimpleArrayMap<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> sConstructorMap = null;
    private static final java.lang.Class<?>[] sConstructorSignature = null;
    private static final int[] sOnClickAttrs = null;
    private static final int[] sScreenReaderFocusable = null;
    private final java.lang.Object[] mConstructorArgs;

    /* JADX INFO: loaded from: classes2.dex */
    public static class DeclaredOnClickListener implements android.view.View.OnClickListener {
        private final android.view.View mHostView;
        private final java.lang.String mMethodName;
        private android.content.Context mResolvedContext;
        private java.lang.reflect.Method mResolvedMethod;

        public DeclaredOnClickListener(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.mHostView = r1
                r0.mMethodName = r2
                return
        }

        private void resolveMethod(@androidx.annotation.Nullable android.content.Context r6) {
                r5 = this;
            L0:
                if (r6 == 0) goto L2f
                boolean r0 = r6.isRestricted()     // Catch: java.lang.NoSuchMethodException -> L21
                if (r0 != 0) goto L22
                java.lang.Class r0 = r6.getClass()     // Catch: java.lang.NoSuchMethodException -> L21
                java.lang.String r1 = r5.mMethodName     // Catch: java.lang.NoSuchMethodException -> L21
                r2 = 1
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L21
                r3 = 0
                java.lang.Class<android.view.View> r4 = android.view.View.class
                r2[r3] = r4     // Catch: java.lang.NoSuchMethodException -> L21
                java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L21
                if (r0 == 0) goto L22
                r5.mResolvedMethod = r0     // Catch: java.lang.NoSuchMethodException -> L21
                r5.mResolvedContext = r6     // Catch: java.lang.NoSuchMethodException -> L21
                return
            L21:
            L22:
                boolean r0 = r6 instanceof android.content.ContextWrapper
                if (r0 == 0) goto L2d
                android.content.ContextWrapper r6 = (android.content.ContextWrapper) r6
                android.content.Context r6 = r6.getBaseContext()
                goto L0
            L2d:
                r6 = 0
                goto L0
            L2f:
                android.view.View r6 = r5.mHostView
                int r6 = r6.getId()
                r0 = -1
                if (r6 != r0) goto L3b
                java.lang.String r6 = ""
                goto L5b
            L3b:
                java.lang.String r0 = " with id '"
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                android.view.View r1 = r5.mHostView
                android.content.Context r1 = r1.getContext()
                android.content.res.Resources r1 = r1.getResources()
                java.lang.String r6 = r1.getResourceEntryName(r6)
                r0.append(r6)
                java.lang.String r6 = "'"
                r0.append(r6)
                java.lang.String r6 = r0.toString()
            L5b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Could not find method "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                java.lang.String r2 = r5.mMethodName
                r1.append(r2)
                java.lang.String r2 = "(View) in a parent or ancestor Context for android:onClick attribute defined on view "
                r1.append(r2)
                android.view.View r2 = r5.mHostView
                java.lang.Class r2 = r2.getClass()
                r1.append(r2)
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r0.<init>(r6)
                throw r0
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@androidx.annotation.NonNull android.view.View r5) {
                r4 = this;
                java.lang.reflect.Method r0 = r4.mResolvedMethod
                if (r0 != 0) goto Ld
                android.view.View r0 = r4.mHostView
                android.content.Context r0 = r0.getContext()
                r4.resolveMethod(r0)
            Ld:
                java.lang.reflect.Method r0 = r4.mResolvedMethod     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L24
                android.content.Context r1 = r4.mResolvedContext     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L24
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L24
                r3 = 0
                r2[r3] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L24
                r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.IllegalAccessException -> L24
                return
            L1b:
                r5 = move-exception
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Could not execute method for android:onClick"
                r0.<init>(r1, r5)
                throw r0
            L24:
                r5 = move-exception
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Could not execute non-public method for android:onClick"
                r0.<init>(r1, r5)
                throw r0
        }
    }

    static {
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r2 = 0
            r0[r2] = r1
            java.lang.Class<android.util.AttributeSet> r1 = android.util.AttributeSet.class
            r3 = 1
            r0[r3] = r1
            androidx.appcompat.app.AppCompatViewInflater.sConstructorSignature = r0
            int[] r0 = new int[r3]
            r1 = 16843375(0x101026f, float:2.3695304E-38)
            r0[r2] = r1
            androidx.appcompat.app.AppCompatViewInflater.sOnClickAttrs = r0
            int[] r0 = new int[r3]
            r1 = 16844160(0x1010580, float:2.3697504E-38)
            r0[r2] = r1
            androidx.appcompat.app.AppCompatViewInflater.sAccessibilityHeading = r0
            int[] r0 = new int[r3]
            r1 = 16844156(0x101057c, float:2.3697493E-38)
            r0[r2] = r1
            androidx.appcompat.app.AppCompatViewInflater.sAccessibilityPaneTitle = r0
            int[] r0 = new int[r3]
            r1 = 16844148(0x1010574, float:2.369747E-38)
            r0[r2] = r1
            androidx.appcompat.app.AppCompatViewInflater.sScreenReaderFocusable = r0
            java.lang.String r0 = "android.widget."
            java.lang.String r1 = "android.view."
            java.lang.String r2 = "android.webkit."
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            androidx.appcompat.app.AppCompatViewInflater.sClassPrefixList = r0
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            androidx.appcompat.app.AppCompatViewInflater.sConstructorMap = r0
            return
    }

    public AppCompatViewInflater() {
            r1 = this;
            r1.<init>()
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.mConstructorArgs = r0
            return
    }

    private void backportAccessibilityAttributes(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull android.view.View r5, @androidx.annotation.NonNull android.util.AttributeSet r6) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 <= r1) goto L7
            return
        L7:
            int[] r0 = androidx.appcompat.app.AppCompatViewInflater.sAccessibilityHeading
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r6, r0)
            r1 = 0
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L1b
            boolean r2 = r0.getBoolean(r1, r1)
            androidx.core.view.ViewCompat.setAccessibilityHeading(r5, r2)
        L1b:
            r0.recycle()
            int[] r0 = androidx.appcompat.app.AppCompatViewInflater.sAccessibilityPaneTitle
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r6, r0)
            boolean r2 = r0.hasValue(r1)
            if (r2 == 0) goto L31
            java.lang.String r2 = r0.getString(r1)
            androidx.core.view.ViewCompat.setAccessibilityPaneTitle(r5, r2)
        L31:
            r0.recycle()
            int[] r0 = androidx.appcompat.app.AppCompatViewInflater.sScreenReaderFocusable
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r6, r0)
            boolean r6 = r4.hasValue(r1)
            if (r6 == 0) goto L47
            boolean r6 = r4.getBoolean(r1, r1)
            androidx.core.view.ViewCompat.setScreenReaderFocusable(r5, r6)
        L47:
            r4.recycle()
            return
    }

    private void checkOnClickListener(android.view.View r3, android.util.AttributeSet r4) {
            r2 = this;
            android.content.Context r0 = r3.getContext()
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L27
            boolean r1 = androidx.core.view.ViewCompat.hasOnClickListeners(r3)
            if (r1 != 0) goto Lf
            goto L27
        Lf:
            int[] r1 = androidx.appcompat.app.AppCompatViewInflater.sOnClickAttrs
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1)
            r0 = 0
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L24
            androidx.appcompat.app.AppCompatViewInflater$DeclaredOnClickListener r1 = new androidx.appcompat.app.AppCompatViewInflater$DeclaredOnClickListener
            r1.<init>(r3, r0)
            r3.setOnClickListener(r1)
        L24:
            r4.recycle()
        L27:
            return
    }

    private android.view.View createViewByPrefix(android.content.Context r3, java.lang.String r4, java.lang.String r5) throws java.lang.ClassNotFoundException, android.view.InflateException {
            r2 = this;
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> r0 = androidx.appcompat.app.AppCompatViewInflater.sConstructorMap
            java.lang.Object r1 = r0.get(r4)
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            if (r1 != 0) goto L35
            if (r5 == 0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L42
            r1.<init>()     // Catch: java.lang.Exception -> L42
            r1.append(r5)     // Catch: java.lang.Exception -> L42
            r1.append(r4)     // Catch: java.lang.Exception -> L42
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Exception -> L42
            goto L1d
        L1c:
            r5 = r4
        L1d:
            r1 = 0
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Exception -> L42
            java.lang.Class r3 = java.lang.Class.forName(r5, r1, r3)     // Catch: java.lang.Exception -> L42
            java.lang.Class<android.view.View> r5 = android.view.View.class
            java.lang.Class r3 = r3.asSubclass(r5)     // Catch: java.lang.Exception -> L42
            java.lang.Class<?>[] r5 = androidx.appcompat.app.AppCompatViewInflater.sConstructorSignature     // Catch: java.lang.Exception -> L42
            java.lang.reflect.Constructor r1 = r3.getConstructor(r5)     // Catch: java.lang.Exception -> L42
            r0.put(r4, r1)     // Catch: java.lang.Exception -> L42
        L35:
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.Exception -> L42
            java.lang.Object[] r3 = r2.mConstructorArgs     // Catch: java.lang.Exception -> L42
            java.lang.Object r3 = r1.newInstance(r3)     // Catch: java.lang.Exception -> L42
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Exception -> L42
            return r3
        L42:
            r3 = 0
            return r3
    }

    private android.view.View createViewFromTag(android.content.Context r6, java.lang.String r7, android.util.AttributeSet r8) {
            r5 = this;
            java.lang.String r0 = "view"
            boolean r0 = r7.equals(r0)
            r1 = 0
            if (r0 == 0) goto L10
            java.lang.String r7 = "class"
            java.lang.String r7 = r8.getAttributeValue(r1, r7)
        L10:
            r0 = 1
            r2 = 0
            java.lang.Object[] r3 = r5.mConstructorArgs     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L53
            r3[r2] = r6     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L53
            r3[r0] = r8     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L53
            r8 = -1
            r3 = 46
            int r3 = r7.indexOf(r3)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L53
            if (r8 != r3) goto L40
            r8 = 0
        L22:
            java.lang.String[] r3 = androidx.appcompat.app.AppCompatViewInflater.sClassPrefixList     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L53
            int r4 = r3.length     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L53
            if (r8 >= r4) goto L39
            r3 = r3[r8]     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L53
            android.view.View r3 = r5.createViewByPrefix(r6, r7, r3)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L53
            if (r3 == 0) goto L36
            java.lang.Object[] r6 = r5.mConstructorArgs
            r6[r2] = r1
            r6[r0] = r1
            return r3
        L36:
            int r8 = r8 + 1
            goto L22
        L39:
            java.lang.Object[] r6 = r5.mConstructorArgs
            r6[r2] = r1
            r6[r0] = r1
            return r1
        L40:
            android.view.View r6 = r5.createViewByPrefix(r6, r7, r1)     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L53
            java.lang.Object[] r7 = r5.mConstructorArgs
            r7[r2] = r1
            r7[r0] = r1
            return r6
        L4b:
            r6 = move-exception
            java.lang.Object[] r7 = r5.mConstructorArgs
            r7[r2] = r1
            r7[r0] = r1
            throw r6
        L53:
            java.lang.Object[] r6 = r5.mConstructorArgs
            r6[r2] = r1
            r6[r0] = r1
            return r1
    }

    private static android.content.Context themifyContext(android.content.Context r2, android.util.AttributeSet r3, boolean r4, boolean r5) {
            int[] r0 = androidx.appcompat.R.styleable.View
            r1 = 0
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r0, r1, r1)
            if (r4 == 0) goto L10
            int r4 = androidx.appcompat.R.styleable.View_android_theme
            int r4 = r3.getResourceId(r4, r1)
            goto L11
        L10:
            r4 = 0
        L11:
            if (r5 == 0) goto L24
            if (r4 != 0) goto L24
            int r4 = androidx.appcompat.R.styleable.View_theme
            int r4 = r3.getResourceId(r4, r1)
            if (r4 == 0) goto L24
            java.lang.String r5 = "AppCompatViewInflater"
            java.lang.String r0 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r5, r0)
        L24:
            r3.recycle()
            if (r4 == 0) goto L3c
            boolean r3 = r2 instanceof androidx.appcompat.view.ContextThemeWrapper
            if (r3 == 0) goto L36
            r3 = r2
            androidx.appcompat.view.ContextThemeWrapper r3 = (androidx.appcompat.view.ContextThemeWrapper) r3
            int r3 = r3.getThemeResId()
            if (r3 == r4) goto L3c
        L36:
            androidx.appcompat.view.ContextThemeWrapper r3 = new androidx.appcompat.view.ContextThemeWrapper
            r3.<init>(r2, r4)
            r2 = r3
        L3c:
            return r2
    }

    private void verifyNotNull(android.view.View r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = " asked to inflate view for <"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = ">, but returned null"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    @androidx.annotation.NonNull
    public androidx.appcompat.widget.AppCompatAutoCompleteTextView createAutoCompleteTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatAutoCompleteTextView r0 = new androidx.appcompat.widget.AppCompatAutoCompleteTextView
            r0.<init>(r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.appcompat.widget.AppCompatButton createButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatButton r0 = new androidx.appcompat.widget.AppCompatButton
            r0.<init>(r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.appcompat.widget.AppCompatCheckBox createCheckBox(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatCheckBox r0 = new androidx.appcompat.widget.AppCompatCheckBox
            r0.<init>(r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.appcompat.widget.AppCompatRadioButton createRadioButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatRadioButton r0 = new androidx.appcompat.widget.AppCompatRadioButton
            r0.<init>(r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.appcompat.widget.AppCompatTextView createTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            androidx.appcompat.widget.AppCompatTextView r0 = new androidx.appcompat.widget.AppCompatTextView
            r0.<init>(r2, r3)
            return r0
    }

    @androidx.annotation.Nullable
    public final android.view.View createView(@androidx.annotation.Nullable android.view.View r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull android.util.AttributeSet r4, boolean r5, boolean r6, boolean r7, boolean r8) {
            r0 = this;
            if (r5 == 0) goto L9
            if (r1 == 0) goto L9
            android.content.Context r1 = r1.getContext()
            goto La
        L9:
            r1 = r3
        La:
            if (r6 != 0) goto Le
            if (r7 == 0) goto L12
        Le:
            android.content.Context r1 = themifyContext(r1, r4, r6, r7)
        L12:
            if (r8 == 0) goto L18
            android.content.Context r1 = androidx.appcompat.widget.TintContextWrapper.wrap(r1)
        L18:
            java.util.Objects.requireNonNull(r2)
            r5 = -1
            int r6 = r2.hashCode()
            switch(r6) {
                case -1946472170: goto Lc6;
                case -1455429095: goto Lbb;
                case -1346021293: goto Lb0;
                case -938935918: goto La5;
                case -937446323: goto L9a;
                case -658531749: goto L8f;
                case -339785223: goto L84;
                case 776382189: goto L79;
                case 799298502: goto L6b;
                case 1125864064: goto L5d;
                case 1413872058: goto L4f;
                case 1601505219: goto L41;
                case 1666676343: goto L33;
                case 2001146706: goto L25;
                default: goto L23;
            }
        L23:
            goto Ld0
        L25:
            java.lang.String r6 = "Button"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L2f
            goto Ld0
        L2f:
            r5 = 13
            goto Ld0
        L33:
            java.lang.String r6 = "EditText"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L3d
            goto Ld0
        L3d:
            r5 = 12
            goto Ld0
        L41:
            java.lang.String r6 = "CheckBox"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L4b
            goto Ld0
        L4b:
            r5 = 11
            goto Ld0
        L4f:
            java.lang.String r6 = "AutoCompleteTextView"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L59
            goto Ld0
        L59:
            r5 = 10
            goto Ld0
        L5d:
            java.lang.String r6 = "ImageView"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L67
            goto Ld0
        L67:
            r5 = 9
            goto Ld0
        L6b:
            java.lang.String r6 = "ToggleButton"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L75
            goto Ld0
        L75:
            r5 = 8
            goto Ld0
        L79:
            java.lang.String r6 = "RadioButton"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L82
            goto Ld0
        L82:
            r5 = 7
            goto Ld0
        L84:
            java.lang.String r6 = "Spinner"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L8d
            goto Ld0
        L8d:
            r5 = 6
            goto Ld0
        L8f:
            java.lang.String r6 = "SeekBar"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto L98
            goto Ld0
        L98:
            r5 = 5
            goto Ld0
        L9a:
            java.lang.String r6 = "ImageButton"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto La3
            goto Ld0
        La3:
            r5 = 4
            goto Ld0
        La5:
            java.lang.String r6 = "TextView"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto Lae
            goto Ld0
        Lae:
            r5 = 3
            goto Ld0
        Lb0:
            java.lang.String r6 = "MultiAutoCompleteTextView"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto Lb9
            goto Ld0
        Lb9:
            r5 = 2
            goto Ld0
        Lbb:
            java.lang.String r6 = "CheckedTextView"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto Lc4
            goto Ld0
        Lc4:
            r5 = 1
            goto Ld0
        Lc6:
            java.lang.String r6 = "RatingBar"
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto Lcf
            goto Ld0
        Lcf:
            r5 = 0
        Ld0:
            switch(r5) {
                case 0: goto L148;
                case 1: goto L13f;
                case 2: goto L136;
                case 3: goto L12e;
                case 4: goto L125;
                case 5: goto L11c;
                case 6: goto L113;
                case 7: goto L10b;
                case 8: goto L102;
                case 9: goto Lf9;
                case 10: goto Lf1;
                case 11: goto Le9;
                case 12: goto Ldf;
                case 13: goto Ld6;
                default: goto Ld3;
            }
        Ld3:
            r5 = 0
            goto L150
        Ld6:
            androidx.appcompat.widget.AppCompatButton r5 = r0.createButton(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L150
        Ldf:
            androidx.appcompat.widget.AppCompatEditText r5 = new androidx.appcompat.widget.AppCompatEditText
            r5.<init>(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L150
        Le9:
            androidx.appcompat.widget.AppCompatCheckBox r5 = r0.createCheckBox(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L150
        Lf1:
            androidx.appcompat.widget.AppCompatAutoCompleteTextView r5 = r0.createAutoCompleteTextView(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L150
        Lf9:
            androidx.appcompat.widget.AppCompatImageView r5 = new androidx.appcompat.widget.AppCompatImageView
            r5.<init>(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L150
        L102:
            androidx.appcompat.widget.AppCompatToggleButton r5 = new androidx.appcompat.widget.AppCompatToggleButton
            r5.<init>(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L150
        L10b:
            androidx.appcompat.widget.AppCompatRadioButton r5 = r0.createRadioButton(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L150
        L113:
            androidx.appcompat.widget.AppCompatSpinner r5 = new androidx.appcompat.widget.AppCompatSpinner
            r5.<init>(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L150
        L11c:
            androidx.appcompat.widget.AppCompatSeekBar r5 = new androidx.appcompat.widget.AppCompatSeekBar
            r5.<init>(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L150
        L125:
            androidx.appcompat.widget.AppCompatImageButton r5 = new androidx.appcompat.widget.AppCompatImageButton
            r5.<init>(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L150
        L12e:
            androidx.appcompat.widget.AppCompatTextView r5 = r0.createTextView(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L150
        L136:
            androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView r5 = new androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView
            r5.<init>(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L150
        L13f:
            androidx.appcompat.widget.AppCompatCheckedTextView r5 = new androidx.appcompat.widget.AppCompatCheckedTextView
            r5.<init>(r1, r4)
            r0.verifyNotNull(r5, r2)
            goto L150
        L148:
            androidx.appcompat.widget.AppCompatRatingBar r5 = new androidx.appcompat.widget.AppCompatRatingBar
            r5.<init>(r1, r4)
            r0.verifyNotNull(r5, r2)
        L150:
            if (r5 != 0) goto L158
            if (r3 == r1) goto L158
            android.view.View r5 = r0.createViewFromTag(r1, r2, r4)
        L158:
            if (r5 == 0) goto L160
            r0.checkOnClickListener(r5, r4)
            r0.backportAccessibilityAttributes(r1, r5, r4)
        L160:
            return r5
    }
}
