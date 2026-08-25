package com.andyhax.veeepeeen.databinding;

/* JADX INFO: loaded from: classes3.dex */
public final class FragmentSecondBinding implements androidx.viewbinding.ViewBinding {
    public final android.widget.Button buttonSecond;
    private final androidx.core.widget.NestedScrollView rootView;
    public final android.widget.TextView textviewSecond;

    private native FragmentSecondBinding(androidx.core.widget.NestedScrollView r1, android.widget.Button r2, android.widget.TextView r3);

    public static native com.andyhax.veeepeeen.databinding.FragmentSecondBinding bind(android.view.View r0);

    public static native com.andyhax.veeepeeen.databinding.FragmentSecondBinding inflate(android.view.LayoutInflater r0);

    public static native com.andyhax.veeepeeen.databinding.FragmentSecondBinding inflate(android.view.LayoutInflater r0, android.view.ViewGroup r1, boolean r2);

    @Override // androidx.viewbinding.ViewBinding
    public /* bridge */ /* synthetic */ android.view.View getRoot() {
            r1 = this;
            androidx.core.widget.NestedScrollView r0 = r1.getRoot()
            return r0
    }

    @Override // androidx.viewbinding.ViewBinding
    public androidx.core.widget.NestedScrollView getRoot() {
            r1 = this;
            androidx.core.widget.NestedScrollView r0 = r1.rootView
            return r0
    }
}
