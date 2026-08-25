package org.androidannotations.api;

/* JADX INFO: loaded from: classes3.dex */
public class SdkVersionHelper {

    /* JADX INFO: loaded from: classes.dex */
    public static class HelperInternal {
        private HelperInternal() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ int access$000() {
                int r0 = getSdkIntInternal()
                return r0
        }

        private static int getSdkIntInternal() {
                int r0 = android.os.Build.VERSION.SDK_INT
                return r0
        }
    }

    public SdkVersionHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getSdkInt() {
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            java.lang.String r1 = "1.5"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto Lc
            r0 = 3
            return r0
        Lc:
            int r0 = org.androidannotations.api.SdkVersionHelper.HelperInternal.access$000()
            return r0
    }
}
