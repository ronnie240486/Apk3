package com.flextv.livestore.remote;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class GetSubtitleLoginRequest$$ExternalSyntheticLambda0 implements com.android.volley.Response.Listener, com.android.volley.Response.ErrorListener {
    public final /* synthetic */ com.flextv.livestore.remote.GetSubtitleLoginRequest f$0;

    public /* synthetic */ GetSubtitleLoginRequest$$ExternalSyntheticLambda0(com.flextv.livestore.remote.GetSubtitleLoginRequest r1) {
            r0 = this;
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // com.android.volley.Response.ErrorListener
    public final void onErrorResponse(com.android.volley.VolleyError r2) {
            r1 = this;
            com.flextv.livestore.remote.GetSubtitleLoginRequest r0 = r1.f$0
            com.flextv.livestore.remote.GetSubtitleLoginRequest.$r8$lambda$UEnd41KUQHkeafxp86VMVAGcUm0(r0, r2)
            return
    }

    @Override // com.android.volley.Response.Listener
    public final void onResponse(java.lang.Object r2) {
            r1 = this;
            com.flextv.livestore.remote.GetSubtitleLoginRequest r0 = r1.f$0
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            com.flextv.livestore.remote.GetSubtitleLoginRequest.m146$r8$lambda$W09BU02AsbWYZpJTu9vdlcAqAQ(r0, r2)
            return
    }
}
