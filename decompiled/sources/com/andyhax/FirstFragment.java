package com.andyhax;

/* JADX INFO: loaded from: classes3.dex */
public class FirstFragment extends androidx.fragment.app.Fragment {
    private com.andyhax.veeepeeen.databinding.FragmentFirstBinding binding;

    /* JADX INFO: renamed from: com.andyhax.FirstFragment$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    class AnonymousClass1 implements android.view.View.OnClickListener {
        final /* synthetic */ com.andyhax.FirstFragment this$0;

        native AnonymousClass1(com.andyhax.FirstFragment r1);

        @Override // android.view.View.OnClickListener
        public native void onClick(android.view.View r1);
    }

    public native FirstFragment();

    @Override // androidx.fragment.app.Fragment
    public native android.view.View onCreateView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3);

    @Override // androidx.fragment.app.Fragment
    public native void onDestroyView();

    @Override // androidx.fragment.app.Fragment
    public native void onViewCreated(android.view.View r1, android.os.Bundle r2);
}
