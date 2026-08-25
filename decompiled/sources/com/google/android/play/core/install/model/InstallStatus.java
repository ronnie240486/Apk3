package com.google.android.play.core.install.model;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface InstallStatus {
    public static final int CANCELED = 6;
    public static final int DOWNLOADED = 11;
    public static final int DOWNLOADING = 2;
    public static final int FAILED = 5;
    public static final int INSTALLED = 4;
    public static final int INSTALLING = 3;
    public static final int PENDING = 1;

    @java.lang.Deprecated
    public static final int REQUIRES_UI_INTENT = 10;
    public static final int UNKNOWN = 0;
}
