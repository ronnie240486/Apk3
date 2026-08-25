package androidx.core.view;

/* JADX INFO: loaded from: classes3.dex */
@android.annotation.SuppressLint({"PrivateConstructorForUtilityClass"})
public class ViewCompat {
    private static final int[] ACCESSIBILITY_ACTIONS_RESOURCE_IDS = null;
    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;

    @java.lang.Deprecated
    public static final int LAYER_TYPE_HARDWARE = 2;

    @java.lang.Deprecated
    public static final int LAYER_TYPE_NONE = 0;

    @java.lang.Deprecated
    public static final int LAYER_TYPE_SOFTWARE = 1;
    public static final int LAYOUT_DIRECTION_INHERIT = 2;
    public static final int LAYOUT_DIRECTION_LOCALE = 3;
    public static final int LAYOUT_DIRECTION_LTR = 0;
    public static final int LAYOUT_DIRECTION_RTL = 1;

    @java.lang.Deprecated
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;

    @java.lang.Deprecated
    public static final int MEASURED_SIZE_MASK = 16777215;

    @java.lang.Deprecated
    public static final int MEASURED_STATE_MASK = -16777216;

    @java.lang.Deprecated
    public static final int MEASURED_STATE_TOO_SMALL = 16777216;
    private static final androidx.core.view.OnReceiveContentViewBehavior NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR = null;

    @java.lang.Deprecated
    public static final int OVER_SCROLL_ALWAYS = 0;

    @java.lang.Deprecated
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;

    @java.lang.Deprecated
    public static final int OVER_SCROLL_NEVER = 2;
    public static final int SCROLL_AXIS_HORIZONTAL = 1;
    public static final int SCROLL_AXIS_NONE = 0;
    public static final int SCROLL_AXIS_VERTICAL = 2;
    public static final int SCROLL_INDICATOR_BOTTOM = 2;
    public static final int SCROLL_INDICATOR_END = 32;
    public static final int SCROLL_INDICATOR_LEFT = 4;
    public static final int SCROLL_INDICATOR_RIGHT = 8;
    public static final int SCROLL_INDICATOR_START = 16;
    public static final int SCROLL_INDICATOR_TOP = 1;
    private static final java.lang.String TAG = "ViewCompat";
    public static final int TYPE_NON_TOUCH = 1;
    public static final int TYPE_TOUCH = 0;
    private static boolean sAccessibilityDelegateCheckFailed;
    private static java.lang.reflect.Field sAccessibilityDelegateField;
    private static final androidx.core.view.ViewCompat.AccessibilityPaneVisibilityManager sAccessibilityPaneVisibilityManager = null;
    private static java.lang.reflect.Method sChildrenDrawingOrderMethod;
    private static java.lang.reflect.Method sDispatchFinishTemporaryDetach;
    private static java.lang.reflect.Method sDispatchStartTemporaryDetach;
    private static java.lang.reflect.Field sMinHeightField;
    private static boolean sMinHeightFieldFetched;
    private static java.lang.reflect.Field sMinWidthField;
    private static boolean sMinWidthFieldFetched;
    private static final java.util.concurrent.atomic.AtomicInteger sNextGeneratedId = null;
    private static boolean sTempDetachBound;
    private static java.lang.ThreadLocal<android.graphics.Rect> sThreadLocalRect;
    private static java.util.WeakHashMap<android.view.View, java.lang.String> sTransitionNameMap;
    private static java.util.WeakHashMap<android.view.View, androidx.core.view.ViewPropertyAnimatorCompat> sViewPropertyAnimatorMap;





    /* JADX INFO: loaded from: classes2.dex */
    public static class AccessibilityPaneVisibilityManager implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.View.OnAttachStateChangeListener {
        private final java.util.WeakHashMap<android.view.View, java.lang.Boolean> mPanesToVisible;

        public AccessibilityPaneVisibilityManager() {
                r1 = this;
                r1.<init>()
                java.util.WeakHashMap r0 = new java.util.WeakHashMap
                r0.<init>()
                r1.mPanesToVisible = r0
                return
        }

        @androidx.annotation.RequiresApi(19)
        private void checkPaneVisibility(android.view.View r2, boolean r3) {
                r1 = this;
                boolean r0 = r2.isShown()
                if (r0 == 0) goto Le
                int r0 = r2.getWindowVisibility()
                if (r0 != 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                if (r3 == r0) goto L24
                if (r0 == 0) goto L16
                r3 = 16
                goto L18
            L16:
                r3 = 32
            L18:
                androidx.core.view.ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(r2, r3)
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r3 = r1.mPanesToVisible
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r3.put(r2, r0)
            L24:
                return
        }

        @androidx.annotation.RequiresApi(19)
        private void registerForLayoutCallback(android.view.View r1) {
                r0 = this;
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.addOnGlobalLayoutListener(r0)
                return
        }

        @androidx.annotation.RequiresApi(19)
        private void unregisterForLayoutCallback(android.view.View r1) {
                r0 = this;
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                androidx.core.view.ViewCompat.Api16Impl.removeOnGlobalLayoutListener(r1, r0)
                return
        }

        @androidx.annotation.RequiresApi(19)
        public final void addAccessibilityPane(android.view.View r3) {
                r2 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r2.mPanesToVisible
                boolean r1 = r3.isShown()
                if (r1 == 0) goto L10
                int r1 = r3.getWindowVisibility()
                if (r1 != 0) goto L10
                r1 = 1
                goto L11
            L10:
                r1 = 0
            L11:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.put(r3, r1)
                r3.addOnAttachStateChangeListener(r2)
                boolean r0 = androidx.core.view.ViewCompat.Api19Impl.isAttachedToWindow(r3)
                if (r0 == 0) goto L24
                r2.registerForLayoutCallback(r3)
            L24:
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @androidx.annotation.RequiresApi(19)
        public void onGlobalLayout() {
                r3 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 >= r1) goto L30
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r3.mPanesToVisible
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
            L10:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L30
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                android.view.View r2 = (android.view.View) r2
                java.lang.Object r1 = r1.getValue()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                r3.checkPaneVisibility(r2, r1)
                goto L10
            L30:
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @androidx.annotation.RequiresApi(19)
        public void onViewAttachedToWindow(android.view.View r1) {
                r0 = this;
                r0.registerForLayoutCallback(r1)
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View r1) {
                r0 = this;
                return
        }

        @androidx.annotation.RequiresApi(19)
        public final void removeAccessibilityPane(android.view.View r2) {
                r1 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r1.mPanesToVisible
                r0.remove(r2)
                r2.removeOnAttachStateChangeListener(r1)
                r1.unregisterForLayoutCallback(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class AccessibilityViewProperty<T> {
        private final int mContentChangeType;
        private final int mFrameworkMinimumSdk;
        private final int mTagKey;
        private final java.lang.Class<T> mType;

        public AccessibilityViewProperty(int r1, java.lang.Class<T> r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.mTagKey = r1
                r0.mType = r2
                r0.mContentChangeType = r3
                r0.mFrameworkMinimumSdk = r4
                return
        }

        private boolean extrasAvailable() {
                r1 = this;
                r0 = 1
                return r0
        }

        private boolean frameworkAvailable() {
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                int r1 = r2.mFrameworkMinimumSdk
                if (r0 < r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public final boolean booleanNullToFalseEquals(java.lang.Boolean r3, java.lang.Boolean r4) {
                r2 = this;
                r0 = 1
                r1 = 0
                if (r3 == 0) goto Lc
                boolean r3 = r3.booleanValue()
                if (r3 == 0) goto Lc
                r3 = 1
                goto Ld
            Lc:
                r3 = 0
            Ld:
                if (r4 == 0) goto L17
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L17
                r4 = 1
                goto L18
            L17:
                r4 = 0
            L18:
                if (r3 != r4) goto L1b
                goto L1c
            L1b:
                r0 = 0
            L1c:
                return r0
        }

        public abstract T frameworkGet(android.view.View r1);

        public abstract void frameworkSet(android.view.View r1, T r2);

        public final T get(android.view.View r2) {
                r1 = this;
                boolean r0 = r1.frameworkAvailable()
                if (r0 == 0) goto Lb
                java.lang.Object r2 = r1.frameworkGet(r2)
                return r2
            Lb:
                boolean r0 = r1.extrasAvailable()
                if (r0 == 0) goto L20
                int r0 = r1.mTagKey
                java.lang.Object r2 = r2.getTag(r0)
                java.lang.Class<T> r0 = r1.mType
                boolean r0 = r0.isInstance(r2)
                if (r0 == 0) goto L20
                return r2
            L20:
                r2 = 0
                return r2
        }

        public final void set(android.view.View r2, T r3) {
                r1 = this;
                boolean r0 = r1.frameworkAvailable()
                if (r0 == 0) goto La
                r1.frameworkSet(r2, r3)
                goto L27
            La:
                boolean r0 = r1.extrasAvailable()
                if (r0 == 0) goto L27
                java.lang.Object r0 = r1.get(r2)
                boolean r0 = r1.shouldUpdate(r0, r3)
                if (r0 == 0) goto L27
                androidx.core.view.ViewCompat.ensureAccessibilityDelegateCompat(r2)
                int r0 = r1.mTagKey
                r2.setTag(r0, r3)
                int r3 = r1.mContentChangeType
                androidx.core.view.ViewCompat.notifyViewAccessibilityStateChangedIfNeeded(r2, r3)
            L27:
                return
        }

        public boolean shouldUpdate(T r1, T r2) {
                r0 = this;
                boolean r1 = r2.equals(r1)
                r1 = r1 ^ 1
                return r1
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(15)
    public static class Api15Impl {
        private Api15Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean hasOnClickListeners(@androidx.annotation.NonNull android.view.View r0) {
                boolean r0 = r0.hasOnClickListeners()
                return r0
        }
    }

    @androidx.annotation.RequiresApi(16)
    public static class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View r0) {
                android.view.accessibility.AccessibilityNodeProvider r0 = r0.getAccessibilityNodeProvider()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean getFitsSystemWindows(android.view.View r0) {
                boolean r0 = r0.getFitsSystemWindows()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getImportantForAccessibility(android.view.View r0) {
                int r0 = r0.getImportantForAccessibility()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getMinimumHeight(android.view.View r0) {
                int r0 = r0.getMinimumHeight()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getMinimumWidth(android.view.View r0) {
                int r0 = r0.getMinimumWidth()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.ViewParent getParentForAccessibility(android.view.View r0) {
                android.view.ViewParent r0 = r0.getParentForAccessibility()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getWindowSystemUiVisibility(android.view.View r0) {
                int r0 = r0.getWindowSystemUiVisibility()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean hasOverlappingRendering(android.view.View r0) {
                boolean r0 = r0.hasOverlappingRendering()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean hasTransientState(android.view.View r0) {
                boolean r0 = r0.hasTransientState()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean performAccessibilityAction(android.view.View r0, int r1, android.os.Bundle r2) {
                boolean r0 = r0.performAccessibilityAction(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void postInvalidateOnAnimation(android.view.View r0) {
                r0.postInvalidateOnAnimation()
                return
        }

        @androidx.annotation.DoNotInline
        public static void postInvalidateOnAnimation(android.view.View r0, int r1, int r2, int r3, int r4) {
                r0.postInvalidateOnAnimation(r1, r2, r3, r4)
                return
        }

        @androidx.annotation.DoNotInline
        public static void postOnAnimation(android.view.View r0, java.lang.Runnable r1) {
                r0.postOnAnimation(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void postOnAnimationDelayed(android.view.View r0, java.lang.Runnable r1, long r2) {
                r0.postOnAnimationDelayed(r1, r2)
                return
        }

        @androidx.annotation.DoNotInline
        public static void removeOnGlobalLayoutListener(android.view.ViewTreeObserver r0, android.view.ViewTreeObserver.OnGlobalLayoutListener r1) {
                r0.removeOnGlobalLayoutListener(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void requestFitSystemWindows(android.view.View r0) {
                r0.requestFitSystemWindows()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setBackground(android.view.View r0, android.graphics.drawable.Drawable r1) {
                r0.setBackground(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setHasTransientState(android.view.View r0, boolean r1) {
                r0.setHasTransientState(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setImportantForAccessibility(android.view.View r0, int r1) {
                r0.setImportantForAccessibility(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(17)
    public static class Api17Impl {
        private Api17Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static int generateViewId() {
                int r0 = android.view.View.generateViewId()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.Display getDisplay(@androidx.annotation.NonNull android.view.View r0) {
                android.view.Display r0 = r0.getDisplay()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getLabelFor(android.view.View r0) {
                int r0 = r0.getLabelFor()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getLayoutDirection(android.view.View r0) {
                int r0 = r0.getLayoutDirection()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getPaddingEnd(android.view.View r0) {
                int r0 = r0.getPaddingEnd()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getPaddingStart(android.view.View r0) {
                int r0 = r0.getPaddingStart()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isPaddingRelative(android.view.View r0) {
                boolean r0 = r0.isPaddingRelative()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setLabelFor(android.view.View r0, int r1) {
                r0.setLabelFor(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setLayerPaint(android.view.View r0, android.graphics.Paint r1) {
                r0.setLayerPaint(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setLayoutDirection(android.view.View r0, int r1) {
                r0.setLayoutDirection(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setPaddingRelative(android.view.View r0, int r1, int r2, int r3, int r4) {
                r0.setPaddingRelative(r1, r2, r3, r4)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(18)
    public static class Api18Impl {
        private Api18Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.graphics.Rect getClipBounds(@androidx.annotation.NonNull android.view.View r0) {
                android.graphics.Rect r0 = r0.getClipBounds()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isInLayout(@androidx.annotation.NonNull android.view.View r0) {
                boolean r0 = r0.isInLayout()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setClipBounds(@androidx.annotation.NonNull android.view.View r0, android.graphics.Rect r1) {
                r0.setClipBounds(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(19)
    public static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static int getAccessibilityLiveRegion(android.view.View r0) {
                int r0 = r0.getAccessibilityLiveRegion()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isAttachedToWindow(@androidx.annotation.NonNull android.view.View r0) {
                boolean r0 = r0.isAttachedToWindow()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isLaidOut(@androidx.annotation.NonNull android.view.View r0) {
                boolean r0 = r0.isLaidOut()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isLayoutDirectionResolved(@androidx.annotation.NonNull android.view.View r0) {
                boolean r0 = r0.isLayoutDirectionResolved()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void notifySubtreeAccessibilityStateChanged(android.view.ViewParent r0, android.view.View r1, android.view.View r2, int r3) {
                r0.notifySubtreeAccessibilityStateChanged(r1, r2, r3)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setAccessibilityLiveRegion(android.view.View r0, int r1) {
                r0.setAccessibilityLiveRegion(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setContentChangeTypes(android.view.accessibility.AccessibilityEvent r0, int r1) {
                r0.setContentChangeTypes(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(20)
    public static class Api20Impl {
        private Api20Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.view.WindowInsets dispatchApplyWindowInsets(android.view.View r0, android.view.WindowInsets r1) {
                android.view.WindowInsets r0 = r0.dispatchApplyWindowInsets(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.WindowInsets onApplyWindowInsets(android.view.View r0, android.view.WindowInsets r1) {
                android.view.WindowInsets r0 = r0.onApplyWindowInsets(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void requestApplyInsets(android.view.View r0) {
                r0.requestApplyInsets()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {


        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void callCompatInsetAnimationCallback(@androidx.annotation.NonNull android.view.WindowInsets r1, @androidx.annotation.NonNull android.view.View r2) {
                int r0 = androidx.core.R.id.tag_window_insets_animation_callback
                java.lang.Object r0 = r2.getTag(r0)
                android.view.View$OnApplyWindowInsetsListener r0 = (android.view.View.OnApplyWindowInsetsListener) r0
                if (r0 == 0) goto Ld
                r0.onApplyWindowInsets(r2, r1)
            Ld:
                return
        }

        @androidx.annotation.DoNotInline
        public static androidx.core.view.WindowInsetsCompat computeSystemWindowInsets(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r2, @androidx.annotation.NonNull android.graphics.Rect r3) {
                android.view.WindowInsets r0 = r2.toWindowInsets()
                if (r0 == 0) goto Lf
                android.view.WindowInsets r2 = r1.computeSystemWindowInsets(r0, r3)
                androidx.core.view.WindowInsetsCompat r1 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r2, r1)
                return r1
            Lf:
                r3.setEmpty()
                return r2
        }

        @androidx.annotation.DoNotInline
        public static boolean dispatchNestedFling(@androidx.annotation.NonNull android.view.View r0, float r1, float r2, boolean r3) {
                boolean r0 = r0.dispatchNestedFling(r1, r2, r3)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean dispatchNestedPreFling(@androidx.annotation.NonNull android.view.View r0, float r1, float r2) {
                boolean r0 = r0.dispatchNestedPreFling(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean dispatchNestedPreScroll(android.view.View r0, int r1, int r2, int[] r3, int[] r4) {
                boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean dispatchNestedScroll(android.view.View r0, int r1, int r2, int r3, int r4, int[] r5) {
                boolean r0 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.content.res.ColorStateList getBackgroundTintList(android.view.View r0) {
                android.content.res.ColorStateList r0 = r0.getBackgroundTintList()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.graphics.PorterDuff.Mode getBackgroundTintMode(android.view.View r0) {
                android.graphics.PorterDuff$Mode r0 = r0.getBackgroundTintMode()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static float getElevation(android.view.View r0) {
                float r0 = r0.getElevation()
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(@androidx.annotation.NonNull android.view.View r0) {
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.Api21ReflectionHolder.getRootWindowInsets(r0)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static java.lang.String getTransitionName(android.view.View r0) {
                java.lang.String r0 = r0.getTransitionName()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static float getTranslationZ(android.view.View r0) {
                float r0 = r0.getTranslationZ()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static float getZ(@androidx.annotation.NonNull android.view.View r0) {
                float r0 = r0.getZ()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean hasNestedScrollingParent(android.view.View r0) {
                boolean r0 = r0.hasNestedScrollingParent()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isImportantForAccessibility(android.view.View r0) {
                boolean r0 = r0.isImportantForAccessibility()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isNestedScrollingEnabled(android.view.View r0) {
                boolean r0 = r0.isNestedScrollingEnabled()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setBackgroundTintList(android.view.View r0, android.content.res.ColorStateList r1) {
                r0.setBackgroundTintList(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setBackgroundTintMode(android.view.View r0, android.graphics.PorterDuff.Mode r1) {
                r0.setBackgroundTintMode(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setElevation(android.view.View r0, float r1) {
                r0.setElevation(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setNestedScrollingEnabled(android.view.View r0, boolean r1) {
                r0.setNestedScrollingEnabled(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setOnApplyWindowInsetsListener(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable androidx.core.view.OnApplyWindowInsetsListener r3) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r0 >= r1) goto Lb
                int r0 = androidx.core.R.id.tag_on_apply_window_listener
                r2.setTag(r0, r3)
            Lb:
                if (r3 != 0) goto L19
                int r3 = androidx.core.R.id.tag_window_insets_animation_callback
                java.lang.Object r3 = r2.getTag(r3)
                android.view.View$OnApplyWindowInsetsListener r3 = (android.view.View.OnApplyWindowInsetsListener) r3
                r2.setOnApplyWindowInsetsListener(r3)
                return
            L19:
                androidx.core.view.ViewCompat$Api21Impl$1 r0 = new androidx.core.view.ViewCompat$Api21Impl$1
                r0.<init>(r2, r3)
                r2.setOnApplyWindowInsetsListener(r0)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setTransitionName(android.view.View r0, java.lang.String r1) {
                r0.setTransitionName(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setTranslationZ(android.view.View r0, float r1) {
                r0.setTranslationZ(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setZ(@androidx.annotation.NonNull android.view.View r0, float r1) {
                r0.setZ(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean startNestedScroll(android.view.View r0, int r1) {
                boolean r0 = r0.startNestedScroll(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void stopNestedScroll(android.view.View r0) {
                r0.stopNestedScroll()
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(@androidx.annotation.NonNull android.view.View r1) {
                android.view.WindowInsets r0 = r1.getRootWindowInsets()
                if (r0 != 0) goto L8
                r1 = 0
                return r1
            L8:
                androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r0)
                r0.setRootWindowInsets(r0)
                android.view.View r1 = r1.getRootView()
                r0.copyRootViewBounds(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getScrollIndicators(@androidx.annotation.NonNull android.view.View r0) {
                int r0 = r0.getScrollIndicators()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setScrollIndicators(@androidx.annotation.NonNull android.view.View r0, int r1) {
                r0.setScrollIndicators(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setScrollIndicators(@androidx.annotation.NonNull android.view.View r0, int r1, int r2) {
                r0.setScrollIndicators(r1, r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void cancelDragAndDrop(@androidx.annotation.NonNull android.view.View r0) {
                r0.cancelDragAndDrop()
                return
        }

        @androidx.annotation.DoNotInline
        public static void dispatchFinishTemporaryDetach(android.view.View r0) {
                r0.dispatchFinishTemporaryDetach()
                return
        }

        @androidx.annotation.DoNotInline
        public static void dispatchStartTemporaryDetach(android.view.View r0) {
                r0.dispatchStartTemporaryDetach()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setPointerIcon(@androidx.annotation.NonNull android.view.View r0, android.view.PointerIcon r1) {
                r0.setPointerIcon(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean startDragAndDrop(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.Nullable android.content.ClipData r1, @androidx.annotation.NonNull android.view.View.DragShadowBuilder r2, @androidx.annotation.Nullable java.lang.Object r3, int r4) {
                boolean r0 = r0.startDragAndDrop(r1, r2, r3, r4)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void updateDragShadow(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.NonNull android.view.View.DragShadowBuilder r1) {
                r0.updateDragShadow(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void addKeyboardNavigationClusters(@androidx.annotation.NonNull android.view.View r0, java.util.Collection<android.view.View> r1, int r2) {
                r0.addKeyboardNavigationClusters(r1, r2)
                return
        }

        @androidx.annotation.DoNotInline
        public static int getImportantForAutofill(android.view.View r0) {
                int r0 = r0.getImportantForAutofill()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getNextClusterForwardId(@androidx.annotation.NonNull android.view.View r0) {
                int r0 = r0.getNextClusterForwardId()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean hasExplicitFocusable(@androidx.annotation.NonNull android.view.View r0) {
                boolean r0 = r0.hasExplicitFocusable()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isFocusedByDefault(@androidx.annotation.NonNull android.view.View r0) {
                boolean r0 = r0.isFocusedByDefault()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isImportantForAutofill(android.view.View r0) {
                boolean r0 = r0.isImportantForAutofill()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isKeyboardNavigationCluster(@androidx.annotation.NonNull android.view.View r0) {
                boolean r0 = r0.isKeyboardNavigationCluster()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.view.View keyboardNavigationClusterSearch(@androidx.annotation.NonNull android.view.View r0, android.view.View r1, int r2) {
                android.view.View r0 = r0.keyboardNavigationClusterSearch(r1, r2)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean restoreDefaultFocus(@androidx.annotation.NonNull android.view.View r0) {
                boolean r0 = r0.restoreDefaultFocus()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setAutofillHints(@androidx.annotation.NonNull android.view.View r0, java.lang.String... r1) {
                r0.setAutofillHints(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setFocusedByDefault(@androidx.annotation.NonNull android.view.View r0, boolean r1) {
                r0.setFocusedByDefault(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setImportantForAutofill(android.view.View r0, int r1) {
                r0.setImportantForAutofill(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setKeyboardNavigationCluster(@androidx.annotation.NonNull android.view.View r0, boolean r1) {
                r0.setKeyboardNavigationCluster(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setNextClusterForwardId(android.view.View r0, int r1) {
                r0.setNextClusterForwardId(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setTooltipText(@androidx.annotation.NonNull android.view.View r0, java.lang.CharSequence r1) {
                r0.setTooltipText(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void addOnUnhandledKeyEventListener(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat r3) {
                int r0 = androidx.core.R.id.tag_unhandled_key_listeners
                java.lang.Object r1 = r2.getTag(r0)
                androidx.collection.SimpleArrayMap r1 = (androidx.collection.SimpleArrayMap) r1
                if (r1 != 0) goto L12
                androidx.collection.SimpleArrayMap r1 = new androidx.collection.SimpleArrayMap
                r1.<init>()
                r2.setTag(r0, r1)
            L12:
                java.util.Objects.requireNonNull(r3)
                androidx.core.view.ViewCompat$Api28Impl$$ExternalSyntheticLambda0 r0 = new androidx.core.view.ViewCompat$Api28Impl$$ExternalSyntheticLambda0
                r0.<init>(r3)
                r1.put(r3, r0)
                r2.addOnUnhandledKeyEventListener(r0)
                return
        }

        @androidx.annotation.DoNotInline
        public static java.lang.CharSequence getAccessibilityPaneTitle(android.view.View r0) {
                java.lang.CharSequence r0 = r0.getAccessibilityPaneTitle()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isAccessibilityHeading(android.view.View r0) {
                boolean r0 = r0.isAccessibilityHeading()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isScreenReaderFocusable(android.view.View r0) {
                boolean r0 = r0.isScreenReaderFocusable()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void removeOnUnhandledKeyEventListener(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat r2) {
                int r0 = androidx.core.R.id.tag_unhandled_key_listeners
                java.lang.Object r0 = r1.getTag(r0)
                androidx.collection.SimpleArrayMap r0 = (androidx.collection.SimpleArrayMap) r0
                if (r0 != 0) goto Lb
                return
            Lb:
                java.lang.Object r2 = r0.get(r2)
                android.view.View$OnUnhandledKeyEventListener r2 = (android.view.View.OnUnhandledKeyEventListener) r2
                if (r2 == 0) goto L16
                r1.removeOnUnhandledKeyEventListener(r2)
            L16:
                return
        }

        @androidx.annotation.DoNotInline
        public static <T> T requireViewById(android.view.View r0, int r1) {
                android.view.View r0 = r0.requireViewById(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setAccessibilityHeading(android.view.View r0, boolean r1) {
                r0.setAccessibilityHeading(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setAccessibilityPaneTitle(android.view.View r0, java.lang.CharSequence r1) {
                r0.setAccessibilityPaneTitle(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setScreenReaderFocusable(android.view.View r0, boolean r1) {
                r0.setScreenReaderFocusable(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.view.View.AccessibilityDelegate getAccessibilityDelegate(android.view.View r0) {
                android.view.View$AccessibilityDelegate r0 = r0.getAccessibilityDelegate()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static java.util.List<android.graphics.Rect> getSystemGestureExclusionRects(android.view.View r0) {
                java.util.List r0 = r0.getSystemGestureExclusionRects()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void saveAttributeDataForStyleable(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull int[] r2, @androidx.annotation.Nullable android.util.AttributeSet r3, @androidx.annotation.NonNull android.content.res.TypedArray r4, int r5, int r6) {
                r0.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setSystemGestureExclusionRects(android.view.View r0, java.util.List<android.graphics.Rect> r1) {
                r0.setSystemGestureExclusionRects(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(30)
    public static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static java.lang.CharSequence getStateDescription(android.view.View r0) {
                java.lang.CharSequence r0 = r0.getStateDescription()
                return r0
        }

        @androidx.annotation.Nullable
        public static androidx.core.view.WindowInsetsControllerCompat getWindowInsetsController(@androidx.annotation.NonNull android.view.View r0) {
                android.view.WindowInsetsController r0 = r0.getWindowInsetsController()
                if (r0 == 0) goto Lb
                androidx.core.view.WindowInsetsControllerCompat r0 = androidx.core.view.WindowInsetsControllerCompat.toWindowInsetsControllerCompat(r0)
                goto Lc
            Lb:
                r0 = 0
            Lc:
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setStateDescription(android.view.View r0, java.lang.CharSequence r1) {
                r0.setStateDescription(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(31)
    public static final class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        public static java.lang.String[] getReceiveContentMimeTypes(@androidx.annotation.NonNull android.view.View r0) {
                java.lang.String[] r0 = r0.getReceiveContentMimeTypes()
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        public static androidx.core.view.ContentInfoCompat performReceiveContent(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull androidx.core.view.ContentInfoCompat r2) {
                android.view.ContentInfo r0 = r2.toContentInfo()
                android.view.ContentInfo r1 = r1.performReceiveContent(r0)
                if (r1 != 0) goto Lc
                r1 = 0
                return r1
            Lc:
                if (r1 != r0) goto Lf
                return r2
            Lf:
                androidx.core.view.ContentInfoCompat r1 = androidx.core.view.ContentInfoCompat.toContentInfoCompat(r1)
                return r1
        }

        @androidx.annotation.DoNotInline
        public static void setOnReceiveContentListener(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.String[] r2, @androidx.annotation.Nullable androidx.core.view.OnReceiveContentListener r3) {
                if (r3 != 0) goto L7
                r3 = 0
                r1.setOnReceiveContentListener(r2, r3)
                goto Lf
            L7:
                androidx.core.view.ViewCompat$OnReceiveContentListenerAdapter r0 = new androidx.core.view.ViewCompat$OnReceiveContentListenerAdapter
                r0.<init>(r3)
                r1.setOnReceiveContentListener(r2, r0)
            Lf:
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface FocusDirection {
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface FocusRealDirection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface FocusRelativeDirection {
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface NestedScrollType {
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(31)
    public static final class OnReceiveContentListenerAdapter implements android.view.OnReceiveContentListener {

        @androidx.annotation.NonNull
        private final androidx.core.view.OnReceiveContentListener mJetpackListener;

        public OnReceiveContentListenerAdapter(@androidx.annotation.NonNull androidx.core.view.OnReceiveContentListener r1) {
                r0 = this;
                r0.<init>()
                r0.mJetpackListener = r1
                return
        }

        @Override // android.view.OnReceiveContentListener
        @androidx.annotation.Nullable
        public android.view.ContentInfo onReceiveContent(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull android.view.ContentInfo r4) {
                r2 = this;
                androidx.core.view.ContentInfoCompat r0 = androidx.core.view.ContentInfoCompat.toContentInfoCompat(r4)
                androidx.core.view.OnReceiveContentListener r1 = r2.mJetpackListener
                androidx.core.view.ContentInfoCompat r3 = r1.onReceiveContent(r3, r0)
                if (r3 != 0) goto Le
                r3 = 0
                return r3
            Le:
                if (r3 != r0) goto L11
                return r4
            L11:
                android.view.ContentInfo r3 = r3.toContentInfo()
                return r3
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface OnUnhandledKeyEventListenerCompat {
        boolean onUnhandledKeyEvent(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull android.view.KeyEvent r2);
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ScrollAxis {
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ScrollIndicators {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class UnhandledKeyEventManager {
        public static final /* synthetic */ int $r8$clinit = 0;
        private static final java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> sViewsWithListeners = null;
        private android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> mCapturedKeys;
        private java.lang.ref.WeakReference<android.view.KeyEvent> mLastDispatchedPreViewKeyEvent;

        @androidx.annotation.Nullable
        private java.util.WeakHashMap<android.view.View, java.lang.Boolean> mViewsContainingListeners;

        static {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners = r0
                return
        }

        public UnhandledKeyEventManager() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mViewsContainingListeners = r0
                r1.mCapturedKeys = r0
                r1.mLastDispatchedPreViewKeyEvent = r0
                return
        }

        @androidx.annotation.Nullable
        private android.view.View dispatchInOrder(android.view.View r5, android.view.KeyEvent r6) {
                r4 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r4.mViewsContainingListeners
                r1 = 0
                if (r0 == 0) goto L30
                boolean r0 = r0.containsKey(r5)
                if (r0 != 0) goto Lc
                goto L30
            Lc:
                boolean r0 = r5 instanceof android.view.ViewGroup
                if (r0 == 0) goto L29
                r0 = r5
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                int r2 = r0.getChildCount()
                int r2 = r2 + (-1)
            L19:
                if (r2 < 0) goto L29
                android.view.View r3 = r0.getChildAt(r2)
                android.view.View r3 = r4.dispatchInOrder(r3, r6)
                if (r3 == 0) goto L26
                return r3
            L26:
                int r2 = r2 + (-1)
                goto L19
            L29:
                boolean r6 = r4.onUnhandledKeyEvent(r5, r6)
                if (r6 == 0) goto L30
                return r5
            L30:
                return r1
        }

        private android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> getCapturedKeys() {
                r1 = this;
                android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r0 = r1.mCapturedKeys
                if (r0 != 0) goto Lb
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.mCapturedKeys = r0
            Lb:
                android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> r0 = r1.mCapturedKeys
                return r0
        }

        private boolean onUnhandledKeyEvent(@androidx.annotation.NonNull android.view.View r5, @androidx.annotation.NonNull android.view.KeyEvent r6) {
                r4 = this;
                int r0 = androidx.core.R.id.tag_unhandled_key_listeners
                java.lang.Object r0 = r5.getTag(r0)
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                if (r0 == 0) goto L22
                int r1 = r0.size()
                r2 = 1
                int r1 = r1 - r2
            L10:
                if (r1 < 0) goto L22
                java.lang.Object r3 = r0.get(r1)
                androidx.core.view.ViewCompat$OnUnhandledKeyEventListenerCompat r3 = (androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat) r3
                boolean r3 = r3.onUnhandledKeyEvent(r5, r6)
                if (r3 == 0) goto L1f
                return r2
            L1f:
                int r1 = r1 + (-1)
                goto L10
            L22:
                r5 = 0
                return r5
        }

        private void recalcViewsWithUnhandled() {
                r6 = this;
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r0 = r6.mViewsContainingListeners
                if (r0 == 0) goto L7
                r0.clear()
            L7:
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r0 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L10
                return
            L10:
                monitor-enter(r0)
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r1 = r6.mViewsContainingListeners     // Catch: java.lang.Throwable -> L5b
                if (r1 != 0) goto L1c
                java.util.WeakHashMap r1 = new java.util.WeakHashMap     // Catch: java.lang.Throwable -> L5b
                r1.<init>()     // Catch: java.lang.Throwable -> L5b
                r6.mViewsContainingListeners = r1     // Catch: java.lang.Throwable -> L5b
            L1c:
                int r1 = r0.size()     // Catch: java.lang.Throwable -> L5b
                int r1 = r1 + (-1)
            L22:
                if (r1 < 0) goto L59
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r2 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r3 = r2.get(r1)     // Catch: java.lang.Throwable -> L5b
                java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L5b
                java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L5b
                android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> L5b
                if (r3 != 0) goto L38
                r2.remove(r1)     // Catch: java.lang.Throwable -> L5b
                goto L56
            L38:
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r2 = r6.mViewsContainingListeners     // Catch: java.lang.Throwable -> L5b
                java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L5b
                r2.put(r3, r4)     // Catch: java.lang.Throwable -> L5b
                android.view.ViewParent r2 = r3.getParent()     // Catch: java.lang.Throwable -> L5b
            L43:
                boolean r3 = r2 instanceof android.view.View     // Catch: java.lang.Throwable -> L5b
                if (r3 == 0) goto L56
                java.util.WeakHashMap<android.view.View, java.lang.Boolean> r3 = r6.mViewsContainingListeners     // Catch: java.lang.Throwable -> L5b
                r4 = r2
                android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Throwable -> L5b
                java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L5b
                r3.put(r4, r5)     // Catch: java.lang.Throwable -> L5b
                android.view.ViewParent r2 = r2.getParent()     // Catch: java.lang.Throwable -> L5b
                goto L43
            L56:
                int r1 = r1 + (-1)
                goto L22
            L59:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
                return
            L5b:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
                throw r1
        }

        public static void registerListeningView(android.view.View r3) {
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r0 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners
                monitor-enter(r0)
                java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L27
            L7:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L27
                if (r2 == 0) goto L1b
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L27
                java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L27
                java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L27
                if (r2 != r3) goto L7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
                return
            L1b:
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r1 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners     // Catch: java.lang.Throwable -> L27
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L27
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L27
                r1.add(r2)     // Catch: java.lang.Throwable -> L27
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
                return
            L27:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
                throw r3
        }

        public static void unregisterListeningView(android.view.View r4) {
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r0 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners
                monitor-enter(r0)
                r1 = 0
            L4:
                java.util.ArrayList<java.lang.ref.WeakReference<android.view.View>> r2 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.sViewsWithListeners     // Catch: java.lang.Throwable -> L22
                int r3 = r2.size()     // Catch: java.lang.Throwable -> L22
                if (r1 >= r3) goto L20
                java.lang.Object r3 = r2.get(r1)     // Catch: java.lang.Throwable -> L22
                java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L22
                java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L22
                if (r3 != r4) goto L1d
                r2.remove(r1)     // Catch: java.lang.Throwable -> L22
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
                return
            L1d:
                int r1 = r1 + 1
                goto L4
            L20:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
                return
            L22:
                r4 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
                throw r4
        }

        public final boolean dispatch(android.view.View r3, android.view.KeyEvent r4) {
                r2 = this;
                int r0 = r4.getAction()
                if (r0 != 0) goto L9
                r2.recalcViewsWithUnhandled()
            L9:
                android.view.View r3 = r2.dispatchInOrder(r3, r4)
                int r0 = r4.getAction()
                if (r0 != 0) goto L2b
                int r4 = r4.getKeyCode()
                if (r3 == 0) goto L2b
                boolean r0 = android.view.KeyEvent.isModifierKey(r4)
                if (r0 != 0) goto L2b
                android.util.SparseArray r0 = r2.getCapturedKeys()
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r3)
                r0.put(r4, r1)
            L2b:
                if (r3 == 0) goto L2f
                r3 = 1
                goto L30
            L2f:
                r3 = 0
            L30:
                return r3
        }

        public final boolean preDispatch(android.view.KeyEvent r6) {
                r5 = this;
                java.lang.ref.WeakReference<android.view.KeyEvent> r0 = r5.mLastDispatchedPreViewKeyEvent
                r1 = 0
                if (r0 == 0) goto Lc
                java.lang.Object r0 = r0.get()
                if (r0 != r6) goto Lc
                return r1
            Lc:
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r6)
                r5.mLastDispatchedPreViewKeyEvent = r0
                r0 = 0
                android.util.SparseArray r2 = r5.getCapturedKeys()
                int r3 = r6.getAction()
                r4 = 1
                if (r3 != r4) goto L32
                int r3 = r6.getKeyCode()
                int r3 = r2.indexOfKey(r3)
                if (r3 < 0) goto L32
                java.lang.Object r0 = r2.valueAt(r3)
                java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
                r2.removeAt(r3)
            L32:
                if (r0 != 0) goto L3e
                int r0 = r6.getKeyCode()
                java.lang.Object r0 = r2.get(r0)
                java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            L3e:
                if (r0 == 0) goto L52
                java.lang.Object r0 = r0.get()
                android.view.View r0 = (android.view.View) r0
                if (r0 == 0) goto L51
                boolean r1 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
                if (r1 == 0) goto L51
                r5.onUnhandledKeyEvent(r0, r6)
            L51:
                return r4
            L52:
                return r1
        }
    }

    public static /* synthetic */ androidx.core.view.ContentInfoCompat $r8$lambda$wxf3s7r4ODqhaNnVVlzx9IRcwjg(androidx.core.view.ContentInfoCompat r0) {
            androidx.core.view.ContentInfoCompat r0 = lambda$static$0(r0)
            return r0
    }

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 1
            r0.<init>(r1)
            androidx.core.view.ViewCompat.sNextGeneratedId = r0
            r0 = 0
            androidx.core.view.ViewCompat.sViewPropertyAnimatorMap = r0
            r0 = 0
            androidx.core.view.ViewCompat.sAccessibilityDelegateCheckFailed = r0
            r2 = 32
            int[] r2 = new int[r2]
            int r3 = androidx.core.R.id.accessibility_custom_action_0
            r2[r0] = r3
            int r0 = androidx.core.R.id.accessibility_custom_action_1
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_2
            r1 = 2
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_3
            r1 = 3
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_4
            r1 = 4
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_5
            r1 = 5
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_6
            r1 = 6
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_7
            r1 = 7
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_8
            r1 = 8
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_9
            r1 = 9
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_10
            r1 = 10
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_11
            r1 = 11
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_12
            r1 = 12
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_13
            r1 = 13
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_14
            r1 = 14
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_15
            r1 = 15
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_16
            r1 = 16
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_17
            r1 = 17
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_18
            r1 = 18
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_19
            r1 = 19
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_20
            r1 = 20
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_21
            r1 = 21
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_22
            r1 = 22
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_23
            r1 = 23
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_24
            r1 = 24
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_25
            r1 = 25
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_26
            r1 = 26
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_27
            r1 = 27
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_28
            r1 = 28
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_29
            r1 = 29
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_30
            r1 = 30
            r2[r1] = r0
            int r0 = androidx.core.R.id.accessibility_custom_action_31
            r1 = 31
            r2[r1] = r0
            androidx.core.view.ViewCompat.ACCESSIBILITY_ACTIONS_RESOURCE_IDS = r2
            androidx.core.view.ViewCompat$$ExternalSyntheticLambda0 r0 = androidx.core.view.ViewCompat$$ExternalSyntheticLambda0.INSTANCE
            androidx.core.view.ViewCompat.NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR = r0
            androidx.core.view.ViewCompat$AccessibilityPaneVisibilityManager r0 = new androidx.core.view.ViewCompat$AccessibilityPaneVisibilityManager
            r0.<init>()
            androidx.core.view.ViewCompat.sAccessibilityPaneVisibilityManager = r0
            return
    }

    @java.lang.Deprecated
    public ViewCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.Boolean> accessibilityHeadingProperty() {
            androidx.core.view.ViewCompat$4 r0 = new androidx.core.view.ViewCompat$4
            int r1 = androidx.core.R.id.tag_accessibility_heading
            r0.<init>(r1)
            return r0
    }

    public static int addAccessibilityAction(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull java.lang.CharSequence r3, @androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityViewCommand r4) {
            int r0 = getAvailableActionIdFromResources(r2, r3)
            r1 = -1
            if (r0 == r1) goto Lf
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat
            r1.<init>(r0, r3, r4)
            addAccessibilityAction(r2, r1)
        Lf:
            return r0
    }

    private static void addAccessibilityAction(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat r2) {
            ensureAccessibilityDelegateCompat(r1)
            int r0 = r2.getId()
            removeActionWithId(r0, r1)
            java.util.List r0 = getActionList(r1)
            r0.add(r2)
            r2 = 0
            notifyViewAccessibilityStateChangedIfNeeded(r1, r2)
            return
    }

    public static void addKeyboardNavigationClusters(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull java.util.Collection<android.view.View> r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api26Impl.addKeyboardNavigationClusters(r2, r3, r4)
        L9:
            return
    }

    public static void addOnUnhandledKeyEventListener(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            androidx.core.view.ViewCompat.Api28Impl.addOnUnhandledKeyEventListener(r2, r3)
            return
        La:
            int r0 = androidx.core.R.id.tag_unhandled_key_listeners
            java.lang.Object r1 = r2.getTag(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 != 0) goto L1c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.setTag(r0, r1)
        L1c:
            r1.add(r3)
            int r3 = r1.size()
            r0 = 1
            if (r3 != r0) goto L29
            androidx.core.view.ViewCompat.UnhandledKeyEventManager.registerListeningView(r2)
        L29:
            return
    }

    @androidx.annotation.NonNull
    public static androidx.core.view.ViewPropertyAnimatorCompat animate(@androidx.annotation.NonNull android.view.View r2) {
            java.util.WeakHashMap<android.view.View, androidx.core.view.ViewPropertyAnimatorCompat> r0 = androidx.core.view.ViewCompat.sViewPropertyAnimatorMap
            if (r0 != 0) goto Lb
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            androidx.core.view.ViewCompat.sViewPropertyAnimatorMap = r0
        Lb:
            java.util.WeakHashMap<android.view.View, androidx.core.view.ViewPropertyAnimatorCompat> r0 = androidx.core.view.ViewCompat.sViewPropertyAnimatorMap
            java.lang.Object r0 = r0.get(r2)
            androidx.core.view.ViewPropertyAnimatorCompat r0 = (androidx.core.view.ViewPropertyAnimatorCompat) r0
            if (r0 != 0) goto L1f
            androidx.core.view.ViewPropertyAnimatorCompat r0 = new androidx.core.view.ViewPropertyAnimatorCompat
            r0.<init>(r2)
            java.util.WeakHashMap<android.view.View, androidx.core.view.ViewPropertyAnimatorCompat> r1 = androidx.core.view.ViewCompat.sViewPropertyAnimatorMap
            r1.put(r2, r0)
        L1f:
            return r0
    }

    private static void bindTempDetach() {
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r1 = "dispatchStartTemporaryDetach"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1a
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.NoSuchMethodException -> L1a
            androidx.core.view.ViewCompat.sDispatchStartTemporaryDetach = r0     // Catch: java.lang.NoSuchMethodException -> L1a
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r1 = "dispatchFinishTemporaryDetach"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1a
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1a
            androidx.core.view.ViewCompat.sDispatchFinishTemporaryDetach = r0     // Catch: java.lang.NoSuchMethodException -> L1a
            goto L22
        L1a:
            r0 = move-exception
            java.lang.String r1 = "ViewCompat"
            java.lang.String r2 = "Couldn't find method"
            android.util.Log.e(r1, r2, r0)
        L22:
            r0 = 1
            androidx.core.view.ViewCompat.sTempDetachBound = r0
            return
    }

    @java.lang.Deprecated
    public static boolean canScrollHorizontally(android.view.View r0, int r1) {
            boolean r0 = r0.canScrollHorizontally(r1)
            return r0
    }

    @java.lang.Deprecated
    public static boolean canScrollVertically(android.view.View r0, int r1) {
            boolean r0 = r0.canScrollVertically(r1)
            return r0
    }

    public static void cancelDragAndDrop(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api24Impl.cancelDragAndDrop(r2)
        L9:
            return
    }

    @java.lang.Deprecated
    public static int combineMeasuredStates(int r0, int r1) {
            int r0 = android.view.View.combineMeasuredStates(r0, r1)
            return r0
    }

    private static void compatOffsetLeftAndRight(android.view.View r0, int r1) {
            r0.offsetLeftAndRight(r1)
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L19
            tickleInvalidationFlag(r0)
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L19
            android.view.View r0 = (android.view.View) r0
            tickleInvalidationFlag(r0)
        L19:
            return
    }

    private static void compatOffsetTopAndBottom(android.view.View r0, int r1) {
            r0.offsetTopAndBottom(r1)
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L19
            tickleInvalidationFlag(r0)
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L19
            android.view.View r0 = (android.view.View) r0
            tickleInvalidationFlag(r0)
        L19:
            return
    }

    @androidx.annotation.NonNull
    public static androidx.core.view.WindowInsetsCompat computeSystemWindowInsets(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r1, @androidx.annotation.NonNull android.graphics.Rect r2) {
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.ViewCompat.Api21Impl.computeSystemWindowInsets(r0, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.core.view.WindowInsetsCompat dispatchApplyWindowInsets(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r3) {
            android.view.WindowInsets r0 = r3.toWindowInsets()
            if (r0 == 0) goto L15
            android.view.WindowInsets r1 = androidx.core.view.ViewCompat.Api20Impl.dispatchApplyWindowInsets(r2, r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            androidx.core.view.WindowInsetsCompat r2 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r1, r2)
            return r2
        L15:
            return r3
    }

    public static void dispatchFinishTemporaryDetach(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto La
            androidx.core.view.ViewCompat.Api24Impl.dispatchFinishTemporaryDetach(r2)
            goto L28
        La:
            boolean r0 = androidx.core.view.ViewCompat.sTempDetachBound
            if (r0 != 0) goto L11
            bindTempDetach()
        L11:
            java.lang.reflect.Method r0 = androidx.core.view.ViewCompat.sDispatchFinishTemporaryDetach
            if (r0 == 0) goto L25
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L1c
            r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L1c
            goto L28
        L1c:
            r2 = move-exception
            java.lang.String r0 = "ViewCompat"
            java.lang.String r1 = "Error calling dispatchFinishTemporaryDetach"
            android.util.Log.d(r0, r1, r2)
            goto L28
        L25:
            r2.onFinishTemporaryDetach()
        L28:
            return
    }

    public static boolean dispatchNestedFling(@androidx.annotation.NonNull android.view.View r0, float r1, float r2, boolean r3) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.dispatchNestedFling(r0, r1, r2, r3)
            return r0
    }

    public static boolean dispatchNestedPreFling(@androidx.annotation.NonNull android.view.View r0, float r1, float r2) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.dispatchNestedPreFling(r0, r1, r2)
            return r0
    }

    public static boolean dispatchNestedPreScroll(@androidx.annotation.NonNull android.view.View r0, int r1, int r2, @androidx.annotation.Nullable int[] r3, @androidx.annotation.Nullable int[] r4) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.dispatchNestedPreScroll(r0, r1, r2, r3, r4)
            return r0
    }

    public static boolean dispatchNestedPreScroll(@androidx.annotation.NonNull android.view.View r7, int r8, int r9, @androidx.annotation.Nullable int[] r10, @androidx.annotation.Nullable int[] r11, int r12) {
            boolean r0 = r7 instanceof androidx.core.view.NestedScrollingChild2
            if (r0 == 0) goto L11
            r1 = r7
            androidx.core.view.NestedScrollingChild2 r1 = (androidx.core.view.NestedScrollingChild2) r1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            boolean r7 = r1.dispatchNestedPreScroll(r2, r3, r4, r5, r6)
            return r7
        L11:
            if (r12 != 0) goto L18
            boolean r7 = dispatchNestedPreScroll(r7, r8, r9, r10, r11)
            return r7
        L18:
            r7 = 0
            return r7
    }

    public static void dispatchNestedScroll(@androidx.annotation.NonNull android.view.View r10, int r11, int r12, int r13, int r14, @androidx.annotation.Nullable int[] r15, int r16, @androidx.annotation.NonNull int[] r17) {
            r0 = r10
            boolean r1 = r0 instanceof androidx.core.view.NestedScrollingChild3
            if (r1 == 0) goto L15
            r2 = r0
            androidx.core.view.NestedScrollingChild3 r2 = (androidx.core.view.NestedScrollingChild3) r2
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r2.dispatchNestedScroll(r3, r4, r5, r6, r7, r8, r9)
            goto L18
        L15:
            dispatchNestedScroll(r10, r11, r12, r13, r14, r15, r16)
        L18:
            return
    }

    public static boolean dispatchNestedScroll(@androidx.annotation.NonNull android.view.View r0, int r1, int r2, int r3, int r4, @androidx.annotation.Nullable int[] r5) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.dispatchNestedScroll(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static boolean dispatchNestedScroll(@androidx.annotation.NonNull android.view.View r8, int r9, int r10, int r11, int r12, @androidx.annotation.Nullable int[] r13, int r14) {
            boolean r0 = r8 instanceof androidx.core.view.NestedScrollingChild2
            if (r0 == 0) goto L12
            r1 = r8
            androidx.core.view.NestedScrollingChild2 r1 = (androidx.core.view.NestedScrollingChild2) r1
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            boolean r8 = r1.dispatchNestedScroll(r2, r3, r4, r5, r6, r7)
            return r8
        L12:
            if (r14 != 0) goto L19
            boolean r8 = dispatchNestedScroll(r8, r9, r10, r11, r12, r13)
            return r8
        L19:
            r8 = 0
            return r8
    }

    public static void dispatchStartTemporaryDetach(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto La
            androidx.core.view.ViewCompat.Api24Impl.dispatchStartTemporaryDetach(r2)
            goto L28
        La:
            boolean r0 = androidx.core.view.ViewCompat.sTempDetachBound
            if (r0 != 0) goto L11
            bindTempDetach()
        L11:
            java.lang.reflect.Method r0 = androidx.core.view.ViewCompat.sDispatchStartTemporaryDetach
            if (r0 == 0) goto L25
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L1c
            r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L1c
            goto L28
        L1c:
            r2 = move-exception
            java.lang.String r0 = "ViewCompat"
            java.lang.String r1 = "Error calling dispatchStartTemporaryDetach"
            android.util.Log.d(r0, r1, r2)
            goto L28
        L25:
            r2.onStartTemporaryDetach()
        L28:
            return
    }

    @androidx.annotation.UiThread
    public static boolean dispatchUnhandledKeyEventBeforeCallback(android.view.View r2, android.view.KeyEvent r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r2 = 0
            return r2
        L8:
            int r0 = androidx.core.view.ViewCompat.UnhandledKeyEventManager.$r8$clinit
            int r0 = androidx.core.R.id.tag_unhandled_key_event_manager
            java.lang.Object r1 = r2.getTag(r0)
            androidx.core.view.ViewCompat$UnhandledKeyEventManager r1 = (androidx.core.view.ViewCompat.UnhandledKeyEventManager) r1
            if (r1 != 0) goto L1c
            androidx.core.view.ViewCompat$UnhandledKeyEventManager r1 = new androidx.core.view.ViewCompat$UnhandledKeyEventManager
            r1.<init>()
            r2.setTag(r0, r1)
        L1c:
            boolean r2 = r1.dispatch(r2, r3)
            return r2
    }

    public static void enableAccessibleClickableSpanSupport(@androidx.annotation.NonNull android.view.View r0) {
            ensureAccessibilityDelegateCompat(r0)
            return
    }

    public static void ensureAccessibilityDelegateCompat(@androidx.annotation.NonNull android.view.View r1) {
            androidx.core.view.AccessibilityDelegateCompat r0 = getAccessibilityDelegate(r1)
            if (r0 != 0) goto Lb
            androidx.core.view.AccessibilityDelegateCompat r0 = new androidx.core.view.AccessibilityDelegateCompat
            r0.<init>()
        Lb:
            setAccessibilityDelegate(r1, r0)
            return
    }

    public static int generateViewId() {
            int r0 = androidx.core.view.ViewCompat.Api17Impl.generateViewId()
            return r0
    }

    @androidx.annotation.Nullable
    public static androidx.core.view.AccessibilityDelegateCompat getAccessibilityDelegate(@androidx.annotation.NonNull android.view.View r1) {
            android.view.View$AccessibilityDelegate r1 = getAccessibilityDelegateInternal(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            boolean r0 = r1 instanceof androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter
            if (r0 == 0) goto L11
            androidx.core.view.AccessibilityDelegateCompat$AccessibilityDelegateAdapter r1 = (androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter) r1
            androidx.core.view.AccessibilityDelegateCompat r1 = r1.mCompat
            return r1
        L11:
            androidx.core.view.AccessibilityDelegateCompat r0 = new androidx.core.view.AccessibilityDelegateCompat
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.Nullable
    private static android.view.View.AccessibilityDelegate getAccessibilityDelegateInternal(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            android.view.View$AccessibilityDelegate r2 = androidx.core.view.ViewCompat.Api29Impl.getAccessibilityDelegate(r2)
            return r2
        Lb:
            android.view.View$AccessibilityDelegate r2 = getAccessibilityDelegateThroughReflection(r2)
            return r2
    }

    @androidx.annotation.Nullable
    private static android.view.View.AccessibilityDelegate getAccessibilityDelegateThroughReflection(@androidx.annotation.NonNull android.view.View r4) {
            boolean r0 = androidx.core.view.ViewCompat.sAccessibilityDelegateCheckFailed
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.reflect.Field r0 = androidx.core.view.ViewCompat.sAccessibilityDelegateField
            r2 = 1
            if (r0 != 0) goto L1c
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r3 = "mAccessibilityDelegate"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L19
            androidx.core.view.ViewCompat.sAccessibilityDelegateField = r0     // Catch: java.lang.Throwable -> L19
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L19
            goto L1c
        L19:
            androidx.core.view.ViewCompat.sAccessibilityDelegateCheckFailed = r2
            return r1
        L1c:
            java.lang.reflect.Field r0 = androidx.core.view.ViewCompat.sAccessibilityDelegateField     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.Throwable -> L2a
            boolean r0 = r4 instanceof android.view.View.AccessibilityDelegate     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L29
            android.view.View$AccessibilityDelegate r4 = (android.view.View.AccessibilityDelegate) r4     // Catch: java.lang.Throwable -> L2a
            return r4
        L29:
            return r1
        L2a:
            androidx.core.view.ViewCompat.sAccessibilityDelegateCheckFailed = r2
            return r1
    }

    public static int getAccessibilityLiveRegion(@androidx.annotation.NonNull android.view.View r0) {
            int r0 = androidx.core.view.ViewCompat.Api19Impl.getAccessibilityLiveRegion(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public static androidx.core.view.accessibility.AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@androidx.annotation.NonNull android.view.View r1) {
            android.view.accessibility.AccessibilityNodeProvider r1 = androidx.core.view.ViewCompat.Api16Impl.getAccessibilityNodeProvider(r1)
            if (r1 == 0) goto Lc
            androidx.core.view.accessibility.AccessibilityNodeProviderCompat r0 = new androidx.core.view.accessibility.AccessibilityNodeProviderCompat
            r0.<init>(r1)
            return r0
        Lc:
            r1 = 0
            return r1
    }

    @androidx.annotation.Nullable
    @androidx.annotation.UiThread
    public static java.lang.CharSequence getAccessibilityPaneTitle(@androidx.annotation.NonNull android.view.View r1) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = paneTitleProperty()
            java.lang.Object r1 = r0.get(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            return r1
    }

    private static java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> getActionList(android.view.View r2) {
            int r0 = androidx.core.R.id.tag_accessibility_actions
            java.lang.Object r1 = r2.getTag(r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r1 != 0) goto L12
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.setTag(r0, r1)
        L12:
            return r1
    }

    @java.lang.Deprecated
    public static float getAlpha(android.view.View r0) {
            float r0 = r0.getAlpha()
            return r0
    }

    private static int getAvailableActionIdFromResources(android.view.View r8, @androidx.annotation.NonNull java.lang.CharSequence r9) {
            java.util.List r8 = getActionList(r8)
            r0 = 0
            r1 = 0
        L6:
            int r2 = r8.size()
            if (r1 >= r2) goto L2a
            java.lang.Object r2 = r8.get(r1)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r2
            java.lang.CharSequence r2 = r2.getLabel()
            boolean r2 = android.text.TextUtils.equals(r9, r2)
            if (r2 == 0) goto L27
            java.lang.Object r8 = r8.get(r1)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r8 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r8
            int r8 = r8.getId()
            return r8
        L27:
            int r1 = r1 + 1
            goto L6
        L2a:
            r9 = -1
            r1 = 0
            r2 = -1
        L2d:
            int[] r3 = androidx.core.view.ViewCompat.ACCESSIBILITY_ACTIONS_RESOURCE_IDS
            int r4 = r3.length
            if (r1 >= r4) goto L58
            if (r2 != r9) goto L58
            r3 = r3[r1]
            r4 = 1
            r5 = 0
            r6 = 1
        L39:
            int r7 = r8.size()
            if (r5 >= r7) goto L52
            java.lang.Object r7 = r8.get(r5)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r7 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r7
            int r7 = r7.getId()
            if (r7 == r3) goto L4d
            r7 = 1
            goto L4e
        L4d:
            r7 = 0
        L4e:
            r6 = r6 & r7
            int r5 = r5 + 1
            goto L39
        L52:
            if (r6 == 0) goto L55
            r2 = r3
        L55:
            int r1 = r1 + 1
            goto L2d
        L58:
            return r2
    }

    @androidx.annotation.Nullable
    public static android.content.res.ColorStateList getBackgroundTintList(@androidx.annotation.NonNull android.view.View r0) {
            android.content.res.ColorStateList r0 = androidx.core.view.ViewCompat.Api21Impl.getBackgroundTintList(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.graphics.PorterDuff.Mode getBackgroundTintMode(@androidx.annotation.NonNull android.view.View r0) {
            android.graphics.PorterDuff$Mode r0 = androidx.core.view.ViewCompat.Api21Impl.getBackgroundTintMode(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.graphics.Rect getClipBounds(@androidx.annotation.NonNull android.view.View r0) {
            android.graphics.Rect r0 = androidx.core.view.ViewCompat.Api18Impl.getClipBounds(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.view.Display getDisplay(@androidx.annotation.NonNull android.view.View r0) {
            android.view.Display r0 = androidx.core.view.ViewCompat.Api17Impl.getDisplay(r0)
            return r0
    }

    public static float getElevation(@androidx.annotation.NonNull android.view.View r0) {
            float r0 = androidx.core.view.ViewCompat.Api21Impl.getElevation(r0)
            return r0
    }

    private static android.graphics.Rect getEmptyTempRect() {
            java.lang.ThreadLocal<android.graphics.Rect> r0 = androidx.core.view.ViewCompat.sThreadLocalRect
            if (r0 != 0) goto Lb
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.core.view.ViewCompat.sThreadLocalRect = r0
        Lb:
            java.lang.ThreadLocal<android.graphics.Rect> r0 = androidx.core.view.ViewCompat.sThreadLocalRect
            java.lang.Object r0 = r0.get()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r0 != 0) goto L1f
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            java.lang.ThreadLocal<android.graphics.Rect> r1 = androidx.core.view.ViewCompat.sThreadLocalRect
            r1.set(r0)
        L1f:
            r0.setEmpty()
            return r0
    }

    private static androidx.core.view.OnReceiveContentViewBehavior getFallback(@androidx.annotation.NonNull android.view.View r1) {
            boolean r0 = r1 instanceof androidx.core.view.OnReceiveContentViewBehavior
            if (r0 == 0) goto L7
            androidx.core.view.OnReceiveContentViewBehavior r1 = (androidx.core.view.OnReceiveContentViewBehavior) r1
            return r1
        L7:
            androidx.core.view.OnReceiveContentViewBehavior r1 = androidx.core.view.ViewCompat.NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR
            return r1
    }

    public static boolean getFitsSystemWindows(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = androidx.core.view.ViewCompat.Api16Impl.getFitsSystemWindows(r0)
            return r0
    }

    public static int getImportantForAccessibility(@androidx.annotation.NonNull android.view.View r0) {
            int r0 = androidx.core.view.ViewCompat.Api16Impl.getImportantForAccessibility(r0)
            return r0
    }

    @android.annotation.SuppressLint({"InlinedApi"})
    public static int getImportantForAutofill(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            int r2 = androidx.core.view.ViewCompat.Api26Impl.getImportantForAutofill(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static int getLabelFor(@androidx.annotation.NonNull android.view.View r0) {
            int r0 = androidx.core.view.ViewCompat.Api17Impl.getLabelFor(r0)
            return r0
    }

    @java.lang.Deprecated
    public static int getLayerType(android.view.View r0) {
            int r0 = r0.getLayerType()
            return r0
    }

    public static int getLayoutDirection(@androidx.annotation.NonNull android.view.View r0) {
            int r0 = androidx.core.view.ViewCompat.Api17Impl.getLayoutDirection(r0)
            return r0
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public static android.graphics.Matrix getMatrix(android.view.View r0) {
            android.graphics.Matrix r0 = r0.getMatrix()
            return r0
    }

    @java.lang.Deprecated
    public static int getMeasuredHeightAndState(android.view.View r0) {
            int r0 = r0.getMeasuredHeightAndState()
            return r0
    }

    @java.lang.Deprecated
    public static int getMeasuredState(android.view.View r0) {
            int r0 = r0.getMeasuredState()
            return r0
    }

    @java.lang.Deprecated
    public static int getMeasuredWidthAndState(android.view.View r0) {
            int r0 = r0.getMeasuredWidthAndState()
            return r0
    }

    public static int getMinimumHeight(@androidx.annotation.NonNull android.view.View r0) {
            int r0 = androidx.core.view.ViewCompat.Api16Impl.getMinimumHeight(r0)
            return r0
    }

    public static int getMinimumWidth(@androidx.annotation.NonNull android.view.View r0) {
            int r0 = androidx.core.view.ViewCompat.Api16Impl.getMinimumWidth(r0)
            return r0
    }

    public static int getNextClusterForwardId(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            int r2 = androidx.core.view.ViewCompat.Api26Impl.getNextClusterForwardId(r2)
            return r2
        Lb:
            r2 = -1
            return r2
    }

    @androidx.annotation.Nullable
    public static java.lang.String[] getOnReceiveContentMimeTypes(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            java.lang.String[] r2 = androidx.core.view.ViewCompat.Api31Impl.getReceiveContentMimeTypes(r2)
            return r2
        Lb:
            int r0 = androidx.core.R.id.tag_on_receive_content_mime_types
            java.lang.Object r2 = r2.getTag(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            return r2
    }

    @java.lang.Deprecated
    public static int getOverScrollMode(android.view.View r0) {
            int r0 = r0.getOverScrollMode()
            return r0
    }

    @androidx.annotation.Px
    public static int getPaddingEnd(@androidx.annotation.NonNull android.view.View r0) {
            int r0 = androidx.core.view.ViewCompat.Api17Impl.getPaddingEnd(r0)
            return r0
    }

    @androidx.annotation.Px
    public static int getPaddingStart(@androidx.annotation.NonNull android.view.View r0) {
            int r0 = androidx.core.view.ViewCompat.Api17Impl.getPaddingStart(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public static android.view.ViewParent getParentForAccessibility(@androidx.annotation.NonNull android.view.View r0) {
            android.view.ViewParent r0 = androidx.core.view.ViewCompat.Api16Impl.getParentForAccessibility(r0)
            return r0
    }

    @java.lang.Deprecated
    public static float getPivotX(android.view.View r0) {
            float r0 = r0.getPivotX()
            return r0
    }

    @java.lang.Deprecated
    public static float getPivotY(android.view.View r0) {
            float r0 = r0.getPivotY()
            return r0
    }

    @androidx.annotation.Nullable
    public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            androidx.core.view.WindowInsetsCompat r2 = androidx.core.view.ViewCompat.Api23Impl.getRootWindowInsets(r2)
            return r2
        Lb:
            androidx.core.view.WindowInsetsCompat r2 = androidx.core.view.ViewCompat.Api21Impl.getRootWindowInsets(r2)
            return r2
    }

    @java.lang.Deprecated
    public static float getRotation(android.view.View r0) {
            float r0 = r0.getRotation()
            return r0
    }

    @java.lang.Deprecated
    public static float getRotationX(android.view.View r0) {
            float r0 = r0.getRotationX()
            return r0
    }

    @java.lang.Deprecated
    public static float getRotationY(android.view.View r0) {
            float r0 = r0.getRotationY()
            return r0
    }

    @java.lang.Deprecated
    public static float getScaleX(android.view.View r0) {
            float r0 = r0.getScaleX()
            return r0
    }

    @java.lang.Deprecated
    public static float getScaleY(android.view.View r0) {
            float r0 = r0.getScaleY()
            return r0
    }

    public static int getScrollIndicators(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Lb
            int r2 = androidx.core.view.ViewCompat.Api23Impl.getScrollIndicators(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    @androidx.annotation.Nullable
    @androidx.annotation.UiThread
    public static java.lang.CharSequence getStateDescription(@androidx.annotation.NonNull android.view.View r1) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = stateDescriptionProperty()
            java.lang.Object r1 = r0.get(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            return r1
    }

    @androidx.annotation.NonNull
    public static java.util.List<android.graphics.Rect> getSystemGestureExclusionRects(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lb
            java.util.List r2 = androidx.core.view.ViewCompat.Api29Impl.getSystemGestureExclusionRects(r2)
            return r2
        Lb:
            java.util.List r2 = java.util.Collections.emptyList()
            return r2
    }

    @androidx.annotation.Nullable
    public static java.lang.String getTransitionName(@androidx.annotation.NonNull android.view.View r0) {
            java.lang.String r0 = androidx.core.view.ViewCompat.Api21Impl.getTransitionName(r0)
            return r0
    }

    @java.lang.Deprecated
    public static float getTranslationX(android.view.View r0) {
            float r0 = r0.getTranslationX()
            return r0
    }

    @java.lang.Deprecated
    public static float getTranslationY(android.view.View r0) {
            float r0 = r0.getTranslationY()
            return r0
    }

    public static float getTranslationZ(@androidx.annotation.NonNull android.view.View r0) {
            float r0 = androidx.core.view.ViewCompat.Api21Impl.getTranslationZ(r0)
            return r0
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public static androidx.core.view.WindowInsetsControllerCompat getWindowInsetsController(@androidx.annotation.NonNull android.view.View r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            androidx.core.view.WindowInsetsControllerCompat r3 = androidx.core.view.ViewCompat.Api30Impl.getWindowInsetsController(r3)
            return r3
        Lb:
            android.content.Context r0 = r3.getContext()
        Lf:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            r2 = 0
            if (r1 == 0) goto L2c
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L25
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L24
            androidx.core.view.WindowInsetsControllerCompat r2 = androidx.core.view.WindowCompat.getInsetsController(r0, r3)
        L24:
            return r2
        L25:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto Lf
        L2c:
            return r2
    }

    @java.lang.Deprecated
    public static int getWindowSystemUiVisibility(@androidx.annotation.NonNull android.view.View r0) {
            int r0 = androidx.core.view.ViewCompat.Api16Impl.getWindowSystemUiVisibility(r0)
            return r0
    }

    @java.lang.Deprecated
    public static float getX(android.view.View r0) {
            float r0 = r0.getX()
            return r0
    }

    @java.lang.Deprecated
    public static float getY(android.view.View r0) {
            float r0 = r0.getY()
            return r0
    }

    public static float getZ(@androidx.annotation.NonNull android.view.View r0) {
            float r0 = androidx.core.view.ViewCompat.Api21Impl.getZ(r0)
            return r0
    }

    public static boolean hasAccessibilityDelegate(@androidx.annotation.NonNull android.view.View r0) {
            android.view.View$AccessibilityDelegate r0 = getAccessibilityDelegateInternal(r0)
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static boolean hasExplicitFocusable(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.view.ViewCompat.Api26Impl.hasExplicitFocusable(r2)
            return r2
        Lb:
            boolean r2 = r2.hasFocusable()
            return r2
    }

    public static boolean hasNestedScrollingParent(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.hasNestedScrollingParent(r0)
            return r0
    }

    public static boolean hasNestedScrollingParent(@androidx.annotation.NonNull android.view.View r1, int r2) {
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingChild2
            if (r0 == 0) goto La
            androidx.core.view.NestedScrollingChild2 r1 = (androidx.core.view.NestedScrollingChild2) r1
            r1.hasNestedScrollingParent(r2)
            goto L11
        La:
            if (r2 != 0) goto L11
            boolean r1 = hasNestedScrollingParent(r1)
            return r1
        L11:
            r1 = 0
            return r1
    }

    public static boolean hasOnClickListeners(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = androidx.core.view.ViewCompat.Api15Impl.hasOnClickListeners(r0)
            return r0
    }

    public static boolean hasOverlappingRendering(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = androidx.core.view.ViewCompat.Api16Impl.hasOverlappingRendering(r0)
            return r0
    }

    public static boolean hasTransientState(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = androidx.core.view.ViewCompat.Api16Impl.hasTransientState(r0)
            return r0
    }

    @androidx.annotation.UiThread
    public static boolean isAccessibilityHeading(@androidx.annotation.NonNull android.view.View r1) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = accessibilityHeadingProperty()
            java.lang.Object r1 = r0.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L14
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    public static boolean isAttachedToWindow(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = androidx.core.view.ViewCompat.Api19Impl.isAttachedToWindow(r0)
            return r0
    }

    public static boolean isFocusedByDefault(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.view.ViewCompat.Api26Impl.isFocusedByDefault(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static boolean isImportantForAccessibility(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.isImportantForAccessibility(r0)
            return r0
    }

    public static boolean isImportantForAutofill(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.view.ViewCompat.Api26Impl.isImportantForAutofill(r2)
            return r2
        Lb:
            r2 = 1
            return r2
    }

    public static boolean isInLayout(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = androidx.core.view.ViewCompat.Api18Impl.isInLayout(r0)
            return r0
    }

    public static boolean isKeyboardNavigationCluster(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.view.ViewCompat.Api26Impl.isKeyboardNavigationCluster(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static boolean isLaidOut(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = androidx.core.view.ViewCompat.Api19Impl.isLaidOut(r0)
            return r0
    }

    public static boolean isLayoutDirectionResolved(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = androidx.core.view.ViewCompat.Api19Impl.isLayoutDirectionResolved(r0)
            return r0
    }

    public static boolean isNestedScrollingEnabled(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.isNestedScrollingEnabled(r0)
            return r0
    }

    @java.lang.Deprecated
    public static boolean isOpaque(android.view.View r0) {
            boolean r0 = r0.isOpaque()
            return r0
    }

    public static boolean isPaddingRelative(@androidx.annotation.NonNull android.view.View r0) {
            boolean r0 = androidx.core.view.ViewCompat.Api17Impl.isPaddingRelative(r0)
            return r0
    }

    @androidx.annotation.UiThread
    public static boolean isScreenReaderFocusable(@androidx.annotation.NonNull android.view.View r1) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = screenReaderFocusableProperty()
            java.lang.Object r1 = r0.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L14
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    @java.lang.Deprecated
    public static void jumpDrawablesToCurrentState(android.view.View r0) {
            r0.jumpDrawablesToCurrentState()
            return
    }

    @androidx.annotation.Nullable
    public static android.view.View keyboardNavigationClusterSearch(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable android.view.View r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            android.view.View r2 = androidx.core.view.ViewCompat.Api26Impl.keyboardNavigationClusterSearch(r2, r3, r4)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    private static /* synthetic */ androidx.core.view.ContentInfoCompat lambda$static$0(androidx.core.view.ContentInfoCompat r0) {
            return r0
    }

    @androidx.annotation.RequiresApi(19)
    public static void notifyViewAccessibilityStateChangedIfNeeded(android.view.View r4, int r5) {
            android.content.Context r0 = r4.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            boolean r1 = r0.isEnabled()
            if (r1 != 0) goto L13
            return
        L13:
            java.lang.CharSequence r1 = getAccessibilityPaneTitle(r4)
            if (r1 == 0) goto L27
            boolean r1 = r4.isShown()
            if (r1 == 0) goto L27
            int r1 = r4.getWindowVisibility()
            if (r1 != 0) goto L27
            r1 = 1
            goto L28
        L27:
            r1 = 0
        L28:
            int r2 = getAccessibilityLiveRegion(r4)
            r3 = 32
            if (r2 != 0) goto L89
            if (r1 == 0) goto L33
            goto L89
        L33:
            if (r5 != r3) goto L57
            android.view.accessibility.AccessibilityEvent r1 = android.view.accessibility.AccessibilityEvent.obtain()
            r4.onInitializeAccessibilityEvent(r1)
            r1.setEventType(r3)
            androidx.core.view.ViewCompat.Api19Impl.setContentChangeTypes(r1, r5)
            r1.setSource(r4)
            r4.onPopulateAccessibilityEvent(r1)
            java.util.List r5 = r1.getText()
            java.lang.CharSequence r4 = getAccessibilityPaneTitle(r4)
            r5.add(r4)
            r0.sendAccessibilityEvent(r1)
            goto Lab
        L57:
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto Lab
            android.view.ViewParent r0 = r4.getParent()
            androidx.core.view.ViewCompat.Api19Impl.notifySubtreeAccessibilityStateChanged(r0, r4, r4, r5)     // Catch: java.lang.AbstractMethodError -> L65
            goto Lab
        L65:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.view.ViewParent r4 = r4.getParent()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r0.append(r4)
            java.lang.String r4 = " does not fully implement ViewParent"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "ViewCompat"
            android.util.Log.e(r0, r4, r5)
            goto Lab
        L89:
            android.view.accessibility.AccessibilityEvent r0 = android.view.accessibility.AccessibilityEvent.obtain()
            if (r1 == 0) goto L90
            goto L92
        L90:
            r3 = 2048(0x800, float:2.87E-42)
        L92:
            r0.setEventType(r3)
            androidx.core.view.ViewCompat.Api19Impl.setContentChangeTypes(r0, r5)
            if (r1 == 0) goto La8
            java.util.List r5 = r0.getText()
            java.lang.CharSequence r1 = getAccessibilityPaneTitle(r4)
            r5.add(r1)
            setViewImportanceForAccessibilityIfNeeded(r4)
        La8:
            r4.sendAccessibilityEventUnchecked(r0)
        Lab:
            return
    }

    public static void offsetLeftAndRight(@androidx.annotation.NonNull android.view.View r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            r6.offsetLeftAndRight(r7)
            goto L63
        La:
            android.graphics.Rect r0 = getEmptyTempRect()
            r1 = 0
            android.view.ViewParent r2 = r6.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L43
            r1 = r2
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.getRight()
            int r1 = r1.getBottom()
            r0.set(r3, r4, r5, r1)
            int r1 = r6.getLeft()
            int r3 = r6.getTop()
            int r4 = r6.getRight()
            int r5 = r6.getBottom()
            boolean r1 = r0.intersects(r1, r3, r4, r5)
            r1 = r1 ^ 1
        L43:
            compatOffsetLeftAndRight(r6, r7)
            if (r1 == 0) goto L63
            int r7 = r6.getLeft()
            int r1 = r6.getTop()
            int r3 = r6.getRight()
            int r6 = r6.getBottom()
            boolean r6 = r0.intersect(r7, r1, r3, r6)
            if (r6 == 0) goto L63
            android.view.View r2 = (android.view.View) r2
            r2.invalidate(r0)
        L63:
            return
    }

    public static void offsetTopAndBottom(@androidx.annotation.NonNull android.view.View r6, int r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto La
            r6.offsetTopAndBottom(r7)
            goto L63
        La:
            android.graphics.Rect r0 = getEmptyTempRect()
            r1 = 0
            android.view.ViewParent r2 = r6.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L43
            r1 = r2
            android.view.View r1 = (android.view.View) r1
            int r3 = r1.getLeft()
            int r4 = r1.getTop()
            int r5 = r1.getRight()
            int r1 = r1.getBottom()
            r0.set(r3, r4, r5, r1)
            int r1 = r6.getLeft()
            int r3 = r6.getTop()
            int r4 = r6.getRight()
            int r5 = r6.getBottom()
            boolean r1 = r0.intersects(r1, r3, r4, r5)
            r1 = r1 ^ 1
        L43:
            compatOffsetTopAndBottom(r6, r7)
            if (r1 == 0) goto L63
            int r7 = r6.getLeft()
            int r1 = r6.getTop()
            int r3 = r6.getRight()
            int r6 = r6.getBottom()
            boolean r6 = r0.intersect(r7, r1, r3, r6)
            if (r6 == 0) goto L63
            android.view.View r2 = (android.view.View) r2
            r2.invalidate(r0)
        L63:
            return
    }

    @androidx.annotation.NonNull
    public static androidx.core.view.WindowInsetsCompat onApplyWindowInsets(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull androidx.core.view.WindowInsetsCompat r3) {
            android.view.WindowInsets r0 = r3.toWindowInsets()
            if (r0 == 0) goto L15
            android.view.WindowInsets r1 = androidx.core.view.ViewCompat.Api20Impl.onApplyWindowInsets(r2, r0)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            androidx.core.view.WindowInsetsCompat r2 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r1, r2)
            return r2
        L15:
            return r3
    }

    @java.lang.Deprecated
    public static void onInitializeAccessibilityEvent(android.view.View r0, android.view.accessibility.AccessibilityEvent r1) {
            r0.onInitializeAccessibilityEvent(r1)
            return
    }

    public static void onInitializeAccessibilityNodeInfo(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat r1) {
            android.view.accessibility.AccessibilityNodeInfo r1 = r1.unwrap()
            r0.onInitializeAccessibilityNodeInfo(r1)
            return
    }

    @java.lang.Deprecated
    public static void onPopulateAccessibilityEvent(android.view.View r0, android.view.accessibility.AccessibilityEvent r1) {
            r0.onPopulateAccessibilityEvent(r1)
            return
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.CharSequence> paneTitleProperty() {
            androidx.core.view.ViewCompat$2 r0 = new androidx.core.view.ViewCompat$2
            int r1 = androidx.core.R.id.tag_accessibility_pane_title
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            r0.<init>(r1, r2)
            return r0
    }

    public static boolean performAccessibilityAction(@androidx.annotation.NonNull android.view.View r0, int r1, @androidx.annotation.Nullable android.os.Bundle r2) {
            boolean r0 = androidx.core.view.ViewCompat.Api16Impl.performAccessibilityAction(r0, r1, r2)
            return r0
    }

    @androidx.annotation.Nullable
    public static androidx.core.view.ContentInfoCompat performReceiveContent(@androidx.annotation.NonNull android.view.View r3, @androidx.annotation.NonNull androidx.core.view.ContentInfoCompat r4) {
            java.lang.String r0 = "ViewCompat"
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto L3e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "performReceiveContent: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = ", view="
            r1.append(r2)
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            java.lang.String r2 = "["
            r1.append(r2)
            int r2 = r3.getId()
            r1.append(r2)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
        L3e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L49
            androidx.core.view.ContentInfoCompat r3 = androidx.core.view.ViewCompat.Api31Impl.performReceiveContent(r3, r4)
            return r3
        L49:
            int r0 = androidx.core.R.id.tag_on_receive_content_listener
            java.lang.Object r0 = r3.getTag(r0)
            androidx.core.view.OnReceiveContentListener r0 = (androidx.core.view.OnReceiveContentListener) r0
            if (r0 == 0) goto L64
            androidx.core.view.ContentInfoCompat r4 = r0.onReceiveContent(r3, r4)
            if (r4 != 0) goto L5b
            r3 = 0
            goto L63
        L5b:
            androidx.core.view.OnReceiveContentViewBehavior r3 = getFallback(r3)
            androidx.core.view.ContentInfoCompat r3 = r3.onReceiveContent(r4)
        L63:
            return r3
        L64:
            androidx.core.view.OnReceiveContentViewBehavior r3 = getFallback(r3)
            androidx.core.view.ContentInfoCompat r3 = r3.onReceiveContent(r4)
            return r3
    }

    public static void postInvalidateOnAnimation(@androidx.annotation.NonNull android.view.View r0) {
            androidx.core.view.ViewCompat.Api16Impl.postInvalidateOnAnimation(r0)
            return
    }

    public static void postInvalidateOnAnimation(@androidx.annotation.NonNull android.view.View r0, int r1, int r2, int r3, int r4) {
            androidx.core.view.ViewCompat.Api16Impl.postInvalidateOnAnimation(r0, r1, r2, r3, r4)
            return
    }

    public static void postOnAnimation(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.NonNull java.lang.Runnable r1) {
            androidx.core.view.ViewCompat.Api16Impl.postOnAnimation(r0, r1)
            return
    }

    @android.annotation.SuppressLint({"LambdaLast"})
    public static void postOnAnimationDelayed(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.NonNull java.lang.Runnable r1, long r2) {
            androidx.core.view.ViewCompat.Api16Impl.postOnAnimationDelayed(r0, r1, r2)
            return
    }

    public static void removeAccessibilityAction(@androidx.annotation.NonNull android.view.View r0, int r1) {
            removeActionWithId(r1, r0)
            r1 = 0
            notifyViewAccessibilityStateChangedIfNeeded(r0, r1)
            return
    }

    private static void removeActionWithId(int r2, android.view.View r3) {
            java.util.List r3 = getActionList(r3)
            r0 = 0
        L5:
            int r1 = r3.size()
            if (r0 >= r1) goto L1e
            java.lang.Object r1 = r3.get(r0)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) r1
            int r1 = r1.getId()
            if (r1 != r2) goto L1b
            r3.remove(r0)
            goto L1e
        L1b:
            int r0 = r0 + 1
            goto L5
        L1e:
            return
    }

    public static void removeOnUnhandledKeyEventListener(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull androidx.core.view.ViewCompat.OnUnhandledKeyEventListenerCompat r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La
            androidx.core.view.ViewCompat.Api28Impl.removeOnUnhandledKeyEventListener(r2, r3)
            return
        La:
            int r0 = androidx.core.R.id.tag_unhandled_key_listeners
            java.lang.Object r0 = r2.getTag(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L20
            r0.remove(r3)
            int r3 = r0.size()
            if (r3 != 0) goto L20
            androidx.core.view.ViewCompat.UnhandledKeyEventManager.unregisterListeningView(r2)
        L20:
            return
    }

    public static void replaceAccessibilityAction(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.NonNull androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat r1, @androidx.annotation.Nullable java.lang.CharSequence r2, @androidx.annotation.Nullable androidx.core.view.accessibility.AccessibilityViewCommand r3) {
            if (r3 != 0) goto Lc
            if (r2 != 0) goto Lc
            int r1 = r1.getId()
            removeAccessibilityAction(r0, r1)
            goto L13
        Lc:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = r1.createReplacementAction(r2, r3)
            addAccessibilityAction(r0, r1)
        L13:
            return
    }

    public static void requestApplyInsets(@androidx.annotation.NonNull android.view.View r0) {
            androidx.core.view.ViewCompat.Api20Impl.requestApplyInsets(r0)
            return
    }

    @androidx.annotation.NonNull
    public static <T extends android.view.View> T requireViewById(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.IdRes int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Ld
            java.lang.Object r2 = androidx.core.view.ViewCompat.Api28Impl.requireViewById(r2, r3)
            android.view.View r2 = (android.view.View) r2
            return r2
        Ld:
            android.view.View r2 = r2.findViewById(r3)
            if (r2 == 0) goto L14
            return r2
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "ID does not reference a View inside this View"
            r2.<init>(r3)
            throw r2
    }

    @java.lang.Deprecated
    public static int resolveSizeAndState(int r0, int r1, int r2) {
            int r0 = android.view.View.resolveSizeAndState(r0, r1, r2)
            return r0
    }

    public static boolean restoreDefaultFocus(@androidx.annotation.NonNull android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.view.ViewCompat.Api26Impl.restoreDefaultFocus(r2)
            return r2
        Lb:
            boolean r2 = r2.requestFocus()
            return r2
    }

    public static void saveAttributeDataForStyleable(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull @android.annotation.SuppressLint({"ContextFirst"}) android.content.Context r3, @androidx.annotation.NonNull int[] r4, @androidx.annotation.Nullable android.util.AttributeSet r5, @androidx.annotation.NonNull android.content.res.TypedArray r6, int r7, int r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api29Impl.saveAttributeDataForStyleable(r2, r3, r4, r5, r6, r7, r8)
        L9:
            return
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.Boolean> screenReaderFocusableProperty() {
            androidx.core.view.ViewCompat$1 r0 = new androidx.core.view.ViewCompat$1
            int r1 = androidx.core.R.id.tag_screen_reader_focusable
            r0.<init>(r1)
            return r0
    }

    public static void setAccessibilityDelegate(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable androidx.core.view.AccessibilityDelegateCompat r2) {
            if (r2 != 0) goto Lf
            android.view.View$AccessibilityDelegate r0 = getAccessibilityDelegateInternal(r1)
            boolean r0 = r0 instanceof androidx.core.view.AccessibilityDelegateCompat.AccessibilityDelegateAdapter
            if (r0 == 0) goto Lf
            androidx.core.view.AccessibilityDelegateCompat r2 = new androidx.core.view.AccessibilityDelegateCompat
            r2.<init>()
        Lf:
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            android.view.View$AccessibilityDelegate r2 = r2.getBridge()
        L17:
            r1.setAccessibilityDelegate(r2)
            return
    }

    @androidx.annotation.UiThread
    public static void setAccessibilityHeading(@androidx.annotation.NonNull android.view.View r1, boolean r2) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = accessibilityHeadingProperty()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.set(r1, r2)
            return
    }

    public static void setAccessibilityLiveRegion(@androidx.annotation.NonNull android.view.View r0, int r1) {
            androidx.core.view.ViewCompat.Api19Impl.setAccessibilityLiveRegion(r0, r1)
            return
    }

    @androidx.annotation.UiThread
    public static void setAccessibilityPaneTitle(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.CharSequence r2) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = paneTitleProperty()
            r0.set(r1, r2)
            if (r2 == 0) goto Lf
            androidx.core.view.ViewCompat$AccessibilityPaneVisibilityManager r2 = androidx.core.view.ViewCompat.sAccessibilityPaneVisibilityManager
            r2.addAccessibilityPane(r1)
            goto L14
        Lf:
            androidx.core.view.ViewCompat$AccessibilityPaneVisibilityManager r2 = androidx.core.view.ViewCompat.sAccessibilityPaneVisibilityManager
            r2.removeAccessibilityPane(r1)
        L14:
            return
    }

    @java.lang.Deprecated
    public static void setActivated(android.view.View r0, boolean r1) {
            r0.setActivated(r1)
            return
    }

    @java.lang.Deprecated
    public static void setAlpha(android.view.View r0, @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r1) {
            r0.setAlpha(r1)
            return
    }

    public static void setAutofillHints(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable java.lang.String... r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api26Impl.setAutofillHints(r2, r3)
        L9:
            return
    }

    public static void setBackground(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            androidx.core.view.ViewCompat.Api16Impl.setBackground(r0, r1)
            return
    }

    public static void setBackgroundTintList(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            androidx.core.view.ViewCompat.Api21Impl.setBackgroundTintList(r1, r2)
            r2 = 21
            if (r0 != r2) goto L31
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            android.content.res.ColorStateList r0 = androidx.core.view.ViewCompat.Api21Impl.getBackgroundTintList(r1)
            if (r0 != 0) goto L1c
            android.graphics.PorterDuff$Mode r0 = androidx.core.view.ViewCompat.Api21Impl.getBackgroundTintMode(r1)
            if (r0 == 0) goto L1a
            goto L1c
        L1a:
            r0 = 0
            goto L1d
        L1c:
            r0 = 1
        L1d:
            if (r2 == 0) goto L31
            if (r0 == 0) goto L31
            boolean r0 = r2.isStateful()
            if (r0 == 0) goto L2e
            int[] r0 = r1.getDrawableState()
            r2.setState(r0)
        L2e:
            androidx.core.view.ViewCompat.Api16Impl.setBackground(r1, r2)
        L31:
            return
    }

    public static void setBackgroundTintMode(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable android.graphics.PorterDuff.Mode r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            androidx.core.view.ViewCompat.Api21Impl.setBackgroundTintMode(r1, r2)
            r2 = 21
            if (r0 != r2) goto L31
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            android.content.res.ColorStateList r0 = androidx.core.view.ViewCompat.Api21Impl.getBackgroundTintList(r1)
            if (r0 != 0) goto L1c
            android.graphics.PorterDuff$Mode r0 = androidx.core.view.ViewCompat.Api21Impl.getBackgroundTintMode(r1)
            if (r0 == 0) goto L1a
            goto L1c
        L1a:
            r0 = 0
            goto L1d
        L1c:
            r0 = 1
        L1d:
            if (r2 == 0) goto L31
            if (r0 == 0) goto L31
            boolean r0 = r2.isStateful()
            if (r0 == 0) goto L2e
            int[] r0 = r1.getDrawableState()
            r2.setState(r0)
        L2e:
            androidx.core.view.ViewCompat.Api16Impl.setBackground(r1, r2)
        L31:
            return
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    @java.lang.Deprecated
    public static void setChildrenDrawingOrderEnabled(android.view.ViewGroup r8, boolean r9) {
            java.lang.String r0 = "Unable to invoke childrenDrawingOrderEnabled"
            java.lang.reflect.Method r1 = androidx.core.view.ViewCompat.sChildrenDrawingOrderMethod
            r2 = 0
            r3 = 1
            java.lang.String r4 = "ViewCompat"
            if (r1 != 0) goto L27
            java.lang.Class<android.view.ViewGroup> r1 = android.view.ViewGroup.class
            java.lang.String r5 = "setChildrenDrawingOrderEnabled"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L1c
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L1c
            r6[r2] = r7     // Catch: java.lang.NoSuchMethodException -> L1c
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L1c
            androidx.core.view.ViewCompat.sChildrenDrawingOrderMethod = r1     // Catch: java.lang.NoSuchMethodException -> L1c
            goto L22
        L1c:
            r1 = move-exception
            java.lang.String r5 = "Unable to find childrenDrawingOrderEnabled"
            android.util.Log.e(r4, r5, r1)
        L22:
            java.lang.reflect.Method r1 = androidx.core.view.ViewCompat.sChildrenDrawingOrderMethod
            r1.setAccessible(r3)
        L27:
            java.lang.reflect.Method r1 = androidx.core.view.ViewCompat.sChildrenDrawingOrderMethod     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L3a java.lang.IllegalAccessException -> L3f
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L3a java.lang.IllegalAccessException -> L3f
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L3a java.lang.IllegalAccessException -> L3f
            r3[r2] = r9     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L3a java.lang.IllegalAccessException -> L3f
            r1.invoke(r8, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.IllegalArgumentException -> L3a java.lang.IllegalAccessException -> L3f
            goto L43
        L35:
            r8 = move-exception
            android.util.Log.e(r4, r0, r8)
            goto L43
        L3a:
            r8 = move-exception
            android.util.Log.e(r4, r0, r8)
            goto L43
        L3f:
            r8 = move-exception
            android.util.Log.e(r4, r0, r8)
        L43:
            return
    }

    public static void setClipBounds(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.Nullable android.graphics.Rect r1) {
            androidx.core.view.ViewCompat.Api18Impl.setClipBounds(r0, r1)
            return
    }

    public static void setElevation(@androidx.annotation.NonNull android.view.View r0, float r1) {
            androidx.core.view.ViewCompat.Api21Impl.setElevation(r0, r1)
            return
    }

    @java.lang.Deprecated
    public static void setFitsSystemWindows(android.view.View r0, boolean r1) {
            r0.setFitsSystemWindows(r1)
            return
    }

    public static void setFocusedByDefault(@androidx.annotation.NonNull android.view.View r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api26Impl.setFocusedByDefault(r2, r3)
        L9:
            return
    }

    public static void setHasTransientState(@androidx.annotation.NonNull android.view.View r0, boolean r1) {
            androidx.core.view.ViewCompat.Api16Impl.setHasTransientState(r0, r1)
            return
    }

    @androidx.annotation.UiThread
    public static void setImportantForAccessibility(@androidx.annotation.NonNull android.view.View r0, int r1) {
            androidx.core.view.ViewCompat.Api16Impl.setImportantForAccessibility(r0, r1)
            return
    }

    public static void setImportantForAutofill(@androidx.annotation.NonNull android.view.View r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api26Impl.setImportantForAutofill(r2, r3)
        L9:
            return
    }

    public static void setKeyboardNavigationCluster(@androidx.annotation.NonNull android.view.View r2, boolean r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api26Impl.setKeyboardNavigationCluster(r2, r3)
        L9:
            return
    }

    public static void setLabelFor(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.IdRes int r1) {
            androidx.core.view.ViewCompat.Api17Impl.setLabelFor(r0, r1)
            return
    }

    public static void setLayerPaint(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.Nullable android.graphics.Paint r1) {
            androidx.core.view.ViewCompat.Api17Impl.setLayerPaint(r0, r1)
            return
    }

    @java.lang.Deprecated
    public static void setLayerType(android.view.View r0, int r1, android.graphics.Paint r2) {
            r0.setLayerType(r1, r2)
            return
    }

    public static void setLayoutDirection(@androidx.annotation.NonNull android.view.View r0, int r1) {
            androidx.core.view.ViewCompat.Api17Impl.setLayoutDirection(r0, r1)
            return
    }

    public static void setNestedScrollingEnabled(@androidx.annotation.NonNull android.view.View r0, boolean r1) {
            androidx.core.view.ViewCompat.Api21Impl.setNestedScrollingEnabled(r0, r1)
            return
    }

    public static void setNextClusterForwardId(@androidx.annotation.NonNull android.view.View r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api26Impl.setNextClusterForwardId(r2, r3)
        L9:
            return
    }

    public static void setOnApplyWindowInsetsListener(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.Nullable androidx.core.view.OnApplyWindowInsetsListener r1) {
            androidx.core.view.ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(r0, r1)
            return
    }

    public static void setOnReceiveContentListener(@androidx.annotation.NonNull android.view.View r5, @androidx.annotation.Nullable java.lang.String[] r6, @androidx.annotation.Nullable androidx.core.view.OnReceiveContentListener r7) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto La
            androidx.core.view.ViewCompat.Api31Impl.setOnReceiveContentListener(r5, r6, r7)
            return
        La:
            if (r6 == 0) goto Lf
            int r0 = r6.length
            if (r0 != 0) goto L10
        Lf:
            r6 = 0
        L10:
            r0 = 0
            if (r7 == 0) goto L1d
            if (r6 == 0) goto L17
            r1 = 1
            goto L18
        L17:
            r1 = 0
        L18:
            java.lang.String r2 = "When the listener is set, MIME types must also be set"
            androidx.core.util.Preconditions.checkArgument(r1, r2)
        L1d:
            if (r6 == 0) goto L48
            int r1 = r6.length
            r2 = 0
        L21:
            if (r2 >= r1) goto L32
            r3 = r6[r2]
            java.lang.String r4 = "*"
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto L2f
            r0 = 1
            goto L32
        L2f:
            int r2 = r2 + 1
            goto L21
        L32:
            r0 = r0 ^ 1
            java.lang.String r1 = "A MIME type set here must not start with *: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = java.util.Arrays.toString(r6)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.core.util.Preconditions.checkArgument(r0, r1)
        L48:
            int r0 = androidx.core.R.id.tag_on_receive_content_mime_types
            r5.setTag(r0, r6)
            int r6 = androidx.core.R.id.tag_on_receive_content_listener
            r5.setTag(r6, r7)
            return
    }

    @java.lang.Deprecated
    public static void setOverScrollMode(android.view.View r0, int r1) {
            r0.setOverScrollMode(r1)
            return
    }

    public static void setPaddingRelative(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.Px int r1, @androidx.annotation.Px int r2, @androidx.annotation.Px int r3, @androidx.annotation.Px int r4) {
            androidx.core.view.ViewCompat.Api17Impl.setPaddingRelative(r0, r1, r2, r3, r4)
            return
    }

    @java.lang.Deprecated
    public static void setPivotX(android.view.View r0, float r1) {
            r0.setPivotX(r1)
            return
    }

    @java.lang.Deprecated
    public static void setPivotY(android.view.View r0, float r1) {
            r0.setPivotY(r1)
            return
    }

    public static void setPointerIcon(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable androidx.core.view.PointerIconCompat r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L13
            if (r3 == 0) goto Ld
            java.lang.Object r3 = r3.getPointerIcon()
            goto Le
        Ld:
            r3 = 0
        Le:
            android.view.PointerIcon r3 = (android.view.PointerIcon) r3
            androidx.core.view.ViewCompat.Api24Impl.setPointerIcon(r2, r3)
        L13:
            return
    }

    @java.lang.Deprecated
    public static void setRotation(android.view.View r0, float r1) {
            r0.setRotation(r1)
            return
    }

    @java.lang.Deprecated
    public static void setRotationX(android.view.View r0, float r1) {
            r0.setRotationX(r1)
            return
    }

    @java.lang.Deprecated
    public static void setRotationY(android.view.View r0, float r1) {
            r0.setRotationY(r1)
            return
    }

    @java.lang.Deprecated
    public static void setSaveFromParentEnabled(android.view.View r0, boolean r1) {
            r0.setSaveFromParentEnabled(r1)
            return
    }

    @java.lang.Deprecated
    public static void setScaleX(android.view.View r0, float r1) {
            r0.setScaleX(r1)
            return
    }

    @java.lang.Deprecated
    public static void setScaleY(android.view.View r0, float r1) {
            r0.setScaleY(r1)
            return
    }

    @androidx.annotation.UiThread
    public static void setScreenReaderFocusable(@androidx.annotation.NonNull android.view.View r1, boolean r2) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = screenReaderFocusableProperty()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.set(r1, r2)
            return
    }

    public static void setScrollIndicators(@androidx.annotation.NonNull android.view.View r2, int r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api23Impl.setScrollIndicators(r2, r3)
        L9:
            return
    }

    public static void setScrollIndicators(@androidx.annotation.NonNull android.view.View r2, int r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api23Impl.setScrollIndicators(r2, r3, r4)
        L9:
            return
    }

    @androidx.annotation.UiThread
    public static void setStateDescription(@androidx.annotation.NonNull android.view.View r1, @androidx.annotation.Nullable java.lang.CharSequence r2) {
            androidx.core.view.ViewCompat$AccessibilityViewProperty r0 = stateDescriptionProperty()
            r0.set(r1, r2)
            return
    }

    public static void setSystemGestureExclusionRects(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull java.util.List<android.graphics.Rect> r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api29Impl.setSystemGestureExclusionRects(r2, r3)
        L9:
            return
    }

    public static void setTooltipText(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable java.lang.CharSequence r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api26Impl.setTooltipText(r2, r3)
        L9:
            return
    }

    public static void setTransitionName(@androidx.annotation.NonNull android.view.View r0, @androidx.annotation.Nullable java.lang.String r1) {
            androidx.core.view.ViewCompat.Api21Impl.setTransitionName(r0, r1)
            return
    }

    @java.lang.Deprecated
    public static void setTranslationX(android.view.View r0, float r1) {
            r0.setTranslationX(r1)
            return
    }

    @java.lang.Deprecated
    public static void setTranslationY(android.view.View r0, float r1) {
            r0.setTranslationY(r1)
            return
    }

    public static void setTranslationZ(@androidx.annotation.NonNull android.view.View r0, float r1) {
            androidx.core.view.ViewCompat.Api21Impl.setTranslationZ(r0, r1)
            return
    }

    private static void setViewImportanceForAccessibilityIfNeeded(android.view.View r3) {
            int r0 = getImportantForAccessibility(r3)
            if (r0 != 0) goto La
            r0 = 1
            setImportantForAccessibility(r3, r0)
        La:
            android.view.ViewParent r0 = r3.getParent()
        Le:
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L26
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            int r1 = getImportantForAccessibility(r1)
            r2 = 4
            if (r1 != r2) goto L21
            r0 = 2
            setImportantForAccessibility(r3, r0)
            goto L26
        L21:
            android.view.ViewParent r0 = r0.getParent()
            goto Le
        L26:
            return
    }

    public static void setWindowInsetsAnimationCallback(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable androidx.core.view.WindowInsetsAnimationCompat.Callback r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            androidx.core.view.WindowInsetsAnimationCompat.Impl30.setCallback(r2, r3)
            goto Ld
        La:
            androidx.core.view.WindowInsetsAnimationCompat.Impl21.setCallback(r2, r3)
        Ld:
            return
    }

    @java.lang.Deprecated
    public static void setX(android.view.View r0, float r1) {
            r0.setX(r1)
            return
    }

    @java.lang.Deprecated
    public static void setY(android.view.View r0, float r1) {
            r0.setY(r1)
            return
    }

    public static void setZ(@androidx.annotation.NonNull android.view.View r0, float r1) {
            androidx.core.view.ViewCompat.Api21Impl.setZ(r0, r1)
            return
    }

    public static boolean startDragAndDrop(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.Nullable android.content.ClipData r3, @androidx.annotation.NonNull android.view.View.DragShadowBuilder r4, @androidx.annotation.Nullable java.lang.Object r5, int r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.view.ViewCompat.Api24Impl.startDragAndDrop(r2, r3, r4, r5, r6)
            return r2
        Lb:
            boolean r2 = r2.startDrag(r3, r4, r5, r6)
            return r2
    }

    public static boolean startNestedScroll(@androidx.annotation.NonNull android.view.View r0, int r1) {
            boolean r0 = androidx.core.view.ViewCompat.Api21Impl.startNestedScroll(r0, r1)
            return r0
    }

    public static boolean startNestedScroll(@androidx.annotation.NonNull android.view.View r1, int r2, int r3) {
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingChild2
            if (r0 == 0) goto Lb
            androidx.core.view.NestedScrollingChild2 r1 = (androidx.core.view.NestedScrollingChild2) r1
            boolean r1 = r1.startNestedScroll(r2, r3)
            return r1
        Lb:
            if (r3 != 0) goto L12
            boolean r1 = startNestedScroll(r1, r2)
            return r1
        L12:
            r1 = 0
            return r1
    }

    private static androidx.core.view.ViewCompat.AccessibilityViewProperty<java.lang.CharSequence> stateDescriptionProperty() {
            androidx.core.view.ViewCompat$3 r0 = new androidx.core.view.ViewCompat$3
            int r1 = androidx.core.R.id.tag_state_description
            java.lang.Class<java.lang.CharSequence> r2 = java.lang.CharSequence.class
            r0.<init>(r1, r2)
            return r0
    }

    public static void stopNestedScroll(@androidx.annotation.NonNull android.view.View r0) {
            androidx.core.view.ViewCompat.Api21Impl.stopNestedScroll(r0)
            return
    }

    public static void stopNestedScroll(@androidx.annotation.NonNull android.view.View r1, int r2) {
            boolean r0 = r1 instanceof androidx.core.view.NestedScrollingChild2
            if (r0 == 0) goto La
            androidx.core.view.NestedScrollingChild2 r1 = (androidx.core.view.NestedScrollingChild2) r1
            r1.stopNestedScroll(r2)
            goto Lf
        La:
            if (r2 != 0) goto Lf
            stopNestedScroll(r1)
        Lf:
            return
    }

    private static void tickleInvalidationFlag(android.view.View r2) {
            float r0 = r2.getTranslationY()
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            r2.setTranslationY(r1)
            r2.setTranslationY(r0)
            return
    }

    public static void updateDragShadow(@androidx.annotation.NonNull android.view.View r2, @androidx.annotation.NonNull android.view.View.DragShadowBuilder r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L9
            androidx.core.view.ViewCompat.Api24Impl.updateDragShadow(r2, r3)
        L9:
            return
    }
}
