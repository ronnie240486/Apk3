package com.flextv.livestore.net;

/* JADX INFO: loaded from: classes2.dex */
public class LoadChannelsCommand {
    public java.util.ArrayList<com.flextv.livestore.models.EPGChannel> epgChannels;

    public LoadChannelsCommand() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.ArrayList<com.flextv.livestore.models.EPGChannel> execute() {
            r4 = this;
            com.flextv.livestore.apps.LTVApp r0 = com.flextv.livestore.apps.LTVApp.getInstance()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4.epgChannels = r1
            java.util.List r0 = r0.getM3UChannelsItems()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L14:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r0.next()
            iptv.m3u.parser.M3UItem r2 = (iptv.m3u.parser.M3UItem) r2
            com.flextv.livestore.models.EPGChannel r2 = com.flextv.livestore.models.EPGChannel.fromM3UItem(r2)
            if (r2 == 0) goto L14
            int r1 = r1 + 1
            java.lang.String r3 = java.lang.String.valueOf(r1)
            r2.setNum(r3)
            java.util.ArrayList<com.flextv.livestore.models.EPGChannel> r3 = r4.epgChannels
            r3.add(r2)
            goto L14
        L35:
            java.util.ArrayList<com.flextv.livestore.models.EPGChannel> r0 = r4.epgChannels
            return r0
    }
}
