package com.flextv.livestore.remote;

/* JADX INFO: loaded from: classes2.dex */
public class GetSubtitleLinkRequest {
    public android.content.Context context;
    public com.flextv.livestore.remote.GetSubtitleLinkRequest.OnGetLinkModelListener listener;
    public int requestCode;


    /* JADX INFO: loaded from: classes3.dex */
    public interface OnGetLinkModelListener {
        void OnGetLinkModelResult(org.json.JSONObject r1, int r2);
    }

    /* JADX INFO: renamed from: $r8$lambda$3bRQ7xrSI_Feae0lgHkz-d7tNSI, reason: not valid java name */
    public static /* synthetic */ void m145$r8$lambda$3bRQ7xrSI_Feae0lgHkzd7tNSI(com.flextv.livestore.remote.GetSubtitleLinkRequest r0, com.android.volley.VolleyError r1) {
            r0.lambda$getResponse$1(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$mNC27wygn4KWmwCbGOM_yvgKuNk(com.flextv.livestore.remote.GetSubtitleLinkRequest r0, org.json.JSONObject r1) {
            r0.lambda$getResponse$0(r1)
            return
    }

    public GetSubtitleLinkRequest(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.requestCode = r2
            return
    }

    private /* synthetic */ void lambda$getResponse$0(org.json.JSONObject r4) {
            r3 = this;
            com.flextv.livestore.remote.GetSubtitleLinkRequest$OnGetLinkModelListener r0 = r3.listener     // Catch: java.lang.Exception -> L8
            int r1 = r3.requestCode     // Catch: java.lang.Exception -> L8
            r0.OnGetLinkModelResult(r4, r1)     // Catch: java.lang.Exception -> L8
            goto L14
        L8:
            r4 = move-exception
            com.flextv.livestore.remote.GetSubtitleLinkRequest$OnGetLinkModelListener r0 = r3.listener
            r1 = 0
            int r2 = r3.requestCode
            r0.OnGetLinkModelResult(r1, r2)
            r4.printStackTrace()
        L14:
            return
    }

    private /* synthetic */ void lambda$getResponse$1(com.android.volley.VolleyError r3) {
            r2 = this;
            com.flextv.livestore.remote.GetSubtitleLinkRequest$OnGetLinkModelListener r3 = r2.listener
            int r0 = r2.requestCode
            r1 = 0
            r3.OnGetLinkModelResult(r1, r0)
            return
    }

    public void getResponse(org.json.JSONObject r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
            r9 = this;
            android.content.Context r0 = r9.context
            com.android.volley.RequestQueue r0 = com.android.volley.toolbox.Volley.newRequestQueue(r0)
            com.flextv.livestore.remote.GetSubtitleLinkRequest$1 r8 = new com.flextv.livestore.remote.GetSubtitleLinkRequest$1     // Catch: java.lang.Exception -> L1e
            com.flextv.livestore.remote.GetSubtitleLinkRequest$$ExternalSyntheticLambda0 r4 = new com.flextv.livestore.remote.GetSubtitleLinkRequest$$ExternalSyntheticLambda0     // Catch: java.lang.Exception -> L1e
            r4.<init>(r9)     // Catch: java.lang.Exception -> L1e
            com.flextv.livestore.remote.GetSubtitleLinkRequest$$ExternalSyntheticLambda0 r5 = new com.flextv.livestore.remote.GetSubtitleLinkRequest$$ExternalSyntheticLambda0     // Catch: java.lang.Exception -> L1e
            r5.<init>(r9)     // Catch: java.lang.Exception -> L1e
            r1 = r8
            r2 = r11
            r3 = r10
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L1e
            r0.add(r8)     // Catch: java.lang.Exception -> L1e
            goto L26
        L1e:
            com.flextv.livestore.remote.GetSubtitleLinkRequest$OnGetLinkModelListener r10 = r9.listener
            r11 = 0
            int r12 = r9.requestCode
            r10.OnGetLinkModelResult(r11, r12)
        L26:
            return
    }

    public void setOnGetLinkModelListener(com.flextv.livestore.remote.GetSubtitleLinkRequest.OnGetLinkModelListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
