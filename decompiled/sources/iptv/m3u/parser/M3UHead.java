package iptv.m3u.parser;

/* JADX INFO: loaded from: classes.dex */
public class M3UHead {
    private java.lang.String mDLNAExtras;
    private java.lang.String mName;
    private java.lang.String mPlugin;
    private java.lang.String mType;

    public M3UHead() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getDLNAExtras() {
            r1 = this;
            java.lang.String r0 = r1.mDLNAExtras
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.mName
            return r0
    }

    public java.lang.String getPlugin() {
            r1 = this;
            java.lang.String r0 = r1.mPlugin
            return r0
    }

    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.mType
            return r0
    }

    public void setDLNAExtras(java.lang.String r1) {
            r0 = this;
            r0.mDLNAExtras = r1
            return
    }

    public void setName(java.lang.String r1) {
            r0 = this;
            r0.mName = r1
            return
    }

    public void setPlugin(java.lang.String r1) {
            r0 = this;
            r0.mPlugin = r1
            return
    }

    public void setType(java.lang.String r1) {
            r0 = this;
            r0.mType = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = "[Head]"
            r0.append(r1)
            java.lang.String r1 = r3.mName
            if (r1 == 0) goto L20
            java.lang.String r1 = "\nName: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.mName
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L20:
            java.lang.String r1 = r3.mType
            if (r1 == 0) goto L36
            java.lang.String r1 = "\nType: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.mType
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L36:
            java.lang.String r1 = r3.mDLNAExtras
            if (r1 == 0) goto L4c
            java.lang.String r1 = "\nDLNA Extras: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.mDLNAExtras
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L4c:
            java.lang.String r1 = r3.mPlugin
            if (r1 == 0) goto L62
            java.lang.String r1 = "\nPlugin: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.mPlugin
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L62:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
