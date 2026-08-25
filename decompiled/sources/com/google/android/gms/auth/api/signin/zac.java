package com.google.android.gms.auth.api.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes2.dex */
final class zac implements java.util.Comparator<com.google.android.gms.common.api.Scope> {
    public zac() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(com.google.android.gms.common.api.Scope r1, com.google.android.gms.common.api.Scope r2) {
            r0 = this;
            com.google.android.gms.common.api.Scope r1 = (com.google.android.gms.common.api.Scope) r1
            com.google.android.gms.common.api.Scope r2 = (com.google.android.gms.common.api.Scope) r2
            java.lang.String r1 = r1.getScopeUri()
            java.lang.String r2 = r2.getScopeUri()
            int r1 = r1.compareTo(r2)
            return r1
    }
}
