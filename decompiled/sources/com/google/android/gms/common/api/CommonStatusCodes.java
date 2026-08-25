package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class CommonStatusCodes {
    public static final int API_NOT_CONNECTED = 17;
    public static final int CANCELED = 16;
    public static final int CONNECTION_SUSPENDED_DURING_CALL = 20;
    public static final int DEVELOPER_ERROR = 10;
    public static final int ERROR = 13;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 14;
    public static final int INVALID_ACCOUNT = 5;
    public static final int NETWORK_ERROR = 7;
    public static final int RECONNECTION_TIMED_OUT = 22;
    public static final int RECONNECTION_TIMED_OUT_DURING_UPDATE = 21;
    public static final int REMOTE_EXCEPTION = 19;
    public static final int RESOLUTION_REQUIRED = 6;

    @java.lang.Deprecated
    public static final int SERVICE_DISABLED = 3;

    @java.lang.Deprecated
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int SUCCESS_CACHE = -1;
    public static final int TIMEOUT = 15;

    @com.google.android.gms.common.annotation.KeepForSdk
    public CommonStatusCodes() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static java.lang.String getStatusCodeString(int r2) {
            switch(r2) {
                case -1: goto L46;
                case 0: goto L43;
                case 1: goto L3;
                case 2: goto L40;
                case 3: goto L3d;
                case 4: goto L3a;
                case 5: goto L37;
                case 6: goto L34;
                case 7: goto L31;
                case 8: goto L2e;
                case 9: goto L3;
                case 10: goto L2b;
                case 11: goto L3;
                case 12: goto L3;
                case 13: goto L28;
                case 14: goto L25;
                case 15: goto L22;
                case 16: goto L1f;
                case 17: goto L1c;
                case 18: goto L19;
                case 19: goto L16;
                case 20: goto L13;
                case 21: goto L10;
                case 22: goto Ld;
                default: goto L3;
            }
        L3:
            r0 = 32
            java.lang.String r1 = "unknown status code: "
            java.lang.String r2 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r0, r1, r2)
            return r2
        Ld:
            java.lang.String r2 = "RECONNECTION_TIMED_OUT"
            return r2
        L10:
            java.lang.String r2 = "RECONNECTION_TIMED_OUT_DURING_UPDATE"
            return r2
        L13:
            java.lang.String r2 = "CONNECTION_SUSPENDED_DURING_CALL"
            return r2
        L16:
            java.lang.String r2 = "REMOTE_EXCEPTION"
            return r2
        L19:
            java.lang.String r2 = "DEAD_CLIENT"
            return r2
        L1c:
            java.lang.String r2 = "API_NOT_CONNECTED"
            return r2
        L1f:
            java.lang.String r2 = "CANCELED"
            return r2
        L22:
            java.lang.String r2 = "TIMEOUT"
            return r2
        L25:
            java.lang.String r2 = "INTERRUPTED"
            return r2
        L28:
            java.lang.String r2 = "ERROR"
            return r2
        L2b:
            java.lang.String r2 = "DEVELOPER_ERROR"
            return r2
        L2e:
            java.lang.String r2 = "INTERNAL_ERROR"
            return r2
        L31:
            java.lang.String r2 = "NETWORK_ERROR"
            return r2
        L34:
            java.lang.String r2 = "RESOLUTION_REQUIRED"
            return r2
        L37:
            java.lang.String r2 = "INVALID_ACCOUNT"
            return r2
        L3a:
            java.lang.String r2 = "SIGN_IN_REQUIRED"
            return r2
        L3d:
            java.lang.String r2 = "SERVICE_DISABLED"
            return r2
        L40:
            java.lang.String r2 = "SERVICE_VERSION_UPDATE_REQUIRED"
            return r2
        L43:
            java.lang.String r2 = "SUCCESS"
            return r2
        L46:
            java.lang.String r2 = "SUCCESS_CACHE"
            return r2
    }
}
