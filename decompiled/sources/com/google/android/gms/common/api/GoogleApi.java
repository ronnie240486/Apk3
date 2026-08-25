package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Api.ApiOptions;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public abstract class GoogleApi<O extends com.google.android.gms.common.api.Api.ApiOptions> implements com.google.android.gms.common.api.HasApiKey<O> {

    @androidx.annotation.NonNull
    public final com.google.android.gms.common.api.internal.GoogleApiManager zaa;
    private final android.content.Context zab;

    @androidx.annotation.Nullable
    private final java.lang.String zac;
    private final com.google.android.gms.common.api.Api<O> zad;
    private final O zae;
    private final com.google.android.gms.common.api.internal.ApiKey<O> zaf;
    private final android.os.Looper zag;
    private final int zah;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.google.android.gms.common.api.GoogleApiClient zai;
    private final com.google.android.gms.common.api.internal.StatusExceptionMapper zaj;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* JADX INFO: loaded from: classes3.dex */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class Settings {

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public static final com.google.android.gms.common.api.GoogleApi.Settings DEFAULT_SETTINGS = null;

        @androidx.annotation.NonNull
        public final com.google.android.gms.common.api.internal.StatusExceptionMapper zaa;

        @androidx.annotation.NonNull
        public final android.os.Looper zab;

        /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        @com.google.android.gms.common.annotation.KeepForSdk
        public static class Builder {
            private com.google.android.gms.common.api.internal.StatusExceptionMapper zaa;
            private android.os.Looper zab;

            @com.google.android.gms.common.annotation.KeepForSdk
            public Builder() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @androidx.annotation.NonNull
            @com.google.android.gms.common.annotation.KeepForSdk
            public com.google.android.gms.common.api.GoogleApi.Settings build() {
                    r3 = this;
                    com.google.android.gms.common.api.internal.StatusExceptionMapper r0 = r3.zaa
                    if (r0 != 0) goto Lb
                    com.google.android.gms.common.api.internal.ApiExceptionMapper r0 = new com.google.android.gms.common.api.internal.ApiExceptionMapper
                    r0.<init>()
                    r3.zaa = r0
                Lb:
                    android.os.Looper r0 = r3.zab
                    if (r0 != 0) goto L15
                    android.os.Looper r0 = android.os.Looper.getMainLooper()
                    r3.zab = r0
                L15:
                    com.google.android.gms.common.api.GoogleApi$Settings r0 = new com.google.android.gms.common.api.GoogleApi$Settings
                    com.google.android.gms.common.api.internal.StatusExceptionMapper r1 = r3.zaa
                    android.os.Looper r2 = r3.zab
                    r0.<init>(r1, r2)
                    return r0
            }

            @androidx.annotation.NonNull
            @com.google.android.gms.common.annotation.KeepForSdk
            public com.google.android.gms.common.api.GoogleApi.Settings.Builder setLooper(@androidx.annotation.NonNull android.os.Looper r2) {
                    r1 = this;
                    java.lang.String r0 = "Looper must not be null."
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                    r1.zab = r2
                    return r1
            }

            @androidx.annotation.NonNull
            @com.google.android.gms.common.annotation.KeepForSdk
            public com.google.android.gms.common.api.GoogleApi.Settings.Builder setMapper(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.StatusExceptionMapper r2) {
                    r1 = this;
                    java.lang.String r0 = "StatusExceptionMapper must not be null."
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
                    r1.zaa = r2
                    return r1
            }
        }

        static {
                com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
                r0.<init>()
                com.google.android.gms.common.api.GoogleApi$Settings r0 = r0.build()
                com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS = r0
                return
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        private Settings(com.google.android.gms.common.api.internal.StatusExceptionMapper r1, android.accounts.Account r2, android.os.Looper r3) {
                r0 = this;
                r0.<init>()
                r0.zaa = r1
                r0.zab = r3
                return
        }

        public /* synthetic */ Settings(com.google.android.gms.common.api.internal.StatusExceptionMapper r2, android.os.Looper r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0, r3)
                return
        }
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @androidx.annotation.MainThread
    public GoogleApi(@androidx.annotation.NonNull android.app.Activity r7, @androidx.annotation.NonNull com.google.android.gms.common.api.Api<O> r8, @androidx.annotation.NonNull O r9, @androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApi.Settings r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public GoogleApi(@androidx.annotation.NonNull android.app.Activity r2, @androidx.annotation.NonNull com.google.android.gms.common.api.Api<O> r3, @androidx.annotation.NonNull O r4, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.StatusExceptionMapper r5) {
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.setMapper(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.setLooper(r5)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.build()
            r1.<init>(r2, r3, r4, r5)
            return
    }

    private GoogleApi(@androidx.annotation.NonNull android.content.Context r6, @androidx.annotation.Nullable android.app.Activity r7, com.google.android.gms.common.api.Api<O> r8, O r9, com.google.android.gms.common.api.GoogleApi.Settings r10) {
            r5 = this;
            r5.<init>()
            java.lang.String r0 = "Null context is not permitted."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6, r0)
            java.lang.String r0 = "Api must not be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r8, r0)
            java.lang.String r0 = "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r10, r0)
            android.content.Context r0 = r6.getApplicationContext()
            r5.zab = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastR()
            r1 = 0
            if (r0 == 0) goto L35
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.String r2 = "getAttributionTag"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L34
            java.lang.reflect.Method r0 = r0.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L34
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L34
            java.lang.Object r6 = r0.invoke(r6, r2)     // Catch: java.lang.Throwable -> L34
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L34
            r1 = r6
            goto L35
        L34:
        L35:
            r5.zac = r1
            r5.zad = r8
            r5.zae = r9
            android.os.Looper r6 = r10.zab
            r5.zag = r6
            com.google.android.gms.common.api.internal.ApiKey r6 = com.google.android.gms.common.api.internal.ApiKey.zaa(r8, r9, r1)
            r5.zaf = r6
            com.google.android.gms.common.api.internal.zabv r8 = new com.google.android.gms.common.api.internal.zabv
            r8.<init>(r5)
            r5.zai = r8
            android.content.Context r8 = r5.zab
            com.google.android.gms.common.api.internal.GoogleApiManager r8 = com.google.android.gms.common.api.internal.GoogleApiManager.zam(r8)
            r5.zaa = r8
            int r9 = r8.zaa()
            r5.zah = r9
            com.google.android.gms.common.api.internal.StatusExceptionMapper r9 = r10.zaa
            r5.zaj = r9
            if (r7 == 0) goto L71
            boolean r9 = r7 instanceof com.google.android.gms.common.api.GoogleApiActivity
            if (r9 != 0) goto L71
            android.os.Looper r9 = android.os.Looper.myLooper()
            android.os.Looper r10 = android.os.Looper.getMainLooper()
            if (r9 != r10) goto L71
            com.google.android.gms.common.api.internal.zaae.zad(r7, r8, r6)
        L71:
            r8.zaB(r5)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public GoogleApi(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull com.google.android.gms.common.api.Api<O> r3, @androidx.annotation.NonNull O r4, @androidx.annotation.NonNull android.os.Looper r5, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.StatusExceptionMapper r6) {
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.setLooper(r5)
            r0.setMapper(r6)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.build()
            r1.<init>(r2, r3, r4, r5)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public GoogleApi(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.NonNull com.google.android.gms.common.api.Api<O> r8, @androidx.annotation.NonNull O r9, @androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApi.Settings r10) {
            r6 = this;
            r2 = 0
            r0 = r6
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public GoogleApi(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull com.google.android.gms.common.api.Api<O> r3, @androidx.annotation.NonNull O r4, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.StatusExceptionMapper r5) {
            r1 = this;
            com.google.android.gms.common.api.GoogleApi$Settings$Builder r0 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder
            r0.<init>()
            r0.setMapper(r5)
            com.google.android.gms.common.api.GoogleApi$Settings r5 = r0.build()
            r1.<init>(r2, r3, r4, r5)
            return
    }

    private final <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T zad(int r2, @androidx.annotation.NonNull T r3) {
            r1 = this;
            r3.zak()
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r1.zaa
            r0.zaw(r1, r2, r3)
            return r3
    }

    private final <TResult, A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<TResult> zae(int r8, @androidx.annotation.NonNull com.google.android.gms.common.api.internal.TaskApiCall<A, TResult> r9) {
            r7 = this;
            com.google.android.gms.tasks.TaskCompletionSource r6 = new com.google.android.gms.tasks.TaskCompletionSource
            r6.<init>()
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r7.zaa
            com.google.android.gms.common.api.internal.StatusExceptionMapper r5 = r7.zaj
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r6
            r0.zax(r1, r2, r3, r4, r5)
            com.google.android.gms.tasks.Task r8 = r6.getTask()
            return r8
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient() {
            r1 = this;
            com.google.android.gms.common.api.GoogleApiClient r0 = r1.zai
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public final com.google.android.gms.common.internal.ClientSettings.Builder createClientSettingsBuilder() {
            r3 = this;
            com.google.android.gms.common.internal.ClientSettings$Builder r0 = new com.google.android.gms.common.internal.ClientSettings$Builder
            r0.<init>()
            O extends com.google.android.gms.common.api.Api$ApiOptions r1 = r3.zae
            boolean r2 = r1 instanceof com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions
            if (r2 == 0) goto L18
            com.google.android.gms.common.api.Api$ApiOptions$HasGoogleSignInAccountOptions r1 = (com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.getGoogleSignInAccount()
            if (r1 == 0) goto L18
            android.accounts.Account r1 = r1.getAccount()
            goto L26
        L18:
            O extends com.google.android.gms.common.api.Api$ApiOptions r1 = r3.zae
            boolean r2 = r1 instanceof com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions
            if (r2 == 0) goto L25
            com.google.android.gms.common.api.Api$ApiOptions$HasAccountOptions r1 = (com.google.android.gms.common.api.Api.ApiOptions.HasAccountOptions) r1
            android.accounts.Account r1 = r1.getAccount()
            goto L26
        L25:
            r1 = 0
        L26:
            r0.zab(r1)
            O extends com.google.android.gms.common.api.Api$ApiOptions r1 = r3.zae
            boolean r2 = r1 instanceof com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions
            if (r2 == 0) goto L41
            com.google.android.gms.common.api.Api$ApiOptions$HasGoogleSignInAccountOptions r1 = (com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.getGoogleSignInAccount()
            if (r1 != 0) goto L3c
            java.util.Set r1 = java.util.Collections.emptySet()
            goto L45
        L3c:
            java.util.Set r1 = r1.getRequestedScopes()
            goto L45
        L41:
            java.util.Set r1 = java.util.Collections.emptySet()
        L45:
            r0.zaa(r1)
            android.content.Context r1 = r3.zab
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.zac(r1)
            android.content.Context r1 = r3.zab
            java.lang.String r1 = r1.getPackageName()
            r0.setRealClientPackageName(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T doBestEffortWrite(@androidx.annotation.NonNull T r2) {
            r1 = this;
            r0 = 2
            r1.zad(r0, r2)
            return r2
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public <TResult, A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<TResult> doBestEffortWrite(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.TaskApiCall<A, TResult> r2) {
            r1 = this;
            r0 = 2
            com.google.android.gms.tasks.Task r2 = r1.zae(r0, r2)
            return r2
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T doRead(@androidx.annotation.NonNull T r2) {
            r1 = this;
            r0 = 0
            r1.zad(r0, r2)
            return r2
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public <TResult, A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<TResult> doRead(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.TaskApiCall<A, TResult> r2) {
            r1 = this;
            r0 = 0
            com.google.android.gms.tasks.Task r2 = r1.zae(r0, r2)
            return r2
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.RegisterListenerMethod<A, ?>, U extends com.google.android.gms.common.api.internal.UnregisterListenerMethod<A, ?>> com.google.android.gms.tasks.Task<java.lang.Void> doRegisterEventListener(@androidx.annotation.NonNull T r3, @androidx.annotation.NonNull U r4) {
            r2 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r3.getListenerKey()
            java.lang.String r1 = "Listener has already been released."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r4.getListenerKey()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r3.getListenerKey()
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r1 = r4.getListenerKey()
            boolean r0 = com.google.android.gms.common.internal.Objects.equal(r0, r1)
            java.lang.String r1 = "Listener registration and unregistration methods must be constructed with the same ListenerHolder."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r1)
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r2.zaa
            com.google.android.gms.common.api.zad r1 = com.google.android.gms.common.api.zad.zaa
            com.google.android.gms.tasks.Task r3 = r0.zaq(r2, r3, r4, r1)
            return r3
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public <A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<java.lang.Void> doRegisterEventListener(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.RegistrationMethods<A, ?> r4) {
            r3 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.common.api.internal.RegisterListenerMethod<A extends com.google.android.gms.common.api.Api$AnyClient, L> r0 = r4.register
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r0.getListenerKey()
            java.lang.String r1 = "Listener has already been released."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.gms.common.api.internal.UnregisterListenerMethod<A extends com.google.android.gms.common.api.Api$AnyClient, L> r0 = r4.zaa
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r0.getListenerKey()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r3.zaa
            com.google.android.gms.common.api.internal.RegisterListenerMethod<A extends com.google.android.gms.common.api.Api$AnyClient, L> r1 = r4.register
            com.google.android.gms.common.api.internal.UnregisterListenerMethod<A extends com.google.android.gms.common.api.Api$AnyClient, L> r2 = r4.zaa
            java.lang.Runnable r4 = r4.zab
            com.google.android.gms.tasks.Task r4 = r0.zaq(r3, r1, r2, r4)
            return r4
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.tasks.Task<java.lang.Boolean> doUnregisterEventListener(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?> r2) {
            r1 = this;
            r0 = 0
            com.google.android.gms.tasks.Task r2 = r1.doUnregisterEventListener(r2, r0)
            return r2
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.tasks.Task<java.lang.Boolean> doUnregisterEventListener(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<?> r2, int r3) {
            r1 = this;
            java.lang.String r0 = "Listener key cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            com.google.android.gms.common.api.internal.GoogleApiManager r0 = r1.zaa
            com.google.android.gms.tasks.Task r2 = r0.zar(r1, r2, r3)
            return r2
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public <A extends com.google.android.gms.common.api.Api.AnyClient, T extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<? extends com.google.android.gms.common.api.Result, A>> T doWrite(@androidx.annotation.NonNull T r2) {
            r1 = this;
            r0 = 1
            r1.zad(r0, r2)
            return r2
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public <TResult, A extends com.google.android.gms.common.api.Api.AnyClient> com.google.android.gms.tasks.Task<TResult> doWrite(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.TaskApiCall<A, TResult> r2) {
            r1 = this;
            r0 = 1
            com.google.android.gms.tasks.Task r2 = r1.zae(r0, r2)
            return r2
    }

    @Override // com.google.android.gms.common.api.HasApiKey
    @androidx.annotation.NonNull
    public final com.google.android.gms.common.api.internal.ApiKey<O> getApiKey() {
            r1 = this;
            com.google.android.gms.common.api.internal.ApiKey<O extends com.google.android.gms.common.api.Api$ApiOptions> r0 = r1.zaf
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public O getApiOptions() {
            r1 = this;
            O extends com.google.android.gms.common.api.Api$ApiOptions r0 = r1.zae
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.content.Context getApplicationContext() {
            r1 = this;
            android.content.Context r0 = r1.zab
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public android.os.Looper getLooper() {
            r1 = this;
            android.os.Looper r0 = r1.zag
            return r0
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public <L> com.google.android.gms.common.api.internal.ListenerHolder<L> registerListener(@androidx.annotation.NonNull L r2, @androidx.annotation.NonNull java.lang.String r3) {
            r1 = this;
            android.os.Looper r0 = r1.zag
            com.google.android.gms.common.api.internal.ListenerHolder r2 = com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(r2, r0, r3)
            return r2
    }

    public final int zaa() {
            r1 = this;
            int r0 = r1.zah
            return r0
    }

    @androidx.annotation.WorkerThread
    public final com.google.android.gms.common.api.Api.Client zab(android.os.Looper r9, com.google.android.gms.common.api.internal.zabq<O> r10) {
            r8 = this;
            com.google.android.gms.common.internal.ClientSettings$Builder r0 = r8.createClientSettingsBuilder()
            com.google.android.gms.common.internal.ClientSettings r4 = r0.build()
            com.google.android.gms.common.api.Api<O extends com.google.android.gms.common.api.Api$ApiOptions> r0 = r8.zad
            com.google.android.gms.common.api.Api$AbstractClientBuilder r0 = r0.zaa()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            r1 = r0
            com.google.android.gms.common.api.Api$AbstractClientBuilder r1 = (com.google.android.gms.common.api.Api.AbstractClientBuilder) r1
            android.content.Context r2 = r8.zab
            O extends com.google.android.gms.common.api.Api$ApiOptions r5 = r8.zae
            r3 = r9
            r6 = r10
            r7 = r10
            com.google.android.gms.common.api.Api$Client r9 = r1.buildClient(r2, r3, r4, r5, r6, r7)
            java.lang.String r10 = r8.zac
            if (r10 == 0) goto L2e
            boolean r0 = r9 instanceof com.google.android.gms.common.internal.BaseGmsClient
            if (r0 == 0) goto L2e
            r0 = r9
            com.google.android.gms.common.internal.BaseGmsClient r0 = (com.google.android.gms.common.internal.BaseGmsClient) r0
            r0.setAttributionTag(r10)
        L2e:
            if (r10 == 0) goto L3a
            boolean r0 = r9 instanceof com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient
            if (r0 == 0) goto L3a
            r0 = r9
            com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient r0 = (com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient) r0
            r0.zac(r10)
        L3a:
            return r9
    }

    public final com.google.android.gms.common.api.internal.zact zac(android.content.Context r3, android.os.Handler r4) {
            r2 = this;
            com.google.android.gms.common.api.internal.zact r0 = new com.google.android.gms.common.api.internal.zact
            com.google.android.gms.common.internal.ClientSettings$Builder r1 = r2.createClientSettingsBuilder()
            com.google.android.gms.common.internal.ClientSettings r1 = r1.build()
            r0.<init>(r3, r4, r1)
            return r0
    }
}
