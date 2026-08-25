package com.android.volley.toolbox;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public class HttpClientStack implements com.android.volley.toolbox.HttpStack {
    private static final java.lang.String HEADER_CONTENT_TYPE = "Content-Type";
    public final org.apache.http.client.HttpClient mClient;

    /* JADX INFO: loaded from: classes.dex */
    public static final class HttpPatch extends org.apache.http.client.methods.HttpEntityEnclosingRequestBase {
        public static final java.lang.String METHOD_NAME = "PATCH";

        public HttpPatch() {
                r0 = this;
                r0.<init>()
                return
        }

        public HttpPatch(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                java.net.URI r1 = java.net.URI.create(r1)
                r0.setURI(r1)
                return
        }

        public HttpPatch(java.net.URI r1) {
                r0 = this;
                r0.<init>()
                r0.setURI(r1)
                return
        }

        @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
        public java.lang.String getMethod() {
                r1 = this;
                java.lang.String r0 = "PATCH"
                return r0
        }
    }

    public HttpClientStack(org.apache.http.client.HttpClient r1) {
            r0 = this;
            r0.<init>()
            r0.mClient = r1
            return
    }

    private static java.util.List<org.apache.http.NameValuePair> getPostParameterPairs(java.util.Map<java.lang.String, java.lang.String> r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.size()
            r0.<init>(r1)
            java.util.Set r1 = r5.keySet()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            org.apache.http.message.BasicNameValuePair r3 = new org.apache.http.message.BasicNameValuePair
            java.lang.Object r4 = r5.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            r3.<init>(r2, r4)
            r0.add(r3)
            goto L11
        L2c:
            return r0
    }

    private static void setEntityIfNonEmptyBody(org.apache.http.client.methods.HttpEntityEnclosingRequestBase r1, com.android.volley.Request<?> r2) throws com.android.volley.AuthFailureError {
            byte[] r2 = r2.getBody()
            if (r2 == 0) goto Le
            org.apache.http.entity.ByteArrayEntity r0 = new org.apache.http.entity.ByteArrayEntity
            r0.<init>(r2)
            r1.setEntity(r0)
        Le:
            return
    }

    private static void setHeaders(org.apache.http.client.methods.HttpUriRequest r3, java.util.Map<java.lang.String, java.lang.String> r4) {
            java.util.Set r0 = r4.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r4.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            r3.setHeader(r1, r2)
            goto L8
        L1e:
            return
    }

    @Override // com.android.volley.toolbox.HttpStack
    public org.apache.http.HttpResponse performRequest(com.android.volley.Request<?> r5, java.util.Map<java.lang.String, java.lang.String> r6) throws java.io.IOException, com.android.volley.AuthFailureError {
            r4 = this;
            int r0 = r5.getMethod()
            java.lang.String r1 = "Content-Type"
            switch(r0) {
                case -1: goto L82;
                case 0: goto L78;
                case 1: goto L64;
                case 2: goto L50;
                case 3: goto L46;
                case 4: goto L3c;
                case 5: goto L31;
                case 6: goto L26;
                case 7: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Unknown request method."
            r5.<init>(r6)
            throw r5
        L11:
            com.android.volley.toolbox.HttpClientStack$HttpPatch r0 = new com.android.volley.toolbox.HttpClientStack$HttpPatch
            java.lang.String r2 = r5.getUrl()
            r0.<init>(r2)
            java.lang.String r2 = r5.getBodyContentType()
            r0.addHeader(r1, r2)
            setEntityIfNonEmptyBody(r0, r5)
            goto Lab
        L26:
            org.apache.http.client.methods.HttpTrace r0 = new org.apache.http.client.methods.HttpTrace
            java.lang.String r1 = r5.getUrl()
            r0.<init>(r1)
            goto Lab
        L31:
            org.apache.http.client.methods.HttpOptions r0 = new org.apache.http.client.methods.HttpOptions
            java.lang.String r1 = r5.getUrl()
            r0.<init>(r1)
            goto Lab
        L3c:
            org.apache.http.client.methods.HttpHead r0 = new org.apache.http.client.methods.HttpHead
            java.lang.String r1 = r5.getUrl()
            r0.<init>(r1)
            goto Lab
        L46:
            org.apache.http.client.methods.HttpDelete r0 = new org.apache.http.client.methods.HttpDelete
            java.lang.String r1 = r5.getUrl()
            r0.<init>(r1)
            goto Lab
        L50:
            org.apache.http.client.methods.HttpPut r0 = new org.apache.http.client.methods.HttpPut
            java.lang.String r2 = r5.getUrl()
            r0.<init>(r2)
            java.lang.String r2 = r5.getBodyContentType()
            r0.addHeader(r1, r2)
            setEntityIfNonEmptyBody(r0, r5)
            goto Lab
        L64:
            org.apache.http.client.methods.HttpPost r0 = new org.apache.http.client.methods.HttpPost
            java.lang.String r2 = r5.getUrl()
            r0.<init>(r2)
            java.lang.String r2 = r5.getBodyContentType()
            r0.addHeader(r1, r2)
            setEntityIfNonEmptyBody(r0, r5)
            goto Lab
        L78:
            org.apache.http.client.methods.HttpGet r0 = new org.apache.http.client.methods.HttpGet
            java.lang.String r1 = r5.getUrl()
            r0.<init>(r1)
            goto Lab
        L82:
            byte[] r0 = r5.getPostBody()
            if (r0 == 0) goto La2
            org.apache.http.client.methods.HttpPost r2 = new org.apache.http.client.methods.HttpPost
            java.lang.String r3 = r5.getUrl()
            r2.<init>(r3)
            java.lang.String r3 = r5.getPostBodyContentType()
            r2.addHeader(r1, r3)
            org.apache.http.entity.ByteArrayEntity r1 = new org.apache.http.entity.ByteArrayEntity
            r1.<init>(r0)
            r2.setEntity(r1)
            r0 = r2
            goto Lab
        La2:
            org.apache.http.client.methods.HttpGet r0 = new org.apache.http.client.methods.HttpGet
            java.lang.String r1 = r5.getUrl()
            r0.<init>(r1)
        Lab:
            setHeaders(r0, r6)
            java.util.Map r6 = r5.getHeaders()
            setHeaders(r0, r6)
            org.apache.http.params.HttpParams r6 = r0.getParams()
            int r5 = r5.getTimeoutMs()
            r1 = 5000(0x1388, float:7.006E-42)
            org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r6, r1)
            org.apache.http.params.HttpConnectionParams.setSoTimeout(r6, r5)
            org.apache.http.client.HttpClient r5 = r4.mClient
            org.apache.http.HttpResponse r5 = r5.execute(r0)
            return r5
    }
}
