package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
public class ListPopupWindow implements androidx.appcompat.view.menu.ShowableListMenu {
    private static final boolean DEBUG = false;
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    public static final int MATCH_PARENT = -1;
    public static final int POSITION_PROMPT_ABOVE = 0;
    public static final int POSITION_PROMPT_BELOW = 1;
    private static final java.lang.String TAG = "ListPopupWindow";
    public static final int WRAP_CONTENT = -2;
    private static java.lang.reflect.Method sGetMaxAvailableHeightMethod;
    private static java.lang.reflect.Method sSetClipToWindowEnabledMethod;
    private static java.lang.reflect.Method sSetEpicenterBoundsMethod;
    private android.widget.ListAdapter mAdapter;
    private android.content.Context mContext;
    private boolean mDropDownAlwaysVisible;
    private android.view.View mDropDownAnchorView;
    private int mDropDownGravity;
    private int mDropDownHeight;
    private int mDropDownHorizontalOffset;
    public androidx.appcompat.widget.DropDownListView mDropDownList;
    private android.graphics.drawable.Drawable mDropDownListHighlight;
    private int mDropDownVerticalOffset;
    private boolean mDropDownVerticalOffsetSet;
    private int mDropDownWidth;
    private int mDropDownWindowLayoutType;
    private android.graphics.Rect mEpicenterBounds;
    private boolean mForceIgnoreOutsideTouch;
    public final android.os.Handler mHandler;
    private final androidx.appcompat.widget.ListPopupWindow.ListSelectorHider mHideSelector;
    private android.widget.AdapterView.OnItemClickListener mItemClickListener;
    private android.widget.AdapterView.OnItemSelectedListener mItemSelectedListener;
    public int mListItemExpandMaximum;
    private boolean mModal;
    private android.database.DataSetObserver mObserver;
    private boolean mOverlapAnchor;
    private boolean mOverlapAnchorSet;
    public android.widget.PopupWindow mPopup;
    private int mPromptPosition;
    private android.view.View mPromptView;
    public final androidx.appcompat.widget.ListPopupWindow.ResizePopupRunnable mResizePopupRunnable;
    private final androidx.appcompat.widget.ListPopupWindow.PopupScrollListener mScrollListener;
    private java.lang.Runnable mShowDropDownRunnable;
    private final android.graphics.Rect mTempRect;
    private final androidx.appcompat.widget.ListPopupWindow.PopupTouchInterceptor mTouchInterceptor;




    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static int getMaxAvailableHeight(android.widget.PopupWindow r0, android.view.View r1, int r2, boolean r3) {
                int r0 = r0.getMaxAvailableHeight(r1, r2, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(29)
    public static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setEpicenterBounds(android.widget.PopupWindow r0, android.graphics.Rect r1) {
                r0.setEpicenterBounds(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setIsClippedToScreen(android.widget.PopupWindow r0, boolean r1) {
                r0.setIsClippedToScreen(r1)
                return
        }
    }

    public class ListSelectorHider implements java.lang.Runnable {
        public final /* synthetic */ androidx.appcompat.widget.ListPopupWindow this$0;

        public ListSelectorHider(androidx.appcompat.widget.ListPopupWindow r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                androidx.appcompat.widget.ListPopupWindow r0 = r1.this$0
                r0.clearListSelection()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class PopupDataSetObserver extends android.database.DataSetObserver {
        public final /* synthetic */ androidx.appcompat.widget.ListPopupWindow this$0;

        public PopupDataSetObserver(androidx.appcompat.widget.ListPopupWindow r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r1 = this;
                androidx.appcompat.widget.ListPopupWindow r0 = r1.this$0
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto Ld
                androidx.appcompat.widget.ListPopupWindow r0 = r1.this$0
                r0.show()
            Ld:
                return
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
                r1 = this;
                androidx.appcompat.widget.ListPopupWindow r0 = r1.this$0
                r0.dismiss()
                return
        }
    }

    public class PopupScrollListener implements android.widget.AbsListView.OnScrollListener {
        public final /* synthetic */ androidx.appcompat.widget.ListPopupWindow this$0;

        public PopupScrollListener(androidx.appcompat.widget.ListPopupWindow r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(android.widget.AbsListView r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(android.widget.AbsListView r1, int r2) {
                r0 = this;
                r1 = 1
                if (r2 != r1) goto L25
                androidx.appcompat.widget.ListPopupWindow r1 = r0.this$0
                boolean r1 = r1.isInputMethodNotNeeded()
                if (r1 != 0) goto L25
                androidx.appcompat.widget.ListPopupWindow r1 = r0.this$0
                android.widget.PopupWindow r1 = r1.mPopup
                android.view.View r1 = r1.getContentView()
                if (r1 == 0) goto L25
                androidx.appcompat.widget.ListPopupWindow r1 = r0.this$0
                android.os.Handler r2 = r1.mHandler
                androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable r1 = r1.mResizePopupRunnable
                r2.removeCallbacks(r1)
                androidx.appcompat.widget.ListPopupWindow r1 = r0.this$0
                androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable r1 = r1.mResizePopupRunnable
                r1.run()
            L25:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public class PopupTouchInterceptor implements android.view.View.OnTouchListener {
        public final /* synthetic */ androidx.appcompat.widget.ListPopupWindow this$0;

        public PopupTouchInterceptor(androidx.appcompat.widget.ListPopupWindow r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(android.view.View r3, android.view.MotionEvent r4) {
                r2 = this;
                int r3 = r4.getAction()
                float r0 = r4.getX()
                int r0 = (int) r0
                float r4 = r4.getY()
                int r4 = (int) r4
                if (r3 != 0) goto L40
                androidx.appcompat.widget.ListPopupWindow r1 = r2.this$0
                android.widget.PopupWindow r1 = r1.mPopup
                if (r1 == 0) goto L40
                boolean r1 = r1.isShowing()
                if (r1 == 0) goto L40
                if (r0 < 0) goto L40
                androidx.appcompat.widget.ListPopupWindow r1 = r2.this$0
                android.widget.PopupWindow r1 = r1.mPopup
                int r1 = r1.getWidth()
                if (r0 >= r1) goto L40
                if (r4 < 0) goto L40
                androidx.appcompat.widget.ListPopupWindow r0 = r2.this$0
                android.widget.PopupWindow r0 = r0.mPopup
                int r0 = r0.getHeight()
                if (r4 >= r0) goto L40
                androidx.appcompat.widget.ListPopupWindow r3 = r2.this$0
                android.os.Handler r4 = r3.mHandler
                androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable r3 = r3.mResizePopupRunnable
                r0 = 250(0xfa, double:1.235E-321)
                r4.postDelayed(r3, r0)
                goto L4c
            L40:
                r4 = 1
                if (r3 != r4) goto L4c
                androidx.appcompat.widget.ListPopupWindow r3 = r2.this$0
                android.os.Handler r4 = r3.mHandler
                androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable r3 = r3.mResizePopupRunnable
                r4.removeCallbacks(r3)
            L4c:
                r3 = 0
                return r3
        }
    }

    public class ResizePopupRunnable implements java.lang.Runnable {
        public final /* synthetic */ androidx.appcompat.widget.ListPopupWindow this$0;

        public ResizePopupRunnable(androidx.appcompat.widget.ListPopupWindow r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                androidx.appcompat.widget.ListPopupWindow r0 = r3.this$0
                androidx.appcompat.widget.DropDownListView r0 = r0.mDropDownList
                if (r0 == 0) goto L37
                boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
                if (r0 == 0) goto L37
                androidx.appcompat.widget.ListPopupWindow r0 = r3.this$0
                androidx.appcompat.widget.DropDownListView r0 = r0.mDropDownList
                int r0 = r0.getCount()
                androidx.appcompat.widget.ListPopupWindow r1 = r3.this$0
                androidx.appcompat.widget.DropDownListView r1 = r1.mDropDownList
                int r1 = r1.getChildCount()
                if (r0 <= r1) goto L37
                androidx.appcompat.widget.ListPopupWindow r0 = r3.this$0
                androidx.appcompat.widget.DropDownListView r0 = r0.mDropDownList
                int r0 = r0.getChildCount()
                androidx.appcompat.widget.ListPopupWindow r1 = r3.this$0
                int r2 = r1.mListItemExpandMaximum
                if (r0 > r2) goto L37
                android.widget.PopupWindow r0 = r1.mPopup
                r1 = 2
                r0.setInputMethodMode(r1)
                androidx.appcompat.widget.ListPopupWindow r0 = r3.this$0
                r0.show()
            L37:
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 1
            java.lang.String r3 = "ListPopupWindow"
            r4 = 28
            if (r0 > r4) goto L38
            java.lang.Class<android.widget.PopupWindow> r0 = android.widget.PopupWindow.class
            java.lang.String r4 = "setClipToScreenEnabled"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1c
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L1c
            r5[r1] = r6     // Catch: java.lang.NoSuchMethodException -> L1c
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L1c
            androidx.appcompat.widget.ListPopupWindow.sSetClipToWindowEnabledMethod = r0     // Catch: java.lang.NoSuchMethodException -> L1c
            goto L21
        L1c:
            java.lang.String r0 = "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r3, r0)
        L21:
            java.lang.Class<android.widget.PopupWindow> r0 = android.widget.PopupWindow.class
            java.lang.String r4 = "setEpicenterBounds"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L33
            java.lang.Class<android.graphics.Rect> r6 = android.graphics.Rect.class
            r5[r1] = r6     // Catch: java.lang.NoSuchMethodException -> L33
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L33
            androidx.appcompat.widget.ListPopupWindow.sSetEpicenterBoundsMethod = r0     // Catch: java.lang.NoSuchMethodException -> L33
            goto L38
        L33:
            java.lang.String r0 = "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well."
            android.util.Log.i(r3, r0)
        L38:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r0 > r4) goto L5e
            java.lang.Class<android.widget.PopupWindow> r0 = android.widget.PopupWindow.class
            java.lang.String r4 = "getMaxAvailableHeight"
            r5 = 3
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L59
            java.lang.Class<android.view.View> r6 = android.view.View.class
            r5[r1] = r6     // Catch: java.lang.NoSuchMethodException -> L59
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L59
            r5[r2] = r1     // Catch: java.lang.NoSuchMethodException -> L59
            r1 = 2
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L59
            r5[r1] = r2     // Catch: java.lang.NoSuchMethodException -> L59
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L59
            androidx.appcompat.widget.ListPopupWindow.sGetMaxAvailableHeightMethod = r0     // Catch: java.lang.NoSuchMethodException -> L59
            goto L5e
        L59:
            java.lang.String r0 = "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well."
            android.util.Log.i(r3, r0)
        L5e:
            return
    }

    public ListPopupWindow(@androidx.annotation.NonNull android.content.Context r3) {
            r2 = this;
            int r0 = androidx.appcompat.R.attr.listPopupWindowStyle
            r1 = 0
            r2.<init>(r3, r1, r0)
            return
    }

    public ListPopupWindow(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.listPopupWindowStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public ListPopupWindow(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, @androidx.annotation.AttrRes int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public ListPopupWindow(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.Nullable android.util.AttributeSet r5, @androidx.annotation.AttrRes int r6, @androidx.annotation.StyleRes int r7) {
            r3 = this;
            r3.<init>()
            r0 = -2
            r3.mDropDownHeight = r0
            r3.mDropDownWidth = r0
            r0 = 1002(0x3ea, float:1.404E-42)
            r3.mDropDownWindowLayoutType = r0
            r0 = 0
            r3.mDropDownGravity = r0
            r3.mDropDownAlwaysVisible = r0
            r3.mForceIgnoreOutsideTouch = r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r3.mListItemExpandMaximum = r1
            r3.mPromptPosition = r0
            androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable r1 = new androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable
            r1.<init>(r3)
            r3.mResizePopupRunnable = r1
            androidx.appcompat.widget.ListPopupWindow$PopupTouchInterceptor r1 = new androidx.appcompat.widget.ListPopupWindow$PopupTouchInterceptor
            r1.<init>(r3)
            r3.mTouchInterceptor = r1
            androidx.appcompat.widget.ListPopupWindow$PopupScrollListener r1 = new androidx.appcompat.widget.ListPopupWindow$PopupScrollListener
            r1.<init>(r3)
            r3.mScrollListener = r1
            androidx.appcompat.widget.ListPopupWindow$ListSelectorHider r1 = new androidx.appcompat.widget.ListPopupWindow$ListSelectorHider
            r1.<init>(r3)
            r3.mHideSelector = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r3.mTempRect = r1
            r3.mContext = r4
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = r4.getMainLooper()
            r1.<init>(r2)
            r3.mHandler = r1
            int[] r1 = androidx.appcompat.R.styleable.ListPopupWindow
            android.content.res.TypedArray r1 = r4.obtainStyledAttributes(r5, r1, r6, r7)
            int r2 = androidx.appcompat.R.styleable.ListPopupWindow_android_dropDownHorizontalOffset
            int r2 = r1.getDimensionPixelOffset(r2, r0)
            r3.mDropDownHorizontalOffset = r2
            int r2 = androidx.appcompat.R.styleable.ListPopupWindow_android_dropDownVerticalOffset
            int r0 = r1.getDimensionPixelOffset(r2, r0)
            r3.mDropDownVerticalOffset = r0
            r2 = 1
            if (r0 == 0) goto L65
            r3.mDropDownVerticalOffsetSet = r2
        L65:
            r1.recycle()
            androidx.appcompat.widget.AppCompatPopupWindow r0 = new androidx.appcompat.widget.AppCompatPopupWindow
            r0.<init>(r4, r5, r6, r7)
            r3.mPopup = r0
            r0.setInputMethodMode(r2)
            return
    }

    private int buildDropDown() {
            r11 = this;
            androidx.appcompat.widget.DropDownListView r0 = r11.mDropDownList
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 != 0) goto Lba
            android.content.Context r0 = r11.mContext
            androidx.appcompat.widget.ListPopupWindow$2 r5 = new androidx.appcompat.widget.ListPopupWindow$2
            r5.<init>(r11)
            r11.mShowDropDownRunnable = r5
            boolean r5 = r11.mModal
            r5 = r5 ^ r3
            androidx.appcompat.widget.DropDownListView r5 = r11.createDropDownListView(r0, r5)
            r11.mDropDownList = r5
            android.graphics.drawable.Drawable r6 = r11.mDropDownListHighlight
            if (r6 == 0) goto L22
            r5.setSelector(r6)
        L22:
            androidx.appcompat.widget.DropDownListView r5 = r11.mDropDownList
            android.widget.ListAdapter r6 = r11.mAdapter
            r5.setAdapter(r6)
            androidx.appcompat.widget.DropDownListView r5 = r11.mDropDownList
            android.widget.AdapterView$OnItemClickListener r6 = r11.mItemClickListener
            r5.setOnItemClickListener(r6)
            androidx.appcompat.widget.DropDownListView r5 = r11.mDropDownList
            r5.setFocusable(r3)
            androidx.appcompat.widget.DropDownListView r5 = r11.mDropDownList
            r5.setFocusableInTouchMode(r3)
            androidx.appcompat.widget.DropDownListView r5 = r11.mDropDownList
            androidx.appcompat.widget.ListPopupWindow$3 r6 = new androidx.appcompat.widget.ListPopupWindow$3
            r6.<init>(r11)
            r5.setOnItemSelectedListener(r6)
            androidx.appcompat.widget.DropDownListView r5 = r11.mDropDownList
            androidx.appcompat.widget.ListPopupWindow$PopupScrollListener r6 = r11.mScrollListener
            r5.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r5 = r11.mItemSelectedListener
            if (r5 == 0) goto L54
            androidx.appcompat.widget.DropDownListView r6 = r11.mDropDownList
            r6.setOnItemSelectedListener(r5)
        L54:
            androidx.appcompat.widget.DropDownListView r5 = r11.mDropDownList
            android.view.View r6 = r11.mPromptView
            if (r6 == 0) goto Lb3
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            r7.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r2, r4, r8)
            int r8 = r11.mPromptPosition
            if (r8 == 0) goto L8b
            if (r8 == r3) goto L84
            java.lang.String r0 = "Invalid hint position "
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            int r5 = r11.mPromptPosition
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "ListPopupWindow"
            android.util.Log.e(r5, r0)
            goto L91
        L84:
            r7.addView(r5, r0)
            r7.addView(r6)
            goto L91
        L8b:
            r7.addView(r6)
            r7.addView(r5, r0)
        L91:
            int r0 = r11.mDropDownWidth
            if (r0 < 0) goto L98
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L9a
        L98:
            r0 = 0
            r5 = 0
        L9a:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            r6.measure(r0, r4)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r4 = r6.getMeasuredHeight()
            int r5 = r0.topMargin
            int r4 = r4 + r5
            int r0 = r0.bottomMargin
            int r4 = r4 + r0
            r5 = r7
            goto Lb4
        Lb3:
            r4 = 0
        Lb4:
            android.widget.PopupWindow r0 = r11.mPopup
            r0.setContentView(r5)
            goto Ld8
        Lba:
            android.widget.PopupWindow r0 = r11.mPopup
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r11.mPromptView
            if (r0 == 0) goto Ld7
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
            int r0 = r0.getMeasuredHeight()
            int r5 = r4.topMargin
            int r0 = r0 + r5
            int r4 = r4.bottomMargin
            int r4 = r4 + r0
            goto Ld8
        Ld7:
            r4 = 0
        Ld8:
            android.widget.PopupWindow r0 = r11.mPopup
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto Lf4
            android.graphics.Rect r5 = r11.mTempRect
            r0.getPadding(r5)
            android.graphics.Rect r0 = r11.mTempRect
            int r5 = r0.top
            int r0 = r0.bottom
            int r0 = r0 + r5
            boolean r6 = r11.mDropDownVerticalOffsetSet
            if (r6 != 0) goto Lfa
            int r5 = -r5
            r11.mDropDownVerticalOffset = r5
            goto Lfa
        Lf4:
            android.graphics.Rect r0 = r11.mTempRect
            r0.setEmpty()
            r0 = 0
        Lfa:
            android.widget.PopupWindow r5 = r11.mPopup
            int r5 = r5.getInputMethodMode()
            r6 = 2
            if (r5 != r6) goto L104
            goto L105
        L104:
            r3 = 0
        L105:
            android.view.View r5 = r11.getAnchorView()
            int r6 = r11.mDropDownVerticalOffset
            int r3 = r11.getMaxAvailableHeight(r5, r6, r3)
            boolean r5 = r11.mDropDownAlwaysVisible
            if (r5 != 0) goto L176
            int r5 = r11.mDropDownHeight
            if (r5 != r2) goto L118
            goto L176
        L118:
            int r5 = r11.mDropDownWidth
            r6 = -2
            if (r5 == r6) goto L13f
            r1 = 1073741824(0x40000000, float:2.0)
            if (r5 == r2) goto L126
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
            goto L157
        L126:
            android.content.Context r2 = r11.mContext
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r5 = r11.mTempRect
            int r6 = r5.left
            int r5 = r5.right
            int r6 = r6 + r5
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
            goto L157
        L13f:
            android.content.Context r2 = r11.mContext
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.graphics.Rect r5 = r11.mTempRect
            int r6 = r5.left
            int r5 = r5.right
            int r6 = r6 + r5
            int r2 = r2 - r6
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r1)
        L157:
            r6 = r1
            androidx.appcompat.widget.DropDownListView r5 = r11.mDropDownList
            r7 = 0
            r8 = -1
            int r9 = r3 - r4
            r10 = -1
            int r1 = r5.measureHeightOfChildrenCompat(r6, r7, r8, r9, r10)
            if (r1 <= 0) goto L174
            androidx.appcompat.widget.DropDownListView r2 = r11.mDropDownList
            int r2 = r2.getPaddingTop()
            androidx.appcompat.widget.DropDownListView r3 = r11.mDropDownList
            int r3 = r3.getPaddingBottom()
            int r3 = r3 + r2
            int r3 = r3 + r0
            int r4 = r4 + r3
        L174:
            int r1 = r1 + r4
            return r1
        L176:
            int r3 = r3 + r0
            return r3
    }

    private int getMaxAvailableHeight(android.view.View r6, int r7, boolean r8) {
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 > r1) goto L39
            java.lang.reflect.Method r0 = androidx.appcompat.widget.ListPopupWindow.sGetMaxAvailableHeightMethod
            if (r0 == 0) goto L32
            android.widget.PopupWindow r1 = r5.mPopup     // Catch: java.lang.Exception -> L2b
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L2b
            r3 = 0
            r2[r3] = r6     // Catch: java.lang.Exception -> L2b
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L2b
            r2[r3] = r4     // Catch: java.lang.Exception -> L2b
            r3 = 2
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Exception -> L2b
            r2[r3] = r8     // Catch: java.lang.Exception -> L2b
            java.lang.Object r8 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L2b
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Exception -> L2b
            int r6 = r8.intValue()     // Catch: java.lang.Exception -> L2b
            return r6
        L2b:
            java.lang.String r8 = "ListPopupWindow"
            java.lang.String r0 = "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version."
            android.util.Log.i(r8, r0)
        L32:
            android.widget.PopupWindow r8 = r5.mPopup
            int r6 = r8.getMaxAvailableHeight(r6, r7)
            return r6
        L39:
            android.widget.PopupWindow r0 = r5.mPopup
            int r6 = androidx.appcompat.widget.ListPopupWindow.Api24Impl.getMaxAvailableHeight(r0, r6, r7, r8)
            return r6
    }

    private static boolean isConfirmKey(int r1) {
            r0 = 66
            if (r1 == r0) goto Lb
            r0 = 23
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            return r1
    }

    private void removePromptView() {
            r2 = this;
            android.view.View r0 = r2.mPromptView
            if (r0 == 0) goto L13
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L13
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r1 = r2.mPromptView
            r0.removeView(r1)
        L13:
            return
    }

    private void setPopupClipToScreenEnabled(boolean r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 > r1) goto L22
            java.lang.reflect.Method r0 = androidx.appcompat.widget.ListPopupWindow.sSetClipToWindowEnabledMethod
            if (r0 == 0) goto L27
            android.widget.PopupWindow r1 = r4.mPopup     // Catch: java.lang.Exception -> L1a
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L1a
            r3 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> L1a
            r2[r3] = r5     // Catch: java.lang.Exception -> L1a
            r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L1a
            goto L27
        L1a:
            java.lang.String r5 = "ListPopupWindow"
            java.lang.String r0 = "Could not call setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r5, r0)
            goto L27
        L22:
            android.widget.PopupWindow r0 = r4.mPopup
            androidx.appcompat.widget.ListPopupWindow.Api29Impl.setIsClippedToScreen(r0, r5)
        L27:
            return
    }

    public void clearListSelection() {
            r2 = this;
            androidx.appcompat.widget.DropDownListView r0 = r2.mDropDownList
            if (r0 == 0) goto Lb
            r1 = 1
            r0.setListSelectionHidden(r1)
            r0.requestLayout()
        Lb:
            return
    }

    public android.view.View.OnTouchListener createDragToOpenListener(android.view.View r2) {
            r1 = this;
            androidx.appcompat.widget.ListPopupWindow$1 r0 = new androidx.appcompat.widget.ListPopupWindow$1
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.appcompat.widget.DropDownListView createDropDownListView(android.content.Context r2, boolean r3) {
            r1 = this;
            androidx.appcompat.widget.DropDownListView r0 = new androidx.appcompat.widget.DropDownListView
            r0.<init>(r2, r3)
            return r0
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
            r2 = this;
            android.widget.PopupWindow r0 = r2.mPopup
            r0.dismiss()
            r2.removePromptView()
            android.widget.PopupWindow r0 = r2.mPopup
            r1 = 0
            r0.setContentView(r1)
            r2.mDropDownList = r1
            android.os.Handler r0 = r2.mHandler
            androidx.appcompat.widget.ListPopupWindow$ResizePopupRunnable r1 = r2.mResizePopupRunnable
            r0.removeCallbacks(r1)
            return
    }

    @androidx.annotation.Nullable
    public android.view.View getAnchorView() {
            r1 = this;
            android.view.View r0 = r1.mDropDownAnchorView
            return r0
    }

    @androidx.annotation.StyleRes
    public int getAnimationStyle() {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            int r0 = r0.getAnimationStyle()
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getBackground() {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.Rect getEpicenterBounds() {
            r2 = this;
            android.graphics.Rect r0 = r2.mEpicenterBounds
            if (r0 == 0) goto Lc
            android.graphics.Rect r0 = new android.graphics.Rect
            android.graphics.Rect r1 = r2.mEpicenterBounds
            r0.<init>(r1)
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public int getHeight() {
            r1 = this;
            int r0 = r1.mDropDownHeight
            return r0
    }

    public int getHorizontalOffset() {
            r1 = this;
            int r0 = r1.mDropDownHorizontalOffset
            return r0
    }

    public int getInputMethodMode() {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            int r0 = r0.getInputMethodMode()
            return r0
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    @androidx.annotation.Nullable
    public android.widget.ListView getListView() {
            r1 = this;
            androidx.appcompat.widget.DropDownListView r0 = r1.mDropDownList
            return r0
    }

    public int getPromptPosition() {
            r1 = this;
            int r0 = r1.mPromptPosition
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Object getSelectedItem() {
            r1 = this;
            boolean r0 = r1.isShowing()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            androidx.appcompat.widget.DropDownListView r0 = r1.mDropDownList
            java.lang.Object r0 = r0.getSelectedItem()
            return r0
    }

    public long getSelectedItemId() {
            r2 = this;
            boolean r0 = r2.isShowing()
            if (r0 != 0) goto L9
            r0 = -9223372036854775808
            return r0
        L9:
            androidx.appcompat.widget.DropDownListView r0 = r2.mDropDownList
            long r0 = r0.getSelectedItemId()
            return r0
    }

    public int getSelectedItemPosition() {
            r1 = this;
            boolean r0 = r1.isShowing()
            if (r0 != 0) goto L8
            r0 = -1
            return r0
        L8:
            androidx.appcompat.widget.DropDownListView r0 = r1.mDropDownList
            int r0 = r0.getSelectedItemPosition()
            return r0
    }

    @androidx.annotation.Nullable
    public android.view.View getSelectedView() {
            r1 = this;
            boolean r0 = r1.isShowing()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            androidx.appcompat.widget.DropDownListView r0 = r1.mDropDownList
            android.view.View r0 = r0.getSelectedView()
            return r0
    }

    public int getSoftInputMode() {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            int r0 = r0.getSoftInputMode()
            return r0
    }

    public int getVerticalOffset() {
            r1 = this;
            boolean r0 = r1.mDropDownVerticalOffsetSet
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r1.mDropDownVerticalOffset
            return r0
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.mDropDownWidth
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isDropDownAlwaysVisible() {
            r1 = this;
            boolean r0 = r1.mDropDownAlwaysVisible
            return r0
    }

    public boolean isInputMethodNotNeeded() {
            r2 = this;
            android.widget.PopupWindow r0 = r2.mPopup
            int r0 = r0.getInputMethodMode()
            r1 = 2
            if (r0 != r1) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    public boolean isModal() {
            r1 = this;
            boolean r0 = r1.mModal
            return r0
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            boolean r0 = r0.isShowing()
            return r0
    }

    public boolean onKeyDown(int r10, @androidx.annotation.NonNull android.view.KeyEvent r11) {
            r9 = this;
            boolean r0 = r9.isShowing()
            r1 = 0
            if (r0 == 0) goto La6
            r0 = 62
            if (r10 == r0) goto La6
            androidx.appcompat.widget.DropDownListView r0 = r9.mDropDownList
            int r0 = r0.getSelectedItemPosition()
            if (r0 >= 0) goto L19
            boolean r0 = isConfirmKey(r10)
            if (r0 != 0) goto La6
        L19:
            androidx.appcompat.widget.DropDownListView r0 = r9.mDropDownList
            int r0 = r0.getSelectedItemPosition()
            android.widget.PopupWindow r2 = r9.mPopup
            boolean r2 = r2.isAboveAnchor()
            r3 = 1
            r2 = r2 ^ r3
            android.widget.ListAdapter r4 = r9.mAdapter
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == 0) goto L53
            boolean r5 = r4.areAllItemsEnabled()
            if (r5 == 0) goto L38
            r6 = 0
            goto L3e
        L38:
            androidx.appcompat.widget.DropDownListView r6 = r9.mDropDownList
            int r6 = r6.lookForSelectablePosition(r1, r3)
        L3e:
            if (r5 == 0) goto L46
            int r4 = r4.getCount()
            int r4 = r4 - r3
            goto L51
        L46:
            androidx.appcompat.widget.DropDownListView r5 = r9.mDropDownList
            int r4 = r4.getCount()
            int r4 = r4 - r3
            int r4 = r5.lookForSelectablePosition(r4, r1)
        L51:
            r5 = r6
            r6 = r4
        L53:
            r4 = 19
            if (r2 == 0) goto L5b
            if (r10 != r4) goto L5b
            if (r0 <= r5) goto L63
        L5b:
            r7 = 20
            if (r2 != 0) goto L6f
            if (r10 != r7) goto L6f
            if (r0 < r6) goto L6f
        L63:
            r9.clearListSelection()
            android.widget.PopupWindow r10 = r9.mPopup
            r10.setInputMethodMode(r3)
            r9.show()
            return r3
        L6f:
            androidx.appcompat.widget.DropDownListView r8 = r9.mDropDownList
            r8.setListSelectionHidden(r1)
            androidx.appcompat.widget.DropDownListView r8 = r9.mDropDownList
            boolean r11 = r8.onKeyDown(r10, r11)
            if (r11 == 0) goto L98
            android.widget.PopupWindow r11 = r9.mPopup
            r0 = 2
            r11.setInputMethodMode(r0)
            androidx.appcompat.widget.DropDownListView r11 = r9.mDropDownList
            r11.requestFocusFromTouch()
            r9.show()
            if (r10 == r4) goto L97
            if (r10 == r7) goto L97
            r11 = 23
            if (r10 == r11) goto L97
            r11 = 66
            if (r10 == r11) goto L97
            goto La6
        L97:
            return r3
        L98:
            if (r2 == 0) goto L9f
            if (r10 != r7) goto L9f
            if (r0 != r6) goto La6
            return r3
        L9f:
            if (r2 != 0) goto La6
            if (r10 != r4) goto La6
            if (r0 != r5) goto La6
            return r3
        La6:
            return r1
    }

    public boolean onKeyPreIme(int r3, @androidx.annotation.NonNull android.view.KeyEvent r4) {
            r2 = this;
            r0 = 4
            if (r3 != r0) goto L41
            boolean r3 = r2.isShowing()
            if (r3 == 0) goto L41
            android.view.View r3 = r2.mDropDownAnchorView
            int r0 = r4.getAction()
            r1 = 1
            if (r0 != 0) goto L22
            int r0 = r4.getRepeatCount()
            if (r0 != 0) goto L22
            android.view.KeyEvent$DispatcherState r3 = r3.getKeyDispatcherState()
            if (r3 == 0) goto L21
            r3.startTracking(r4, r2)
        L21:
            return r1
        L22:
            int r0 = r4.getAction()
            if (r0 != r1) goto L41
            android.view.KeyEvent$DispatcherState r3 = r3.getKeyDispatcherState()
            if (r3 == 0) goto L31
            r3.handleUpEvent(r4)
        L31:
            boolean r3 = r4.isTracking()
            if (r3 == 0) goto L41
            boolean r3 = r4.isCanceled()
            if (r3 != 0) goto L41
            r2.dismiss()
            return r1
        L41:
            r3 = 0
            return r3
    }

    public boolean onKeyUp(int r2, @androidx.annotation.NonNull android.view.KeyEvent r3) {
            r1 = this;
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L20
            androidx.appcompat.widget.DropDownListView r0 = r1.mDropDownList
            int r0 = r0.getSelectedItemPosition()
            if (r0 < 0) goto L20
            androidx.appcompat.widget.DropDownListView r0 = r1.mDropDownList
            boolean r3 = r0.onKeyUp(r2, r3)
            if (r3 == 0) goto L1f
            boolean r2 = isConfirmKey(r2)
            if (r2 == 0) goto L1f
            r1.dismiss()
        L1f:
            return r3
        L20:
            r2 = 0
            return r2
    }

    public boolean performItemClick(int r8) {
            r7 = this;
            boolean r0 = r7.isShowing()
            if (r0 == 0) goto L26
            android.widget.AdapterView$OnItemClickListener r0 = r7.mItemClickListener
            if (r0 == 0) goto L24
            androidx.appcompat.widget.DropDownListView r2 = r7.mDropDownList
            int r0 = r2.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r3 = r2.getChildAt(r0)
            android.widget.ListAdapter r0 = r2.getAdapter()
            android.widget.AdapterView$OnItemClickListener r1 = r7.mItemClickListener
            long r5 = r0.getItemId(r8)
            r4 = r8
            r1.onItemClick(r2, r3, r4, r5)
        L24:
            r8 = 1
            return r8
        L26:
            r8 = 0
            return r8
    }

    public void postShow() {
            r2 = this;
            android.os.Handler r0 = r2.mHandler
            java.lang.Runnable r1 = r2.mShowDropDownRunnable
            r0.post(r1)
            return
    }

    public void setAdapter(@androidx.annotation.Nullable android.widget.ListAdapter r3) {
            r2 = this;
            android.database.DataSetObserver r0 = r2.mObserver
            if (r0 != 0) goto Lc
            androidx.appcompat.widget.ListPopupWindow$PopupDataSetObserver r0 = new androidx.appcompat.widget.ListPopupWindow$PopupDataSetObserver
            r0.<init>(r2)
            r2.mObserver = r0
            goto L13
        Lc:
            android.widget.ListAdapter r1 = r2.mAdapter
            if (r1 == 0) goto L13
            r1.unregisterDataSetObserver(r0)
        L13:
            r2.mAdapter = r3
            if (r3 == 0) goto L1c
            android.database.DataSetObserver r0 = r2.mObserver
            r3.registerDataSetObserver(r0)
        L1c:
            androidx.appcompat.widget.DropDownListView r3 = r2.mDropDownList
            if (r3 == 0) goto L25
            android.widget.ListAdapter r0 = r2.mAdapter
            r3.setAdapter(r0)
        L25:
            return
    }

    public void setAnchorView(@androidx.annotation.Nullable android.view.View r1) {
            r0 = this;
            r0.mDropDownAnchorView = r1
            return
    }

    public void setAnimationStyle(@androidx.annotation.StyleRes int r2) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            r0.setAnimationStyle(r2)
            return
    }

    public void setBackgroundDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            r0.setBackgroundDrawable(r2)
            return
    }

    public void setContentWidth(int r3) {
            r2 = this;
            android.widget.PopupWindow r0 = r2.mPopup
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L18
            android.graphics.Rect r1 = r2.mTempRect
            r0.getPadding(r1)
            android.graphics.Rect r0 = r2.mTempRect
            int r1 = r0.left
            int r0 = r0.right
            int r1 = r1 + r0
            int r1 = r1 + r3
            r2.mDropDownWidth = r1
            goto L1b
        L18:
            r2.setWidth(r3)
        L1b:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setDropDownAlwaysVisible(boolean r1) {
            r0 = this;
            r0.mDropDownAlwaysVisible = r1
            return
    }

    public void setDropDownGravity(int r1) {
            r0 = this;
            r0.mDropDownGravity = r1
            return
    }

    public void setEpicenterBounds(@androidx.annotation.Nullable android.graphics.Rect r2) {
            r1 = this;
            if (r2 == 0) goto L8
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r2)
            goto L9
        L8:
            r0 = 0
        L9:
            r1.mEpicenterBounds = r0
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setForceIgnoreOutsideTouch(boolean r1) {
            r0 = this;
            r0.mForceIgnoreOutsideTouch = r1
            return
    }

    public void setHeight(int r2) {
            r1 = this;
            if (r2 >= 0) goto L11
            r0 = -2
            if (r0 == r2) goto L11
            r0 = -1
            if (r0 != r2) goto L9
            goto L11
        L9:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT."
            r2.<init>(r0)
            throw r2
        L11:
            r1.mDropDownHeight = r2
            return
    }

    public void setHorizontalOffset(int r1) {
            r0 = this;
            r0.mDropDownHorizontalOffset = r1
            return
    }

    public void setInputMethodMode(int r2) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            r0.setInputMethodMode(r2)
            return
    }

    public void setListSelector(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mDropDownListHighlight = r1
            return
    }

    public void setModal(boolean r2) {
            r1 = this;
            r1.mModal = r2
            android.widget.PopupWindow r0 = r1.mPopup
            r0.setFocusable(r2)
            return
    }

    public void setOnDismissListener(@androidx.annotation.Nullable android.widget.PopupWindow.OnDismissListener r2) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            r0.setOnDismissListener(r2)
            return
    }

    public void setOnItemClickListener(@androidx.annotation.Nullable android.widget.AdapterView.OnItemClickListener r1) {
            r0 = this;
            r0.mItemClickListener = r1
            return
    }

    public void setOnItemSelectedListener(@androidx.annotation.Nullable android.widget.AdapterView.OnItemSelectedListener r1) {
            r0 = this;
            r0.mItemSelectedListener = r1
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverlapAnchor(boolean r2) {
            r1 = this;
            r0 = 1
            r1.mOverlapAnchorSet = r0
            r1.mOverlapAnchor = r2
            return
    }

    public void setPromptPosition(int r1) {
            r0 = this;
            r0.mPromptPosition = r1
            return
    }

    public void setPromptView(@androidx.annotation.Nullable android.view.View r2) {
            r1 = this;
            boolean r0 = r1.isShowing()
            if (r0 == 0) goto L9
            r1.removePromptView()
        L9:
            r1.mPromptView = r2
            if (r0 == 0) goto L10
            r1.show()
        L10:
            return
    }

    public void setSelection(int r3) {
            r2 = this;
            androidx.appcompat.widget.DropDownListView r0 = r2.mDropDownList
            boolean r1 = r2.isShowing()
            if (r1 == 0) goto L1b
            if (r0 == 0) goto L1b
            r1 = 0
            r0.setListSelectionHidden(r1)
            r0.setSelection(r3)
            int r1 = r0.getChoiceMode()
            if (r1 == 0) goto L1b
            r1 = 1
            r0.setItemChecked(r3, r1)
        L1b:
            return
    }

    public void setSoftInputMode(int r2) {
            r1 = this;
            android.widget.PopupWindow r0 = r1.mPopup
            r0.setSoftInputMode(r2)
            return
    }

    public void setVerticalOffset(int r1) {
            r0 = this;
            r0.mDropDownVerticalOffset = r1
            r1 = 1
            r0.mDropDownVerticalOffsetSet = r1
            return
    }

    public void setWidth(int r1) {
            r0 = this;
            r0.mDropDownWidth = r1
            return
    }

    public void setWindowLayoutType(int r1) {
            r0 = this;
            r0.mDropDownWindowLayoutType = r1
            return
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
            r13 = this;
            int r0 = r13.buildDropDown()
            boolean r1 = r13.isInputMethodNotNeeded()
            android.widget.PopupWindow r2 = r13.mPopup
            int r3 = r13.mDropDownWindowLayoutType
            androidx.core.widget.PopupWindowCompat.setWindowLayoutType(r2, r3)
            android.widget.PopupWindow r2 = r13.mPopup
            boolean r2 = r2.isShowing()
            r3 = 1
            r4 = -2
            r5 = 0
            r6 = -1
            if (r2 == 0) goto L90
            android.view.View r2 = r13.getAnchorView()
            boolean r2 = androidx.core.view.ViewCompat.isAttachedToWindow(r2)
            if (r2 != 0) goto L26
            return
        L26:
            int r2 = r13.mDropDownWidth
            if (r2 != r6) goto L2c
            r2 = -1
            goto L36
        L2c:
            if (r2 != r4) goto L36
            android.view.View r2 = r13.getAnchorView()
            int r2 = r2.getWidth()
        L36:
            int r7 = r13.mDropDownHeight
            if (r7 != r6) goto L64
            if (r1 == 0) goto L3d
            goto L3e
        L3d:
            r0 = -1
        L3e:
            if (r1 == 0) goto L52
            android.widget.PopupWindow r1 = r13.mPopup
            int r4 = r13.mDropDownWidth
            if (r4 != r6) goto L48
            r4 = -1
            goto L49
        L48:
            r4 = 0
        L49:
            r1.setWidth(r4)
            android.widget.PopupWindow r1 = r13.mPopup
            r1.setHeight(r5)
            goto L68
        L52:
            android.widget.PopupWindow r1 = r13.mPopup
            int r4 = r13.mDropDownWidth
            if (r4 != r6) goto L5a
            r4 = -1
            goto L5b
        L5a:
            r4 = 0
        L5b:
            r1.setWidth(r4)
            android.widget.PopupWindow r1 = r13.mPopup
            r1.setHeight(r6)
            goto L68
        L64:
            if (r7 != r4) goto L67
            goto L68
        L67:
            r0 = r7
        L68:
            android.widget.PopupWindow r1 = r13.mPopup
            boolean r4 = r13.mForceIgnoreOutsideTouch
            if (r4 != 0) goto L73
            boolean r4 = r13.mDropDownAlwaysVisible
            if (r4 != 0) goto L73
            goto L74
        L73:
            r3 = 0
        L74:
            r1.setOutsideTouchable(r3)
            android.widget.PopupWindow r7 = r13.mPopup
            android.view.View r8 = r13.getAnchorView()
            int r9 = r13.mDropDownHorizontalOffset
            int r10 = r13.mDropDownVerticalOffset
            if (r2 >= 0) goto L85
            r11 = -1
            goto L86
        L85:
            r11 = r2
        L86:
            if (r0 >= 0) goto L8a
            r12 = -1
            goto L8b
        L8a:
            r12 = r0
        L8b:
            r7.update(r8, r9, r10, r11, r12)
            goto L12d
        L90:
            int r1 = r13.mDropDownWidth
            if (r1 != r6) goto L96
            r1 = -1
            goto La0
        L96:
            if (r1 != r4) goto La0
            android.view.View r1 = r13.getAnchorView()
            int r1 = r1.getWidth()
        La0:
            int r2 = r13.mDropDownHeight
            if (r2 != r6) goto La6
            r0 = -1
            goto Laa
        La6:
            if (r2 != r4) goto La9
            goto Laa
        La9:
            r0 = r2
        Laa:
            android.widget.PopupWindow r2 = r13.mPopup
            r2.setWidth(r1)
            android.widget.PopupWindow r1 = r13.mPopup
            r1.setHeight(r0)
            r13.setPopupClipToScreenEnabled(r3)
            android.widget.PopupWindow r0 = r13.mPopup
            boolean r1 = r13.mForceIgnoreOutsideTouch
            if (r1 != 0) goto Lc3
            boolean r1 = r13.mDropDownAlwaysVisible
            if (r1 != 0) goto Lc3
            r1 = 1
            goto Lc4
        Lc3:
            r1 = 0
        Lc4:
            r0.setOutsideTouchable(r1)
            android.widget.PopupWindow r0 = r13.mPopup
            androidx.appcompat.widget.ListPopupWindow$PopupTouchInterceptor r1 = r13.mTouchInterceptor
            r0.setTouchInterceptor(r1)
            boolean r0 = r13.mOverlapAnchorSet
            if (r0 == 0) goto Ld9
            android.widget.PopupWindow r0 = r13.mPopup
            boolean r1 = r13.mOverlapAnchor
            androidx.core.widget.PopupWindowCompat.setOverlapAnchor(r0, r1)
        Ld9:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 > r1) goto Lf8
            java.lang.reflect.Method r0 = androidx.appcompat.widget.ListPopupWindow.sSetEpicenterBoundsMethod
            if (r0 == 0) goto Lff
            android.widget.PopupWindow r1 = r13.mPopup     // Catch: java.lang.Exception -> Lef
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> Lef
            android.graphics.Rect r3 = r13.mEpicenterBounds     // Catch: java.lang.Exception -> Lef
            r2[r5] = r3     // Catch: java.lang.Exception -> Lef
            r0.invoke(r1, r2)     // Catch: java.lang.Exception -> Lef
            goto Lff
        Lef:
            r0 = move-exception
            java.lang.String r1 = "ListPopupWindow"
            java.lang.String r2 = "Could not invoke setEpicenterBounds on PopupWindow"
            android.util.Log.e(r1, r2, r0)
            goto Lff
        Lf8:
            android.widget.PopupWindow r0 = r13.mPopup
            android.graphics.Rect r1 = r13.mEpicenterBounds
            androidx.appcompat.widget.ListPopupWindow.Api29Impl.setEpicenterBounds(r0, r1)
        Lff:
            android.widget.PopupWindow r0 = r13.mPopup
            android.view.View r1 = r13.getAnchorView()
            int r2 = r13.mDropDownHorizontalOffset
            int r3 = r13.mDropDownVerticalOffset
            int r4 = r13.mDropDownGravity
            androidx.core.widget.PopupWindowCompat.showAsDropDown(r0, r1, r2, r3, r4)
            androidx.appcompat.widget.DropDownListView r0 = r13.mDropDownList
            r0.setSelection(r6)
            boolean r0 = r13.mModal
            if (r0 == 0) goto L11f
            androidx.appcompat.widget.DropDownListView r0 = r13.mDropDownList
            boolean r0 = r0.isInTouchMode()
            if (r0 == 0) goto L122
        L11f:
            r13.clearListSelection()
        L122:
            boolean r0 = r13.mModal
            if (r0 != 0) goto L12d
            android.os.Handler r0 = r13.mHandler
            androidx.appcompat.widget.ListPopupWindow$ListSelectorHider r1 = r13.mHideSelector
            r0.post(r1)
        L12d:
            return
    }
}
