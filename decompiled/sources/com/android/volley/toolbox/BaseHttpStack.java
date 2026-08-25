package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseHttpStack implements com.android.volley.toolbox.HttpStack {
    public BaseHttpStack() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract com.android.volley.toolbox.HttpResponse executeRequest(com.android.volley.Request<?> r1, java.util.Map<java.lang.String, java.lang.String> r2) throws java.io.IOException, com.android.volley.AuthFailureError;

    @Override // com.android.volley.toolbox.HttpStack
    @java.lang.Deprecated
    public final org.apache.http.HttpResponse performRequest(com.android.volley.Request<?> r6, java.util.Map<java.lang.String, java.lang.String> r7) throws java.io.IOException, com.android.volley.AuthFailureError {
            r5 = this;
            com.android.volley.toolbox.HttpResponse r6 = r5.executeRequest(r6, r7)
            org.apache.http.ProtocolVersion r7 = new org.apache.http.ProtocolVersion
            java.lang.String r0 = "HTTP"
            r1 = 1
            r7.<init>(r0, r1, r1)
            org.apache.http.message.BasicStatusLine r0 = new org.apache.http.message.BasicStatusLine
            int r1 = r6.getStatusCode()
            java.lang.String r2 = ""
            r0.<init>(r7, r1, r2)
            org.apache.http.message.BasicHttpResponse r7 = new org.apache.http.message.BasicHttpResponse
            r7.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r6.getHeaders()
            java.util.Iterator r1 = r1.iterator()
        L29:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r1.next()
            com.android.volley.Header r2 = (com.android.volley.Header) r2
            org.apache.http.message.BasicHeader r3 = new org.apache.http.message.BasicHeader
            java.lang.String r4 = r2.getName()
            java.lang.String r2 = r2.getValue()
            r3.<init>(r4, r2)
            r0.add(r3)
            goto L29
        L46:
            r1 = 0
            org.apache.http.Header[] r1 = new org.apache.http.Header[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            org.apache.http.Header[] r0 = (org.apache.http.Header[]) r0
            r7.setHeaders(r0)
            java.io.InputStream r0 = r6.getContent()
            if (r0 == 0) goto L6b
            org.apache.http.entity.BasicHttpEntity r1 = new org.apache.http.entity.BasicHttpEntity
            r1.<init>()
            r1.setContent(r0)
            int r6 = r6.getContentLength()
            long r2 = (long) r6
            r1.setContentLength(r2)
            r7.setEntity(r1)
        L6b:
            return r7
    }
}
