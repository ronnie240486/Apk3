package com.flextv.livestore.remote;

/* JADX INFO: loaded from: classes.dex */
public class GetDataRequest {
    public android.content.Context context;
    public com.flextv.livestore.remote.GetDataRequest.OnGetResponseListener listener;
    public int requestCode;


    public interface OnGetResponseListener {
        void OnGetResponseResult(org.json.JSONObject r1, int r2);
    }

    /* JADX INFO: renamed from: $r8$lambda$EtiW6FsLkiH_3ewSx8e-9IZWivo, reason: not valid java name */
    public static /* synthetic */ void m142$r8$lambda$EtiW6FsLkiH_3ewSx8e9IZWivo(com.flextv.livestore.remote.GetDataRequest r0, org.json.JSONObject r1) {
            r0.lambda$getResponse$0(r1)
            return
    }

    public static /* synthetic */ void $r8$lambda$c3QLyYmzSREAXeDrIrNCnE9OiLY(com.flextv.livestore.remote.GetDataRequest r0, com.android.volley.VolleyError r1) {
            r0.lambda$getResponse$1(r1)
            return
    }

    public GetDataRequest(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.requestCode = r2
            return
    }

    private /* synthetic */ void lambda$getResponse$0(org.json.JSONObject r4) {
            r3 = this;
            com.flextv.livestore.remote.GetDataRequest$OnGetResponseListener r0 = r3.listener     // Catch: java.lang.Exception -> L8
            int r1 = r3.requestCode     // Catch: java.lang.Exception -> L8
            r0.OnGetResponseResult(r4, r1)     // Catch: java.lang.Exception -> L8
            goto L14
        L8:
            r4 = move-exception
            com.flextv.livestore.remote.GetDataRequest$OnGetResponseListener r0 = r3.listener
            r1 = 0
            int r2 = r3.requestCode
            r0.OnGetResponseResult(r1, r2)
            r4.printStackTrace()
        L14:
            return
    }

    private /* synthetic */ void lambda$getResponse$1(com.android.volley.VolleyError r3) {
            r2 = this;
            com.flextv.livestore.remote.GetDataRequest$OnGetResponseListener r3 = r2.listener
            int r0 = r2.requestCode
            r1 = 0
            r3.OnGetResponseResult(r1, r0)
            return
    }

    public void getResponse(org.json.JSONObject r4, java.lang.String r5) {
            r3 = this;
            android.content.Context r0 = r3.context
            com.android.volley.toolbox.Volley.newRequestQueue(r0)
            com.flextv.livestore.remote.GetDataRequest$1 r0 = new com.flextv.livestore.remote.GetDataRequest$1     // Catch: java.lang.Exception -> L2b
            com.flextv.livestore.remote.GetDataRequest$$ExternalSyntheticLambda0 r1 = new com.flextv.livestore.remote.GetDataRequest$$ExternalSyntheticLambda0     // Catch: java.lang.Exception -> L2b
            r1.<init>(r3)     // Catch: java.lang.Exception -> L2b
            com.flextv.livestore.remote.GetDataRequest$$ExternalSyntheticLambda0 r2 = new com.flextv.livestore.remote.GetDataRequest$$ExternalSyntheticLambda0     // Catch: java.lang.Exception -> L2b
            r2.<init>(r3)     // Catch: java.lang.Exception -> L2b
            r0.<init>(r5, r4, r1, r2)     // Catch: java.lang.Exception -> L2b
            r4 = 20000(0x4e20, float:2.8026E-41)
            com.android.volley.DefaultRetryPolicy r5 = new com.android.volley.DefaultRetryPolicy     // Catch: java.lang.Exception -> L2b
            r1 = 1
            r2 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r4, r1, r2)     // Catch: java.lang.Exception -> L2b
            r0.setRetryPolicy(r5)     // Catch: java.lang.Exception -> L2b
            android.content.Context r4 = r3.context     // Catch: java.lang.Exception -> L2b
            com.flextv.livestore.remote.VolleySingleton r4 = com.flextv.livestore.remote.VolleySingleton.getInstance(r4)     // Catch: java.lang.Exception -> L2b
            r4.addToRequestQueue(r0)     // Catch: java.lang.Exception -> L2b
            goto L33
        L2b:
            com.flextv.livestore.remote.GetDataRequest$OnGetResponseListener r4 = r3.listener
            r5 = 0
            int r0 = r3.requestCode
            r4.OnGetResponseResult(r5, r0)
        L33:
            return
    }

    public void setOnGetResponseListener(com.flextv.livestore.remote.GetDataRequest.OnGetResponseListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }
}
