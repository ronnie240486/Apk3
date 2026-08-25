package com.google.android.play.core.appupdate;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AppUpdateOptions {

    /* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class Builder {
        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        public abstract com.google.android.play.core.appupdate.AppUpdateOptions build();

        @androidx.annotation.NonNull
        public abstract com.google.android.play.core.appupdate.AppUpdateOptions.Builder setAllowAssetPackDeletion(boolean r1);

        @androidx.annotation.NonNull
        public abstract com.google.android.play.core.appupdate.AppUpdateOptions.Builder setAppUpdateType(@com.google.android.play.core.install.model.AppUpdateType int r1);
    }

    public AppUpdateOptions() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.play.core.appupdate.AppUpdateOptions defaultOptions(@com.google.android.play.core.install.model.AppUpdateType int r0) {
            com.google.android.play.core.appupdate.AppUpdateOptions$Builder r0 = newBuilder(r0)
            com.google.android.play.core.appupdate.AppUpdateOptions r0 = r0.build()
            return r0
    }

    @androidx.annotation.NonNull
    public static com.google.android.play.core.appupdate.AppUpdateOptions.Builder newBuilder(@com.google.android.play.core.install.model.AppUpdateType int r1) {
            com.google.android.play.core.appupdate.zzu r0 = new com.google.android.play.core.appupdate.zzu
            r0.<init>()
            r0.setAppUpdateType(r1)
            r1 = 0
            r0.setAllowAssetPackDeletion(r1)
            return r0
    }

    public abstract boolean allowAssetPackDeletion();

    @com.google.android.play.core.install.model.AppUpdateType
    public abstract int appUpdateType();
}
