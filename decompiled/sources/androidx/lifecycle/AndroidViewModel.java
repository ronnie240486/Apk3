package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public class AndroidViewModel extends androidx.lifecycle.ViewModel {

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    private android.app.Application mApplication;

    public AndroidViewModel(@androidx.annotation.NonNull android.app.Application r1) {
            r0 = this;
            r0.<init>()
            r0.mApplication = r1
            return
    }

    @androidx.annotation.NonNull
    public <T extends android.app.Application> T getApplication() {
            r1 = this;
            android.app.Application r0 = r1.mApplication
            return r0
    }
}
