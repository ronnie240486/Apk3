package androidx.core.content;

/* JADX INFO: loaded from: classes2.dex */
public class UnusedAppRestrictionsBackportCallback {
    private androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback mCallback;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public UnusedAppRestrictionsBackportCallback(@androidx.annotation.NonNull androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback r1) {
            r0 = this;
            r0.<init>()
            r0.mCallback = r1
            return
    }

    public void onResult(boolean r2, boolean r3) throws android.os.RemoteException {
            r1 = this;
            androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback r0 = r1.mCallback
            r0.onIsPermissionRevocationEnabledForAppResult(r2, r3)
            return
    }
}
