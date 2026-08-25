package com.andyhax.veeepeeen.ui.login;

/* JADX INFO: loaded from: classes2.dex */
public class LoginActivity extends com.flextv.livestore.apps.BaseActivity {
    private com.andyhax.veeepeeen.databinding.ActivityLoginBinding binding;
    private com.andyhax.veeepeeen.ui.login.LoginViewModel loginViewModel;

    /* JADX INFO: renamed from: com.andyhax.veeepeeen.ui.login.LoginActivity$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    class AnonymousClass1 implements androidx.lifecycle.Observer<com.andyhax.veeepeeen.ui.login.LoginFormState> {
        final /* synthetic */ com.andyhax.veeepeeen.ui.login.LoginActivity this$0;
        final /* synthetic */ android.widget.Button val$loginButton;
        final /* synthetic */ android.widget.EditText val$passwordEditText;
        final /* synthetic */ android.widget.EditText val$usernameEditText;

        native AnonymousClass1(com.andyhax.veeepeeen.ui.login.LoginActivity r1, android.widget.Button r2, android.widget.EditText r3, android.widget.EditText r4);

        /* JADX INFO: renamed from: onChanged, reason: avoid collision after fix types in other method */
        public native void onChanged2(com.andyhax.veeepeeen.ui.login.LoginFormState r1);

        @Override // androidx.lifecycle.Observer
        public native /* bridge */ /* synthetic */ void onChanged(com.andyhax.veeepeeen.ui.login.LoginFormState r1);
    }

    /* JADX INFO: renamed from: com.andyhax.veeepeeen.ui.login.LoginActivity$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    class AnonymousClass2 implements androidx.lifecycle.Observer<com.andyhax.veeepeeen.ui.login.LoginResult> {
        final /* synthetic */ com.andyhax.veeepeeen.ui.login.LoginActivity this$0;
        final /* synthetic */ android.widget.ProgressBar val$loadingProgressBar;

        native AnonymousClass2(com.andyhax.veeepeeen.ui.login.LoginActivity r1, android.widget.ProgressBar r2);

        /* JADX INFO: renamed from: onChanged, reason: avoid collision after fix types in other method */
        public native void onChanged2(com.andyhax.veeepeeen.ui.login.LoginResult r1);

        @Override // androidx.lifecycle.Observer
        public native /* bridge */ /* synthetic */ void onChanged(com.andyhax.veeepeeen.ui.login.LoginResult r1);
    }

    /* JADX INFO: renamed from: com.andyhax.veeepeeen.ui.login.LoginActivity$3, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    class AnonymousClass3 implements android.text.TextWatcher {
        final /* synthetic */ com.andyhax.veeepeeen.ui.login.LoginActivity this$0;
        final /* synthetic */ android.widget.EditText val$passwordEditText;
        final /* synthetic */ android.widget.EditText val$usernameEditText;

        native AnonymousClass3(com.andyhax.veeepeeen.ui.login.LoginActivity r1, android.widget.EditText r2, android.widget.EditText r3);

        @Override // android.text.TextWatcher
        public native void afterTextChanged(android.text.Editable r1);

        @Override // android.text.TextWatcher
        public native void beforeTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4);

        @Override // android.text.TextWatcher
        public native void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4);
    }

    /* JADX INFO: renamed from: com.andyhax.veeepeeen.ui.login.LoginActivity$4, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    class AnonymousClass4 implements android.widget.TextView.OnEditorActionListener {
        final /* synthetic */ com.andyhax.veeepeeen.ui.login.LoginActivity this$0;
        final /* synthetic */ android.widget.EditText val$passwordEditText;
        final /* synthetic */ android.widget.EditText val$usernameEditText;

        native AnonymousClass4(com.andyhax.veeepeeen.ui.login.LoginActivity r1, android.widget.EditText r2, android.widget.EditText r3);

        @Override // android.widget.TextView.OnEditorActionListener
        public native boolean onEditorAction(android.widget.TextView r1, int r2, android.view.KeyEvent r3);
    }

    /* JADX INFO: renamed from: com.andyhax.veeepeeen.ui.login.LoginActivity$5, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    class AnonymousClass5 implements android.view.View.OnClickListener {
        final /* synthetic */ com.andyhax.veeepeeen.ui.login.LoginActivity this$0;
        final /* synthetic */ android.widget.ProgressBar val$loadingProgressBar;
        final /* synthetic */ android.widget.EditText val$passwordEditText;
        final /* synthetic */ android.widget.EditText val$usernameEditText;

        native AnonymousClass5(com.andyhax.veeepeeen.ui.login.LoginActivity r1, android.widget.ProgressBar r2, android.widget.EditText r3, android.widget.EditText r4);

        @Override // android.view.View.OnClickListener
        public native void onClick(android.view.View r1);
    }

    public native LoginActivity();

    static native /* synthetic */ void access$000(com.andyhax.veeepeeen.ui.login.LoginActivity r0, java.lang.Integer r1);

    static native /* synthetic */ void access$100(com.andyhax.veeepeeen.ui.login.LoginActivity r0, com.andyhax.veeepeeen.ui.login.LoggedInUserView r1);

    static native /* synthetic */ void access$200(com.andyhax.veeepeeen.ui.login.LoginActivity r0);

    static native /* synthetic */ com.andyhax.veeepeeen.ui.login.LoginViewModel access$300(com.andyhax.veeepeeen.ui.login.LoginActivity r0);

    private native void showLoginFailed(java.lang.Integer r1);

    private native void startNextActivity(boolean r1);

    private native void updateUiWithUser(com.andyhax.veeepeeen.ui.login.LoggedInUserView r1);

    @Override // com.flextv.livestore.apps.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public native void onCreate(android.os.Bundle r1);
}
