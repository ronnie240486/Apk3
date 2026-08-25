package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes3.dex */
class AdaptedHttpStack extends com.android.volley.toolbox.BaseHttpStack {
    private final com.android.volley.toolbox.HttpStack mHttpStack;

    public AdaptedHttpStack(com.android.volley.toolbox.HttpStack r1) {
            r0 = this;
            r0.<init>()
            r0.mHttpStack = r1
            return
    }

    @Override // com.android.volley.toolbox.BaseHttpStack
    public com.android.volley.toolbox.HttpResponse executeRequest(com.android.volley.Request<?> r8, java.util.Map<java.lang.String, java.lang.String> r9) throws java.io.IOException, com.android.volley.AuthFailureError {
            r7 = this;
            com.android.volley.toolbox.HttpStack r0 = r7.mHttpStack     // Catch: org.apache.http.conn.ConnectTimeoutException -> L6e
            org.apache.http.HttpResponse r8 = r0.performRequest(r8, r9)     // Catch: org.apache.http.conn.ConnectTimeoutException -> L6e
            org.apache.http.StatusLine r9 = r8.getStatusLine()
            int r9 = r9.getStatusCode()
            org.apache.http.Header[] r0 = r8.getAllHeaders()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
        L1a:
            if (r3 >= r2) goto L31
            r4 = r0[r3]
            com.android.volley.Header r5 = new com.android.volley.Header
            java.lang.String r6 = r4.getName()
            java.lang.String r4 = r4.getValue()
            r5.<init>(r6, r4)
            r1.add(r5)
            int r3 = r3 + 1
            goto L1a
        L31:
            org.apache.http.HttpEntity r0 = r8.getEntity()
            if (r0 != 0) goto L3d
            com.android.volley.toolbox.HttpResponse r8 = new com.android.volley.toolbox.HttpResponse
            r8.<init>(r9, r1)
            return r8
        L3d:
            org.apache.http.HttpEntity r0 = r8.getEntity()
            long r2 = r0.getContentLength()
            int r0 = (int) r2
            long r4 = (long) r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L62
            com.android.volley.toolbox.HttpResponse r0 = new com.android.volley.toolbox.HttpResponse
            org.apache.http.HttpEntity r2 = r8.getEntity()
            long r2 = r2.getContentLength()
            int r3 = (int) r2
            org.apache.http.HttpEntity r8 = r8.getEntity()
            java.io.InputStream r8 = r8.getContent()
            r0.<init>(r9, r1, r3, r8)
            return r0
        L62:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "Response too large: "
            java.lang.String r9 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r9, r2)
            r8.<init>(r9)
            throw r8
        L6e:
            r8 = move-exception
            java.net.SocketTimeoutException r9 = new java.net.SocketTimeoutException
            java.lang.String r8 = r8.getMessage()
            r9.<init>(r8)
            throw r9
    }
}
