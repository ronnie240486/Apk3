package iptv.m3u.parser;

/* JADX INFO: loaded from: classes2.dex */
public class M3UFile {
    private iptv.m3u.parser.M3UHead mHeader;
    private java.util.List<iptv.m3u.parser.M3UItem> mItems;

    public M3UFile() {
            r1 = this;
            r1.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.mItems = r0
            return
    }

    public boolean addItem(iptv.m3u.parser.M3UItem r2) {
            r1 = this;
            java.util.List<iptv.m3u.parser.M3UItem> r0 = r1.mItems
            boolean r2 = r0.add(r2)
            return r2
    }

    public boolean addItems(java.util.List<iptv.m3u.parser.M3UItem> r2) {
            r1 = this;
            java.util.List<iptv.m3u.parser.M3UItem> r0 = r1.mItems
            boolean r2 = r0.addAll(r2)
            return r2
    }

    public iptv.m3u.parser.M3UHead getHeader() {
            r1 = this;
            iptv.m3u.parser.M3UHead r0 = r1.mHeader
            return r0
    }

    public java.util.List<iptv.m3u.parser.M3UItem> getItems() {
            r1 = this;
            java.util.List<iptv.m3u.parser.M3UItem> r0 = r1.mItems
            return r0
    }

    public void setHeader(iptv.m3u.parser.M3UHead r1) {
            r0 = this;
            r0.mHeader = r1
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            iptv.m3u.parser.M3UHead r1 = r4.mHeader
            if (r1 == 0) goto L11
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            goto L16
        L11:
            java.lang.String r1 = "No header"
            r0.append(r1)
        L16:
            r1 = 10
            r0.append(r1)
            java.util.List<iptv.m3u.parser.M3UItem> r2 = r4.mItems
            java.util.Iterator r2 = r2.iterator()
        L21:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r3 = r2.next()
            iptv.m3u.parser.M3UItem r3 = (iptv.m3u.parser.M3UItem) r3
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            r0.append(r1)
            goto L21
        L38:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
