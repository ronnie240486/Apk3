package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
final class zac implements com.google.android.gms.common.server.response.zai<java.lang.Float> {
    public zac() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.server.response.zai
    @androidx.annotation.Nullable
    public final /* synthetic */ java.lang.Float zaa(com.google.android.gms.common.server.response.FastParser r1, java.io.BufferedReader r2) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r0 = this;
            float r1 = com.google.android.gms.common.server.response.FastParser.zab(r1, r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
    }
}
