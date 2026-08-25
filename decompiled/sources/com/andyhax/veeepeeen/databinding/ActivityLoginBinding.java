package com.andyhax.veeepeeen.databinding;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityLoginBinding implements androidx.viewbinding.ViewBinding {
    public final androidx.constraintlayout.widget.ConstraintLayout container;
    public final android.widget.ImageView imageView;
    public final android.widget.ProgressBar loading;
    public final android.widget.Button login;
    public final android.widget.EditText password;
    private final androidx.constraintlayout.widget.ConstraintLayout rootView;
    public final android.widget.EditText username;

    private ActivityLoginBinding(androidx.constraintlayout.widget.ConstraintLayout r1, androidx.constraintlayout.widget.ConstraintLayout r2, android.widget.ImageView r3, android.widget.ProgressBar r4, android.widget.Button r5, android.widget.EditText r6, android.widget.EditText r7) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.container = r2
            r0.imageView = r3
            r0.loading = r4
            r0.login = r5
            r0.password = r6
            r0.username = r7
            return
    }

    public static native com.andyhax.veeepeeen.databinding.ActivityLoginBinding bind(android.view.View r0);

    public static native com.andyhax.veeepeeen.databinding.ActivityLoginBinding inflate(android.view.LayoutInflater r0);

    public static native com.andyhax.veeepeeen.databinding.ActivityLoginBinding inflate(android.view.LayoutInflater r0, android.view.ViewGroup r1, boolean r2);

    @Override // androidx.viewbinding.ViewBinding
    public /* bridge */ /* synthetic */ android.view.View getRoot() {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.getRoot()
            return r0
    }

    @Override // androidx.viewbinding.ViewBinding
    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
            r1 = this;
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.rootView
            return r0
    }
}
