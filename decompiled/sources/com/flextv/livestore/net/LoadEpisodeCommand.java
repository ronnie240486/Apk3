package com.flextv.livestore.net;

/* JADX INFO: loaded from: classes2.dex */
public class LoadEpisodeCommand {
    public LoadEpisodeCommand() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.ArrayList<com.flextv.livestore.models.EpisodeModel> execute() throws java.io.IOException {
            r3 = this;
            com.flextv.livestore.apps.LTVApp r0 = com.flextv.livestore.apps.LTVApp.getInstance()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r0 = r0.getM3USeriesItems()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r0.next()
            iptv.m3u.parser.M3UItem r2 = (iptv.m3u.parser.M3UItem) r2
            com.flextv.livestore.models.EpisodeModel r2 = com.flextv.livestore.models.EpisodeModel.fromM3UItem(r2)
            if (r2 == 0) goto L11
            r1.add(r2)
            goto L11
        L27:
            return r1
    }
}
