package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes2.dex */
abstract class PickerFragment<S> extends androidx.fragment.app.Fragment {
    public final java.util.LinkedHashSet<com.google.android.material.datepicker.OnSelectionChangedListener<S>> onSelectionChangedListeners;

    public PickerFragment() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.onSelectionChangedListeners = r0
            return
    }

    public boolean addOnSelectionChangedListener(com.google.android.material.datepicker.OnSelectionChangedListener<S> r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.datepicker.OnSelectionChangedListener<S>> r0 = r1.onSelectionChangedListeners
            boolean r2 = r0.add(r2)
            return r2
    }
}
