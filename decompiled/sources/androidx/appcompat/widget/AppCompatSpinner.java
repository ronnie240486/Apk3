package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
public class AppCompatSpinner extends android.widget.Spinner implements androidx.core.view.TintableBackgroundView {

    @android.annotation.SuppressLint({"ResourceType"})
    @androidx.annotation.StyleableRes
    private static final int[] ATTRS_ANDROID_SPINNERMODE = null;
    private static final int MAX_ITEMS_MEASURED = 15;
    private static final int MODE_DIALOG = 0;
    private static final int MODE_DROPDOWN = 1;
    private static final int MODE_THEME = -1;
    private static final java.lang.String TAG = "AppCompatSpinner";
    private final androidx.appcompat.widget.AppCompatBackgroundHelper mBackgroundTintHelper;
    public int mDropDownWidth;
    private androidx.appcompat.widget.ForwardingListener mForwardingListener;
    private androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup mPopup;
    private final android.content.Context mPopupContext;
    private final boolean mPopupSet;
    private android.widget.SpinnerAdapter mTempAdapter;
    public final android.graphics.Rect mTempRect;



    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(16)
    public static final class Api16Impl {
        private Api16Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void removeOnGlobalLayoutListener(@androidx.annotation.NonNull android.view.ViewTreeObserver r0, @androidx.annotation.Nullable android.view.ViewTreeObserver.OnGlobalLayoutListener r1) {
                r0.removeOnGlobalLayoutListener(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(17)
    public static final class Api17Impl {
        private Api17Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static int getTextAlignment(@androidx.annotation.NonNull android.view.View r0) {
                int r0 = r0.getTextAlignment()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getTextDirection(@androidx.annotation.NonNull android.view.View r0) {
                int r0 = r0.getTextDirection()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setTextAlignment(@androidx.annotation.NonNull android.view.View r0, int r1) {
                r0.setTextAlignment(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setTextDirection(@androidx.annotation.NonNull android.view.View r0, int r1) {
                r0.setTextDirection(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(23)
    public static final class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setDropDownViewTheme(@androidx.annotation.NonNull android.widget.ThemedSpinnerAdapter r1, @androidx.annotation.Nullable android.content.res.Resources.Theme r2) {
                android.content.res.Resources$Theme r0 = r1.getDropDownViewTheme()
                boolean r0 = androidx.core.util.ObjectsCompat.equals(r0, r2)
                if (r0 != 0) goto Ld
                r1.setDropDownViewTheme(r2)
            Ld:
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.VisibleForTesting
    public class DialogPopup implements androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup, android.content.DialogInterface.OnClickListener {
        private android.widget.ListAdapter mListAdapter;

        @androidx.annotation.VisibleForTesting
        public androidx.appcompat.app.AlertDialog mPopup;
        private java.lang.CharSequence mPrompt;
        public final /* synthetic */ androidx.appcompat.widget.AppCompatSpinner this$0;

        public DialogPopup(androidx.appcompat.widget.AppCompatSpinner r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void dismiss() {
                r1 = this;
                androidx.appcompat.app.AlertDialog r0 = r1.mPopup
                if (r0 == 0) goto La
                r0.dismiss()
                r0 = 0
                r1.mPopup = r0
            La:
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public android.graphics.drawable.Drawable getBackground() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public java.lang.CharSequence getHintText() {
                r1 = this;
                java.lang.CharSequence r0 = r1.mPrompt
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public int getHorizontalOffset() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public int getHorizontalOriginalOffset() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public int getVerticalOffset() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public boolean isShowing() {
                r1 = this;
                androidx.appcompat.app.AlertDialog r0 = r1.mPopup
                if (r0 == 0) goto L9
                boolean r0 = r0.isShowing()
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r4, int r5) {
                r3 = this;
                androidx.appcompat.widget.AppCompatSpinner r4 = r3.this$0
                r4.setSelection(r5)
                androidx.appcompat.widget.AppCompatSpinner r4 = r3.this$0
                android.widget.AdapterView$OnItemClickListener r4 = r4.getOnItemClickListener()
                if (r4 == 0) goto L19
                androidx.appcompat.widget.AppCompatSpinner r4 = r3.this$0
                r0 = 0
                android.widget.ListAdapter r1 = r3.mListAdapter
                long r1 = r1.getItemId(r5)
                r4.performItemClick(r0, r5, r1)
            L19:
                r3.dismiss()
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setAdapter(android.widget.ListAdapter r1) {
                r0 = this;
                r0.mListAdapter = r1
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
                r1 = this;
                java.lang.String r2 = "AppCompatSpinner"
                java.lang.String r0 = "Cannot set popup background for MODE_DIALOG, ignoring"
                android.util.Log.e(r2, r0)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setHorizontalOffset(int r2) {
                r1 = this;
                java.lang.String r2 = "AppCompatSpinner"
                java.lang.String r0 = "Cannot set horizontal offset for MODE_DIALOG, ignoring"
                android.util.Log.e(r2, r0)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setHorizontalOriginalOffset(int r2) {
                r1 = this;
                java.lang.String r2 = "AppCompatSpinner"
                java.lang.String r0 = "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring"
                android.util.Log.e(r2, r0)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setPromptText(java.lang.CharSequence r1) {
                r0 = this;
                r0.mPrompt = r1
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setVerticalOffset(int r2) {
                r1 = this;
                java.lang.String r2 = "AppCompatSpinner"
                java.lang.String r0 = "Cannot set vertical offset for MODE_DIALOG, ignoring"
                android.util.Log.e(r2, r0)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void show(int r4, int r5) {
                r3 = this;
                android.widget.ListAdapter r0 = r3.mListAdapter
                if (r0 != 0) goto L5
                return
            L5:
                androidx.appcompat.app.AlertDialog$Builder r0 = new androidx.appcompat.app.AlertDialog$Builder
                androidx.appcompat.widget.AppCompatSpinner r1 = r3.this$0
                android.content.Context r1 = r1.getPopupContext()
                r0.<init>(r1)
                java.lang.CharSequence r1 = r3.mPrompt
                if (r1 == 0) goto L17
                r0.setTitle(r1)
            L17:
                android.widget.ListAdapter r1 = r3.mListAdapter
                androidx.appcompat.widget.AppCompatSpinner r2 = r3.this$0
                int r2 = r2.getSelectedItemPosition()
                androidx.appcompat.app.AlertDialog$Builder r0 = r0.setSingleChoiceItems(r1, r2, r3)
                androidx.appcompat.app.AlertDialog r0 = r0.create()
                r3.mPopup = r0
                android.widget.ListView r0 = r0.getListView()
                androidx.appcompat.widget.AppCompatSpinner.Api17Impl.setTextDirection(r0, r4)
                androidx.appcompat.widget.AppCompatSpinner.Api17Impl.setTextAlignment(r0, r5)
                androidx.appcompat.app.AlertDialog r4 = r3.mPopup
                r4.show()
                return
        }
    }

    public static class DropDownAdapter implements android.widget.ListAdapter, android.widget.SpinnerAdapter {
        private android.widget.SpinnerAdapter mAdapter;
        private android.widget.ListAdapter mListAdapter;

        public DropDownAdapter(@androidx.annotation.Nullable android.widget.SpinnerAdapter r3, @androidx.annotation.Nullable android.content.res.Resources.Theme r4) {
                r2 = this;
                r2.<init>()
                r2.mAdapter = r3
                boolean r0 = r3 instanceof android.widget.ListAdapter
                if (r0 == 0) goto Le
                r0 = r3
                android.widget.ListAdapter r0 = (android.widget.ListAdapter) r0
                r2.mListAdapter = r0
            Le:
                if (r4 == 0) goto L2f
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 < r1) goto L20
                boolean r0 = r3 instanceof android.widget.ThemedSpinnerAdapter
                if (r0 == 0) goto L20
                android.widget.ThemedSpinnerAdapter r3 = (android.widget.ThemedSpinnerAdapter) r3
                androidx.appcompat.widget.AppCompatSpinner.Api23Impl.setDropDownViewTheme(r3, r4)
                goto L2f
            L20:
                boolean r0 = r3 instanceof androidx.appcompat.widget.ThemedSpinnerAdapter
                if (r0 == 0) goto L2f
                androidx.appcompat.widget.ThemedSpinnerAdapter r3 = (androidx.appcompat.widget.ThemedSpinnerAdapter) r3
                android.content.res.Resources$Theme r0 = r3.getDropDownViewTheme()
                if (r0 != 0) goto L2f
                r3.setDropDownViewTheme(r4)
            L2f:
                return
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
                r1 = this;
                android.widget.ListAdapter r0 = r1.mListAdapter
                if (r0 == 0) goto L9
                boolean r0 = r0.areAllItemsEnabled()
                return r0
            L9:
                r0 = 1
                return r0
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                int r0 = r0.getCount()
            La:
                return r0
        }

        @Override // android.widget.SpinnerAdapter
        public android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                if (r0 != 0) goto L6
                r2 = 0
                goto La
            L6:
                android.view.View r2 = r0.getDropDownView(r2, r3, r4)
            La:
                return r2
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int r2) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                if (r0 != 0) goto L6
                r2 = 0
                goto La
            L6:
                java.lang.Object r2 = r0.getItem(r2)
            La:
                return r2
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                android.widget.SpinnerAdapter r0 = r2.mAdapter
                if (r0 != 0) goto L7
                r0 = -1
                goto Lb
            L7:
                long r0 = r0.getItemId(r3)
            Lb:
                return r0
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
                r0 = this;
                android.view.View r1 = r0.getDropDownView(r1, r2, r3)
                return r1
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                if (r0 == 0) goto Lc
                boolean r0 = r0.hasStableIds()
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
                r1 = this;
                int r0 = r1.getCount()
                if (r0 != 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int r2) {
                r1 = this;
                android.widget.ListAdapter r0 = r1.mListAdapter
                if (r0 == 0) goto L9
                boolean r2 = r0.isEnabled(r2)
                return r2
            L9:
                r2 = 1
                return r2
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(android.database.DataSetObserver r2) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                if (r0 == 0) goto L7
                r0.registerDataSetObserver(r2)
            L7:
                return
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(android.database.DataSetObserver r2) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.mAdapter
                if (r0 == 0) goto L7
                r0.unregisterDataSetObserver(r2)
            L7:
                return
        }
    }

    @androidx.annotation.VisibleForTesting
    public class DropdownPopup extends androidx.appcompat.widget.ListPopupWindow implements androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup {
        public android.widget.ListAdapter mAdapter;
        private java.lang.CharSequence mHintText;
        private int mOriginalHorizontalOffset;
        private final android.graphics.Rect mVisibleRect;
        public final /* synthetic */ androidx.appcompat.widget.AppCompatSpinner this$0;




        public DropdownPopup(androidx.appcompat.widget.AppCompatSpinner r1, android.content.Context r2, android.util.AttributeSet r3, int r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2, r3, r4)
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r0.mVisibleRect = r2
                r0.setAnchorView(r1)
                r1 = 1
                r0.setModal(r1)
                r1 = 0
                r0.setPromptPosition(r1)
                androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$1 r1 = new androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$1
                r1.<init>(r0)
                r0.setOnItemClickListener(r1)
                return
        }

        public static /* synthetic */ void access$001(androidx.appcompat.widget.AppCompatSpinner.DropdownPopup r0) {
                super.show()
                return
        }

        public final void computeContentWidth() {
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.getBackground()
                r1 = 0
                if (r0 == 0) goto L26
                androidx.appcompat.widget.AppCompatSpinner r1 = r8.this$0
                android.graphics.Rect r1 = r1.mTempRect
                r0.getPadding(r1)
                androidx.appcompat.widget.AppCompatSpinner r0 = r8.this$0
                boolean r0 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r0)
                if (r0 == 0) goto L1d
                androidx.appcompat.widget.AppCompatSpinner r0 = r8.this$0
                android.graphics.Rect r0 = r0.mTempRect
                int r0 = r0.right
                goto L24
            L1d:
                androidx.appcompat.widget.AppCompatSpinner r0 = r8.this$0
                android.graphics.Rect r0 = r0.mTempRect
                int r0 = r0.left
                int r0 = -r0
            L24:
                r1 = r0
                goto L2e
            L26:
                androidx.appcompat.widget.AppCompatSpinner r0 = r8.this$0
                android.graphics.Rect r0 = r0.mTempRect
                r0.right = r1
                r0.left = r1
            L2e:
                androidx.appcompat.widget.AppCompatSpinner r0 = r8.this$0
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.AppCompatSpinner r2 = r8.this$0
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.AppCompatSpinner r3 = r8.this$0
                int r3 = r3.getWidth()
                androidx.appcompat.widget.AppCompatSpinner r4 = r8.this$0
                int r5 = r4.mDropDownWidth
                r6 = -2
                if (r5 != r6) goto L7b
                android.widget.ListAdapter r5 = r8.mAdapter
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.getBackground()
                int r4 = r4.compatMeasureContentWidth(r5, r6)
                androidx.appcompat.widget.AppCompatSpinner r5 = r8.this$0
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.AppCompatSpinner r6 = r8.this$0
                android.graphics.Rect r6 = r6.mTempRect
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                r8.setContentWidth(r4)
                goto L88
            L7b:
                r4 = -1
                if (r5 != r4) goto L85
                int r4 = r3 - r0
                int r4 = r4 - r2
                r8.setContentWidth(r4)
                goto L88
            L85:
                r8.setContentWidth(r5)
            L88:
                androidx.appcompat.widget.AppCompatSpinner r4 = r8.this$0
                boolean r4 = androidx.appcompat.widget.ViewUtils.isLayoutRtl(r4)
                if (r4 == 0) goto L9d
                int r3 = r3 - r2
                int r0 = r8.getWidth()
                int r3 = r3 - r0
                int r0 = r8.getHorizontalOriginalOffset()
                int r3 = r3 - r0
                int r3 = r3 + r1
                goto La4
            L9d:
                int r2 = r8.getHorizontalOriginalOffset()
                int r0 = r0 + r2
                int r3 = r0 + r1
            La4:
                r8.setHorizontalOffset(r3)
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public java.lang.CharSequence getHintText() {
                r1 = this;
                java.lang.CharSequence r0 = r1.mHintText
                return r0
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public int getHorizontalOriginalOffset() {
                r1 = this;
                int r0 = r1.mOriginalHorizontalOffset
                return r0
        }

        public final boolean isVisibleToUser(android.view.View r2) {
                r1 = this;
                boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r2)
                if (r0 == 0) goto L10
                android.graphics.Rect r0 = r1.mVisibleRect
                boolean r2 = r2.getGlobalVisibleRect(r0)
                if (r2 == 0) goto L10
                r2 = 1
                goto L11
            L10:
                r2 = 0
            L11:
                return r2
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setAdapter(android.widget.ListAdapter r1) {
                r0 = this;
                super.setAdapter(r1)
                r0.mAdapter = r1
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setHorizontalOriginalOffset(int r1) {
                r0 = this;
                r0.mOriginalHorizontalOffset = r1
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void setPromptText(java.lang.CharSequence r1) {
                r0 = this;
                r0.mHintText = r1
                return
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup
        public void show(int r4, int r5) {
                r3 = this;
                boolean r0 = r3.isShowing()
                r3.computeContentWidth()
                r1 = 2
                r3.setInputMethodMode(r1)
                super.show()
                android.widget.ListView r1 = r3.getListView()
                r2 = 1
                r1.setChoiceMode(r2)
                androidx.appcompat.widget.AppCompatSpinner.Api17Impl.setTextDirection(r1, r4)
                androidx.appcompat.widget.AppCompatSpinner.Api17Impl.setTextAlignment(r1, r5)
                androidx.appcompat.widget.AppCompatSpinner r4 = r3.this$0
                int r4 = r4.getSelectedItemPosition()
                r3.setSelection(r4)
                if (r0 == 0) goto L28
                return
            L28:
                androidx.appcompat.widget.AppCompatSpinner r4 = r3.this$0
                android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()
                if (r4 == 0) goto L40
                androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$2 r5 = new androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$2
                r5.<init>(r3)
                r4.addOnGlobalLayoutListener(r5)
                androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$3 r4 = new androidx.appcompat.widget.AppCompatSpinner$DropdownPopup$3
                r4.<init>(r3, r5)
                r3.setOnDismissListener(r4)
            L40:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.appcompat.widget.AppCompatSpinner.SavedState> CREATOR = null;
        public boolean mShowDropdown;


        static {
                androidx.appcompat.widget.AppCompatSpinner$SavedState$1 r0 = new androidx.appcompat.widget.AppCompatSpinner$SavedState$1
                r0.<init>()
                androidx.appcompat.widget.AppCompatSpinner.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r1) {
                r0 = this;
                r0.<init>(r1)
                byte r1 = r1.readByte()
                if (r1 == 0) goto Lb
                r1 = 1
                goto Lc
            Lb:
                r1 = 0
            Lc:
                r0.mShowDropdown = r1
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                boolean r2 = r0.mShowDropdown
                byte r2 = (byte) r2
                r1.writeByte(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.VisibleForTesting
    public interface SpinnerPopup {
        void dismiss();

        android.graphics.drawable.Drawable getBackground();

        java.lang.CharSequence getHintText();

        int getHorizontalOffset();

        int getHorizontalOriginalOffset();

        int getVerticalOffset();

        boolean isShowing();

        void setAdapter(android.widget.ListAdapter r1);

        void setBackgroundDrawable(android.graphics.drawable.Drawable r1);

        void setHorizontalOffset(int r1);

        void setHorizontalOriginalOffset(int r1);

        void setPromptText(java.lang.CharSequence r1);

        void setVerticalOffset(int r1);

        void show(int r1, int r2);
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843505(0x10102f1, float:2.3695668E-38)
            r0[r1] = r2
            androidx.appcompat.widget.AppCompatSpinner.ATTRS_ANDROID_SPINNERMODE = r0
            return
    }

    public AppCompatSpinner(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppCompatSpinner(@androidx.annotation.NonNull android.content.Context r3, int r4) {
            r2 = this;
            int r0 = androidx.appcompat.R.attr.spinnerStyle
            r1 = 0
            r2.<init>(r3, r1, r0, r4)
            return
    }

    public AppCompatSpinner(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            int r0 = androidx.appcompat.R.attr.spinnerStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public AppCompatSpinner(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3, int r4) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public AppCompatSpinner(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9, int r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public AppCompatSpinner(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.mTempRect = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.ThemeUtils.checkAppCompatTheme(r6, r0)
            int[] r0 = androidx.appcompat.R.styleable.Spinner
            r1 = 0
            androidx.appcompat.widget.TintTypedArray r0 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.AppCompatBackgroundHelper r2 = new androidx.appcompat.widget.AppCompatBackgroundHelper
            r2.<init>(r6)
            r6.mBackgroundTintHelper = r2
            if (r11 == 0) goto L29
            androidx.appcompat.view.ContextThemeWrapper r2 = new androidx.appcompat.view.ContextThemeWrapper
            r2.<init>(r7, r11)
            r6.mPopupContext = r2
            goto L3b
        L29:
            int r11 = androidx.appcompat.R.styleable.Spinner_popupTheme
            int r11 = r0.getResourceId(r11, r1)
            if (r11 == 0) goto L39
            androidx.appcompat.view.ContextThemeWrapper r2 = new androidx.appcompat.view.ContextThemeWrapper
            r2.<init>(r7, r11)
            r6.mPopupContext = r2
            goto L3b
        L39:
            r6.mPopupContext = r7
        L3b:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L6b
            int[] r11 = androidx.appcompat.widget.AppCompatSpinner.ATTRS_ANDROID_SPINNERMODE     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            boolean r3 = r11.hasValue(r1)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L63
            if (r3 == 0) goto L4f
            int r10 = r11.getInt(r1, r1)     // Catch: java.lang.Exception -> L53 java.lang.Throwable -> L63
        L4f:
            r11.recycle()
            goto L6b
        L53:
            r3 = move-exception
            goto L59
        L55:
            r7 = move-exception
            goto L65
        L57:
            r3 = move-exception
            r11 = r2
        L59:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L63
            if (r11 == 0) goto L6b
            goto L4f
        L63:
            r7 = move-exception
            r2 = r11
        L65:
            if (r2 == 0) goto L6a
            r2.recycle()
        L6a:
            throw r7
        L6b:
            r11 = 1
            if (r10 == 0) goto La8
            if (r10 == r11) goto L71
            goto Lb8
        L71:
            androidx.appcompat.widget.AppCompatSpinner$DropdownPopup r10 = new androidx.appcompat.widget.AppCompatSpinner$DropdownPopup
            android.content.Context r3 = r6.mPopupContext
            r10.<init>(r6, r3, r8, r9)
            android.content.Context r3 = r6.mPopupContext
            int[] r4 = androidx.appcompat.R.styleable.Spinner
            androidx.appcompat.widget.TintTypedArray r1 = androidx.appcompat.widget.TintTypedArray.obtainStyledAttributes(r3, r8, r4, r9, r1)
            int r3 = androidx.appcompat.R.styleable.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.getLayoutDimension(r3, r4)
            r6.mDropDownWidth = r3
            int r3 = androidx.appcompat.R.styleable.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r3)
            r10.setBackgroundDrawable(r3)
            int r3 = androidx.appcompat.R.styleable.Spinner_android_prompt
            java.lang.String r3 = r0.getString(r3)
            r10.setPromptText(r3)
            r1.recycle()
            r6.mPopup = r10
            androidx.appcompat.widget.AppCompatSpinner$1 r1 = new androidx.appcompat.widget.AppCompatSpinner$1
            r1.<init>(r6, r6, r10)
            r6.mForwardingListener = r1
            goto Lb8
        La8:
            androidx.appcompat.widget.AppCompatSpinner$DialogPopup r10 = new androidx.appcompat.widget.AppCompatSpinner$DialogPopup
            r10.<init>(r6)
            r6.mPopup = r10
            int r1 = androidx.appcompat.R.styleable.Spinner_android_prompt
            java.lang.String r1 = r0.getString(r1)
            r10.setPromptText(r1)
        Lb8:
            int r10 = androidx.appcompat.R.styleable.Spinner_android_entries
            java.lang.CharSequence[] r10 = r0.getTextArray(r10)
            if (r10 == 0) goto Ld0
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = androidx.appcompat.R.layout.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter(r1)
        Ld0:
            r0.recycle()
            r6.mPopupSet = r11
            android.widget.SpinnerAdapter r7 = r6.mTempAdapter
            if (r7 == 0) goto Lde
            r6.setAdapter(r7)
            r6.mTempAdapter = r2
        Lde:
            androidx.appcompat.widget.AppCompatBackgroundHelper r7 = r6.mBackgroundTintHelper
            r7.loadFromAttributes(r8, r9)
            return
    }

    public final int compatMeasureContentWidth(android.widget.SpinnerAdapter r11, android.graphics.drawable.Drawable r12) {
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            int r1 = r10.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r2 = r10.getMeasuredHeight()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            int r3 = r10.getSelectedItemPosition()
            int r3 = java.lang.Math.max(r0, r3)
            int r4 = r11.getCount()
            int r5 = r3 + 15
            int r4 = java.lang.Math.min(r4, r5)
            int r5 = r4 - r3
            int r5 = 15 - r5
            int r3 = r3 - r5
            int r3 = java.lang.Math.max(r0, r3)
            r5 = 0
            r6 = r3
            r7 = r5
            r3 = 0
        L33:
            if (r6 >= r4) goto L5e
            int r8 = r11.getItemViewType(r6)
            if (r8 == r0) goto L3d
            r7 = r5
            r0 = r8
        L3d:
            android.view.View r7 = r11.getView(r6, r7, r10)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            if (r8 != 0) goto L50
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams
            r9 = -2
            r8.<init>(r9, r9)
            r7.setLayoutParams(r8)
        L50:
            r7.measure(r1, r2)
            int r8 = r7.getMeasuredWidth()
            int r3 = java.lang.Math.max(r3, r8)
            int r6 = r6 + 1
            goto L33
        L5e:
            if (r12 == 0) goto L6d
            android.graphics.Rect r11 = r10.mTempRect
            r12.getPadding(r11)
            android.graphics.Rect r11 = r10.mTempRect
            int r12 = r11.left
            int r11 = r11.right
            int r12 = r12 + r11
            int r3 = r3 + r12
        L6d:
            return r3
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto La
            r0.applySupportBackgroundTint()
        La:
            return
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L9
            int r0 = r0.getHorizontalOffset()
            return r0
        L9:
            int r0 = super.getDropDownHorizontalOffset()
            return r0
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L9
            int r0 = r0.getVerticalOffset()
            return r0
        L9:
            int r0 = super.getDropDownVerticalOffset()
            return r0
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L7
            int r0 = r1.mDropDownWidth
            return r0
        L7:
            int r0 = super.getDropDownWidth()
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public final androidx.appcompat.widget.AppCompatSpinner.SpinnerPopup getInternalPopup() {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            return r0
    }

    @Override // android.widget.Spinner
    public android.graphics.drawable.Drawable getPopupBackground() {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            return r0
        L9:
            android.graphics.drawable.Drawable r0 = super.getPopupBackground()
            return r0
    }

    @Override // android.widget.Spinner
    public android.content.Context getPopupContext() {
            r1 = this;
            android.content.Context r0 = r1.mPopupContext
            return r0
    }

    @Override // android.widget.Spinner
    public java.lang.CharSequence getPrompt() {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.getHintText()
            goto Ld
        L9:
            java.lang.CharSequence r0 = super.getPrompt()
        Ld:
            return r0
    }

    @Override // androidx.core.view.TintableBackgroundView
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getSupportBackgroundTintList()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // androidx.core.view.TintableBackgroundView
    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.getSupportBackgroundTintMode()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L12
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L12
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            r0.dismiss()
        L12:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int r3, int r4) {
            r2 = this;
            super.onMeasure(r3, r4)
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r4 = r2.mPopup
            if (r4 == 0) goto L32
            int r4 = android.view.View.MeasureSpec.getMode(r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r0) goto L32
            int r4 = r2.getMeasuredWidth()
            android.widget.SpinnerAdapter r0 = r2.getAdapter()
            android.graphics.drawable.Drawable r1 = r2.getBackground()
            int r0 = r2.compatMeasureContentWidth(r0, r1)
            int r4 = java.lang.Math.max(r4, r0)
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r3 = java.lang.Math.min(r4, r3)
            int r4 = r2.getMeasuredHeight()
            r2.setMeasuredDimension(r3, r4)
        L32:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SavedState r2 = (androidx.appcompat.widget.AppCompatSpinner.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.mShowDropdown
            if (r2 == 0) goto L1b
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            if (r2 == 0) goto L1b
            androidx.appcompat.widget.AppCompatSpinner$2 r0 = new androidx.appcompat.widget.AppCompatSpinner$2
            r0.<init>(r1)
            r2.addOnGlobalLayoutListener(r0)
        L1b:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            androidx.appcompat.widget.AppCompatSpinner$SavedState r0 = new androidx.appcompat.widget.AppCompatSpinner$SavedState
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r1 = r2.mPopup
            if (r1 == 0) goto L15
            boolean r1 = r1.isShowing()
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            r0.mShowDropdown = r1
            return r0
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            androidx.appcompat.widget.ForwardingListener r0 = r1.mForwardingListener
            if (r0 == 0) goto Lc
            boolean r0 = r0.onTouch(r1, r2)
            if (r0 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            boolean r2 = super.onTouchEvent(r2)
            return r2
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto Lf
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto Ld
            r1.showPopup()
        Ld:
            r0 = 1
            return r0
        Lf:
            boolean r0 = super.performClick()
            return r0
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(android.widget.Adapter r1) {
            r0 = this;
            android.widget.SpinnerAdapter r1 = (android.widget.SpinnerAdapter) r1
            r0.setAdapter(r1)
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(android.widget.SpinnerAdapter r4) {
            r3 = this;
            boolean r0 = r3.mPopupSet
            if (r0 != 0) goto L7
            r3.mTempAdapter = r4
            return
        L7:
            super.setAdapter(r4)
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r3.mPopup
            if (r0 == 0) goto L24
            android.content.Context r0 = r3.mPopupContext
            if (r0 != 0) goto L16
            android.content.Context r0 = r3.getContext()
        L16:
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r1 = r3.mPopup
            androidx.appcompat.widget.AppCompatSpinner$DropDownAdapter r2 = new androidx.appcompat.widget.AppCompatSpinner$DropDownAdapter
            android.content.res.Resources$Theme r0 = r0.getTheme()
            r2.<init>(r4, r0)
            r1.setAdapter(r2)
        L24:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            androidx.appcompat.widget.AppCompatBackgroundHelper r1 = r0.mBackgroundTintHelper
            if (r1 == 0) goto La
            r1.onSetBackgroundDrawable()
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto La
            r0.onSetBackgroundResource(r2)
        La:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto Ld
            r0.setHorizontalOriginalOffset(r2)
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            r0.setHorizontalOffset(r2)
            goto L10
        Ld:
            super.setDropDownHorizontalOffset(r2)
        L10:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L8
            r0.setVerticalOffset(r2)
            goto Lb
        L8:
            super.setDropDownVerticalOffset(r2)
        Lb:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L7
            r1.mDropDownWidth = r2
            goto La
        L7:
            super.setDropDownWidth(r2)
        La:
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L8
            r0.setBackgroundDrawable(r2)
            goto Lb
        L8:
            super.setPopupBackgroundDrawable(r2)
        Lb:
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            android.content.Context r0 = r1.getPopupContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setPopupBackgroundDrawable(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPrompt(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r1.mPopup
            if (r0 == 0) goto L8
            r0.setPromptText(r2)
            goto Lb
        L8:
            super.setPrompt(r2)
        Lb:
            return
    }

    @Override // androidx.core.view.TintableBackgroundView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.Nullable android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L7
            r0.setSupportBackgroundTintList(r2)
        L7:
            return
    }

    @Override // androidx.core.view.TintableBackgroundView
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatBackgroundHelper r0 = r1.mBackgroundTintHelper
            if (r0 == 0) goto L7
            r0.setSupportBackgroundTintMode(r2)
        L7:
            return
    }

    public final void showPopup() {
            r3 = this;
            androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup r0 = r3.mPopup
            int r1 = androidx.appcompat.widget.AppCompatSpinner.Api17Impl.getTextDirection(r3)
            int r2 = androidx.appcompat.widget.AppCompatSpinner.Api17Impl.getTextAlignment(r3)
            r0.show(r1, r2)
            return
    }
}
