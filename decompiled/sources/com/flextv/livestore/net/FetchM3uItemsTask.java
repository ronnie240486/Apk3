package com.flextv.livestore.net;

/* JADX INFO: loaded from: classes.dex */
public class FetchM3uItemsTask extends com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<iptv.m3u.parser.M3UItem>> {
    private com.flextv.livestore.net.LoadM3UItemsCommand command;
    private java.util.ArrayList<org.apache.http.NameValuePair> params;
    private java.lang.String urlServer;

    public FetchM3uItemsTask(java.lang.String r1, java.util.ArrayList<org.apache.http.NameValuePair> r2) {
            r0 = this;
            r0.<init>()
            r0.urlServer = r1
            r0.params = r2
            return
    }

    @Override // com.flextv.livestore.net.NetworkTask
    public final java.util.List<iptv.m3u.parser.M3UItem> doNetworkAction() throws java.io.IOException, org.json.JSONException {
            r3 = this;
            com.flextv.livestore.net.LoadM3UItemsCommand r0 = new com.flextv.livestore.net.LoadM3UItemsCommand
            java.lang.String r1 = r3.urlServer
            java.util.ArrayList<org.apache.http.NameValuePair> r2 = r3.params
            r0.<init>(r1, r2)
            r3.command = r0
            java.util.List r0 = r0.execute()
            return r0
    }
}
