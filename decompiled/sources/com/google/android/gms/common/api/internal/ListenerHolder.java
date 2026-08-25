package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public final class ListenerHolder<L> {
    private final java.util.concurrent.Executor zaa;

    @androidx.annotation.Nullable
    private volatile L zab;

    @androidx.annotation.Nullable
    private volatile com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> zac;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* JADX INFO: loaded from: classes.dex */
    @com.google.android.gms.common.annotation.KeepForSdk
    public static final class ListenerKey<L> {
        private final L zaa;
        private final java.lang.String zab;

        @com.google.android.gms.common.annotation.KeepForSdk
        public ListenerKey(L r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.zaa = r1
                r0.zab = r2
                return
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r5 = (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey) r5
                L r1 = r4.zaa
                L r3 = r5.zaa
                if (r1 != r3) goto L1d
                java.lang.String r1 = r4.zab
                java.lang.String r5 = r5.zab
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L1d
                return r0
            L1d:
                return r2
        }

        @com.google.android.gms.common.annotation.KeepForSdk
        public int hashCode() {
                r2 = this;
                L r0 = r2.zaa
                int r0 = java.lang.System.identityHashCode(r0)
                int r0 = r0 * 31
                java.lang.String r1 = r2.zab
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }

        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public java.lang.String toIdString() {
                r4 = this;
                java.lang.String r0 = r4.zab
                L r1 = r4.zaa
                int r1 = java.lang.System.identityHashCode(r1)
                java.lang.String r2 = java.lang.String.valueOf(r0)
                int r2 = r2.length()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                int r2 = r2 + 12
                r3.<init>(r2)
                r3.append(r0)
                java.lang.String r0 = "@"
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = r3.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @com.google.android.gms.common.annotation.KeepForSdk
    public interface Notifier<L> {
        @com.google.android.gms.common.annotation.KeepForSdk
        void notifyListener(@androidx.annotation.NonNull L r1);

        @com.google.android.gms.common.annotation.KeepForSdk
        void onNotifyListenerFailed();
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public ListenerHolder(@androidx.annotation.NonNull android.os.Looper r2, @androidx.annotation.NonNull L r3, @androidx.annotation.NonNull java.lang.String r4) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.common.util.concurrent.HandlerExecutor r0 = new com.google.android.gms.common.util.concurrent.HandlerExecutor
            r0.<init>(r2)
            r1.zaa = r0
            java.lang.String r2 = "Listener must not be null"
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r2)
            r1.zab = r2
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r2 = new com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey
            java.lang.String r4 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            r2.<init>(r3, r4)
            r1.zac = r2
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public ListenerHolder(@androidx.annotation.NonNull java.util.concurrent.Executor r2, @androidx.annotation.NonNull L r3, @androidx.annotation.NonNull java.lang.String r4) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Executor must not be null"
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            r1.zaa = r2
            java.lang.String r2 = "Listener must not be null"
            java.lang.Object r2 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r2)
            r1.zab = r2
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r2 = new com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey
            java.lang.String r4 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            r2.<init>(r3, r4)
            r1.zac = r2
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void clear() {
            r1 = this;
            r0 = 0
            r1.zab = r0
            r1.zac = r0
            return
    }

    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    public com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> getListenerKey() {
            r1 = this;
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey<L> r0 = r1.zac
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public boolean hasListener() {
            r1 = this;
            L r0 = r1.zab
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void notifyListener(@androidx.annotation.NonNull com.google.android.gms.common.api.internal.ListenerHolder.Notifier<? super L> r3) {
            r2 = this;
            java.lang.String r0 = "Notifier must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            java.util.concurrent.Executor r0 = r2.zaa
            com.google.android.gms.common.api.internal.zacb r1 = new com.google.android.gms.common.api.internal.zacb
            r1.<init>(r2, r3)
            r0.execute(r1)
            return
    }

    public final void zaa(com.google.android.gms.common.api.internal.ListenerHolder.Notifier<? super L> r2) {
            r1 = this;
            L r0 = r1.zab
            if (r0 != 0) goto L8
            r2.onNotifyListenerFailed()
            return
        L8:
            r2.notifyListener(r0)     // Catch: java.lang.RuntimeException -> Lc
            return
        Lc:
            r0 = move-exception
            r2.onNotifyListenerFailed()
            throw r0
    }
}
