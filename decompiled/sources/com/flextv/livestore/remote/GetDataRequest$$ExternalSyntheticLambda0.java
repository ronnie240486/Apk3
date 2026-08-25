package com.flextv.livestore.remote;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class GetDataRequest$$ExternalSyntheticLambda0 implements com.android.volley.Response.Listener, com.android.volley.Response.ErrorListener {
    public final /* synthetic */ com.flextv.livestore.remote.GetDataRequest f$0;

    public /* synthetic */ GetDataRequest$$ExternalSyntheticLambda0(com.flextv.livestore.remote.GetDataRequest r1) {
            r0 = this;
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // com.android.volley.Response.ErrorListener
    public final void onErrorResponse(com.android.volley.VolleyError r2) {
            r1 = this;
            com.flextv.livestore.remote.GetDataRequest r0 = r1.f$0
            com.flextv.livestore.remote.GetDataRequest.$r8$lambda$c3QLyYmzSREAXeDrIrNCnE9OiLY(r0, r2)
            return
    }

    @Override // com.android.volley.Response.Listener
    public final void onResponse(java.lang.Object r2) {
            r1 = this;
            com.flextv.livestore.remote.GetDataRequest r0 = r1.f$0
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            com.flextv.livestore.remote.GetDataRequest.m142$r8$lambda$EtiW6FsLkiH_3ewSx8e9IZWivo(r0, r2)
            return
    }
}
