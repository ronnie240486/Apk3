package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes.dex */
public class JsonArrayRequest extends com.android.volley.toolbox.JsonRequest<org.json.JSONArray> {
    public JsonArrayRequest(int r7, java.lang.String r8, @androidx.annotation.Nullable org.json.JSONArray r9, com.android.volley.Response.Listener<org.json.JSONArray> r10, @androidx.annotation.Nullable com.android.volley.Response.ErrorListener r11) {
            r6 = this;
            if (r9 == 0) goto L7
            java.lang.String r9 = r9.toString()
            goto L8
        L7:
            r9 = 0
        L8:
            r3 = r9
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public JsonArrayRequest(java.lang.String r7, com.android.volley.Response.Listener<org.json.JSONArray> r8, @androidx.annotation.Nullable com.android.volley.Response.ErrorListener r9) {
            r6 = this;
            r1 = 0
            r3 = 0
            r0 = r6
            r2 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // com.android.volley.Request
    public final com.android.volley.Response<org.json.JSONArray> parseNetworkResponse(com.android.volley.NetworkResponse r5) {
            r4 = this;
            java.lang.String r0 = new java.lang.String     // Catch: org.json.JSONException -> L1e java.io.UnsupportedEncodingException -> L29
            byte[] r1 = r5.data     // Catch: org.json.JSONException -> L1e java.io.UnsupportedEncodingException -> L29
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.headers     // Catch: org.json.JSONException -> L1e java.io.UnsupportedEncodingException -> L29
            java.lang.String r3 = "utf-8"
            java.lang.String r2 = com.android.volley.toolbox.HttpHeaderParser.parseCharset(r2, r3)     // Catch: org.json.JSONException -> L1e java.io.UnsupportedEncodingException -> L29
            r0.<init>(r1, r2)     // Catch: org.json.JSONException -> L1e java.io.UnsupportedEncodingException -> L29
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: org.json.JSONException -> L1e java.io.UnsupportedEncodingException -> L29
            r1.<init>(r0)     // Catch: org.json.JSONException -> L1e java.io.UnsupportedEncodingException -> L29
            com.android.volley.Cache$Entry r5 = com.android.volley.toolbox.HttpHeaderParser.parseCacheHeaders(r5)     // Catch: org.json.JSONException -> L1e java.io.UnsupportedEncodingException -> L29
            com.android.volley.Response r5 = com.android.volley.Response.success(r1, r5)     // Catch: org.json.JSONException -> L1e java.io.UnsupportedEncodingException -> L29
            return r5
        L1e:
            r5 = move-exception
            com.android.volley.ParseError r0 = new com.android.volley.ParseError
            r0.<init>(r5)
            com.android.volley.Response r5 = com.android.volley.Response.error(r0)
            return r5
        L29:
            r5 = move-exception
            com.android.volley.ParseError r0 = new com.android.volley.ParseError
            r0.<init>(r5)
            com.android.volley.Response r5 = com.android.volley.Response.error(r0)
            return r5
    }
}
