package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentHostCallback<E> extends androidx.fragment.app.FragmentContainer {

    @androidx.annotation.Nullable
    private final android.app.Activity mActivity;

    @androidx.annotation.NonNull
    private final android.content.Context mContext;
    public final androidx.fragment.app.FragmentManager mFragmentManager;

    @androidx.annotation.NonNull
    private final android.os.Handler mHandler;
    private final int mWindowAnimations;

    public FragmentHostCallback(@androidx.annotation.Nullable android.app.Activity r2, @androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull android.os.Handler r4, int r5) {
            r1 = this;
            r1.<init>()
            androidx.fragment.app.FragmentManagerImpl r0 = new androidx.fragment.app.FragmentManagerImpl
            r0.<init>()
            r1.mFragmentManager = r0
            r1.mActivity = r2
            java.lang.String r2 = "context == null"
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r3, r2)
            android.content.Context r2 = (android.content.Context) r2
            r1.mContext = r2
            java.lang.String r2 = "handler == null"
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r4, r2)
            android.os.Handler r2 = (android.os.Handler) r2
            r1.mHandler = r2
            r1.mWindowAnimations = r5
            return
    }

    public FragmentHostCallback(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.os.Handler r3, int r4) {
            r1 = this;
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L8
            r0 = r2
            android.app.Activity r0 = (android.app.Activity) r0
            goto L9
        L8:
            r0 = 0
        L9:
            r1.<init>(r0, r2, r3, r4)
            return
    }

    @androidx.annotation.Nullable
    final android.app.Activity getActivity() {
            r1 = this;
            android.app.Activity r0 = r1.mActivity
            return r0
    }

    @androidx.annotation.NonNull
    final android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    @androidx.annotation.NonNull
    final android.os.Handler getHandler() {
            r1 = this;
            android.os.Handler r0 = r1.mHandler
            return r0
    }

    public void onDump(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.Nullable java.io.FileDescriptor r2, @androidx.annotation.NonNull java.io.PrintWriter r3, @androidx.annotation.Nullable java.lang.String[] r4) {
            r0 = this;
            return
    }

    @Override // androidx.fragment.app.FragmentContainer
    @androidx.annotation.Nullable
    public android.view.View onFindViewById(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @androidx.annotation.Nullable
    public abstract E onGetHost();

    @androidx.annotation.NonNull
    public android.view.LayoutInflater onGetLayoutInflater() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            return r0
    }

    public int onGetWindowAnimations() {
            r1 = this;
            int r0 = r1.mWindowAnimations
            return r0
    }

    @Override // androidx.fragment.app.FragmentContainer
    public boolean onHasView() {
            r1 = this;
            r0 = 1
            return r0
    }

    public boolean onHasWindowAnimations() {
            r1 = this;
            r0 = 1
            return r0
    }

    @java.lang.Deprecated
    public void onRequestPermissionsFromFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r1, @androidx.annotation.NonNull java.lang.String[] r2, int r3) {
            r0 = this;
            return
    }

    public boolean onShouldSaveFragmentState(@androidx.annotation.NonNull androidx.fragment.app.Fragment r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    public boolean onShouldShowRequestPermissionRationale(@androidx.annotation.NonNull java.lang.String r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void onStartActivityFromFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r2, @android.annotation.SuppressLint({"UnknownNullness"}) android.content.Intent r3, int r4) {
            r1 = this;
            r0 = 0
            r1.onStartActivityFromFragment(r2, r3, r4, r0)
            return
    }

    public void onStartActivityFromFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r1, @android.annotation.SuppressLint({"UnknownNullness"}) android.content.Intent r2, int r3, @androidx.annotation.Nullable android.os.Bundle r4) {
            r0 = this;
            r1 = -1
            if (r3 != r1) goto L9
            android.content.Context r1 = r0.mContext
            androidx.core.content.ContextCompat.startActivity(r1, r2, r4)
            return
        L9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Starting activity with a requestCode requires a FragmentActivity host"
            r1.<init>(r2)
            throw r1
    }

    @java.lang.Deprecated
    public void onStartIntentSenderFromFragment(@androidx.annotation.NonNull androidx.fragment.app.Fragment r10, @android.annotation.SuppressLint({"UnknownNullness"}) android.content.IntentSender r11, int r12, @androidx.annotation.Nullable android.content.Intent r13, int r14, int r15, int r16, @androidx.annotation.Nullable android.os.Bundle r17) throws android.content.IntentSender.SendIntentException {
            r9 = this;
            r0 = -1
            r3 = r12
            if (r3 != r0) goto L14
            r0 = r9
            android.app.Activity r1 = r0.mActivity
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            androidx.core.app.ActivityCompat.startIntentSenderForResult(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L14:
            r0 = r9
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Starting intent sender with a requestCode requires a FragmentActivity host"
            r1.<init>(r2)
            throw r1
    }

    public void onSupportInvalidateOptionsMenu() {
            r0 = this;
            return
    }
}
