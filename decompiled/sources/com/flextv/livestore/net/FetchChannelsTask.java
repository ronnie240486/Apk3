package com.flextv.livestore.net;

/* JADX INFO: loaded from: classes3.dex */
public class FetchChannelsTask extends com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<com.flextv.livestore.models.EPGChannel>> {
    private com.flextv.livestore.net.LoadChannelsCommand command;

    public FetchChannelsTask() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.flextv.livestore.net.NetworkTask
    public final java.util.List<com.flextv.livestore.models.EPGChannel> doNetworkAction() throws java.io.IOException, org.json.JSONException {
            r1 = this;
            com.flextv.livestore.net.LoadChannelsCommand r0 = new com.flextv.livestore.net.LoadChannelsCommand
            r0.<init>()
            r1.command = r0
            java.util.ArrayList r0 = r0.execute()
            return r0
    }

    @Override // com.flextv.livestore.net.NetworkTask, android.os.AsyncTask
    public final void onPreExecute() {
            r0 = this;
            return
    }
}
