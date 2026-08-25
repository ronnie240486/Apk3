package androidx.leanback.widget;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class GuidedActionAdapterGroup {
    private static final boolean DEBUG_EDIT = false;
    private static final java.lang.String TAG_EDIT = "EditableAction";
    public java.util.ArrayList<android.util.Pair<androidx.leanback.widget.GuidedActionAdapter, androidx.leanback.widget.GuidedActionAdapter>> mAdapters;
    private androidx.leanback.widget.GuidedActionAdapter.EditListener mEditListener;
    private boolean mImeOpened;

    public GuidedActionAdapterGroup() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mAdapters = r0
            return
    }

    private void updateTextIntoAction(androidx.leanback.widget.GuidedActionsStylist.ViewHolder r3, android.widget.TextView r4) {
            r2 = this;
            androidx.leanback.widget.GuidedAction r0 = r3.getAction()
            android.widget.TextView r1 = r3.getDescriptionView()
            if (r4 != r1) goto L20
            java.lang.CharSequence r3 = r0.getEditDescription()
            if (r3 == 0) goto L18
            java.lang.CharSequence r3 = r4.getText()
            r0.setEditDescription(r3)
            goto L3b
        L18:
            java.lang.CharSequence r3 = r4.getText()
            r0.setDescription(r3)
            goto L3b
        L20:
            android.widget.TextView r3 = r3.getTitleView()
            if (r4 != r3) goto L3b
            java.lang.CharSequence r3 = r0.getEditTitle()
            if (r3 == 0) goto L34
            java.lang.CharSequence r3 = r4.getText()
            r0.setEditTitle(r3)
            goto L3b
        L34:
            java.lang.CharSequence r3 = r4.getText()
            r0.setTitle(r3)
        L3b:
            return
    }

    public void addAdpter(androidx.leanback.widget.GuidedActionAdapter r3, androidx.leanback.widget.GuidedActionAdapter r4) {
            r2 = this;
            java.util.ArrayList<android.util.Pair<androidx.leanback.widget.GuidedActionAdapter, androidx.leanback.widget.GuidedActionAdapter>> r0 = r2.mAdapters
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r3, r4)
            r0.add(r1)
            if (r3 == 0) goto Le
            r3.mGroup = r2
        Le:
            if (r4 == 0) goto L12
            r4.mGroup = r2
        L12:
            return
    }

    public void closeIme(android.view.View r4) {
            r3 = this;
            boolean r0 = r3.mImeOpened
            if (r0 == 0) goto L1f
            r0 = 0
            r3.mImeOpened = r0
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            android.os.IBinder r4 = r4.getWindowToken()
            r1.hideSoftInputFromWindow(r4, r0)
            androidx.leanback.widget.GuidedActionAdapter$EditListener r4 = r3.mEditListener
            r4.onImeClose()
        L1f:
            return
    }

    public void fillAndGoNext(androidx.leanback.widget.GuidedActionAdapter r13, android.widget.TextView r14) {
            r12 = this;
            androidx.leanback.widget.GuidedActionsStylist$ViewHolder r0 = r13.findSubChildViewHolder(r14)
            r12.updateTextIntoAction(r0, r14)
            r13.performOnActionClick(r0)
            androidx.leanback.widget.GuidedActionAdapter$EditListener r1 = r12.mEditListener
            androidx.leanback.widget.GuidedAction r2 = r0.getAction()
            long r1 = r1.onGuidedActionEditedAndProceed(r2)
            androidx.leanback.widget.GuidedActionsStylist r3 = r13.getGuidedActionsStylist()
            r4 = 0
            r5 = 1
            r3.setEditingMode(r0, r4, r5)
            r6 = -3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto La2
            androidx.leanback.widget.GuidedAction r3 = r0.getAction()
            long r6 = r3.getId()
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto La2
            androidx.leanback.widget.GuidedAction r3 = r0.getAction()
            r6 = -2
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 != 0) goto L44
            int r3 = r13.indexOf(r3)
            if (r3 >= 0) goto L41
            goto La2
        L41:
            int r3 = r3 + r5
            r6 = r12
            goto L47
        L44:
            r3 = r12
        L45:
            r6 = r3
            r3 = 0
        L47:
            int r7 = r13.getCount()
            if (r8 != 0) goto L5c
        L4d:
            if (r3 >= r7) goto L6d
            androidx.leanback.widget.GuidedAction r9 = r13.getItem(r3)
            boolean r9 = r9.isFocusable()
            if (r9 != 0) goto L6d
            int r3 = r3 + 1
            goto L4d
        L5c:
            if (r3 >= r7) goto L6d
            androidx.leanback.widget.GuidedAction r9 = r13.getItem(r3)
            long r9 = r9.getId()
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 == 0) goto L6d
            int r3 = r3 + 1
            goto L5c
        L6d:
            if (r3 >= r7) goto L99
            androidx.leanback.widget.GuidedActionsStylist r1 = r13.getGuidedActionsStylist()
            androidx.leanback.widget.VerticalGridView r1 = r1.getActionsGridView()
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r1.findViewHolderForPosition(r3)
            androidx.leanback.widget.GuidedActionsStylist$ViewHolder r1 = (androidx.leanback.widget.GuidedActionsStylist.ViewHolder) r1
            if (r1 == 0) goto La2
            androidx.leanback.widget.GuidedAction r2 = r1.getAction()
            boolean r2 = r2.hasTextEditable()
            if (r2 == 0) goto L8d
            r6.openIme(r13, r1)
            goto L97
        L8d:
            android.view.View r13 = r1.itemView
            r6.closeIme(r13)
            android.view.View r13 = r1.itemView
            r13.requestFocus()
        L97:
            r4 = 1
            goto La2
        L99:
            androidx.leanback.widget.GuidedActionAdapter r13 = r6.getNextAdapter(r13)
            if (r13 != 0) goto La0
            goto La2
        La0:
            r3 = r6
            goto L45
        La2:
            if (r4 != 0) goto Lac
            r12.closeIme(r14)
            android.view.View r13 = r0.itemView
            r13.requestFocus()
        Lac:
            return
    }

    public void fillAndStay(androidx.leanback.widget.GuidedActionAdapter r4, android.widget.TextView r5) {
            r3 = this;
            androidx.leanback.widget.GuidedActionsStylist$ViewHolder r0 = r4.findSubChildViewHolder(r5)
            r3.updateTextIntoAction(r0, r5)
            androidx.leanback.widget.GuidedActionAdapter$EditListener r1 = r3.mEditListener
            androidx.leanback.widget.GuidedAction r2 = r0.getAction()
            r1.onGuidedActionEditCanceled(r2)
            androidx.leanback.widget.GuidedActionsStylist r4 = r4.getGuidedActionsStylist()
            r1 = 1
            r2 = 0
            r4.setEditingMode(r0, r2, r1)
            r3.closeIme(r5)
            android.view.View r4 = r0.itemView
            r4.requestFocus()
            return
    }

    public androidx.leanback.widget.GuidedActionAdapter getNextAdapter(androidx.leanback.widget.GuidedActionAdapter r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList<android.util.Pair<androidx.leanback.widget.GuidedActionAdapter, androidx.leanback.widget.GuidedActionAdapter>> r1 = r3.mAdapters
            int r1 = r1.size()
            if (r0 >= r1) goto L1d
            java.util.ArrayList<android.util.Pair<androidx.leanback.widget.GuidedActionAdapter, androidx.leanback.widget.GuidedActionAdapter>> r1 = r3.mAdapters
            java.lang.Object r1 = r1.get(r0)
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r2 = r1.first
            if (r2 != r4) goto L1a
            java.lang.Object r4 = r1.second
            androidx.leanback.widget.GuidedActionAdapter r4 = (androidx.leanback.widget.GuidedActionAdapter) r4
            return r4
        L1a:
            int r0 = r0 + 1
            goto L1
        L1d:
            r4 = 0
            return r4
    }

    public void openIme(androidx.leanback.widget.GuidedActionAdapter r3, androidx.leanback.widget.GuidedActionsStylist.ViewHolder r4) {
            r2 = this;
            androidx.leanback.widget.GuidedActionsStylist r3 = r3.getGuidedActionsStylist()
            r0 = 1
            r3.setEditingMode(r4, r0, r0)
            android.view.View r3 = r4.getEditingView()
            if (r3 == 0) goto L36
            boolean r4 = r4.isInEditingText()
            if (r4 != 0) goto L15
            goto L36
        L15:
            android.content.Context r4 = r3.getContext()
            java.lang.String r1 = "input_method"
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r4 = (android.view.inputmethod.InputMethodManager) r4
            r3.setFocusable(r0)
            r3.requestFocus()
            r1 = 0
            r4.showSoftInput(r3, r1)
            boolean r3 = r2.mImeOpened
            if (r3 != 0) goto L36
            r2.mImeOpened = r0
            androidx.leanback.widget.GuidedActionAdapter$EditListener r3 = r2.mEditListener
            r3.onImeOpen()
        L36:
            return
    }

    public void setEditListener(androidx.leanback.widget.GuidedActionAdapter.EditListener r1) {
            r0 = this;
            r0.mEditListener = r1
            return
    }
}
