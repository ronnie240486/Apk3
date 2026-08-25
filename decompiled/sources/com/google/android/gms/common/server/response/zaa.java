package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zaa implements com.google.android.gms.common.server.response.zai<java.lang.Integer> {
    public zaa() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.server.response.zai
    @androidx.annotation.Nullable
    public final /* synthetic */ java.lang.Integer zaa(com.google.android.gms.common.server.response.FastParser r1, java.io.BufferedReader r2) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r0 = this;
            int r1 = com.google.android.gms.common.server.response.FastParser.zac(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }
}
