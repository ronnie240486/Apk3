package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class MultiWindowModeChangedInfo {
    private final boolean mIsInMultiWindowMode;
    private final android.content.res.Configuration mNewConfig;

    public MultiWindowModeChangedInfo(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.mIsInMultiWindowMode = r1
            r1 = 0
            r0.mNewConfig = r1
            return
    }

    @androidx.annotation.RequiresApi(26)
    public MultiWindowModeChangedInfo(boolean r1, @androidx.annotation.NonNull android.content.res.Configuration r2) {
            r0 = this;
            r0.<init>()
            r0.mIsInMultiWindowMode = r1
            r0.mNewConfig = r2
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(26)
    public android.content.res.Configuration getNewConfig() {
            r2 = this;
            android.content.res.Configuration r0 = r2.mNewConfig
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?"
            r0.<init>(r1)
            throw r0
    }

    public boolean isInMultiWindowMode() {
            r1 = this;
            boolean r0 = r1.mIsInMultiWindowMode
            return r0
    }
}
