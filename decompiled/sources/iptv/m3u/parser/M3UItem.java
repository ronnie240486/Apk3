package iptv.m3u.parser;

/* JADX INFO: loaded from: classes3.dex */
public class M3UItem {
    private java.lang.String mChannelId;
    private java.lang.String mChannelName;
    private java.lang.String mDLNAExtras;
    private int mDuration;
    private java.lang.String mGroupTitle;
    private java.lang.String mLogoURL;
    private java.lang.String mPlugin;
    private java.lang.String mStreamURL;
    private java.lang.String mType;

    public M3UItem() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getChannelId() {
            r1 = this;
            java.lang.String r0 = r1.mChannelId
            return r0
    }

    public java.lang.String getChannelName() {
            r1 = this;
            java.lang.String r0 = r1.mChannelName
            return r0
    }

    public java.lang.String getDLNAExtras() {
            r1 = this;
            java.lang.String r0 = r1.mDLNAExtras
            return r0
    }

    public int getDuration() {
            r1 = this;
            int r0 = r1.mDuration
            return r0
    }

    public java.lang.String getGroupTitle() {
            r1 = this;
            java.lang.String r0 = r1.mGroupTitle
            if (r0 != 0) goto L6
            java.lang.String r0 = ""
        L6:
            return r0
    }

    public java.lang.String getLogoURL() {
            r1 = this;
            java.lang.String r0 = r1.mLogoURL
            return r0
    }

    public java.lang.String getPlugin() {
            r1 = this;
            java.lang.String r0 = r1.mPlugin
            return r0
    }

    public java.lang.String getStreamURL() {
            r1 = this;
            java.lang.String r0 = r1.mStreamURL
            return r0
    }

    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.mType
            return r0
    }

    public void setChannelID(java.lang.String r1) {
            r0 = this;
            r0.mChannelId = r1
            return
    }

    public void setChannelName(java.lang.String r1) {
            r0 = this;
            r0.mChannelName = r1
            return
    }

    public void setDLNAExtras(java.lang.String r1) {
            r0 = this;
            r0.mDLNAExtras = r1
            return
    }

    public void setDuration(int r1) {
            r0 = this;
            r0.mDuration = r1
            return
    }

    public void setGroupTitle(java.lang.String r1) {
            r0 = this;
            r0.mGroupTitle = r1
            return
    }

    public void setLogoURL(java.lang.String r1) {
            r0 = this;
            r0.mLogoURL = r1
            return
    }

    public void setPlugin(java.lang.String r1) {
            r0 = this;
            r0.mPlugin = r1
            return
    }

    public void setStreamURL(java.lang.String r1) {
            r0 = this;
            r0.mStreamURL = r1
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
            java.lang.String r1 = "[Item]"
            r0.append(r1)
            java.lang.String r1 = r3.mChannelId
            if (r1 == 0) goto L20
            java.lang.String r1 = "\n Channel Id: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.mChannelId
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L20:
            java.lang.String r1 = r3.mChannelName
            if (r1 == 0) goto L36
            java.lang.String r1 = "\nChannel Name: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.mChannelName
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L36:
            java.lang.String r1 = "\nDuration: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            int r2 = r3.mDuration
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = r3.mStreamURL
            if (r1 == 0) goto L5e
            java.lang.String r1 = "\nStream URL: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.mStreamURL
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L5e:
            java.lang.String r1 = r3.mGroupTitle
            if (r1 == 0) goto L74
            java.lang.String r1 = "\nGroup: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.mGroupTitle
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L74:
            java.lang.String r1 = r3.mLogoURL
            if (r1 == 0) goto L8a
            java.lang.String r1 = "\nLogo: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.mLogoURL
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L8a:
            java.lang.String r1 = r3.mType
            if (r1 == 0) goto La0
            java.lang.String r1 = "\nType: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.mType
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        La0:
            java.lang.String r1 = r3.mDLNAExtras
            if (r1 == 0) goto Lb6
            java.lang.String r1 = "\nDLNA Extras: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.mDLNAExtras
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        Lb6:
            java.lang.String r1 = r3.mPlugin
            if (r1 == 0) goto Lcc
            java.lang.String r1 = "\nPlugin: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.mPlugin
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        Lcc:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
