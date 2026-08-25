package com.flextv.livestore.net;

/* JADX INFO: loaded from: classes.dex */
public class BaseCommand {
    public org.apache.http.client.HttpClient client;
    private java.lang.Integer timeOut;
    public java.lang.String urlServer;

    public BaseCommand(java.lang.String r3, java.util.ArrayList<org.apache.http.NameValuePair> r4) {
            r2 = this;
            r2.<init>()
            r4 = 60000(0xea60, float:8.4078E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.timeOut = r4
            org.apache.http.impl.client.DefaultHttpClient r4 = new org.apache.http.impl.client.DefaultHttpClient
            r4.<init>()
            r2.client = r4
            org.apache.http.params.HttpParams r4 = r4.getParams()
            java.lang.Integer r0 = r2.timeOut
            int r0 = r0.intValue()
            org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r4, r0)
            org.apache.http.client.HttpClient r4 = r2.client
            org.apache.http.params.HttpParams r4 = r4.getParams()
            java.lang.Integer r0 = r2.timeOut
            int r0 = r0.intValue()
            org.apache.http.params.HttpConnectionParams.setSoTimeout(r4, r0)
            org.apache.http.client.HttpClient r4 = r2.client
            org.apache.http.params.HttpParams r4 = r4.getParams()
            java.lang.Integer r0 = r2.timeOut
            int r0 = r0.intValue()
            long r0 = (long) r0
            org.apache.http.conn.params.ConnManagerParams.setTimeout(r4, r0)
            r2.urlServer = r3
            return
    }

    public java.lang.Object execute() throws java.io.IOException, org.json.JSONException {
            r1 = this;
            r0 = 0
            return r0
    }
}
