package com.google.android.play.core.install.model;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes2.dex */
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface InstallErrorCode {
    public static final int ERROR_API_NOT_AVAILABLE = -3;
    public static final int ERROR_APP_NOT_OWNED = -10;
    public static final int ERROR_DOWNLOAD_NOT_PRESENT = -7;
    public static final int ERROR_INSTALL_NOT_ALLOWED = -6;
    public static final int ERROR_INSTALL_UNAVAILABLE = -5;
    public static final int ERROR_INTERNAL_ERROR = -100;
    public static final int ERROR_INVALID_REQUEST = -4;
    public static final int ERROR_PLAY_STORE_NOT_FOUND = -9;
    public static final int ERROR_UNKNOWN = -2;
    public static final int NO_ERROR = 0;

    @java.lang.Deprecated
    public static final int NO_ERROR_PARTIALLY_ALLOWED = 1;
}
