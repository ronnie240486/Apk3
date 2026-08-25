package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public abstract class OnSelectionChangedListener<S> {
    public OnSelectionChangedListener() {
            r0 = this;
            r0.<init>()
            return
    }

    public void onIncompleteSelectionChanged() {
            r0 = this;
            return
    }

    public abstract void onSelectionChanged(@androidx.annotation.NonNull S r1);
}
