package com.google.android.material.internal;

import com.google.android.material.internal.MaterialCheckable;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@androidx.annotation.UiThread
public class CheckableGroup<T extends com.google.android.material.internal.MaterialCheckable<T>> {
    private final java.util.Map<java.lang.Integer, T> checkables;
    private final java.util.Set<java.lang.Integer> checkedIds;
    private com.google.android.material.internal.CheckableGroup.OnCheckedStateChangeListener onCheckedStateChangeListener;
    private boolean selectionRequired;
    private boolean singleSelection;


    public interface OnCheckedStateChangeListener {
        void onCheckedStateChanged(@androidx.annotation.NonNull java.util.Set<java.lang.Integer> r1);
    }

    public CheckableGroup() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.checkables = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.checkedIds = r0
            return
    }

    public static /* synthetic */ boolean access$000(com.google.android.material.internal.CheckableGroup r0, com.google.android.material.internal.MaterialCheckable r1) {
            boolean r0 = r0.checkInternal(r1)
            return r0
    }

    public static /* synthetic */ boolean access$100(com.google.android.material.internal.CheckableGroup r0) {
            boolean r0 = r0.selectionRequired
            return r0
    }

    public static /* synthetic */ boolean access$200(com.google.android.material.internal.CheckableGroup r0, com.google.android.material.internal.MaterialCheckable r1, boolean r2) {
            boolean r0 = r0.uncheckInternal(r1, r2)
            return r0
    }

    public static /* synthetic */ void access$300(com.google.android.material.internal.CheckableGroup r0) {
            r0.onCheckedStateChanged()
            return
    }

    private boolean checkInternal(@androidx.annotation.NonNull com.google.android.material.internal.MaterialCheckable<T> r5) {
            r4 = this;
            int r0 = r5.getId()
            java.util.Set<java.lang.Integer> r1 = r4.checkedIds
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.contains(r2)
            r2 = 0
            if (r1 == 0) goto L12
            return r2
        L12:
            java.util.Map<java.lang.Integer, T extends com.google.android.material.internal.MaterialCheckable<T>> r1 = r4.checkables
            int r3 = r4.getSingleCheckedId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r1.get(r3)
            com.google.android.material.internal.MaterialCheckable r1 = (com.google.android.material.internal.MaterialCheckable) r1
            if (r1 == 0) goto L27
            r4.uncheckInternal(r1, r2)
        L27:
            java.util.Set<java.lang.Integer> r1 = r4.checkedIds
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.add(r0)
            boolean r1 = r5.isChecked()
            if (r1 != 0) goto L3b
            r1 = 1
            r5.setChecked(r1)
        L3b:
            return r0
    }

    private void onCheckedStateChanged() {
            r2 = this;
            com.google.android.material.internal.CheckableGroup$OnCheckedStateChangeListener r0 = r2.onCheckedStateChangeListener
            if (r0 == 0) goto Lb
            java.util.Set r1 = r2.getCheckedIds()
            r0.onCheckedStateChanged(r1)
        Lb:
            return
    }

    private boolean uncheckInternal(@androidx.annotation.NonNull com.google.android.material.internal.MaterialCheckable<T> r5, boolean r6) {
            r4 = this;
            int r0 = r5.getId()
            java.util.Set<java.lang.Integer> r1 = r4.checkedIds
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r1 = r1.contains(r2)
            r2 = 0
            if (r1 != 0) goto L12
            return r2
        L12:
            if (r6 == 0) goto L2d
            java.util.Set<java.lang.Integer> r6 = r4.checkedIds
            int r6 = r6.size()
            r1 = 1
            if (r6 != r1) goto L2d
            java.util.Set<java.lang.Integer> r6 = r4.checkedIds
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            boolean r6 = r6.contains(r3)
            if (r6 == 0) goto L2d
            r5.setChecked(r1)
            return r2
        L2d:
            java.util.Set<java.lang.Integer> r6 = r4.checkedIds
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r6 = r6.remove(r0)
            boolean r0 = r5.isChecked()
            if (r0 == 0) goto L40
            r5.setChecked(r2)
        L40:
            return r6
    }

    public void addCheckable(T r3) {
            r2 = this;
            java.util.Map<java.lang.Integer, T extends com.google.android.material.internal.MaterialCheckable<T>> r0 = r2.checkables
            int r1 = r3.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r1, r3)
            boolean r0 = r3.isChecked()
            if (r0 == 0) goto L16
            r2.checkInternal(r3)
        L16:
            com.google.android.material.internal.CheckableGroup$1 r0 = new com.google.android.material.internal.CheckableGroup$1
            r0.<init>(r2)
            r3.setInternalOnCheckedChangeListener(r0)
            return
    }

    public void check(@androidx.annotation.IdRes int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, T extends com.google.android.material.internal.MaterialCheckable<T>> r0 = r1.checkables
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.google.android.material.internal.MaterialCheckable r2 = (com.google.android.material.internal.MaterialCheckable) r2
            if (r2 != 0) goto Lf
            return
        Lf:
            boolean r2 = r1.checkInternal(r2)
            if (r2 == 0) goto L18
            r1.onCheckedStateChanged()
        L18:
            return
    }

    public void clearCheck() {
            r4 = this;
            java.util.Set<java.lang.Integer> r0 = r4.checkedIds
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            java.util.Map<java.lang.Integer, T extends com.google.android.material.internal.MaterialCheckable<T>> r1 = r4.checkables
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()
            com.google.android.material.internal.MaterialCheckable r2 = (com.google.android.material.internal.MaterialCheckable) r2
            r3 = 0
            r4.uncheckInternal(r2, r3)
            goto L12
        L23:
            if (r0 == 0) goto L28
            r4.onCheckedStateChanged()
        L28:
            return
    }

    @androidx.annotation.NonNull
    public java.util.Set<java.lang.Integer> getCheckedIds() {
            r2 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Set<java.lang.Integer> r1 = r2.checkedIds
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<java.lang.Integer> getCheckedIdsSortedByChildOrder(@androidx.annotation.NonNull android.view.ViewGroup r6) {
            r5 = this;
            java.util.Set r0 = r5.getCheckedIds()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        La:
            int r3 = r6.getChildCount()
            if (r2 >= r3) goto L34
            android.view.View r3 = r6.getChildAt(r2)
            boolean r4 = r3 instanceof com.google.android.material.internal.MaterialCheckable
            if (r4 == 0) goto L31
            int r4 = r3.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L31
            int r3 = r3.getId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.add(r3)
        L31:
            int r2 = r2 + 1
            goto La
        L34:
            return r1
    }

    @androidx.annotation.IdRes
    public int getSingleCheckedId() {
            r1 = this;
            boolean r0 = r1.singleSelection
            if (r0 == 0) goto L1d
            java.util.Set<java.lang.Integer> r0 = r1.checkedIds
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            java.util.Set<java.lang.Integer> r0 = r1.checkedIds
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L1e
        L1d:
            r0 = -1
        L1e:
            return r0
    }

    public boolean isSelectionRequired() {
            r1 = this;
            boolean r0 = r1.selectionRequired
            return r0
    }

    public boolean isSingleSelection() {
            r1 = this;
            boolean r0 = r1.singleSelection
            return r0
    }

    public void removeCheckable(T r3) {
            r2 = this;
            r0 = 0
            r3.setInternalOnCheckedChangeListener(r0)
            java.util.Map<java.lang.Integer, T extends com.google.android.material.internal.MaterialCheckable<T>> r0 = r2.checkables
            int r1 = r3.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.remove(r1)
            java.util.Set<java.lang.Integer> r0 = r2.checkedIds
            int r3 = r3.getId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.remove(r3)
            return
    }

    public void setOnCheckedStateChangeListener(@androidx.annotation.Nullable com.google.android.material.internal.CheckableGroup.OnCheckedStateChangeListener r1) {
            r0 = this;
            r0.onCheckedStateChangeListener = r1
            return
    }

    public void setSelectionRequired(boolean r1) {
            r0 = this;
            r0.selectionRequired = r1
            return
    }

    public void setSingleSelection(boolean r2) {
            r1 = this;
            boolean r0 = r1.singleSelection
            if (r0 == r2) goto L9
            r1.singleSelection = r2
            r1.clearCheck()
        L9:
            return
    }

    public void uncheck(@androidx.annotation.IdRes int r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, T extends com.google.android.material.internal.MaterialCheckable<T>> r0 = r1.checkables
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.google.android.material.internal.MaterialCheckable r2 = (com.google.android.material.internal.MaterialCheckable) r2
            if (r2 != 0) goto Lf
            return
        Lf:
            boolean r0 = r1.selectionRequired
            boolean r2 = r1.uncheckInternal(r2, r0)
            if (r2 == 0) goto L1a
            r1.onCheckedStateChanged()
        L1a:
            return
    }
}
