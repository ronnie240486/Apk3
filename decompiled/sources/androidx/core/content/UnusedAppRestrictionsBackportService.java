package androidx.core.content;

/* JADX INFO: loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends android.app.Service {

    @android.annotation.SuppressLint({"ActionValue"})
    public static final java.lang.String ACTION_UNUSED_APP_RESTRICTIONS_BACKPORT_CONNECTION = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";
    private androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService.Stub mBinder;


    public UnusedAppRestrictionsBackportService() {
            r1 = this;
            r1.<init>()
            androidx.core.content.UnusedAppRestrictionsBackportService$1 r0 = new androidx.core.content.UnusedAppRestrictionsBackportService$1
            r0.<init>(r1)
            r1.mBinder = r0
            return
    }

    public abstract void isPermissionRevocationEnabled();

    @Override // android.app.Service
    @androidx.annotation.Nullable
    public android.os.IBinder onBind(@androidx.annotation.Nullable android.content.Intent r1) {
            r0 = this;
            androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService$Stub r1 = r0.mBinder
            return r1
    }
}
