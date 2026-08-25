package io.realm.internal.android;

/* JADX INFO: loaded from: classes.dex */
@io.realm.internal.Keep
public class AndroidRealmNotifier extends io.realm.internal.RealmNotifier {
    private android.os.Handler handler;

    public AndroidRealmNotifier(@javax.annotation.Nullable io.realm.internal.OsSharedRealm r1, io.realm.internal.Capabilities r2) {
            r0 = this;
            r0.<init>(r1)
            boolean r1 = r2.canDeliverNotification()
            if (r1 == 0) goto L15
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.myLooper()
            r1.<init>(r2)
            r0.handler = r1
            goto L18
        L15:
            r1 = 0
            r0.handler = r1
        L18:
            return
    }

    @Override // io.realm.internal.RealmNotifier
    public boolean post(java.lang.Runnable r2) {
            r1 = this;
            android.os.Handler r0 = r1.handler
            if (r0 == 0) goto Lc
            boolean r2 = r0.post(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }
}
