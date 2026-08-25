package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
@com.google.android.gms.common.annotation.KeepForSdk
public final class ScopeUtil {
    private ScopeUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static java.lang.String[] toScopeString(@androidx.annotation.NonNull java.util.Set<com.google.android.gms.common.api.Scope> r3) {
            java.lang.String r0 = "scopes can't be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            int r1 = r3.size()
            com.google.android.gms.common.api.Scope[] r1 = new com.google.android.gms.common.api.Scope[r1]
            java.lang.Object[] r3 = r3.toArray(r1)
            com.google.android.gms.common.api.Scope[] r3 = (com.google.android.gms.common.api.Scope[]) r3
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3, r0)
            int r0 = r3.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
        L19:
            int r2 = r3.length
            if (r1 >= r2) goto L27
            r2 = r3[r1]
            java.lang.String r2 = r2.getScopeUri()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L19
        L27:
            return r0
    }
}
