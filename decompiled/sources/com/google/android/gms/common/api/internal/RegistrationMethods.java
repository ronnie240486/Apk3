package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.AnyClient;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public class RegistrationMethods<A extends com.google.android.gms.common.api.Api.AnyClient, L> {

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public final com.google.android.gms.common.api.internal.RegisterListenerMethod<A, L> register;

    @androidx.annotation.NonNull
    public final com.google.android.gms.common.api.internal.UnregisterListenerMethod<A, L> zaa;

    @androidx.annotation.NonNull
    public final java.lang.Runnable zab;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* JADX INFO: loaded from: classes.dex */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class Builder<A extends com.google.android.gms.common.api.Api.AnyClient, L> {
        private com.google.android.gms.common.api.internal.RemoteCall<A, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>> zaa;
        private com.google.android.gms.common.api.internal.RemoteCall<A, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean>> zab;
        private java.lang.Runnable zac;
        private com.google.android.gms.common.api.internal.ListenerHolder<L> zad;
        private com.google.android.gms.common.Feature[] zae;
        private boolean zaf;
        private int zag;

        private Builder() {
                r1 = this;
                r1.<init>()
                com.google.android.gms.common.api.internal.zacj r0 = com.google.android.gms.common.api.internal.zacj.zaa
                r1.zac = r0
                r0 = 1
                r1.zaf = r0
                return
        }

        public /* synthetic */ Builder(com.google.android.gms.common.api.internal.zacm r1) {
                r0 = this;
                r0.<init>()
                com.google.android.gms.common.api.internal.zacj r1 = com.google.android.gms.common.api.internal.zacj.zaa
                r0.zac = r1
                r1 = 1
                r0.zaf = r1
                return
        }

        public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.RemoteCall zaa(com.google.android.gms.common.api.internal.RegistrationMethods.Builder r0) {
                com.google.android.gms.common.api.internal.RemoteCall<A extends com.google.android.gms.common.api.Api$AnyClient, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>> r0 = r0.zaa
                return r0
        }

        public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.internal.RemoteCall zab(com.google.android.gms.common.api.internal.RegistrationMethods.Builder r0) {
                com.google.android.gms.common.api.internal.RemoteCall<A extends com.google.android.gms.common.api.Api$AnyClient, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean>> r0 = r0.zab
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.api.internal.RegistrationMethods<A, L> build() {
                r9 = this;
                com.google.android.gms.common.api.internal.RemoteCall<A extends com.google.android.gms.common.api.Api$AnyClient, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>> r0 = r9.zaa
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                java.lang.String r3 = "Must set register function"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r3)
                com.google.android.gms.common.api.internal.RemoteCall<A extends com.google.android.gms.common.api.Api$AnyClient, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean>> r0 = r9.zab
                if (r0 == 0) goto L14
                r0 = 1
                goto L15
            L14:
                r0 = 0
            L15:
                java.lang.String r3 = "Must set unregister function"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r0, r3)
                com.google.android.gms.common.api.internal.ListenerHolder<L> r0 = r9.zad
                if (r0 == 0) goto L1f
                r1 = 1
            L1f:
                java.lang.String r0 = "Must set holder"
                com.google.android.gms.common.internal.Preconditions.checkArgument(r1, r0)
                com.google.android.gms.common.api.internal.ListenerHolder<L> r0 = r9.zad
                com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r0.getListenerKey()
                java.lang.String r1 = "Key must not be null"
                java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
                com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey) r0
                com.google.android.gms.common.api.internal.RegistrationMethods r1 = new com.google.android.gms.common.api.internal.RegistrationMethods
                com.google.android.gms.common.api.internal.zack r8 = new com.google.android.gms.common.api.internal.zack
                com.google.android.gms.common.api.internal.ListenerHolder<L> r4 = r9.zad
                com.google.android.gms.common.Feature[] r5 = r9.zae
                boolean r6 = r9.zaf
                int r7 = r9.zag
                r2 = r8
                r3 = r9
                r2.<init>(r3, r4, r5, r6, r7)
                com.google.android.gms.common.api.internal.zacl r2 = new com.google.android.gms.common.api.internal.zacl
                r2.<init>(r9, r0)
                java.lang.Runnable r0 = r9.zac
                r1.<init>(r8, r2, r0)
                return r1
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> onConnectionSuspended(@androidx.annotation.NonNull java.lang.Runnable r1) {
                r0 = this;
                r0.zac = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> register(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.RemoteCall<A, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>> r1) {
                r0 = this;
                r0.zaa = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> setAutoResolveMissingFeatures(boolean r1) {
                r0 = this;
                r0.zaf = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> setFeatures(@androidx.annotation.NonNull com.google.android.gms.common.Feature... r1) {
                r0 = this;
                r0.zae = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> setMethodKey(int r1) {
                r0 = this;
                r0.zag = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> unregister(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.RemoteCall<A, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean>> r1) {
                r0 = this;
                r0.zab = r1
                return r0
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> withHolder(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.ListenerHolder<L> r1) {
                r0 = this;
                r0.zad = r1
                return r0
        }
    }

    public /* synthetic */ RegistrationMethods(com.google.android.gms.common.api.internal.RegisterListenerMethod r1, com.google.android.gms.common.api.internal.UnregisterListenerMethod r2, java.lang.Runnable r3) {
            r0 = this;
            r0.<init>()
            r0.register = r1
            r0.zaa = r2
            r0.zab = r3
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static <A extends com.google.android.gms.common.api.Api.AnyClient, L> com.google.android.gms.common.api.internal.RegistrationMethods.Builder<A, L> builder() {
            com.google.android.gms.common.api.internal.RegistrationMethods$Builder r0 = new com.google.android.gms.common.api.internal.RegistrationMethods$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }
}
