package com.flextv.livestore.remote;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class GetSubtitleLinkRequest$$ExternalSyntheticLambda0 implements com.android.volley.Response.Listener, com.android.volley.Response.ErrorListener {
    public final /* synthetic */ com.flextv.livestore.remote.GetSubtitleLinkRequest f$0;

    public /* synthetic */ GetSubtitleLinkRequest$$ExternalSyntheticLambda0(com.flextv.livestore.remote.GetSubtitleLinkRequest r1) {
            r0 = this;
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // com.android.volley.Response.ErrorListener
    public final void onErrorResponse(com.android.volley.VolleyError r2) {
            r1 = this;
            com.flextv.livestore.remote.GetSubtitleLinkRequest r0 = r1.f$0
            com.flextv.livestore.remote.GetSubtitleLinkRequest.m145$r8$lambda$3bRQ7xrSI_Feae0lgHkzd7tNSI(r0, r2)
            return
    }

    @Override // com.android.volley.Response.Listener
    public final void onResponse(java.lang.Object r2) {
            r1 = this;
            com.flextv.livestore.remote.GetSubtitleLinkRequest r0 = r1.f$0
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            com.flextv.livestore.remote.GetSubtitleLinkRequest.$r8$lambda$mNC27wygn4KWmwCbGOM_yvgKuNk(r0, r2)
            return
    }
}
