package com.flextv.livestore.remote;

/* JADX INFO: loaded from: classes3.dex */
public class GetSeriesDataRequest {
    public android.content.Context context;
    public com.flextv.livestore.remote.GetSeriesDataRequest.OnGetResponseListener listener;
    public int requestCode;

    /* JADX INFO: loaded from: classes2.dex */
    public interface OnGetResponseListener {
        void OnGetResponseResult(org.json.JSONObject r1, int r2);
    }

    public static /* synthetic */ void $r8$lambda$4tY1UVRjJAxXeqQJId5C1z_Kg2Q(com.flextv.livestore.remote.GetSeriesDataRequest r0, org.json.JSONObject r1) {
            r0.lambda$getResponse$0(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$kOb1AmEyEdPm5IT9P2r2nNiaBbs(com.flextv.livestore.remote.GetSeriesDataRequest r0, com.android.volley.VolleyError r1) {
            r0.lambda$getResponse$1(r1)
            return
    }

    public GetSeriesDataRequest(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.requestCode = r2
            return
    }

    private /* synthetic */ void lambda$getResponse$0(org.json.JSONObject r4) {
            r3 = this;
            com.flextv.livestore.remote.GetSeriesDataRequest$OnGetResponseListener r0 = r3.listener     // Catch: java.lang.Exception -> L8
            int r1 = r3.requestCode     // Catch: java.lang.Exception -> L8
            r0.OnGetResponseResult(r4, r1)     // Catch: java.lang.Exception -> L8
            goto L14
        L8:
            r4 = move-exception
            com.flextv.livestore.remote.GetSeriesDataRequest$OnGetResponseListener r0 = r3.listener
            r1 = 0
            int r2 = r3.requestCode
            r0.OnGetResponseResult(r1, r2)
            r4.printStackTrace()
        L14:
            return
    }

    private /* synthetic */ void lambda$getResponse$1(com.android.volley.VolleyError r3) {
            r2 = this;
            com.flextv.livestore.remote.GetSeriesDataRequest$OnGetResponseListener r3 = r2.listener
            int r0 = r2.requestCode
            r1 = 0
            r3.OnGetResponseResult(r1, r0)
            return
    }

    public void getResponse(java.lang.String r8) {
            r7 = this;
            com.android.volley.toolbox.JsonObjectRequest r6 = new com.android.volley.toolbox.JsonObjectRequest     // Catch: java.lang.Exception -> L2a
            r1 = 0
            r3 = 0
            com.flextv.livestore.remote.GetSeriesDataRequest$$ExternalSyntheticLambda0 r4 = new com.flextv.livestore.remote.GetSeriesDataRequest$$ExternalSyntheticLambda0     // Catch: java.lang.Exception -> L2a
            r4.<init>(r7)     // Catch: java.lang.Exception -> L2a
            com.flextv.livestore.remote.GetSeriesDataRequest$$ExternalSyntheticLambda0 r5 = new com.flextv.livestore.remote.GetSeriesDataRequest$$ExternalSyntheticLambda0     // Catch: java.lang.Exception -> L2a
            r5.<init>(r7)     // Catch: java.lang.Exception -> L2a
            r0 = r6
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L2a
            r8 = 20000(0x4e20, float:2.8026E-41)
            com.android.volley.DefaultRetryPolicy r0 = new com.android.volley.DefaultRetryPolicy     // Catch: java.lang.Exception -> L2a
            r1 = 1
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r8, r1, r2)     // Catch: java.lang.Exception -> L2a
            r6.setRetryPolicy(r0)     // Catch: java.lang.Exception -> L2a
            android.content.Context r8 = r7.context     // Catch: java.lang.Exception -> L2a
            com.flextv.livestore.remote.VolleySingleton r8 = com.flextv.livestore.remote.VolleySingleton.getInstance(r8)     // Catch: java.lang.Exception -> L2a
            r8.addToRequestQueue(r6)     // Catch: java.lang.Exception -> L2a
            goto L32
        L2a:
            com.flextv.livestore.remote.GetSeriesDataRequest$OnGetResponseListener r8 = r7.listener
            r0 = 0
            int r1 = r7.requestCode
            r8.OnGetResponseResult(r0, r1)
        L32:
            return
    }

    public void setOnGetResponseListener(com.flextv.livestore.remote.GetSeriesDataRequest.OnGetResponseListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
