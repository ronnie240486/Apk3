package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class GuidedActionAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter {
    private final androidx.leanback.widget.GuidedActionAdapter.ActionAutofillListener mActionAutofillListener;
    private final androidx.leanback.widget.GuidedActionAdapter.ActionEditListener mActionEditListener;
    private final androidx.leanback.widget.GuidedActionAdapter.ActionOnFocusListener mActionOnFocusListener;
    private final androidx.leanback.widget.GuidedActionAdapter.ActionOnKeyListener mActionOnKeyListener;
    public final java.util.List<androidx.leanback.widget.GuidedAction> mActions;
    private androidx.leanback.widget.GuidedActionAdapter.ClickListener mClickListener;
    public androidx.leanback.widget.DiffCallback<androidx.leanback.widget.GuidedAction> mDiffCallback;
    public androidx.leanback.widget.GuidedActionAdapterGroup mGroup;
    private final boolean mIsSubAdapter;
    private final android.view.View.OnClickListener mOnClickListener;
    public final androidx.leanback.widget.GuidedActionsStylist mStylist;



    /* JADX INFO: loaded from: classes2.dex */
    public class ActionAutofillListener implements androidx.leanback.widget.GuidedActionAutofillSupport.OnAutofillListener {
        public final /* synthetic */ androidx.leanback.widget.GuidedActionAdapter this$0;

        public ActionAutofillListener(androidx.leanback.widget.GuidedActionAdapter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.leanback.widget.GuidedActionAutofillSupport.OnAutofillListener
        public void onAutofill(android.view.View r3) {
                r2 = this;
                androidx.leanback.widget.GuidedActionAdapter r0 = r2.this$0
                androidx.leanback.widget.GuidedActionAdapterGroup r1 = r0.mGroup
                android.widget.EditText r3 = (android.widget.EditText) r3
                r1.fillAndGoNext(r0, r3)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public class ActionEditListener implements android.widget.TextView.OnEditorActionListener, androidx.leanback.widget.ImeKeyMonitor.ImeKeyListener {
        public final /* synthetic */ androidx.leanback.widget.GuidedActionAdapter this$0;

        public ActionEditListener(androidx.leanback.widget.GuidedActionAdapter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(android.widget.TextView r2, int r3, android.view.KeyEvent r4) {
                r1 = this;
                r4 = 1
                r0 = 5
                if (r3 == r0) goto L14
                r0 = 6
                if (r3 != r0) goto L8
                goto L14
            L8:
                if (r3 != r4) goto L12
                androidx.leanback.widget.GuidedActionAdapter r3 = r1.this$0
                androidx.leanback.widget.GuidedActionAdapterGroup r0 = r3.mGroup
                r0.fillAndStay(r3, r2)
                goto L1b
            L12:
                r4 = 0
                goto L1b
            L14:
                androidx.leanback.widget.GuidedActionAdapter r3 = r1.this$0
                androidx.leanback.widget.GuidedActionAdapterGroup r0 = r3.mGroup
                r0.fillAndGoNext(r3, r2)
            L1b:
                return r4
        }

        @Override // androidx.leanback.widget.ImeKeyMonitor.ImeKeyListener
        public boolean onKeyPreIme(android.widget.EditText r3, int r4, android.view.KeyEvent r5) {
                r2 = this;
                r0 = 1
                r1 = 4
                if (r4 != r1) goto L12
                int r1 = r5.getAction()
                if (r1 != r0) goto L12
                androidx.leanback.widget.GuidedActionAdapter r4 = r2.this$0
                androidx.leanback.widget.GuidedActionAdapterGroup r5 = r4.mGroup
                r5.fillAndStay(r4, r3)
                return r0
            L12:
                r1 = 66
                if (r4 != r1) goto L24
                int r4 = r5.getAction()
                if (r4 != r0) goto L24
                androidx.leanback.widget.GuidedActionAdapter r4 = r2.this$0
                androidx.leanback.widget.GuidedActionAdapterGroup r5 = r4.mGroup
                r5.fillAndGoNext(r4, r3)
                return r0
            L24:
                r3 = 0
                return r3
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ActionOnFocusListener implements android.view.View.OnFocusChangeListener {
        private androidx.leanback.widget.GuidedActionAdapter.FocusListener mFocusListener;
        private android.view.View mSelectedView;
        public final /* synthetic */ androidx.leanback.widget.GuidedActionAdapter this$0;

        public ActionOnFocusListener(androidx.leanback.widget.GuidedActionAdapter r1, androidx.leanback.widget.GuidedActionAdapter.FocusListener r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mFocusListener = r2
                return
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(android.view.View r3, boolean r4) {
                r2 = this;
                androidx.leanback.widget.GuidedActionAdapter r0 = r2.this$0
                androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
                if (r0 != 0) goto L9
                return
            L9:
                androidx.leanback.widget.GuidedActionAdapter r0 = r2.this$0
                androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r0.getChildViewHolder(r3)
                androidx.leanback.widget.GuidedActionsStylist$ViewHolder r0 = (androidx.leanback.widget.GuidedActionsStylist.ViewHolder) r0
                if (r4 == 0) goto L25
                r2.mSelectedView = r3
                androidx.leanback.widget.GuidedActionAdapter$FocusListener r3 = r2.mFocusListener
                if (r3 == 0) goto L33
                androidx.leanback.widget.GuidedAction r1 = r0.getAction()
                r3.onGuidedActionFocused(r1)
                goto L33
            L25:
                android.view.View r1 = r2.mSelectedView
                if (r1 != r3) goto L33
                androidx.leanback.widget.GuidedActionAdapter r3 = r2.this$0
                androidx.leanback.widget.GuidedActionsStylist r3 = r3.mStylist
                r3.onAnimateItemPressedCancelled(r0)
                r3 = 0
                r2.mSelectedView = r3
            L33:
                androidx.leanback.widget.GuidedActionAdapter r3 = r2.this$0
                androidx.leanback.widget.GuidedActionsStylist r3 = r3.mStylist
                r3.onAnimateItemFocused(r0, r4)
                return
        }

        public void setFocusListener(androidx.leanback.widget.GuidedActionAdapter.FocusListener r1) {
                r0 = this;
                r0.mFocusListener = r1
                return
        }

        public void unFocus() {
                r3 = this;
                android.view.View r0 = r3.mSelectedView
                if (r0 == 0) goto L31
                androidx.leanback.widget.GuidedActionAdapter r0 = r3.this$0
                androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
                if (r0 == 0) goto L31
                androidx.leanback.widget.GuidedActionAdapter r0 = r3.this$0
                androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
                android.view.View r1 = r3.mSelectedView
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r0.getChildViewHolder(r1)
                if (r0 == 0) goto L25
                androidx.leanback.widget.GuidedActionsStylist$ViewHolder r0 = (androidx.leanback.widget.GuidedActionsStylist.ViewHolder) r0
                androidx.leanback.widget.GuidedActionAdapter r1 = r3.this$0
                androidx.leanback.widget.GuidedActionsStylist r1 = r1.mStylist
                r2 = 0
                r1.onAnimateItemFocused(r0, r2)
                goto L31
            L25:
                java.lang.Throwable r0 = new java.lang.Throwable
                r0.<init>()
                java.lang.String r1 = "GuidedActionAdapter"
                java.lang.String r2 = "RecyclerView returned null view holder"
                android.util.Log.w(r1, r2, r0)
            L31:
                return
        }
    }

    public class ActionOnKeyListener implements android.view.View.OnKeyListener {
        private boolean mKeyPressed;
        public final /* synthetic */ androidx.leanback.widget.GuidedActionAdapter this$0;

        public ActionOnKeyListener(androidx.leanback.widget.GuidedActionAdapter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 0
                r0.mKeyPressed = r1
                return
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(android.view.View r4, int r5, android.view.KeyEvent r6) {
                r3 = this;
                r0 = 0
                if (r4 == 0) goto L6a
                if (r6 == 0) goto L6a
                androidx.leanback.widget.GuidedActionAdapter r1 = r3.this$0
                androidx.recyclerview.widget.RecyclerView r1 = r1.getRecyclerView()
                if (r1 != 0) goto Le
                goto L6a
            Le:
                r1 = 23
                if (r5 == r1) goto L23
                r1 = 66
                if (r5 == r1) goto L23
                r1 = 160(0xa0, float:2.24E-43)
                if (r5 == r1) goto L23
                r1 = 99
                if (r5 == r1) goto L23
                r1 = 100
                if (r5 == r1) goto L23
                goto L65
            L23:
                androidx.leanback.widget.GuidedActionAdapter r5 = r3.this$0
                androidx.recyclerview.widget.RecyclerView r5 = r5.getRecyclerView()
                androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r5.getChildViewHolder(r4)
                androidx.leanback.widget.GuidedActionsStylist$ViewHolder r4 = (androidx.leanback.widget.GuidedActionsStylist.ViewHolder) r4
                androidx.leanback.widget.GuidedAction r5 = r4.getAction()
                boolean r1 = r5.isEnabled()
                r2 = 1
                if (r1 == 0) goto L66
                boolean r5 = r5.infoOnly()
                if (r5 == 0) goto L41
                goto L66
            L41:
                int r5 = r6.getAction()
                if (r5 == 0) goto L58
                if (r5 == r2) goto L4a
                goto L65
            L4a:
                boolean r5 = r3.mKeyPressed
                if (r5 == 0) goto L65
                r3.mKeyPressed = r0
                androidx.leanback.widget.GuidedActionAdapter r5 = r3.this$0
                androidx.leanback.widget.GuidedActionsStylist r5 = r5.mStylist
                r5.onAnimateItemPressed(r4, r0)
                goto L65
            L58:
                boolean r5 = r3.mKeyPressed
                if (r5 != 0) goto L65
                r3.mKeyPressed = r2
                androidx.leanback.widget.GuidedActionAdapter r5 = r3.this$0
                androidx.leanback.widget.GuidedActionsStylist r5 = r5.mStylist
                r5.onAnimateItemPressed(r4, r2)
            L65:
                return r0
            L66:
                r6.getAction()
                return r2
            L6a:
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface ClickListener {
        void onGuidedActionClicked(androidx.leanback.widget.GuidedAction r1);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface EditListener {
        void onGuidedActionEditCanceled(androidx.leanback.widget.GuidedAction r1);

        long onGuidedActionEditedAndProceed(androidx.leanback.widget.GuidedAction r1);

        void onImeClose();

        void onImeOpen();
    }

    public interface FocusListener {
        void onGuidedActionFocused(androidx.leanback.widget.GuidedAction r1);
    }

    public GuidedActionAdapter(java.util.List<androidx.leanback.widget.GuidedAction> r2, androidx.leanback.widget.GuidedActionAdapter.ClickListener r3, androidx.leanback.widget.GuidedActionAdapter.FocusListener r4, androidx.leanback.widget.GuidedActionsStylist r5, boolean r6) {
            r1 = this;
            r1.<init>()
            androidx.leanback.widget.GuidedActionAdapter$1 r0 = new androidx.leanback.widget.GuidedActionAdapter$1
            r0.<init>(r1)
            r1.mOnClickListener = r0
            if (r2 != 0) goto L12
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            goto L18
        L12:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r2 = r0
        L18:
            r1.mActions = r2
            r1.mClickListener = r3
            r1.mStylist = r5
            androidx.leanback.widget.GuidedActionAdapter$ActionOnKeyListener r2 = new androidx.leanback.widget.GuidedActionAdapter$ActionOnKeyListener
            r2.<init>(r1)
            r1.mActionOnKeyListener = r2
            androidx.leanback.widget.GuidedActionAdapter$ActionOnFocusListener r2 = new androidx.leanback.widget.GuidedActionAdapter$ActionOnFocusListener
            r2.<init>(r1, r4)
            r1.mActionOnFocusListener = r2
            androidx.leanback.widget.GuidedActionAdapter$ActionEditListener r2 = new androidx.leanback.widget.GuidedActionAdapter$ActionEditListener
            r2.<init>(r1)
            r1.mActionEditListener = r2
            androidx.leanback.widget.GuidedActionAdapter$ActionAutofillListener r2 = new androidx.leanback.widget.GuidedActionAdapter$ActionAutofillListener
            r2.<init>(r1)
            r1.mActionAutofillListener = r2
            r1.mIsSubAdapter = r6
            if (r6 != 0) goto L44
            androidx.leanback.widget.GuidedActionDiffCallback r2 = androidx.leanback.widget.GuidedActionDiffCallback.getInstance()
            r1.mDiffCallback = r2
        L44:
            return
    }

    private void setupListeners(android.widget.EditText r3) {
            r2 = this;
            if (r3 == 0) goto L23
            java.lang.String r0 = "escapeNorth"
            r3.setPrivateImeOptions(r0)
            androidx.leanback.widget.GuidedActionAdapter$ActionEditListener r0 = r2.mActionEditListener
            r3.setOnEditorActionListener(r0)
            boolean r0 = r3 instanceof androidx.leanback.widget.ImeKeyMonitor
            if (r0 == 0) goto L18
            r0 = r3
            androidx.leanback.widget.ImeKeyMonitor r0 = (androidx.leanback.widget.ImeKeyMonitor) r0
            androidx.leanback.widget.GuidedActionAdapter$ActionEditListener r1 = r2.mActionEditListener
            r0.setImeKeyListener(r1)
        L18:
            boolean r0 = r3 instanceof androidx.leanback.widget.GuidedActionAutofillSupport
            if (r0 == 0) goto L23
            androidx.leanback.widget.GuidedActionAutofillSupport r3 = (androidx.leanback.widget.GuidedActionAutofillSupport) r3
            androidx.leanback.widget.GuidedActionAdapter$ActionAutofillListener r0 = r2.mActionAutofillListener
            r3.setOnAutofillListener(r0)
        L23:
            return
    }

    public androidx.leanback.widget.GuidedActionsStylist.ViewHolder findSubChildViewHolder(android.view.View r4) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.getRecyclerView()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.view.ViewParent r0 = r4.getParent()
        Lc:
            androidx.recyclerview.widget.RecyclerView r2 = r3.getRecyclerView()
            if (r0 == r2) goto L1c
            if (r0 == 0) goto L1c
            r4 = r0
            android.view.View r4 = (android.view.View) r4
            android.view.ViewParent r0 = r0.getParent()
            goto Lc
        L1c:
            if (r0 == 0) goto L29
            androidx.recyclerview.widget.RecyclerView r0 = r3.getRecyclerView()
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r0.getChildViewHolder(r4)
            r1 = r4
            androidx.leanback.widget.GuidedActionsStylist$ViewHolder r1 = (androidx.leanback.widget.GuidedActionsStylist.ViewHolder) r1
        L29:
            return r1
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.util.List<androidx.leanback.widget.GuidedAction> getActions() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<androidx.leanback.widget.GuidedAction> r1 = r2.mActions
            r0.<init>(r1)
            return r0
    }

    public int getCount() {
            r1 = this;
            java.util.List<androidx.leanback.widget.GuidedAction> r0 = r1.mActions
            int r0 = r0.size()
            return r0
    }

    public androidx.leanback.widget.GuidedActionsStylist getGuidedActionsStylist() {
            r1 = this;
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.mStylist
            return r0
    }

    public androidx.leanback.widget.GuidedAction getItem(int r2) {
            r1 = this;
            java.util.List<androidx.leanback.widget.GuidedAction> r0 = r1.mActions
            java.lang.Object r2 = r0.get(r2)
            androidx.leanback.widget.GuidedAction r2 = (androidx.leanback.widget.GuidedAction) r2
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
            r1 = this;
            java.util.List<androidx.leanback.widget.GuidedAction> r0 = r1.mActions
            int r0 = r0.size()
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int r3) {
            r2 = this;
            androidx.leanback.widget.GuidedActionsStylist r0 = r2.mStylist
            java.util.List<androidx.leanback.widget.GuidedAction> r1 = r2.mActions
            java.lang.Object r3 = r1.get(r3)
            androidx.leanback.widget.GuidedAction r3 = (androidx.leanback.widget.GuidedAction) r3
            int r3 = r0.getItemViewType(r3)
            return r3
    }

    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
            r1 = this;
            boolean r0 = r1.mIsSubAdapter
            if (r0 == 0) goto Lb
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.mStylist
            androidx.leanback.widget.VerticalGridView r0 = r0.getSubActionsGridView()
            goto L11
        Lb:
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.mStylist
            androidx.leanback.widget.VerticalGridView r0 = r0.getActionsGridView()
        L11:
            return r0
    }

    public void handleCheckedActions(androidx.leanback.widget.GuidedActionsStylist.ViewHolder r9) {
            r8 = this;
            androidx.leanback.widget.GuidedAction r0 = r9.getAction()
            int r1 = r0.getCheckSetId()
            androidx.recyclerview.widget.RecyclerView r2 = r8.getRecyclerView()
            if (r2 == 0) goto L64
            if (r1 == 0) goto L64
            r2 = -1
            r3 = 0
            if (r1 == r2) goto L4a
            java.util.List<androidx.leanback.widget.GuidedAction> r4 = r8.mActions
            int r4 = r4.size()
            r5 = 0
        L1b:
            if (r5 >= r4) goto L4a
            java.util.List<androidx.leanback.widget.GuidedAction> r6 = r8.mActions
            java.lang.Object r6 = r6.get(r5)
            androidx.leanback.widget.GuidedAction r6 = (androidx.leanback.widget.GuidedAction) r6
            if (r6 == r0) goto L47
            int r7 = r6.getCheckSetId()
            if (r7 != r1) goto L47
            boolean r7 = r6.isChecked()
            if (r7 == 0) goto L47
            r6.setChecked(r3)
            androidx.recyclerview.widget.RecyclerView r6 = r8.getRecyclerView()
            androidx.recyclerview.widget.RecyclerView$ViewHolder r6 = r6.findViewHolderForPosition(r5)
            androidx.leanback.widget.GuidedActionsStylist$ViewHolder r6 = (androidx.leanback.widget.GuidedActionsStylist.ViewHolder) r6
            if (r6 == 0) goto L47
            androidx.leanback.widget.GuidedActionsStylist r7 = r8.mStylist
            r7.onAnimateItemChecked(r6, r3)
        L47:
            int r5 = r5 + 1
            goto L1b
        L4a:
            boolean r4 = r0.isChecked()
            if (r4 != 0) goto L5a
            r1 = 1
            r0.setChecked(r1)
            androidx.leanback.widget.GuidedActionsStylist r0 = r8.mStylist
            r0.onAnimateItemChecked(r9, r1)
            goto L64
        L5a:
            if (r1 != r2) goto L64
            r0.setChecked(r3)
            androidx.leanback.widget.GuidedActionsStylist r0 = r8.mStylist
            r0.onAnimateItemChecked(r9, r3)
        L64:
            return
    }

    public int indexOf(androidx.leanback.widget.GuidedAction r2) {
            r1 = this;
            java.util.List<androidx.leanback.widget.GuidedAction> r0 = r1.mActions
            int r2 = r0.indexOf(r2)
            return r2
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r2, int r3) {
            r1 = this;
            java.util.List<androidx.leanback.widget.GuidedAction> r0 = r1.mActions
            int r0 = r0.size()
            if (r3 < r0) goto L9
            return
        L9:
            androidx.leanback.widget.GuidedActionsStylist$ViewHolder r2 = (androidx.leanback.widget.GuidedActionsStylist.ViewHolder) r2
            java.util.List<androidx.leanback.widget.GuidedAction> r0 = r1.mActions
            java.lang.Object r3 = r0.get(r3)
            androidx.leanback.widget.GuidedAction r3 = (androidx.leanback.widget.GuidedAction) r3
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.mStylist
            r0.onBindViewHolder(r2, r3)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r2, int r3) {
            r1 = this;
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.mStylist
            androidx.leanback.widget.GuidedActionsStylist$ViewHolder r2 = r0.onCreateViewHolder(r2, r3)
            android.view.View r3 = r2.itemView
            androidx.leanback.widget.GuidedActionAdapter$ActionOnKeyListener r0 = r1.mActionOnKeyListener
            r3.setOnKeyListener(r0)
            android.view.View$OnClickListener r0 = r1.mOnClickListener
            r3.setOnClickListener(r0)
            androidx.leanback.widget.GuidedActionAdapter$ActionOnFocusListener r0 = r1.mActionOnFocusListener
            r3.setOnFocusChangeListener(r0)
            android.widget.EditText r3 = r2.getEditableTitleView()
            r1.setupListeners(r3)
            android.widget.EditText r3 = r2.getEditableDescriptionView()
            r1.setupListeners(r3)
            return r2
    }

    public void performOnActionClick(androidx.leanback.widget.GuidedActionsStylist.ViewHolder r2) {
            r1 = this;
            androidx.leanback.widget.GuidedActionAdapter$ClickListener r0 = r1.mClickListener
            if (r0 == 0) goto Lb
            androidx.leanback.widget.GuidedAction r2 = r2.getAction()
            r0.onGuidedActionClicked(r2)
        Lb:
            return
    }

    public void setActions(java.util.List<androidx.leanback.widget.GuidedAction> r3) {
            r2 = this;
            boolean r0 = r2.mIsSubAdapter
            if (r0 != 0) goto La
            androidx.leanback.widget.GuidedActionsStylist r0 = r2.mStylist
            r1 = 0
            r0.collapseAction(r1)
        La:
            androidx.leanback.widget.GuidedActionAdapter$ActionOnFocusListener r0 = r2.mActionOnFocusListener
            r0.unFocus()
            androidx.leanback.widget.DiffCallback<androidx.leanback.widget.GuidedAction> r0 = r2.mDiffCallback
            if (r0 == 0) goto L34
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<androidx.leanback.widget.GuidedAction> r1 = r2.mActions
            r0.addAll(r1)
            java.util.List<androidx.leanback.widget.GuidedAction> r1 = r2.mActions
            r1.clear()
            java.util.List<androidx.leanback.widget.GuidedAction> r1 = r2.mActions
            r1.addAll(r3)
            androidx.leanback.widget.GuidedActionAdapter$2 r3 = new androidx.leanback.widget.GuidedActionAdapter$2
            r3.<init>(r2, r0)
            androidx.recyclerview.widget.DiffUtil$DiffResult r3 = androidx.recyclerview.widget.DiffUtil.calculateDiff(r3)
            r3.dispatchUpdatesTo(r2)
            goto L41
        L34:
            java.util.List<androidx.leanback.widget.GuidedAction> r0 = r2.mActions
            r0.clear()
            java.util.List<androidx.leanback.widget.GuidedAction> r0 = r2.mActions
            r0.addAll(r3)
            r2.notifyDataSetChanged()
        L41:
            return
    }

    public void setClickListener(androidx.leanback.widget.GuidedActionAdapter.ClickListener r1) {
            r0 = this;
            r0.mClickListener = r1
            return
    }

    public void setDiffCallback(androidx.leanback.widget.DiffCallback<androidx.leanback.widget.GuidedAction> r1) {
            r0 = this;
            r0.mDiffCallback = r1
            return
    }

    public void setFocusListener(androidx.leanback.widget.GuidedActionAdapter.FocusListener r2) {
            r1 = this;
            androidx.leanback.widget.GuidedActionAdapter$ActionOnFocusListener r0 = r1.mActionOnFocusListener
            r0.setFocusListener(r2)
            return
    }
}
