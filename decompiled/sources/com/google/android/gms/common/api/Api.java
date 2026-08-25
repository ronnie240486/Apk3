package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Api.ApiOptions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
public final class Api<O extends com.google.android.gms.common.api.Api.ApiOptions> {
    private final com.google.android.gms.common.api.Api.AbstractClientBuilder<?, O> zaa;
    private final com.google.android.gms.common.api.Api.ClientKey<?> zab;
    private final java.lang.String zac;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* JADX INFO: loaded from: classes.dex */
    @com.google.android.gms.common.util.VisibleForTesting
    @com.google.android.gms.common.annotation.KeepForSdk
    public static abstract class AbstractClientBuilder<T extends com.google.android.gms.common.api.Api.Client, O> extends com.google.android.gms.common.api.Api.BaseClientBuilder<T, O> {
        public AbstractClientBuilder() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        @java.lang.Deprecated
        public T buildClient(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.os.Looper r2, @androidx.annotation.NonNull com.google.android.gms.common.internal.ClientSettings r3, @androidx.annotation.NonNull O r4, @androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks r5, @androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener r6) {
                r0 = this;
                com.google.android.gms.common.api.Api$Client r1 = r0.buildClient(r1, r2, r3, r4, r5, r6)
                return r1
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public T buildClient(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.os.Looper r2, @androidx.annotation.NonNull com.google.android.gms.common.internal.ClientSettings r3, @androidx.annotation.NonNull O r4, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.ConnectionCallbacks r5, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.OnConnectionFailedListener r6) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                java.lang.String r2 = "buildClient must be implemented"
                r1.<init>(r2)
                throw r1
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface AnyClient {
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class AnyClientKey<C extends com.google.android.gms.common.api.Api.AnyClient> {
        public AnyClientKey() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* JADX INFO: loaded from: classes.dex */
    public interface ApiOptions {

        @androidx.annotation.NonNull
        public static final com.google.android.gms.common.api.Api.ApiOptions.NoOptions NO_OPTIONS = null;

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        /* JADX INFO: loaded from: classes2.dex */
        public interface HasAccountOptions extends com.google.android.gms.common.api.Api.ApiOptions.HasOptions, com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions {
            @androidx.annotation.NonNull
            android.accounts.Account getAccount();
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        /* JADX INFO: loaded from: classes2.dex */
        public interface HasGoogleSignInAccountOptions extends com.google.android.gms.common.api.Api.ApiOptions.HasOptions {
            @androidx.annotation.Nullable
            com.google.android.gms.auth.api.signin.GoogleSignInAccount getGoogleSignInAccount();
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        /* JADX INFO: loaded from: classes3.dex */
        public interface HasOptions extends com.google.android.gms.common.api.Api.ApiOptions {
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public static final class NoOptions implements com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions {
            private NoOptions() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ NoOptions(com.google.android.gms.common.api.zaa r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        public interface NotRequiredOptions extends com.google.android.gms.common.api.Api.ApiOptions {
        }

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        /* JADX INFO: loaded from: classes3.dex */
        public interface Optional extends com.google.android.gms.common.api.Api.ApiOptions.HasOptions, com.google.android.gms.common.api.Api.ApiOptions.NotRequiredOptions {
        }

        static {
                com.google.android.gms.common.api.Api$ApiOptions$NoOptions r0 = new com.google.android.gms.common.api.Api$ApiOptions$NoOptions
                r1 = 0
                r0.<init>(r1)
                com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS = r0
                return
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* JADX INFO: loaded from: classes.dex */
    @com.google.android.gms.common.util.VisibleForTesting
    @com.google.android.gms.common.annotation.KeepForSdk
    public static abstract class BaseClientBuilder<T extends com.google.android.gms.common.api.Api.AnyClient, O> {

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final int API_PRIORITY_GAMES = 1;

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final int API_PRIORITY_OTHER = Integer.MAX_VALUE;

        @com.google.android.gms.common.annotation.KeepForSdk
        public static final int API_PRIORITY_PLUS = 2;

        public BaseClientBuilder() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public java.util.List<com.google.android.gms.common.api.Scope> getImpliedScopes(@androidx.annotation.Nullable O r1) {
                r0 = this;
                java.util.List r1 = java.util.Collections.emptyList()
                return r1
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public int getPriority() {
                r1 = this;
                r0 = 2147483647(0x7fffffff, float:NaN)
                return r0
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface Client extends com.google.android.gms.common.api.Api.AnyClient {
        @com.google.android.gms.common.annotation.KeepForSdk
        void connect(@androidx.annotation.NonNull com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks r1);

        @com.google.android.gms.common.annotation.KeepForSdk
        void disconnect();

        @com.google.android.gms.common.annotation.KeepForSdk
        void disconnect(@androidx.annotation.NonNull java.lang.String r1);

        @com.google.android.gms.common.annotation.KeepForSdk
        void dump(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.Nullable java.io.FileDescriptor r2, @androidx.annotation.NonNull java.io.PrintWriter r3, @androidx.annotation.Nullable java.lang.String[] r4);

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        com.google.android.gms.common.Feature[] getAvailableFeatures();

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        java.lang.String getEndpointPackageName();

        @androidx.annotation.Nullable
        @com.google.android.gms.common.annotation.KeepForSdk
        java.lang.String getLastDisconnectMessage();

        @com.google.android.gms.common.annotation.KeepForSdk
        int getMinApkVersion();

        @com.google.android.gms.common.annotation.KeepForSdk
        void getRemoteService(@androidx.annotation.Nullable com.google.android.gms.common.internal.IAccountAccessor r1, @androidx.annotation.Nullable java.util.Set<com.google.android.gms.common.api.Scope> r2);

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        com.google.android.gms.common.Feature[] getRequiredFeatures();

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        java.util.Set<com.google.android.gms.common.api.Scope> getScopesForConnectionlessNonSignIn();

        @androidx.annotation.Nullable
        @com.google.android.gms.common.annotation.KeepForSdk
        android.os.IBinder getServiceBrokerBinder();

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        android.content.Intent getSignInIntent();

        @com.google.android.gms.common.annotation.KeepForSdk
        boolean isConnected();

        @com.google.android.gms.common.annotation.KeepForSdk
        boolean isConnecting();

        @com.google.android.gms.common.annotation.KeepForSdk
        void onUserSignOut(@androidx.annotation.NonNull com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks r1);

        @com.google.android.gms.common.annotation.KeepForSdk
        boolean providesSignIn();

        @com.google.android.gms.common.annotation.KeepForSdk
        boolean requiresAccount();

        @com.google.android.gms.common.annotation.KeepForSdk
        boolean requiresGooglePlayServices();

        @com.google.android.gms.common.annotation.KeepForSdk
        boolean requiresSignIn();
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @com.google.android.gms.common.util.VisibleForTesting
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final class ClientKey<C extends com.google.android.gms.common.api.Api.Client> extends com.google.android.gms.common.api.Api.AnyClientKey<C> {
        public ClientKey() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public <C extends com.google.android.gms.common.api.Api.Client> Api(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull com.google.android.gms.common.api.Api.AbstractClientBuilder<C, O> r3, @androidx.annotation.NonNull com.google.android.gms.common.api.Api.ClientKey<C> r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Cannot construct an Api with a null ClientBuilder"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            java.lang.String r0 = "Cannot construct an Api with a null ClientKey"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4, r0)
            r1.zac = r2
            r1.zaa = r3
            r1.zab = r4
            return
    }

    @androidx.annotation.NonNull
    public final com.google.android.gms.common.api.Api.AbstractClientBuilder<?, O> zaa() {
            r1 = this;
            com.google.android.gms.common.api.Api$AbstractClientBuilder<?, O extends com.google.android.gms.common.api.Api$ApiOptions> r0 = r1.zaa
            return r0
    }

    @androidx.annotation.NonNull
    public final com.google.android.gms.common.api.Api.AnyClientKey<?> zab() {
            r1 = this;
            com.google.android.gms.common.api.Api$ClientKey<?> r0 = r1.zab
            return r0
    }

    @androidx.annotation.NonNull
    public final com.google.android.gms.common.api.Api.BaseClientBuilder<?, O> zac() {
            r1 = this;
            com.google.android.gms.common.api.Api$AbstractClientBuilder<?, O extends com.google.android.gms.common.api.Api$ApiOptions> r0 = r1.zaa
            return r0
    }

    @androidx.annotation.NonNull
    public final java.lang.String zad() {
            r1 = this;
            java.lang.String r0 = r1.zac
            return r0
    }
}
