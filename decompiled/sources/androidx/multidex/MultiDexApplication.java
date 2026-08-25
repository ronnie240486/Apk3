package androidx.multidex;

/* JADX INFO: loaded from: classes2.dex */
public class MultiDexApplication extends android.app.Application {
    public MultiDexApplication() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context r1) {
            r0 = this;
            super.attachBaseContext(r1)
            androidx.multidex.MultiDex.install(r0)
            return
    }
}
