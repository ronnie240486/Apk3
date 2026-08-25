package iptv.m3u.parser;

/* JADX INFO: loaded from: classes2.dex */
public class M3UToolSet {


    public M3UToolSet() {
            r0 = this;
            r0.<init>()
            return
    }

    public static iptv.m3u.parser.M3UFile load(java.lang.String r3) {
            iptv.m3u.parser.M3UFile r0 = new iptv.m3u.parser.M3UFile
            r0.<init>()
            iptv.m3u.parser.M3UToolSet$1 r1 = new iptv.m3u.parser.M3UToolSet$1
            r1.<init>(r0)
            iptv.m3u.parser.M3UParser r2 = iptv.m3u.parser.M3UParser.getInstance()
            r2.parse(r3, r1)
            return r0
    }
}
