package iptv.m3u.parser;

/* JADX INFO: loaded from: classes2.dex */
public class M3UParser {
    private static final java.lang.String ATTR_CHANNEL_ID = "id";
    private static final java.lang.String ATTR_CHANNEL_NAME = "channel_name";
    private static final java.lang.String ATTR_DLNA_EXTRAS = "dlna_extras";
    private static final java.lang.String ATTR_DURATION = "duration";
    private static final java.lang.String ATTR_GROUP_TITLE = "group-title";
    private static final java.lang.String ATTR_LOGO = "logo";
    private static final java.lang.String ATTR_NAME = "name";
    private static final java.lang.String ATTR_PLUGIN = "plugin";
    private static final java.lang.String ATTR_TVG_PREFIX = "tvg-";
    private static final java.lang.String ATTR_TVG_SUFFIX = "-tvg";
    private static final java.lang.String ATTR_TYPE = "type";
    private static final java.lang.String EMPTY_STRING = "";
    private static final java.lang.String INVALID_STREAM_URL = "http://0.0.0.0:1234";
    private static final java.lang.String PREFIX_COMMENT = "#";
    private static final java.lang.String PREFIX_EXTINF = "#EXTINF:";
    private static final java.lang.String PREFIX_EXTM3U = "#EXTM3U";
    private static iptv.m3u.parser.M3UParser mInstance;
    private iptv.m3u.parser.M3UHandler mHandler;
    private iptv.m3u.parser.M3UItem mTempItem;

    /* JADX INFO: renamed from: iptv.m3u.parser.M3UParser$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$iptv$m3u$parser$M3UParser$Status = null;

        static {
                iptv.m3u.parser.M3UParser$Status[] r0 = iptv.m3u.parser.M3UParser.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                iptv.m3u.parser.M3UParser.AnonymousClass1.$SwitchMap$iptv$m3u$parser$M3UParser$Status = r0
                iptv.m3u.parser.M3UParser$Status r1 = iptv.m3u.parser.M3UParser.Status.READY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = iptv.m3u.parser.M3UParser.AnonymousClass1.$SwitchMap$iptv$m3u$parser$M3UParser$Status     // Catch: java.lang.NoSuchFieldError -> L1d
                iptv.m3u.parser.M3UParser$Status r1 = iptv.m3u.parser.M3UParser.Status.READING_KEY     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = iptv.m3u.parser.M3UParser.AnonymousClass1.$SwitchMap$iptv$m3u$parser$M3UParser$Status     // Catch: java.lang.NoSuchFieldError -> L28
                iptv.m3u.parser.M3UParser$Status r1 = iptv.m3u.parser.M3UParser.Status.KEY_READY     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = iptv.m3u.parser.M3UParser.AnonymousClass1.$SwitchMap$iptv$m3u$parser$M3UParser$Status     // Catch: java.lang.NoSuchFieldError -> L33
                iptv.m3u.parser.M3UParser$Status r1 = iptv.m3u.parser.M3UParser.Status.READING_VALUE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final enum Status extends java.lang.Enum<iptv.m3u.parser.M3UParser.Status> {
        private static final /* synthetic */ iptv.m3u.parser.M3UParser.Status[] $VALUES = null;
        public static final iptv.m3u.parser.M3UParser.Status KEY_READY = null;
        public static final iptv.m3u.parser.M3UParser.Status READING_KEY = null;
        public static final iptv.m3u.parser.M3UParser.Status READING_VALUE = null;
        public static final iptv.m3u.parser.M3UParser.Status READY = null;

        static {
                iptv.m3u.parser.M3UParser$Status r0 = new iptv.m3u.parser.M3UParser$Status
                java.lang.String r1 = "READY"
                r2 = 0
                r0.<init>(r1, r2)
                iptv.m3u.parser.M3UParser.Status.READY = r0
                iptv.m3u.parser.M3UParser$Status r1 = new iptv.m3u.parser.M3UParser$Status
                java.lang.String r3 = "READING_KEY"
                r4 = 1
                r1.<init>(r3, r4)
                iptv.m3u.parser.M3UParser.Status.READING_KEY = r1
                iptv.m3u.parser.M3UParser$Status r3 = new iptv.m3u.parser.M3UParser$Status
                java.lang.String r5 = "KEY_READY"
                r6 = 2
                r3.<init>(r5, r6)
                iptv.m3u.parser.M3UParser.Status.KEY_READY = r3
                iptv.m3u.parser.M3UParser$Status r5 = new iptv.m3u.parser.M3UParser$Status
                java.lang.String r7 = "READING_VALUE"
                r8 = 3
                r5.<init>(r7, r8)
                iptv.m3u.parser.M3UParser.Status.READING_VALUE = r5
                r7 = 4
                iptv.m3u.parser.M3UParser$Status[] r7 = new iptv.m3u.parser.M3UParser.Status[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                iptv.m3u.parser.M3UParser.Status.$VALUES = r7
                return
        }

        private Status(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static iptv.m3u.parser.M3UParser.Status valueOf(java.lang.String r1) {
                java.lang.Class<iptv.m3u.parser.M3UParser$Status> r0 = iptv.m3u.parser.M3UParser.Status.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                iptv.m3u.parser.M3UParser$Status r1 = (iptv.m3u.parser.M3UParser.Status) r1
                return r1
        }

        public static iptv.m3u.parser.M3UParser.Status[] values() {
                iptv.m3u.parser.M3UParser$Status[] r0 = iptv.m3u.parser.M3UParser.Status.$VALUES
                java.lang.Object r0 = r0.clone()
                iptv.m3u.parser.M3UParser$Status[] r0 = (iptv.m3u.parser.M3UParser.Status[]) r0
                return r0
        }
    }

    private M3UParser() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mHandler = r0
            r1.mTempItem = r0
            return
    }

    private int convert2int(java.lang.String r1) {
            r0 = this;
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L5
            goto L6
        L5:
            r1 = -1
        L6:
            return r1
    }

    private void flush(iptv.m3u.parser.M3UHandler r2) {
            r1 = this;
            iptv.m3u.parser.M3UItem r0 = r1.mTempItem
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.getStreamURL()
            if (r0 == 0) goto Lf
            iptv.m3u.parser.M3UItem r0 = r1.mTempItem
            r2.onReadEXTINF(r0)
        Lf:
            r2 = 0
            r1.mTempItem = r2
        L12:
            return
    }

    private java.lang.String getAttr(java.util.Map<java.lang.String, java.lang.String> r3, java.lang.String r4) {
            r2 = this;
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L3a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "tvg-"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L3a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = "-tvg"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.Object r3 = r3.get(r4)
            r0 = r3
            java.lang.String r0 = (java.lang.String) r0
        L3a:
            return r0
    }

    public static final iptv.m3u.parser.M3UParser getInstance() {
            iptv.m3u.parser.M3UParser r0 = iptv.m3u.parser.M3UParser.mInstance
            if (r0 != 0) goto Lb
            iptv.m3u.parser.M3UParser r0 = new iptv.m3u.parser.M3UParser
            r0.<init>()
            iptv.m3u.parser.M3UParser.mInstance = r0
        Lb:
            iptv.m3u.parser.M3UParser r0 = iptv.m3u.parser.M3UParser.mInstance
            return r0
    }

    private java.util.Map<java.lang.String, java.lang.String> parseAttributes(java.lang.String r13) {
            r12 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r13 == 0) goto L131
            java.lang.String r1 = ""
            boolean r2 = r13.equals(r1)
            if (r2 == 0) goto L11
            goto L131
        L11:
            iptv.m3u.parser.M3UParser$Status r2 = iptv.m3u.parser.M3UParser.Status.READY
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r4 = 0
            char r4 = r13.charAt(r4)
            r5 = 45
            r6 = 1
            if (r4 == r5) goto L28
            boolean r5 = java.lang.Character.isDigit(r4)
            if (r5 == 0) goto L59
        L28:
            r3.append(r4)
            r4 = 0
        L2c:
            int r4 = r4 + r6
            int r5 = r13.length()
            if (r4 >= r5) goto L41
            char r5 = r13.charAt(r4)
            boolean r7 = java.lang.Character.isDigit(r5)
            if (r7 == 0) goto L41
            r3.append(r5)
            goto L2c
        L41:
            java.lang.String r4 = r3.toString()
            java.lang.String r5 = "duration"
            r12.putAttr(r0, r5, r4)
            java.lang.String r4 = r3.toString()
            java.lang.String r13 = r13.replaceFirst(r4, r1)
            java.lang.String r13 = r12.shrink(r13)
            r12.reset(r3)
        L59:
            r4 = 0
        L5a:
            r5 = 0
            r7 = r1
        L5c:
            int r8 = r13.length()
            if (r4 >= r8) goto L11b
            int r8 = r4 + 1
            char r4 = r13.charAt(r4)
            int[] r9 = iptv.m3u.parser.M3UParser.AnonymousClass1.$SwitchMap$iptv$m3u$parser$M3UParser$Status
            int r10 = r2.ordinal()
            r9 = r9[r10]
            if (r9 == r6) goto Lf9
            r10 = 2
            if (r9 == r10) goto Ld6
            r10 = 3
            r11 = 34
            if (r9 == r10) goto Lc6
            r10 = 4
            if (r9 == r10) goto L7f
            goto L118
        L7f:
            if (r5 == 0) goto La8
        L81:
            if (r4 == r11) goto L94
            int r2 = r13.length()
            if (r8 >= r2) goto L94
            r3.append(r4)
            int r2 = r8 + 1
            char r4 = r13.charAt(r8)
            r8 = r2
            goto L81
        L94:
            int r2 = r3.length()
            if (r2 <= 0) goto La4
            java.lang.String r2 = r3.toString()
            r12.putAttr(r0, r7, r2)
            r12.reset(r3)
        La4:
            iptv.m3u.parser.M3UParser$Status r2 = iptv.m3u.parser.M3UParser.Status.READY
            r4 = r8
            goto L5a
        La8:
            boolean r9 = java.lang.Character.isWhitespace(r4)
            if (r9 == 0) goto Lc2
            int r2 = r3.length()
            if (r2 <= 0) goto Lbe
            java.lang.String r2 = r3.toString()
            r12.putAttr(r0, r7, r2)
            r12.reset(r3)
        Lbe:
            iptv.m3u.parser.M3UParser$Status r2 = iptv.m3u.parser.M3UParser.Status.READY
            r7 = r1
            goto L118
        Lc2:
            r3.append(r4)
            goto L118
        Lc6:
            boolean r9 = java.lang.Character.isWhitespace(r4)
            if (r9 != 0) goto L118
            if (r4 != r11) goto Ld0
            r5 = 1
            goto Ld3
        Ld0:
            r3.append(r4)
        Ld3:
            iptv.m3u.parser.M3UParser$Status r2 = iptv.m3u.parser.M3UParser.Status.READING_VALUE
            goto L118
        Ld6:
            r9 = 61
            if (r4 != r9) goto Lf5
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r7)
            java.lang.String r4 = r3.toString()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r12.shrink(r2)
            r12.reset(r3)
            iptv.m3u.parser.M3UParser$Status r4 = iptv.m3u.parser.M3UParser.Status.KEY_READY
            r7 = r2
            r2 = r4
            goto L118
        Lf5:
            r3.append(r4)
            goto L118
        Lf9:
            boolean r9 = java.lang.Character.isWhitespace(r4)
            if (r9 == 0) goto L100
            goto L118
        L100:
            r9 = 44
            if (r4 != r9) goto L113
            java.lang.String r4 = r13.substring(r8)
            java.lang.String r8 = "channel_name"
            r12.putAttr(r0, r8, r4)
            int r4 = r13.length()
            goto L5c
        L113:
            r3.append(r4)
            iptv.m3u.parser.M3UParser$Status r2 = iptv.m3u.parser.M3UParser.Status.READING_KEY
        L118:
            r4 = r8
            goto L5c
        L11b:
            boolean r13 = r7.equals(r1)
            if (r13 != 0) goto L131
            int r13 = r3.length()
            if (r13 <= 0) goto L131
            java.lang.String r13 = r3.toString()
            r12.putAttr(r0, r7, r13)
            r12.reset(r3)
        L131:
            return r0
    }

    private iptv.m3u.parser.M3UHead parseHead(java.lang.String r3) {
            r2 = this;
            java.util.Map r3 = r2.parseAttributes(r3)
            iptv.m3u.parser.M3UHead r0 = new iptv.m3u.parser.M3UHead
            r0.<init>()
            java.lang.String r1 = "name"
            java.lang.String r1 = r2.getAttr(r3, r1)
            r0.setName(r1)
            java.lang.String r1 = "type"
            java.lang.String r1 = r2.getAttr(r3, r1)
            r0.setType(r1)
            java.lang.String r1 = "dlna_extras"
            java.lang.String r1 = r2.getAttr(r3, r1)
            r0.setDLNAExtras(r1)
            java.lang.String r1 = "plugin"
            java.lang.String r3 = r2.getAttr(r3, r1)
            r0.setPlugin(r3)
            return r0
    }

    private iptv.m3u.parser.M3UItem parseItem(java.lang.String r3) {
            r2 = this;
            java.util.Map r3 = r2.parseAttributes(r3)
            iptv.m3u.parser.M3UItem r0 = new iptv.m3u.parser.M3UItem
            r0.<init>()
            java.lang.String r1 = "id"
            java.lang.String r1 = r2.getAttr(r3, r1)
            r0.setChannelID(r1)
            java.lang.String r1 = "channel_name"
            java.lang.String r1 = r2.getAttr(r3, r1)
            r0.setChannelName(r1)
            java.lang.String r1 = "duration"
            java.lang.String r1 = r2.getAttr(r3, r1)
            int r1 = r2.convert2int(r1)
            r0.setDuration(r1)
            java.lang.String r1 = "logo"
            java.lang.String r1 = r2.getAttr(r3, r1)
            r0.setLogoURL(r1)
            java.lang.String r1 = "group-title"
            java.lang.String r1 = r2.getAttr(r3, r1)
            r0.setGroupTitle(r1)
            java.lang.String r1 = "type"
            java.lang.String r1 = r2.getAttr(r3, r1)
            r0.setType(r1)
            java.lang.String r1 = "dlna_extras"
            java.lang.String r1 = r2.getAttr(r3, r1)
            r0.setDLNAExtras(r1)
            java.lang.String r1 = "plugin"
            java.lang.String r3 = r2.getAttr(r3, r1)
            r0.setPlugin(r3)
            return r0
    }

    private void putAttr(java.util.Map<java.lang.String, java.lang.String> r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r1.put(r2, r3)
            return
    }

    private void reset(java.lang.StringBuffer r3) {
            r2 = this;
            int r0 = r3.length()
            r1 = 0
            r3.delete(r1, r0)
            return
    }

    private java.lang.String shrink(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            goto L8
        L4:
            java.lang.String r1 = r1.trim()
        L8:
            return r1
    }

    private void updateURL(java.lang.String r2) {
            r1 = this;
            iptv.m3u.parser.M3UItem r0 = r1.mTempItem
            if (r0 == 0) goto L15
            java.lang.String r0 = "http://0.0.0.0:1234"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L15
            iptv.m3u.parser.M3UItem r0 = r1.mTempItem
            java.lang.String r2 = r2.trim()
            r0.setStreamURL(r2)
        L15:
            return
    }

    public void parse(java.lang.String r2) {
            r1 = this;
            iptv.m3u.parser.M3UHandler r0 = r1.mHandler
            r1.parse(r2, r0)
            return
    }

    public void parse(java.lang.String r6, iptv.m3u.parser.M3UHandler r7) {
            r5 = this;
            java.lang.String r0 = "#EXTINF:"
            java.lang.String r1 = "#EXTM3U"
            if (r7 != 0) goto L7
            return
        L7:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            r4.<init>(r6)     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            r3.<init>(r4, r6)     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            r2.<init>(r3)     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
        L18:
            java.lang.String r6 = r2.readLine()     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            java.lang.String r6 = r5.shrink(r6)     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            if (r6 == 0) goto L66
            boolean r3 = r6.startsWith(r1)     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            java.lang.String r4 = ""
            if (r3 == 0) goto L3a
            java.lang.String r6 = r6.replaceFirst(r1, r4)     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            java.lang.String r6 = r5.shrink(r6)     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            iptv.m3u.parser.M3UHead r6 = r5.parseHead(r6)     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            r7.onReadEXTM3U(r6)     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            goto L18
        L3a:
            boolean r3 = r6.startsWith(r0)     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            if (r3 == 0) goto L52
            r5.flush(r7)     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            java.lang.String r6 = r6.replaceFirst(r0, r4)     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            java.lang.String r6 = r5.shrink(r6)     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            iptv.m3u.parser.M3UItem r6 = r5.parseItem(r6)     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            r5.mTempItem = r6     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            goto L18
        L52:
            java.lang.String r3 = "#"
            boolean r3 = r6.startsWith(r3)     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            if (r3 == 0) goto L5b
            goto L18
        L5b:
            boolean r3 = r6.equals(r4)     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            if (r3 == 0) goto L62
            goto L18
        L62:
            r5.updateURL(r6)     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            goto L18
        L66:
            r5.flush(r7)     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            r2.close()     // Catch: java.io.IOException -> L6d java.io.FileNotFoundException -> L72
            goto L76
        L6d:
            r6 = move-exception
            r6.printStackTrace()
            goto L76
        L72:
            r6 = move-exception
            r6.printStackTrace()
        L76:
            return
    }

    public void setHandler(iptv.m3u.parser.M3UHandler r1) {
            r0 = this;
            r0.mHandler = r1
            return
    }
}
