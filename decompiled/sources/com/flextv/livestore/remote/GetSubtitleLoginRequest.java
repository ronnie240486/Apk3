package com.flextv.livestore.remote;

/* JADX INFO: loaded from: classes.dex */
public class GetSubtitleLoginRequest {
    public android.content.Context context;
    public com.flextv.livestore.remote.GetSubtitleLoginRequest.OnGetLinkModelListener listener;
    public int requestCode;


    /* JADX INFO: loaded from: classes2.dex */
    public interface OnGetLinkModelListener {
        void OnGetLinkModelResult(org.json.JSONObject r1, int r2);
    }

    public static /* synthetic */ void $r8$lambda$UEnd41KUQHkeafxp86VMVAGcUm0(com.flextv.livestore.remote.GetSubtitleLoginRequest r0, com.android.volley.VolleyError r1) {
            r0.lambda$getResponse$1(r1)
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$W09BU02AsbWYZpJTu9vdlc-AqAQ, reason: not valid java name */
    public static /* synthetic */ void m146$r8$lambda$W09BU02AsbWYZpJTu9vdlcAqAQ(com.flextv.livestore.remote.GetSubtitleLoginRequest r0, org.json.JSONObject r1) {
            r0.lambda$getResponse$0(r1)
            return
    }

    public GetSubtitleLoginRequest(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.requestCode = r2
            return
    }

    private /* synthetic */ void lambda$getResponse$0(org.json.JSONObject r4) {
            r3 = this;
            com.flextv.livestore.remote.GetSubtitleLoginRequest$OnGetLinkModelListener r0 = r3.listener     // Catch: java.lang.Exception -> L8
            int r1 = r3.requestCode     // Catch: java.lang.Exception -> L8
            r0.OnGetLinkModelResult(r4, r1)     // Catch: java.lang.Exception -> L8
            goto L14
        L8:
            r4 = move-exception
            com.flextv.livestore.remote.GetSubtitleLoginRequest$OnGetLinkModelListener r0 = r3.listener
            r1 = 0
            int r2 = r3.requestCode
            r0.OnGetLinkModelResult(r1, r2)
            r4.printStackTrace()
        L14:
            return
    }

    private /* synthetic */ void lambda$getResponse$1(com.android.volley.VolleyError r3) {
            r2 = this;
            com.flextv.livestore.remote.GetSubtitleLoginRequest$OnGetLinkModelListener r3 = r2.listener
            int r0 = r2.requestCode
            r1 = 0
            r3.OnGetLinkModelResult(r1, r0)
            return
    }

    public void getResponse(org.json.JSONObject r9, java.lang.String r10, java.lang.String r11) {
            r8 = this;
            android.content.Context r0 = r8.context
            com.android.volley.RequestQueue r0 = com.android.volley.toolbox.Volley.newRequestQueue(r0)
            com.flextv.livestore.remote.GetSubtitleLoginRequest$1 r7 = new com.flextv.livestore.remote.GetSubtitleLoginRequest$1     // Catch: java.lang.Exception -> L2a
            com.flextv.livestore.remote.GetSubtitleLoginRequest$$ExternalSyntheticLambda0 r4 = new com.flextv.livestore.remote.GetSubtitleLoginRequest$$ExternalSyntheticLambda0     // Catch: java.lang.Exception -> L2a
            r4.<init>(r8)     // Catch: java.lang.Exception -> L2a
            com.flextv.livestore.remote.GetSubtitleLoginRequest$$ExternalSyntheticLambda0 r5 = new com.flextv.livestore.remote.GetSubtitleLoginRequest$$ExternalSyntheticLambda0     // Catch: java.lang.Exception -> L2a
            r5.<init>(r8)     // Catch: java.lang.Exception -> L2a
            r1 = r7
            r2 = r10
            r3 = r9
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L2a
            r9 = 20000(0x4e20, float:2.8026E-41)
            com.android.volley.DefaultRetryPolicy r10 = new com.android.volley.DefaultRetryPolicy     // Catch: java.lang.Exception -> L2a
            r11 = 1
            r1 = 1065353216(0x3f800000, float:1.0)
            r10.<init>(r9, r11, r1)     // Catch: java.lang.Exception -> L2a
            r7.setRetryPolicy(r10)     // Catch: java.lang.Exception -> L2a
            r0.add(r7)     // Catch: java.lang.Exception -> L2a
            goto L32
        L2a:
            com.flextv.livestore.remote.GetSubtitleLoginRequest$OnGetLinkModelListener r9 = r8.listener
            r10 = 0
            int r11 = r8.requestCode
            r9.OnGetLinkModelResult(r10, r11)
        L32:
            return
    }

    public void setOnGetLinkModelListener(com.flextv.livestore.remote.GetSubtitleLoginRequest.OnGetLinkModelListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
