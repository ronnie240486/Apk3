package com.google.android.material.internal;

import com.google.android.material.internal.MaterialCheckable;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public interface MaterialCheckable<T extends com.google.android.material.internal.MaterialCheckable<T>> extends android.widget.Checkable {

    /* JADX INFO: loaded from: classes3.dex */
    public interface OnCheckedChangeListener<C> {
        void onCheckedChanged(C r1, boolean r2);
    }

    @androidx.annotation.IdRes
    int getId();

    void setInternalOnCheckedChangeListener(@androidx.annotation.Nullable com.google.android.material.internal.MaterialCheckable.OnCheckedChangeListener<T> r1);
}
