package com.google.android.play.core.missingsplits;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class MissingSplitsDetectingApplication extends android.app.Application {
    private boolean onCreateCalled;

    public MissingSplitsDetectingApplication() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.onCreateCalled = r0
            return
    }

    @Override // android.app.Application
    public final void onCreate() {
            r2 = this;
            boolean r0 = r2.onCreateCalled
            if (r0 != 0) goto L19
            r0 = 1
            r2.onCreateCalled = r0
            com.google.android.play.core.missingsplits.MissingSplitsManager r0 = com.google.android.play.core.missingsplits.MissingSplitsManagerFactory.create(r2)
            boolean r0 = r0.disableAppIfMissingRequiredSplits()
            if (r0 == 0) goto L12
            return
        L12:
            super.onCreate()
            r2.onCreateCustom()
            return
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The onCreate method must be invoked at most once."
            r0.<init>(r1)
            throw r0
    }

    @java.lang.Deprecated
    public void onCreateCustom() {
            r0 = this;
            return
    }
}
