package com.flextv.livestore.net;

/* JADX INFO: loaded from: classes2.dex */
public class LoadVideosCommand {
    private java.util.HashMap<java.lang.String, java.util.List<com.flextv.livestore.models.MovieModel>> generoHashMap;

    public LoadVideosCommand() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.generoHashMap = r0
            return
    }

    public java.util.ArrayList<com.flextv.livestore.models.MovieModel> execute() throws java.io.IOException {
            r4 = this;
            com.flextv.livestore.apps.LTVApp r0 = com.flextv.livestore.apps.LTVApp.getInstance()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r0 = r0.getM3UVideosItems()
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L12:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r0.next()
            iptv.m3u.parser.M3UItem r3 = (iptv.m3u.parser.M3UItem) r3
            com.flextv.livestore.models.MovieModel r3 = com.flextv.livestore.models.MovieModel.fromM3UItem(r3)
            if (r3 == 0) goto L12
            int r2 = r2 + 1
            r3.setNum(r2)
            r1.add(r3)
            goto L12
        L2d:
            return r1
    }
}
