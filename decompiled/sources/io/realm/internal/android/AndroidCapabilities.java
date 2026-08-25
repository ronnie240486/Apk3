package io.realm.internal.android;

/* JADX INFO: loaded from: classes2.dex */
public class AndroidCapabilities implements io.realm.internal.Capabilities {

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings({"MS_SHOULD_BE_FINAL", "MS_CANNOT_BE_FINAL"})
    public static boolean EMULATE_MAIN_THREAD;
    private final boolean isIntentServiceThread;
    private final android.os.Looper looper;

    public AndroidCapabilities() {
            r1 = this;
            r1.<init>()
            android.os.Looper r0 = android.os.Looper.myLooper()
            r1.looper = r0
            boolean r0 = isIntentServiceThread()
            r1.isIntentServiceThread = r0
            return
    }

    private boolean hasLooper() {
            r1 = this;
            android.os.Looper r0 = r1.looper
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    private static boolean isIntentServiceThread() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            if (r0 == 0) goto L14
            java.lang.String r1 = "IntentService["
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    @Override // io.realm.internal.Capabilities
    public boolean canDeliverNotification() {
            r1 = this;
            boolean r0 = r1.hasLooper()
            if (r0 == 0) goto Lc
            boolean r0 = r1.isIntentServiceThread
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // io.realm.internal.Capabilities
    public void checkCanDeliverNotification(@javax.annotation.Nullable java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.hasLooper()
            java.lang.String r1 = ""
            java.lang.String r2 = " "
            if (r0 != 0) goto L19
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            if (r4 != 0) goto Lf
            goto L15
        Lf:
            java.lang.String r1 = "Realm cannot be automatically updated on a thread without a looper."
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r2, r1)
        L15:
            r0.<init>(r1)
            throw r0
        L19:
            boolean r0 = r3.isIntentServiceThread
            if (r0 == 0) goto L2c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            if (r4 != 0) goto L22
            goto L28
        L22:
            java.lang.String r1 = "Realm cannot be automatically updated on an IntentService thread."
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4, r2, r1)
        L28:
            r0.<init>(r1)
            throw r0
        L2c:
            return
    }

    @Override // io.realm.internal.Capabilities
    public boolean isMainThread() {
            r2 = this;
            android.os.Looper r0 = r2.looper
            if (r0 == 0) goto L10
            boolean r1 = io.realm.internal.android.AndroidCapabilities.EMULATE_MAIN_THREAD
            if (r1 != 0) goto Le
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L10
        Le:
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }
}
