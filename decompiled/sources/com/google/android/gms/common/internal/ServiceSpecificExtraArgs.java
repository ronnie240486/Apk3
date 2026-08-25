package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public final class ServiceSpecificExtraArgs {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface CastExtraArgs {

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String LISTENER = "listener";
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface GamesExtraArgs {

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String DESIRED_LOCALE = "com.google.android.gms.games.key.desiredLocale";

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String GAME_PACKAGE_NAME = "com.google.android.gms.games.key.gamePackageName";

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String SIGNIN_OPTIONS = "com.google.android.gms.games.key.signInOptions";

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String WINDOW_TOKEN = "com.google.android.gms.games.key.popupWindowToken";
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface PlusExtraArgs {

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static final java.lang.String PLUS_AUTH_PACKAGE = "auth_package";
    }

    private ServiceSpecificExtraArgs() {
            r0 = this;
            r0.<init>()
            return
    }
}
