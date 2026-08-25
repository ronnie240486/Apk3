package com.flextv.livestore.net;

/* JADX INFO: loaded from: classes2.dex */
public class FetchVideosTask extends com.flextv.livestore.net.NetworkTask<java.lang.Void, java.lang.Void, java.util.List<com.flextv.livestore.models.MovieModel>> {
    private com.flextv.livestore.net.LoadVideosCommand command;

    public FetchVideosTask() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.flextv.livestore.net.NetworkTask
    public final java.util.List<com.flextv.livestore.models.MovieModel> doNetworkAction() throws java.io.IOException, org.json.JSONException {
            r1 = this;
            com.flextv.livestore.net.LoadVideosCommand r0 = new com.flextv.livestore.net.LoadVideosCommand
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
