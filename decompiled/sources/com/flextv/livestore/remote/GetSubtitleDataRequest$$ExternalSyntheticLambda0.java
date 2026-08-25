package com.flextv.livestore.remote;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class GetSubtitleDataRequest$$ExternalSyntheticLambda0 implements com.android.volley.Response.Listener, com.android.volley.Response.ErrorListener {
    public final /* synthetic */ com.flextv.livestore.remote.GetSubtitleDataRequest f$0;

    public /* synthetic */ GetSubtitleDataRequest$$ExternalSyntheticLambda0(com.flextv.livestore.remote.GetSubtitleDataRequest r1) {
            r0 = this;
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // com.android.volley.Response.ErrorListener
    public final void onErrorResponse(com.android.volley.VolleyError r2) {
            r1 = this;
            com.flextv.livestore.remote.GetSubtitleDataRequest r0 = r1.f$0
            com.flextv.livestore.remote.GetSubtitleDataRequest.m144$r8$lambda$kj32A8_2Lc004dcZ0knXOqTiPk(r0, r2)
            return
    }

    @Override // com.android.volley.Response.Listener
    public final void onResponse(java.lang.Object r2) {
            r1 = this;
            com.flextv.livestore.remote.GetSubtitleDataRequest r0 = r1.f$0
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            com.flextv.livestore.remote.GetSubtitleDataRequest.m143$r8$lambda$WtRsrbPl6ppxTRHX7m8lco4mOE(r0, r2)
            return
    }
}
