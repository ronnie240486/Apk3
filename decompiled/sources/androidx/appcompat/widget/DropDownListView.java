package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes3.dex */
class DropDownListView extends android.widget.ListView {
    public static final int INVALID_POSITION = -1;
    public static final int NO_POSITION = -1;
    private androidx.core.view.ViewPropertyAnimatorCompat mClickAnimation;
    private boolean mDrawsInPressedState;
    private boolean mHijackFocus;
    private boolean mListSelectionHidden;
    private int mMotionPosition;
    public androidx.appcompat.widget.DropDownListView.ResolveHoverRunnable mResolveHoverRunnable;
    private androidx.core.widget.ListViewAutoScrollHelper mScrollHelper;
    private int mSelectionBottomPadding;
    private int mSelectionLeftPadding;
    private int mSelectionRightPadding;
    private int mSelectionTopPadding;
    private androidx.appcompat.widget.DropDownListView.GateKeeperDrawable mSelector;
    private final android.graphics.Rect mSelectorRect;

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void drawableHotspotChanged(android.view.View r0, float r1, float r2) {
                r0.drawableHotspotChanged(r1, r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(30)
    public static class Api30Impl {
        private static boolean sHasMethods;
        private static java.lang.reflect.Method sPositionSelector;
        private static java.lang.reflect.Method sSetNextSelectedPositionInt;
        private static java.lang.reflect.Method sSetSelectedPositionInt;

        static {
                java.lang.Class<android.widget.AbsListView> r0 = android.widget.AbsListView.class
                java.lang.String r1 = "positionSelector"
                r2 = 5
                java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L4e
                java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L4e
                r4 = 0
                r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L4e
                java.lang.Class<android.view.View> r5 = android.view.View.class
                r6 = 1
                r2[r6] = r5     // Catch: java.lang.NoSuchMethodException -> L4e
                r5 = 2
                java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L4e
                r2[r5] = r7     // Catch: java.lang.NoSuchMethodException -> L4e
                r5 = 3
                java.lang.Class r7 = java.lang.Float.TYPE     // Catch: java.lang.NoSuchMethodException -> L4e
                r2[r5] = r7     // Catch: java.lang.NoSuchMethodException -> L4e
                r5 = 4
                r2[r5] = r7     // Catch: java.lang.NoSuchMethodException -> L4e
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L4e
                androidx.appcompat.widget.DropDownListView.Api30Impl.sPositionSelector = r0     // Catch: java.lang.NoSuchMethodException -> L4e
                r0.setAccessible(r6)     // Catch: java.lang.NoSuchMethodException -> L4e
                java.lang.Class<android.widget.AdapterView> r0 = android.widget.AdapterView.class
                java.lang.String r1 = "setSelectedPositionInt"
                java.lang.Class[] r2 = new java.lang.Class[r6]     // Catch: java.lang.NoSuchMethodException -> L4e
                r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L4e
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L4e
                androidx.appcompat.widget.DropDownListView.Api30Impl.sSetSelectedPositionInt = r0     // Catch: java.lang.NoSuchMethodException -> L4e
                r0.setAccessible(r6)     // Catch: java.lang.NoSuchMethodException -> L4e
                java.lang.Class<android.widget.AdapterView> r0 = android.widget.AdapterView.class
                java.lang.String r1 = "setNextSelectedPositionInt"
                java.lang.Class[] r2 = new java.lang.Class[r6]     // Catch: java.lang.NoSuchMethodException -> L4e
                r2[r4] = r3     // Catch: java.lang.NoSuchMethodException -> L4e
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L4e
                androidx.appcompat.widget.DropDownListView.Api30Impl.sSetNextSelectedPositionInt = r0     // Catch: java.lang.NoSuchMethodException -> L4e
                r0.setAccessible(r6)     // Catch: java.lang.NoSuchMethodException -> L4e
                androidx.appcompat.widget.DropDownListView.Api30Impl.sHasMethods = r6     // Catch: java.lang.NoSuchMethodException -> L4e
                goto L52
            L4e:
                r0 = move-exception
                r0.printStackTrace()
            L52:
                return
        }

        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static boolean canPositionSelectorForHoveredItem() {
                boolean r0 = androidx.appcompat.widget.DropDownListView.Api30Impl.sHasMethods
                return r0
        }

        @android.annotation.SuppressLint({"BanUncheckedReflection"})
        public static void positionSelectorForHoveredItem(androidx.appcompat.widget.DropDownListView r6, int r7, android.view.View r8) {
                java.lang.reflect.Method r0 = androidx.appcompat.widget.DropDownListView.Api30Impl.sPositionSelector     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                r1 = 5
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                r3 = 0
                r1[r3] = r2     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                r2 = 1
                r1[r2] = r8     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                r8 = 2
                java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                r1[r8] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                r8 = 3
                r4 = -1
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                r1[r8] = r5     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                r8 = 4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                r1[r8] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                r0.invoke(r6, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                java.lang.reflect.Method r8 = androidx.appcompat.widget.DropDownListView.Api30Impl.sSetSelectedPositionInt     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                r0[r3] = r1     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                r8.invoke(r6, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                java.lang.reflect.Method r8 = androidx.appcompat.widget.DropDownListView.Api30Impl.sSetNextSelectedPositionInt     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                r0[r3] = r7     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                r8.invoke(r6, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L41 java.lang.IllegalAccessException -> L46
                goto L4a
            L41:
                r6 = move-exception
                r6.printStackTrace()
                goto L4a
            L46:
                r6 = move-exception
                r6.printStackTrace()
            L4a:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(33)
    public static class Api33Impl {
        private Api33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean isSelectedChildViewEnabled(android.widget.AbsListView r0) {
                boolean r0 = r0.isSelectedChildViewEnabled()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setSelectedChildViewEnabled(android.widget.AbsListView r0, boolean r1) {
                r0.setSelectedChildViewEnabled(r1)
                return
        }
    }

    public static class GateKeeperDrawable extends androidx.appcompat.graphics.drawable.DrawableWrapperCompat {
        private boolean mEnabled;

        public GateKeeperDrawable(android.graphics.drawable.Drawable r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 1
                r0.mEnabled = r1
                return
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas r2) {
                r1 = this;
                boolean r0 = r1.mEnabled
                if (r0 == 0) goto L7
                super.draw(r2)
            L7:
                return
        }

        public final void setEnabled(boolean r1) {
                r0 = this;
                r0.mEnabled = r1
                return
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void setHotspot(float r2, float r3) {
                r1 = this;
                boolean r0 = r1.mEnabled
                if (r0 == 0) goto L7
                super.setHotspot(r2, r3)
            L7:
                return
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public void setHotspotBounds(int r2, int r3, int r4, int r5) {
                r1 = this;
                boolean r0 = r1.mEnabled
                if (r0 == 0) goto L7
                super.setHotspotBounds(r2, r3, r4, r5)
            L7:
                return
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public boolean setState(int[] r2) {
                r1 = this;
                boolean r0 = r1.mEnabled
                if (r0 == 0) goto L9
                boolean r2 = super.setState(r2)
                return r2
            L9:
                r2 = 0
                return r2
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public boolean setVisible(boolean r2, boolean r3) {
                r1 = this;
                boolean r0 = r1.mEnabled
                if (r0 == 0) goto L9
                boolean r2 = super.setVisible(r2, r3)
                return r2
            L9:
                r2 = 0
                return r2
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class PreApi33Impl {
        private static final java.lang.reflect.Field sIsChildViewEnabled = null;

        static {
                r0 = 0
                java.lang.Class<android.widget.AbsListView> r1 = android.widget.AbsListView.class
                java.lang.String r2 = "mIsChildViewEnabled"
                java.lang.reflect.Field r0 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> Le
                r1 = 1
                r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> Le
                goto L12
            Le:
                r1 = move-exception
                r1.printStackTrace()
            L12:
                androidx.appcompat.widget.DropDownListView.PreApi33Impl.sIsChildViewEnabled = r0
                return
        }

        private PreApi33Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static boolean isSelectedChildViewEnabled(android.widget.AbsListView r1) {
                java.lang.reflect.Field r0 = androidx.appcompat.widget.DropDownListView.PreApi33Impl.sIsChildViewEnabled
                if (r0 == 0) goto Ld
                boolean r1 = r0.getBoolean(r1)     // Catch: java.lang.IllegalAccessException -> L9
                return r1
            L9:
                r1 = move-exception
                r1.printStackTrace()
            Ld:
                r1 = 0
                return r1
        }

        public static void setSelectedChildViewEnabled(android.widget.AbsListView r1, boolean r2) {
                java.lang.reflect.Field r0 = androidx.appcompat.widget.DropDownListView.PreApi33Impl.sIsChildViewEnabled
                if (r0 == 0) goto L10
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.IllegalAccessException -> Lc
                r0.set(r1, r2)     // Catch: java.lang.IllegalAccessException -> Lc
                goto L10
            Lc:
                r1 = move-exception
                r1.printStackTrace()
            L10:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class ResolveHoverRunnable implements java.lang.Runnable {
        public final /* synthetic */ androidx.appcompat.widget.DropDownListView this$0;

        public ResolveHoverRunnable(androidx.appcompat.widget.DropDownListView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public void cancel() {
                r2 = this;
                androidx.appcompat.widget.DropDownListView r0 = r2.this$0
                r1 = 0
                r0.mResolveHoverRunnable = r1
                r0.removeCallbacks(r2)
                return
        }

        public void post() {
                r1 = this;
                androidx.appcompat.widget.DropDownListView r0 = r1.this$0
                r0.post(r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.appcompat.widget.DropDownListView r0 = r2.this$0
                r1 = 0
                r0.mResolveHoverRunnable = r1
                r0.drawableStateChanged()
                return
        }
    }

    public DropDownListView(@androidx.annotation.NonNull android.content.Context r3, boolean r4) {
            r2 = this;
            int r0 = androidx.appcompat.R.attr.dropDownListViewStyle
            r1 = 0
            r2.<init>(r3, r1, r0)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r2.mSelectorRect = r3
            r3 = 0
            r2.mSelectionLeftPadding = r3
            r2.mSelectionTopPadding = r3
            r2.mSelectionRightPadding = r3
            r2.mSelectionBottomPadding = r3
            r2.mHijackFocus = r4
            r2.setCacheColorHint(r3)
            return
    }

    private void clearPressedItem() {
            r3 = this;
            r0 = 0
            r3.mDrawsInPressedState = r0
            r3.setPressed(r0)
            r3.drawableStateChanged()
            int r1 = r3.mMotionPosition
            int r2 = r3.getFirstVisiblePosition()
            int r1 = r1 - r2
            android.view.View r1 = r3.getChildAt(r1)
            if (r1 == 0) goto L19
            r1.setPressed(r0)
        L19:
            androidx.core.view.ViewPropertyAnimatorCompat r0 = r3.mClickAnimation
            if (r0 == 0) goto L23
            r0.cancel()
            r0 = 0
            r3.mClickAnimation = r0
        L23:
            return
    }

    private void clickPressedItem(android.view.View r3, int r4) {
            r2 = this;
            long r0 = r2.getItemIdAtPosition(r4)
            r2.performItemClick(r3, r4, r0)
            return
    }

    private void drawSelectorCompat(android.graphics.Canvas r3) {
            r2 = this;
            android.graphics.Rect r0 = r2.mSelectorRect
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L16
            android.graphics.drawable.Drawable r0 = r2.getSelector()
            if (r0 == 0) goto L16
            android.graphics.Rect r1 = r2.mSelectorRect
            r0.setBounds(r1)
            r0.draw(r3)
        L16:
            return
    }

    private void positionSelectorCompat(int r6, android.view.View r7) {
            r5 = this;
            android.graphics.Rect r0 = r5.mSelectorRect
            int r1 = r7.getLeft()
            int r2 = r7.getTop()
            int r3 = r7.getRight()
            int r4 = r7.getBottom()
            r0.set(r1, r2, r3, r4)
            int r1 = r0.left
            int r2 = r5.mSelectionLeftPadding
            int r1 = r1 - r2
            r0.left = r1
            int r1 = r0.top
            int r2 = r5.mSelectionTopPadding
            int r1 = r1 - r2
            r0.top = r1
            int r1 = r0.right
            int r2 = r5.mSelectionRightPadding
            int r1 = r1 + r2
            r0.right = r1
            int r1 = r0.bottom
            int r2 = r5.mSelectionBottomPadding
            int r1 = r1 + r2
            r0.bottom = r1
            boolean r0 = r5.superIsSelectedChildViewEnabled()
            boolean r7 = r7.isEnabled()
            if (r7 == r0) goto L46
            r7 = r0 ^ 1
            r5.superSetSelectedChildViewEnabled(r7)
            r7 = -1
            if (r6 == r7) goto L46
            r5.refreshDrawableState()
        L46:
            return
    }

    private void positionSelectorLikeFocusCompat(int r5, android.view.View r6) {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.getSelector()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Ld
            r3 = -1
            if (r5 == r3) goto Ld
            r3 = 1
            goto Le
        Ld:
            r3 = 0
        Le:
            if (r3 == 0) goto L13
            r0.setVisible(r2, r2)
        L13:
            r4.positionSelectorCompat(r5, r6)
            if (r3 == 0) goto L30
            android.graphics.Rect r5 = r4.mSelectorRect
            float r6 = r5.exactCenterX()
            float r5 = r5.exactCenterY()
            int r3 = r4.getVisibility()
            if (r3 != 0) goto L29
            goto L2a
        L29:
            r1 = 0
        L2a:
            r0.setVisible(r1, r2)
            androidx.core.graphics.drawable.DrawableCompat.setHotspot(r0, r6, r5)
        L30:
            return
    }

    private void positionSelectorLikeTouchCompat(int r2, android.view.View r3, float r4, float r5) {
            r1 = this;
            r1.positionSelectorLikeFocusCompat(r2, r3)
            android.graphics.drawable.Drawable r3 = r1.getSelector()
            if (r3 == 0) goto Lf
            r0 = -1
            if (r2 == r0) goto Lf
            androidx.core.graphics.drawable.DrawableCompat.setHotspot(r3, r4, r5)
        Lf:
            return
    }

    private void setPressedItem(android.view.View r5, int r6, float r7, float r8) {
            r4 = this;
            r0 = 1
            r4.mDrawsInPressedState = r0
            androidx.appcompat.widget.DropDownListView.Api21Impl.drawableHotspotChanged(r4, r7, r8)
            boolean r1 = r4.isPressed()
            if (r1 != 0) goto Lf
            r4.setPressed(r0)
        Lf:
            r4.layoutChildren()
            int r1 = r4.mMotionPosition
            r2 = -1
            r3 = 0
            if (r1 == r2) goto L2e
            int r2 = r4.getFirstVisiblePosition()
            int r1 = r1 - r2
            android.view.View r1 = r4.getChildAt(r1)
            if (r1 == 0) goto L2e
            if (r1 == r5) goto L2e
            boolean r2 = r1.isPressed()
            if (r2 == 0) goto L2e
            r1.setPressed(r3)
        L2e:
            r4.mMotionPosition = r6
            int r1 = r5.getLeft()
            float r1 = (float) r1
            float r1 = r7 - r1
            int r2 = r5.getTop()
            float r2 = (float) r2
            float r2 = r8 - r2
            androidx.appcompat.widget.DropDownListView.Api21Impl.drawableHotspotChanged(r5, r1, r2)
            boolean r1 = r5.isPressed()
            if (r1 != 0) goto L4a
            r5.setPressed(r0)
        L4a:
            r4.positionSelectorLikeTouchCompat(r6, r5, r7, r8)
            r4.setSelectorEnabled(r3)
            r4.refreshDrawableState()
            return
    }

    private void setSelectorEnabled(boolean r2) {
            r1 = this;
            androidx.appcompat.widget.DropDownListView$GateKeeperDrawable r0 = r1.mSelector
            if (r0 == 0) goto L7
            r0.setEnabled(r2)
        L7:
            return
    }

    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    private boolean superIsSelectedChildViewEnabled() {
            r1 = this;
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 == 0) goto Lb
            boolean r0 = androidx.appcompat.widget.DropDownListView.Api33Impl.isSelectedChildViewEnabled(r1)
            return r0
        Lb:
            boolean r0 = androidx.appcompat.widget.DropDownListView.PreApi33Impl.isSelectedChildViewEnabled(r1)
            return r0
    }

    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    private void superSetSelectedChildViewEnabled(boolean r2) {
            r1 = this;
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 == 0) goto La
            androidx.appcompat.widget.DropDownListView.Api33Impl.setSelectedChildViewEnabled(r1, r2)
            goto Ld
        La:
            androidx.appcompat.widget.DropDownListView.PreApi33Impl.setSelectedChildViewEnabled(r1, r2)
        Ld:
            return
    }

    private boolean touchModeDrawsInPressedStateCompat() {
            r1 = this;
            boolean r0 = r1.mDrawsInPressedState
            return r0
    }

    private void updateSelectorStateCompat() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.getSelector()
            if (r0 == 0) goto L19
            boolean r1 = r2.touchModeDrawsInPressedStateCompat()
            if (r1 == 0) goto L19
            boolean r1 = r2.isPressed()
            if (r1 == 0) goto L19
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L19:
            return
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas r1) {
            r0 = this;
            r0.drawSelectorCompat(r1)
            super.dispatchDraw(r1)
            return
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            androidx.appcompat.widget.DropDownListView$ResolveHoverRunnable r0 = r1.mResolveHoverRunnable
            if (r0 == 0) goto L5
            return
        L5:
            super.drawableStateChanged()
            r0 = 1
            r1.setSelectorEnabled(r0)
            r1.updateSelectorStateCompat()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
            r1 = this;
            boolean r0 = r1.mHijackFocus
            if (r0 != 0) goto Ld
            boolean r0 = super.hasFocus()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
            r1 = this;
            boolean r0 = r1.mHijackFocus
            if (r0 != 0) goto Ld
            boolean r0 = super.hasWindowFocus()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Override // android.view.View
    public boolean isFocused() {
            r1 = this;
            boolean r0 = r1.mHijackFocus
            if (r0 != 0) goto Ld
            boolean r0 = super.isFocused()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
            r1 = this;
            boolean r0 = r1.mHijackFocus
            if (r0 == 0) goto L8
            boolean r0 = r1.mListSelectionHidden
            if (r0 != 0) goto Le
        L8:
            boolean r0 = super.isInTouchMode()
            if (r0 == 0) goto L10
        Le:
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public int lookForSelectablePosition(int r5, boolean r6) {
            r4 = this;
            android.widget.ListAdapter r0 = r4.getAdapter()
            r1 = -1
            if (r0 == 0) goto L4c
            boolean r2 = r4.isInTouchMode()
            if (r2 == 0) goto Le
            goto L4c
        Le:
            int r2 = r0.getCount()
            android.widget.ListAdapter r3 = r4.getAdapter()
            boolean r3 = r3.areAllItemsEnabled()
            if (r3 != 0) goto L46
            if (r6 == 0) goto L2e
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)
        L23:
            if (r5 >= r2) goto L3f
            boolean r6 = r0.isEnabled(r5)
            if (r6 != 0) goto L3f
            int r5 = r5 + 1
            goto L23
        L2e:
            int r6 = r2 + (-1)
            int r5 = java.lang.Math.min(r5, r6)
        L34:
            if (r5 < 0) goto L3f
            boolean r6 = r0.isEnabled(r5)
            if (r6 != 0) goto L3f
            int r5 = r5 + (-1)
            goto L34
        L3f:
            if (r5 < 0) goto L45
            if (r5 < r2) goto L44
            goto L45
        L44:
            return r5
        L45:
            return r1
        L46:
            if (r5 < 0) goto L4c
            if (r5 < r2) goto L4b
            goto L4c
        L4b:
            return r5
        L4c:
            return r1
    }

    public int measureHeightOfChildrenCompat(int r11, int r12, int r13, int r14, int r15) {
            r10 = this;
            int r12 = r10.getListPaddingTop()
            int r13 = r10.getListPaddingBottom()
            int r0 = r10.getDividerHeight()
            android.graphics.drawable.Drawable r1 = r10.getDivider()
            android.widget.ListAdapter r2 = r10.getAdapter()
            if (r2 != 0) goto L18
            int r12 = r12 + r13
            return r12
        L18:
            int r12 = r12 + r13
            r13 = 0
            if (r0 <= 0) goto L1f
            if (r1 == 0) goto L1f
            goto L20
        L1f:
            r0 = 0
        L20:
            int r1 = r2.getCount()
            r3 = 0
            r6 = r3
            r4 = 0
            r5 = 0
            r7 = 0
        L29:
            if (r4 >= r1) goto L75
            int r8 = r2.getItemViewType(r4)
            if (r8 == r5) goto L33
            r6 = r3
            r5 = r8
        L33:
            android.view.View r6 = r2.getView(r4, r6, r10)
            android.view.ViewGroup$LayoutParams r8 = r6.getLayoutParams()
            if (r8 != 0) goto L44
            android.view.ViewGroup$LayoutParams r8 = r10.generateDefaultLayoutParams()
            r6.setLayoutParams(r8)
        L44:
            int r8 = r8.height
            if (r8 <= 0) goto L4f
            r9 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            goto L53
        L4f:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r13)
        L53:
            r6.measure(r11, r8)
            r6.forceLayout()
            if (r4 <= 0) goto L5c
            int r12 = r12 + r0
        L5c:
            int r8 = r6.getMeasuredHeight()
            int r12 = r12 + r8
            if (r12 < r14) goto L6d
            if (r15 < 0) goto L6c
            if (r4 <= r15) goto L6c
            if (r7 <= 0) goto L6c
            if (r12 == r14) goto L6c
            r14 = r7
        L6c:
            return r14
        L6d:
            if (r15 < 0) goto L72
            if (r4 < r15) goto L72
            r7 = r12
        L72:
            int r4 = r4 + 1
            goto L29
        L75:
            return r12
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            r0 = 0
            r1.mResolveHoverRunnable = r0
            super.onDetachedFromWindow()
            return
    }

    public boolean onForwardedEvent(android.view.MotionEvent r8, int r9) {
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = 0
            r3 = 1
            goto L46
        L11:
            r9 = 0
            r3 = 0
            goto L46
        L14:
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = 1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.setPressedItem(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.clickPressedItem(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.clearPressedItem()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.ListViewAutoScrollHelper r9 = r7.mScrollHelper
            if (r9 != 0) goto L5a
            androidx.core.widget.ListViewAutoScrollHelper r9 = new androidx.core.widget.ListViewAutoScrollHelper
            r9.<init>(r7)
            r7.mScrollHelper = r9
        L5a:
            androidx.core.widget.ListViewAutoScrollHelper r9 = r7.mScrollHelper
            r9.setEnabled(r2)
            androidx.core.widget.ListViewAutoScrollHelper r9 = r7.mScrollHelper
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.ListViewAutoScrollHelper r8 = r7.mScrollHelper
            if (r8 == 0) goto L6c
            r8.setEnabled(r1)
        L6c:
            return r3
    }

    @Override // android.view.View
    public boolean onHoverEvent(@androidx.annotation.NonNull android.view.MotionEvent r6) {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto Lb
            boolean r6 = super.onHoverEvent(r6)
            return r6
        Lb:
            int r1 = r6.getActionMasked()
            r2 = 10
            if (r1 != r2) goto L21
            androidx.appcompat.widget.DropDownListView$ResolveHoverRunnable r2 = r5.mResolveHoverRunnable
            if (r2 != 0) goto L21
            androidx.appcompat.widget.DropDownListView$ResolveHoverRunnable r2 = new androidx.appcompat.widget.DropDownListView$ResolveHoverRunnable
            r2.<init>(r5)
            r5.mResolveHoverRunnable = r2
            r2.post()
        L21:
            boolean r2 = super.onHoverEvent(r6)
            r3 = 9
            r4 = -1
            if (r1 == r3) goto L32
            r3 = 7
            if (r1 != r3) goto L2e
            goto L32
        L2e:
            r5.setSelection(r4)
            goto L78
        L32:
            float r1 = r6.getX()
            int r1 = (int) r1
            float r6 = r6.getY()
            int r6 = (int) r6
            int r6 = r5.pointToPosition(r1, r6)
            if (r6 == r4) goto L78
            int r1 = r5.getSelectedItemPosition()
            if (r6 == r1) goto L78
            int r1 = r5.getFirstVisiblePosition()
            int r1 = r6 - r1
            android.view.View r1 = r5.getChildAt(r1)
            boolean r3 = r1.isEnabled()
            if (r3 == 0) goto L75
            r5.requestFocus()
            r3 = 30
            if (r0 < r3) goto L69
            boolean r0 = androidx.appcompat.widget.DropDownListView.Api30Impl.canPositionSelectorForHoveredItem()
            if (r0 == 0) goto L69
            androidx.appcompat.widget.DropDownListView.Api30Impl.positionSelectorForHoveredItem(r5, r6, r1)
            goto L75
        L69:
            int r0 = r1.getTop()
            int r1 = r5.getTop()
            int r0 = r0 - r1
            r5.setSelectionFromTop(r6, r0)
        L75:
            r5.updateSelectorStateCompat()
        L78:
            return r2
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            int r0 = r3.getAction()
            if (r0 == 0) goto L7
            goto L17
        L7:
            float r0 = r3.getX()
            int r0 = (int) r0
            float r1 = r3.getY()
            int r1 = (int) r1
            int r0 = r2.pointToPosition(r0, r1)
            r2.mMotionPosition = r0
        L17:
            androidx.appcompat.widget.DropDownListView$ResolveHoverRunnable r0 = r2.mResolveHoverRunnable
            if (r0 == 0) goto L1e
            r0.cancel()
        L1e:
            boolean r3 = super.onTouchEvent(r3)
            return r3
    }

    public void setListSelectionHidden(boolean r1) {
            r0 = this;
            r0.mListSelectionHidden = r1
            return
    }

    @Override // android.widget.AbsListView
    public void setSelector(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L8
            androidx.appcompat.widget.DropDownListView$GateKeeperDrawable r0 = new androidx.appcompat.widget.DropDownListView$GateKeeperDrawable
            r0.<init>(r2)
            goto L9
        L8:
            r0 = 0
        L9:
            r1.mSelector = r0
            super.setSelector(r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            if (r2 == 0) goto L18
            r2.getPadding(r0)
        L18:
            int r2 = r0.left
            r1.mSelectionLeftPadding = r2
            int r2 = r0.top
            r1.mSelectionTopPadding = r2
            int r2 = r0.right
            r1.mSelectionRightPadding = r2
            int r2 = r0.bottom
            r1.mSelectionBottomPadding = r2
            return
    }
}
